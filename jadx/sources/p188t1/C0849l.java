package p188t1;

import android.util.Base64;
import com.kcstream.cing.MainApp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import p086i8.C;

/* JADX INFO: renamed from: t1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0849l {
    public final String a;

    static {
        C.a(C.c("1463B8DA0FE6"));
        C.a(C.c("1461B6"));
        C.a(C.c("05748CFD24C7D0F18C402D0D905C7707C29B88ED7CDE171870F287153BE2205A106EA29E27B68A9FB0601C55"));
    }

    public C0849l(MainApp mainApp) {
        String strA;
        try {
            strA = a(mainApp);
        } catch (Exception unused) {
            strA = null;
        }
        this.a = strA;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String a(MainApp mainApp) {
        File file = new File(mainApp.getFilesDir(), C.a(C.c("1461B6")));
        if (!file.exists() || file.delete()) {
            try {
                InputStream inputStreamOpen = mainApp.getAssets().open(C.a(C.c("1463B8DA0FE6")));
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(C.a(C.c("334A958458B093")));
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i10 = inputStreamOpen.read(bArr);
                            if (i10 <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i10);
                            messageDigest.update(bArr, 0, i10);
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                            throw th;
                        }
                        if (!C.a(C.c("05748CFD24C7D0F18C402D0D905C7707C29B88ED7CDE171870F287153BE2205A106EA29E27B68A9FB0601C55")).equals(Base64.encodeToString(messageDigest.digest(), 2))) {
                            fileOutputStream.close();
                            inputStreamOpen.close();
                            return null;
                        }
                        fileOutputStream.flush();
                        String absolutePath = file.getAbsolutePath();
                        fileOutputStream.close();
                        inputStreamOpen.close();
                        return absolutePath;
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    throw th4;
                }
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                throw th4;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
