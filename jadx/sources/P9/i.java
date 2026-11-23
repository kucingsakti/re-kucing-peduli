package P9;

import N9.z0;
import O3.y;
import S9.s;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class i extends s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f3929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicReferenceArray f3930x;

    public i(long j, i iVar, a aVar, int i10) {
        super(j, iVar, i10);
        this.f3929w = aVar;
        this.f3930x = new AtomicReferenceArray(c.f3912b * 2);
    }

    @Override // S9.s
    public final int f() {
        return c.f3912b;
    }

    @Override // S9.s
    public final void g(int i10, p123m8.i iVar) {
        a aVar;
        int i11 = c.f3912b;
        boolean z6 = i10 >= i11;
        if (z6) {
            i10 -= i11;
        }
        this.f3930x.get(i10 * 2);
        while (true) {
            Object objK = k(i10);
            boolean z10 = objK instanceof z0;
            aVar = this.f3929w;
            if (z10 || (objK instanceof l)) {
                if (j(objK, i10, z6 ? c.j : c.f3920k)) {
                    m(i10, null);
                    l(i10, !z6);
                    if (z6) {
                        p210v8.i.c(aVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == c.j || objK == c.f3920k) {
                    break;
                }
                if (objK != c.f3917g && objK != c.f3916f) {
                    if (objK == c.f3919i || objK == c.f3914d || objK == c.f3921l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i10, null);
        if (z6) {
            p210v8.i.c(aVar);
        }
    }

    public final boolean j(Object obj, int i10, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f3930x;
        int i11 = (i10 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
            if (atomicReferenceArray.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i10) {
        return this.f3930x.get((i10 * 2) + 1);
    }

    public final void l(int i10, boolean z6) {
        if (z6) {
            a aVar = this.f3929w;
            p210v8.i.c(aVar);
            aVar.w((this.f4577u * ((long) c.f3912b)) + ((long) i10));
        }
        h();
    }

    public final void m(int i10, Object obj) {
        this.f3930x.lazySet(i10 * 2, obj);
    }

    public final void n(int i10, y yVar) {
        this.f3930x.set((i10 * 2) + 1, yVar);
    }
}
