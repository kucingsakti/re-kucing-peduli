package Y8;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.S;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.M;
import L8.P;
import O8.U;
import R8.AbstractC0408c;
import R8.C0409d;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p188t1.Y;

/* JADX INFO: renamed from: Y8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0477f implements M8.b, W8.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f5744h;
    public final Fa.e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0409d f5745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p247z9.h f5746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p247z9.i f5747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q8.f f5748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p247z9.i f5749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5750g;

    static {
        p210v8.v vVar = p210v8.u.a;
        f5744h = new C8.u[]{vVar.f(new p210v8.n(vVar.b(C0477f.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), vVar.f(new p210v8.n(vVar.b(C0477f.class), com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY, "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), vVar.f(new p210v8.n(vVar.b(C0477f.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public C0477f(Fa.e eVar, C0409d c0409d, boolean z6) {
        p210v8.i.f(eVar, "c");
        p210v8.i.f(c0409d, "javaAnnotation");
        this.a = eVar;
        this.f5745b = c0409d;
        I4.a aVar = (I4.a) eVar.f1659t;
        p247z9.l lVar = (p247z9.l) aVar.a;
        C0476e c0476e = new C0476e(this, 1);
        lVar.getClass();
        this.f5746c = new p247z9.h(lVar, c0476e);
        C0476e c0476e2 = new C0476e(this, 2);
        lVar.getClass();
        this.f5747d = new p247z9.i(lVar, c0476e2);
        this.f5748e = ((Q8.d) aVar.j).a(c0409d);
        C0476e c0476e3 = new C0476e(this, 0);
        lVar.getClass();
        this.f5749f = new p247z9.i(lVar, c0476e3);
        this.f5750g = z6;
    }

    @Override // M8.b
    public final p096j9.c a() {
        p247z9.h hVar = this.f5746c;
        C8.u uVar = f5744h[0];
        p210v8.i.f(hVar, "<this>");
        p210v8.i.f(uVar, R5.a.PUSH_MINIFIED_BUTTON_ICON);
        return (p096j9.c) hVar.invoke();
    }

    @Override // M8.b
    public final Map b() {
        return (Map) J7.j.o(this.f5749f, f5744h[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p145o9.g c(p009a9.a aVar) {
        p009a9.d hVar;
        AbstractC0151y abstractC0151yH;
        if (aVar instanceof R8.u) {
            return p145o9.h.a.b(null, ((R8.u) aVar).f4477b);
        }
        if (aVar instanceof R8.s) {
            R8.s sVar = (R8.s) aVar;
            Class<?> enclosingClass = sVar.f4476b.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            p210v8.i.e(enclosingClass, "enumClass");
            return new p145o9.i(AbstractC0408c.a(enclosingClass), p096j9.f.j(sVar.f4476b.name()));
        }
        boolean z6 = aVar instanceof R8.g;
        Fa.e eVar = this.a;
        if (z6) {
            R8.g gVar = (R8.g) aVar;
            p096j9.f fVar = gVar.a;
            if (fVar == null) {
                fVar = U8.x.f4994b;
            }
            p210v8.i.e(fVar, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            ArrayList arrayListA = gVar.a();
            A9.D d3 = (A9.D) J7.j.o(this.f5747d, f5744h[1]);
            p210v8.i.e(d3, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
            if (!AbstractC0130c.j(d3)) {
                InterfaceC0271e interfaceC0271eD = p165q9.d.d(this);
                p210v8.i.c(interfaceC0271eD);
                U uL = Y.l(fVar, interfaceC0271eD);
                if (uL == null || (abstractC0151yH = uL.getType()) == null) {
                    abstractC0151yH = ((O8.C) ((I4.a) eVar.f1659t).f2059o).f3622v.h(C9.i.c(C9.h.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                }
                ArrayList arrayList = new ArrayList(p086i8.m.H(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    p145o9.g gVarC = c((p009a9.a) it.next());
                    if (gVarC == null) {
                        gVarC = new p145o9.t(null);
                    }
                    arrayList.add(gVarC);
                }
                return new p145o9.w(arrayList, abstractC0151yH);
            }
        } else {
            if (aVar instanceof R8.f) {
                return new p145o9.a((Object) new C0477f(eVar, new C0409d(((R8.f) aVar).f4465b), false));
            }
            if (aVar instanceof R8.o) {
                Class cls = ((R8.o) aVar).f4474b;
                if (cls.isPrimitive()) {
                    hVar = new R8.y(cls);
                } else if ((cls instanceof GenericArrayType) || cls.isArray()) {
                    hVar = new R8.h(cls);
                } else {
                    hVar = cls instanceof WildcardType ? new R8.D((WildcardType) cls) : new R8.p(cls);
                }
                AbstractC0151y abstractC0151yP = ((Y1.c) eVar.f1663x).P(hVar, C8.E.A(2, false, null, 7));
                if (!AbstractC0130c.j(abstractC0151yP)) {
                    AbstractC0151y abstractC0151yB = abstractC0151yP;
                    int i10 = 0;
                    while (I8.i.y(abstractC0151yB)) {
                        abstractC0151yB = ((S) p086i8.k.k0(abstractC0151yB.l())).b();
                        p210v8.i.e(abstractC0151yB, "type.arguments.single().type");
                        i10++;
                    }
                    InterfaceC0273g interfaceC0273gW = abstractC0151yB.D().w();
                    if (interfaceC0273gW instanceof InterfaceC0271e) {
                        p096j9.b bVarF = p165q9.d.f(interfaceC0273gW);
                        return bVarF == null ? new p145o9.r(new p145o9.o(abstractC0151yP)) : new p145o9.r(bVarF, i10);
                    }
                    if (interfaceC0273gW instanceof P) {
                        return new p145o9.r(p096j9.b.j(I8.n.a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // M8.b
    public final M g() {
        return this.f5748e;
    }

    @Override // M8.b
    public final AbstractC0151y getType() {
        return (A9.D) J7.j.o(this.f5747d, f5744h[1]);
    }

    public final String toString() {
        return p114l9.g.f12982c.x(this, null);
    }
}
