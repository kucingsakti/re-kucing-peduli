package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class zze implements ServiceConnection {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f8174t;

    public zze(BaseGmsClient baseGmsClient, int i10) {
        this.f8174t = baseGmsClient;
        this.f8173s = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BaseGmsClient baseGmsClient = this.f8174t;
        if (iBinder == null) {
            BaseGmsClient.E(baseGmsClient);
            return;
        }
        synchronized (baseGmsClient.f8050E) {
            try {
                BaseGmsClient baseGmsClient2 = this.f8174t;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                baseGmsClient2.f8051F = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new c(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        BaseGmsClient baseGmsClient3 = this.f8174t;
        int i10 = this.f8173s;
        baseGmsClient3.getClass();
        zzg zzgVar = new zzg(baseGmsClient3, 0);
        d dVar = baseGmsClient3.f8048C;
        dVar.sendMessage(dVar.obtainMessage(7, i10, -1, zzgVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient;
        synchronized (this.f8174t.f8050E) {
            baseGmsClient = this.f8174t;
            baseGmsClient.f8051F = null;
        }
        int i10 = this.f8173s;
        d dVar = baseGmsClient.f8048C;
        dVar.sendMessage(dVar.obtainMessage(6, i10, 1));
    }
}
