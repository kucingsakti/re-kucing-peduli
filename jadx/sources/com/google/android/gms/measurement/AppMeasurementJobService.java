package com.google.android.gms.measurement;

import C3.c;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzmd;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzmi;
import com.google.android.gms.measurement.internal.zznc;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements zzmi {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zzme f8878s;

    @Override // com.google.android.gms.measurement.internal.zzmi
    public final void a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzmi
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final zzme c() {
        if (this.f8878s == null) {
            this.f8878s = new zzme(this);
        }
        return this.f8878s;
    }

    @Override // com.google.android.gms.measurement.internal.zzmi
    public final boolean h(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zzfw zzfwVar = zzhj.c(c().a, null, null).f9115A;
        zzhj.g(zzfwVar);
        zzfwVar.f9052F.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zzfw zzfwVar = zzhj.c(c().a, null, null).f9115A;
        zzhj.g(zzfwVar);
        zzfwVar.f9052F.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        zzme zzmeVarC = c();
        if (intent == null) {
            zzmeVarC.a().f9056x.b("onRebind called with null intent");
            return;
        }
        zzmeVarC.getClass();
        zzmeVarC.a().f9052F.a(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        zzme zzmeVarC = c();
        zzfw zzfwVar = zzhj.c(zzmeVarC.a, null, null).f9115A;
        zzhj.g(zzfwVar);
        String string = jobParameters.getExtras().getString("action");
        zzfwVar.f9052F.a(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zzmd zzmdVar = new zzmd();
        zzmdVar.f9259s = zzmeVarC;
        zzmdVar.f9260t = zzfwVar;
        zzmdVar.f9261u = jobParameters;
        zznc zzncVarH = zznc.h(zzmeVarC.a);
        zzncVarH.l().f1(new c(zzncVarH, 20, zzmdVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        zzme zzmeVarC = c();
        if (intent == null) {
            zzmeVarC.a().f9056x.b("onUnbind called with null intent");
            return true;
        }
        zzmeVarC.getClass();
        zzmeVarC.a().f9052F.a(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }
}
