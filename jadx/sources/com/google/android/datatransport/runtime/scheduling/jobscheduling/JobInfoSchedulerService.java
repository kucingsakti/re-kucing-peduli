package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import Y1.c;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import i2.i;
import i2.p;
import p138o2.e;
import p138o2.h;
import p180s2.a;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f7699s = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        p.b(getApplicationContext());
        c cVarA = i.a();
        cVarA.M(string);
        cVarA.f5672v = a.b(i10);
        if (string2 != null) {
            cVarA.f5671u = Base64.decode(string2, 0);
        }
        h hVar = p.a().f12196d;
        i iVarL = cVarA.l();
        D4.a aVar = new D4.a(this, 18, jobParameters);
        hVar.getClass();
        hVar.f13699e.execute(new e(hVar, iVarL, i11, aVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
