package p238y9;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.D;
import A9.K;
import A9.O;
import A9.Z;
import A9.b0;
import L8.AbstractC0287v;
import L8.C0280n;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0274h;
import L8.InterfaceC0276j;
import L8.InterfaceC0277k;
import L8.InterfaceC0278l;
import L8.M;
import L9.e;
import O8.AbstractC0360p;
import O8.C0348d;
import O8.C0349e;
import O8.C0355k;
import O8.F;
import O8.Q;
import O8.w;
import O8.x;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p047e9.T;
import p067g9.f;
import p067g9.g;
import p067g9.h;
import p086i8.s;
import p201u9.a;
import p201u9.d;
import p210v8.i;
import p247z9.l;
import t9.m;
import t9.n;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC0360p implements i, InterfaceC0274h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final T f16114A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final f f16115B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final g f16116C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final h f16117D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p029c9.f f16118E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Object f16119F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public D f16120G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public D f16121H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public List f16122I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public D f16123J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0280n f16124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f16125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0349e f16126y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l f16127z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l lVar, InterfaceC0276j interfaceC0276j, M8.h hVar, p096j9.f fVar, C0280n c0280n, T t7, f fVar2, g gVar, h hVar2, p029c9.f fVar3) {
        super(interfaceC0276j, hVar, fVar, M.a);
        i.f(lVar, "storageManager");
        i.f(interfaceC0276j, "containingDeclaration");
        i.f(c0280n, "visibility");
        i.f(t7, "proto");
        i.f(fVar2, "nameResolver");
        i.f(gVar, "typeTable");
        i.f(hVar2, "versionRequirementTable");
        this.f16124w = c0280n;
        this.f16126y = new C0349e(this);
        this.f16127z = lVar;
        this.f16114A = t7;
        this.f16115B = fVar2;
        this.f16116C = gVar;
        this.f16117D = hVar2;
        this.f16118E = fVar3;
    }

    @Override // p238y9.i
    public final h B() {
        return this.f16118E;
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
        return this.f16126y;
    }

    @Override // p238y9.i
    public final f J0() {
        throw null;
    }

    public final InterfaceC0271e Z0() {
        if (AbstractC0130c.j(a1())) {
            return null;
        }
        InterfaceC0273g interfaceC0273gW = a1().D().w();
        if (interfaceC0273gW instanceof InterfaceC0271e) {
            return (InterfaceC0271e) interfaceC0273gW;
        }
        return null;
    }

    public final D a1() {
        D d3 = this.f16121H;
        if (d3 != null) {
            return d3;
        }
        i.n("expandedType");
        throw null;
    }

    public final D b1() {
        D d3 = this.f16120G;
        if (d3 != null) {
            return d3;
        }
        i.n("underlyingType");
        throw null;
    }

    @Override // O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    public final InterfaceC0273g c() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    public final void c1(List list, D d3, D d8) {
        n nVarZ0;
        D dT;
        C0355k c0355kJ;
        List list2;
        Q q10;
        int i10 = 1;
        i.f(d3, "underlyingType");
        i.f(d8, "expandedType");
        this.f16125x = list;
        this.f16120G = d3;
        this.f16121H = d8;
        this.f16122I = AbstractC0287v.c(this);
        InterfaceC0271e interfaceC0271eZ0 = Z0();
        if (interfaceC0271eZ0 == null || (nVarZ0 = interfaceC0271eZ0.z0()) == null) {
            nVarZ0 = m.f15259b;
        }
        n nVar = nVarZ0;
        C0348d c0348d = new C0348d(1);
        C9.f fVar = b0.a;
        if (C9.i.f(this)) {
            dT = C9.i.c(C9.h.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            O oI = I();
            if (oI == null) {
                b0.a(12);
                throw null;
            }
            List listD = b0.d(((C0349e) oI).u());
            K.f338t.getClass();
            dT = C0133f.t(K.f339u, oI, listD, false, nVar, c0348d);
        }
        this.f16123J = dT;
        InterfaceC0271e interfaceC0271eZ1 = Z0();
        List list3 = s.f12328s;
        if (interfaceC0271eZ1 != null) {
            Collection<C0355k> collectionN = interfaceC0271eZ1.n();
            i.e(collectionN, "classDescriptor.constructors");
            ArrayList arrayList = new ArrayList();
            for (C0355k c0355k : collectionN) {
                F f10 = Q.f3681Y;
                i.e(c0355k, "it");
                f10.getClass();
                l lVar = this.f16127z;
                i.f(lVar, "storageManager");
                Z zD = Z0() == null ? null : Z.d(a1());
                if (zD == null || (c0355kJ = c0355k.j(zD)) == null) {
                    q10 = null;
                } else {
                    M8.h hVarQ = c0355k.q();
                    C0355k c0355k2 = c0355k;
                    int iV = c0355k2.V();
                    AbstractC0487g.u(iV, "constructor.kind");
                    M mG = g();
                    i.e(mG, "typeAliasDescriptor.source");
                    Q q11 = new Q(lVar, this, c0355kJ, null, hVarQ, iV, mG);
                    List listH0 = c0355k2.H0();
                    if (listH0 == null) {
                        w.N0(28);
                        throw null;
                    }
                    Z z6 = zD;
                    ArrayList arrayListD1 = w.d1(q11, listH0, z6, false, false, null);
                    if (arrayListD1 == null) {
                        q10 = null;
                    } else {
                        D dA = AbstractC0130c.A(AbstractC0130c.l(c0355kJ.f3787y.D0()), p());
                        x xVar = c0355k2.f3766B;
                        M8.f fVar2 = M8.g.a;
                        x xVarK = xVar != null ? p124m9.m.k(q11, z6.g(i10, xVar.getType()), fVar2) : null;
                        InterfaceC0271e interfaceC0271eZ2 = Z0();
                        if (interfaceC0271eZ2 != null) {
                            List listB0 = c0355k2.b0();
                            i.e(listB0, "constructor.contextReceiverParameters");
                            List list4 = listB0;
                            ArrayList arrayList2 = new ArrayList(p086i8.m.H(list4, 10));
                            int i11 = 0;
                            for (Object obj : list4) {
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    p086i8.l.G();
                                    throw null;
                                }
                                x xVar2 = (x) obj;
                                AbstractC0151y abstractC0151yG = z6.g(i10, xVar2.getType());
                                d dVarZ0 = xVar2.Z0();
                                i.d(dVarZ0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                a aVar = new a(interfaceC0271eZ2, abstractC0151yG, ((a) dVarZ0).X0());
                                e eVar = p096j9.g.a;
                                arrayList2.add(new x(interfaceC0271eZ2, aVar, fVar2, p096j9.f.j("_context_receiver_" + i11)));
                                i11 = i12;
                                i10 = 1;
                            }
                            list2 = arrayList2;
                        } else {
                            list2 = list3;
                        }
                        q11.e1(xVarK, null, list2, y(), arrayListD1, dA, 1, this.f16124w);
                        q10 = q11;
                    }
                }
                if (q10 != null) {
                    arrayList.add(q10);
                }
                i10 = 1;
            }
            list3 = arrayList;
        }
        this.f16119F = list3;
    }

    @Override // L8.InterfaceC0288w
    public final C0280n f() {
        return this.f16124w;
    }

    @Override // L8.InterfaceC0288w
    public final boolean i0() {
        return false;
    }

    @Override // L8.O
    public final InterfaceC0277k j(Z z6) {
        i.f(z6, "substitutor");
        if (z6.a.e()) {
            return this;
        }
        InterfaceC0276j interfaceC0276jV = v();
        i.e(interfaceC0276jV, "containingDeclaration");
        M8.h hVarQ = q();
        i.e(hVarQ, "annotations");
        p096j9.f name = getName();
        i.e(name, MediationMetaData.KEY_NAME);
        q qVar = new q(this.f16127z, interfaceC0276jV, hVarQ, name, this.f16124w, this.f16114A, this.f16115B, this.f16116C, this.f16117D, this.f16118E);
        qVar.c1(y(), AbstractC0130c.b(z6.g(1, b1())), AbstractC0130c.b(z6.g(1, a1())));
        return qVar;
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.h(this, obj);
    }

    @Override // L8.InterfaceC0273g
    public final D p() {
        D d3 = this.f16123J;
        if (d3 != null) {
            return d3;
        }
        i.n("defaultTypeImpl");
        throw null;
    }

    @Override // L8.InterfaceC0274h
    public final boolean r() {
        return b0.c(b1(), new A0.m(this, 14), null);
    }

    @Override // O8.AbstractC0359o
    public final String toString() {
        return "typealias " + getName().g();
    }

    @Override // p238y9.i
    public final g w0() {
        throw null;
    }

    @Override // L8.InterfaceC0274h
    public final List y() {
        List list = this.f16125x;
        if (list != null) {
            return list;
        }
        i.n("declaredTypeParametersImpl");
        throw null;
    }

    @Override // O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    public final InterfaceC0276j c() {
        return this;
    }

    @Override // O8.AbstractC0360p
    /* JADX INFO: renamed from: Y0 */
    public final InterfaceC0277k c() {
        return this;
    }
}
