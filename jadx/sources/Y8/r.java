package Y8;

import L8.M;
import Q3.u0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends O8.E {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f5796E;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p247z9.i f5797A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0475d f5798B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p247z9.c f5799C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final M8.h f5800D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final R8.x f5801y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Fa.e f5802z;

    static {
        p210v8.v vVar = p210v8.u.a;
        f5796E = new C8.u[]{vVar.f(new p210v8.n(vVar.b(r.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), vVar.f(new p210v8.n(vVar.b(r.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(Fa.e eVar, R8.x xVar) {
        p210v8.i.f(eVar, "outerContext");
        I4.a aVar = (I4.a) eVar.f1659t;
        super((O8.C) aVar.f2059o, xVar.a);
        this.f5801y = xVar;
        Fa.e eVarD = J7.j.d(eVar, this, null, 6);
        this.f5802z = eVarD;
        p210v8.i.f((p220w9.i) ((p029c9.d) aVar.f2049d).c().f2080c, "<this>");
        i9.f fVar = i9.f.f12337g;
        I4.a aVar2 = (I4.a) eVarD.f1659t;
        p247z9.l lVar = (p247z9.l) aVar2.a;
        q qVar = new q(this, 0);
        lVar.getClass();
        this.f5797A = new p247z9.i(lVar, qVar);
        this.f5798B = new C0475d(eVarD, xVar, this);
        q qVar2 = new q(this, 2);
        lVar.getClass();
        this.f5799C = new p247z9.c(lVar, qVar2);
        this.f5800D = ((U8.t) aVar2.f2066v).f4989b ? M8.g.a : u0.k(eVarD, xVar);
        lVar.a(new q(this, 1));
    }

    @Override // L8.D
    public final t9.n E0() {
        return this.f5798B;
    }

    @Override // O8.E, O8.AbstractC0360p, L8.InterfaceC0277k
    public final M g() {
        return new P0.d(this);
    }

    @Override // B1.a, M8.a
    public final M8.h q() {
        return this.f5800D;
    }

    @Override // O8.E, O8.AbstractC0359o
    public final String toString() {
        return "Lazy Java package fragment: " + this.f3634w + " of module " + ((O8.C) ((I4.a) this.f5802z.f1659t).f2059o);
    }
}
