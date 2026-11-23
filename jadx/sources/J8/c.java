package J8;

import A9.O;
import I8.o;
import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0276j;
import L8.M;
import L8.Q;
import M8.h;
import O8.AbstractC0346b;
import O8.C0355k;
import O8.S;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p086i8.k;
import p086i8.m;
import p086i8.s;
import p210v8.i;
import p247z9.l;
import t9.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0346b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final p096j9.b f2443D = new p096j9.b(o.f2197k, p096j9.f.j("Function"));

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final p096j9.b f2444E = new p096j9.b(o.f2195h, p096j9.f.j("KFunction"));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f2445A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final f f2446B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final List f2447C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f2448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p230x9.c f2449x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f2450y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f2451z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, p230x9.c cVar, e eVar, int i10) {
        super(lVar, eVar.f(i10));
        i.f(cVar, "containingDeclaration");
        this.f2448w = lVar;
        this.f2449x = cVar;
        this.f2450y = eVar;
        this.f2451z = i10;
        this.f2445A = new b(this);
        this.f2446B = new f(lVar, this);
        ArrayList arrayList = new ArrayList();
        B8.c cVar2 = new B8.c(1, i10, 1);
        ArrayList arrayList2 = new ArrayList(m.H(cVar2, 10));
        B8.b it = cVar2.iterator();
        while (it.f774u) {
            arrayList.add(S.c1(this, 2, p096j9.f.j("P" + it.a()), arrayList.size(), this.f2448w));
            arrayList2.add(p076h8.m.a);
        }
        arrayList.add(S.c1(this, 3, p096j9.f.j("R"), arrayList.size(), this.f2448w));
        this.f2447C = k.s0(arrayList);
    }

    @Override // L8.InterfaceC0288w
    public final boolean C0() {
        return false;
    }

    @Override // L8.InterfaceC0288w
    public final boolean F() {
        return false;
    }

    @Override // L8.InterfaceC0273g
    public final O I() {
        return this.f2445A;
    }

    @Override // L8.InterfaceC0271e
    public final boolean L0() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final int M() {
        return 2;
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
    public final n b(B9.f fVar) {
        return this.f2446B;
    }

    @Override // L8.InterfaceC0271e
    public final /* bridge */ /* synthetic */ Collection e0() {
        return s.f12328s;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0279m, L8.InterfaceC0288w
    public final C0280n f() {
        C0280n c0280n = AbstractC0281o.f2822e;
        i.e(c0280n, "PUBLIC");
        return c0280n;
    }

    @Override // L8.InterfaceC0277k
    public final M g() {
        return M.a;
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
        return 4;
    }

    @Override // L8.InterfaceC0271e
    public final /* bridge */ /* synthetic */ Collection n() {
        return s.f12328s;
    }

    @Override // M8.a
    public final h q() {
        return M8.g.a;
    }

    @Override // L8.InterfaceC0274h
    public final boolean r() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final Q t0() {
        return null;
    }

    public final String toString() {
        String strG = getName().g();
        i.e(strG, "name.asString()");
        return strG;
    }

    @Override // L8.InterfaceC0271e
    public final boolean u() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final /* bridge */ /* synthetic */ C0355k u0() {
        return null;
    }

    @Override // L8.InterfaceC0276j
    public final InterfaceC0276j v() {
        return this.f2449x;
    }

    @Override // L8.InterfaceC0271e
    public final /* bridge */ /* synthetic */ n v0() {
        return t9.m.f15259b;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0274h
    public final List y() {
        return this.f2447C;
    }
}
