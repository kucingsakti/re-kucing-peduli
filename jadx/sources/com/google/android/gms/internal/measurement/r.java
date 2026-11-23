package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class r implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f8407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f8408t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8409u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ zzdq f8410v;

    public r(zzdq zzdqVar, boolean z6) {
        this.f8410v = zzdqVar;
        zzdqVar.f8566b.getClass();
        this.f8407s = System.currentTimeMillis();
        zzdqVar.f8566b.getClass();
        this.f8408t = SystemClock.elapsedRealtime();
        this.f8409u = z6;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdq zzdqVar = this.f8410v;
        if (zzdqVar.f8571g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            zzdqVar.c(e10, false, this.f8409u);
            b();
        }
    }
}
