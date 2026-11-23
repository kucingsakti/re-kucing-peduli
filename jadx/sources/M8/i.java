package M8;

import K9.s;
import L8.E;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p086i8.r;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3200s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f3201t;

    public /* synthetic */ i(List list, int i10) {
        this.f3200s = i10;
        this.f3201t = list;
    }

    @Override // M8.h
    public final boolean E(p096j9.c cVar) {
        switch (this.f3200s) {
            case 0:
                return o1.f.k(this, cVar);
            case 1:
                p210v8.i.f(cVar, "fqName");
                Iterator it = ((Iterable) p086i8.k.N((List) this.f3201t).f2699b).iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).E(cVar)) {
                        return true;
                    }
                }
                return false;
            default:
                return o1.f.k(this, cVar);
        }
    }

    @Override // M8.h
    public final b H(p096j9.c cVar) {
        switch (this.f3200s) {
            case 0:
                return o1.f.e(this, cVar);
            case 1:
                p210v8.i.f(cVar, "fqName");
                return (b) K9.n.v(K9.n.A(p086i8.k.N((List) this.f3201t), new E(cVar, 1)));
            default:
                p210v8.i.f(cVar, "fqName");
                if (cVar.equals((p096j9.c) this.f3201t)) {
                    return p019b9.b.a;
                }
                return null;
        }
    }

    @Override // M8.h
    public final boolean isEmpty() {
        switch (this.f3200s) {
            case 0:
                return ((List) this.f3201t).isEmpty();
            case 1:
                List list = (List) this.f3201t;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((h) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3200s) {
            case 0:
                return ((List) this.f3201t).iterator();
            case 1:
                return new K9.h(new K9.i(p086i8.k.N((List) this.f3201t), k.f3205s, s.f2706A));
            default:
                return r.f12327s;
        }
    }

    public String toString() {
        switch (this.f3200s) {
            case 0:
                return ((List) this.f3201t).toString();
            default:
                return super.toString();
        }
    }

    public i(h[] hVarArr) {
        this.f3200s = 1;
        this.f3201t = p086i8.i.H(hVarArr);
    }

    public i(p096j9.c cVar) {
        this.f3200s = 2;
        p210v8.i.f(cVar, "fqNameToMatch");
        this.f3201t = cVar;
    }
}
