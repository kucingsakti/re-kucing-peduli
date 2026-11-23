package p144o8;

import N9.AbstractC0337u;
import N9.C0324g;
import S9.a;
import S9.g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p123m8.d;
import p123m8.e;
import p123m8.f;
import p123m8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {
    private final i _context;
    private transient d<Object> intercepted;

    public c(d dVar, i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // p123m8.d
    public i getContext() {
        i iVar = this._context;
        p210v8.i.c(iVar);
        return iVar;
    }

    public final d<Object> intercepted() {
        d<Object> dVar = this.intercepted;
        if (dVar != null) {
            return dVar;
        }
        f fVar = (f) getContext().get(e.f13163s);
        d<Object> gVar = fVar != null ? new g((AbstractC0337u) fVar, this) : this;
        this.intercepted = gVar;
        return gVar;
    }

    @Override // p144o8.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d<Object> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            p123m8.g gVar = getContext().get(e.f13163s);
            p210v8.i.c(gVar);
            g gVar2 = (g) dVar;
            do {
                atomicReferenceFieldUpdater = g.f4555z;
            } while (atomicReferenceFieldUpdater.get(gVar2) == a.f4549d);
            Object obj = atomicReferenceFieldUpdater.get(gVar2);
            C0324g c0324g = obj instanceof C0324g ? (C0324g) obj : null;
            if (c0324g != null) {
                c0324g.s();
            }
        }
        this.intercepted = b.f13826s;
    }

    public c(d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
