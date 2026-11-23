package K9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, p219w8.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Iterator f2679t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f2681v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f2682w;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2678s = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2680u = -1;

    public f(g gVar) {
        this.f2682w = gVar;
        this.f2679t = gVar.a.iterator();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, u8.b] */
    public void a() {
        Object next;
        g gVar;
        do {
            Iterator it = this.f2679t;
            if (!it.hasNext()) {
                this.f2680u = 0;
                return;
            } else {
                next = it.next();
                gVar = (g) this.f2682w;
            }
        } while (((Boolean) gVar.f2684c.invoke(next)).booleanValue() != gVar.f2683b);
        this.f2681v = next;
        this.f2680u = 1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [u8.b, v8.k] */
    public void b() {
        Iterator it = this.f2679t;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((p210v8.k) ((k) this.f2682w).f2693b).invoke(next)).booleanValue()) {
                this.f2680u = 1;
                this.f2681v = next;
                return;
            }
        }
        this.f2680u = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2678s) {
            case 0:
                if (this.f2680u == -1) {
                    a();
                }
                return this.f2680u == 1;
            default:
                if (this.f2680u == -1) {
                    b();
                }
                return this.f2680u == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2678s) {
            case 0:
                if (this.f2680u == -1) {
                    a();
                }
                if (this.f2680u == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f2681v;
                this.f2681v = null;
                this.f2680u = -1;
                return obj;
            default:
                if (this.f2680u == -1) {
                    b();
                }
                if (this.f2680u == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f2681v;
                this.f2681v = null;
                this.f2680u = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2678s) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(k kVar) {
        this.f2682w = kVar;
        this.f2679t = ((l) kVar.f2694c).iterator();
    }
}
