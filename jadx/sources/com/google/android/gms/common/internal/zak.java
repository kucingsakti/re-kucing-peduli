package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zabe;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zak implements Handler.Callback {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p081i3.b f8142s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.google.android.gms.internal.base.zau f8149z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f8143t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f8144u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f8145v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f8146w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicInteger f8147x = new AtomicInteger(0);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8148y = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f8141A = new Object();

    public zak(Looper looper, p081i3.b bVar) {
        this.f8142s = bVar;
        this.f8149z = new com.google.android.gms.internal.base.zau(looper, this);
    }

    public final void a(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.i(onConnectionFailedListener);
        synchronized (this.f8141A) {
            try {
                if (this.f8145v.contains(onConnectionFailedListener)) {
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(onConnectionFailedListener) + " is already registered");
                } else {
                    this.f8145v.add(onConnectionFailedListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.wtf("GmsClientEvents", AbstractC0487g.g(i10, "Don't know how to handle message: "), new Exception());
            return false;
        }
        GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
        synchronized (this.f8141A) {
            try {
                if (this.f8146w && ((zabe) this.f8142s.f12212t).a() && this.f8143t.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
