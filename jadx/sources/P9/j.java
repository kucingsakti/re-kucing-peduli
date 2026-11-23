package P9;

import N9.z0;
import O3.y;
import p076h8.m;
import p210v8.u;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3931l;

    public j(int i10, int i11) {
        super(i10);
        this.f3931l = i11;
        if (i11 != 1) {
            if (i10 < 1) {
                throw new IllegalArgumentException(E0.a.g("Buffered channel capacity must be at least 1, but ", i10, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + u.a.b(a.class).v() + " instead").toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // P9.a, P9.k
    public final Object a(Object obj) {
        m mVar = m.a;
        if (this.f3931l == 3) {
            Object objA = super.a(obj);
            if (!(objA instanceof g) || (objA instanceof f)) {
                return objA;
            }
        } else {
            y yVar = c.f3914d;
            i iVar = (i) a.f3906g.get(this);
            while (true) {
                long andIncrement = a.f3902c.getAndIncrement(this);
                long j = 1152921504606846975L & andIncrement;
                boolean zM = m(andIncrement, false);
                int i10 = c.f3912b;
                long j10 = i10;
                long j11 = j / j10;
                int i11 = (int) (j % j10);
                if (iVar.f4577u != j11) {
                    i iVarB = a.b(this, j11, iVar);
                    if (iVarB != null) {
                        iVar = iVarB;
                    } else if (zM) {
                        return new f(j());
                    }
                }
                int iC = a.c(this, iVar, i11, obj, j, yVar, zM);
                if (iC == 0) {
                    iVar.a();
                    return mVar;
                }
                if (iC != 1) {
                    if (iC != 2) {
                        if (iC == 3) {
                            throw new IllegalStateException("unexpected");
                        }
                        if (iC == 4) {
                            if (j < a.f3903d.get(this)) {
                                iVar.a();
                            }
                            return new f(j());
                        }
                        if (iC == 5) {
                            iVar.a();
                        }
                    } else {
                        if (zM) {
                            iVar.h();
                            return new f(j());
                        }
                        z0 z0Var = yVar instanceof z0 ? (z0) yVar : null;
                        if (z0Var != null) {
                            z0Var.a(iVar, i11 + i10);
                        }
                        g((iVar.f4577u * j10) + ((long) i11));
                    }
                }
            }
        }
        return mVar;
    }

    @Override // P9.a
    public final boolean n() {
        return this.f3931l == 2;
    }
}
