package com.google.android.gms.measurement.internal;

import A1.r;
import M2.AbstractC0305n;
import M2.k0;
import android.os.Looper;
import o1.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzmh extends AbstractC0305n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.zzcz f9266u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9267v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r f9268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k0 f9269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f9270y;

    public zzmh(zzhj zzhjVar) {
        super(zzhjVar);
        this.f9267v = true;
        this.f9268w = new r(this, 23);
        this.f9269x = new k0(this);
        this.f9270y = new c(this);
    }

    @Override // M2.AbstractC0305n
    public final boolean c1() {
        return false;
    }

    public final void d1() {
        W0();
        if (this.f9266u == null) {
            this.f9266u = new com.google.android.gms.internal.measurement.zzcz(Looper.getMainLooper());
        }
    }
}
