package p114l9;

import A1.C0099h;
import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.B;
import A9.C0128a;
import A9.C0141n;
import A9.C0150x;
import A9.D;
import A9.O;
import A9.S;
import A9.b0;
import A9.d0;
import C9.h;
import D3.b;
import L8.AbstractC0281o;
import L8.AbstractC0287v;
import L8.C0280n;
import L8.H;
import L8.InterfaceC0268b;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0274h;
import L8.InterfaceC0276j;
import L8.InterfaceC0277k;
import L8.InterfaceC0288w;
import L8.InterfaceC0290y;
import L8.K;
import L8.P;
import L8.T;
import L9.f;
import L9.n;
import O8.C0355k;
import O8.C0364u;
import O8.L;
import O8.M;
import O8.U;
import O8.x;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import c2.a;
import com.bumptech.glide.d;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p076h8.j;
import p086i8.k;
import p086i8.l;
import p086i8.m;
import p086i8.s;
import p086i8.u;
import p096j9.c;
import p124m9.e;
import p145o9.o;
import p145o9.p;
import p145o9.q;
import p145o9.r;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f12982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f12983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f12984e;
    public final k a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f12985b = b.s(new a(this, 12));

    static {
        k kVar = new k();
        kVar.g();
        kVar.a = true;
        new g(kVar);
        k kVar2 = new k();
        kVar2.g();
        u uVar = u.f12330s;
        kVar2.d(uVar);
        kVar2.a = true;
        new g(kVar2);
        k kVar3 = new k();
        kVar3.g();
        kVar3.d(uVar);
        kVar3.m();
        kVar3.a = true;
        new g(kVar3);
        k kVar4 = new k();
        kVar4.d(uVar);
        b bVar = b.f12973c;
        kVar4.e(bVar);
        o oVar = o.f13055t;
        kVar4.h(oVar);
        kVar4.a = true;
        new g(kVar4);
        k kVar5 = new k();
        kVar5.g();
        kVar5.d(uVar);
        kVar5.e(bVar);
        kVar5.k();
        kVar5.h(o.f13056u);
        kVar5.a();
        kVar5.c();
        kVar5.m();
        kVar5.f();
        kVar5.a = true;
        new g(kVar5);
        k kVar6 = new k();
        kVar6.d(h.f12996t);
        kVar6.a = true;
        f12982c = new g(kVar6);
        k kVar7 = new k();
        kVar7.d(h.f12997u);
        kVar7.a = true;
        new g(kVar7);
        k kVar8 = new k();
        kVar8.e(bVar);
        kVar8.h(oVar);
        kVar8.a = true;
        f12983d = new g(kVar8);
        k kVar9 = new k();
        kVar9.b();
        kVar9.e(b.f12972b);
        kVar9.d(h.f12997u);
        kVar9.a = true;
        f12984e = new g(kVar9);
        k kVar10 = new k();
        kVar10.l();
        kVar10.d(h.f12997u);
        kVar10.a = true;
        new g(kVar10);
    }

    public g(k kVar) {
        this.a = kVar;
    }

    public static void X(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean j0(AbstractC0151y abstractC0151y) {
        if (!d.s(abstractC0151y)) {
            return false;
        }
        List listL = abstractC0151y.l();
        if ((listL instanceof Collection) && listL.isEmpty()) {
            return true;
        }
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            if (((S) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static final void n(g gVar, K k3, StringBuilder sb) {
        if (!gVar.r()) {
            k kVar = gVar.a;
            C8.u[] uVarArr = k.f13005W;
            if (!((Boolean) kVar.f13032g.a(uVarArr[5], kVar)).booleanValue()) {
                if (gVar.q().contains(h.ANNOTATIONS)) {
                    gVar.y(sb, k3, null);
                    C0364u c0364uA0 = k3.a0();
                    if (c0364uA0 != null) {
                        gVar.y(sb, c0364uA0, M8.d.FIELD);
                    }
                    C0364u c0364uU = k3.U();
                    if (c0364uU != null) {
                        gVar.y(sb, c0364uU, M8.d.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((p) kVar.f13012G.a(uVarArr[31], kVar)) == p.f13059t) {
                        L lE = k3.e();
                        if (lE != null) {
                            gVar.y(sb, lE, M8.d.PROPERTY_GETTER);
                        }
                        M mH = k3.h();
                        if (mH != null) {
                            gVar.y(sb, mH, M8.d.PROPERTY_SETTER);
                            List listH0 = mH.H0();
                            i.e(listH0, "setter.valueParameters");
                            U u3 = (U) k.k0(listH0);
                            i.e(u3, "it");
                            gVar.y(sb, u3, M8.d.SETTER_PARAMETER);
                        }
                    }
                }
                List listB0 = k3.b0();
                i.e(listB0, "property.contextReceiverParameters");
                gVar.C(sb, listB0);
                C0280n c0280nF = k3.f();
                i.e(c0280nF, "property.visibility");
                gVar.h0(c0280nF, sb);
                gVar.N("const", sb, gVar.q().contains(h.CONST) && k3.O());
                gVar.K(k3, sb);
                gVar.M(k3, sb);
                gVar.S(k3, sb);
                gVar.N("lateinit", sb, gVar.q().contains(h.LATEINIT) && k3.f0());
                gVar.J(k3, sb);
            }
            gVar.e0(k3, sb, false);
            List listZ = k3.z();
            i.e(listZ, "property.typeParameters");
            gVar.d0(listZ, sb, true);
            gVar.V(k3, sb);
        }
        gVar.P(k3, sb, true);
        sb.append(": ");
        AbstractC0151y type = k3.getType();
        i.e(type, "property.type");
        sb.append(gVar.Y(type));
        gVar.W(k3, sb);
        gVar.H(k3, sb);
        List listZ2 = k3.z();
        i.e(listZ2, "property.typeParameters");
        gVar.i0(sb, listZ2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054 A[RETURN] */
    public static int v(InterfaceC0288w interfaceC0288w) {
        if (interfaceC0288w instanceof InterfaceC0271e) {
            if (((InterfaceC0271e) interfaceC0288w).M() == 2) {
                return 4;
            }
            return 1;
        }
        InterfaceC0276j interfaceC0276jV = interfaceC0288w.v();
        InterfaceC0271e interfaceC0271e = interfaceC0276jV instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0276jV : null;
        if (interfaceC0271e != null && (interfaceC0288w instanceof InterfaceC0269c)) {
            InterfaceC0269c interfaceC0269c = (InterfaceC0269c) interfaceC0288w;
            Collection collectionX = interfaceC0269c.x();
            i.e(collectionX, "this.overriddenDescriptors");
            if (!collectionX.isEmpty() && interfaceC0271e.m() != 1) {
                return 3;
            }
            if (interfaceC0271e.M() == 2 && !i.a(interfaceC0269c.f(), AbstractC0281o.a)) {
                if (interfaceC0269c.m() == 4) {
                    return 4;
                }
                return 3;
            }
        }
        return 1;
    }

    public final void A(InterfaceC0274h interfaceC0274h, StringBuilder sb) {
        List listY = interfaceC0274h.y();
        i.e(listY, "classifier.declaredTypeParameters");
        List listU = interfaceC0274h.I().u();
        i.e(listU, "classifier.typeConstructor.parameters");
        if (u() && interfaceC0274h.r() && listU.size() > listY.size()) {
            sb.append(" /*captured type parameters: ");
            c0(sb, listU.subList(listY.size(), listU.size()));
            sb.append("*/");
        }
    }

    public final String B(p145o9.g gVar) {
        if (gVar instanceof p145o9.b) {
            return k.Z((Iterable) ((p145o9.b) gVar).a, ", ", "{", "}", new e(this, 1), 24);
        }
        if (gVar instanceof p145o9.a) {
            return f.W(x((M8.b) ((p145o9.a) gVar).a, null), "@");
        }
        if (!(gVar instanceof r)) {
            return gVar.toString();
        }
        q qVar = (q) ((r) gVar).a;
        if (qVar instanceof o) {
            return ((o) qVar).a + "::class";
        }
        if (!(qVar instanceof p)) {
            throw new NoWhenBranchMatchedException();
        }
        p pVar = (p) qVar;
        String strB = pVar.a.a.b().b();
        for (int i10 = 0; i10 < pVar.a.f13830b; i10++) {
            strB = "kotlin.Array<" + strB + '>';
        }
        return p231y.a.c(strB, "::class");
    }

    public final void C(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            x xVar = (x) it.next();
            y(sb, xVar, M8.d.RECEIVER);
            AbstractC0151y type = xVar.getType();
            i.e(type, "contextReceiver.type");
            sb.append(G(type));
            if (i10 == l.B(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i10 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    public final void D(StringBuilder sb, D d3) {
        y(sb, d3, null);
        boolean z6 = d3 instanceof C0141n;
        if (AbstractC0130c.j(d3)) {
            boolean z10 = d3 instanceof C9.f;
            boolean z11 = z10 && ((C9.f) d3).f977v.f1014t;
            k kVar = this.a;
            if (z11) {
                if (((Boolean) kVar.f13024T.a(k.f13005W[45], kVar)).booleanValue()) {
                    C9.i iVar = C9.i.a;
                    if (z10) {
                        boolean z12 = ((C9.f) d3).f977v.f1014t;
                    }
                    O oD = d3.D();
                    i.d(oD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                    sb.append(E(((C9.g) oD).f982b[0]));
                } else {
                    if (z10) {
                        if (((Boolean) kVar.f13026V.a(k.f13005W[47], kVar)).booleanValue()) {
                            sb.append(d3.D().toString());
                        } else {
                            sb.append(((C9.f) d3).f981z);
                        }
                    } else {
                        sb.append(d3.D().toString());
                    }
                    sb.append(Z(d3.l()));
                }
            } else {
                if (z10) {
                    if (((Boolean) kVar.f13026V.a(k.f13005W[47], kVar)).booleanValue()) {
                        sb.append(((C9.f) d3).f981z);
                    } else {
                        sb.append(d3.D().toString());
                    }
                } else {
                    sb.append(d3.D().toString());
                }
                sb.append(Z(d3.l()));
            }
        } else {
            O oD2 = d3.D();
            InterfaceC0273g interfaceC0273gW = d3.D().w();
            C0099h c0099hA = AbstractC0287v.a(d3, interfaceC0273gW instanceof InterfaceC0274h ? (InterfaceC0274h) interfaceC0273gW : null, 0);
            if (c0099hA == null) {
                sb.append(a0(oD2));
                sb.append(Z(d3.l()));
            } else {
                U(sb, c0099hA);
            }
        }
        if (d3.H()) {
            sb.append("?");
        }
        if (d3 instanceof C0141n) {
            sb.append(" & Any");
        }
    }

    public final String E(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return E0.a.i("<font color=red><b>", str, "</b></font>");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String F(String str, String str2, I8.i iVar) {
        i.f(str, "lowerRendered");
        i.f(str2, "upperRendered");
        if (p181s3.a.v(str, str2)) {
            return n.I(str2, "(", false) ? E0.a.i("(", str, ")!") : str.concat("!");
        }
        String strG0 = f.g0(p().a(iVar.i(I8.n.f2139B), this), "Collection");
        String strS = p181s3.a.s(str, strG0.concat("Mutable"), str2, strG0, strG0.concat("(Mutable)"));
        if (strS != null) {
            return strS;
        }
        String strS2 = p181s3.a.s(str, strG0.concat("MutableMap.MutableEntry"), str2, strG0.concat("Map.Entry"), strG0.concat("(Mutable)Map.(Mutable)Entry"));
        if (strS2 != null) {
            return strS2;
        }
        String strG1 = f.g0(p().a(iVar.j("Array"), this), "Array");
        String strS3 = p181s3.a.s(str, strG1.concat(o("Array<")), str2, strG1.concat(o("Array<out ")), strG1.concat(o("Array<(out) ")));
        if (strS3 != null) {
            return strS3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String G(AbstractC0151y abstractC0151y) {
        String strY = Y(abstractC0151y);
        if ((!j0(abstractC0151y) || b0.e(abstractC0151y)) && !(abstractC0151y instanceof C0141n)) {
            return strY;
        }
        return "(" + strY + ')';
    }

    public final void H(T t7, StringBuilder sb) {
        p145o9.g gVarA0;
        k kVar = this.a;
        if (!((Boolean) kVar.f13045u.a(k.f13005W[19], kVar)).booleanValue() || (gVarA0 = t7.A0()) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(o(B(gVarA0)));
    }

    public final String I(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            k kVar = this.a;
            if (!((Boolean) kVar.f13025U.a(k.f13005W[46], kVar)).booleanValue()) {
                return E0.a.i("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void J(InterfaceC0269c interfaceC0269c, StringBuilder sb) {
        String str;
        if (q().contains(h.MEMBER_KIND) && u() && interfaceC0269c.V() != 1) {
            sb.append("/*");
            int iV = interfaceC0269c.V();
            if (iV == 1) {
                str = "DECLARATION";
            } else if (iV == 2) {
                str = "FAKE_OVERRIDE";
            } else if (iV == 3) {
                str = "DELEGATION";
            } else {
                if (iV != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(J7.j.X(str));
            sb.append("*/ ");
        }
    }

    public final void K(InterfaceC0288w interfaceC0288w, StringBuilder sb) {
        N("external", sb, interfaceC0288w.F());
        boolean z6 = false;
        N("expect", sb, q().contains(h.EXPECT) && interfaceC0288w.i0());
        if (q().contains(h.ACTUAL) && interfaceC0288w.C0()) {
            z6 = true;
        }
        N("actual", sb, z6);
    }

    public final void L(int i10, StringBuilder sb, int i11) {
        String str;
        k kVar = this.a;
        if (((Boolean) kVar.f13040p.a(k.f13005W[14], kVar)).booleanValue() || i10 != i11) {
            boolean zContains = q().contains(h.MODALITY);
            if (i10 == 1) {
                str = "FINAL";
            } else if (i10 == 2) {
                str = "SEALED";
            } else if (i10 == 3) {
                str = "OPEN";
            } else {
                if (i10 != 4) {
                    throw null;
                }
                str = "ABSTRACT";
            }
            N(J7.j.X(str), sb, zContains);
        }
    }

    public final void M(InterfaceC0269c interfaceC0269c, StringBuilder sb) {
        if (e.s(interfaceC0269c) && interfaceC0269c.m() == 1) {
            return;
        }
        k kVar = this.a;
        if (((n) kVar.f13006A.a(k.f13005W[25], kVar)) == n.f13051s && interfaceC0269c.m() == 3 && !interfaceC0269c.x().isEmpty()) {
            return;
        }
        int iM = interfaceC0269c.m();
        AbstractC0487g.u(iM, "callable.modality");
        L(iM, sb, v(interfaceC0269c));
    }

    public final void N(String str, StringBuilder sb, boolean z6) {
        if (z6) {
            sb.append(I(str));
            sb.append(" ");
        }
    }

    public final String O(p096j9.f fVar, boolean z6) {
        String strO = o(p181s3.a.q(fVar));
        k kVar = this.a;
        return (((Boolean) kVar.f13025U.a(k.f13005W[46], kVar)).booleanValue() && s() == s.f13062t && z6) ? E0.a.i("<b>", strO, "</b>") : strO;
    }

    public final void P(InterfaceC0276j interfaceC0276j, StringBuilder sb, boolean z6) {
        p096j9.f name = interfaceC0276j.getName();
        i.e(name, "descriptor.name");
        sb.append(O(name, z6));
    }

    public final void Q(StringBuilder sb, AbstractC0151y abstractC0151y) {
        d0 d0VarD0 = abstractC0151y.D0();
        C0128a c0128a = d0VarD0 instanceof C0128a ? (C0128a) d0VarD0 : null;
        if (c0128a == null) {
            R(sb, abstractC0151y);
            return;
        }
        k kVar = this.a;
        C8.u[] uVarArr = k.f13005W;
        boolean zBooleanValue = ((Boolean) kVar.f13021Q.a(uVarArr[41], kVar)).booleanValue();
        D d3 = c0128a.f356t;
        if (zBooleanValue) {
            R(sb, d3);
            return;
        }
        R(sb, c0128a.f357u);
        if (((Boolean) kVar.P.a(uVarArr[40], kVar)).booleanValue()) {
            s sVarS = s();
            q qVar = s.f13062t;
            if (sVarS == qVar) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* = ");
            R(sb, d3);
            sb.append(" */");
            if (s() == qVar) {
                sb.append("</i></font>");
            }
        }
    }

    public final void R(StringBuilder sb, AbstractC0151y abstractC0151y) {
        p096j9.f fVarM;
        String strO;
        boolean z6 = abstractC0151y instanceof B;
        k kVar = this.a;
        if (z6 && kVar.n()) {
            p247z9.i iVar = ((B) abstractC0151y).f325v;
            if (iVar.f16326u == p247z9.k.f16330s || iVar.f16326u == p247z9.k.f16331t) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        d0 d0VarD0 = abstractC0151y.D0();
        if (d0VarD0 instanceof A9.r) {
            sb.append(((A9.r) d0VarD0).P0(this, this));
            return;
        }
        if (d0VarD0 instanceof D) {
            D d3 = (D) d0VarD0;
            if (d3.equals(b0.f359b) || d3.D() == b0.a.f975t) {
                sb.append("???");
                return;
            }
            O oD = d3.D();
            if ((oD instanceof C9.g) && ((C9.g) oD).a == h.UNINFERRED_TYPE_VARIABLE) {
                if (!((Boolean) kVar.f13044t.a(k.f13005W[18], kVar)).booleanValue()) {
                    sb.append("???");
                    return;
                }
                O oD2 = d3.D();
                i.d(oD2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(E(((C9.g) oD2).f982b[0]));
                return;
            }
            if (AbstractC0130c.j(d3)) {
                D(sb, d3);
                return;
            }
            if (!j0(d3)) {
                D(sb, d3);
                return;
            }
            int length = sb.length();
            ((g) this.f12985b.getValue()).y(sb, d3, null);
            boolean z10 = sb.length() != length;
            AbstractC0151y abstractC0151yP = d.p(d3);
            List listN = d.n(d3);
            if (!listN.isEmpty()) {
                sb.append("context(");
                Iterator it = listN.subList(0, l.B(listN)).iterator();
                while (it.hasNext()) {
                    Q(sb, (AbstractC0151y) it.next());
                    sb.append(", ");
                }
                Q(sb, (AbstractC0151y) k.b0(listN));
                sb.append(") ");
            }
            boolean zT = d.t(d3);
            boolean zH = d3.H();
            boolean z11 = zH || (z10 && abstractC0151yP != null);
            if (z11) {
                if (zT) {
                    sb.insert(length, '(');
                } else {
                    if (z10) {
                        if (sb.length() == 0) {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                        b.q(sb.charAt(f.L(sb)));
                        if (sb.charAt(f.L(sb) - 1) != ')') {
                            sb.insert(f.L(sb), "()");
                        }
                    }
                    sb.append("(");
                }
            }
            N("suspend", sb, zT);
            if (abstractC0151yP != null) {
                boolean z12 = (j0(abstractC0151yP) && !abstractC0151yP.H()) || d.t(abstractC0151yP) || !abstractC0151yP.q().isEmpty() || (abstractC0151yP instanceof C0141n);
                if (z12) {
                    sb.append("(");
                }
                Q(sb, abstractC0151yP);
                if (z12) {
                    sb.append(")");
                }
                sb.append(".");
            }
            sb.append("(");
            if (!d.s(d3) || d3.q().H(I8.n.f2178p) == null || d3.l().size() > 1) {
                int i10 = 0;
                for (S s9 : d.r(d3)) {
                    int i11 = i10 + 1;
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    if (((Boolean) kVar.f13023S.a(k.f13005W[43], kVar)).booleanValue()) {
                        AbstractC0151y abstractC0151yB = s9.b();
                        i.e(abstractC0151yB, "typeProjection.type");
                        fVarM = d.m(abstractC0151yB);
                    } else {
                        fVarM = null;
                    }
                    if (fVarM != null) {
                        sb.append(O(fVarM, false));
                        sb.append(": ");
                    }
                    i.f(s9, "typeProjection");
                    StringBuilder sb2 = new StringBuilder();
                    k.Y(d.u(s9), sb2, ", ", null, null, new e(this, 0), 60);
                    String string = sb2.toString();
                    i.e(string, "StringBuilder().apply(builderAction).toString()");
                    sb.append(string);
                    i10 = i11;
                }
            } else {
                sb.append("???");
            }
            sb.append(") ");
            int iOrdinal = s().ordinal();
            if (iOrdinal == 0) {
                strO = o("->");
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                strO = "&rarr;";
            }
            sb.append(strO);
            sb.append(" ");
            d.s(d3);
            AbstractC0151y abstractC0151yB2 = ((S) k.b0(d3.l())).b();
            i.e(abstractC0151yB2, "arguments.last().type");
            Q(sb, abstractC0151yB2);
            if (z11) {
                sb.append(")");
            }
            if (zH) {
                sb.append("?");
            }
        }
    }

    public final void S(InterfaceC0269c interfaceC0269c, StringBuilder sb) {
        if (q().contains(h.OVERRIDE) && !interfaceC0269c.x().isEmpty()) {
            k kVar = this.a;
            if (((n) kVar.f13006A.a(k.f13005W[25], kVar)) != n.f13052t) {
                N("override", sb, true);
                if (u()) {
                    sb.append("/*");
                    sb.append(interfaceC0269c.x().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void T(c cVar, String str, StringBuilder sb) {
        sb.append(I(str));
        p096j9.e eVarI = cVar.i();
        i.e(eVarI, "fqName.toUnsafe()");
        String strO = o(p181s3.a.r(eVarI.e()));
        if (strO.length() > 0) {
            sb.append(" ");
            sb.append(strO);
        }
    }

    public final void U(StringBuilder sb, C0099h c0099h) {
        C0099h c0099h2 = (C0099h) c0099h.f105v;
        InterfaceC0274h interfaceC0274h = (InterfaceC0274h) c0099h.f103t;
        if (c0099h2 != null) {
            U(sb, c0099h2);
            sb.append('.');
            p096j9.f name = interfaceC0274h.getName();
            i.e(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(O(name, false));
        } else {
            O oI = interfaceC0274h.I();
            i.e(oI, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb.append(a0(oI));
        }
        sb.append(Z((List) c0099h.f104u));
    }

    public final void V(InterfaceC0269c interfaceC0269c, StringBuilder sb) {
        x xVarR = interfaceC0269c.R();
        if (xVarR != null) {
            y(sb, xVarR, M8.d.RECEIVER);
            AbstractC0151y type = xVarR.getType();
            i.e(type, "receiver.type");
            sb.append(G(type));
            sb.append(".");
        }
    }

    public final void W(InterfaceC0269c interfaceC0269c, StringBuilder sb) {
        x xVarR;
        k kVar = this.a;
        if (((Boolean) kVar.f13010E.a(k.f13005W[29], kVar)).booleanValue() && (xVarR = interfaceC0269c.R()) != null) {
            sb.append(" on ");
            AbstractC0151y type = xVarR.getType();
            i.e(type, "receiver.type");
            sb.append(Y(type));
        }
    }

    public final String Y(AbstractC0151y abstractC0151y) {
        i.f(abstractC0151y, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        StringBuilder sb = new StringBuilder();
        k kVar = this.a;
        Q(sb, (AbstractC0151y) ((p200u8.b) kVar.f13048x.a(k.f13005W[22], kVar)).invoke(abstractC0151y));
        String string = sb.toString();
        i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String Z(List list) {
        i.f(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(o("<"));
        k.Y(list, sb, ", ", null, null, new e(this, 0), 60);
        sb.append(o(">"));
        String string = sb.toString();
        i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // p114l9.i
    public final void a() {
        this.a.a();
    }

    public final String a0(O o10) {
        i.f(o10, "typeConstructor");
        InterfaceC0273g interfaceC0273gW = o10.w();
        if (interfaceC0273gW instanceof P ? true : interfaceC0273gW instanceof InterfaceC0271e ? true : interfaceC0273gW instanceof p238y9.q) {
            i.f(interfaceC0273gW, "klass");
            return C9.i.f(interfaceC0273gW) ? interfaceC0273gW.I().toString() : p().a(interfaceC0273gW, this);
        }
        if (interfaceC0273gW == null) {
            return o10 instanceof C0150x ? ((C0150x) o10).c(f.f12978u) : o10.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC0273gW.getClass()).toString());
    }

    @Override // p114l9.i
    public final void b() {
        this.a.b();
    }

    public final void b0(P p10, StringBuilder sb, boolean z6) {
        String str;
        if (z6) {
            sb.append(o("<"));
        }
        if (u()) {
            sb.append("/*");
            sb.append(p10.d0());
            sb.append("*/ ");
        }
        N("reified", sb, p10.Y());
        int iJ0 = p10.j0();
        if (iJ0 == 1) {
            str = "";
        } else if (iJ0 == 2) {
            str = ScarConstants.IN_SIGNAL_KEY;
        } else {
            if (iJ0 != 3) {
                throw null;
            }
            str = "out";
        }
        boolean z10 = true;
        N(str, sb, str.length() > 0);
        y(sb, p10, null);
        P(p10, sb, z6);
        int size = p10.getUpperBounds().size();
        if ((size > 1 && !z6) || size == 1) {
            AbstractC0151y abstractC0151y = (AbstractC0151y) p10.getUpperBounds().iterator().next();
            if (abstractC0151y == null) {
                I8.i.a(141);
                throw null;
            }
            if (!I8.i.x(abstractC0151y) || !abstractC0151y.H()) {
                sb.append(" : ");
                sb.append(Y(abstractC0151y));
            }
        } else if (z6) {
            for (AbstractC0151y abstractC0151y2 : p10.getUpperBounds()) {
                if (abstractC0151y2 == null) {
                    I8.i.a(141);
                    throw null;
                }
                if (!I8.i.x(abstractC0151y2) || !abstractC0151y2.H()) {
                    if (z10) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(Y(abstractC0151y2));
                    z10 = false;
                }
            }
        }
        if (z6) {
            sb.append(o(">"));
        }
    }

    @Override // p114l9.i
    public final void c() {
        this.a.c();
    }

    public final void c0(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0((P) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // p114l9.i
    public final void d(Set set) {
        i.f(set, "<set-?>");
        this.a.d(set);
    }

    public final void d0(List list, StringBuilder sb, boolean z6) {
        k kVar = this.a;
        if (((Boolean) kVar.f13046v.a(k.f13005W[20], kVar)).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(o("<"));
        c0(sb, list);
        sb.append(o(">"));
        if (z6) {
            sb.append(" ");
        }
    }

    @Override // p114l9.i
    public final void e(c cVar) {
        this.a.e(cVar);
    }

    public final void e0(T t7, StringBuilder sb, boolean z6) {
        if (z6 || !(t7 instanceof U)) {
            sb.append(I(t7.P() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // p114l9.i
    public final void f() {
        this.a.f();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public final void f0(U u3, boolean z6, StringBuilder sb, boolean z10) {
        boolean z11;
        if (z10) {
            sb.append(I("value-parameter"));
            sb.append(" ");
        }
        if (u()) {
            sb.append("/*");
            sb.append(u3.f3691x);
            sb.append("*/ ");
        }
        y(sb, u3, null);
        N("crossinline", sb, u3.f3693z);
        N("noinline", sb, u3.f3688A);
        k kVar = this.a;
        C8.u[] uVarArr = k.f13005W;
        boolean z12 = false;
        if (((Boolean) kVar.f13042r.a(uVarArr[16], kVar)).booleanValue()) {
            InterfaceC0268b interfaceC0268bB1 = u3.v();
            C0355k c0355k = interfaceC0268bB1 instanceof C0355k ? (C0355k) interfaceC0268bB1 : null;
            if (c0355k == null || !c0355k.f3717V) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11) {
            N("actual", sb, ((Boolean) kVar.f13043s.a(uVarArr[17], kVar)).booleanValue());
        }
        AbstractC0151y type = u3.getType();
        i.e(type, "variable.type");
        AbstractC0151y abstractC0151y = u3.f3689B;
        AbstractC0151y abstractC0151y2 = abstractC0151y == null ? type : abstractC0151y;
        N("vararg", sb, abstractC0151y != null);
        if (z11 || (z10 && !r())) {
            e0(u3, sb, z11);
        }
        if (z6) {
            P(u3, sb, z10);
            sb.append(": ");
        }
        sb.append(Y(abstractC0151y2));
        H(u3, sb);
        if (u() && abstractC0151y != null) {
            sb.append(" /*");
            sb.append(Y(type));
            sb.append("*/");
        }
        if (((p200u8.b) kVar.f13049y.a(uVarArr[23], kVar)) != null) {
            if (kVar.n() ? u3.a1() : p165q9.d.a(u3)) {
                z12 = true;
            }
        }
        if (z12) {
            StringBuilder sb2 = new StringBuilder(" = ");
            p200u8.b bVar = (p200u8.b) kVar.f13049y.a(uVarArr[23], kVar);
            i.c(bVar);
            sb2.append((String) bVar.invoke(u3));
            sb.append(sb2.toString());
        }
    }

    @Override // p114l9.i
    public final void g() {
        this.a.g();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final void g0(Collection collection, boolean z6, StringBuilder sb) {
        boolean z10;
        k kVar = this.a;
        int iOrdinal = ((o) kVar.f13009D.a(k.f13005W[28], kVar)).ordinal();
        if (iOrdinal == 0) {
            z10 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z6) {
                z10 = true;
            }
            z10 = false;
        }
        int size = collection.size();
        t().getClass();
        i.f(sb, "builder");
        sb.append("(");
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            U u3 = (U) it.next();
            t().getClass();
            i.f(u3, "parameter");
            f0(u3, z10, sb, false);
            t().getClass();
            if (i10 != size - 1) {
                sb.append(", ");
            }
            i10 = i11;
        }
        t().getClass();
        sb.append(")");
    }

    @Override // p114l9.i
    public final void h(o oVar) {
        this.a.h(oVar);
    }

    public final boolean h0(C0280n c0280n, StringBuilder sb) {
        if (!q().contains(h.VISIBILITY)) {
            return false;
        }
        k kVar = this.a;
        C8.u[] uVarArr = k.f13005W;
        if (((Boolean) kVar.f13038n.a(uVarArr[12], kVar)).booleanValue()) {
            c0280n = AbstractC0281o.f(c0280n.a.l());
        }
        if (!((Boolean) kVar.f13039o.a(uVarArr[13], kVar)).booleanValue() && i.a(c0280n, AbstractC0281o.j)) {
            return false;
        }
        sb.append(I(c0280n.a.d()));
        sb.append(" ");
        return true;
    }

    @Override // p114l9.i
    public final Set i() {
        return this.a.i();
    }

    public final void i0(StringBuilder sb, List list) {
        k kVar = this.a;
        if (((Boolean) kVar.f13046v.a(k.f13005W[20], kVar)).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            P p10 = (P) it.next();
            List upperBounds = p10.getUpperBounds();
            i.e(upperBounds, "typeParameter.upperBounds");
            for (AbstractC0151y abstractC0151y : k.P(upperBounds)) {
                StringBuilder sb2 = new StringBuilder();
                p096j9.f name = p10.getName();
                i.e(name, "typeParameter.name");
                sb2.append(O(name, false));
                sb2.append(" : ");
                i.e(abstractC0151y, "it");
                sb2.append(Y(abstractC0151y));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(I("where"));
        sb.append(" ");
        k.Y(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // p114l9.i
    public final void j(LinkedHashSet linkedHashSet) {
        this.a.j(linkedHashSet);
    }

    @Override // p114l9.i
    public final void k() {
        this.a.k();
    }

    @Override // p114l9.i
    public final void l() {
        this.a.l();
    }

    @Override // p114l9.i
    public final void m() {
        this.a.m();
    }

    public final String o(String str) {
        return s().f(str);
    }

    public final c p() {
        k kVar = this.a;
        return (c) kVar.f13027b.a(k.f13005W[0], kVar);
    }

    public final Set q() {
        k kVar = this.a;
        return (Set) kVar.f13030e.a(k.f13005W[3], kVar);
    }

    public final boolean r() {
        k kVar = this.a;
        return ((Boolean) kVar.f13031f.a(k.f13005W[4], kVar)).booleanValue();
    }

    public final s s() {
        k kVar = this.a;
        return (s) kVar.f13008C.a(k.f13005W[27], kVar);
    }

    public final d t() {
        k kVar = this.a;
        return (d) kVar.f13007B.a(k.f13005W[26], kVar);
    }

    public final boolean u() {
        k kVar = this.a;
        return ((Boolean) kVar.j.a(k.f13005W[8], kVar)).booleanValue();
    }

    public final String w(InterfaceC0276j interfaceC0276j) {
        InterfaceC0276j interfaceC0276jV;
        String str;
        i.f(interfaceC0276j, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        interfaceC0276j.k0(new p081i3.b(this, 5), sb);
        k kVar = this.a;
        j jVar = kVar.f13028c;
        C8.u[] uVarArr = k.f13005W;
        if (((Boolean) jVar.a(uVarArr[1], kVar)).booleanValue() && !(interfaceC0276j instanceof L8.D) && !(interfaceC0276j instanceof H) && (interfaceC0276jV = interfaceC0276j.v()) != null && !(interfaceC0276jV instanceof InterfaceC0290y)) {
            sb.append(" ");
            int iOrdinal = s().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            p096j9.e eVarG = e.g(interfaceC0276jV);
            i.e(eVarG, "getFqName(containingDeclaration)");
            sb.append(eVarG.a.isEmpty() ? "root package" : o(p181s3.a.r(eVarG.e())));
            if (((Boolean) kVar.f13029d.a(uVarArr[2], kVar)).booleanValue() && (interfaceC0276jV instanceof L8.D) && (interfaceC0276j instanceof InterfaceC0277k)) {
                ((InterfaceC0277k) interfaceC0276j).g().getClass();
            }
        }
        String string = sb.toString();
        i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String x(M8.b bVar, M8.d dVar) {
        C0355k c0355kU0;
        List listH0;
        i.f(bVar, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (dVar != null) {
            sb.append(dVar.f3195s + ':');
        }
        AbstractC0151y type = bVar.getType();
        sb.append(Y(type));
        k kVar = this.a;
        C8.u[] uVarArr = k.f13005W;
        C8.u uVar = uVarArr[37];
        j jVar = kVar.f13018M;
        if (((a) jVar.a(uVar, kVar)).f12970s) {
            Map mapB = bVar.b();
            List list = null;
            InterfaceC0271e interfaceC0271eD = ((Boolean) kVar.f13013H.a(uVarArr[32], kVar)).booleanValue() ? p165q9.d.d(bVar) : null;
            if (interfaceC0271eD != null && (c0355kU0 = interfaceC0271eD.u0()) != null && (listH0 = c0355kU0.H0()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listH0) {
                    if (((U) obj).a1()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(m.H(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((U) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = s.f12328s;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                p096j9.f fVar = (p096j9.f) obj2;
                i.e(fVar, "it");
                if (!mapB.containsKey(fVar)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(m.H(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((p096j9.f) it2.next()).g() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapB.entrySet();
            ArrayList arrayList5 = new ArrayList(m.H(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                p096j9.f fVar2 = (p096j9.f) entry.getKey();
                p145o9.g gVar = (p145o9.g) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fVar2.g());
                sb2.append(" = ");
                sb2.append(!list.contains(fVar2) ? B(gVar) : "...");
                arrayList5.add(sb2.toString());
            }
            List listN0 = k.n0(k.g0(arrayList4, arrayList5));
            if (((a) jVar.a(k.f13005W[37], kVar)).f12971t || !listN0.isEmpty()) {
                k.Y(listN0, sb, ", ", "(", ")", null, 112);
            }
        }
        if (u() && (AbstractC0130c.j(type) || (type.D().w() instanceof L8.B))) {
            sb.append(" /* annotation class not found */");
        }
        String string = sb.toString();
        i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void y(StringBuilder sb, M8.a aVar, M8.d dVar) {
        if (q().contains(h.ANNOTATIONS)) {
            boolean z6 = aVar instanceof AbstractC0151y;
            k kVar = this.a;
            Set setI = z6 ? kVar.i() : (Set) kVar.f13015J.a(k.f13005W[34], kVar);
            p200u8.b bVar = (p200u8.b) kVar.f13017L.a(k.f13005W[36], kVar);
            for (M8.b bVar2 : aVar.q()) {
                if (!k.O(setI, bVar2.a()) && !i.a(bVar2.a(), I8.n.f2180r) && (bVar == null || ((Boolean) bVar.invoke(bVar2)).booleanValue())) {
                    sb.append(x(bVar2, dVar));
                    if (((Boolean) kVar.f13014I.a(k.f13005W[33], kVar)).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }
}
