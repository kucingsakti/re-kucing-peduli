package y0;

import A9.C0132e;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.InterfaceC0523s;
import androidx.lifecycle.V;
import androidx.navigation.NavBackStackEntryState;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f15831A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p076h8.j f15832B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Q9.p f15833C;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f15834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f15835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f15836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Parcelable[] f15837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p086i8.h f15839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q9.t f15840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Q9.t f15841i;
    public final LinkedHashMap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f15842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f15843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f15844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC0523s f15845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0878p f15846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f15847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EnumC0519n f15848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A0.e f15849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p156q0.D f15850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f15851t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final P f15852u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f15853v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p210v8.k f15854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0875m f15855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f15856y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15857z;

    public B(Context context) {
        this.a = context;
        for (Object obj : K9.n.x(context, C0864b.f15905u)) {
            if (((Context) obj) instanceof Activity) {
                this.f15834b = (Activity) obj;
                this.f15839g = new p086i8.h();
                p086i8.s sVar = p086i8.s.f12328s;
                this.f15840h = Q9.q.a(sVar);
                this.f15841i = Q9.q.a(sVar);
                this.j = new LinkedHashMap();
                this.f15842k = new LinkedHashMap();
                this.f15843l = new LinkedHashMap();
                this.f15844m = new LinkedHashMap();
                this.f15847p = new CopyOnWriteArrayList();
                this.f15848q = EnumC0519n.f6756t;
                this.f15849r = new A0.e(this, 2);
                this.f15850s = new p156q0.D(this, 1);
                this.f15851t = true;
                P p10 = new P();
                this.f15852u = p10;
                this.f15853v = new LinkedHashMap();
                this.f15856y = new LinkedHashMap();
                p10.a(new A(p10));
                p10.a(new C0865c(this.a));
                this.f15831A = new ArrayList();
                this.f15832B = D3.b.s(new c2.a(this, 23));
                this.f15833C = new Q9.p(1, 2);
            }
        }
        obj = null;
        this.f15834b = (Activity) obj;
        this.f15839g = new p086i8.h();
        p086i8.s sVar2 = p086i8.s.f12328s;
        this.f15840h = Q9.q.a(sVar2);
        this.f15841i = Q9.q.a(sVar2);
        this.j = new LinkedHashMap();
        this.f15842k = new LinkedHashMap();
        this.f15843l = new LinkedHashMap();
        this.f15844m = new LinkedHashMap();
        this.f15847p = new CopyOnWriteArrayList();
        this.f15848q = EnumC0519n.f6756t;
        this.f15849r = new A0.e(this, 2);
        this.f15850s = new p156q0.D(this, 1);
        this.f15851t = true;
        P p11 = new P();
        this.f15852u = p11;
        this.f15853v = new LinkedHashMap();
        this.f15856y = new LinkedHashMap();
        p11.a(new A(p11));
        p11.a(new C0865c(this.a));
        this.f15831A = new ArrayList();
        this.f15832B = D3.b.s(new c2.a(this, 23));
        this.f15833C = new Q9.p(1, 2);
    }

    public static x d(int i10, x xVar, x xVar2, boolean z6) {
        z zVar;
        if (xVar.f16002z == i10 && (xVar2 == null || (xVar.equals(xVar2) && p210v8.i.a(xVar.f15996t, xVar2.f15996t)))) {
            return xVar;
        }
        if (xVar instanceof z) {
            zVar = (z) xVar;
        } else {
            z zVar2 = xVar.f15996t;
            p210v8.i.c(zVar2);
            zVar = zVar2;
        }
        return zVar.o(i10, zVar, xVar2, z6);
    }

    public static /* synthetic */ void q(B b3, C0872j c0872j) {
        b3.p(c0872j, false, new p086i8.h());
    }

    public final void a(x xVar, Bundle bundle, C0872j c0872j, List list) {
        Object objPrevious;
        Object objPrevious2;
        x xVar2 = c0872j.f15928t;
        boolean z6 = xVar2 instanceof InterfaceC0866d;
        p086i8.h hVar = this.f15839g;
        if (!z6) {
            while (!hVar.isEmpty() && (((C0872j) hVar.r()).f15928t instanceof InterfaceC0866d) && o(((C0872j) hVar.r()).f15928t.f16002z, true, false)) {
            }
        }
        p086i8.h<C0872j> hVar2 = new p086i8.h();
        boolean z10 = xVar instanceof z;
        Context context = this.a;
        Object obj = null;
        if (z10) {
            x xVar3 = xVar2;
            do {
                p210v8.i.c(xVar3);
                xVar3 = xVar3.f15996t;
                if (xVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!p210v8.i.a(((C0872j) objPrevious2).f15928t, xVar3));
                    C0872j c0872jL = (C0872j) objPrevious2;
                    if (c0872jL == null) {
                        c0872jL = p204v1.g.l(context, xVar3, bundle, i(), this.f15846o);
                    }
                    hVar2.g(c0872jL);
                    if (!hVar.isEmpty() && ((C0872j) hVar.r()).f15928t == xVar3) {
                        q(this, (C0872j) hVar.r());
                    }
                }
                if (xVar3 == null) {
                    break;
                }
            } while (xVar3 != xVar);
        }
        x xVar4 = hVar2.isEmpty() ? xVar2 : ((C0872j) hVar2.o()).f15928t;
        while (xVar4 != null && c(xVar4.f16002z, xVar4) != xVar4) {
            xVar4 = xVar4.f15996t;
            if (xVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!p210v8.i.a(((C0872j) objPrevious).f15928t, xVar4));
                C0872j c0872jL2 = (C0872j) objPrevious;
                if (c0872jL2 == null) {
                    c0872jL2 = p204v1.g.l(context, xVar4, xVar4.e(bundle2), i(), this.f15846o);
                }
                hVar2.g(c0872jL2);
            }
        }
        if (!hVar2.isEmpty()) {
            xVar2 = ((C0872j) hVar2.o()).f15928t;
        }
        while (!hVar.isEmpty() && (((C0872j) hVar.r()).f15928t instanceof z)) {
            x xVar5 = ((C0872j) hVar.r()).f15928t;
            p210v8.i.d(xVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((z) xVar5).f16007C.d(xVar2.f16002z) != null) {
                break;
            } else {
                q(this, (C0872j) hVar.r());
            }
        }
        C0872j c0872j2 = (C0872j) (hVar.isEmpty() ? null : hVar.f12324t[hVar.f12323s]);
        if (c0872j2 == null) {
            c0872j2 = (C0872j) (hVar2.isEmpty() ? null : hVar2.f12324t[hVar2.f12323s]);
        }
        if (!p210v8.i.a(c0872j2 != null ? c0872j2.f15928t : null, this.f15835c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                x xVar6 = ((C0872j) objPrevious3).f15928t;
                z zVar = this.f15835c;
                p210v8.i.c(zVar);
                if (p210v8.i.a(xVar6, zVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            C0872j c0872jL3 = (C0872j) obj;
            if (c0872jL3 == null) {
                z zVar2 = this.f15835c;
                p210v8.i.c(zVar2);
                z zVar3 = this.f15835c;
                p210v8.i.c(zVar3);
                c0872jL3 = p204v1.g.l(context, zVar2, zVar3.e(bundle), i(), this.f15846o);
            }
            hVar2.g(c0872jL3);
        }
        for (C0872j c0872j3 : hVar2) {
            Object obj2 = this.f15853v.get(this.f15852u.b(c0872j3.f15928t.f15995s));
            if (obj2 == null) {
                throw new IllegalStateException(E0.a.l(new StringBuilder("NavigatorBackStack for "), xVar.f15995s, " should already be created").toString());
            }
            ((C0874l) obj2).a(c0872j3);
        }
        hVar.addAll(hVar2);
        hVar.k(c0872j);
        for (C0872j c0872j4 : p086i8.k.h0(hVar2, c0872j)) {
            z zVar4 = c0872j4.f15928t.f15996t;
            if (zVar4 != null) {
                l(c0872j4, e(zVar4.f16002z));
            }
        }
    }

    public final boolean b() {
        p086i8.h hVar;
        while (true) {
            hVar = this.f15839g;
            if (hVar.isEmpty() || !(((C0872j) hVar.r()).f15928t instanceof z)) {
                break;
            }
            q(this, (C0872j) hVar.r());
        }
        C0872j c0872j = (C0872j) hVar.s();
        ArrayList arrayList = this.f15831A;
        if (c0872j != null) {
            arrayList.add(c0872j);
        }
        this.f15857z++;
        v();
        int i10 = this.f15857z - 1;
        this.f15857z = i10;
        if (i10 == 0) {
            ArrayList<C0872j> arrayListT0 = p086i8.k.t0(arrayList);
            arrayList.clear();
            for (C0872j c0872j2 : arrayListT0) {
                Iterator it = this.f15847p.iterator();
                while (it.hasNext()) {
                    ((B0.a) it.next()).a(this, c0872j2.f15928t, c0872j2.b());
                }
                this.f15833C.n(c0872j2);
            }
            ArrayList arrayListT1 = p086i8.k.t0(hVar);
            Q9.t tVar = this.f15840h;
            tVar.getClass();
            tVar.h(null, arrayListT1);
            ArrayList arrayListR = r();
            Q9.t tVar2 = this.f15841i;
            tVar2.getClass();
            tVar2.h(null, arrayListR);
        }
        return c0872j != null;
    }

    public final x c(int i10, x xVar) {
        x xVar2;
        z zVar = this.f15835c;
        if (zVar == null) {
            return null;
        }
        if (zVar.f16002z == i10) {
            if (xVar == null) {
                return zVar;
            }
            if (p210v8.i.a(zVar, xVar) && xVar.f15996t == null) {
                return this.f15835c;
            }
        }
        C0872j c0872j = (C0872j) this.f15839g.s();
        if (c0872j == null || (xVar2 = c0872j.f15928t) == null) {
            xVar2 = this.f15835c;
            p210v8.i.c(xVar2);
        }
        return d(i10, xVar2, xVar, false);
    }

    public final C0872j e(int i10) {
        Object objPrevious;
        p086i8.h hVar = this.f15839g;
        ListIterator<E> listIterator = hVar.listIterator(hVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((C0872j) objPrevious).f15928t.f16002z != i10);
        C0872j c0872j = (C0872j) objPrevious;
        if (c0872j != null) {
            return c0872j;
        }
        StringBuilder sbL = AbstractC0487g.l("No destination with ID ", i10, " is on the NavController's back stack. The current destination is ");
        sbL.append(f());
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    public final x f() {
        C0872j c0872j = (C0872j) this.f15839g.s();
        if (c0872j != null) {
            return c0872j.f15928t;
        }
        return null;
    }

    public final int g() {
        p086i8.h hVar = this.f15839g;
        int i10 = 0;
        if ((hVar instanceof Collection) && hVar.isEmpty()) {
            return 0;
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            if (!(((C0872j) it.next()).f15928t instanceof z) && (i10 = i10 + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i10;
    }

    public final z h() {
        z zVar = this.f15835c;
        if (zVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        p210v8.i.d(zVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return zVar;
    }

    public final EnumC0519n i() {
        return this.f15845n == null ? EnumC0519n.f6757u : this.f15848q;
    }

    public final z j(p086i8.h hVar) {
        x xVar;
        C0872j c0872j = (C0872j) hVar.s();
        if (c0872j == null || (xVar = c0872j.f15928t) == null) {
            xVar = this.f15835c;
            p210v8.i.c(xVar);
        }
        if (xVar instanceof z) {
            return (z) xVar;
        }
        z zVar = xVar.f15996t;
        p210v8.i.c(zVar);
        return zVar;
    }

    public final boolean k(Intent intent) {
        int[] intArray;
        z zVarJ;
        v vVarQ;
        Context context;
        String strM;
        z zVar;
        x xVarO;
        z zVar2;
        Bundle bundle;
        x xVarO2;
        z zVar3;
        int i10 = 0;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            x xVar = null;
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception unused) {
                    intent.toString();
                    intArray = null;
                }
            } else {
                intArray = null;
            }
            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
            if (bundle3 != null) {
                bundle2.putAll(bundle3);
            }
            p086i8.h hVar = this.f15839g;
            if ((intArray == null || intArray.length == 0) && (vVarQ = (zVarJ = j(hVar)).q(new wa.a(intent), true, zVarJ)) != null) {
                x xVar2 = vVarQ.f15985s;
                int[] iArrF = xVar2.f(null);
                Bundle bundleE = xVar2.e(vVarQ.f15986t);
                if (bundleE != null) {
                    bundle2.putAll(bundleE);
                }
                intArray = iArrF;
                parcelableArrayList = null;
            }
            if (intArray != null && intArray.length != 0) {
                z zVar4 = this.f15835c;
                int length = intArray.length;
                int i11 = 0;
                z zVar5 = zVar4;
                while (true) {
                    context = this.a;
                    if (i11 >= length) {
                        strM = null;
                        break;
                    }
                    int i12 = intArray[i11];
                    if (i11 == 0) {
                        z zVar6 = this.f15835c;
                        p210v8.i.c(zVar6);
                        xVarO2 = zVar6.f16002z == i12 ? this.f15835c : null;
                    } else {
                        p210v8.i.c(zVar5);
                        xVarO2 = zVar5.o(i12, zVar5, null, false);
                    }
                    if (xVarO2 == null) {
                        int i13 = x.f15993B;
                        strM = p068ga.d.m(context, i12);
                        break;
                    }
                    if (i11 != intArray.length - 1 && (xVarO2 instanceof z)) {
                        while (true) {
                            zVar3 = (z) xVarO2;
                            p210v8.i.c(zVar3);
                            if (!(zVar3.o(zVar3.f16008D, zVar3, null, false) instanceof z)) {
                                break;
                            }
                            xVarO2 = zVar3.o(zVar3.f16008D, zVar3, null, false);
                        }
                        zVar5 = zVar3;
                    }
                    i11++;
                    zVar5 = zVar5;
                }
                if (strM != null) {
                    Log.i("NavController", "Could not find destination " + strM + " in the navigation graph, ignoring the deep link from " + intent);
                    return false;
                }
                bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                int length2 = intArray.length;
                Bundle[] bundleArr = new Bundle[length2];
                for (int i14 = 0; i14 < length2; i14++) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putAll(bundle2);
                    if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i14)) != null) {
                        bundle4.putAll(bundle);
                    }
                    bundleArr[i14] = bundle4;
                }
                int flags = intent.getFlags();
                int i15 = 268435456 & flags;
                if (i15 != 0 && (flags & 32768) == 0) {
                    intent.addFlags(32768);
                    I.N n10 = new I.N(context);
                    ComponentName component = intent.getComponent();
                    if (component == null) {
                        component = intent.resolveActivity(n10.f1959t.getPackageManager());
                    }
                    if (component != null) {
                        n10.d(component);
                    }
                    n10.f1958s.add(intent);
                    n10.e();
                    Activity activity = this.f15834b;
                    if (activity != null) {
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                    }
                    return true;
                }
                if (i15 != 0) {
                    if (!hVar.isEmpty()) {
                        z zVar7 = this.f15835c;
                        p210v8.i.c(zVar7);
                        o(zVar7.f16002z, true, false);
                    }
                    while (i10 < intArray.length) {
                        int i16 = intArray[i10];
                        int i17 = i10 + 1;
                        Bundle bundle5 = bundleArr[i10];
                        x xVarC = c(i16, xVar);
                        if (xVarC == null) {
                            int i18 = x.f15993B;
                            StringBuilder sbM = AbstractC0487g.m("Deep Linking failed: destination ", p068ga.d.m(context, i16), " cannot be found from the current destination ");
                            sbM.append(f());
                            throw new IllegalStateException(sbM.toString());
                        }
                        E0.b bVar = new E0.b(xVarC, 10, this);
                        E e10 = new E();
                        bVar.invoke(e10);
                        boolean z6 = e10.f15868b;
                        U.r rVar = e10.a;
                        m(xVarC, bundle5, new D(z6, e10.f15869c, e10.f15870d, false, e10.f15871e, rVar.a, rVar.f4845b, -1, -1));
                        i10 = i17;
                        xVar = null;
                    }
                    this.f15838f = true;
                    return true;
                }
                z zVar8 = this.f15835c;
                int length3 = intArray.length;
                int i19 = 0;
                while (i19 < length3) {
                    int i20 = intArray[i19];
                    Bundle bundle6 = bundleArr[i19];
                    if (i19 == 0) {
                        xVarO = this.f15835c;
                    } else {
                        p210v8.i.c(zVar);
                        xVarO = zVar.o(i20, zVar, null, false);
                    }
                    if (xVarO == null) {
                        zVar = zVar8;
                        zVar = zVar8;
                        int i21 = x.f15993B;
                        throw new IllegalStateException("Deep Linking failed: destination " + p068ga.d.m(context, i20) + " cannot be found in graph " + zVar);
                    }
                    zVar = zVar8;
                    if (i19 == intArray.length - 1) {
                        zVar = zVar8;
                        z zVar9 = this.f15835c;
                        p210v8.i.c(zVar9);
                        m(xVarO, bundle6, new D(false, false, zVar9.f16002z, true, false, 0, 0, -1, -1));
                    } else if (xVarO instanceof z) {
                        while (true) {
                            zVar = zVar8;
                            zVar2 = (z) xVarO;
                            p210v8.i.c(zVar2);
                            if (!(zVar2.o(zVar2.f16008D, zVar2, null, false) instanceof z)) {
                                break;
                            }
                            xVarO = zVar2.o(zVar2.f16008D, zVar2, null, false);
                        }
                        zVar = zVar2;
                    } else {
                        zVar = zVar8;
                    }
                    i19++;
                    zVar = zVar;
                }
                zVar = zVar8;
                this.f15838f = true;
                return true;
            }
        }
        return false;
    }

    public final void l(C0872j c0872j, C0872j c0872j2) {
        this.j.put(c0872j, c0872j2);
        LinkedHashMap linkedHashMap = this.f15842k;
        if (linkedHashMap.get(c0872j2) == null) {
            linkedHashMap.put(c0872j2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c0872j2);
        p210v8.i.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101 A[LOOP:4: B:50:0x00fb->B:52:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x014b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x016e A[LOOP:6: B:61:0x0168->B:63:0x016e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0183  */
    /* JADX WARN: Code duplicated, block: B:91:0x0160 A[SYNTHETIC] */
    public final void m(x xVar, Bundle bundle, D d3) {
        p210v8.q qVar;
        boolean z6;
        int iNextIndex;
        x xVar2;
        p086i8.h<C0872j> hVar;
        z zVar;
        int i10;
        LinkedHashMap linkedHashMap = this.f15853v;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((C0874l) it.next()).f15940d = true;
        }
        p210v8.q qVar2 = new p210v8.q();
        boolean zO = (d3 == null || (i10 = d3.f15861c) == -1) ? false : o(i10, d3.f15862d, d3.f15863e);
        Bundle bundleE = xVar.e(bundle);
        if (d3 != null && d3.f15860b && this.f15843l.containsKey(Integer.valueOf(xVar.f16002z))) {
            qVar2.f15463s = s(xVar.f16002z, bundleE, d3);
            z6 = false;
        } else {
            P p10 = this.f15852u;
            if (d3 == null || !d3.a) {
                qVar = qVar2;
                z6 = false;
            } else {
                p086i8.h hVar2 = this.f15839g;
                C0872j c0872j = (C0872j) hVar2.s();
                ListIterator listIterator = hVar2.listIterator(hVar2.e());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((C0872j) listIterator.previous()).f15928t == xVar) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    qVar = qVar2;
                    z6 = false;
                } else if (xVar instanceof z) {
                    int i11 = z.f16006F;
                    List listB = K9.n.B(K9.n.z(K9.n.x((z) xVar, C0864b.f15901B), C0864b.f15908x));
                    if (hVar2.f12325u - iNextIndex == listB.size()) {
                        List listSubList = hVar2.subList(iNextIndex, hVar2.f12325u);
                        ArrayList arrayList = new ArrayList(p086i8.m.H(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((C0872j) it2.next()).f15928t.f16002z));
                        }
                        if (arrayList.equals(listB)) {
                            hVar = new p086i8.h();
                            while (p086i8.l.B(hVar2) >= iNextIndex) {
                                C0872j c0872j2 = (C0872j) p086i8.q.K(hVar2);
                                u(c0872j2);
                                C0872j c0872j3 = new C0872j(c0872j2.f15927s, c0872j2.f15928t, c0872j2.f15928t.e(bundle), c0872j2.f15930v, c0872j2.f15931w, c0872j2.f15932x, c0872j2.f15933y);
                                c0872j3.f15930v = c0872j2.f15930v;
                                c0872j3.c(c0872j2.f15926C);
                                hVar.g(c0872j3);
                                qVar2 = qVar2;
                            }
                            qVar = qVar2;
                            for (C0872j c0872j4 : hVar) {
                                zVar = c0872j4.f15928t.f15996t;
                                if (zVar != null) {
                                    l(c0872j4, e(zVar.f16002z));
                                }
                                hVar2.k(c0872j4);
                            }
                            for (C0872j c0872j5 : hVar) {
                                p10.b(c0872j5.f15928t.f15995s).f(c0872j5);
                            }
                            z6 = true;
                        }
                    }
                    qVar = qVar2;
                    z6 = false;
                } else if (c0872j == null || (xVar2 = c0872j.f15928t) == null || xVar.f16002z != xVar2.f16002z) {
                    qVar = qVar2;
                    z6 = false;
                } else {
                    hVar = new p086i8.h();
                    while (p086i8.l.B(hVar2) >= iNextIndex) {
                        C0872j c0872j6 = (C0872j) p086i8.q.K(hVar2);
                        u(c0872j6);
                        C0872j c0872j7 = new C0872j(c0872j6.f15927s, c0872j6.f15928t, c0872j6.f15928t.e(bundle), c0872j6.f15930v, c0872j6.f15931w, c0872j6.f15932x, c0872j6.f15933y);
                        c0872j7.f15930v = c0872j6.f15930v;
                        c0872j7.c(c0872j6.f15926C);
                        hVar.g(c0872j7);
                        qVar2 = qVar2;
                    }
                    qVar = qVar2;
                    while (r1.hasNext()) {
                        zVar = c0872j4.f15928t.f15996t;
                        if (zVar != null) {
                            l(c0872j4, e(zVar.f16002z));
                        }
                        hVar2.k(c0872j4);
                    }
                    while (r0.hasNext()) {
                        p10.b(c0872j5.f15928t.f15995s).f(c0872j5);
                    }
                    z6 = true;
                }
            }
            if (z6) {
                qVar2 = qVar;
            } else {
                C0872j c0872jL = p204v1.g.l(this.a, xVar, bundleE, i(), this.f15846o);
                O oB = p10.b(xVar.f15995s);
                List listU = com.bumptech.glide.d.u(c0872jL);
                qVar2 = qVar;
                this.f15854w = new C0132e(qVar2, this, xVar, bundleE, 1);
                oB.d(listU, d3);
                this.f15854w = null;
            }
        }
        w();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((C0874l) it3.next()).f15940d = false;
        }
        if (zO || qVar2.f15463s || z6) {
            b();
        } else {
            v();
        }
    }

    public final boolean n(int i10, boolean z6) {
        return o(i10, z6, false) && b();
    }

    public final boolean o(int i10, boolean z6, boolean z10) {
        x xVar;
        B b3;
        boolean z11;
        String str;
        p086i8.h hVar = this.f15839g;
        int i11 = 0;
        if (hVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = p086i8.k.i0(hVar).iterator();
        do {
            if (!it.hasNext()) {
                xVar = null;
                break;
            }
            xVar = ((C0872j) it.next()).f15928t;
            O oB = this.f15852u.b(xVar.f15995s);
            if (z6 || xVar.f16002z != i10) {
                arrayList.add(oB);
            }
        } while (xVar.f16002z != i10);
        if (xVar == null) {
            int i12 = x.f15993B;
            Log.i("NavController", "Ignoring popBackStack to destination " + p068ga.d.m(this.a, i10) + " as it was not found on the current back stack");
            return false;
        }
        p210v8.q qVar = new p210v8.q();
        p086i8.h hVar2 = new p086i8.h();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                b3 = this;
                z11 = z10;
                break;
            }
            O o10 = (O) it2.next();
            p210v8.q qVar2 = new p210v8.q();
            C0872j c0872j = (C0872j) hVar.r();
            b3 = this;
            z11 = z10;
            b3.f15855x = new C0875m(qVar2, qVar, b3, z11, hVar2);
            o10.i(c0872j, z11);
            b3.f15855x = null;
            if (!qVar2.f15463s) {
                break;
            }
            z10 = z11;
        }
        if (z11) {
            LinkedHashMap linkedHashMap = b3.f15843l;
            if (!z6) {
                K9.f fVar = new K9.f(new K9.k(K9.n.x(xVar, C0864b.f15906v), new C0876n(this, i11)));
                while (fVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((x) fVar.next()).f16002z);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) (hVar2.isEmpty() ? null : hVar2.f12324t[hVar2.f12323s]);
                    linkedHashMap.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.f6778s : null);
                }
            }
            if (!hVar2.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) hVar2.o();
                K9.f fVar2 = new K9.f(new K9.k(K9.n.x(c(navBackStackEntryState2.f6779t, null), C0864b.f15907w), new C0876n(this, 1)));
                while (true) {
                    boolean zHasNext = fVar2.hasNext();
                    str = navBackStackEntryState2.f6778s;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((x) fVar2.next()).f16002z), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    b3.f15844m.put(str, hVar2);
                }
            }
        }
        w();
        return qVar.f15463s;
    }

    public final void p(C0872j c0872j, boolean z6, p086i8.h hVar) {
        C0878p c0878p;
        P0.d dVar;
        Set set;
        p086i8.h hVar2 = this.f15839g;
        C0872j c0872j2 = (C0872j) hVar2.r();
        if (!p210v8.i.a(c0872j2, c0872j)) {
            throw new IllegalStateException(("Attempted to pop " + c0872j.f15928t + ", which is not the top of the back stack (" + c0872j2.f15928t + ')').toString());
        }
        p086i8.q.K(hVar2);
        C0874l c0874l = (C0874l) this.f15853v.get(this.f15852u.b(c0872j2.f15928t.f15995s));
        boolean z10 = true;
        if ((c0874l == null || (dVar = c0874l.f15942f) == null || (set = (Set) ((Q9.t) ((Q9.m) dVar.f3811t)).f()) == null || !set.contains(c0872j2)) && !this.f15842k.containsKey(c0872j2)) {
            z10 = false;
        }
        EnumC0519n enumC0519n = c0872j2.f15934z.f6763c;
        EnumC0519n enumC0519n2 = EnumC0519n.f6757u;
        if (enumC0519n.compareTo(enumC0519n2) >= 0) {
            if (z6) {
                c0872j2.c(enumC0519n2);
                hVar.g(new NavBackStackEntryState(c0872j2));
            }
            if (z10) {
                c0872j2.c(enumC0519n2);
            } else {
                c0872j2.c(EnumC0519n.f6755s);
                u(c0872j2);
            }
        }
        if (z6 || z10 || (c0878p = this.f15846o) == null) {
            return;
        }
        String str = c0872j2.f15932x;
        p210v8.i.f(str, "backStackEntryId");
        V v4 = (V) c0878p.f15958b.remove(str);
        if (v4 != null) {
            v4.a();
        }
    }

    public final ArrayList r() {
        EnumC0519n enumC0519n;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f15853v.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0519n = EnumC0519n.f6758v;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((Q9.t) ((Q9.m) ((C0874l) it.next()).f15942f.f3811t)).f();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C0872j c0872j = (C0872j) obj;
                if (!arrayList.contains(c0872j) && c0872j.f15926C.compareTo(enumC0519n) < 0) {
                    arrayList2.add(obj);
                }
            }
            p086i8.q.J(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f15839g) {
            C0872j c0872j2 = (C0872j) obj2;
            if (!arrayList.contains(c0872j2) && c0872j2.f15926C.compareTo(enumC0519n) >= 0) {
                arrayList3.add(obj2);
            }
        }
        p086i8.q.J(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((C0872j) obj3).f15928t instanceof z)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean s(int i10, Bundle bundle, D d3) {
        x xVarH;
        C0872j c0872j;
        x xVar;
        LinkedHashMap linkedHashMap = this.f15843l;
        if (!linkedHashMap.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i10));
        Collection collectionValues = linkedHashMap.values();
        A0.i iVar = new A0.i(str, 23);
        p210v8.i.f(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((Boolean) iVar.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f15844m;
        p210v8.x.c(linkedHashMap2);
        p086i8.h<NavBackStackEntryState> hVar = (p086i8.h) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        C0872j c0872j2 = (C0872j) this.f15839g.s();
        if (c0872j2 == null || (xVarH = c0872j2.f15928t) == null) {
            xVarH = h();
        }
        if (hVar != null) {
            for (NavBackStackEntryState navBackStackEntryState : hVar) {
                x xVarD = d(navBackStackEntryState.f6779t, xVarH, null, true);
                Context context = this.a;
                if (xVarD == null) {
                    int i11 = x.f15993B;
                    throw new IllegalStateException(("Restore State failed: destination " + p068ga.d.m(context, navBackStackEntryState.f6779t) + " cannot be found from the current destination " + xVarH).toString());
                }
                arrayList.add(navBackStackEntryState.a(context, xVarD, i(), this.f15846o));
                xVarH = xVarD;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<C0872j> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((C0872j) obj).f15928t instanceof z)) {
                arrayList3.add(obj);
            }
        }
        for (C0872j c0872j3 : arrayList3) {
            List list = (List) p086i8.k.c0(arrayList2);
            if (p210v8.i.a((list == null || (c0872j = (C0872j) p086i8.k.b0(list)) == null || (xVar = c0872j.f15928t) == null) ? null : xVar.f15995s, c0872j3.f15928t.f15995s)) {
                list.add(c0872j3);
            } else {
                arrayList2.add(p086i8.l.E(c0872j3));
            }
        }
        p210v8.q qVar = new p210v8.q();
        for (List list2 : arrayList2) {
            O oB = this.f15852u.b(((C0872j) p086i8.k.T(list2)).f15928t.f15995s);
            Bundle bundle2 = bundle;
            this.f15854w = new C0877o(qVar, arrayList, new p210v8.r(), this, bundle2);
            oB.d(list2, d3);
            this.f15854w = null;
            bundle = bundle2;
        }
        return qVar.f15463s;
    }

    public final void t(z zVar, Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        boolean z6 = true;
        p086i8.h<C0872j> hVar = this.f15839g;
        if (!hVar.isEmpty() && i() == EnumC0519n.f6755s) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        if (p210v8.i.a(this.f15835c, zVar)) {
            p212w.j jVar = zVar.f16007C;
            int iH = jVar.h();
            for (int i10 = 0; i10 < iH; i10++) {
                x xVar = (x) jVar.i(i10);
                z zVar2 = this.f15835c;
                p210v8.i.c(zVar2);
                int iE = zVar2.f16007C.e(i10);
                z zVar3 = this.f15835c;
                p210v8.i.c(zVar3);
                p212w.j jVar2 = zVar3.f16007C;
                if (jVar2.f15507s) {
                    p212w.h.a(jVar2);
                }
                int iA = p221x.a.a(jVar2.f15510v, iE, jVar2.f15508t);
                if (iA >= 0) {
                    Object[] objArr = jVar2.f15509u;
                    Object obj = objArr[iA];
                    objArr[iA] = xVar;
                }
            }
            for (C0872j c0872j : hVar) {
                int i11 = x.f15993B;
                x xVar2 = c0872j.f15928t;
                p210v8.i.f(xVar2, "<this>");
                L9.d dVar = new L9.d(K9.n.B(K9.n.x(xVar2, C0864b.f15900A)), 1);
                x xVarO = this.f15835c;
                p210v8.i.c(xVarO);
                Iterator it = dVar.iterator();
                while (true) {
                    ListIterator listIterator = ((p086i8.A) it).f12304t;
                    if (listIterator.hasPrevious()) {
                        x xVar3 = (x) listIterator.previous();
                        if (!p210v8.i.a(xVar3, this.f15835c) || !p210v8.i.a(xVarO, zVar)) {
                            if (xVarO instanceof z) {
                                z zVar4 = (z) xVarO;
                                xVarO = zVar4.o(xVar3.f16002z, zVar4, null, false);
                                p210v8.i.c(xVarO);
                            }
                        }
                    }
                }
                p210v8.i.f(xVarO, "<set-?>");
                c0872j.f15928t = xVarO;
            }
            return;
        }
        z zVar5 = this.f15835c;
        LinkedHashMap linkedHashMap = this.f15853v;
        if (zVar5 != null) {
            for (Integer num : new ArrayList(this.f15843l.keySet())) {
                p210v8.i.e(num, "id");
                int iIntValue = num.intValue();
                Iterator it2 = linkedHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((C0874l) it2.next()).f15940d = z6;
                }
                E e10 = new E();
                e10.f15869c = z6;
                boolean z10 = e10.f15868b;
                U.r rVar = e10.a;
                boolean zS = s(iIntValue, null, new D(z10, e10.f15869c, e10.f15870d, false, e10.f15871e, rVar.a, rVar.f4845b, -1, -1));
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    ((C0874l) it3.next()).f15940d = false;
                }
                if (zS) {
                    z6 = true;
                    o(iIntValue, true, false);
                } else {
                    z6 = true;
                }
            }
            o(zVar5.f16002z, z6, false);
        }
        this.f15835c = zVar;
        Bundle bundle2 = this.f15836d;
        P p10 = this.f15852u;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String str : stringArrayList) {
                p210v8.i.e(str, MediationMetaData.KEY_NAME);
                O oB = p10.b(str);
                Bundle bundle3 = bundle2.getBundle(str);
                if (bundle3 != null) {
                    oB.g(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f15837e;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                p210v8.i.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                int i12 = navBackStackEntryState.f6779t;
                x xVarC = c(i12, null);
                Context context = this.a;
                if (xVarC == null) {
                    int i13 = x.f15993B;
                    StringBuilder sbM = AbstractC0487g.m("Restoring the Navigation back stack failed: destination ", p068ga.d.m(context, i12), " cannot be found from the current destination ");
                    sbM.append(f());
                    throw new IllegalStateException(sbM.toString());
                }
                C0872j c0872jA = navBackStackEntryState.a(context, xVarC, i(), this.f15846o);
                O oB2 = p10.b(xVarC.f15995s);
                Object c0874l = linkedHashMap.get(oB2);
                if (c0874l == null) {
                    c0874l = new C0874l(this, oB2);
                    linkedHashMap.put(oB2, c0874l);
                }
                hVar.k(c0872jA);
                ((C0874l) c0874l).a(c0872jA);
                z zVar6 = c0872jA.f15928t.f15996t;
                if (zVar6 != null) {
                    l(c0872jA, e(zVar6.f16002z));
                }
            }
            w();
            this.f15837e = null;
        }
        Collection collectionValues = p086i8.y.A(p10.a).values();
        ArrayList<O> arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!((O) obj2).f15894b) {
                arrayList.add(obj2);
            }
        }
        for (O o10 : arrayList) {
            Object c0874l2 = linkedHashMap.get(o10);
            if (c0874l2 == null) {
                c0874l2 = new C0874l(this, o10);
                linkedHashMap.put(o10, c0874l2);
            }
            o10.e((C0874l) c0874l2);
        }
        if (this.f15835c == null || !hVar.isEmpty()) {
            b();
            return;
        }
        if (this.f15838f || (activity = this.f15834b) == null || !k(activity.getIntent())) {
            z zVar7 = this.f15835c;
            p210v8.i.c(zVar7);
            m(zVar7, bundle, null);
        }
    }

    public final void u(C0872j c0872j) {
        p210v8.i.f(c0872j, "child");
        C0872j c0872j2 = (C0872j) this.j.remove(c0872j);
        if (c0872j2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f15842k;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c0872j2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C0874l c0874l = (C0874l) this.f15853v.get(this.f15852u.b(c0872j2.f15928t.f15995s));
            if (c0874l != null) {
                c0874l.b(c0872j2);
            }
            linkedHashMap.remove(c0872j2);
        }
    }

    public final void v() {
        AtomicInteger atomicInteger;
        P0.d dVar;
        Set set;
        ArrayList<C0872j> arrayListT0 = p086i8.k.t0(this.f15839g);
        if (arrayListT0.isEmpty()) {
            return;
        }
        x xVar = ((C0872j) p086i8.k.b0(arrayListT0)).f15928t;
        ArrayList arrayList = new ArrayList();
        if (xVar instanceof InterfaceC0866d) {
            Iterator it = p086i8.k.i0(arrayListT0).iterator();
            while (it.hasNext()) {
                x xVar2 = ((C0872j) it.next()).f15928t;
                arrayList.add(xVar2);
                if (!(xVar2 instanceof InterfaceC0866d) && !(xVar2 instanceof z)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C0872j c0872j : p086i8.k.i0(arrayListT0)) {
            EnumC0519n enumC0519n = c0872j.f15926C;
            x xVar3 = c0872j.f15928t;
            EnumC0519n enumC0519n2 = EnumC0519n.f6759w;
            EnumC0519n enumC0519n3 = EnumC0519n.f6758v;
            if (xVar != null && xVar3.f16002z == xVar.f16002z) {
                if (enumC0519n != enumC0519n2) {
                    C0874l c0874l = (C0874l) this.f15853v.get(this.f15852u.b(xVar3.f15995s));
                    if (p210v8.i.a((c0874l == null || (dVar = c0874l.f15942f) == null || (set = (Set) ((Q9.t) ((Q9.m) dVar.f3811t)).f()) == null) ? null : Boolean.valueOf(set.contains(c0872j)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f15842k.get(c0872j)) != null && atomicInteger.get() == 0)) {
                        map.put(c0872j, enumC0519n3);
                    } else {
                        map.put(c0872j, enumC0519n2);
                    }
                }
                x xVar4 = (x) p086i8.k.V(arrayList);
                if (xVar4 != null && xVar4.f16002z == xVar3.f16002z) {
                    if (arrayList.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    arrayList.remove(0);
                }
                xVar = xVar.f15996t;
            } else if (arrayList.isEmpty() || xVar3.f16002z != ((x) p086i8.k.T(arrayList)).f16002z) {
                c0872j.c(EnumC0519n.f6757u);
            } else {
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                x xVar5 = (x) arrayList.remove(0);
                if (enumC0519n == enumC0519n2) {
                    c0872j.c(enumC0519n3);
                } else if (enumC0519n != enumC0519n3) {
                    map.put(c0872j, enumC0519n3);
                }
                z zVar = xVar5.f15996t;
                if (zVar != null && !arrayList.contains(zVar)) {
                    arrayList.add(zVar);
                }
            }
        }
        for (C0872j c0872j2 : arrayListT0) {
            EnumC0519n enumC0519n4 = (EnumC0519n) map.get(c0872j2);
            if (enumC0519n4 != null) {
                c0872j2.c(enumC0519n4);
            } else {
                c0872j2.f();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX WARN: Type inference failed for: r0v2, types: [u8.a, v8.h] */
    public final void w() {
        boolean z6;
        if (this.f15851t) {
            z6 = g() > 1;
        }
        p156q0.D d3 = this.f15850s;
        d3.a = z6;
        ?? r10 = d3.f14255c;
        if (r10 != 0) {
            r10.invoke();
        }
    }
}
