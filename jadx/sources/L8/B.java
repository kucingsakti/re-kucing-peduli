package L8;

import A9.C0138k;
import O8.AbstractC0356l;
import O8.C0355k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0356l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0138k f2789A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f2790y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f2791z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(p247z9.l lVar, InterfaceC0272f interfaceC0272f, p096j9.f fVar, boolean z6, int i10) {
        super(lVar, interfaceC0272f, fVar, M.a);
        p210v8.i.f(interfaceC0272f, "container");
        this.f2790y = z6;
        B8.c cVarW = p181s3.a.w(0, i10);
        ArrayList arrayList = new ArrayList(p086i8.m.H(cVarW, 10));
        B8.b it = cVarW.iterator();
        while (it.f774u) {
            int iA = it.a();
            arrayList.add(O8.S.c1(this, 1, p096j9.f.j("T" + iA), iA, lVar));
        }
        this.f2791z = arrayList;
        this.f2789A = new C0138k(this, AbstractC0287v.c(this), p086i8.C.w(p165q9.d.j(this).s().e()), lVar);
    }

    @Override // L8.InterfaceC0288w
    public final boolean C0() {
        return false;
    }

    @Override // O8.AbstractC0356l, L8.InterfaceC0288w
    public final boolean F() {
        return false;
    }

    @Override // L8.InterfaceC0273g
    public final A9.O I() {
        return this.f2789A;
    }

    @Override // L8.InterfaceC0271e
    public final boolean L0() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final int M() {
        return 1;
    }

    @Override // L8.InterfaceC0271e
    public final boolean N() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final boolean T() {
        return false;
    }

    @Override // O8.B
    public final t9.n b(B9.f fVar) {
        return t9.m.f15259b;
    }

    @Override // L8.InterfaceC0271e
    public final Collection e0() {
        return p086i8.s.f12328s;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0279m, L8.InterfaceC0288w
    public final C0280n f() {
        C0280n c0280n = AbstractC0281o.f2822e;
        p210v8.i.e(c0280n, "PUBLIC");
        return c0280n;
    }

    @Override // L8.InterfaceC0271e
    public final boolean h0() {
        return false;
    }

    @Override // L8.InterfaceC0288w
    public final boolean i0() {
        return false;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0288w
    public final int m() {
        return 1;
    }

    @Override // L8.InterfaceC0271e
    public final Collection n() {
        return p086i8.u.f12330s;
    }

    @Override // M8.a
    public final M8.h q() {
        return M8.g.a;
    }

    @Override // L8.InterfaceC0274h
    public final boolean r() {
        return this.f2790y;
    }

    @Override // L8.InterfaceC0271e
    public final Q t0() {
        return null;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // L8.InterfaceC0271e
    public final boolean u() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final C0355k u0() {
        return null;
    }

    @Override // L8.InterfaceC0271e
    public final /* bridge */ /* synthetic */ t9.n v0() {
        return t9.m.f15259b;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0274h
    public final List y() {
        return this.f2791z;
    }
}
