package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class BlockingServiceConnection implements ServiceConnection {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7818s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedBlockingQueue f7819t = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Preconditions.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f7818s) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f7818s = true;
        IBinder iBinder = (IBinder) this.f7819t.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7819t.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
