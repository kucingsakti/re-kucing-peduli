package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzmd implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zzme f9259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ zzfw f9260t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ JobParameters f9261u;

    @Override // java.lang.Runnable
    public final void run() {
        zzme zzmeVar = this.f9259s;
        zzmeVar.getClass();
        this.f9260t.f9052F.b("AppMeasurementJobService processed last upload request.");
        ((zzmi) zzmeVar.a).b(this.f9261u);
    }
}
