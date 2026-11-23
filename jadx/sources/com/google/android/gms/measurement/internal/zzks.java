package com.google.android.gms.measurement.internal;

import C3.c;
import M2.AbstractC0305n;
import M2.W;
import M2.k0;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzks extends AbstractC0305n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile zzkp f9231A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public zzkp f9232B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9233C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f9234D;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile zzkp f9235u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile zzkp f9236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public zzkp f9237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ConcurrentHashMap f9238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Activity f9239y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f9240z;

    public zzks(zzhj zzhjVar) {
        super(zzhjVar);
        this.f9234D = new Object();
        this.f9238x = new ConcurrentHashMap();
    }

    @Override // M2.AbstractC0305n
    public final boolean c1() {
        return false;
    }

    public final zzkp d1(boolean z6) {
        a1();
        W0();
        if (!z6) {
            return this.f9237w;
        }
        zzkp zzkpVar = this.f9237w;
        return zzkpVar != null ? zzkpVar : this.f9232B;
    }

    public final String e1(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        int length = str.length();
        zzhj zzhjVar = (zzhj) this.f577s;
        return length > zzhjVar.f9146y.Y0(null, false) ? str.substring(0, zzhjVar.f9146y.Y0(null, false)) : str;
    }

    public final void f1(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((zzhj) this.f577s).f9146y.k1() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f9238x.put(activity, new zzkp(bundle2.getString(MediationMetaData.KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void g1(Activity activity, zzkp zzkpVar, boolean z6) {
        zzkp zzkpVar2;
        zzkp zzkpVar3 = this.f9235u == null ? this.f9236v : this.f9235u;
        if (zzkpVar.f9226b == null) {
            zzkpVar2 = new zzkp(zzkpVar.a, activity != null ? e1(activity.getClass()) : null, zzkpVar.f9227c, zzkpVar.f9229e, zzkpVar.f9230f);
        } else {
            zzkpVar2 = zzkpVar;
        }
        this.f9236v = this.f9235u;
        this.f9235u = zzkpVar2;
        ((zzhj) this.f577s).f9120F.getClass();
        l().f1(new W(this, zzkpVar2, zzkpVar3, SystemClock.elapsedRealtime(), z6));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
    public final void h1(zzkp zzkpVar, zzkp zzkpVar2, long j, boolean z6, Bundle bundle) {
        boolean z10;
        long j10;
        long j11;
        W0();
        boolean z11 = false;
        if (zzkpVar2 != null) {
            if (zzkpVar2.f9227c == zzkpVar.f9227c && Objects.equals(zzkpVar2.f9226b, zzkpVar.f9226b) && Objects.equals(zzkpVar2.a, zzkpVar.a)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = true;
        }
        if (z6 && this.f9237w != null) {
            z11 = true;
        }
        boolean z12 = zzkpVar.f9229e;
        zzhj zzhjVar = (zzhj) this.f577s;
        if (z10) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zznp.y1(zzkpVar, bundle2, true);
            if (zzkpVar2 != null) {
                String str = zzkpVar2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzkpVar2.f9226b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzkpVar2.f9227c);
            }
            if (z11) {
                k0 k0Var = Z0().f9269x;
                j10 = 0;
                long j12 = j - k0Var.f3043b;
                k0Var.f3043b = j;
                if (j12 > 0) {
                    V0().o1(bundle2, j12);
                }
            } else {
                j10 = 0;
            }
            if (!zzhjVar.f9146y.k1()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = z12 ? "app" : "auto";
            zzhjVar.f9120F.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z12) {
                long j13 = zzkpVar.f9230f;
                if (j13 != j10) {
                    j11 = j13;
                } else {
                    j11 = jCurrentTimeMillis;
                }
            } else {
                j11 = jCurrentTimeMillis;
            }
            X0().d1(j11, bundle2, str3, "_vs");
        }
        if (z11) {
            i1(this.f9237w, true, j);
        }
        this.f9237w = zzkpVar;
        if (z12) {
            this.f9232B = zzkpVar;
        }
        zzkx zzkxVarR = zzhjVar.r();
        zzkxVarR.W0();
        zzkxVarR.a1();
        zzkxVarR.f1(new c(zzkxVarR, zzkpVar, 18, false));
    }

    public final void i1(zzkp zzkpVar, boolean z6, long j) {
        zzhj zzhjVar = (zzhj) this.f577s;
        zzb zzbVarM = zzhjVar.m();
        zzhjVar.f9120F.getClass();
        zzbVarM.a1(SystemClock.elapsedRealtime());
        if (!Z0().f9269x.a(zzkpVar != null && zzkpVar.f9228d, z6, j) || zzkpVar == null) {
            return;
        }
        zzkpVar.f9228d = false;
    }

    public final zzkp j1(Activity activity) {
        Preconditions.i(activity);
        zzkp zzkpVar = (zzkp) this.f9238x.get(activity);
        if (zzkpVar == null) {
            zzkp zzkpVar2 = new zzkp(null, e1(activity.getClass()), V0().h2());
            this.f9238x.put(activity, zzkpVar2);
            zzkpVar = zzkpVar2;
        }
        return this.f9231A != null ? this.f9231A : zzkpVar;
    }
}
