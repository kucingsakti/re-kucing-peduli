package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p212w.e;
import p224x2.h;

/* JADX INFO: loaded from: classes.dex */
public final class zabi implements zaca, zau {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f7978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Condition f7979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f7980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f7981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f7982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f7983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f7984h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ClientSettings f7985i;
    public final e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N2.a f7986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile zabf f7987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zabe f7989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final zabz f7990o;

    public zabi(Context context, zabe zabeVar, ReentrantLock reentrantLock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, e eVar, ClientSettings clientSettings, e eVar2, N2.a aVar, ArrayList arrayList, zabz zabzVar) {
        this.f7980d = context;
        this.f7978b = reentrantLock;
        this.f7981e = googleApiAvailabilityLight;
        this.f7983g = eVar;
        this.f7985i = clientSettings;
        this.j = eVar2;
        this.f7986k = aVar;
        this.f7989n = zabeVar;
        this.f7990o = zabzVar;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zat) arrayList.get(i10)).f8023d = this;
        }
        this.f7982f = new h(this, looper, 1);
        this.f7979c = reentrantLock.newCondition();
        this.f7987l = new zaax(this);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void a() {
        this.f7987l.e();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void b() {
        if (this.f7987l.f()) {
            this.f7984h.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f7987l);
        for (Api api : (p212w.b) this.j.keySet()) {
            String strValueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) api.f7848c).println(":");
            Api.Client client = (Api.Client) this.f7983g.get(api.f7847b);
            Preconditions.i(client);
            client.k(strValueOf.concat("  "), printWriter);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean d() {
        return this.f7987l instanceof zaaj;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl e(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.h();
        return this.f7987l.g(apiMethodImpl);
    }

    public final void f() {
        this.f7978b.lock();
        try {
            this.f7987l = new zaax(this);
            this.f7987l.d();
            this.f7979c.signalAll();
        } finally {
            this.f7978b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f7978b.lock();
        try {
            this.f7987l.a(bundle);
        } finally {
            this.f7978b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.f7978b.lock();
        try {
            this.f7987l.c(i10);
        } finally {
            this.f7978b.unlock();
        }
    }
}
