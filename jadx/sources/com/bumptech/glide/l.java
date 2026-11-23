package com.bumptech.glide;

import A1.RunnableC0094c;
import N1.n;
import N1.v;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ComponentCallbacks2, N1.i {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Q1.e f7629C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CopyOnWriteArrayList f7630A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Q1.e f7631B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f7632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f7633t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final N1.g f7634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p195u1.b f7635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f7636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v f7637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RunnableC0094c f7638y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final N1.c f7639z;

    static {
        Q1.e eVar = (Q1.e) new Q1.e().d(Bitmap.class);
        eVar.f3943D = true;
        f7629C = eVar;
        ((Q1.e) new Q1.e().d(L1.c.class)).f3943D = true;
    }

    public l(b bVar, N1.g gVar, n nVar, Context context) {
        Q1.e eVar;
        p195u1.b bVar2 = new p195u1.b(1);
        p170r3.e eVar2 = bVar.f7592x;
        this.f7637x = new v();
        RunnableC0094c runnableC0094c = new RunnableC0094c(this, 20);
        this.f7638y = runnableC0094c;
        this.f7632s = bVar;
        this.f7634u = gVar;
        this.f7636w = nVar;
        this.f7635v = bVar2;
        this.f7633t = context;
        Context applicationContext = context.getApplicationContext();
        k kVar = new k(this, bVar2);
        eVar2.getClass();
        boolean z6 = J.f.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        N1.c dVar = z6 ? new N1.d(applicationContext, kVar) : new N1.k();
        this.f7639z = dVar;
        if (U1.n.i()) {
            U1.n.f().post(runnableC0094c);
        } else {
            gVar.b(this);
        }
        gVar.b(dVar);
        this.f7630A = new CopyOnWriteArrayList(bVar.f7589u.f7598e);
        f fVar = bVar.f7589u;
        synchronized (fVar) {
            try {
                if (fVar.j == null) {
                    fVar.f7597d.getClass();
                    Q1.e eVar3 = new Q1.e();
                    eVar3.f3943D = true;
                    fVar.j = eVar3;
                }
                eVar = fVar.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        o(eVar);
        bVar.c(this);
    }

    @Override // N1.i
    public final synchronized void c() {
        m();
        this.f7637x.c();
    }

    @Override // N1.i
    public final synchronized void e() {
        n();
        this.f7637x.e();
    }

    @Override // N1.i
    public final synchronized void k() {
        try {
            this.f7637x.k();
            Iterator it = U1.n.e(this.f7637x.f3315s).iterator();
            while (it.hasNext()) {
                l((R1.c) it.next());
            }
            this.f7637x.f3315s.clear();
            p195u1.b bVar = this.f7635v;
            Iterator it2 = U1.n.e((Set) bVar.f15290u).iterator();
            while (it2.hasNext()) {
                bVar.b((Q1.c) it2.next());
            }
            ((HashSet) bVar.f15291v).clear();
            this.f7634u.l(this);
            this.f7634u.l(this.f7639z);
            U1.n.f().removeCallbacks(this.f7638y);
            this.f7632s.e(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(R1.c cVar) {
        if (cVar == null) {
            return;
        }
        boolean zP = p(cVar);
        Q1.c cVarI = cVar.i();
        if (zP) {
            return;
        }
        b bVar = this.f7632s;
        synchronized (bVar.f7593y) {
            try {
                Iterator it = bVar.f7593y.iterator();
                while (it.hasNext()) {
                    if (((l) it.next()).p(cVar)) {
                        return;
                    }
                }
                if (cVarI != null) {
                    cVar.f(null);
                    cVarI.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void m() {
        p195u1.b bVar = this.f7635v;
        bVar.f15289t = true;
        for (Q1.c cVar : U1.n.e((Set) bVar.f15290u)) {
            if (cVar.isRunning()) {
                cVar.pause();
                ((HashSet) bVar.f15291v).add(cVar);
            }
        }
    }

    public final synchronized void n() {
        p195u1.b bVar = this.f7635v;
        bVar.f15289t = false;
        for (Q1.c cVar : U1.n.e((Set) bVar.f15290u)) {
            if (!cVar.k() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        ((HashSet) bVar.f15291v).clear();
    }

    public final synchronized void o(Q1.e eVar) {
        Q1.e eVar2 = (Q1.e) eVar.clone();
        if (eVar2.f3943D && !eVar2.f3944E) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        eVar2.f3944E = true;
        eVar2.f3943D = true;
        this.f7631B = eVar2;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
    }

    public final synchronized boolean p(R1.c cVar) {
        Q1.c cVarI = cVar.i();
        if (cVarI == null) {
            return true;
        }
        if (!this.f7635v.b(cVarI)) {
            return false;
        }
        this.f7637x.f3315s.remove(cVar);
        cVar.f(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f7635v + ", treeNode=" + this.f7636w + "}";
    }
}
