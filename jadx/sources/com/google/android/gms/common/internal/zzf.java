package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends p233y2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f8175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f8176h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i10, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i10, bundle);
        this.f8176h = baseGmsClient;
        this.f8175g = iBinder;
    }

    @Override // p233y2.b
    public final void d(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.f8176h;
        BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener = baseGmsClient.f8058M;
        if (baseOnConnectionFailedListener != null) {
            baseOnConnectionFailedListener.onConnectionFailed(connectionResult);
        }
        baseGmsClient.f8068v = connectionResult.f7822t;
        baseGmsClient.f8069w = System.currentTimeMillis();
    }

    @Override // p233y2.b
    public final boolean e() {
        IBinder iBinder = this.f8175g;
        try {
            Preconditions.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            BaseGmsClient baseGmsClient = this.f8176h;
            if (!baseGmsClient.B().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + baseGmsClient.B() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceV = baseGmsClient.v(iBinder);
            if (iInterfaceV == null || !(BaseGmsClient.F(baseGmsClient, 2, 4, iInterfaceV) || BaseGmsClient.F(baseGmsClient, 3, 4, iInterfaceV))) {
                return false;
            }
            baseGmsClient.f8061Q = null;
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = baseGmsClient.f8057L;
            if (baseConnectionCallbacks == null) {
                return true;
            }
            baseConnectionCallbacks.onConnected();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
