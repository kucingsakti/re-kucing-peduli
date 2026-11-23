#!/usr/bin/env bash
# Build KucingUnlock.apk (Vector/Xposed module) tanpa Android Studio.
set -e
cd "$(dirname "$0")"
TC=~/Projects/re/_toolchain
ANDROID_JAR="$TC/android.jar"
R8="$TC/r8.jar"
ECJ="$TC/ecj.jar"
# android.jar sebagai bootclasspath -> java.* & android.* dari satu sumber (hindari split-module)
JAVAC="java -jar $ECJ -source 8 -target 8 -nowarn -proc:none -bootclasspath $ANDROID_JAR"
export PATH="$HOME/.local/bin:$PATH"

rm -rf build; mkdir -p build/stub-classes build/app-classes build/dex

echo "[1] compile stub Xposed (ecj)"
$JAVAC -d build/stub-classes src/stub

echo "[2] compile Hook (ecj)"
$JAVAC -cp "build/stub-classes" -d build/app-classes src/app

echo "[3] dex (D8, hanya kelas modul; stub = classpath, tidak ikut)"
java -cp "$R8" com.android.tools.r8.D8 \
  --min-api 23 --release \
  --lib "$ANDROID_JAR" \
  --classpath build/stub-classes \
  --output build/dex \
  $(find build/app-classes -name '*.class')

echo "[4] package APK (aapt: manifest + assets + dex)"
aapt package -f -M AndroidManifest.xml -I "$ANDROID_JAR" -A assets -F build/unsigned.apk
( cd build/dex && aapt add ../unsigned.apk classes.dex >/dev/null )

echo "[5] align"
zipalign -p -f 4 build/unsigned.apk build/aligned.apk

echo "[6] keystore + sign"
KS="$TC/debug.keystore"
if [ ! -f "$KS" ]; then
  keytool -genkeypair -keystore "$KS" -storepass android -keypass android \
    -alias re -keyalg RSA -keysize 2048 -validity 10000 \
    -dname "CN=RE, OU=RE, O=RE, L=RE, S=RE, C=ID" >/dev/null 2>&1
fi
apksigner sign --ks "$KS" --ks-pass pass:android --key-pass pass:android \
  --out KucingUnlock.apk build/aligned.apk

echo "[7] verify"
apksigner verify --print-certs KucingUnlock.apk | head -2
ls -lh KucingUnlock.apk
echo "DONE -> $(pwd)/KucingUnlock.apk"
