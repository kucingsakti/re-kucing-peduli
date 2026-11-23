package p238y9;

import A9.D;
import A9.O;
import I4.c;
import J7.j;
import L8.C0280n;
import L8.InterfaceC0276j;
import L8.K;
import L8.L;
import L8.M;
import L8.N;
import O8.AbstractC0346b;
import O8.C0355k;
import O8.x;
import V3.b;
import Y8.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p.b1;
import p047e9.A;
import p047e9.C0618j;
import p047e9.EnumC0617i;
import p047e9.Q;
import p047e9.X;
import p047e9.e0;
import p047e9.f0;
import p067g9.a;
import p067g9.e;
import p067g9.f;
import p165q9.d;
import p220w9.r;
import p220w9.t;
import p247z9.i;
import p247z9.l;
import t9.m;
import t9.n;
import t9.o;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0346b implements InterfaceC0276j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f16064A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0280n f16065B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f16066C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final b f16067D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final o f16068E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final h f16069F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final L f16070G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final o1.h f16071H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final InterfaceC0276j f16072I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final p247z9.h f16073J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final i f16074K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final i f16075L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p247z9.h f16076M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final r f16077N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final M8.h f16078O;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0618j f16079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f16080x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final M f16081y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p096j9.b f16082z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, C0618j c0618j, f fVar, a aVar, M m2) {
        int i10;
        super((l) ((c) bVar.a).a, J7.a.e(fVar, c0618j.f11128w).i());
        int i11 = 4;
        int i12 = 5;
        int i13 = 3;
        int i14 = 1;
        int i15 = 2;
        p210v8.i.f(bVar, "outerContext");
        p210v8.i.f(c0618j, "classProto");
        p210v8.i.f(fVar, "nameResolver");
        p210v8.i.f(m2, "sourceElement");
        this.f16079w = c0618j;
        this.f16080x = aVar;
        this.f16081y = m2;
        this.f16082z = J7.a.e(fVar, c0618j.f11128w);
        this.f16064A = p220w9.i.e((A) e.f11565e.c(c0618j.f11127v));
        this.f16065B = j.i((f0) e.f11564d.c(c0618j.f11127v));
        EnumC0617i enumC0617i = (EnumC0617i) e.f11566f.c(c0618j.f11127v);
        switch (enumC0617i == null ? -1 : t.f15691b[enumC0617i.ordinal()]) {
            case 2:
                i10 = 2;
                break;
            case 3:
                i10 = 3;
                break;
            case 4:
                i10 = 4;
                break;
            case 5:
                i10 = 5;
                break;
            case 6:
            case 7:
                i10 = 6;
                break;
            default:
                i10 = 1;
                break;
        }
        this.f16066C = i10;
        List list = c0618j.f11130y;
        p210v8.i.e(list, "classProto.typeParameterList");
        X x8 = c0618j.f11120W;
        p210v8.i.e(x8, "classProto.typeTable");
        p067g9.g gVar = new p067g9.g(x8);
        p067g9.h hVar = p067g9.h.f11586b;
        e0 e0Var = c0618j.f11122Y;
        p210v8.i.e(e0Var, "classProto.versionRequirementTable");
        b bVarC = bVar.c(this, list, fVar, gVar, C3.b.h(e0Var), aVar);
        this.f16067D = bVarC;
        c cVar = (c) bVarC.a;
        this.f16068E = i10 == 3 ? new t9.r((l) cVar.a, this) : m.f15259b;
        this.f16069F = new h(this);
        N n10 = L.f2796d;
        l lVar = (l) cVar.a;
        ((B9.m) ((B9.l) cVar.f2093q)).getClass();
        Y8.l lVar2 = new Y8.l(i14, i15, this);
        n10.getClass();
        p210v8.i.f(lVar, "storageManager");
        this.f16070G = new L(this, lVar, lVar2);
        this.f16071H = i10 == 3 ? new o1.h(this) : null;
        InterfaceC0276j interfaceC0276j = (InterfaceC0276j) bVar.f5173c;
        this.f16072I = interfaceC0276j;
        l lVar3 = (l) cVar.a;
        f fVar2 = new f(this, i11);
        lVar3.getClass();
        this.f16073J = new p247z9.h(lVar3, fVar2);
        this.f16074K = new i(lVar3, new f(this, i13));
        new p247z9.h(lVar3, new f(this, i15));
        this.f16075L = new i(lVar3, new f(this, i12));
        this.f16076M = new p247z9.h(lVar3, new f(this, 6));
        g gVar2 = interfaceC0276j instanceof g ? (g) interfaceC0276j : null;
        this.f16077N = new r(c0618j, (f) bVarC.f5172b, (p067g9.g) bVarC.f5174d, m2, gVar2 != null ? gVar2.f16077N : null);
        this.f16078O = !e.f11563c.c(c0618j.f11127v).booleanValue() ? M8.g.a : new s(lVar3, new f(this, i14));
    }

    @Override // L8.InterfaceC0288w
    public final boolean C0() {
        return false;
    }

    @Override // L8.InterfaceC0288w
    public final boolean F() {
        return e.f11569i.c(this.f16079w.f11127v).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // O8.AbstractC0346b, L8.InterfaceC0271e
    public final List F0() {
        b bVar = this.f16067D;
        p067g9.g gVar = (p067g9.g) bVar.f5174d;
        C0618j c0618j = this.f16079w;
        p210v8.i.f(c0618j, "<this>");
        List list = c0618j.f11103E;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = c0618j.f11104F;
            p210v8.i.e(list2, "contextReceiverTypeIdList");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(p086i8.m.H(list3, 10));
            for (Integer num : list3) {
                p210v8.i.e(num, "it");
                arrayList.add(gVar.a(num.intValue()));
            }
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(new x(M0(), new p201u9.a(this, ((b1) bVar.f5178h).h((Q) it.next()), (p096j9.f) null), M8.g.a));
        }
        return arrayList2;
    }

    @Override // L8.InterfaceC0273g
    public final O I() {
        return this.f16069F;
    }

    @Override // L8.InterfaceC0271e
    public final boolean L0() {
        return e.f11568h.c(this.f16079w.f11127v).booleanValue();
    }

    @Override // L8.InterfaceC0271e
    public final int M() {
        return this.f16066C;
    }

    @Override // L8.InterfaceC0271e
    public final boolean N() {
        return e.f11566f.c(this.f16079w.f11127v) == EnumC0617i.COMPANION_OBJECT;
    }

    @Override // L8.InterfaceC0271e
    public final boolean T() {
        return e.f11571l.c(this.f16079w.f11127v).booleanValue();
    }

    @Override // O8.B
    public final n b(B9.f fVar) {
        L l4 = this.f16070G;
        d.j(l4.a);
        return (n) j.o(l4.f2799c, L.f2797e[0]);
    }

    @Override // L8.InterfaceC0271e
    public final Collection e0() {
        return (Collection) this.f16075L.invoke();
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0279m, L8.InterfaceC0288w
    public final C0280n f() {
        return this.f16065B;
    }

    @Override // L8.InterfaceC0277k
    public final M g() {
        return this.f16081y;
    }

    @Override // L8.InterfaceC0271e
    public final boolean h0() {
        return e.f11570k.c(this.f16079w.f11127v).booleanValue() && this.f16080x.a(1, 4, 2);
    }

    @Override // L8.InterfaceC0288w
    public final boolean i0() {
        return e.j.c(this.f16079w.f11127v).booleanValue();
    }

    public final e l() {
        ((B9.m) ((B9.l) ((c) this.f16067D.a).f2093q)).getClass();
        L l4 = this.f16070G;
        d.j(l4.a);
        return (e) ((n) j.o(l4.f2799c, L.f2797e[0]));
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0288w
    public final int m() {
        return this.f16064A;
    }

    @Override // L8.InterfaceC0271e
    public final Collection n() {
        return (Collection) this.f16074K.invoke();
    }

    public final D o(p096j9.f fVar) {
        Iterator it = l().b(fVar, T8.b.f4765y).iterator();
        boolean z6 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z6) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((K) next).R() == null) {
                if (!z6) {
                    z6 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        K k3 = (K) obj;
        return (D) (k3 != null ? k3.getType() : null);
    }

    @Override // M8.a
    public final M8.h q() {
        return this.f16078O;
    }

    @Override // L8.InterfaceC0274h
    public final boolean r() {
        return e.f11567g.c(this.f16079w.f11127v).booleanValue();
    }

    @Override // L8.InterfaceC0271e
    public final L8.Q t0() {
        return (L8.Q) this.f16076M.invoke();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(i0() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // L8.InterfaceC0271e
    public final boolean u() {
        if (!e.f11570k.c(this.f16079w.f11127v).booleanValue()) {
            return false;
        }
        a aVar = this.f16080x;
        int i10 = aVar.f11543b;
        if (i10 >= 1) {
            if (i10 > 1) {
                return false;
            }
            int i11 = aVar.f11544c;
            if (i11 >= 4 && (i11 > 4 || aVar.f11545d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // L8.InterfaceC0271e
    public final C0355k u0() {
        return (C0355k) this.f16073J.invoke();
    }

    @Override // L8.InterfaceC0276j
    public final InterfaceC0276j v() {
        return this.f16072I;
    }

    @Override // L8.InterfaceC0271e
    public final n v0() {
        return this.f16068E;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0274h
    public final List y() {
        return ((b1) this.f16067D.f5178h).b();
    }
}
