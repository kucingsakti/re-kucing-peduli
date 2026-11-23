package p156q0;

import B6.d;
import N0.e;
import N0.f;
import N1.t;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.b;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.InterfaceC0514i;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements InterfaceC0514i, f, W {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f14277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final V f14278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d f14279u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0525u f14280v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t f14281w = null;

    public Q(b bVar, V v4, d dVar) {
        this.f14277s = bVar;
        this.f14278t = v4;
        this.f14279u = dVar;
    }

    @Override // N0.f
    public final e a() {
        c();
        return (e) this.f14281w.f3308d;
    }

    public final void b(EnumC0518m enumC0518m) {
        this.f14280v.d(enumC0518m);
    }

    public final void c() {
        if (this.f14280v == null) {
            this.f14280v = new C0525u(this);
            t tVar = new t(this);
            this.f14281w = tVar;
            tVar.e();
            this.f14279u.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0514i
    public final u0.b d() {
        Application application;
        b bVar = this.f14277s;
        Context applicationContext = bVar.X().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        u0.b bVar2 = new u0.b(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar2.f577s;
        if (application != null) {
            linkedHashMap.put(S.f6746z, application);
        }
        linkedHashMap.put(L.a, bVar);
        linkedHashMap.put(L.f6733b, this);
        Bundle bundle = bVar.f6656y;
        if (bundle != null) {
            linkedHashMap.put(L.f6734c, bundle);
        }
        return bVar2;
    }

    @Override // androidx.lifecycle.W
    public final V e() {
        c();
        return this.f14278t;
    }

    @Override // androidx.lifecycle.InterfaceC0523s
    public final C0525u g() {
        c();
        return this.f14280v;
    }
}
