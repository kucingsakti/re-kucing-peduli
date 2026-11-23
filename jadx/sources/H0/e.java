package H0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final p053f4.e a = new p053f4.e(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f1833b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f1834c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f1835d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f1836e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f1837f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f1838g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f1839h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f1840i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.f1830g * 2) + 7) & (-8)) / 8) + (cVar.f1828e * 2) + d(bArr, cVar.a, cVar.f1825b).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f1829f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f1837f)) {
            int length2 = cVarArr.length;
            while (i10 < length2) {
                c cVar2 = cVarArr[i10];
                q(byteArrayOutputStream, cVar2, d(bArr, cVar2.a, cVar2.f1825b));
                p(byteArrayOutputStream, cVar2);
                i10++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(bArr, cVar3.a, cVar3.f1825b));
            }
            int length3 = cVarArr.length;
            while (i10 < length3) {
                p(byteArrayOutputStream, cVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z6 = true;
        for (File file2 : fileArrListFiles) {
            z6 = c(file2) && z6;
        }
        return z6;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f1839h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1838g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return E0.a.l(p239z.e.c(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new IllegalStateException(AbstractC0487g.g(i10, "Not enough bytes to read: "));
            }
            i11 += i12;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int iM = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i11] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = fileInputStream.read(bArr2);
                if (i13 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            }
            if (i12 == i10) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = f1840i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                c[] cVarArrK = k(byteArrayInputStream, bArr2, iM, cVarArr);
                byteArrayInputStream.close();
                return cVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f1835d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            c[] cVarArrJ = j(byteArrayInputStream2, iM2, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i10, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i11] = (int) m(byteArrayInputStream, 2);
            strArr[i11] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            if (!cVar.f1825b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            cVar.f1828e = i13;
            cVar.f1831h = g(byteArrayInputStream, i13);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i12 = 0; i12 < cVarArr.length; i12++) {
                    if (cVarArr[i12].f1825b.equals(strSubstring)) {
                        cVar = cVarArr[i12];
                        break;
                    }
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f1827d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f1839h)) {
                cVar.f1828e = iM;
                cVar.f1831h = iArrG;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f1836e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            c[] cVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return cVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i10) throws IOException {
        byte[] bArrF = f(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (bArrF[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            cVarArr[i11] = new c(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            int iAvailable = byteArrayInputStream.available() - cVar.f1829f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = cVar.f1832i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f1831h = g(byteArrayInputStream, cVar.f1828e);
            int i13 = cVar.f1830g;
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i13 * 2) + 7) & (-8)) / 8));
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = bitSetValueOf.get(i14) ? 2 : 0;
                if (bitSetValueOf.get(i14 + i13)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) throws IOException {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f1835d;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f1836e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(cVarArr, bArr3);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f1838g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f1832i.size() * 4;
                    String strD = d(bArr4, cVar.a, cVar.f1825b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, cVar.f1831h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, cVar.f1826c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = cVar.f1832i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i11 : cVar.f1831h) {
                        v(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = f1837f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(cVarArr, bArr5);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f1839h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String strD2 = d(bArr6, cVar2.a, cVar2.f1825b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = cVar2.f1832i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar2.f1831h.length);
                u(byteArrayOutputStream, cVar2.f1826c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i12 : cVar2.f1831h) {
                    v(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, cVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (c cVar3 : cVarArr) {
                u(byteArrayOutputStream2, cVar3.f1826c, 4);
                u(byteArrayOutputStream2, cVar3.f1827d, 4);
                u(byteArrayOutputStream2, cVar3.f1830g, 4);
                String strD3 = d(bArr2, cVar3.a, cVar3.f1825b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            k kVar = new k(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(kVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i15];
                    v(byteArrayOutputStream3, i15);
                    v(byteArrayOutputStream3, cVar4.f1828e);
                    i16 = i16 + 4 + (cVar4.f1828e * i13);
                    int[] iArr = cVar4.f1831h;
                    int length3 = iArr.length;
                    int i17 = i10;
                    int i18 = i13;
                    int i19 = i17;
                    while (i19 < length3) {
                        int i20 = iArr[i19];
                        v(byteArrayOutputStream3, i20 - i17);
                        i19++;
                        i17 = i20;
                    }
                    i15++;
                    i13 = i18;
                    i10 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            k kVar2 = new k(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i21 = 0;
            int i22 = 0;
            while (i21 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i21];
                    Iterator it3 = cVar5.f1832i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream5, iIntValue, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream6, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v(byteArrayOutputStream4, i21);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i23 = i22 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream4, length4, 4);
                            v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i22 = i23 + length4;
                            i21++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i22 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i22 + ", does not match actual size " + byteArray5.length);
            }
            k kVar3 = new k(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(kVar3);
            long j11 = 4;
            long size2 = j11 + j11 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                k kVar4 = (k) arrayList2.get(i24);
                int i25 = kVar4.a;
                if (i25 == 1) {
                    j10 = 0;
                } else if (i25 == 2) {
                    j10 = 1;
                } else if (i25 == 3) {
                    j10 = 2;
                } else if (i25 == 4) {
                    j10 = 3;
                } else {
                    if (i25 != 5) {
                        throw null;
                    }
                    j10 = 4;
                }
                u(byteArrayOutputStream, j10, 4);
                u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = kVar4.f1849b;
                if (kVar4.f1850c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        s(byteArrayOutputStream, cVar);
        int[] iArr = cVar.f1831h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            v(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        int i13 = cVar.f1830g;
        byte[] bArr = new byte[(((i13 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f1832i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i14 = iIntValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i15 = iIntValue + i13;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.f1828e);
        u(byteArrayOutputStream, cVar.f1829f, 4);
        u(byteArrayOutputStream, cVar.f1826c, 4);
        u(byteArrayOutputStream, cVar.f1830g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i10, c cVar) throws IOException {
        int iBitCount = Integer.bitCount(i10 & (-2));
        int i11 = cVar.f1830g;
        byte[] bArr = new byte[(((iBitCount * i11) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f1832i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (i12 * i11) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int i10 = 0;
        for (Map.Entry entry : cVar.f1832i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i10);
                v(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x016e A[Catch: all -> 0x016b, TRY_ENTER, TryCatch #5 {all -> 0x016b, blocks: (B:97:0x0149, B:99:0x0155, B:110:0x016e, B:111:0x0173), top: B:267:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x017f A[Catch: IllegalStateException -> 0x0164, IOException -> 0x0166, FileNotFoundException -> 0x0169, TRY_LEAVE, TryCatch #33 {FileNotFoundException -> 0x0169, IOException -> 0x0166, IllegalStateException -> 0x0164, blocks: (B:95:0x0141, B:100:0x015f, B:118:0x017f, B:116:0x017c, B:115:0x0179), top: B:303:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0195  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b8 A[Catch: all -> 0x01c7, TRY_LEAVE, TryCatch #24 {all -> 0x01c7, blocks: (B:134:0x01ac, B:136:0x01b8, B:145:0x01ca), top: B:285:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ca A[Catch: all -> 0x01c7, TRY_ENTER, TRY_LEAVE, TryCatch #24 {all -> 0x01c7, blocks: (B:134:0x01ac, B:136:0x01b8, B:145:0x01ca), top: B:285:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:156:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:170:0x0215 A[Catch: all -> 0x0254, TryCatch #33 {all -> 0x0254, blocks: (B:168:0x020f, B:170:0x0215, B:171:0x0219, B:173:0x021f), top: B:291:0x020f }] */
    /* JADX WARN: Code duplicated, block: B:173:0x021f A[Catch: all -> 0x0254, TRY_LEAVE, TryCatch #33 {all -> 0x0254, blocks: (B:168:0x020f, B:170:0x0215, B:171:0x0219, B:173:0x021f), top: B:291:0x020f }] */
    /* JADX WARN: Code duplicated, block: B:239:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:243:0x02af  */
    /* JADX WARN: Code duplicated, block: B:250:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:267:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x020f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0224 A[EDGE_INSN: B:304:0x0224->B:175:0x0224 BREAK  A[LOOP:0: B:171:0x0219->B:305:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9 A[Catch: all -> 0x00fe, IllegalStateException -> 0x0100, IOException -> 0x0102, TRY_LEAVE, TryCatch #35 {IOException -> 0x0102, IllegalStateException -> 0x0100, blocks: (B:53:0x00df, B:55:0x00e9, B:67:0x0104, B:68:0x0109), top: B:302:0x00df, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0104 A[Catch: all -> 0x00fe, IllegalStateException -> 0x0100, IOException -> 0x0102, TRY_ENTER, TryCatch #35 {IOException -> 0x0102, IllegalStateException -> 0x0100, blocks: (B:53:0x00df, B:55:0x00e9, B:67:0x0104, B:68:0x0109), top: B:302:0x00df, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0155 A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #5 {all -> 0x016b, blocks: (B:97:0x0149, B:99:0x0155, B:110:0x016e, B:111:0x0173), top: B:267:0x0149 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void t(Context context, Executor executor, d dVar, boolean z6) {
        char c10;
        byte[] bArr;
        FileInputStream fileInputStreamA;
        c[] cVarArrL;
        c[] cVarArr;
        d dVar2;
        c[] cVarArr2;
        byte[] bArr2;
        boolean z10;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i10;
        boolean z11;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i11;
        b bVar;
        FileInputStream fileInputStreamA2;
        boolean z12;
        boolean z13;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z6) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j10 = dataInputStream.readLong();
                            dataInputStream.close();
                            z13 = j10 == packageInfo.lastUpdateTime;
                            if (z13) {
                                dVar.d(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z13 = false;
                    }
                } else {
                    z13 = false;
                }
                if (z13) {
                    context.getPackageName();
                    j.c(context, false);
                    return;
                }
            }
            context.getPackageName();
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, dVar, name, file2);
            byte[] bArr5 = bVar2.f1819c;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            bVar2.f1822f = true;
                            bArr = f1833b;
                            fileInputStreamA = bVar2.a(assets, "dexopt/baseline.prof");
                            c10 = '\b';
                            if (fileInputStreamA != null) {
                                if (Arrays.equals(bArr, f(fileInputStreamA, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                cVarArrL = l(fileInputStreamA, f(fileInputStreamA, 4), bVar2.f1821e);
                                fileInputStreamA.close();
                                bVar2.f1823g = cVarArrL;
                            }
                            cVarArr = bVar2.f1823g;
                            if (cVarArr != null) {
                                fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA2 == null) {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    bVar = null;
                                } else {
                                    if (Arrays.equals(f1834c, f(fileInputStreamA2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.f1823g = i(fileInputStreamA2, f(fileInputStreamA2, 4), bArr5, cVarArr);
                                    fileInputStreamA2.close();
                                    bVar = bVar2;
                                }
                                if (bVar != null) {
                                    bVar2 = bVar;
                                }
                            }
                            dVar2 = bVar2.f1818b;
                            cVarArr2 = bVar2.f1823g;
                            if (cVarArr2 != null) {
                                if (bVar2.f1822f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr4);
                                if (o(byteArrayOutputStream, bArr4, cVarArr2)) {
                                    bVar2.f1824h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    bVar2.f1823g = null;
                                } else {
                                    dVar2.d(5, null);
                                    bVar2.f1823g = null;
                                    byteArrayOutputStream.close();
                                }
                            }
                            bArr2 = bVar2.f1824h;
                            if (bArr2 != null) {
                                if (bVar2.f1822f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream(bVar2.f1820d);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i10 = byteArrayInputStream.read(bArr3);
                                            if (i10 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i10);
                                        }
                                        c10 = 1;
                                        bVar2.b(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        bVar2.f1824h = null;
                                        bVar2.f1823g = null;
                                        z10 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z10 = false;
                            c10 = 1;
                            if (z10) {
                                e(packageInfo, filesDir);
                            }
                            z11 = z10;
                        } else {
                            bVar2.b(4, null);
                        }
                    } catch (IOException unused2) {
                        c10 = 1;
                        bVar2.b(4, null);
                    }
                } else if (file2.canWrite()) {
                    bVar2.f1822f = true;
                    bArr = f1833b;
                    try {
                        fileInputStreamA = bVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e10) {
                        dVar.d(6, e10);
                        fileInputStreamA = null;
                    } catch (IOException e11) {
                        dVar.d(7, e11);
                        fileInputStreamA = null;
                    }
                    c10 = '\b';
                    try {
                        try {
                            if (fileInputStreamA != null) {
                                try {
                                    if (Arrays.equals(bArr, f(fileInputStreamA, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    cVarArrL = l(fileInputStreamA, f(fileInputStreamA, 4), bVar2.f1821e);
                                    try {
                                        fileInputStreamA.close();
                                    } catch (IOException e12) {
                                        dVar.d(7, e12);
                                    }
                                    bVar2.f1823g = cVarArrL;
                                } catch (IOException e13) {
                                    dVar.d(7, e13);
                                    fileInputStreamA.close();
                                    cVarArrL = null;
                                } catch (IllegalStateException e14) {
                                    dVar.d(8, e14);
                                    fileInputStreamA.close();
                                    cVarArrL = null;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                fileInputStreamA.close();
                                throw th5;
                            } catch (IOException e15) {
                                dVar.d(7, e15);
                                throw th5;
                            }
                        }
                    } catch (IOException e16) {
                        dVar.d(7, e16);
                    }
                    cVarArr = bVar2.f1823g;
                    if (cVarArr != null && (i11 = Build.VERSION.SDK_INT) >= 24 && (i11 >= 31 || i11 == 24 || i11 == 25)) {
                        try {
                            fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                            if (fileInputStreamA2 == null) {
                                try {
                                    if (Arrays.equals(f1834c, f(fileInputStreamA2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.f1823g = i(fileInputStreamA2, f(fileInputStreamA2, 4), bArr5, cVarArr);
                                    fileInputStreamA2.close();
                                    bVar = bVar2;
                                } catch (Throwable th6) {
                                    try {
                                        fileInputStreamA2.close();
                                        throw th6;
                                    } catch (Throwable th7) {
                                        th6.addSuppressed(th7);
                                        throw th6;
                                    }
                                }
                            } else {
                                if (fileInputStreamA2 != null) {
                                    fileInputStreamA2.close();
                                }
                                bVar = null;
                            }
                        } catch (FileNotFoundException e17) {
                            dVar.d(9, e17);
                        } catch (IOException e18) {
                            dVar.d(7, e18);
                        } catch (IllegalStateException e19) {
                            bVar2.f1823g = null;
                            dVar.d(8, e19);
                        }
                        if (bVar != null) {
                            bVar2 = bVar;
                        }
                    }
                    dVar2 = bVar2.f1818b;
                    cVarArr2 = bVar2.f1823g;
                    if (cVarArr2 != null && (bArr4 = bVar2.f1819c) != null) {
                        if (bVar2.f1822f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr4);
                                if (o(byteArrayOutputStream, bArr4, cVarArr2)) {
                                    dVar2.d(5, null);
                                    bVar2.f1823g = null;
                                    byteArrayOutputStream.close();
                                } else {
                                    bVar2.f1824h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    bVar2.f1823g = null;
                                }
                            } catch (Throwable th8) {
                                try {
                                    byteArrayOutputStream.close();
                                    throw th8;
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                    throw th8;
                                }
                            }
                        } catch (IOException e20) {
                            dVar2.d(7, e20);
                        } catch (IllegalStateException e21) {
                            dVar2.d(8, e21);
                        }
                    }
                    bArr2 = bVar2.f1824h;
                    if (bArr2 != null) {
                        z10 = false;
                        c10 = 1;
                    } else {
                        try {
                            if (bVar2.f1822f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        try {
                                            fileOutputStream = new FileOutputStream(bVar2.f1820d);
                                            try {
                                                try {
                                                    channel = fileOutputStream.getChannel();
                                                    try {
                                                        fileLockTryLock = channel.tryLock();
                                                        try {
                                                            try {
                                                                if (fileLockTryLock != null) {
                                                                    try {
                                                                        if (fileLockTryLock.isValid()) {
                                                                            bArr3 = new byte[512];
                                                                            while (true) {
                                                                                i10 = byteArrayInputStream.read(bArr3);
                                                                                if (i10 > 0) {
                                                                                    break;
                                                                                } else {
                                                                                    fileOutputStream.write(bArr3, 0, i10);
                                                                                }
                                                                            }
                                                                            c10 = 1;
                                                                            bVar2.b(1, null);
                                                                            fileLockTryLock.close();
                                                                            channel.close();
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            bVar2.f1824h = null;
                                                                            bVar2.f1823g = null;
                                                                            z10 = true;
                                                                        }
                                                                    } catch (Throwable th10) {
                                                                        th = th10;
                                                                        Throwable th11 = th;
                                                                        if (fileLockTryLock == null) {
                                                                            throw th11;
                                                                        }
                                                                        try {
                                                                            fileLockTryLock.close();
                                                                            throw th11;
                                                                        } catch (Throwable th12) {
                                                                            th11.addSuppressed(th12);
                                                                            throw th11;
                                                                        }
                                                                    }
                                                                }
                                                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                Throwable th14 = th;
                                                                if (channel == null) {
                                                                    throw th14;
                                                                }
                                                                try {
                                                                    channel.close();
                                                                    throw th14;
                                                                } catch (Throwable th15) {
                                                                    th14.addSuppressed(th15);
                                                                    throw th14;
                                                                }
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                    }
                                                } catch (Throwable th18) {
                                                    th = th18;
                                                    th2 = th;
                                                    try {
                                                        fileOutputStream.close();
                                                        throw th2;
                                                    } catch (Throwable th19) {
                                                        th2.addSuppressed(th19);
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th2 = th;
                                                fileOutputStream.close();
                                                throw th2;
                                            }
                                        } catch (Throwable th21) {
                                            th = th21;
                                            th = th;
                                            try {
                                                byteArrayInputStream.close();
                                                throw th;
                                            } catch (Throwable th22) {
                                                th.addSuppressed(th22);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th23) {
                                        th = th23;
                                        th = th;
                                        byteArrayInputStream.close();
                                        throw th;
                                    }
                                } catch (FileNotFoundException e22) {
                                    e = e22;
                                    c10 = 1;
                                    bVar2.b(6, e);
                                    bVar2.f1824h = null;
                                    bVar2.f1823g = null;
                                    z10 = false;
                                } catch (IOException e23) {
                                    e = e23;
                                    c10 = 1;
                                    bVar2.b(7, e);
                                    bVar2.f1824h = null;
                                    bVar2.f1823g = null;
                                    z10 = false;
                                }
                            } catch (FileNotFoundException e24) {
                                e = e24;
                                bVar2.b(6, e);
                                bVar2.f1824h = null;
                                bVar2.f1823g = null;
                                z10 = false;
                            } catch (IOException e25) {
                                e = e25;
                                bVar2.b(7, e);
                                bVar2.f1824h = null;
                                bVar2.f1823g = null;
                                z10 = false;
                            }
                        } catch (Throwable th24) {
                            bVar2.f1824h = null;
                            bVar2.f1823g = null;
                            throw th24;
                        }
                    }
                    if (z10) {
                        e(packageInfo, filesDir);
                    }
                    z11 = z10;
                } else {
                    bVar2.b(4, null);
                }
                if (z11 || !z6) {
                    z12 = 0;
                } else {
                    z12 = c10;
                }
                j.c(context, z12);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            c10 = 1;
            z11 = false;
            if (z11) {
                z12 = 0;
            } else {
                z12 = 0;
            }
            j.c(context, z12);
        } catch (PackageManager.NameNotFoundException e26) {
            dVar.d(7, e26);
            j.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i10) throws IOException {
        u(byteArrayOutputStream, i10, 2);
    }
}
