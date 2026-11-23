package g2;

import P0.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import h2.A;
import h2.AbstractC0634a;
import h2.B;
import h2.C;
import h2.C0635b;
import h2.C0636c;
import h2.C0637d;
import h2.C0638e;
import h2.C0639f;
import h2.C0640g;
import h2.C0641h;
import h2.C0642i;
import h2.C0643j;
import h2.D;
import h2.E;
import h2.F;
import h2.G;
import h2.H;
import h2.I;
import h2.k;
import h2.l;
import h2.m;
import h2.n;
import h2.o;
import h2.p;
import h2.q;
import h2.r;
import h2.s;
import h2.t;
import h2.v;
import h2.w;
import h2.y;
import i2.h;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p090j2.g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {
    public final d a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f11532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f11533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f11534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p169r2.a f11535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p169r2.a f11536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11537g;

    public c(Context context, p169r2.a aVar, p169r2.a aVar2) {
        p024c4.d dVar = new p024c4.d();
        C0636c c0636c = C0636c.a;
        dVar.a(w.class, c0636c);
        dVar.a(m.class, c0636c);
        C0643j c0643j = C0643j.a;
        dVar.a(F.class, c0643j);
        dVar.a(t.class, c0643j);
        C0637d c0637d = C0637d.a;
        dVar.a(y.class, c0637d);
        dVar.a(n.class, c0637d);
        C0635b c0635b = C0635b.a;
        dVar.a(AbstractC0634a.class, c0635b);
        dVar.a(l.class, c0635b);
        C0642i c0642i = C0642i.a;
        dVar.a(E.class, c0642i);
        dVar.a(s.class, c0642i);
        C0638e c0638e = C0638e.a;
        dVar.a(A.class, c0638e);
        dVar.a(o.class, c0638e);
        C0641h c0641h = C0641h.a;
        dVar.a(D.class, c0641h);
        dVar.a(r.class, c0641h);
        C0640g c0640g = C0640g.a;
        dVar.a(C.class, c0640g);
        dVar.a(q.class, c0640g);
        k kVar = k.a;
        dVar.a(I.class, kVar);
        dVar.a(v.class, kVar);
        C0639f c0639f = C0639f.a;
        dVar.a(B.class, c0639f);
        dVar.a(p.class, c0639f);
        dVar.f7527d = true;
        this.a = new d(dVar, 22);
        this.f11533c = context;
        this.f11532b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f11534d = b(a.f11525c);
        this.f11535e = aVar2;
        this.f11536f = aVar;
        this.f11537g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(E0.a.h("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:33:0x0111  */
    public final h a(h hVar) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.f11532b.getActiveNetworkInfo();
        Q6.b bVarC = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) bVarC.f4335f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i10));
        bVarC.a("model", Build.MODEL);
        bVarC.a("hardware", Build.HARDWARE);
        bVarC.a("device", Build.DEVICE);
        bVarC.a("product", Build.PRODUCT);
        bVarC.a("os-uild", Build.ID);
        bVarC.a("manufacturer", Build.MANUFACTURER);
        bVarC.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) bVarC.f4335f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = H.f11657s;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) bVarC.f4335f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = G.f11655s;
                subtype = 100;
            } else if (((G) G.f11655s.get(subtype)) == null) {
            }
            map = (HashMap) bVarC.f4335f;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            bVarC.a("country", Locale.getDefault().getCountry());
            bVarC.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f11533c;
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            bVarC.a("mcc_mnc", simOperator);
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable(com.bumptech.glide.d.q("CctTransportBackend"), 6);
            }
            bVarC.a("application_build", Integer.toString(i11));
            return bVarC.b();
        }
        SparseArray sparseArray3 = G.f11655s;
        subtype = 0;
        map = (HashMap) bVarC.f4335f;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        bVarC.a("country", Locale.getDefault().getCountry());
        bVarC.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f11533c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        bVarC.a("mcc_mnc", simOperator);
        i11 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        bVarC.a("application_build", Integer.toString(i11));
        return bVarC.b();
    }
}
