package p188t1;

import E1.l;
import Y1.c;
import android.app.KeyguardManager;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.kcstream.cing.MainApp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import p086i8.C;
import p102k7.e;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public final c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1.e f15085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15091i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f15092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f15093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15094m;

    static {
        C.a(C.c("0570A6C618"));
    }

    public t0(MainApp mainApp) {
        String strA;
        if ((Build.VERSION.SDK_INT < 28 || mainApp.checkSelfPermission(C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D560F30D3F73CD88110BD7107F"))) != 0) && mainApp.checkSelfPermission(C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D560F30D3B73CC82110DD50B752E56"))) != 0) {
            this.a = null;
        } else {
            this.a = new c(new l((ContextWrapper) mainApp));
        }
        KeyguardManager keyguardManager = (KeyguardManager) mainApp.getSystemService(KeyguardManager.class);
        this.f15084b = keyguardManager != null ? new e(keyguardManager) : null;
        this.f15085c = new o1.e(mainApp);
        boolean z6 = false;
        this.f15086d = Settings.Global.getInt(mainApp.getContentResolver(), C.a(C.c("0166B6F60FEBC4A58A720B")), 0) == 1;
        this.f15087e = GoogleApiAvailability.f7832d.b(mainApp, GoogleApiAvailabilityLight.a) == 0;
        try {
            if (mainApp.getPackageManager().getPackageInfo(C.a(C.c("036DB98702F0C4B0837E41008C4470")), 128) != null) {
                z6 = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.f15088f = z6;
        this.f15089g = Build.VERSION.SECURITY_PATCH;
        this.f15090h = a(C.a(C.c("0767A0D918EAD5E79478410A8E4478308DDAABEC5AD82705")));
        this.f15091i = a(C.a(C.c("0767A0CC04E3CAB58572")));
        this.j = a(C.a(C.c("0767A0D918EAD5E79478410A9442607AD0CCA2E95DC32A")));
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(C.a(C.c("4F71ADDA45E3D6E89572030195586C7BC6C7A8EF41D537")))));
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    strA = C.a(C.c("0E6DBACC"));
                    bufferedReader.close();
                } else if (line.contains(C.a(C.c("50")))) {
                    strA = C.a(C.c("1067A6C403F6D6AE9072"));
                    bufferedReader.close();
                } else if (line.contains(C.a(C.c("51")))) {
                    strA = C.a(C.c("056CB2C618E6CCA981"));
                    bufferedReader.close();
                } else {
                    strA = C.a(C.c("156CBFC705F2CB"));
                    bufferedReader.close();
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused2) {
            strA = C.a(C.c("0570A6C618"));
        }
        this.f15092k = strA;
        this.f15093l = b(C.a(C.c("097187EC26ECCBB29E52010999417130")));
        this.f15094m = b(C.a(C.c("097187EC26ECCBB29E52010E945F7731C7")));
    }

    public static String a(String str) {
        try {
            String strB = com.bumptech.glide.e.b(str);
            return (strB == null || strB.isEmpty()) ? C.a(C.c("0E6DBACC")) : strB;
        } catch (Exception unused) {
            return C.a(C.c("0570A6C618"));
        }
    }

    public static String b(String str) {
        try {
            return String.valueOf(((Boolean) Class.forName(C.a(C.c("016CB0DB05ECC1E98964413BBE617D3AD6D1"))).getMethod(str, new Class[0]).invoke(null, new Object[0])).booleanValue());
        } catch (Error unused) {
            return C.a(C.c("0570A6C618"));
        } catch (Exception unused2) {
            return C.a(C.c("0570A6C618"));
        }
    }
}
