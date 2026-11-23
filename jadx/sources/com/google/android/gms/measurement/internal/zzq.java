package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzpg;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends BroadcastReceiver {
    public final zzhj a;

    public zzq(zzhj zzhjVar) {
        this.a = zzhjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzhj zzhjVar = this.a;
        if (intent == null) {
            zzfw zzfwVar = zzhjVar.f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.b("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            zzfw zzfwVar2 = zzhjVar.f9115A;
            zzhj.g(zzfwVar2);
            zzfwVar2.f9047A.b("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            zzfw zzfwVar3 = zzhjVar.f9115A;
            zzhj.g(zzfwVar3);
            zzfwVar3.f9047A.b("App receiver called with unknown action");
            return;
        }
        zzpg.a();
        if (zzhjVar.f9146y.h1(null, zzbf.f8928A0)) {
            zzfw zzfwVar4 = zzhjVar.f9115A;
            zzhj.g(zzfwVar4);
            zzfwVar4.f9052F.b("App receiver notified triggers are available");
            zzhc zzhcVar = zzhjVar.f9116B;
            zzhj.g(zzhcVar);
            zzs zzsVar = new zzs();
            zzsVar.f9359s = zzhjVar;
            zzhcVar.f1(zzsVar);
        }
    }
}
