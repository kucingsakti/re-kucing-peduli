package K4;

import C0.v;
import N9.I;
import N9.InterfaceC0341y;
import N9.e0;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import com.kcstream.cing.R;
import com.kcstream.cing.api.Service;
import p078i.AbstractActivityC0655l;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends AbstractActivityC0655l implements InterfaceC0341y {
    public H4.a P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public e0 f2591Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f2592R = "";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f2593S = "";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f2594T = true;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f2595U;

    public f() {
        System.loadLibrary("native-lib");
    }

    @Override // N9.InterfaceC0341y
    public final p123m8.i c() {
        e0 e0Var = this.f2591Q;
        if (e0Var != null) {
            U9.d dVar = I.a;
            return com.bumptech.glide.e.l(e0Var, S9.n.a);
        }
        p210v8.i.n("job");
        throw null;
    }

    @Override // p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public void onCreate(Bundle bundle) {
        p086i8.l.C("#f48fb1", "#E57373", "#BA68C8", "#7986CB", "#4DB6AC", "#4DD0E1", "#DCE775", "#FFD54F", "#A1887F", "#000000");
        SharedPreferences sharedPreferences = getSharedPreferences("theme", 0);
        boolean zContains = sharedPreferences.contains("setTheme");
        int i10 = R.style.AppTheme;
        if (zContains) {
            i10 = sharedPreferences.getInt("setTheme", R.style.AppTheme);
        }
        setTheme(i10);
        super.onCreate(bundle);
        y().contains("isBatterySaverAgreement");
        if (y().contains("key_passcode")) {
            this.f2595U = true;
            getWindow().setFlags(8192, 8192);
        } else if (this.f2595U) {
            getWindow().clearFlags(8192);
        }
        J7.j.a = new D3.i(11);
        if (y().contains("bda")) {
            this.f2594T = y().getBoolean("bda", true);
        } else {
            this.f2594T = true;
        }
        if (!y().contains("adPath1")) {
            byte[] bArrDecode = Base64.decode("aHR0cHM6Ly9saW5rcG9pLm1lL3Nwb3RzLXJlcw==", 0);
            p210v8.i.e(bArrDecode, "decode(...)");
            this.f2592R = new String(bArrDecode, L9.a.a);
        } else if (p210v8.i.a(y().getString("adPath1", ""), "")) {
            byte[] bArrDecode2 = Base64.decode("aHR0cHM6Ly9saW5rcG9pLm1lL3Nwb3RzLXJlcw==", 0);
            p210v8.i.e(bArrDecode2, "decode(...)");
            this.f2592R = new String(bArrDecode2, L9.a.a);
        } else {
            this.f2592R = String.valueOf(y().getString("adPath1", ""));
        }
        if (!y().contains("adPath2")) {
            byte[] bArrDecode3 = Base64.decode("aHR0cHM6Ly9saW5rcG9pLm1lL3Nwb3RzLXJlcw==", 0);
            p210v8.i.e(bArrDecode3, "decode(...)");
            this.f2593S = new String(bArrDecode3, L9.a.a);
        } else if (p210v8.i.a(y().getString("adPath2", ""), "")) {
            byte[] bArrDecode4 = Base64.decode("aHR0cHM6Ly9saW5rcG9pLm1lL3Nwb3RzLXJlcw==", 0);
            p210v8.i.e(bArrDecode4, "decode(...)");
            this.f2593S = new String(bArrDecode4, L9.a.a);
        } else {
            this.f2593S = String.valueOf(y().getString("adPath2", ""));
        }
        this.P = new Service(this).c();
        this.f2591Q = new e0();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        com.bumptech.glide.b bVarB = com.bumptech.glide.b.b(this);
        bVarB.getClass();
        U1.n.a();
        bVarB.f7588t.e(0L);
        bVarB.f7587s.o();
        bVarB.f7590v.a();
    }

    @Override // p031d.m, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        com.bumptech.glide.b.b(this).d(i10);
    }

    public final h w() {
        return new h(this, "nekopoi_localdb", null, 1);
    }

    public final H4.a x() {
        H4.a aVar = this.P;
        if (aVar != null) {
            return aVar;
        }
        p210v8.i.n("service");
        throw null;
    }

    public final SharedPreferences y() {
        SharedPreferences sharedPreferences = getSharedPreferences(v.a(this), 0);
        p210v8.i.e(sharedPreferences, "getDefaultSharedPreferences(...)");
        return sharedPreferences;
    }
}
