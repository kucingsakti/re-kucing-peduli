package A0;

import C8.InterfaceC0175c;
import K9.u;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.Q;
import androidx.lifecycle.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Metadata;
import p156q0.C0742a;
import p156q0.F;
import p156q0.K;
import y0.C0872j;
import y0.C0874l;
import y0.D;
import y0.N;
import y0.O;
import y0.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"LA0/g;", "Ly0/O;", "LA0/h;", R5.a.PUSH_ADDITIONAL_DATA_KEY, "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@N("fragment")
public class g extends O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.fragment.app.e f13d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f15f = new LinkedHashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f16g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f17h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f18i;

    public static final class a extends Q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference f19b;

        @Override // androidx.lifecycle.Q
        public final void c() {
            WeakReference weakReference = this.f19b;
            if (weakReference == null) {
                p210v8.i.n("completeTransition");
                throw null;
            }
            p200u8.a aVar = (p200u8.a) weakReference.get();
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public g(Context context, androidx.fragment.app.e eVar, int i10) {
        this.f12c = context;
        this.f13d = eVar;
        this.f14e = i10;
        int i11 = 0;
        this.f17h = new e(this, i11);
        this.f18i = new m(this, i11);
    }

    public static void k(g gVar, String str, int i10) {
        int iB;
        int i11 = 0;
        boolean z6 = (i10 & 2) == 0;
        boolean z10 = (i10 & 4) != 0;
        ArrayList arrayList = gVar.f16g;
        if (z10) {
            i iVar = new i(str, 0);
            p210v8.i.f(arrayList, "<this>");
            B8.b it = new B8.c(0, p086i8.l.B(arrayList), 1).iterator();
            while (it.f774u) {
                int iA = it.a();
                Object obj = arrayList.get(iA);
                if (!((Boolean) iVar.invoke(obj)).booleanValue()) {
                    if (i11 != iA) {
                        arrayList.set(i11, obj);
                    }
                    i11++;
                }
            }
            if (i11 < arrayList.size() && i11 <= (iB = p086i8.l.B(arrayList))) {
                while (true) {
                    arrayList.remove(iB);
                    if (iB == i11) {
                        break;
                    } else {
                        iB--;
                    }
                }
            }
        }
        arrayList.add(new p076h8.f(str, Boolean.valueOf(z6)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // y0.O
    public final x a() {
        return new h(this);
    }

    @Override // y0.O
    public final void d(List list, D d3) {
        androidx.fragment.app.e eVar = this.f13d;
        if (eVar.P()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0872j c0872j = (C0872j) it.next();
            boolean zIsEmpty = ((List) ((Q9.t) ((Q9.m) b().f15941e.f3811t)).f()).isEmpty();
            if (d3 == null || zIsEmpty || !d3.f15860b || !this.f15f.remove(c0872j.f15932x)) {
                C0742a c0742aM = m(c0872j, d3);
                if (!zIsEmpty) {
                    C0872j c0872j2 = (C0872j) p086i8.k.c0((List) ((Q9.t) ((Q9.m) b().f15941e.f3811t)).f());
                    if (c0872j2 != null) {
                        k(this, c0872j2.f15932x, 6);
                    }
                    String str = c0872j.f15932x;
                    k(this, str, 6);
                    c0742aM.c(str);
                }
                c0742aM.f();
                if (n()) {
                    c0872j.toString();
                }
                b().h(c0872j);
            } else {
                eVar.x(new androidx.fragment.app.d(eVar, c0872j.f15932x, 0), false);
                b().h(c0872j);
            }
        }
    }

    @Override // y0.O
    public final void e(final C0874l c0874l) {
        this.a = c0874l;
        this.f15894b = true;
        n();
        p156q0.O o10 = new p156q0.O() { // from class: A0.f
            @Override // p156q0.O
            public final void b(androidx.fragment.app.e eVar, androidx.fragment.app.b bVar) {
                Object objPrevious;
                C0874l c0874l2 = c0874l;
                g gVar = this;
                p210v8.i.f(gVar, "this$0");
                p210v8.i.f(eVar, "<anonymous parameter 0>");
                p210v8.i.f(bVar, "fragment");
                List list = (List) ((Q9.t) ((Q9.m) c0874l2.f15941e.f3811t)).f();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!p210v8.i.a(((C0872j) objPrevious).f15932x, bVar.f6627T));
                C0872j c0872j = (C0872j) objPrevious;
                if (g.n()) {
                    bVar.toString();
                    Objects.toString(c0872j);
                    Objects.toString(gVar.f13d);
                }
                if (c0872j != null) {
                    bVar.f6645n0.d(bVar, new p(new k(gVar, bVar, c0872j), 0));
                    bVar.f6643l0.a(gVar.f17h);
                    gVar.l(bVar, c0872j, c0874l2);
                }
            }
        };
        androidx.fragment.app.e eVar = this.f13d;
        eVar.f6689p.add(o10);
        eVar.f6687n.add(new n(c0874l, this));
    }

    @Override // y0.O
    public final void f(C0872j c0872j) {
        androidx.fragment.app.e eVar = this.f13d;
        if (eVar.P()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C0742a c0742aM = m(c0872j, null);
        List list = (List) ((Q9.t) ((Q9.m) b().f15941e.f3811t)).f();
        if (list.size() > 1) {
            C0872j c0872j2 = (C0872j) p086i8.k.W(list, p086i8.l.B(list) - 1);
            if (c0872j2 != null) {
                k(this, c0872j2.f15932x, 6);
            }
            String str = c0872j.f15932x;
            k(this, str, 4);
            eVar.x(new K(eVar, str, -1), false);
            k(this, str, 2);
            c0742aM.c(str);
        }
        c0742aM.f();
        b().c(c0872j);
    }

    @Override // y0.O
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f15f;
            linkedHashSet.clear();
            p086i8.q.J(linkedHashSet, stringArrayList);
        }
    }

    @Override // y0.O
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f15f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return com.bumptech.glide.d.b(new p076h8.f("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    @Override // y0.O
    public final void i(C0872j c0872j, boolean z6) {
        int i10;
        boolean z10;
        p210v8.i.f(c0872j, "popUpTo");
        androidx.fragment.app.e eVar = this.f13d;
        if (eVar.P()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((Q9.t) ((Q9.m) b().f15941e.f3811t)).f();
        int iIndexOf = list.indexOf(c0872j);
        List listSubList = list.subList(iIndexOf, list.size());
        C0872j c0872j2 = (C0872j) p086i8.k.T(list);
        C0872j c0872j3 = (C0872j) p086i8.k.W(list, iIndexOf - 1);
        if (c0872j3 != null) {
            k(this, c0872j3.f15932x, 6);
        }
        List list2 = listSubList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            C0872j c0872j4 = (C0872j) obj;
            u uVarZ = K9.n.z(p086i8.k.N(this.f16g), o.f35s);
            String str = c0872j4.f15932x;
            Iterator it = uVarZ.a.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                Object objInvoke = uVarZ.f2710b.invoke(it.next());
                if (i11 < 0) {
                    p086i8.l.G();
                    throw null;
                }
                if (p210v8.i.a(str, objInvoke)) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
            if (i10 >= 0) {
                z10 = true;
            } else if (p210v8.i.a(c0872j4.f15932x, c0872j2.f15932x)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k(this, ((C0872j) it2.next()).f15932x, 4);
        }
        if (z6) {
            for (C0872j c0872j5 : p086i8.k.i0(list2)) {
                if (p210v8.i.a(c0872j5, c0872j2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + c0872j5);
                } else {
                    eVar.x(new androidx.fragment.app.d(eVar, c0872j5.f15932x, 1), false);
                    this.f15f.add(c0872j5.f15932x);
                }
            }
        } else {
            eVar.x(new K(eVar, c0872j.f15932x, -1), false);
        }
        if (n()) {
            c0872j.toString();
        }
        b().f(c0872j, z6);
    }

    public final void l(androidx.fragment.app.b bVar, C0872j c0872j, C0874l c0874l) {
        p210v8.i.f(bVar, "fragment");
        V vE = bVar.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC0175c interfaceC0175cB = p210v8.u.a.b(a.class);
        if (linkedHashMap.containsKey(interfaceC0175cB)) {
            throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + interfaceC0175cB.s() + '.').toString());
        }
        linkedHashMap.put(interfaceC0175cB, new u0.c(interfaceC0175cB));
        Collection collectionValues = linkedHashMap.values();
        p210v8.i.f(collectionValues, "initializers");
        u0.c[] cVarArr = (u0.c[]) collectionValues.toArray(new u0.c[0]);
        u0.c[] cVarArr2 = (u0.c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        p210v8.i.f(cVarArr2, "initializers");
        p102k7.e eVar = new p102k7.e();
        eVar.f12743s = cVarArr2;
        u0.a aVar = u0.a.f15287t;
        p210v8.i.f(aVar, "defaultCreationExtras");
        Y1.c cVar = new Y1.c(vE, eVar, aVar);
        InterfaceC0175c interfaceC0175cR = p068ga.d.r(a.class);
        String strS = interfaceC0175cR.s();
        if (strS == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        ((a) cVar.A("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS), interfaceC0175cR)).f19b = new WeakReference(new j(c0872j, c0874l, this, bVar));
    }

    public final C0742a m(C0872j c0872j, D d3) {
        x xVar = c0872j.f15928t;
        p210v8.i.d(xVar, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleB = c0872j.b();
        String str = ((h) xVar).f20C;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f12c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        androidx.fragment.app.e eVar = this.f13d;
        F fI = eVar.I();
        context.getClassLoader();
        androidx.fragment.app.b bVarA = fI.a(str);
        p210v8.i.e(bVarA, "fragmentManager.fragment…t.classLoader, className)");
        bVarA.b0(bundleB);
        C0742a c0742a = new C0742a(eVar);
        int i10 = d3 != null ? d3.f15864f : -1;
        int i11 = d3 != null ? d3.f15865g : -1;
        int i12 = d3 != null ? d3.f15866h : -1;
        int i13 = d3 != null ? d3.f15867i : -1;
        if (i10 != -1 || i11 != -1 || i12 != -1 || i13 != -1) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i11 == -1) {
                i11 = 0;
            }
            if (i12 == -1) {
                i12 = 0;
            }
            int i14 = i13 != -1 ? i13 : 0;
            c0742a.f14294b = i10;
            c0742a.f14295c = i11;
            c0742a.f14296d = i12;
            c0742a.f14297e = i14;
        }
        c0742a.m(this.f14e, bVarA, c0872j.f15932x);
        c0742a.o(bVarA);
        c0742a.f14307p = true;
        return c0742a;
    }
}
