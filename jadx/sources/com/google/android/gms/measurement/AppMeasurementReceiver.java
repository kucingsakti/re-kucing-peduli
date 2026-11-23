package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzhj;
import p187t0.a;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements zzgr.zza {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zzgr f8879u;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f8879u == null) {
            this.f8879u = new zzgr(this);
        }
        zzgr zzgrVar = this.f8879u;
        zzgrVar.getClass();
        zzfw zzfwVar = zzhj.c(context, null, null).f9115A;
        zzhj.g(zzfwVar);
        zzfy zzfyVar = zzfwVar.f9047A;
        if (intent == null) {
            zzfyVar.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzfy zzfyVar2 = zzfwVar.f9052F;
        zzfyVar2.a(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzfyVar.b("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        zzfyVar2.b("Starting wakeful intent.");
        zzgrVar.a.getClass();
        SparseArray sparseArray = a.f14965s;
        synchronized (sparseArray) {
            try {
                int i10 = a.f14966t;
                int i11 = i10 + 1;
                a.f14966t = i11;
                if (i11 <= 0) {
                    a.f14966t = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i10);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i10, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
