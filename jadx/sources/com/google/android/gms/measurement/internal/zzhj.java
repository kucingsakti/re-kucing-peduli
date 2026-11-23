package com.google.android.gms.measurement.internal;

import A1.r;
import C3.c;
import D3.b;
import M2.AbstractC0305n;
import M2.C0313w;
import M2.InterfaceC0296e;
import M2.L;
import M2.M;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.internal.measurement.zzgz;
import com.google.android.gms.internal.measurement.zzhb;
import java.util.concurrent.atomic.AtomicInteger;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public class zzhj implements M {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static volatile zzhj f9114a0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final zzfw f9115A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final zzhc f9116B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final zzmh f9117C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final zznp f9118D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final zzfr f9119E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final DefaultClock f9120F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final zzks f9121G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final zziv f9122H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final zzb f9123I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final zzkj f9124J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final String f9125K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public zzfp f9126L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public zzkx f9127M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public zzax f9128N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public zzfq f9129O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Boolean f9130Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f9131R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public volatile Boolean f9132S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final Boolean f9133T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Boolean f9134U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public volatile boolean f9135V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f9136W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f9137X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final long f9139Z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f9140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f9141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f9142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f9143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f9144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zzab f9145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zzag f9146y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0313w f9147z;
    public boolean P = false;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final AtomicInteger f9138Y = new AtomicInteger(0);

    public zzhj(zzit zzitVar) {
        long jCurrentTimeMillis;
        Bundle bundle;
        boolean z6 = false;
        Context context = zzitVar.a;
        zzab zzabVar = new zzab();
        this.f9145x = zzabVar;
        C.a = zzabVar;
        this.f9140s = context;
        this.f9141t = zzitVar.f9183b;
        this.f9142u = zzitVar.f9184c;
        this.f9143v = zzitVar.f9185d;
        this.f9144w = zzitVar.f9189h;
        this.f9132S = zzitVar.f9186e;
        this.f9125K = zzitVar.j;
        this.f9135V = true;
        com.google.android.gms.internal.measurement.zzdo zzdoVar = zzitVar.f9188g;
        if (zzdoVar != null && (bundle = zzdoVar.f8563y) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f9133T = (Boolean) obj;
            }
            Object obj2 = zzdoVar.f8563y.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f9134U = (Boolean) obj2;
            }
        }
        if (zzgz.f8652g == null && context != null) {
            Object obj3 = zzgz.f8651f;
            synchronized (obj3) {
                try {
                    if (zzgz.f8652g == null) {
                        synchronized (obj3) {
                            try {
                                P p10 = zzgz.f8652g;
                                Context applicationContext = context.getApplicationContext();
                                applicationContext = applicationContext == null ? context : applicationContext;
                                if (p10 == null || p10.a != applicationContext) {
                                    if (p10 != null) {
                                        com.google.android.gms.internal.measurement.zzgk.c();
                                        com.google.android.gms.internal.measurement.zzhi.b();
                                        S.z();
                                    }
                                    zzhb zzhbVar = new zzhb();
                                    zzhbVar.f8661s = applicationContext;
                                    zzgz.f8652g = new P(applicationContext, b.v(zzhbVar));
                                    zzgz.f8653h.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        DefaultClock defaultClock = DefaultClock.a;
        this.f9120F = defaultClock;
        Long l4 = zzitVar.f9190i;
        if (l4 != null) {
            jCurrentTimeMillis = l4.longValue();
        } else {
            defaultClock.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f9139Z = jCurrentTimeMillis;
        zzag zzagVar = new zzag(this);
        zzagVar.f8896v = new InterfaceC0296e() { // from class: com.google.android.gms.measurement.internal.zzaf
            @Override // M2.InterfaceC0296e
            public final String H(String str, String str2) {
                return null;
            }
        };
        this.f9146y = zzagVar;
        C0313w c0313w = new C0313w(this);
        c0313w.Y0();
        this.f9147z = c0313w;
        zzfw zzfwVar = new zzfw(this);
        zzfwVar.Y0();
        this.f9115A = zzfwVar;
        zznp zznpVar = new zznp(this);
        zznpVar.Y0();
        this.f9118D = zznpVar;
        this.f9119E = new zzfr(new r(this, 22));
        this.f9123I = new zzb(this);
        zzks zzksVar = new zzks(this);
        zzksVar.b1();
        this.f9121G = zzksVar;
        zziv zzivVar = new zziv(this);
        zzivVar.b1();
        this.f9122H = zzivVar;
        zzmh zzmhVar = new zzmh(this);
        zzmhVar.b1();
        this.f9117C = zzmhVar;
        zzkj zzkjVar = new zzkj(this);
        zzkjVar.Y0();
        this.f9124J = zzkjVar;
        zzhc zzhcVar = new zzhc(this);
        zzhcVar.Y0();
        this.f9116B = zzhcVar;
        com.google.android.gms.internal.measurement.zzdo zzdoVar2 = zzitVar.f9188g;
        if (zzdoVar2 != null && zzdoVar2.f8558t != 0) {
            z6 = true;
        }
        if (context.getApplicationContext() instanceof Application) {
            f(zzivVar);
            zzhj zzhjVar = (zzhj) zzivVar.f577s;
            if (zzhjVar.f9140s.getApplicationContext() instanceof Application) {
                Application application = (Application) zzhjVar.f9140s.getApplicationContext();
                if (zzivVar.f9204u == null) {
                    zzivVar.f9204u = new Ia.a(zzivVar, 1);
                }
                if (!z6) {
                    application.unregisterActivityLifecycleCallbacks(zzivVar.f9204u);
                    application.registerActivityLifecycleCallbacks(zzivVar.f9204u);
                    zzivVar.i().f9052F.b("Registered activity lifecycle callback");
                }
            }
        } else {
            g(zzfwVar);
            zzfwVar.f9047A.b("Application context is not an Application");
        }
        zzhcVar.f1(new c(this, zzitVar, 12, false));
    }

    public static zzhj c(Context context, com.google.android.gms.internal.measurement.zzdo zzdoVar, Long l4) {
        Bundle bundle;
        if (zzdoVar != null && (zzdoVar.f8561w == null || zzdoVar.f8562x == null)) {
            zzdoVar = new com.google.android.gms.internal.measurement.zzdo(zzdoVar.f8557s, zzdoVar.f8558t, zzdoVar.f8559u, zzdoVar.f8560v, null, null, zzdoVar.f8563y, null);
        }
        Preconditions.i(context);
        Preconditions.i(context.getApplicationContext());
        if (f9114a0 == null) {
            synchronized (zzhj.class) {
                try {
                    if (f9114a0 == null) {
                        f9114a0 = new zzhj(new zzit(context, zzdoVar, l4));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zzdoVar != null && (bundle = zzdoVar.f8563y) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.i(f9114a0);
            f9114a0.f9132S = Boolean.valueOf(zzdoVar.f8563y.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.i(f9114a0);
        return f9114a0;
    }

    public static void e(B1.a aVar) {
        if (aVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static void f(AbstractC0305n abstractC0305n) {
        if (abstractC0305n == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC0305n.f3054t) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC0305n.getClass())));
        }
    }

    public static void g(L l4) {
        if (l4 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!l4.f2917t) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(l4.getClass())));
        }
    }

    @Override // M2.M
    public final Clock a() {
        return this.f9120F;
    }

    @Override // M2.M
    public final Context b() {
        return this.f9140s;
    }

    @Override // M2.M
    public final zzab d() {
        return this.f9145x;
    }

    public final boolean h() {
        return k() == 0;
    }

    @Override // M2.M
    public final zzfw i() {
        zzfw zzfwVar = this.f9115A;
        g(zzfwVar);
        return zzfwVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    public final boolean j() {
        zznp zznpVar;
        boolean z6;
        boolean z10;
        String strE1;
        zzfq zzfqVarO;
        zzfq zzfqVarO2;
        if (!this.P) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzhc zzhcVar = this.f9116B;
        g(zzhcVar);
        zzhcVar.W0();
        Boolean bool = this.f9130Q;
        DefaultClock defaultClock = this.f9120F;
        if (bool == null || this.f9131R == 0) {
            defaultClock.getClass();
            this.f9131R = SystemClock.elapsedRealtime();
            zznpVar = this.f9118D;
            e(zznpVar);
            z6 = true;
            if (zznpVar.Z1("android.permission.INTERNET") || !zznpVar.Z1("android.permission.ACCESS_NETWORK_STATE")) {
                z10 = false;
            } else {
                Context context = this.f9140s;
                if (Wrappers.a(context).c() || this.f9146y.l1() || (zznp.C1(context) && zznp.O1(context))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            this.f9130Q = Boolean.valueOf(z10);
            if (z10) {
                strE1 = o().e1();
                zzfqVarO = o();
                zzfqVarO.a1();
                if (!zznpVar.H1(strE1, zzfqVarO.f9034E)) {
                    zzfqVarO2 = o();
                    zzfqVarO2.a1();
                    if (TextUtils.isEmpty(zzfqVarO2.f9034E)) {
                        z6 = false;
                    }
                }
                this.f9130Q = Boolean.valueOf(z6);
            }
        } else if (!bool.booleanValue()) {
            defaultClock.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f9131R) > 1000) {
                defaultClock.getClass();
                this.f9131R = SystemClock.elapsedRealtime();
                zznpVar = this.f9118D;
                e(zznpVar);
                z6 = true;
                if (zznpVar.Z1("android.permission.INTERNET")) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                this.f9130Q = Boolean.valueOf(z10);
                if (z10) {
                    strE1 = o().e1();
                    zzfqVarO = o();
                    zzfqVarO.a1();
                    if (!zznpVar.H1(strE1, zzfqVarO.f9034E)) {
                        zzfqVarO2 = o();
                        zzfqVarO2.a1();
                        if (TextUtils.isEmpty(zzfqVarO2.f9034E)) {
                            z6 = false;
                        }
                    }
                    this.f9130Q = Boolean.valueOf(z6);
                }
            }
        }
        return this.f9130Q.booleanValue();
    }

    public final int k() {
        zzhc zzhcVar = this.f9116B;
        g(zzhcVar);
        zzhcVar.W0();
        Boolean boolF1 = this.f9146y.f1("firebase_analytics_collection_deactivated");
        if (boolF1 != null && boolF1.booleanValue()) {
            return 1;
        }
        Boolean bool = this.f9134U;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzhc zzhcVar2 = this.f9116B;
        g(zzhcVar2);
        zzhcVar2.W0();
        if (!this.f9135V) {
            return 8;
        }
        C0313w c0313w = this.f9147z;
        e(c0313w);
        c0313w.W0();
        Boolean boolValueOf = c0313w.f1().contains("measurement_enabled") ? Boolean.valueOf(c0313w.f1().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        Boolean boolF2 = this.f9146y.f1("firebase_analytics_collection_enabled");
        if (boolF2 != null) {
            return boolF2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f9133T;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.f9132S == null || this.f9132S.booleanValue()) ? 0 : 7;
    }

    @Override // M2.M
    public final zzhc l() {
        zzhc zzhcVar = this.f9116B;
        g(zzhcVar);
        return zzhcVar;
    }

    public final zzb m() {
        zzb zzbVar = this.f9123I;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzax n() {
        g(this.f9128N);
        return this.f9128N;
    }

    public final zzfq o() {
        f(this.f9129O);
        return this.f9129O;
    }

    public final zzfp p() {
        f(this.f9126L);
        return this.f9126L;
    }

    public final zzfr q() {
        return this.f9119E;
    }

    public final zzkx r() {
        f(this.f9127M);
        return this.f9127M;
    }

    public final void s() {
        e(this.f9118D);
    }
}
