package K0;

import A1.s;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import ma.v;

/* JADX INFO: loaded from: classes.dex */
public final class g implements N1.p {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2528e;

    public g(s sVar, N1.o oVar) {
        this.a = 1;
        this.f2528e = new N1.q(this, 0);
        this.f2527d = sVar;
        this.f2526c = oVar;
    }

    @Override // N1.p
    public void a() {
        ((ConnectivityManager) ((s) this.f2527d).get()).unregisterNetworkCallback((N1.q) this.f2528e);
    }

    @Override // N1.p
    public boolean b() {
        s sVar = (s) this.f2527d;
        this.f2525b = ((ConnectivityManager) sVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) sVar.get()).registerDefaultNetworkCallback((N1.q) this.f2528e);
            return true;
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e10);
            }
            return false;
        }
    }

    public void c() {
        switch (this.a) {
            case 3:
                Z9.g gVar = (Z9.g) this.f2528e;
                synchronized (gVar) {
                    try {
                        if (this.f2525b) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (p210v8.i.a(((Z9.d) this.f2526c).f5931g, this)) {
                            gVar.b(this, false);
                        }
                        this.f2525b = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                p214w1.c.a((p214w1.c) this.f2528e, this, false);
                return;
        }
    }

    public void d() {
        Z9.g gVar = (Z9.g) this.f2528e;
        synchronized (gVar) {
            try {
                if (this.f2525b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (p210v8.i.a(((Z9.d) this.f2526c).f5931g, this)) {
                    gVar.b(this, true);
                }
                this.f2525b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        Z9.d dVar = (Z9.d) this.f2526c;
        if (p210v8.i.a(dVar.f5931g, this)) {
            Z9.g gVar = (Z9.g) this.f2528e;
            if (gVar.f5946B) {
                gVar.b(this, false);
            } else {
                dVar.f5930f = true;
            }
        }
    }

    public File f() {
        File file;
        synchronized (((p214w1.c) this.f2528e)) {
            try {
                p214w1.b bVar = (p214w1.b) this.f2526c;
                if (bVar.f15519f != this) {
                    throw new IllegalStateException();
                }
                if (!bVar.f15518e) {
                    ((boolean[]) this.f2527d)[0] = true;
                }
                file = bVar.f15517d[0];
                ((p214w1.c) this.f2528e).f15527s.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public int[] g() {
        synchronized (this) {
            try {
                if (!this.f2525b) {
                    return null;
                }
                long[] jArr = (long[]) this.f2526c;
                int length = jArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    int i13 = 1;
                    boolean z6 = jArr[i10] > 0;
                    boolean[] zArr = (boolean[]) this.f2527d;
                    if (z6 != zArr[i11]) {
                        int[] iArr = (int[]) this.f2528e;
                        if (!z6) {
                            i13 = 2;
                        }
                        iArr[i11] = i13;
                    } else {
                        ((int[]) this.f2528e)[i11] = 0;
                    }
                    zArr[i11] = z6;
                    i10++;
                    i11 = i12;
                }
                this.f2525b = false;
                return (int[]) ((int[]) this.f2528e).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void h() {
        try {
            if (this.f2525b) {
                return;
            }
            Boolean boolL = l();
            this.f2527d = boolL;
            if (boolL == null) {
                Y9.a aVar = new Y9.a(7);
                I3.k kVar = (I3.k) ((p042e4.c) this.f2526c);
                kVar.a(kVar.f2039c, aVar);
            }
            this.f2525b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean i() {
        Boolean bool;
        try {
            h();
            bool = (Boolean) this.f2527d;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f2528e).a.h();
    }

    public v j(int i10) {
        ma.a aVarC;
        Z9.g gVar = (Z9.g) this.f2528e;
        synchronized (gVar) {
            try {
                if (this.f2525b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!p210v8.i.a(((Z9.d) this.f2526c).f5931g, this)) {
                    return new ma.d();
                }
                if (!((Z9.d) this.f2526c).f5929e) {
                    boolean[] zArr = (boolean[]) this.f2527d;
                    p210v8.i.c(zArr);
                    zArr[i10] = true;
                }
                File file = (File) ((Z9.d) this.f2526c).f5928d.get(i10);
                try {
                    p210v8.i.f(file, "file");
                    try {
                        aVarC = p068ga.d.C(file);
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        aVarC = p068ga.d.C(file);
                    }
                    return new Z9.h(aVarC, new E0.b(gVar, 6, this));
                } catch (FileNotFoundException unused2) {
                    return new ma.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean k(int... iArr) {
        boolean z6;
        p210v8.i.f(iArr, "tableIds");
        synchronized (this) {
            z6 = false;
            for (int i10 : iArr) {
                long[] jArr = (long[]) this.f2526c;
                long j = jArr[i10];
                jArr[i10] = j - 1;
                if (j == 1) {
                    z6 = true;
                    this.f2525b = true;
                }
            }
        }
        return z6;
    }

    public Boolean l() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        D3.g gVar = ((FirebaseMessaging) this.f2528e).a;
        gVar.a();
        Context context = gVar.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public g(T3.c cVar, boolean z6) {
        this.a = 2;
        this.f2528e = cVar;
        this.f2527d = new AtomicReference(null);
        this.f2525b = z6;
        this.f2526c = new AtomicMarkableReference(new P3.d(z6 ? 8192 : 1024), false);
    }

    public g(int i10) {
        this.a = 0;
        this.f2526c = new long[i10];
        this.f2527d = new boolean[i10];
        this.f2528e = new int[i10];
    }

    public g(FirebaseMessaging firebaseMessaging, p042e4.c cVar) {
        this.a = 4;
        this.f2528e = firebaseMessaging;
        this.f2526c = cVar;
    }

    public g(p214w1.c cVar, p214w1.b bVar) {
        this.a = 5;
        this.f2528e = cVar;
        this.f2526c = bVar;
        this.f2527d = bVar.f15518e ? null : new boolean[cVar.f15533y];
    }

    public g(Z9.g gVar, Z9.d dVar) {
        this.a = 3;
        p210v8.i.f(gVar, "this$0");
        this.f2528e = gVar;
        this.f2526c = dVar;
        this.f2527d = dVar.f5929e ? null : new boolean[2];
    }
}
