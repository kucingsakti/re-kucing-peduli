package O8;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.C0136i;
import A9.C0138k;
import A9.W;
import A9.Z;
import A9.b0;
import L8.C0280n;
import L8.C0286u;
import L8.C0291z;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import L8.InterfaceC0277k;
import L8.InterfaceC0278l;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class A extends B {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B f3612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Z f3613t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Z f3614u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f3615v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f3616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0138k f3617x;

    public A(B b3, Z z6) {
        this.f3612s = b3;
        this.f3613t = z6;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void d(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? 3 : 2];
        if (i10 == 2) {
            objArr[0] = "typeArguments";
        } else if (i10 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 8) {
            objArr[0] = "typeArguments";
        } else if (i10 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i10 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i10 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 13 && i10 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // L8.InterfaceC0288w
    public final boolean C0() {
        return this.f3612s.C0();
    }

    @Override // L8.InterfaceC0271e
    public final t9.n E(W w2) {
        p165q9.d.i(p124m9.e.d(this));
        return a(w2, B9.f.a);
    }

    @Override // L8.InterfaceC0288w
    public final boolean F() {
        return this.f3612s.F();
    }

    @Override // L8.InterfaceC0271e
    public final List F0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        d(17);
        throw null;
    }

    @Override // L8.InterfaceC0273g
    public final A9.O I() {
        A9.O oI = this.f3612s.I();
        if (this.f3613t.a.e()) {
            if (oI != null) {
                return oI;
            }
            d(0);
            throw null;
        }
        if (this.f3617x == null) {
            Z zI = i();
            Collection collectionT = oI.t();
            ArrayList arrayList = new ArrayList(collectionT.size());
            Iterator it = collectionT.iterator();
            while (it.hasNext()) {
                arrayList.add(zI.i(1, (AbstractC0151y) it.next()));
            }
            this.f3617x = new C0138k(this, this.f3615v, arrayList, p247z9.l.f16335e);
        }
        C0138k c0138k = this.f3617x;
        if (c0138k != null) {
            return c0138k;
        }
        d(1);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final boolean L0() {
        return this.f3612s.L0();
    }

    @Override // L8.InterfaceC0271e
    public final int M() {
        int iM = this.f3612s.M();
        if (iM != 0) {
            return iM;
        }
        d(25);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final x M0() {
        throw new UnsupportedOperationException();
    }

    @Override // L8.InterfaceC0271e
    public final boolean N() {
        return this.f3612s.N();
    }

    @Override // L8.InterfaceC0271e
    public final boolean T() {
        return this.f3612s.T();
    }

    @Override // O8.B
    public final t9.n a(W w2, B9.f fVar) {
        t9.n nVarA = this.f3612s.a(w2, fVar);
        if (!this.f3613t.a.e()) {
            return new t9.s(nVarA, i());
        }
        if (nVarA != null) {
            return nVarA;
        }
        d(7);
        throw null;
    }

    @Override // O8.B
    public final t9.n b(B9.f fVar) {
        t9.n nVarB = this.f3612s.b(fVar);
        if (!this.f3613t.a.e()) {
            return new t9.s(nVarB, i());
        }
        if (nVarB != null) {
            return nVarB;
        }
        d(14);
        throw null;
    }

    @Override // O8.B, L8.InterfaceC0271e, L8.InterfaceC0276j
    public final InterfaceC0271e c() {
        InterfaceC0271e interfaceC0271eC = this.f3612s.c();
        if (interfaceC0271eC != null) {
            return interfaceC0271eC;
        }
        d(21);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final Collection e0() {
        Collection collectionE0 = this.f3612s.e0();
        if (collectionE0 != null) {
            return collectionE0;
        }
        d(31);
        throw null;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0279m, L8.InterfaceC0288w
    public final C0280n f() {
        C0280n c0280nF = this.f3612s.f();
        if (c0280nF != null) {
            return c0280nF;
        }
        d(27);
        throw null;
    }

    @Override // L8.InterfaceC0277k
    public final L8.M g() {
        return L8.M.a;
    }

    @Override // L8.InterfaceC0276j
    public final p096j9.f getName() {
        p096j9.f name = this.f3612s.getName();
        if (name != null) {
            return name;
        }
        d(20);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final boolean h0() {
        return this.f3612s.h0();
    }

    public final Z i() {
        if (this.f3614u == null) {
            Z z6 = this.f3613t;
            if (z6.a.e()) {
                this.f3614u = z6;
            } else {
                List listU = this.f3612s.I().u();
                this.f3615v = new ArrayList(listU.size());
                this.f3614u = AbstractC0130c.v(listU, z6.f(), this, this.f3615v);
                ArrayList arrayList = this.f3615v;
                p210v8.i.f(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((L8.P) obj).X()) {
                        arrayList2.add(obj);
                    }
                }
                this.f3616w = arrayList2;
            }
        }
        return this.f3614u;
    }

    @Override // L8.InterfaceC0288w
    public final boolean i0() {
        return this.f3612s.i0();
    }

    @Override // L8.O
    public final InterfaceC0277k j(Z z6) {
        if (z6 != null) {
            return z6.a.e() ? this : new A(this, Z.e(z6.f(), i().f()));
        }
        d(23);
        throw null;
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.b(this, obj);
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0288w
    public final int m() {
        int iM = this.f3612s.m();
        if (iM != 0) {
            return iM;
        }
        d(26);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final Collection n() {
        Collection<C0355k> collectionN = this.f3612s.n();
        ArrayList arrayList = new ArrayList(collectionN.size());
        for (C0355k c0355k : collectionN) {
            C0355k c0355k2 = c0355k;
            c0355k2.getClass();
            C0365v c0365vF1 = c0355k2.f1(Z.f355b);
            c0365vF1.f3761w = c0355k.Y0();
            c0365vF1.x(c0355k2.m());
            c0365vF1.s(c0355k2.f());
            c0365vF1.l(c0355k2.V());
            c0365vF1.f3746E = false;
            arrayList.add(((C0355k) c0365vF1.P.c1(c0365vF1)).j(i()));
        }
        return arrayList;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0273g
    public final A9.D p() {
        A9.K kO;
        List listD = b0.d(I().u());
        M8.h hVarQ = q();
        if (hVarQ.isEmpty()) {
            A9.K.f338t.getClass();
            kO = A9.K.f339u;
        } else {
            o1.c cVar = A9.K.f338t;
            List listU = com.bumptech.glide.d.u(new C0136i(hVarQ));
            cVar.getClass();
            kO = o1.c.o(listU);
        }
        return C0133f.s(kO, I(), listD, z0(), false);
    }

    @Override // M8.a
    public final M8.h q() {
        M8.h hVarQ = this.f3612s.q();
        if (hVarQ != null) {
            return hVarQ;
        }
        d(19);
        throw null;
    }

    @Override // L8.InterfaceC0274h
    public final boolean r() {
        return this.f3612s.r();
    }

    @Override // L8.InterfaceC0271e
    public final t9.n s0() {
        t9.n nVarS0 = this.f3612s.s0();
        if (nVarS0 != null) {
            return nVarS0;
        }
        d(28);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final L8.Q t0() {
        L8.Q qT0 = this.f3612s.t0();
        if (qT0 == null) {
            return null;
        }
        boolean z6 = qT0 instanceof C0286u;
        Z z10 = this.f3613t;
        if (z6) {
            C0286u c0286u = (C0286u) qT0;
            A9.D d3 = (A9.D) c0286u.f2839b;
            if (d3 != null && !z10.a.e()) {
                d3 = (A9.D) i().i(1, d3);
            }
            return new C0286u(c0286u.a, d3);
        }
        if (!(qT0 instanceof C0291z)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList<p076h8.f> arrayList = ((C0291z) qT0).a;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(arrayList, 10));
        for (p076h8.f fVar : arrayList) {
            p096j9.f fVar2 = (p096j9.f) fVar.f11789s;
            A9.D d8 = (A9.D) ((D9.d) fVar.f11790t);
            if (d8 != null && !z10.a.e()) {
                d8 = (A9.D) i().i(1, d8);
            }
            arrayList2.add(new p076h8.f(fVar2, d8));
        }
        return new C0291z(arrayList2);
    }

    @Override // L8.InterfaceC0271e
    public final boolean u() {
        return this.f3612s.u();
    }

    @Override // L8.InterfaceC0271e
    public final C0355k u0() {
        return this.f3612s.u0();
    }

    @Override // L8.InterfaceC0276j
    public final InterfaceC0276j v() {
        InterfaceC0276j interfaceC0276jV = this.f3612s.v();
        if (interfaceC0276jV != null) {
            return interfaceC0276jV;
        }
        d(22);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final t9.n v0() {
        t9.n nVarV0 = this.f3612s.v0();
        if (nVarV0 != null) {
            return nVarV0;
        }
        d(15);
        throw null;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0274h
    public final List y() {
        i();
        ArrayList arrayList = this.f3616w;
        if (arrayList != null) {
            return arrayList;
        }
        d(30);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final t9.n z0() {
        p165q9.d.i(p124m9.e.d(this.f3612s));
        return b(B9.f.a);
    }
}
