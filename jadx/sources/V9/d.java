package V9;

import N9.AbstractC0342z;
import N9.C0324g;
import O3.y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5226g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z6) {
        super(z6 ? 1 : 0);
        this.owner = z6 ? null : e.a;
    }

    public final boolean c() {
        return Math.max(h.f5233f.get(this), 0) == 0;
    }

    public final Object d(p144o8.c cVar) {
        int i10;
        char c10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f5233f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                if (i11 <= 0) {
                    c10 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f5226g.set(this, null);
                    c10 = 0;
                    break;
                }
            }
        }
        m mVar = m.a;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    throw new IllegalStateException("unexpected");
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
            C0324g c0324gK = AbstractC0342z.k(qa.b.q(cVar));
            try {
                a(new c(this, c0324gK));
                Object objV = c0324gK.v();
                p134n8.a aVar = p134n8.a.f13404s;
                if (objV != aVar) {
                    objV = mVar;
                }
                if (objV == aVar) {
                    return objV;
                }
            } catch (Throwable th) {
                c0324gK.D();
                throw th;
            }
        }
        return mVar;
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5226g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            y yVar = e.a;
            if (obj2 != yVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, yVar)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + AbstractC0342z.j(this) + "[isLocked=" + c() + ",owner=" + f5226g.get(this) + ']';
    }
}
