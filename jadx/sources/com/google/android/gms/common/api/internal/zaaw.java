package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import p212w.e;
import p224x2.g;

/* JADX INFO: loaded from: classes.dex */
public final class zaaw implements zabf {
    public final zabi a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f7937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f7939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConnectionResult f7940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7941f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7943h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.google.android.gms.signin.zae f7945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IAccountAccessor f7949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ClientSettings f7952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f7953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final N2.a f7954t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7942g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f7944i = new Bundle();
    public final HashSet j = new HashSet();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f7955u = new ArrayList();

    public zaaw(zabi zabiVar, ClientSettings clientSettings, e eVar, GoogleApiAvailabilityLight googleApiAvailabilityLight, N2.a aVar, ReentrantLock reentrantLock, Context context) {
        this.a = zabiVar;
        this.f7952r = clientSettings;
        this.f7953s = eVar;
        this.f7939d = googleApiAvailabilityLight;
        this.f7954t = aVar;
        this.f7937b = reentrantLock;
        this.f7938c = context;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void a(Bundle bundle) {
        if (n(1)) {
            if (bundle != null) {
                this.f7944i.putAll(bundle);
            }
            if (o()) {
                j();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void b(ConnectionResult connectionResult, Api api, boolean z6) {
        if (n(1)) {
            l(connectionResult, api, z6);
            if (o()) {
                j();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void c(int i10) {
        k(new ConnectionResult(8, null));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @Override // com.google.android.gms.common.api.internal.zabf
    public final void d() {
        e eVar;
        zabi zabiVar = this.a;
        zabiVar.f7984h.clear();
        this.f7947m = false;
        this.f7940e = null;
        this.f7942g = 0;
        this.f7946l = true;
        this.f7948n = false;
        this.f7950p = false;
        HashMap map = new HashMap();
        e eVar2 = this.f7953s;
        Iterator it = ((p212w.b) eVar2.keySet()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            eVar = zabiVar.f7983g;
            if (!zHasNext) {
                break;
            }
            Api api = (Api) it.next();
            Api.Client client = (Api.Client) eVar.get(api.f7847b);
            Preconditions.i(client);
            Api.Client client2 = client;
            api.a.getClass();
            boolean zBooleanValue = ((Boolean) eVar2.get(api)).booleanValue();
            if (client2.s()) {
                this.f7947m = true;
                if (zBooleanValue) {
                    this.j.add(api.f7847b);
                } else {
                    this.f7946l = false;
                }
            }
            map.put(client2, new p224x2.a(this, api, zBooleanValue));
        }
        if (this.f7947m) {
            ClientSettings clientSettings = this.f7952r;
            Preconditions.i(clientSettings);
            Preconditions.i(this.f7954t);
            zabe zabeVar = zabiVar.f7989n;
            clientSettings.f8082h = Integer.valueOf(System.identityHashCode(zabeVar));
            g gVar = new g(this);
            this.f7945k = this.f7954t.a(this.f7938c, zabeVar.f7976y, clientSettings, clientSettings.f8081g, gVar, gVar);
        }
        this.f7943h = eVar.f15506u;
        this.f7955u.add(zabj.a.submit(new p224x2.d(this, map)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void e() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean f() {
        ArrayList arrayList = this.f7955u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        i(true);
        this.a.f();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl g(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void h() {
        this.f7947m = false;
        zabi zabiVar = this.a;
        zabiVar.f7989n.f7963H = Collections.EMPTY_SET;
        for (Api.AnyClientKey anyClientKey : this.j) {
            HashMap map = zabiVar.f7984h;
            if (!map.containsKey(anyClientKey)) {
                map.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    public final void i(boolean z6) {
        com.google.android.gms.signin.zae zaeVar = this.f7945k;
        if (zaeVar != null) {
            if (zaeVar.a() && z6) {
                zaeVar.h();
            }
            zaeVar.q();
            Preconditions.i(this.f7952r);
            this.f7949o = null;
        }
    }

    public final void j() {
        zabi zabiVar = this.a;
        zabiVar.f7978b.lock();
        try {
            zabiVar.f7989n.d();
            zabiVar.f7987l = new zaaj(zabiVar);
            zabiVar.f7987l.d();
            zabiVar.f7979c.signalAll();
            zabiVar.f7978b.unlock();
            zabj.a.execute(new p122m7.d(this, 12));
            com.google.android.gms.signin.zae zaeVar = this.f7945k;
            if (zaeVar != null) {
                if (this.f7950p) {
                    IAccountAccessor iAccountAccessor = this.f7949o;
                    Preconditions.i(iAccountAccessor);
                    zaeVar.n(iAccountAccessor, this.f7951q);
                }
                i(false);
            }
            Iterator it = this.a.f7984h.keySet().iterator();
            while (it.hasNext()) {
                Api.Client client = (Api.Client) this.a.f7983g.get((Api.AnyClientKey) it.next());
                Preconditions.i(client);
                client.q();
            }
            this.a.f7990o.f(this.f7944i.isEmpty() ? null : this.f7944i);
        } catch (Throwable th) {
            zabiVar.f7978b.unlock();
            throw th;
        }
    }

    public final void k(ConnectionResult connectionResult) {
        ArrayList arrayList = this.f7955u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        i(!connectionResult.K());
        zabi zabiVar = this.a;
        zabiVar.f();
        zabiVar.f7990o.o(connectionResult);
    }

    public final void l(ConnectionResult connectionResult, Api api, boolean z6) {
        api.a.getClass();
        if ((!z6 || connectionResult.K() || this.f7939d.a(connectionResult.f7822t, null, null) != null) && (this.f7940e == null || Integer.MAX_VALUE < this.f7941f)) {
            this.f7940e = connectionResult;
            this.f7941f = Integer.MAX_VALUE;
        }
        this.a.f7984h.put(api.f7847b, connectionResult);
    }

    public final void m() {
        if (this.f7943h != 0) {
            return;
        }
        if (!this.f7947m || this.f7948n) {
            ArrayList arrayList = new ArrayList();
            this.f7942g = 1;
            zabi zabiVar = this.a;
            e eVar = zabiVar.f7983g;
            this.f7943h = eVar.f15506u;
            for (Api.AnyClientKey anyClientKey : (p212w.b) eVar.keySet()) {
                if (!zabiVar.f7984h.containsKey(anyClientKey)) {
                    arrayList.add((Api.Client) zabiVar.f7983g.get(anyClientKey));
                } else if (o()) {
                    j();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f7955u.add(zabj.a.submit(new p224x2.e(this, arrayList)));
        }
    }

    public final boolean n(int i10) {
        if (this.f7942g == i10) {
            return true;
        }
        zabe zabeVar = this.a.f7989n;
        zabeVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(zabeVar.f7975x);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(zabeVar.f7956A);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(zabeVar.f7977z.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(zabeVar.f7970O.a.size());
        zaca zacaVar = zabeVar.f7973v;
        if (zacaVar != null) {
            zacaVar.c("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.f7943h);
        new Exception();
        k(new ConnectionResult(8, null));
        return false;
    }

    public final boolean o() {
        int i10 = this.f7943h - 1;
        this.f7943h = i10;
        if (i10 > 0) {
            return false;
        }
        zabi zabiVar = this.a;
        if (i10 >= 0) {
            ConnectionResult connectionResult = this.f7940e;
            if (connectionResult == null) {
                return true;
            }
            zabiVar.f7988m = this.f7941f;
            k(connectionResult);
            return false;
        }
        zabe zabeVar = zabiVar.f7989n;
        zabeVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(zabeVar.f7975x);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(zabeVar.f7956A);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(zabeVar.f7977z.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(zabeVar.f7970O.a.size());
        zaca zacaVar = zabeVar.f7973v;
        if (zacaVar != null) {
            zacaVar.c("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        k(new ConnectionResult(8, null));
        return false;
    }
}
