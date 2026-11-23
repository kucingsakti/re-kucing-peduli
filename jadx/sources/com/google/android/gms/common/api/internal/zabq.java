package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p212w.e;
import p212w.f;
import p224x2.l;
import p224x2.m;
import p224x2.o;
import p224x2.s;

/* JADX INFO: loaded from: classes.dex */
public final class zabq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Api.Client f7992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ApiKey f7993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zaad f7994e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zact f7998i;
    public boolean j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f8001m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList f7991b = new LinkedList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f7995f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f7996g = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f7999k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ConnectionResult f8000l = null;

    /* JADX WARN: Multi-variable type inference failed */
    public zabq(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        this.f8001m = googleApiManager;
        Looper looper = googleApiManager.f7910F.getLooper();
        ClientSettings.Builder builderB = googleApi.b();
        Account account = builderB.a;
        f fVar = builderB.f8083b;
        String str = builderB.f8084c;
        String str2 = builderB.f8085d;
        SignInOptions signInOptions = SignInOptions.f9365s;
        ClientSettings clientSettings = new ClientSettings(account, fVar, null, str, str2, signInOptions);
        Api.AbstractClientBuilder abstractClientBuilder = googleApi.f7852c.a;
        Preconditions.i(abstractClientBuilder);
        Api.Client clientA = abstractClientBuilder.a(googleApi.a, looper, clientSettings, googleApi.f7853d, this, this);
        String str3 = googleApi.f7851b;
        if (str3 != null && (clientA instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientA).P = str3;
        }
        if (str3 != null && (clientA instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) clientA).getClass();
        }
        this.f7992c = clientA;
        this.f7993d = googleApi.f7854e;
        this.f7994e = new zaad();
        this.f7997h = googleApi.f7855f;
        if (!clientA.s()) {
            this.f7998i = null;
            return;
        }
        Context context = googleApiManager.f7916w;
        com.google.android.gms.internal.base.zau zauVar = googleApiManager.f7910F;
        ClientSettings.Builder builderB2 = googleApi.b();
        this.f7998i = new zact(context, zauVar, new ClientSettings(builderB2.a, builderB2.f8083b, null, builderB2.f8084c, builderB2.f8085d, signInOptions));
    }

    public final void a(ConnectionResult connectionResult) {
        HashSet hashSet = this.f7995f;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        zal zalVar = (zal) it.next();
        if (Objects.a(connectionResult, ConnectionResult.f7820w)) {
            this.f7992c.m();
        }
        zalVar.getClass();
        throw null;
    }

    public final void b(Status status) {
        Preconditions.c(this.f8001m.f7910F);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z6) {
        Preconditions.c(this.f8001m.f7910F);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f7991b.iterator();
        while (it.hasNext()) {
            zai zaiVar = (zai) it.next();
            if (!z6 || zaiVar.a == 2) {
                if (status != null) {
                    zaiVar.a(status);
                } else {
                    zaiVar.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f7991b;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zai zaiVar = (zai) arrayList.get(i10);
            if (!this.f7992c.a()) {
                return;
            }
            if (h(zaiVar)) {
                linkedList.remove(zaiVar);
            }
        }
    }

    public final void e() {
        GoogleApiManager googleApiManager = this.f8001m;
        Preconditions.c(googleApiManager.f7910F);
        this.f8000l = null;
        a(ConnectionResult.f7820w);
        if (this.j) {
            com.google.android.gms.internal.base.zau zauVar = googleApiManager.f7910F;
            ApiKey apiKey = this.f7993d;
            zauVar.removeMessages(11, apiKey);
            googleApiManager.f7910F.removeMessages(9, apiKey);
            this.j = false;
        }
        Iterator it = this.f7996g.values().iterator();
        if (it.hasNext()) {
            ((zaci) it.next()).getClass();
            throw null;
        }
        d();
        g();
    }

    public final void f(int i10) {
        GoogleApiManager googleApiManager = this.f8001m;
        Preconditions.c(googleApiManager.f7910F);
        this.f8000l = null;
        this.j = true;
        String strO = this.f7992c.o();
        zaad zaadVar = this.f7994e;
        zaadVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strO != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strO);
        }
        zaadVar.a(true, new Status(20, sb.toString(), null, null));
        com.google.android.gms.internal.base.zau zauVar = googleApiManager.f7910F;
        ApiKey apiKey = this.f7993d;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, apiKey), 5000L);
        com.google.android.gms.internal.base.zau zauVar2 = googleApiManager.f7910F;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 11, apiKey), 120000L);
        googleApiManager.f7918y.a.clear();
        Iterator it = this.f7996g.values().iterator();
        if (it.hasNext()) {
            ((zaci) it.next()).getClass();
            throw null;
        }
    }

    public final void g() {
        GoogleApiManager googleApiManager = this.f8001m;
        com.google.android.gms.internal.base.zau zauVar = googleApiManager.f7910F;
        ApiKey apiKey = this.f7993d;
        zauVar.removeMessages(12, apiKey);
        com.google.android.gms.internal.base.zau zauVar2 = googleApiManager.f7910F;
        zauVar2.sendMessageDelayed(zauVar2.obtainMessage(12, apiKey), googleApiManager.f7912s);
    }

    public final boolean h(zai zaiVar) {
        Feature feature;
        if (zaiVar instanceof zac) {
            zac zacVar = (zac) zaiVar;
            Feature[] featureArrG = zacVar.g(this);
            if (featureArrG == null || featureArrG.length == 0) {
                feature = null;
                break;
            }
            Feature[] featureArrL = this.f7992c.l();
            if (featureArrL == null) {
                featureArrL = new Feature[0];
            }
            e eVar = new e(featureArrL.length);
            for (Feature feature2 : featureArrL) {
                eVar.put(feature2.f7828s, Long.valueOf(feature2.K()));
            }
            int length = featureArrG.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    feature = null;
                    break;
                }
                feature = featureArrG[i10];
                Long l4 = (Long) eVar.get(feature.f7828s);
                if (l4 == null || l4.longValue() < feature.K()) {
                    break;
                }
                i10++;
            }
            if (feature != null) {
                Log.w("GoogleApiManager", this.f7992c.getClass().getName() + " could not execute call because it requires feature (" + feature.f7828s + ", " + feature.K() + ").");
                if (!this.f8001m.f7911G || !zacVar.f(this)) {
                    zacVar.b(new UnsupportedApiCallException(feature));
                    return true;
                }
                m mVar = new m(this.f7993d, feature);
                int iIndexOf = this.f7999k.indexOf(mVar);
                if (iIndexOf >= 0) {
                    m mVar2 = (m) this.f7999k.get(iIndexOf);
                    this.f8001m.f7910F.removeMessages(15, mVar2);
                    com.google.android.gms.internal.base.zau zauVar = this.f8001m.f7910F;
                    zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, mVar2), 5000L);
                } else {
                    this.f7999k.add(mVar);
                    com.google.android.gms.internal.base.zau zauVar2 = this.f8001m.f7910F;
                    zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, mVar), 5000L);
                    com.google.android.gms.internal.base.zau zauVar3 = this.f8001m.f7910F;
                    zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, mVar), 120000L);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (!i(connectionResult)) {
                        this.f8001m.b(connectionResult, this.f7997h);
                    }
                }
                return false;
            }
            Api.Client client = this.f7992c;
            zaiVar.d(this.f7994e, client.s());
            try {
                zaiVar.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                client.f("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            Api.Client client2 = this.f7992c;
            zaiVar.d(this.f7994e, client2.s());
            try {
                zaiVar.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                client2.f("DeadObjectException thrown while running ApiCallRunner.");
            }
        }
        return true;
    }

    public final boolean i(ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.f7903J) {
            try {
                GoogleApiManager googleApiManager = this.f8001m;
                if (googleApiManager.f7907C != null && googleApiManager.f7908D.contains(this.f7993d)) {
                    zaae zaaeVar = this.f8001m.f7907C;
                    int i10 = this.f7997h;
                    zaaeVar.getClass();
                    new s(connectionResult, i10);
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j() {
        GoogleApiManager googleApiManager = this.f8001m;
        Preconditions.c(googleApiManager.f7910F);
        Api.Client client = this.f7992c;
        if (client.a() || client.j()) {
            return;
        }
        try {
            int iA = googleApiManager.f7918y.a(googleApiManager.f7916w, client);
            if (iA != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iA, null);
                Log.w("GoogleApiManager", "The service for " + client.getClass().getName() + " is not available: " + connectionResult.toString());
                l(connectionResult, null);
                return;
            }
            o oVar = new o(googleApiManager, client, this.f7993d);
            if (client.s()) {
                zact zactVar = this.f7998i;
                Preconditions.i(zactVar);
                com.google.android.gms.signin.zae zaeVar = zactVar.f8012g;
                if (zaeVar != null) {
                    zaeVar.q();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(zactVar));
                ClientSettings clientSettings = zactVar.f8011f;
                clientSettings.f8082h = numValueOf;
                com.google.android.gms.internal.base.zau zauVar = zactVar.f8008c;
                zactVar.f8012g = zactVar.f8009d.a(zactVar.f8007b, zauVar.getLooper(), clientSettings, clientSettings.f8081g, zactVar, zactVar);
                zactVar.f8013h = oVar;
                Set set = zactVar.f8010e;
                if (set == null || set.isEmpty()) {
                    zauVar.post(new p122m7.d(zactVar, 14));
                } else {
                    zactVar.f8012g.t();
                }
            }
            try {
                client.p(oVar);
            } catch (SecurityException e10) {
                l(new ConnectionResult(10), e10);
            }
        } catch (IllegalStateException e11) {
            l(new ConnectionResult(10), e11);
        }
    }

    public final void k(zai zaiVar) {
        Preconditions.c(this.f8001m.f7910F);
        boolean zA = this.f7992c.a();
        LinkedList linkedList = this.f7991b;
        if (zA) {
            if (h(zaiVar)) {
                g();
                return;
            } else {
                linkedList.add(zaiVar);
                return;
            }
        }
        linkedList.add(zaiVar);
        ConnectionResult connectionResult = this.f8000l;
        if (connectionResult == null || !connectionResult.K()) {
            j();
        } else {
            l(this.f8000l, null);
        }
    }

    public final void l(ConnectionResult connectionResult, RuntimeException runtimeException) {
        com.google.android.gms.signin.zae zaeVar;
        Preconditions.c(this.f8001m.f7910F);
        zact zactVar = this.f7998i;
        if (zactVar != null && (zaeVar = zactVar.f8012g) != null) {
            zaeVar.q();
        }
        Preconditions.c(this.f8001m.f7910F);
        this.f8000l = null;
        this.f8001m.f7918y.a.clear();
        a(connectionResult);
        if ((this.f7992c instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.f7822t != 24) {
            GoogleApiManager googleApiManager = this.f8001m;
            googleApiManager.f7913t = true;
            com.google.android.gms.internal.base.zau zauVar = googleApiManager.f7910F;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (connectionResult.f7822t == 4) {
            b(GoogleApiManager.f7902I);
            return;
        }
        if (this.f7991b.isEmpty()) {
            this.f8000l = connectionResult;
            return;
        }
        if (runtimeException != null) {
            Preconditions.c(this.f8001m.f7910F);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f8001m.f7911G) {
            b(GoogleApiManager.c(this.f7993d, connectionResult));
            return;
        }
        c(GoogleApiManager.c(this.f7993d, connectionResult), null, true);
        if (this.f7991b.isEmpty() || i(connectionResult) || this.f8001m.b(connectionResult, this.f7997h)) {
            return;
        }
        if (connectionResult.f7822t == 18) {
            this.j = true;
        }
        if (!this.j) {
            b(GoogleApiManager.c(this.f7993d, connectionResult));
            return;
        }
        GoogleApiManager googleApiManager2 = this.f8001m;
        ApiKey apiKey = this.f7993d;
        com.google.android.gms.internal.base.zau zauVar2 = googleApiManager2.f7910F;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, apiKey), 5000L);
    }

    public final void m(ConnectionResult connectionResult) {
        Preconditions.c(this.f8001m.f7910F);
        Api.Client client = this.f7992c;
        client.f("onSignInFailed for " + client.getClass().getName() + " with " + String.valueOf(connectionResult));
        l(connectionResult, null);
    }

    public final void n() {
        Preconditions.c(this.f8001m.f7910F);
        Status status = GoogleApiManager.f7901H;
        b(status);
        zaad zaadVar = this.f7994e;
        zaadVar.getClass();
        zaadVar.a(false, status);
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f7996g.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            k(new zah(listenerKey, new TaskCompletionSource()));
        }
        a(new ConnectionResult(4));
        Api.Client client = this.f7992c;
        if (client.a()) {
            client.e(new l(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        GoogleApiManager googleApiManager = this.f8001m;
        if (looperMyLooper == googleApiManager.f7910F.getLooper()) {
            e();
        } else {
            googleApiManager.f7910F.post(new p122m7.d(this, 13));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        l(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Looper looperMyLooper = Looper.myLooper();
        GoogleApiManager googleApiManager = this.f8001m;
        if (looperMyLooper == googleApiManager.f7910F.getLooper()) {
            f(i10);
        } else {
            googleApiManager.f7910F.post(new R.a(i10, 6, this));
        }
    }
}
