package A1;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class x implements V1.b {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final K3.d f182O = new K3.d(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final D1.e f183A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AtomicInteger f184B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public y f185C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f186D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f187E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public F f188F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f189G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f190H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public GlideException f191I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f192J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public z f193K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public n f194L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public volatile boolean f195M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f196N;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w f197s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final V1.e f198t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t f199u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0099h f200v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K3.d f201w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f202x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final D1.e f203y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final D1.e f204z;

    public x(D1.e eVar, D1.e eVar2, D1.e eVar3, D1.e eVar4, t tVar, t tVar2, C0099h c0099h) {
        K3.d dVar = f182O;
        this.f197s = new w(new ArrayList(2));
        this.f198t = new V1.e();
        this.f184B = new AtomicInteger();
        this.f203y = eVar;
        this.f204z = eVar2;
        this.f183A = eVar4;
        this.f202x = tVar;
        this.f199u = tVar2;
        this.f200v = c0099h;
        this.f201w = dVar;
    }

    public final synchronized void a(Q1.f fVar, F3.c cVar) {
        try {
            this.f198t.a();
            w wVar = this.f197s;
            wVar.getClass();
            wVar.f181s.add(new v(fVar, cVar));
            if (this.f190H) {
                d(1);
                u uVar = new u(this, fVar, 1);
                cVar.getClass();
                U1.n.k(uVar);
            } else if (this.f192J) {
                d(1);
                u uVar2 = new u(this, fVar, 0);
                cVar.getClass();
                U1.n.k(uVar2);
            } else {
                U1.f.a("Cannot add callbacks to a cancelled EngineJob", !this.f195M);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (e()) {
            return;
        }
        this.f195M = true;
        n nVar = this.f194L;
        nVar.f142R = true;
        InterfaceC0101j interfaceC0101j = nVar.P;
        if (interfaceC0101j != null) {
            interfaceC0101j.cancel();
        }
        t tVar = this.f202x;
        y yVar = this.f185C;
        synchronized (tVar) {
            C c10 = tVar.a;
            c10.getClass();
            HashMap map = c10.a;
            if (equals(map.get(yVar))) {
                map.remove(yVar);
            }
        }
    }

    public final void c() {
        z zVar;
        synchronized (this) {
            try {
                this.f198t.a();
                U1.f.a("Not yet complete!", e());
                int iDecrementAndGet = this.f184B.decrementAndGet();
                U1.f.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    zVar = this.f193K;
                    i();
                } else {
                    zVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zVar != null) {
            zVar.e();
        }
    }

    public final synchronized void d(int i10) {
        z zVar;
        U1.f.a("Not yet complete!", e());
        if (this.f184B.getAndAdd(i10) == 0 && (zVar = this.f193K) != null) {
            zVar.d();
        }
    }

    public final boolean e() {
        return this.f192J || this.f190H || this.f195M;
    }

    public final void f() {
        synchronized (this) {
            try {
                this.f198t.a();
                if (this.f195M) {
                    i();
                    return;
                }
                if (this.f197s.f181s.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f192J) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f192J = true;
                y yVar = this.f185C;
                w wVar = this.f197s;
                wVar.getClass();
                ArrayList<v> arrayList = new ArrayList(wVar.f181s);
                d(arrayList.size() + 1);
                this.f202x.d(this, yVar, null);
                for (v vVar : arrayList) {
                    vVar.f180b.execute(new u(this, vVar.a, 0));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V1.b
    public final V1.e g() {
        return this.f198t;
    }

    public final void h() {
        synchronized (this) {
            try {
                this.f198t.a();
                if (this.f195M) {
                    this.f188F.c();
                    i();
                    return;
                }
                if (this.f197s.f181s.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f190H) {
                    throw new IllegalStateException("Already have resource");
                }
                K3.d dVar = this.f201w;
                F f10 = this.f188F;
                boolean z6 = this.f186D;
                y yVar = this.f185C;
                t tVar = this.f199u;
                dVar.getClass();
                this.f193K = new z(f10, z6, true, yVar, tVar);
                this.f190H = true;
                w wVar = this.f197s;
                wVar.getClass();
                ArrayList<v> arrayList = new ArrayList(wVar.f181s);
                d(arrayList.size() + 1);
                this.f202x.d(this, this.f185C, this.f193K);
                for (v vVar : arrayList) {
                    vVar.f180b.execute(new u(this, vVar.a, 1));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        if (this.f185C == null) {
            throw new IllegalArgumentException();
        }
        this.f197s.f181s.clear();
        this.f185C = null;
        this.f193K = null;
        this.f188F = null;
        this.f192J = false;
        this.f195M = false;
        this.f190H = false;
        this.f196N = false;
        this.f194L.v();
        this.f194L = null;
        this.f191I = null;
        this.f189G = 0;
        this.f200v.q(this);
    }

    public final synchronized void j(Q1.f fVar) {
        try {
            this.f198t.a();
            w wVar = this.f197s;
            wVar.f181s.remove(new v(fVar, U1.f.f4873b));
            if (this.f197s.f181s.isEmpty()) {
                b();
                if (this.f190H || this.f192J) {
                    if (this.f184B.get() == 0) {
                        i();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(n nVar) {
        D1.e eVar;
        this.f194L = nVar;
        int iR = nVar.r(1);
        if (iR == 2 || iR == 3) {
            eVar = this.f203y;
        } else {
            eVar = this.f187E ? this.f183A : this.f204z;
        }
        eVar.execute(nVar);
    }
}
