package com.google.android.gms.measurement.internal;

import C3.c;
import M2.f0;
import M2.g0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;

/* JADX INFO: loaded from: classes.dex */
public final class zzlw implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f9250s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile zzft f9251t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzkx f9252u;

    public zzlw(zzkx zzkxVar) {
        this.f9252u = zzkxVar;
    }

    public final void a(Intent intent) {
        this.f9252u.W0();
        Context context = ((zzhj) this.f9252u.f577s).f9140s;
        ConnectionTracker connectionTrackerB = ConnectionTracker.b();
        synchronized (this) {
            try {
                if (this.f9250s) {
                    this.f9252u.i().f9052F.b("Connection attempt already in progress");
                    return;
                }
                this.f9252u.i().f9052F.b("Using local app measurement service");
                this.f9250s = true;
                connectionTrackerB.a(context, intent, this.f9252u.f9242u, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected() {
        Preconditions.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.i(this.f9251t);
                this.f9252u.l().f1(new f0(this, (zzfl) this.f9251t.A(), 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f9251t = null;
                this.f9250s = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.d("MeasurementServiceConnection.onConnectionFailed");
        zzfw zzfwVar = ((zzhj) this.f9252u.f577s).f9115A;
        if (zzfwVar == null || !zzfwVar.f2917t) {
            zzfwVar = null;
        }
        if (zzfwVar != null) {
            zzfwVar.f9047A.a(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.f9250s = false;
            this.f9251t = null;
        }
        this.f9252u.l().f1(new g0(this, 0));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Preconditions.d("MeasurementServiceConnection.onConnectionSuspended");
        zzkx zzkxVar = this.f9252u;
        zzkxVar.i().f9051E.b("Service connection suspended");
        zzkxVar.l().f1(new g0(this, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Preconditions.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f9250s = false;
                this.f9252u.i().f9056x.b("Service connected with null binder");
                return;
            }
            zzfl zzfnVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzfnVar = iInterfaceQueryLocalInterface instanceof zzfl ? (zzfl) iInterfaceQueryLocalInterface : new zzfn(iBinder);
                    this.f9252u.i().f9052F.b("Bound to IMeasurementService interface");
                } else {
                    this.f9252u.i().f9056x.a(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                this.f9252u.i().f9056x.b("Service connect failed to get IMeasurementService");
            }
            if (zzfnVar == null) {
                this.f9250s = false;
                try {
                    ConnectionTracker connectionTrackerB = ConnectionTracker.b();
                    zzkx zzkxVar = this.f9252u;
                    connectionTrackerB.c(((zzhj) zzkxVar.f577s).f9140s, zzkxVar.f9242u);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f9252u.l().f1(new f0(this, zzfnVar, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.d("MeasurementServiceConnection.onServiceDisconnected");
        zzkx zzkxVar = this.f9252u;
        zzkxVar.i().f9051E.b("Service disconnected");
        zzkxVar.l().f1(new c(this, componentName, 19, false));
    }
}
