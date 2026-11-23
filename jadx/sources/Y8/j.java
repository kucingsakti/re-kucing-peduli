package Y8;

import A9.O;
import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.L;
import L8.N;
import L8.Q;
import L8.Y;
import L8.b0;
import L8.e0;
import O8.AbstractC0356l;
import O8.C0355k;
import Q3.u0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0356l implements W8.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC0271e f5756A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Fa.e f5757B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p076h8.j f5758C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f5759D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f5760E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final e0 f5761F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f5762G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final h f5763H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final p f5764I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final L f5765J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final t9.i f5766K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final D f5767L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final X8.b f5768M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final p247z9.i f5769N;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Fa.e f5770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final R8.n f5771z;

    static {
        p086i8.C.x("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Illegal instructions before constructor call */
    public j(Fa.e eVar, InterfaceC0276j interfaceC0276j, R8.n nVar, InterfaceC0271e interfaceC0271e) throws IllegalAccessException, InvocationTargetException {
        p210v8.i.f(eVar, "outerContext");
        p210v8.i.f(interfaceC0276j, "containingDeclaration");
        p210v8.i.f(nVar, "jClass");
        I4.a aVar = (I4.a) eVar.f1659t;
        p247z9.l lVar = (p247z9.l) aVar.a;
        Class cls = nVar.a;
        super(lVar, interfaceC0276j, p096j9.f.j(cls.getSimpleName()), ((Q8.d) aVar.j).a(nVar));
        this.f5770y = eVar;
        this.f5771z = nVar;
        this.f5756A = interfaceC0271e;
        int i10 = 4;
        Fa.e eVarD = J7.j.d(eVar, this, nVar, 4);
        this.f5757B = eVarD;
        I4.a aVar2 = (I4.a) eVarD.f1659t;
        ((V8.h) aVar2.f2052g).getClass();
        this.f5758C = D3.b.s(new g(this, 2));
        this.f5759D = cls.isAnnotation() ? 5 : cls.isInterface() ? 2 : cls.isEnum() ? 3 : 1;
        if (cls.isAnnotation() || cls.isEnum()) {
            i10 = 1;
        } else {
            boolean zG = nVar.g();
            boolean z6 = nVar.g() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            if (zG) {
                i10 = 2;
            } else if (!z6) {
                if (zIsFinal) {
                    i10 = 1;
                } else {
                    i10 = 3;
                }
            }
        }
        this.f5760E = i10;
        int modifiers = cls.getModifiers();
        this.f5761F = Modifier.isPublic(modifiers) ? b0.f2810v : Modifier.isPrivate(modifiers) ? Y.f2807v : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? P8.c.f3901v : P8.b.f3900v : P8.a.f3899v;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.f5762G = ((declaringClass != null ? new R8.n(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.f5763H = new h(this);
        p pVar = new p(eVarD, this, nVar, interfaceC0271e != null, null);
        this.f5764I = pVar;
        N n10 = L.f2796d;
        p247z9.l lVar2 = (p247z9.l) aVar2.a;
        ((B9.m) aVar2.f2065u).getClass();
        A0.m mVar = new A0.m(this, 23);
        n10.getClass();
        p210v8.i.f(lVar2, "storageManager");
        this.f5765J = new L(this, lVar2, mVar);
        this.f5766K = new t9.i(pVar);
        this.f5767L = new D(eVarD, nVar, this);
        this.f5768M = u0.k(eVarD, nVar);
        g gVar = new g(this, 1);
        lVar2.getClass();
        this.f5769N = new p247z9.i(lVar2, gVar);
    }

    @Override // L8.InterfaceC0288w
    public final boolean C0() {
        return false;
    }

    @Override // L8.InterfaceC0273g
    public final O I() {
        return this.f5763H;
    }

    @Override // L8.InterfaceC0271e
    public final boolean L0() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final int M() {
        return this.f5759D;
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
        L l4 = this.f5765J;
        p165q9.d.j(l4.a);
        return (p) ((t9.n) J7.j.o(l4.f2799c, L.f2797e[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [i8.s, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // L8.InterfaceC0271e
    public final Collection e0() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        ?? arrayList = p086i8.s.f12328s;
        if (this.f5760E != 2) {
            return arrayList;
        }
        Z8.a aVarA = C8.E.A(2, false, null, 7);
        Class cls = this.f5771z.a;
        p210v8.i.f(cls, "clazz");
        Method method = (Method) oa.b.i().f13642t;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(cls, new Object[0]);
            p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr != null) {
            arrayList = new ArrayList(clsArr.length);
            for (Class cls2 : clsArr) {
                arrayList.add(new R8.p(cls2));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Iterable) arrayList).iterator();
        while (it.hasNext()) {
            InterfaceC0273g interfaceC0273gW = ((Y1.c) this.f5757B.f1663x).P((R8.p) it.next(), aVarA).D().w();
            InterfaceC0271e interfaceC0271e = interfaceC0273gW instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gW : null;
            if (interfaceC0271e != null) {
                arrayList2.add(interfaceC0271e);
            }
        }
        return p086i8.k.o0(arrayList2, new i());
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0279m, L8.InterfaceC0288w
    public final C0280n f() {
        C0280n c0280n = AbstractC0281o.a;
        e0 e0Var = this.f5761F;
        if (p210v8.i.a(e0Var, c0280n)) {
            Class<?> declaringClass = this.f5771z.a.getDeclaringClass();
            if ((declaringClass != null ? new R8.n(declaringClass) : null) == null) {
                C0280n c0280n2 = U8.o.a;
                p210v8.i.e(c0280n2, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
                return c0280n2;
            }
        }
        return p068ga.d.F(e0Var);
    }

    @Override // L8.InterfaceC0271e
    public final boolean h0() {
        return false;
    }

    @Override // L8.InterfaceC0288w
    public final boolean i0() {
        return false;
    }

    public final p l() {
        return (p) super.z0();
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0288w
    public final int m() {
        return this.f5760E;
    }

    @Override // L8.InterfaceC0271e
    public final Collection n() {
        return (List) this.f5764I.f5789q.invoke();
    }

    @Override // M8.a
    public final M8.h q() {
        return this.f5768M;
    }

    @Override // L8.InterfaceC0274h
    public final boolean r() {
        return this.f5762G;
    }

    @Override // O8.AbstractC0346b, L8.InterfaceC0271e
    public final t9.n s0() {
        return this.f5766K;
    }

    @Override // L8.InterfaceC0271e
    public final Q t0() {
        return null;
    }

    public final String toString() {
        return "Lazy Java class " + p165q9.d.h(this);
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
    public final t9.n v0() {
        return this.f5767L;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0274h
    public final List y() {
        return (List) this.f5769N.invoke();
    }

    @Override // O8.AbstractC0346b, L8.InterfaceC0271e
    public final t9.n z0() {
        return (p) super.z0();
    }
}
