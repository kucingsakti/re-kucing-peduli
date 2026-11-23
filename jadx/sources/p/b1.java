package p;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.C0136i;
import A9.C0140m;
import L8.InterfaceC0268b;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0290y;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements p029c9.k, k2.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f14037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f14038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f14039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f14040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f14041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f14042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f14043z;

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f14036s = i10;
        this.f14037t = obj;
        this.f14038u = obj2;
        this.f14039v = obj3;
        this.f14040w = obj4;
        this.f14041x = obj5;
        this.f14042y = obj6;
        this.f14043z = obj7;
    }

    public static A9.D a(A9.D d3, AbstractC0151y abstractC0151y) {
        I8.i iVarL = qa.b.l(d3);
        M8.h hVarQ = d3.q();
        AbstractC0151y abstractC0151yP = com.bumptech.glide.d.p(d3);
        List listN = com.bumptech.glide.d.n(d3);
        List listQ = p086i8.k.Q(com.bumptech.glide.d.r(d3));
        ArrayList arrayList = new ArrayList(p086i8.m.H(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((A9.S) it.next()).b());
        }
        return com.bumptech.glide.d.h(iVarL, hVarQ, abstractC0151yP, listN, arrayList, abstractC0151y, true).G0(d3.H());
    }

    public static b1 c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) oa.b.c(viewInflate, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.cl;
            if (((CoordinatorLayout) oa.b.c(viewInflate, R.id.cl)) != null) {
                DrawerLayout drawerLayout = (DrawerLayout) viewInflate;
                i10 = R.id.iv_home_logo;
                ImageView imageView = (ImageView) oa.b.c(viewInflate, R.id.iv_home_logo);
                if (imageView != null) {
                    i10 = R.id.iv_nav_drawer_bottom;
                    ImageView imageView2 = (ImageView) oa.b.c(viewInflate, R.id.iv_nav_drawer_bottom);
                    if (imageView2 != null) {
                        i10 = R.id.nav_host_fragment;
                        if (((FragmentContainerView) oa.b.c(viewInflate, R.id.nav_host_fragment)) != null) {
                            i10 = R.id.navigation_view;
                            NavigationView navigationView = (NavigationView) oa.b.c(viewInflate, R.id.navigation_view);
                            if (navigationView != null) {
                                i10 = R.id.navigations;
                                if (((BottomNavigationView) oa.b.c(viewInflate, R.id.navigations)) != null) {
                                    i10 = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) oa.b.c(viewInflate, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        return new b1(drawerLayout, appBarLayout, drawerLayout, imageView, imageView2, navigationView, materialToolbar, 1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    public static final ArrayList f(p047e9.Q q10, b1 b1Var) {
        List list = q10.f10884v;
        p210v8.i.e(list, "argumentList");
        List list2 = list;
        p047e9.Q qK = C3.a.k(q10, (p067g9.g) ((V3.b) b1Var.f14037t).f5174d);
        Iterable iterableF = qK != null ? f(qK, b1Var) : null;
        if (iterableF == null) {
            iterableF = p086i8.s.f12328s;
        }
        return p086i8.k.g0(list2, iterableF);
    }

    public static A9.K g(List list, M8.h hVar, A9.O o10, InterfaceC0276j interfaceC0276j) {
        A9.K kO;
        List list2 = list;
        ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((C0140m) it.next()).getClass();
            if (hVar.isEmpty()) {
                A9.K.f338t.getClass();
                kO = A9.K.f339u;
            } else {
                o1.c cVar = A9.K.f338t;
                List listU = com.bumptech.glide.d.u(new C0136i(hVar));
                cVar.getClass();
                kO = o1.c.o(listU);
            }
            arrayList.add(kO);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p086i8.q.J(arrayList2, (Iterable) it2.next());
        }
        A9.K.f338t.getClass();
        return o1.c.o(arrayList2);
    }

    public static final InterfaceC0271e i(b1 b1Var, p047e9.Q q10, int i10) {
        p096j9.b bVarE = J7.a.e((p067g9.f) ((V3.b) b1Var.f14037t).f5172b, i10);
        K9.u uVarZ = K9.n.z(K9.n.x(q10, new p220w9.w(b1Var, 2)), p220w9.y.f15696s);
        ArrayList arrayList = new ArrayList();
        Iterator it = uVarZ.a.iterator();
        while (it.hasNext()) {
            arrayList.add(uVarZ.f2710b.invoke(it.next()));
        }
        int iT = K9.n.t(K9.n.x(bVarE, p220w9.x.f15695A));
        while (arrayList.size() < iT) {
            arrayList.add(0);
        }
        return ((p140o4.r) ((I4.c) ((V3.b) b1Var.f14037t).a).f2088l).l(bVarE, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public List b() {
        return p086i8.k.s0(this.f14043z.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public L8.P d(int i10) {
        L8.P p10 = (L8.P) this.f14043z.get(Integer.valueOf(i10));
        if (p10 != null) {
            return p10;
        }
        b1 b1Var = (b1) this.f14038u;
        if (b1Var != null) {
            return b1Var.d(i10);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:103:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:111:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:112:0x0302  */
    /* JADX WARN: Code duplicated, block: B:115:0x0307  */
    /* JADX WARN: Code duplicated, block: B:143:0x037c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0388 A[PHI: r3
      0x0388: PHI (r3v10 A9.D) = (r3v8 A9.D), (r3v15 A9.D) binds: [B:148:0x03a3, B:142:0x037a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x038a  */
    /* JADX WARN: Code duplicated, block: B:147:0x039e  */
    /* JADX WARN: Code duplicated, block: B:150:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:154:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:158:0x03da  */
    /* JADX WARN: Code duplicated, block: B:160:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:163:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:165:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:46:0x013d  */
    /* JADX WARN: Code duplicated, block: B:49:0x017f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0189  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0201  */
    /* JADX WARN: Code duplicated, block: B:76:0x0208  */
    /* JADX WARN: Code duplicated, block: B:78:0x020c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0221  */
    /* JADX WARN: Code duplicated, block: B:99:0x02aa  */
    /* JADX WARN: Instruction removed from duplicated block: B:150:0x03a6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x01d8, please report this as an issue */
    public A9.D e(p047e9.Q q10, boolean z6) {
        A9.O oD;
        InterfaceC0273g interfaceC0273gI;
        Object next;
        I4.c cVar;
        A9.K kG;
        ArrayList arrayList;
        Iterator it;
        int i10;
        boolean zHasNext;
        p067g9.g gVar;
        List listS0;
        p047e9.Q q11;
        A9.D dR;
        A9.D dP;
        boolean z10;
        int size;
        InterfaceC0273g interfaceC0273gW;
        J8.e eVarO;
        A9.S s9;
        AbstractC0151y abstractC0151yB;
        int size2;
        int i11;
        p047e9.Q qA;
        Object next2;
        int i12;
        p047e9.O o10;
        L8.P p10;
        p047e9.N n10;
        int iOrdinal;
        int i13;
        int i14;
        p047e9.Q qA2;
        A9.S t7;
        int i15 = 1;
        p210v8.i.f(q10, "proto");
        boolean zO = q10.o();
        V3.b bVar = (V3.b) this.f14037t;
        if (zO) {
            if (J7.a.e((p067g9.f) bVar.f5172b, q10.f10871A).f12542c) {
                ((p220w9.i) ((I4.c) bVar.a).f2084g).getClass();
            }
        } else if ((q10.f10883u & 128) == 128) {
            if (J7.a.e((p067g9.f) bVar.f5172b, q10.f10874D).f12542c) {
                ((p220w9.i) ((I4.c) bVar.a).f2084g).getClass();
            }
        }
        if (q10.o()) {
            interfaceC0273gI = (InterfaceC0273g) ((p247z9.j) this.f14041x).invoke(Integer.valueOf(q10.f10871A));
            if (interfaceC0273gI == null) {
                interfaceC0273gI = i(this, q10, q10.f10871A);
            }
        } else {
            int i16 = q10.f10883u;
            if ((i16 & 32) == 32) {
                interfaceC0273gI = d(q10.f10872B);
                if (interfaceC0273gI == null) {
                    C9.i iVar = C9.i.a;
                    oD = C9.i.d(C9.h.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(q10.f10872B), (String) this.f14040w);
                }
            } else if ((i16 & 64) == 64) {
                String string = ((p067g9.f) bVar.f5172b).getString(q10.f10873C);
                Iterator it2 = b().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!p210v8.i.a(((L8.P) next).getName().g(), string));
                L8.P p11 = (L8.P) next;
                if (p11 == null) {
                    C9.i iVar2 = C9.i.a;
                    oD = C9.i.d(C9.h.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, ((InterfaceC0276j) bVar.f5173c).toString());
                } else {
                    interfaceC0273gI = p11;
                }
            } else if ((i16 & 128) == 128) {
                interfaceC0273gI = (InterfaceC0273g) ((p247z9.j) this.f14042y).invoke(Integer.valueOf(q10.f10874D));
                if (interfaceC0273gI == null) {
                    interfaceC0273gI = i(this, q10, q10.f10874D);
                }
            } else {
                C9.i iVar3 = C9.i.a;
                oD = C9.i.d(C9.h.UNKNOWN_TYPE, new String[0]);
            }
            if (C9.i.f(oD.w())) {
                C9.i iVar4 = C9.i.a;
                return C9.i.e(C9.h.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, p086i8.s.f12328s, oD, (String[]) Arrays.copyOf(new String[]{oD.toString()}, 1));
            }
            p238y9.a aVar = new p238y9.a((p247z9.l) ((I4.c) bVar.a).a, new A9.A(this, 29, q10));
            cVar = (I4.c) bVar.a;
            List list = (List) cVar.f2095s;
            InterfaceC0276j interfaceC0276j = (InterfaceC0276j) bVar.f5173c;
            kG = g(list, aVar, oD, interfaceC0276j);
            ArrayList arrayListF = f(q10, this);
            arrayList = new ArrayList(p086i8.m.H(arrayListF, 10));
            it = arrayListF.iterator();
            i10 = 0;
            while (true) {
                zHasNext = it.hasNext();
                gVar = (p067g9.g) bVar.f5174d;
                if (zHasNext) {
                    listS0 = p086i8.k.s0(arrayList);
                    InterfaceC0273g interfaceC0273gW2 = oD.w();
                    if (z6 || !(interfaceC0273gW2 instanceof p238y9.q)) {
                        q11 = null;
                        if (p067g9.e.a.c(q10.f10879I).booleanValue()) {
                            z10 = q10.f10885w;
                            size = oD.u().size() - listS0.size();
                            if (size == 0) {
                                dP = C0133f.r(kG, oD, listS0, z10);
                                interfaceC0273gW = dP.D().w();
                                if (interfaceC0273gW != null) {
                                    eVarO = com.bumptech.glide.d.o(interfaceC0273gW);
                                } else {
                                    eVarO = null;
                                }
                                if (eVarO == J8.e.f2454v || (s9 = (A9.S) p086i8.k.c0(com.bumptech.glide.d.r(dP))) == null || (abstractC0151yB = s9.b()) == null) {
                                    dP = null;
                                } else {
                                    InterfaceC0273g interfaceC0273gW3 = abstractC0151yB.D().w();
                                    p096j9.c cVarG = interfaceC0273gW3 != null ? p165q9.d.g(interfaceC0273gW3) : null;
                                    if (abstractC0151yB.l().size() == 1 && (p210v8.i.a(cVarG, I8.o.f2193f) || p210v8.i.a(cVarG, p220w9.z.a))) {
                                        AbstractC0151y abstractC0151yB2 = ((A9.S) p086i8.k.k0(abstractC0151yB.l())).b();
                                        p210v8.i.e(abstractC0151yB2, "continuationArgumentType.arguments.single().type");
                                        InterfaceC0268b interfaceC0268b = interfaceC0276j instanceof InterfaceC0268b ? (InterfaceC0268b) interfaceC0276j : null;
                                        dP = p210v8.i.a(interfaceC0268b != null ? p165q9.d.c(interfaceC0268b) : null, p220w9.v.a) ? a(dP, abstractC0151yB2) : a(dP, abstractC0151yB2);
                                    }
                                }
                            } else if (size != 1 && (size2 = listS0.size() - 1) >= 0) {
                                A9.O oI = oD.s().v(size2).I();
                                p210v8.i.e(oI, "functionTypeConstructor.…on(arity).typeConstructor");
                                dP = C0133f.r(kG, oI, listS0, z10);
                            } else {
                                dP = null;
                            }
                            if (dP == null) {
                                C9.i iVar5 = C9.i.a;
                                dR = C9.i.e(C9.h.INCONSISTENT_SUSPEND_FUNCTION, listS0, oD, new String[0]);
                            } else {
                                dR = dP;
                            }
                        } else {
                            dR = C0133f.r(kG, oD, listS0, q10.f10885w);
                            if (p067g9.e.f11562b.c(q10.f10879I).booleanValue()) {
                                dP = C0133f.p(dR, true);
                                if (dP == null) {
                                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + dR + '\'').toString());
                                }
                                dR = dP;
                            }
                        }
                    } else {
                        p238y9.q qVar = (p238y9.q) interfaceC0273gW2;
                        p210v8.i.f(qVar, "<this>");
                        C0133f c0133f = new C0133f();
                        q11 = null;
                        o1.m mVarE = AbstractC0130c.e(null, qVar, listS0);
                        A9.K.f338t.getClass();
                        A9.K k3 = A9.K.f339u;
                        p210v8.i.f(k3, "attributes");
                        A9.D dH = c0133f.h(mVarE, k3, false, 0, true);
                        List list2 = (List) cVar.f2095s;
                        ArrayList arrayListE0 = p086i8.k.e0(aVar, dH.q());
                        dR = dH.G0(A9.b0.e(dH) || q10.f10885w).N0(g(list2, arrayListE0.isEmpty() ? M8.g.a : new M8.i(arrayListE0, 0), oD, interfaceC0276j));
                    }
                    i11 = q10.f10883u;
                    if ((i11 & 1024) == 1024) {
                        qA = q10.f10877G;
                    } else if ((i11 & 2048) == 2048) {
                        qA = gVar.a(q10.f10878H);
                    } else {
                        qA = q11;
                    }
                    if (qA != null) {
                        dR = AbstractC0130c.A(dR, e(qA, false));
                    }
                    if (q10.o()) {
                        J7.a.e((p067g9.f) bVar.f5172b, q10.f10871A);
                        ((N8.a) cVar.f2094r).getClass();
                        p210v8.i.f(dR, "computedType");
                    }
                    return dR;
                }
                next2 = it.next();
                i12 = i10 + 1;
                if (i10 >= 0) {
                    p086i8.l.G();
                    throw null;
                }
                o10 = (p047e9.O) next2;
                List listU = oD.u();
                p210v8.i.e(listU, "constructor.parameters");
                p10 = (L8.P) p086i8.k.W(listU, i10);
                n10 = o10.f10849u;
                if (n10 == p047e9.N.STAR) {
                    p210v8.i.e(n10, "typeArgumentProto.projection");
                    iOrdinal = n10.ordinal();
                    if (iOrdinal != 0) {
                        i13 = 3;
                        if (iOrdinal != i15) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + n10);
                            }
                            i13 = 1;
                        }
                    } else {
                        i13 = 2;
                    }
                    i14 = o10.f10848t;
                    if ((i14 & 2) == 2) {
                        qA2 = o10.f10850v;
                    } else if ((i14 & 4) == 4) {
                        qA2 = gVar.a(o10.f10851w);
                    } else {
                        qA2 = null;
                    }
                    if (qA2 == null) {
                        t7 = new A9.T(1, C9.i.c(C9.h.NO_RECORDED_TYPE, o10.toString()));
                    } else {
                        t7 = new A9.T(i13, h(qA2));
                    }
                } else if (p10 == null) {
                    t7 = new A9.H(((InterfaceC0290y) cVar.f2079b).s());
                } else {
                    t7 = new A9.I(p10);
                }
                arrayList.add(t7);
                i10 = i12;
                i15 = 1;
            }
        }
        oD = interfaceC0273gI.I();
        p210v8.i.e(oD, "classifier.typeConstructor");
        if (C9.i.f(oD.w())) {
            C9.i iVar6 = C9.i.a;
            return C9.i.e(C9.h.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, p086i8.s.f12328s, oD, (String[]) Arrays.copyOf(new String[]{oD.toString()}, 1));
        }
        p238y9.a aVar2 = new p238y9.a((p247z9.l) ((I4.c) bVar.a).a, new A9.A(this, 29, q10));
        cVar = (I4.c) bVar.a;
        List list3 = (List) cVar.f2095s;
        InterfaceC0276j interfaceC0276j2 = (InterfaceC0276j) bVar.f5173c;
        kG = g(list3, aVar2, oD, interfaceC0276j2);
        ArrayList arrayListF2 = f(q10, this);
        arrayList = new ArrayList(p086i8.m.H(arrayListF2, 10));
        it = arrayListF2.iterator();
        i10 = 0;
        while (true) {
            zHasNext = it.hasNext();
            gVar = (p067g9.g) bVar.f5174d;
            if (zHasNext) {
                listS0 = p086i8.k.s0(arrayList);
                InterfaceC0273g interfaceC0273gW4 = oD.w();
                if (z6) {
                    q11 = null;
                    if (p067g9.e.a.c(q10.f10879I).booleanValue()) {
                        z10 = q10.f10885w;
                        size = oD.u().size() - listS0.size();
                        if (size == 0) {
                            dP = C0133f.r(kG, oD, listS0, z10);
                            interfaceC0273gW = dP.D().w();
                            if (interfaceC0273gW != null) {
                                eVarO = com.bumptech.glide.d.o(interfaceC0273gW);
                            } else {
                                eVarO = null;
                            }
                            if (eVarO == J8.e.f2454v) {
                                dP = null;
                            } else {
                                dP = null;
                            }
                        } else if (size != 1) {
                            dP = null;
                        } else {
                            A9.O oI2 = oD.s().v(size2).I();
                            p210v8.i.e(oI2, "functionTypeConstructor.…on(arity).typeConstructor");
                            dP = C0133f.r(kG, oI2, listS0, z10);
                        }
                        if (dP == null) {
                            C9.i iVar7 = C9.i.a;
                            dR = C9.i.e(C9.h.INCONSISTENT_SUSPEND_FUNCTION, listS0, oD, new String[0]);
                        } else {
                            dR = dP;
                        }
                    } else {
                        dR = C0133f.r(kG, oD, listS0, q10.f10885w);
                        if (p067g9.e.f11562b.c(q10.f10879I).booleanValue()) {
                            dP = C0133f.p(dR, true);
                            if (dP == null) {
                                throw new IllegalStateException(("null DefinitelyNotNullType for '" + dR + '\'').toString());
                            }
                            dR = dP;
                        }
                    }
                } else {
                    q11 = null;
                    if (p067g9.e.a.c(q10.f10879I).booleanValue()) {
                        z10 = q10.f10885w;
                        size = oD.u().size() - listS0.size();
                        if (size == 0) {
                            dP = C0133f.r(kG, oD, listS0, z10);
                            interfaceC0273gW = dP.D().w();
                            if (interfaceC0273gW != null) {
                                eVarO = com.bumptech.glide.d.o(interfaceC0273gW);
                            } else {
                                eVarO = null;
                            }
                            if (eVarO == J8.e.f2454v) {
                                dP = null;
                            } else {
                                dP = null;
                            }
                        } else if (size != 1) {
                            dP = null;
                        } else {
                            A9.O oI3 = oD.s().v(size2).I();
                            p210v8.i.e(oI3, "functionTypeConstructor.…on(arity).typeConstructor");
                            dP = C0133f.r(kG, oI3, listS0, z10);
                        }
                        if (dP == null) {
                            C9.i iVar8 = C9.i.a;
                            dR = C9.i.e(C9.h.INCONSISTENT_SUSPEND_FUNCTION, listS0, oD, new String[0]);
                        } else {
                            dR = dP;
                        }
                    } else {
                        dR = C0133f.r(kG, oD, listS0, q10.f10885w);
                        if (p067g9.e.f11562b.c(q10.f10879I).booleanValue()) {
                            dP = C0133f.p(dR, true);
                            if (dP == null) {
                                throw new IllegalStateException(("null DefinitelyNotNullType for '" + dR + '\'').toString());
                            }
                            dR = dP;
                        }
                    }
                }
                i11 = q10.f10883u;
                if ((i11 & 1024) == 1024) {
                    qA = q10.f10877G;
                } else if ((i11 & 2048) == 2048) {
                    qA = gVar.a(q10.f10878H);
                } else {
                    qA = q11;
                }
                if (qA != null) {
                    dR = AbstractC0130c.A(dR, e(qA, false));
                }
                if (q10.o()) {
                    J7.a.e((p067g9.f) bVar.f5172b, q10.f10871A);
                    ((N8.a) cVar.f2094r).getClass();
                    p210v8.i.f(dR, "computedType");
                }
                return dR;
            }
            next2 = it.next();
            i12 = i10 + 1;
            if (i10 >= 0) {
                p086i8.l.G();
                throw null;
            }
            o10 = (p047e9.O) next2;
            List listU2 = oD.u();
            p210v8.i.e(listU2, "constructor.parameters");
            p10 = (L8.P) p086i8.k.W(listU2, i10);
            n10 = o10.f10849u;
            if (n10 == p047e9.N.STAR) {
                p210v8.i.e(n10, "typeArgumentProto.projection");
                iOrdinal = n10.ordinal();
                if (iOrdinal != 0) {
                    i13 = 3;
                    if (iOrdinal != i15) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + n10);
                        }
                        i13 = 1;
                    }
                } else {
                    i13 = 2;
                }
                i14 = o10.f10848t;
                if ((i14 & 2) == 2) {
                    qA2 = o10.f10850v;
                } else if ((i14 & 4) == 4) {
                    qA2 = gVar.a(o10.f10851w);
                } else {
                    qA2 = null;
                }
                if (qA2 == null) {
                    t7 = new A9.T(1, C9.i.c(C9.h.NO_RECORDED_TYPE, o10.toString()));
                } else {
                    t7 = new A9.T(i13, h(qA2));
                }
            } else if (p10 == null) {
                t7 = new A9.H(((InterfaceC0290y) cVar.f2079b).s());
            } else {
                t7 = new A9.I(p10);
            }
            arrayList.add(t7);
            i10 = i12;
            i15 = 1;
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new p138o2.h((Context) ((V.h) this.f14037t).f5078t, (p090j2.f) ((Provider) this.f14038u).get(), (p148p2.d) ((Provider) this.f14039v).get(), (p138o2.c) ((Y1.c) this.f14040w).get(), (Executor) ((Provider) this.f14041x).get(), (p158q2.b) ((Provider) this.f14042y).get(), new p053f4.e(26), new K3.d(26), (p148p2.c) ((Provider) this.f14043z).get());
    }

    public AbstractC0151y h(p047e9.Q q10) {
        p047e9.Q qA;
        p210v8.i.f(q10, "proto");
        if (!((q10.f10883u & 2) == 2)) {
            return e(q10, true);
        }
        V3.b bVar = (V3.b) this.f14037t;
        String string = ((p067g9.f) bVar.f5172b).getString(q10.f10886x);
        A9.D dE = e(q10, true);
        p067g9.g gVar = (p067g9.g) bVar.f5174d;
        int i10 = q10.f10883u;
        if ((i10 & 4) == 4) {
            qA = q10.f10887y;
        } else {
            qA = (i10 & 8) == 8 ? gVar.a(q10.f10888z) : null;
        }
        p210v8.i.c(qA);
        return ((p220w9.k) ((I4.c) bVar.a).j).a(q10, string, dE, e(qA, true));
    }

    @Override // p029c9.k
    public void o() {
        HashMap map = (HashMap) this.f14038u;
        p188t1.G g8 = (p188t1.G) this.f14039v;
        g8.getClass();
        p096j9.b bVar = (p096j9.b) this.f14041x;
        p210v8.i.f(map, "arguments");
        boolean zS = false;
        if (bVar.equals(H8.a.f1935b)) {
            Object obj = map.get(p096j9.f.j("value"));
            p145o9.r rVar = obj instanceof p145o9.r ? (p145o9.r) obj : null;
            if (rVar != null) {
                Object obj2 = rVar.a;
                p145o9.p pVar = obj2 instanceof p145o9.p ? (p145o9.p) obj2 : null;
                if (pVar != null) {
                    zS = g8.s(pVar.a.a);
                }
            }
        }
        if (zS || g8.s(bVar)) {
            return;
        }
        ((List) this.f14042y).add(new M8.c(((InterfaceC0271e) this.f14040w).p(), map, (L8.M) this.f14043z));
    }

    @Override // p029c9.k
    public void p(p096j9.f fVar, Object obj) {
        ((HashMap) this.f14038u).put(fVar, p188t1.G.b((p188t1.G) this.f14037t, fVar, obj));
    }

    @Override // p029c9.k
    public p029c9.l q(p096j9.f fVar) {
        return new o1.h((p188t1.G) this.f14037t, fVar, this);
    }

    @Override // p029c9.k
    public void r(p096j9.f fVar, p145o9.f fVar2) {
        ((HashMap) this.f14038u).put(fVar, new p145o9.r(new p145o9.p(fVar2)));
    }

    @Override // p029c9.k
    public void s(p096j9.f fVar, p096j9.b bVar, p096j9.f fVar2) {
        ((HashMap) this.f14038u).put(fVar, new p145o9.i(bVar, fVar2));
    }

    @Override // p029c9.k
    public p029c9.k t(p096j9.b bVar, p096j9.f fVar) {
        ArrayList arrayList = new ArrayList();
        return new Fa.e(((p188t1.G) this.f14037t).t(bVar, L8.M.a, arrayList), this, fVar, arrayList);
    }

    public String toString() {
        String str;
        switch (this.f14036s) {
            case 4:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.f14039v);
                b1 b1Var = (b1) this.f14038u;
                if (b1Var == null) {
                    str = "";
                } else {
                    str = ". Child of " + ((String) b1Var.f14039v);
                }
                sb.append(str);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public b1(V3.b bVar, b1 b1Var, List list, String str, String str2) {
        Map linkedHashMap;
        this.f14036s = 4;
        p210v8.i.f(bVar, "c");
        p210v8.i.f(list, "typeParameterProtos");
        p210v8.i.f(str, "debugName");
        this.f14037t = bVar;
        this.f14038u = b1Var;
        this.f14039v = str;
        this.f14040w = str2;
        I4.c cVar = (I4.c) bVar.a;
        this.f14041x = ((p247z9.l) cVar.a).c(new p220w9.w(this, 0));
        this.f14042y = ((p247z9.l) cVar.a).c(new p220w9.w(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = p086i8.t.f12329s;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                p047e9.W w2 = (p047e9.W) it.next();
                linkedHashMap.put(Integer.valueOf(w2.f10934v), new p238y9.r((V3.b) this.f14037t, w2, i10));
                i10++;
            }
        }
        this.f14043z = linkedHashMap;
    }

    public b1(Context context) {
        this.f14036s = 0;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f14040w = layoutParams;
        this.f14041x = new Rect();
        this.f14042y = new int[2];
        this.f14043z = new int[2];
        this.f14037t = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f14038u = viewInflate;
        this.f14039v = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(b1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public b1(p188t1.G g8, InterfaceC0271e interfaceC0271e, p096j9.b bVar, List list, L8.M m2) {
        this.f14036s = 2;
        this.f14039v = g8;
        this.f14040w = interfaceC0271e;
        this.f14041x = bVar;
        this.f14042y = list;
        this.f14043z = m2;
        this.f14037t = g8;
        this.f14038u = new HashMap();
    }
}
