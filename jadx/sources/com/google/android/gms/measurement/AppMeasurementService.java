package com.google.android.gms.measurement;

import C3.c;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzhn;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzmg;
import com.google.android.gms.measurement.internal.zzmi;
import com.google.android.gms.measurement.internal.zznc;
import p187t0.a;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements zzmi {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zzme f8880s;

    @Override // com.google.android.gms.measurement.internal.zzmi
    public final void a(Intent intent) {
        SparseArray sparseArray = a.f14965s;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f14965s;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzmi
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final zzme c() {
        if (this.f8880s == null) {
            this.f8880s = new zzme(this);
        }
        return this.f8880s;
    }

    @Override // com.google.android.gms.measurement.internal.zzmi
    public final boolean h(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        zzme zzmeVarC = c();
        if (intent == null) {
            zzmeVarC.a().f9056x.b("onBind called with null intent");
            return null;
        }
        zzmeVarC.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzhn(zznc.h(zzmeVarC.a));
        }
        zzmeVarC.a().f9047A.a(action, "onBind received unknown action");
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        zzme zzmeVarC = c();
        zzfw zzfwVar = zzhj.c(zzmeVarC.a, null, null).f9115A;
        zzhj.g(zzfwVar);
        if (intent == null) {
            zzfwVar.f9047A.b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzfwVar.f9052F.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        zzmg zzmgVar = new zzmg();
        zzmgVar.f9262s = zzmeVarC;
        zzmgVar.f9263t = i11;
        zzmgVar.f9264u = zzfwVar;
        zzmgVar.f9265v = intent;
        zznc zzncVarH = zznc.h(zzmeVarC.a);
        zzncVarH.l().f1(new c(zzncVarH, 20, zzmgVar));
        return 2;
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
