package O8;

import A9.AbstractC0151y;
import A9.Z;
import L8.C0280n;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0274h;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends w implements P {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final F f3681Y;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final p247z9.l f3682V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final p238y9.q f3683W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C0355k f3684X;

    static {
        p210v8.v vVar = p210v8.u.a;
        vVar.f(new p210v8.n(vVar.b(Q.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        f3681Y = new F();
    }

    public Q(p247z9.l lVar, p238y9.q qVar, C0355k c0355k, P p10, M8.h hVar, int i10, L8.M m2) {
        super(i10, qVar, p10, m2, hVar, p096j9.h.f12556e);
        this.f3682V = lVar;
        this.f3683W = qVar;
        A9.A a = new A9.A(this, 22, c0355k);
        lVar.getClass();
        new p247z9.h(lVar, a);
        this.f3684X = c0355k;
    }

    @Override // L8.InterfaceC0275i
    public final InterfaceC0271e Q() {
        InterfaceC0271e interfaceC0271eQ = this.f3684X.Q();
        p210v8.i.e(interfaceC0271eQ, "underlyingConstructorDescriptor.constructedClass");
        return interfaceC0271eQ;
    }

    @Override // O8.w, L8.InterfaceC0269c
    public final InterfaceC0269c S(InterfaceC0271e interfaceC0271e, int i10, C0280n c0280n) {
        p210v8.i.f(interfaceC0271e, "newOwner");
        AbstractC0487g.p(i10, "modality");
        p210v8.i.f(c0280n, "visibility");
        AbstractC0487g.p(2, "kind");
        C0365v c0365vF1 = f1(Z.f355b);
        c0365vF1.f3758t = interfaceC0271e;
        c0365vF1.f3759u = i10;
        c0365vF1.f3760v = c0280n;
        c0365vF1.f3762x = 2;
        c0365vF1.f3746E = false;
        InterfaceC0269c interfaceC0269cC1 = c0365vF1.P.c1(c0365vF1);
        p210v8.i.d(interfaceC0269cC1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (P) interfaceC0269cC1;
    }

    @Override // O8.w
    public final w b1(int i10, InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, L8.M m2, M8.h hVar, p096j9.f fVar) {
        p210v8.i.f(interfaceC0276j, "newOwner");
        AbstractC0487g.p(i10, "kind");
        p210v8.i.f(hVar, "annotations");
        if (i10 != 1) {
        }
        return new Q(this.f3682V, this.f3683W, this.f3684X, this, hVar, 1, m2);
    }

    @Override // O8.w, O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public final P c() {
        InterfaceC0285t interfaceC0285tC = super.c();
        p210v8.i.d(interfaceC0285tC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (P) interfaceC0285tC;
    }

    @Override // O8.w, L8.InterfaceC0285t, L8.O
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public final Q j(Z z6) {
        p210v8.i.f(z6, "substitutor");
        InterfaceC0285t interfaceC0285tJ = super.j(z6);
        p210v8.i.d(interfaceC0285tJ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        Q q10 = (Q) interfaceC0285tJ;
        AbstractC0151y abstractC0151y = q10.f3787y;
        p210v8.i.c(abstractC0151y);
        C0355k c0355kJ = this.f3684X.Y0().j(Z.d(abstractC0151y));
        if (c0355kJ == null) {
            return null;
        }
        q10.f3684X = c0355kJ;
        return q10;
    }

    @Override // O8.AbstractC0360p, L8.InterfaceC0276j
    public final InterfaceC0274h v() {
        return this.f3683W;
    }

    @Override // O8.w, L8.InterfaceC0268b
    public final AbstractC0151y w() {
        AbstractC0151y abstractC0151y = this.f3787y;
        p210v8.i.c(abstractC0151y);
        return abstractC0151y;
    }

    @Override // O8.AbstractC0360p, L8.InterfaceC0276j
    public final InterfaceC0276j v() {
        return this.f3683W;
    }
}
