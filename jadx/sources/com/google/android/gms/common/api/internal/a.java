package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements zaca {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zabe f7922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zabi f7923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zabi f7924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f7925f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Api.Client f7927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bundle f7928i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ReentrantLock f7931m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f7926g = Collections.newSetFromMap(new WeakHashMap());
    public ConnectionResult j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ConnectionResult f7929k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7930l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7932n = 0;

    public a(Context context, zabe zabeVar, ReentrantLock reentrantLock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, e eVar, e eVar2, ClientSettings clientSettings, N2.a aVar, Api.Client client, ArrayList arrayList, ArrayList arrayList2, e eVar3, e eVar4) {
        this.f7921b = context;
        this.f7922c = zabeVar;
        this.f7931m = reentrantLock;
        this.f7927h = client;
        this.f7923d = new zabi(context, zabeVar, reentrantLock, looper, googleApiAvailabilityLight, eVar2, null, eVar4, null, arrayList2, new p102k7.e(this));
        this.f7924e = new zabi(context, zabeVar, reentrantLock, looper, googleApiAvailabilityLight, eVar, clientSettings, eVar3, aVar, arrayList, new p081i3.b(this, 23));
        e eVar5 = new e(0);
        Iterator it = ((p212w.b) eVar2.keySet()).iterator();
        while (it.hasNext()) {
            eVar5.put((Api.AnyClientKey) it.next(), this.f7923d);
        }
        Iterator it2 = ((p212w.b) eVar.keySet()).iterator();
        while (it2.hasNext()) {
            eVar5.put((Api.AnyClientKey) it2.next(), this.f7924e);
        }
        this.f7925f = Collections.unmodifiableMap(eVar5);
    }

    public static /* bridge */ /* synthetic */ void h(a aVar, int i10) {
        aVar.f7922c.t(i10);
        aVar.f7929k = null;
        aVar.j = null;
    }

    public static void i(a aVar) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        ConnectionResult connectionResult4 = aVar.j;
        boolean z6 = connectionResult4 != null && connectionResult4.T();
        zabi zabiVar = aVar.f7923d;
        if (!z6) {
            ConnectionResult connectionResult5 = aVar.j;
            zabi zabiVar2 = aVar.f7924e;
            if (connectionResult5 != null && (connectionResult2 = aVar.f7929k) != null && connectionResult2.T()) {
                zabiVar2.b();
                ConnectionResult connectionResult6 = aVar.j;
                Preconditions.i(connectionResult6);
                aVar.f(connectionResult6);
                return;
            }
            ConnectionResult connectionResult7 = aVar.j;
            if (connectionResult7 == null || (connectionResult = aVar.f7929k) == null) {
                return;
            }
            if (zabiVar2.f7988m < zabiVar.f7988m) {
                connectionResult7 = connectionResult;
            }
            aVar.f(connectionResult7);
            return;
        }
        ConnectionResult connectionResult8 = aVar.f7929k;
        if (!(connectionResult8 != null && connectionResult8.T()) && ((connectionResult3 = aVar.f7929k) == null || connectionResult3.f7822t != 4)) {
            if (connectionResult3 != null) {
                if (aVar.f7932n == 1) {
                    aVar.g();
                    return;
                } else {
                    aVar.f(connectionResult3);
                    zabiVar.b();
                    return;
                }
            }
            return;
        }
        int i10 = aVar.f7932n;
        if (i10 == 1) {
            aVar.g();
        } else if (i10 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
        } else {
            zabe zabeVar = aVar.f7922c;
            Preconditions.i(zabeVar);
            zabeVar.f(aVar.f7928i);
            aVar.g();
        }
        aVar.f7932n = 0;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void a() {
        this.f7932n = 2;
        this.f7930l = false;
        this.f7929k = null;
        this.j = null;
        this.f7923d.a();
        this.f7924e.a();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void b() {
        this.f7929k = null;
        this.j = null;
        this.f7932n = 0;
        this.f7923d.b();
        this.f7924e.b();
        g();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f7924e.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f7923d.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean d() {
        this.f7931m.lock();
        try {
            boolean z6 = false;
            if (this.f7923d.f7987l instanceof zaaj) {
                if (this.f7924e.f7987l instanceof zaaj) {
                    z6 = true;
                } else {
                    ConnectionResult connectionResult = this.f7929k;
                    if ((connectionResult != null && connectionResult.f7822t == 4) || this.f7932n == 1) {
                        z6 = true;
                    }
                }
            }
            return z6;
        } finally {
            this.f7931m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl e(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        PendingIntent activity;
        zabi zabiVar = (zabi) this.f7925f.get(null);
        Preconditions.j(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        if (!zabiVar.equals(this.f7924e)) {
            zabi zabiVar2 = this.f7923d;
            zabiVar2.getClass();
            apiMethodImpl.h();
            return zabiVar2.f7987l.g(apiMethodImpl);
        }
        ConnectionResult connectionResult = this.f7929k;
        if (connectionResult == null || connectionResult.f7822t != 4) {
            zabi zabiVar3 = this.f7924e;
            zabiVar3.getClass();
            apiMethodImpl.h();
            return zabiVar3.f7987l.g(apiMethodImpl);
        }
        Api.Client client = this.f7927h;
        if (client == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(this.f7921b, System.identityHashCode(this.f7922c), client.r(), com.google.android.gms.internal.base.zap.a | 134217728);
        }
        apiMethodImpl.k(new Status(4, null, activity, null));
        return apiMethodImpl;
    }

    public final void f(ConnectionResult connectionResult) {
        int i10 = this.f7932n;
        if (i10 == 1) {
            g();
        } else if (i10 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f7922c.o(connectionResult);
            g();
        }
        this.f7932n = 0;
    }

    public final void g() {
        Set set = this.f7926g;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((SignInConnectionListener) it.next()).a();
        }
        set.clear();
    }
}
