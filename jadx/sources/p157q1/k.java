package p157q1;

import C3.d;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = i.f14400y;
        }
        if (!i.f14399x.g(this, null, obj)) {
            return false;
        }
        i.b(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!i.f14399x.g(this, null, new c(th))) {
            return false;
        }
        i.b(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final boolean l(d dVar) {
        c cVar;
        dVar.getClass();
        Object obj = this.f14401s;
        if (obj != null) {
            if (obj instanceof a) {
                dVar.cancel(((a) obj).a);
            }
        } else if (dVar.isDone()) {
            if (i.f14399x.g(this, null, i.e(dVar))) {
                i.b(this);
                return true;
            }
        } else {
            f fVar = new f(this, dVar);
            if (i.f14399x.g(this, null, fVar)) {
                try {
                    dVar.f(fVar, j.f14404s);
                    return true;
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Throwable unused) {
                        cVar = c.f14384b;
                    }
                    i.f14399x.g(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.f14401s;
            if (obj instanceof a) {
                dVar.cancel(((a) obj).a);
            }
        }
        return false;
    }
}
