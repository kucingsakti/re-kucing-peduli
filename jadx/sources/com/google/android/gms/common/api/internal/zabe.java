package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.datastore.preferences.protobuf.i0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import p212w.e;
import p224x2.h;
import p224x2.i;

/* JADX INFO: loaded from: classes.dex */
public final class zabe extends GoogleApiClient implements zabz {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile boolean f7956A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final h f7959D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final GoogleApiAvailability f7960E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public zabx f7961F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final e f7962G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ClientSettings f7964I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final e f7965J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final N2.a f7966K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ArrayList f7968M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Integer f7969N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final zadc f7970O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ReentrantLock f7971t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.google.android.gms.common.internal.zak f7972u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f7974w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f7975x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Looper f7976y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public zaca f7973v = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinkedList f7977z = new LinkedList();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f7957B = 120000;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f7958C = 5000;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Set f7963H = new HashSet();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ListenerHolders f7967L = new ListenerHolders();

    public zabe(Context context, ReentrantLock reentrantLock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, N2.a aVar, e eVar, ArrayList arrayList, ArrayList arrayList2, e eVar2, int i10, int i11, ArrayList arrayList3) {
        this.f7969N = null;
        p081i3.b bVar = new p081i3.b(this, 22);
        this.f7975x = context;
        this.f7971t = reentrantLock;
        this.f7972u = new com.google.android.gms.common.internal.zak(looper, bVar);
        this.f7976y = looper;
        this.f7959D = new h(this, looper, 0);
        this.f7960E = googleApiAvailability;
        this.f7974w = i10;
        if (i10 >= 0) {
            this.f7969N = Integer.valueOf(i11);
        }
        this.f7965J = eVar;
        this.f7962G = eVar2;
        this.f7968M = arrayList3;
        this.f7970O = new zadc();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
            com.google.android.gms.common.internal.zak zakVar = this.f7972u;
            zakVar.getClass();
            Preconditions.i(connectionCallbacks);
            synchronized (zakVar.f8141A) {
                try {
                    if (zakVar.f8143t.contains(connectionCallbacks)) {
                        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(connectionCallbacks) + " is already registered");
                    } else {
                        zakVar.f8143t.add(connectionCallbacks);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (((zabe) zakVar.f8142s.f12212t).a()) {
                com.google.android.gms.internal.base.zau zauVar = zakVar.f8149z;
                zauVar.sendMessage(zauVar.obtainMessage(1, connectionCallbacks));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.f7972u.a((GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.f7964I = clientSettings;
        this.f7966K = aVar;
    }

    public static int b(Collection collection, boolean z6) {
        Iterator it = collection.iterator();
        boolean zS = false;
        while (it.hasNext()) {
            zS |= ((Api.Client) it.next()).s();
        }
        return zS ? 1 : 3;
    }

    public static /* bridge */ /* synthetic */ void c(zabe zabeVar) {
        zabeVar.f7971t.lock();
        try {
            if (zabeVar.f7956A) {
                zabeVar.g();
            }
        } finally {
            zabeVar.f7971t.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean a() {
        zaca zacaVar = this.f7973v;
        return zacaVar != null && zacaVar.d();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        ReentrantLock reentrantLock = this.f7971t;
        reentrantLock.lock();
        try {
            int i10 = 2;
            boolean z6 = false;
            if (this.f7974w >= 0) {
                Preconditions.k("Sign-in mode should have been set explicitly by auto-manage.", this.f7969N != null);
            } else {
                Integer num = this.f7969N;
                if (num == null) {
                    this.f7969N = Integer.valueOf(b(this.f7962G.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f7969N;
            Preconditions.i(num2);
            int iIntValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i10 = iIntValue;
                    }
                    Preconditions.a("Illegal sign-in mode: " + i10, z6);
                    e(i10);
                    g();
                    reentrantLock.unlock();
                    return;
                }
                i10 = iIntValue;
                Preconditions.a("Illegal sign-in mode: " + i10, z6);
                e(i10);
                g();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z6 = true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean d() {
        if (!this.f7956A) {
            return false;
        }
        this.f7956A = false;
        this.f7959D.removeMessages(2);
        this.f7959D.removeMessages(1);
        zabx zabxVar = this.f7961F;
        if (zabxVar != null) {
            zabxVar.a();
            this.f7961F = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        ReentrantLock reentrantLock = this.f7971t;
        reentrantLock.lock();
        try {
            this.f7970O.a();
            zaca zacaVar = this.f7973v;
            if (zacaVar != null) {
                zacaVar.b();
            }
            Set set = this.f7967L.a;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((ListenerHolder) it.next()).getClass();
            }
            set.clear();
            LinkedList<BaseImplementation.ApiMethodImpl> linkedList = this.f7977z;
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : linkedList) {
                apiMethodImpl.f7896e.set(null);
                apiMethodImpl.a();
            }
            linkedList.clear();
            if (this.f7973v != null) {
                d();
                com.google.android.gms.common.internal.zak zakVar = this.f7972u;
                zakVar.f8146w = false;
                zakVar.f8147x.incrementAndGet();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(int i10) {
        String str;
        Integer num = this.f7969N;
        if (num == null) {
            this.f7969N = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            int iIntValue = this.f7969N.intValue();
            String str2 = "SIGN_IN_MODE_REQUIRED";
            if (iIntValue == 1) {
                str = "SIGN_IN_MODE_REQUIRED";
            } else if (iIntValue != 2) {
                str = iIntValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
            } else {
                str = "SIGN_IN_MODE_OPTIONAL";
            }
            StringBuilder sb = new StringBuilder("Cannot use sign-in mode: ");
            if (i10 != 1) {
                str2 = i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL";
            }
            sb.append(str2);
            sb.append(". Mode was already set to ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f7973v != null) {
            return;
        }
        e eVar = this.f7962G;
        Iterator it = ((p212w.d) eVar.values()).iterator();
        boolean zS = false;
        while (it.hasNext()) {
            zS |= ((Api.Client) it.next()).s();
        }
        int iIntValue2 = this.f7969N.intValue();
        ReentrantLock reentrantLock = this.f7971t;
        ArrayList arrayList = this.f7968M;
        e eVar2 = this.f7965J;
        if (iIntValue2 != 1) {
            if (iIntValue2 == 2 && zS) {
                e eVar3 = new e(0);
                e eVar4 = new e(0);
                for (Map.Entry entry : (i0) eVar.entrySet()) {
                    Api.Client client = (Api.Client) entry.getValue();
                    client.getClass();
                    if (client.s()) {
                        eVar3.put((Api.AnyClientKey) entry.getKey(), client);
                    } else {
                        eVar4.put((Api.AnyClientKey) entry.getKey(), client);
                    }
                }
                Preconditions.k("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !eVar3.isEmpty());
                e eVar5 = new e(0);
                e eVar6 = new e(0);
                for (Api api : (p212w.b) eVar2.keySet()) {
                    Api.ClientKey clientKey = api.f7847b;
                    if (eVar3.containsKey(clientKey)) {
                        eVar5.put(api, (Boolean) eVar2.get(api));
                    } else {
                        if (!eVar4.containsKey(clientKey)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        eVar6.put(api, (Boolean) eVar2.get(api));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    zat zatVar = (zat) arrayList.get(i11);
                    if (eVar5.containsKey(zatVar.f8021b)) {
                        arrayList2.add(zatVar);
                    } else {
                        if (!eVar6.containsKey(zatVar.f8021b)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(zatVar);
                    }
                }
                this.f7973v = new a(this.f7975x, this, reentrantLock, this.f7976y, this.f7960E, eVar3, eVar4, this.f7964I, this.f7966K, null, arrayList2, arrayList3, eVar5, eVar6);
                return;
            }
        } else {
            if (!zS) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            eVar = eVar;
        }
        this.f7973v = new zabi(this.f7975x, this, reentrantLock, this.f7976y, this.f7960E, eVar, this.f7964I, eVar2, this.f7966K, arrayList, this);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void f(Bundle bundle) {
        while (!this.f7977z.isEmpty()) {
            BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) this.f7977z.remove();
            e eVar = this.f7962G;
            apiMethodImpl.getClass();
            Preconditions.a("GoogleApiClient is not configured to use the API required for this call.", eVar.containsKey(null));
            this.f7971t.lock();
            try {
                zaca zacaVar = this.f7973v;
                if (zacaVar == null) {
                    throw new IllegalStateException("GoogleApiClient is not connected yet.");
                }
                if (this.f7956A) {
                    this.f7977z.add(apiMethodImpl);
                    while (!this.f7977z.isEmpty()) {
                        BaseImplementation.ApiMethodImpl apiMethodImpl2 = (BaseImplementation.ApiMethodImpl) this.f7977z.remove();
                        zadc zadcVar = this.f7970O;
                        zadcVar.a.add(apiMethodImpl2);
                        apiMethodImpl2.f7896e.set(zadcVar.f8015b);
                        apiMethodImpl2.k(Status.f7877x);
                    }
                } else {
                    zacaVar.e(apiMethodImpl);
                }
                this.f7971t.unlock();
            } catch (Throwable th) {
                this.f7971t.unlock();
                throw th;
            }
        }
        com.google.android.gms.common.internal.zak zakVar = this.f7972u;
        if (Looper.myLooper() != zakVar.f8149z.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (zakVar.f8141A) {
            try {
                Preconditions.l(!zakVar.f8148y);
                zakVar.f8149z.removeMessages(1);
                zakVar.f8148y = true;
                Preconditions.l(zakVar.f8144u.isEmpty());
                ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList = new ArrayList(zakVar.f8143t);
                int i10 = zakVar.f8147x.get();
                for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                    if (!zakVar.f8146w || !((zabe) zakVar.f8142s.f12212t).a() || zakVar.f8147x.get() != i10) {
                        break;
                        break;
                        break;
                    } else if (!zakVar.f8144u.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnected(bundle);
                    }
                }
                zakVar.f8144u.clear();
                zakVar.f8148y = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        this.f7972u.f8146w = true;
        zaca zacaVar = this.f7973v;
        Preconditions.i(zacaVar);
        zacaVar.a();
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void o(ConnectionResult connectionResult) {
        GoogleApiAvailability googleApiAvailability = this.f7960E;
        Context context = this.f7975x;
        int i10 = connectionResult.f7822t;
        googleApiAvailability.getClass();
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
        if (!(i10 == 18 ? true : i10 == 1 ? GooglePlayServicesUtilLight.b(context) : false)) {
            d();
        }
        if (this.f7956A) {
            return;
        }
        com.google.android.gms.common.internal.zak zakVar = this.f7972u;
        if (Looper.myLooper() != zakVar.f8149z.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        zakVar.f8149z.removeMessages(1);
        synchronized (zakVar.f8141A) {
            try {
                ArrayList<GoogleApiClient.OnConnectionFailedListener> arrayList = new ArrayList(zakVar.f8145v);
                int i11 = zakVar.f8147x.get();
                for (GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener : arrayList) {
                    if (zakVar.f8146w && zakVar.f8147x.get() == i11) {
                        if (zakVar.f8145v.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.onConnectionFailed(connectionResult);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.zak zakVar2 = this.f7972u;
        zakVar2.f8146w = false;
        zakVar2.f8147x.incrementAndGet();
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void t(int i10) {
        if (i10 == 1) {
            if (!this.f7956A) {
                this.f7956A = true;
                if (this.f7961F == null) {
                    try {
                        GoogleApiAvailability googleApiAvailability = this.f7960E;
                        Context applicationContext = this.f7975x.getApplicationContext();
                        i iVar = new i(this);
                        googleApiAvailability.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        zabx zabxVar = new zabx(iVar);
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 33) {
                            applicationContext.registerReceiver(zabxVar, intentFilter, i11 >= 33 ? 2 : 0);
                        } else {
                            applicationContext.registerReceiver(zabxVar, intentFilter);
                        }
                        zabxVar.a = applicationContext;
                        if (!GooglePlayServicesUtilLight.b(applicationContext)) {
                            iVar.a();
                            zabxVar.a();
                            zabxVar = null;
                        }
                        this.f7961F = zabxVar;
                    } catch (SecurityException unused) {
                    }
                }
                h hVar = this.f7959D;
                hVar.sendMessageDelayed(hVar.obtainMessage(1), this.f7957B);
                h hVar2 = this.f7959D;
                hVar2.sendMessageDelayed(hVar2.obtainMessage(2), this.f7958C);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f7970O.a.toArray(new BasePendingResult[0])) {
            basePendingResult.c(zadc.f8014c);
        }
        com.google.android.gms.common.internal.zak zakVar = this.f7972u;
        if (Looper.myLooper() != zakVar.f8149z.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        zakVar.f8149z.removeMessages(1);
        synchronized (zakVar.f8141A) {
            try {
                zakVar.f8148y = true;
                ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList = new ArrayList(zakVar.f8143t);
                int i12 = zakVar.f8147x.get();
                for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                    if (!zakVar.f8146w || zakVar.f8147x.get() != i12) {
                        break;
                        break;
                    } else if (zakVar.f8143t.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnectionSuspended(i10);
                    }
                }
                zakVar.f8144u.clear();
                zakVar.f8148y = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.zak zakVar2 = this.f7972u;
        zakVar2.f8146w = false;
        zakVar2.f8147x.incrementAndGet();
        if (i10 == 2) {
            g();
        }
    }
}
