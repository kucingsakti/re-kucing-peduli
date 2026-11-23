package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzmg implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zzme f9262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ int f9263t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ zzfw f9264u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Intent f9265v;

    @Override // java.lang.Runnable
    public final void run() {
        zzme zzmeVar = this.f9262s;
        zzmi zzmiVar = (zzmi) zzmeVar.a;
        int i10 = this.f9263t;
        if (zzmiVar.h(i10)) {
            this.f9264u.f9052F.a(Integer.valueOf(i10), "Local AppMeasurementService processed last upload request. StartId");
            zzmeVar.a().f9052F.b("Completed wakeful intent.");
            zzmiVar.a(this.f9265v);
        }
    }
}
