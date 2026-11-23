package p188t1;

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.bumptech.glide.e;
import com.google.android.gms.internal.measurement.S;
import com.kcstream.cing.MainApp;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import p086i8.C;
import p128n2.b;
import p204v1.d;
import p204v1.f;
import p204v1.j;
import p231y.a;

/* JADX INFO: loaded from: classes.dex */
public final class B extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S f14968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f14969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final E f14970i;

    static {
        AbstractC0487g.r("126DBBDD", "1070BDDF03E9C0A083732E0B98486727");
    }

    public B(f fVar, S s9, j jVar, E e10) {
        super(fVar);
        this.f14968g = s9;
        this.f14969h = jVar;
        jVar.f15406b.getClass();
        Object obj = ((f) fVar.f15395d).f15394c;
        this.f14970i = e10;
    }

    public static ApplicationInfo n(MainApp mainApp, String str) {
        try {
            PackageManager packageManager = mainApp.getPackageManager();
            return Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        F fB = d.b(new b(this, mainApp, mainApp.getPackageManager(), 5));
        j jVar = this.f14969h;
        d.f(jVar.f15407c, 1);
        jVar.f15406b.getClass();
        this.f14968g.j(EnumC0840c.f15020u, fB.a());
        e(C.a(C.c("1070BDDF03E9C0A083732E0B98486727")), fB);
        if (fB.b()) {
            c(null, C.a(C.c("1070BDDF03E9C0A083732E0B98486727")));
        }
        if (fB.a()) {
            jVar.b(C.a(C.c("126DBBDD")));
        }
    }

    @Override // p188t1.Q
    public final boolean c() {
        this.f14969h.f15406b.getClass();
        return false;
    }

    public final boolean o(PackageManager packageManager, String str) {
        ApplicationInfo applicationInfo;
        ActivityInfo[] activityInfoArr;
        ServiceInfo[] serviceInfoArr;
        ActivityInfo[] activityInfoArr2;
        ProviderInfo[] providerInfoArr;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 4111);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 0 && (activityInfoArr = packageInfo.activities) != null && (serviceInfoArr = packageInfo.services) != null && (activityInfoArr2 = packageInfo.receivers) != null && (providerInfoArr = packageInfo.providers) != null && activityInfoArr.length == 2 && serviceInfoArr.length == 2 && activityInfoArr2.length == 1 && providerInfoArr.length == 1) {
                HashSet hashSet = new HashSet(Arrays.asList(C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0C97DE2172F74C791")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0C67CE4173A68CD901A1BDA0A7932549DEA2F")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D560F30D3F73CD88110BD7107F")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D166F3002465C3891800D5187F2B4393EC39")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0C170F5172E69DD8B110BD2166E2B5D87FD2BD1E0")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0C87AF2172275D4800613C40063374B9AED25D2F6")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D560F30D3B73CC82110DD50B752E56")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D563F213297FDD95151CCE187B25518BFE23D1ED88B343303DA868460BE2EA9AC97CF8")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D276E7073869D69A1D11D60D7D2C4E8BF92BC6EE86A1523C"))));
                HashSet hashSet2 = new HashSet(Arrays.asList(C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0C97DE2172F74C791")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0C67CE4173A68CD901A1BDA0A7932549DEA2F")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0C67CE4173A68CD901A1BDA0A7932549DEA2FDAE186B256303BA26357")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D166F3002465C3891800D5187F2B4393EC39")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0C170F5172E69DD8B110BD2166E2B5D87FD2BD1E0")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0C87AF2172275D4800613C40063374B9AED25D2F6")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D07CE5062274CD911D19CC1A7D344B9BE739")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D563F213297FDD95151CCE187B25518BFE23D1ED88B343303DA868460BE2EA9AC97CF8")), C.a(C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D276E7073869D69A1D11D60D7D2C4E8BF92BC6EE86A1523C"))));
                String[] strArr = packageInfo.requestedPermissions;
                if (strArr != null && strArr.length >= hashSet.size()) {
                    HashSet hashSet3 = new HashSet(Arrays.asList(packageInfo.requestedPermissions));
                    if (hashSet3.containsAll(hashSet) || hashSet3.containsAll(hashSet2)) {
                        long length = new File(applicationInfo.sourceDir).length() / 1024;
                        if ((length >= 20 && length <= 40) || (length >= 9216 && length <= 20480)) {
                            try {
                                l(C.a(C.c("0863A7E40BE2CCB48D441B1D99")), C.a(C.c("1470A1CC")));
                                return true;
                            } catch (Exception unused) {
                                return false;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return false;
    }

    public final boolean p(String str, String str2) {
        String strB;
        try {
            strB = e.b(C.a(C.c("0767A0D918EAD5E7")).concat(str));
        } catch (Exception unused) {
            strB = null;
        }
        boolean z6 = strB != null && strB.equals(str2);
        if (z6) {
            String strA = C.a(C.c("097187D019F1C0AAB66500189E5F602DE6D8BBE15FE23D"));
            StringBuilder sbC = p239z.e.c(str);
            sbC.append(C.a(C.c("4038F4")));
            sbC.append(str2);
            l(strA, sbC.toString());
        }
        return z6;
    }

    public final boolean q(String str) {
        String strB;
        for (String str2 : AbstractC0860x.f15132b) {
            StringBuilder sbC = p239z.e.c(str2);
            sbC.append(C.a(C.c("40")));
            sbC.append(str);
            try {
                strB = e.b(sbC.toString());
            } catch (Exception unused) {
                strB = null;
            }
            if (strB != null) {
                String strA = C.a(C.c("0363BAEC12E0C6B292722C079640753AC7FCBDE95DD1051553E1AD"));
                StringBuilder sbC2 = p239z.e.c(str2);
                sbC2.append(C.a(C.c("40")));
                sbC2.append(str);
                l(strA, sbC2.toString());
                return true;
            }
        }
        return false;
    }

    public final boolean r(String str) {
        for (String str2 : AbstractC0860x.f15134d) {
            if (new File(a.c(str2, str)).exists()) {
                l(C.a(C.c("0170B1EB03EBC4B58F721C3889486731CDDD")), str2 + str);
                return true;
            }
        }
        return false;
    }
}
