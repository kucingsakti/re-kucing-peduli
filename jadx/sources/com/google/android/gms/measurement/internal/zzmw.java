package com.google.android.gms.measurement.internal;

import M2.AbstractC0300i;
import M2.l0;
import M2.m0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class zzmw extends m0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AlarmManager f9276v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l0 f9277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f9278x;

    public zzmw(zznc zzncVar) {
        super(zzncVar);
        this.f9276v = (AlarmManager) ((zzhj) this.f577s).f9140s.getSystemService("alarm");
    }

    @Override // M2.m0
    public final boolean c1() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.f9276v;
        if (alarmManager != null) {
            alarmManager.cancel(f1());
        }
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((zzhj) this.f577s).f9140s.getSystemService("jobscheduler")) == null) {
            return false;
        }
        jobScheduler.cancel(e1());
        return false;
    }

    public final void d1() {
        JobScheduler jobScheduler;
        a1();
        i().f9052F.b("Unscheduling upload");
        AlarmManager alarmManager = this.f9276v;
        if (alarmManager != null) {
            alarmManager.cancel(f1());
        }
        g1().a();
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((zzhj) this.f577s).f9140s.getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(e1());
    }

    public final int e1() {
        if (this.f9278x == null) {
            this.f9278x = Integer.valueOf(("measurement" + ((zzhj) this.f577s).f9140s.getPackageName()).hashCode());
        }
        return this.f9278x.intValue();
    }

    public final PendingIntent f1() {
        Context context = ((zzhj) this.f577s).f9140s;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzco.a);
    }

    public final AbstractC0300i g1() {
        if (this.f9277w == null) {
            this.f9277w = new l0(this, this.f3055t.f9283D, 1);
        }
        return this.f9277w;
    }
}
