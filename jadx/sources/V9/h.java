package V9;

import A0.m;
import N9.C0324g;
import N9.InterfaceC0323f;
import O3.y;
import S9.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5229b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5230c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5231d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5232e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5233f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;
    public final m a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i10) {
        if (i10 < 0 || i10 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i10;
        this.a = new m(this, 19);
    }

    public final void a(c cVar) {
        Object objA;
        C0324g c0324g;
        while (true) {
            int andDecrement = f5233f.getAndDecrement(this);
            if (andDecrement <= 1) {
                p076h8.m mVar = p076h8.m.a;
                C0324g c0324g2 = cVar.f5224s;
                d dVar = cVar.f5225t;
                if (andDecrement > 0) {
                    d.f5226g.set(dVar, null);
                    c0324g2.E(mVar, new b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5231d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f5232e.getAndIncrement(this);
                f fVar = f.f5227A;
                long j = andIncrement / ((long) i.f5238f);
                while (true) {
                    objA = S9.a.a(jVar, j, fVar);
                    if (S9.a.d(objA)) {
                        c0324g = c0324g2;
                        break;
                    }
                    s sVarB = S9.a.b(objA);
                    while (true) {
                        s sVar = (s) atomicReferenceFieldUpdater.get(this);
                        c0324g = c0324g2;
                        if (sVar.f4577u >= sVarB.f4577u) {
                            break;
                        }
                        if (!sVarB.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarB)) {
                                if (!sVar.e()) {
                                    break;
                                }
                                sVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == sVar);
                        if (sVarB.e()) {
                            sVarB.d();
                        }
                        c0324g2 = c0324g;
                    }
                    c0324g2 = c0324g;
                }
                j jVar2 = (j) S9.a.b(objA);
                int i10 = (int) (andIncrement % ((long) i.f5238f));
                AtomicReferenceArray atomicReferenceArray = jVar2.f5239w;
                do {
                    if (atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                        cVar.a(jVar2, i10);
                        return;
                    }
                } while (atomicReferenceArray.get(i10) == null);
                y yVar = i.f5234b;
                y yVar2 = i.f5235c;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i10, yVar, yVar2)) {
                        d.f5226g.set(dVar, null);
                        c0324g.E(mVar, new b(dVar, cVar, 0));
                        return;
                    } else {
                        C0324g c0324g3 = c0324g;
                        if (atomicReferenceArray.get(i10) != yVar) {
                            break;
                        } else {
                            c0324g = c0324g3;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    public final void b() {
        boolean z6;
        int i10;
        Object objA;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5233f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z6 = true;
            if (andIncrement >= 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5229b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f5230c.getAndIncrement(this);
            long j = andIncrement2 / ((long) i.f5238f);
            g gVar = g.f5228A;
            while (true) {
                objA = S9.a.a(jVar, j, gVar);
                if (!S9.a.d(objA)) {
                    s sVarB = S9.a.b(objA);
                    while (true) {
                        s sVar = (s) atomicReferenceFieldUpdater.get(this);
                        if (sVar.f4577u >= sVarB.f4577u) {
                            break;
                        }
                        if (!sVarB.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarB)) {
                                if (!sVar.e()) {
                                    break;
                                }
                                sVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == sVar);
                        if (sVarB.e()) {
                            sVarB.d();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) S9.a.b(objA);
            jVar2.a();
            boolean z10 = false;
            if (jVar2.f4577u > j) {
                z6 = false;
            } else {
                int i11 = (int) (andIncrement2 % ((long) i.f5238f));
                y yVar = i.f5234b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f5239w;
                Object andSet = atomicReferenceArray.getAndSet(i11, yVar);
                if (andSet == null) {
                    int i12 = i.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            y yVar2 = i.f5234b;
                            y yVar3 = i.f5236d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i11, yVar2, yVar3)) {
                                    z10 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i11) == yVar2);
                            z6 = true ^ z10;
                            break;
                        }
                        if (atomicReferenceArray.get(i11) == i.f5235c) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                } else if (andSet == i.f5237e) {
                    z6 = false;
                } else {
                    if (!(andSet instanceof InterfaceC0323f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0323f interfaceC0323f = (InterfaceC0323f) andSet;
                    y yVarF = interfaceC0323f.f(p076h8.m.a, this.a);
                    if (yVarF != null) {
                        interfaceC0323f.g(yVarF);
                    } else {
                        z6 = false;
                    }
                }
            }
        } while (!z6);
    }
}
