package X8;

import A0.m;
import Fa.e;
import K9.g;
import K9.n;
import K9.q;
import K9.u;
import M8.h;
import R8.C0409d;
import java.util.Iterator;
import o1.f;
import p086i8.k;
import p210v8.i;
import p247z9.j;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f5426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p009a9.b f5427t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f5428u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f5429v;

    public b(e eVar, p009a9.b bVar, boolean z6) {
        i.f(eVar, "c");
        i.f(bVar, "annotationOwner");
        this.f5426s = eVar;
        this.f5427t = bVar;
        this.f5428u = z6;
        this.f5429v = ((l) ((I4.a) eVar.f1659t).a).c(new m(this, 20));
    }

    @Override // M8.h
    public final boolean E(p096j9.c cVar) {
        return f.k(this, cVar);
    }

    @Override // M8.h
    public final M8.b H(p096j9.c cVar) {
        M8.b bVar;
        i.f(cVar, "fqName");
        p009a9.b bVar2 = this.f5427t;
        C0409d c0409dA = bVar2.a(cVar);
        if (c0409dA != null && (bVar = (M8.b) this.f5429v.invoke(c0409dA)) != null) {
            return bVar;
        }
        p096j9.f fVar = V8.c.a;
        return V8.c.a(cVar, bVar2, this.f5426s);
    }

    @Override // M8.h
    public final boolean isEmpty() {
        return this.f5427t.q().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        p009a9.b bVar = this.f5427t;
        u uVarZ = n.z(k.N(bVar.q()), this.f5429v);
        p096j9.f fVar = V8.c.a;
        return new K9.f(new g(n.w(p086i8.i.m(new K9.l[]{uVarZ, p086i8.i.m(new Object[]{V8.c.a(I8.n.f2175m, bVar, this.f5426s)})})), false, q.f2702v));
    }
}
