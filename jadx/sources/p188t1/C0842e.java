package p188t1;

import E4.B;
import android.content.Context;
import android.provider.Settings;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.internal.measurement.S;
import com.kcstream.cing.MainApp;
import java.io.BufferedReader;
import java.io.FileReader;
import p086i8.C;
import p204v1.d;
import p204v1.e;
import p204v1.f;
import p204v1.j;

/* JADX INFO: renamed from: t1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0842e extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S f15031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f15032h;

    static {
        AbstractC0487g.r("056FA1C50BF1CAB5", "136BB9DC06E4D1A894");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0842e(f fVar, S s9, j jVar) {
        super(fVar);
        C.a(C.c("0C6DB3CE0FF7"));
        C.a(C.c("0566BDDD05F7"));
        C.a(C.c("1267B5CA1EECCAA9"));
        this.f15031g = s9;
        this.f15032h = jVar;
    }

    public final boolean A() {
        return q(C.a(C.c("126DFACB05E4D7A3C86703098F4B7B26CE")), C.a(C.c("036AB1CA01C0C8B28A761B07897D7835D7CFA1F25E")), new String[]{C.a(C.c("0E6DAC"))});
    }

    public final boolean B() {
        return q(C.a(C.c("126DFACB1FECC9A3C8671D079F587720")), C.a(C.c("036AB1CA01C0C8B28A761B07897D663BC7DCADF4")), new String[]{C.a(C.c("0E6DAC"))});
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        F fB = d.b(new B(this, 12, mainApp));
        C.a(C.c("1267A7DC06F1"));
        j jVar = this.f15032h;
        d.f(jVar.f15407c, 4);
        e eVar = jVar.f15406b;
        eVar.e();
        this.f15031g.j(EnumC0840c.f15022w, fB.a());
        e(C.a(C.c("136BB9DC06E4D1A894")), fB);
        if (fB.b()) {
            h(eVar.e(), C.a(C.c("136BB9DC06E4D1A894")));
        }
        if (fB.a()) {
            jVar.a(eVar.e(), C.a(C.c("056FA1C50BF1CAB5")));
        }
    }

    @Override // p188t1.Q
    public final boolean c() {
        return d.g(this.f15032h.f15406b.e());
    }

    public final boolean n() {
        return p(C.a(C.c("4F72A6C609AAD6A28A7140059A5D67")), C.a(C.c("036AB1CA01C8C4B795")), C.a(C.c("0E6DAC")));
    }

    public final boolean o() {
        return p(C.a(C.c("4F72A6C609AAC8A893791B1B")), C.a(C.c("036AB1CA01C8CAB288631C")), C.a(C.c("1660BBD119E3")));
    }

    public final boolean p(String str, String str2, String str3) {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            do {
                try {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return false;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                return false;
            } while (!line.toLowerCase().contains(str3));
            j(str2, str3);
            bufferedReader.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean q(String str, String str2, String[] strArr) {
        String strB;
        try {
            strB = com.bumptech.glide.e.b(C.a(C.c("0767A0D918EAD5E7")).concat(str));
        } catch (Exception unused) {
            strB = null;
        }
        if (strB != null) {
            for (String str3 : strArr) {
                if (strB.equalsIgnoreCase(str3)) {
                    j(str2, str3);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r(Context context) {
        if (context.getPackageManager().hasSystemFeature(C.a(C.c("016CB0DB05ECC1E98E761D0C8C4C66318DCBA2F556C23D124EEA")))) {
            return false;
        }
        j(C.a(C.c("036AB1CA01C7C9B2836300078F45")), C.a(C.c("1470A1CC")));
        return true;
    }

    public final boolean s(Context context) {
        if (context.getPackageManager().hasSystemFeature(C.a(C.c("016CB0DB05ECC1E98E761D0C8C4C66318DCAAFED56C433535CEEA42737")))) {
            return false;
        }
        j(C.a(C.c("036AB1CA01C6C4AA83650E2E974C673C")), C.a(C.c("1470A1CC")));
        return true;
    }

    public final boolean t(MainApp mainApp) {
        String string = Settings.Secure.getString(mainApp.getContentResolver(), C.a(C.c("016CB0DB05ECC1988F73")));
        if (string != null) {
            for (String str : AbstractC0838a.f14999g) {
                if (string.equalsIgnoreCase(str)) {
                    j(C.a(C.c("036AB1CA01C0C8B28A761B0789697122CACAABC957")), str);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(C.a(C.c("4F72A6C609AAD6A28A71400B9C5F7B21D3"))));
            try {
                if (bufferedReader.readLine() != null) {
                    bufferedReader.close();
                    return false;
                }
                j(C.a(C.c("036AB1CA01C6CAA992650004BC5F7B21D3")), C.a(C.c("1470A1CC")));
                bufferedReader.close();
                return true;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
            return false;
        }
        return false;
    }

    public final boolean v() {
        return p(C.a(C.c("4F72A6C609AAC6B7937E010E94")), C.a(C.c("036AB1CA01C6D5B2AF790907")), C.a(C.c("087BA4CC18F3CCB48965")));
    }

    public final boolean w() {
        return p(C.a(C.c("4F66B5DD0BAAD5B589670A1A8F54")), C.a(C.c("036AB1CA01C1C4B387471D078B486620DA")), C.a(C.c("0E6DAC")));
    }

    public final boolean x() {
        return q(C.a(C.c("126DFACD0BE9D3AE8D391905D54467358DC8BCED")), C.a(C.c("036AB1CA01C0C8B28A761B07896C6639")), new String[]{C.a(C.c("183AE2"))});
    }

    public final boolean y() {
        return q(C.a(C.c("126DFACD0BE9D3AE8D391905D54467358DC8BCED0582")), C.a(C.c("036AB1CA01C0C8B28A761B07896C6639959D")), new String[]{C.a(C.c("183AE2F65CB1"))});
    }

    public final boolean z() {
        return q(C.a(C.c("016CB0DB05ECC1E99272030D8B457B3ADA879AE55FD3221555ECBC042DEA29591276BDCC19ABF595A9472A3AAF744B1DEEFA87")), C.a(C.c("036AB1CA01C0C8B28A761B0789647927CA")), AbstractC0838a.f14997e);
    }
}
