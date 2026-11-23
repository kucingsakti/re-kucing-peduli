package com.google.android.gms.measurement.internal;

import C3.c;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class zzgp implements ServiceConnection {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f9083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzgq f9084t;

    public zzgp(zzgq zzgqVar, String str) {
        this.f9084t = zzgqVar;
        this.f9083s = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzgq zzgqVar = this.f9084t;
        if (iBinder == null) {
            zzfw zzfwVar = zzgqVar.a.f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.b("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i10 = com.google.android.gms.internal.measurement.zzby.f8546b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            com.google.android.gms.internal.measurement.zzbz zzcaVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.zzbz ? (com.google.android.gms.internal.measurement.zzbz) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.zzca(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (zzcaVar == null) {
                zzfw zzfwVar2 = zzgqVar.a.f9115A;
                zzhj.g(zzfwVar2);
                zzfwVar2.f9047A.b("Install Referrer Service implementation was not found");
            } else {
                zzfw zzfwVar3 = zzgqVar.a.f9115A;
                zzhj.g(zzfwVar3);
                zzfwVar3.f9052F.b("Install Referrer Service connected");
                zzhc zzhcVar = zzgqVar.a.f9116B;
                zzhj.g(zzhcVar);
                zzhcVar.f1(new c(this, zzcaVar, this));
            }
        } catch (RuntimeException e10) {
            zzfw zzfwVar4 = zzgqVar.a.f9115A;
            zzhj.g(zzfwVar4);
            zzfwVar4.f9047A.a(e10, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfw zzfwVar = this.f9084t.a.f9115A;
        zzhj.g(zzfwVar);
        zzfwVar.f9052F.b("Install Referrer Service disconnected");
    }
}
