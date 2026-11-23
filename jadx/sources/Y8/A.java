package Y8;

import A1.J;
import A9.AbstractC0151y;
import A9.d0;
import L8.InterfaceC0276j;
import L8.P;
import O8.U;
import Q3.u0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends t9.o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f5712m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fa.e f5713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f5714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p247z9.c f5715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p247z9.i f5716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p247z9.e f5717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p247z9.j f5718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p247z9.e f5719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p247z9.i f5720i;
    public final p247z9.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p247z9.i f5721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p247z9.e f5722l;

    static {
        p210v8.v vVar = p210v8.u.a;
        f5712m = new C8.u[]{vVar.f(new p210v8.n(vVar.b(A.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), vVar.f(new p210v8.n(vVar.b(A.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), vVar.f(new p210v8.n(vVar.b(A.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public A(Fa.e eVar, p pVar) {
        p210v8.i.f(eVar, "c");
        this.f5713b = eVar;
        this.f5714c = pVar;
        p247z9.l lVar = (p247z9.l) ((I4.a) eVar.f1659t).a;
        y yVar = new y(this, 0);
        lVar.getClass();
        this.f5715d = new p247z9.c(lVar, yVar);
        y yVar2 = new y(this, 2);
        lVar.getClass();
        this.f5716e = new p247z9.i(lVar, yVar2);
        this.f5717f = lVar.b(new z(this, 1));
        this.f5718g = lVar.c(new z(this, 0));
        this.f5719h = lVar.b(new z(this, 2));
        y yVar3 = new y(this, 3);
        lVar.getClass();
        this.f5720i = new p247z9.i(lVar, yVar3);
        y yVar4 = new y(this, 4);
        lVar.getClass();
        this.j = new p247z9.i(lVar, yVar4);
        y yVar5 = new y(this, 1);
        lVar.getClass();
        this.f5721k = new p247z9.i(lVar, yVar5);
        this.f5722l = lVar.b(new z(this, 3));
    }

    public static AbstractC0151y l(R8.w wVar, Fa.e eVar) {
        p210v8.i.f(wVar, "method");
        Class<?> declaringClass = ((Method) wVar.b()).getDeclaringClass();
        p210v8.i.e(declaringClass, "member.declaringClass");
        Z8.a aVarA = C8.E.A(2, declaringClass.isAnnotation(), null, 6);
        return ((Y1.c) eVar.f1663x).P(wVar.f(), aVarA);
    }

    public static J u(Fa.e eVar, O8.w wVar, List list) {
        p076h8.f fVar;
        p096j9.f fVarI;
        K9.r rVarY0 = p086i8.k.y0(list);
        ArrayList arrayList = new ArrayList(p086i8.m.H(rVarY0, 10));
        Iterator it = rVarY0.iterator();
        boolean z6 = false;
        while (true) {
            K9.b bVar = (K9.b) it;
            if (!bVar.f2675t.hasNext()) {
                return new J(p086i8.k.s0(arrayList), z6, 7);
            }
            p086i8.v vVar = (p086i8.v) bVar.next();
            int i10 = vVar.a;
            R8.C c10 = (R8.C) vVar.f12331b;
            X8.b bVarK = u0.k(eVar, c10);
            Z8.a aVarA = C8.E.A(2, false, null, 7);
            I4.a aVar = (I4.a) eVar.f1659t;
            R8.A a = c10.a;
            boolean z10 = c10.f4455d;
            Y1.c cVar = (Y1.c) eVar.f1663x;
            O8.C c11 = (O8.C) aVar.f2059o;
            if (z10) {
                R8.h hVar = a instanceof R8.h ? (R8.h) a : null;
                if (hVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + c10);
                }
                d0 d0VarO = cVar.O(hVar, aVarA, true);
                fVar = new p076h8.f(d0VarO, c11.f3622v.f(d0VarO));
            } else {
                fVar = new p076h8.f(cVar.P(a, aVarA), null);
            }
            AbstractC0151y abstractC0151y = (AbstractC0151y) fVar.f11789s;
            AbstractC0151y abstractC0151y2 = (AbstractC0151y) fVar.f11790t;
            if (p210v8.i.a(wVar.getName().g(), "equals") && list.size() == 1 && c11.f3622v.o().equals(abstractC0151y)) {
                fVarI = p096j9.f.j("other");
            } else {
                String str = c10.f4454c;
                fVarI = str != null ? p096j9.f.i(str) : null;
                if (fVarI == null) {
                    z6 = true;
                }
                if (fVarI == null) {
                    fVarI = p096j9.f.j(R5.a.PUSH_MINIFIED_BUTTON_ICON + i10);
                }
            }
            arrayList.add(new U(wVar, null, i10, bVarK, fVarI, abstractC0151y, false, false, false, abstractC0151y2, ((Q8.d) aVar.j).a(c10)));
        }
    }

    @Override // t9.o, t9.n
    public Collection b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return !e().contains(fVar) ? p086i8.s.f12328s : (Collection) this.f5722l.invoke(fVar);
    }

    @Override // t9.o, t9.n
    public Collection c(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        return !d().contains(fVar) ? p086i8.s.f12328s : (Collection) this.f5719h.invoke(fVar);
    }

    @Override // t9.o, t9.n
    public final Set d() {
        return (Set) J7.j.o(this.f5720i, f5712m[0]);
    }

    @Override // t9.o, t9.n
    public final Set e() {
        return (Set) J7.j.o(this.j, f5712m[1]);
    }

    @Override // t9.o, t9.p
    public Collection f(t9.f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        return (Collection) this.f5715d.invoke();
    }

    @Override // t9.o, t9.n
    public final Set g() {
        return (Set) J7.j.o(this.f5721k, f5712m[2]);
    }

    public abstract Set h(t9.f fVar, t9.k kVar);

    public abstract Set i(t9.f fVar, t9.k kVar);

    public void j(p096j9.f fVar, ArrayList arrayList) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
    }

    public abstract InterfaceC0474c k();

    public abstract void m(LinkedHashSet linkedHashSet, p096j9.f fVar);

    public abstract void n(p096j9.f fVar, ArrayList arrayList);

    public abstract Set o(t9.f fVar);

    public abstract O8.x p();

    public abstract InterfaceC0276j q();

    public boolean r(W8.f fVar) {
        return true;
    }

    public abstract x s(R8.w wVar, ArrayList arrayList, AbstractC0151y abstractC0151y, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [h8.d, java.lang.Object] */
    public final W8.f t(R8.w wVar) {
        p210v8.i.f(wVar, "method");
        Fa.e eVar = this.f5713b;
        int i10 = 1;
        W8.f fVarO1 = W8.f.o1(q(), u0.k(eVar, wVar), wVar.c(), ((Q8.d) ((I4.a) eVar.f1659t).j).a(wVar), ((InterfaceC0474c) this.f5716e.invoke()).f(wVar.c()) != null && ((ArrayList) wVar.g()).isEmpty());
        p210v8.i.f(eVar, "<this>");
        Fa.e eVar2 = new Fa.e((I4.a) eVar.f1659t, new I.D(eVar, fVarO1, wVar, 0), eVar.f1661v);
        ArrayList arrayListZ = wVar.z();
        ArrayList arrayList = new ArrayList(p086i8.m.H(arrayListZ, 10));
        Iterator it = arrayListZ.iterator();
        while (it.hasNext()) {
            P pA = ((X8.d) eVar2.f1660u).a((R8.B) it.next());
            p210v8.i.c(pA);
            arrayList.add(pA);
        }
        J jU = u(eVar2, fVarO1, wVar.g());
        x xVarS = s(wVar, arrayList, l(wVar, eVar2), (List) jU.f76u);
        O8.x xVarP = p();
        p086i8.s sVar = p086i8.s.f12328s;
        boolean zIsAbstract = Modifier.isAbstract(((Method) wVar.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) wVar.b()).getModifiers());
        if (zIsAbstract) {
            i10 = 4;
        } else if (!zIsFinal) {
            i10 = 3;
        }
        fVarO1.n1(null, xVarP, sVar, xVarS.f5812c, xVarS.f5811b, xVarS.a, i10, p068ga.d.F(wVar.e()), p086i8.t.f12329s);
        fVarO1.p1(false, jU.f75t);
        if (xVarS.f5813d.isEmpty()) {
            return fVarO1;
        }
        ((V8.h) ((I4.a) eVar2.f1659t).f2050e).getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
