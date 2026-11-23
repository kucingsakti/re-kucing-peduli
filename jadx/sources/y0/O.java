package y0;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {
    public C0874l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15894b;

    public abstract x a();

    public final C0874l b() {
        C0874l c0874l = this.a;
        if (c0874l != null) {
            return c0874l;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, D d3) {
        K9.f fVar = new K9.f(new K9.g(K9.n.z(p086i8.k.N(list), new E0.b(this, 11, d3)), false, K9.q.f2702v));
        while (fVar.hasNext()) {
            b().g((C0872j) fVar.next());
        }
    }

    public void e(C0874l c0874l) {
        this.a = c0874l;
        this.f15894b = true;
    }

    public void f(C0872j c0872j) {
        x xVar = c0872j.f15928t;
        if (!(xVar instanceof x)) {
            xVar = null;
        }
        if (xVar == null) {
            return;
        }
        E e10 = new E();
        e10.f15868b = true;
        boolean z6 = e10.f15868b;
        U.r rVar = e10.a;
        c(xVar, null, new D(z6, e10.f15869c, e10.f15870d, false, e10.f15871e, rVar.a, rVar.f4845b, -1, -1));
        b().c(c0872j);
    }

    public Bundle h() {
        return null;
    }

    public void i(C0872j c0872j, boolean z6) {
        p210v8.i.f(c0872j, "popUpTo");
        List list = (List) ((Q9.t) ((Q9.m) b().f15941e.f3811t)).f();
        if (!list.contains(c0872j)) {
            throw new IllegalStateException(("popBackStack was called with " + c0872j + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C0872j c0872j2 = null;
        while (j()) {
            c0872j2 = (C0872j) listIterator.previous();
            if (p210v8.i.a(c0872j2, c0872j)) {
                break;
            }
        }
        if (c0872j2 != null) {
            b().d(c0872j2, z6);
        }
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public x c(x xVar, Bundle bundle, D d3) {
        return xVar;
    }
}
