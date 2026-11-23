package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzkz implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zzkx f9248s;

    @Override // java.lang.Runnable
    public final void run() {
        zzkx zzkxVar = this.f9248s;
        zzfl zzflVar = zzkxVar.f9243v;
        if (zzflVar == null) {
            zzkxVar.i().f9056x.b("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzflVar.J(zzkxVar.p1(false));
            zzkxVar.o1();
        } catch (RemoteException e10) {
            zzkxVar.i().f9056x.a(e10, "Failed to send Dma consent settings to the service");
        }
    }
}
