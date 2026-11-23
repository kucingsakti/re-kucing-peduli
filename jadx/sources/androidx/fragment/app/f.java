package androidx.fragment.app;

import C8.InterfaceC0175c;
import U.F;
import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.EnumC0519n;
import com.kcstream.cing.R;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p078i.AbstractActivityC0655l;
import p136o.ViewOnAttachStateChangeListenerC0686d;
import p140o4.r;
import p156q0.AbstractC0761u;
import p156q0.C0752k;
import p156q0.C0760t;
import p156q0.C0763w;
import p156q0.M;
import p156q0.N;
import p156q0.O;
import p156q0.Q;
import p156q0.U;
import p156q0.V;
import p156q0.W;
import p204v1.g;
import p210v8.i;
import p212w.j;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final o1.e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f6700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f6701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6702d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6703e = -1;

    public f(o1.e eVar, r rVar, b bVar) {
        this.a = eVar;
        this.f6700b = rVar;
        this.f6701c = bVar;
    }

    public final void a() {
        boolean zK = e.K(3);
        b bVar = this.f6701c;
        if (zK) {
            Objects.toString(bVar);
        }
        Bundle bundle = bVar.f6651t;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        bVar.P.R();
        bVar.f6650s = 3;
        bVar.f6634a0 = false;
        bVar.z();
        if (!bVar.f6634a0) {
            throw new W(AbstractC0487g.i("Fragment ", bVar, " did not call through to super.onActivityCreated()"));
        }
        if (e.K(3)) {
            bVar.toString();
        }
        if (bVar.c0 != null) {
            Bundle bundle3 = bVar.f6651t;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = bVar.f6652u;
            if (sparseArray != null) {
                bVar.c0.restoreHierarchyState(sparseArray);
                bVar.f6652u = null;
            }
            bVar.f6634a0 = false;
            bVar.S(bundle4);
            if (!bVar.f6634a0) {
                throw new W(AbstractC0487g.i("Fragment ", bVar, " did not call through to super.onViewStateRestored()"));
            }
            if (bVar.c0 != null) {
                bVar.f6644m0.b(EnumC0518m.ON_CREATE);
            }
        }
        bVar.f6651t = null;
        M m2 = bVar.P;
        m2.f6668H = false;
        m2.f6669I = false;
        m2.f6675O.f14268g = false;
        m2.u(4);
        this.a.E0(bVar, bundle2, false);
    }

    public final void b() {
        b bVar;
        View view;
        View view2;
        int iIndexOfChild = -1;
        b bVar2 = this.f6701c;
        View view3 = bVar2.f6635b0;
        while (true) {
            bVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            b bVar3 = tag instanceof b ? (b) tag : null;
            if (bVar3 != null) {
                bVar = bVar3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        b bVar4 = bVar2.f6624Q;
        if (bVar != null && !bVar.equals(bVar4)) {
            int i10 = bVar2.f6626S;
            p167r0.b bVar5 = p167r0.c.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(bVar2);
            sb.append(" within the view of parent fragment ");
            sb.append(bVar);
            sb.append(" via container with ID ");
            p167r0.c.b(new WrongNestedHierarchyViolation(bVar2, E0.a.j(sb, i10, " without using parent's childFragmentManager")));
            p167r0.c.a(bVar2).getClass();
        }
        r rVar = this.f6700b;
        rVar.getClass();
        ViewGroup viewGroup = bVar2.f6635b0;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) rVar.f13782t;
            int iIndexOf = arrayList.indexOf(bVar2);
            for (int i11 = iIndexOf - 1; i11 >= 0; i11--) {
                b bVar6 = (b) arrayList.get(i11);
                if (bVar6.f6635b0 == viewGroup && (view2 = bVar6.c0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                b bVar7 = (b) arrayList.get(iIndexOf);
                if (bVar7.f6635b0 == viewGroup && (view = bVar7.c0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        bVar2.f6635b0.addView(bVar2.c0, iIndexOfChild);
    }

    public final void c() {
        boolean zK = e.K(3);
        b bVar = this.f6701c;
        if (zK) {
            Objects.toString(bVar);
        }
        b bVar2 = bVar.f6657z;
        f fVar = null;
        r rVar = this.f6700b;
        if (bVar2 != null) {
            f fVar2 = (f) ((HashMap) rVar.f13783u).get(bVar2.f6655x);
            if (fVar2 == null) {
                throw new IllegalStateException("Fragment " + bVar + " declared target fragment " + bVar.f6657z + " that does not belong to this FragmentManager!");
            }
            bVar.f6609A = bVar.f6657z.f6655x;
            bVar.f6657z = null;
            fVar = fVar2;
        } else {
            String str = bVar.f6609A;
            if (str != null && (fVar = (f) ((HashMap) rVar.f13783u).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(bVar);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(E0.a.l(sb, bVar.f6609A, " that does not belong to this FragmentManager!"));
            }
        }
        if (fVar != null) {
            fVar.k();
        }
        e eVar = bVar.f6622N;
        bVar.f6623O = eVar.f6696w;
        bVar.f6624Q = eVar.f6698y;
        o1.e eVar2 = this.a;
        eVar2.K0(bVar, false);
        ArrayList arrayList = bVar.f6648q0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0761u) it.next()).a();
        }
        arrayList.clear();
        bVar.P.b(bVar.f6623O, bVar.h(), bVar);
        bVar.f6650s = 0;
        bVar.f6634a0 = false;
        bVar.B(bVar.f6623O.f14369t);
        if (!bVar.f6634a0) {
            throw new W(AbstractC0487g.i("Fragment ", bVar, " did not call through to super.onAttach()"));
        }
        e eVar3 = bVar.f6622N;
        Iterator it2 = eVar3.f6689p.iterator();
        while (it2.hasNext()) {
            ((O) it2.next()).b(eVar3, bVar);
        }
        M m2 = bVar.P;
        m2.f6668H = false;
        m2.f6669I = false;
        m2.f6675O.f14268g = false;
        m2.u(0);
        eVar2.F0(bVar, false);
    }

    public final int d() {
        b bVar = this.f6701c;
        if (bVar.f6622N == null) {
            return bVar.f6650s;
        }
        int iMin = this.f6703e;
        int iOrdinal = bVar.f6642k0.ordinal();
        int i10 = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (bVar.f6616H) {
            if (bVar.f6617I) {
                iMin = Math.max(this.f6703e, 2);
                View view = bVar.c0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f6703e < 4 ? Math.min(iMin, bVar.f6650s) : Math.min(iMin, 1);
            }
        }
        if (bVar.f6618J && bVar.f6635b0 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!bVar.f6612D) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = bVar.f6635b0;
        if (viewGroup != null) {
            C0752k c0752kI = C0752k.i(viewGroup, bVar.p());
            c0752kI.getClass();
            U uF = c0752kI.f(bVar);
            int i11 = uF != null ? uF.f14284b : 0;
            U uG = c0752kI.g(bVar);
            i10 = uG != null ? uG.f14284b : 0;
            int i12 = i11 == 0 ? -1 : V.a[p239z.e.d(i11)];
            if (i12 != -1 && i12 != 1) {
                i10 = i11;
            }
        }
        if (i10 == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i10 == 3) {
            iMin = Math.max(iMin, 3);
        } else if (bVar.f6613E) {
            iMin = bVar.x() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (bVar.f6636d0 && bVar.f6650s < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (bVar.f6614F) {
            iMin = Math.max(iMin, 3);
        }
        if (e.K(2)) {
            Objects.toString(bVar);
        }
        return iMin;
    }

    public final void e() {
        boolean zK = e.K(3);
        b bVar = this.f6701c;
        if (zK) {
            Objects.toString(bVar);
        }
        Bundle bundle = bVar.f6651t;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (bVar.f6640i0) {
            bVar.f6650s = 1;
            bVar.Z();
            return;
        }
        o1.e eVar = this.a;
        eVar.L0(bVar, bundle2, false);
        bVar.P.R();
        bVar.f6650s = 1;
        bVar.f6634a0 = false;
        bVar.f6643l0.a(new N0.b(bVar, 5));
        bVar.C(bundle2);
        bVar.f6640i0 = true;
        if (!bVar.f6634a0) {
            throw new W(AbstractC0487g.i("Fragment ", bVar, " did not call through to super.onCreate()"));
        }
        bVar.f6643l0.d(EnumC0518m.ON_CREATE);
        eVar.G0(bVar, bundle2, false);
    }

    public final void f() {
        String resourceName;
        int i10 = 2;
        b bVar = this.f6701c;
        if (bVar.f6616H) {
            return;
        }
        if (e.K(3)) {
            Objects.toString(bVar);
        }
        Bundle bundle = bVar.f6651t;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterI = bVar.I(bundle2);
        bVar.f6639h0 = layoutInflaterI;
        ViewGroup viewGroup = bVar.f6635b0;
        if (viewGroup == null) {
            int i11 = bVar.f6626S;
            if (i11 == 0) {
                viewGroup = null;
            } else {
                if (i11 == -1) {
                    throw new IllegalArgumentException(AbstractC0487g.i("Cannot create fragment ", bVar, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) bVar.f6622N.f6697x.c(i11);
                if (viewGroup == null) {
                    if (!bVar.f6619K && !bVar.f6618J) {
                        try {
                            resourceName = bVar.q().getResourceName(bVar.f6626S);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(bVar.f6626S) + " (" + resourceName + ") for fragment " + bVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    p167r0.b bVar2 = p167r0.c.a;
                    p167r0.c.b(new WrongFragmentContainerViolation(bVar, "Attempting to add fragment " + bVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    p167r0.c.a(bVar).getClass();
                }
            }
        }
        bVar.f6635b0 = viewGroup;
        bVar.T(layoutInflaterI, viewGroup, bundle2);
        if (bVar.c0 != null) {
            if (e.K(3)) {
                Objects.toString(bVar);
            }
            bVar.c0.setSaveFromParentEnabled(false);
            bVar.c0.setTag(R.id.fragment_container_view_tag, bVar);
            if (viewGroup != null) {
                b();
            }
            if (bVar.f6628U) {
                bVar.c0.setVisibility(8);
            }
            if (bVar.c0.isAttachedToWindow()) {
                View view = bVar.c0;
                WeakHashMap weakHashMap = U.U.a;
                F.c(view);
            } else {
                View view2 = bVar.c0;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0686d(view2, i10));
            }
            Bundle bundle3 = bVar.f6651t;
            bVar.R(bVar.c0, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            bVar.P.u(2);
            this.a.Q0(bVar, bVar.c0, bundle2, false);
            int visibility = bVar.c0.getVisibility();
            bVar.j().j = bVar.c0.getAlpha();
            if (bVar.f6635b0 != null && visibility == 0) {
                View viewFindFocus = bVar.c0.findFocus();
                if (viewFindFocus != null) {
                    bVar.j().f14366k = viewFindFocus;
                    if (e.K(2)) {
                        viewFindFocus.toString();
                        Objects.toString(bVar);
                    }
                }
                bVar.c0.setAlpha(0.0f);
            }
        }
        bVar.f6650s = 2;
    }

    public final void g() {
        b bVarG;
        boolean zK = e.K(3);
        b bVar = this.f6701c;
        if (zK) {
            Objects.toString(bVar);
        }
        boolean zIsChangingConfigurations = true;
        boolean z6 = bVar.f6613E && !bVar.x();
        r rVar = this.f6700b;
        if (z6 && !bVar.f6615G) {
            rVar.A(bVar.f6655x, null);
        }
        if (!z6) {
            N n10 = (N) rVar.f13785w;
            if (!((n10.f14263b.containsKey(bVar.f6655x) && n10.f14266e) ? n10.f14267f : true)) {
                String str = bVar.f6609A;
                if (str != null && (bVarG = rVar.g(str)) != null && bVarG.f6630W) {
                    bVar.f6657z = bVarG;
                }
                bVar.f6650s = 0;
                return;
            }
        }
        C0763w c0763w = bVar.f6623O;
        if (c0763w instanceof androidx.lifecycle.W) {
            zIsChangingConfigurations = ((N) rVar.f13785w).f14267f;
        } else {
            AbstractActivityC0655l abstractActivityC0655l = c0763w.f14369t;
            if (abstractActivityC0655l instanceof Activity) {
                zIsChangingConfigurations = true ^ abstractActivityC0655l.isChangingConfigurations();
            }
        }
        if ((z6 && !bVar.f6615G) || zIsChangingConfigurations) {
            N n11 = (N) rVar.f13785w;
            n11.getClass();
            if (e.K(3)) {
                Objects.toString(bVar);
            }
            n11.e(bVar.f6655x, false);
        }
        bVar.P.l();
        bVar.f6643l0.d(EnumC0518m.ON_DESTROY);
        bVar.f6650s = 0;
        bVar.f6634a0 = false;
        bVar.f6640i0 = false;
        bVar.F();
        if (!bVar.f6634a0) {
            throw new W(AbstractC0487g.i("Fragment ", bVar, " did not call through to super.onDestroy()"));
        }
        this.a.H0(bVar, false);
        for (f fVar : rVar.j()) {
            if (fVar != null) {
                String str2 = bVar.f6655x;
                b bVar2 = fVar.f6701c;
                if (str2.equals(bVar2.f6609A)) {
                    bVar2.f6657z = bVar;
                    bVar2.f6609A = null;
                }
            }
        }
        String str3 = bVar.f6609A;
        if (str3 != null) {
            bVar.f6657z = rVar.g(str3);
        }
        rVar.y(this);
    }

    public final void h() {
        View view;
        boolean zK = e.K(3);
        b bVar = this.f6701c;
        if (zK) {
            Objects.toString(bVar);
        }
        ViewGroup viewGroup = bVar.f6635b0;
        if (viewGroup != null && (view = bVar.c0) != null) {
            viewGroup.removeView(view);
        }
        bVar.P.u(1);
        if (bVar.c0 != null) {
            Q q10 = bVar.f6644m0;
            q10.c();
            if (q10.f14280v.f6763c.compareTo(EnumC0519n.f6757u) >= 0) {
                bVar.f6644m0.b(EnumC0518m.ON_DESTROY);
            }
        }
        bVar.f6650s = 1;
        bVar.f6634a0 = false;
        bVar.G();
        if (!bVar.f6634a0) {
            throw new W(AbstractC0487g.i("Fragment ", bVar, " did not call through to super.onDestroyView()"));
        }
        androidx.lifecycle.V vE = bVar.e();
        g gVar = p213w0.a.f15513c;
        i.f(vE, "store");
        u0.a aVar = u0.a.f15287t;
        i.f(aVar, "defaultCreationExtras");
        Y1.c cVar = new Y1.c(vE, gVar, aVar);
        InterfaceC0175c interfaceC0175cR = p068ga.d.r(p213w0.a.class);
        String strS = interfaceC0175cR.s();
        if (strS == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        j jVar = ((p213w0.a) cVar.A("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS), interfaceC0175cR)).f15514b;
        if (jVar.h() > 0) {
            jVar.i(0).getClass();
            throw new ClassCastException();
        }
        bVar.f6620L = false;
        this.a.R0(bVar, false);
        bVar.f6635b0 = null;
        bVar.c0 = null;
        bVar.f6644m0 = null;
        bVar.f6645n0.e(null);
        bVar.f6617I = false;
    }

    public final void i() {
        boolean zK = e.K(3);
        b bVar = this.f6701c;
        if (zK) {
            Objects.toString(bVar);
        }
        bVar.f6650s = -1;
        bVar.f6634a0 = false;
        bVar.H();
        bVar.f6639h0 = null;
        if (!bVar.f6634a0) {
            throw new W(AbstractC0487g.i("Fragment ", bVar, " did not call through to super.onDetach()"));
        }
        M m2 = bVar.P;
        if (!m2.f6670J) {
            m2.l();
            bVar.P = new M();
        }
        this.a.I0(bVar, false);
        bVar.f6650s = -1;
        bVar.f6623O = null;
        bVar.f6624Q = null;
        bVar.f6622N = null;
        if (!bVar.f6613E || bVar.x()) {
            N n10 = (N) this.f6700b.f13785w;
            if (!((n10.f14263b.containsKey(bVar.f6655x) && n10.f14266e) ? n10.f14267f : true)) {
                return;
            }
        }
        if (e.K(3)) {
            Objects.toString(bVar);
        }
        bVar.u();
    }

    public final void j() {
        b bVar = this.f6701c;
        if (bVar.f6616H && bVar.f6617I && !bVar.f6620L) {
            if (e.K(3)) {
                Objects.toString(bVar);
            }
            Bundle bundle = bVar.f6651t;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterI = bVar.I(bundle2);
            bVar.f6639h0 = layoutInflaterI;
            bVar.T(layoutInflaterI, null, bundle2);
            View view = bVar.c0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                bVar.c0.setTag(R.id.fragment_container_view_tag, bVar);
                if (bVar.f6628U) {
                    bVar.c0.setVisibility(8);
                }
                Bundle bundle3 = bVar.f6651t;
                bVar.R(bVar.c0, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                bVar.P.u(2);
                this.a.Q0(bVar, bVar.c0, bundle2, false);
                bVar.f6650s = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z6 = this.f6702d;
        b bVar = this.f6701c;
        if (z6) {
            if (e.K(2)) {
                Objects.toString(bVar);
                return;
            }
            return;
        }
        try {
            this.f6702d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                int i10 = bVar.f6650s;
                int i11 = 3;
                r rVar = this.f6700b;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && bVar.f6613E && !bVar.x() && !bVar.f6615G) {
                        if (e.K(3)) {
                            Objects.toString(bVar);
                        }
                        N n10 = (N) rVar.f13785w;
                        n10.getClass();
                        if (e.K(3)) {
                            Objects.toString(bVar);
                        }
                        n10.e(bVar.f6655x, true);
                        rVar.y(this);
                        if (e.K(3)) {
                            Objects.toString(bVar);
                        }
                        bVar.u();
                    }
                    if (bVar.f6638g0) {
                        if (bVar.c0 != null && (viewGroup = bVar.f6635b0) != null) {
                            C0752k c0752kI = C0752k.i(viewGroup, bVar.p());
                            if (bVar.f6628U) {
                                c0752kI.getClass();
                                if (e.K(2)) {
                                    Objects.toString(bVar);
                                }
                                c0752kI.d(3, 1, this);
                            } else {
                                c0752kI.getClass();
                                if (e.K(2)) {
                                    Objects.toString(bVar);
                                }
                                c0752kI.d(2, 1, this);
                            }
                        }
                        e eVar = bVar.f6622N;
                        if (eVar != null && bVar.f6612D && e.L(bVar)) {
                            eVar.f6667G = true;
                        }
                        bVar.f6638g0 = false;
                        bVar.P.o();
                    }
                    this.f6702d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (bVar.f6615G) {
                                if (((Bundle) ((HashMap) rVar.f13784v).get(bVar.f6655x)) == null) {
                                    rVar.A(bVar.f6655x, o());
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            bVar.f6650s = 1;
                            break;
                        case 2:
                            bVar.f6617I = false;
                            bVar.f6650s = 2;
                            break;
                        case 3:
                            if (e.K(3)) {
                                Objects.toString(bVar);
                            }
                            if (bVar.f6615G) {
                                rVar.A(bVar.f6655x, o());
                            } else if (bVar.c0 != null && bVar.f6652u == null) {
                                p();
                            }
                            if (bVar.c0 != null && (viewGroup2 = bVar.f6635b0) != null) {
                                C0752k c0752kI2 = C0752k.i(viewGroup2, bVar.p());
                                c0752kI2.getClass();
                                if (e.K(2)) {
                                    Objects.toString(bVar);
                                }
                                c0752kI2.d(1, 3, this);
                            }
                            bVar.f6650s = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            bVar.f6650s = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (bVar.c0 != null && (viewGroup3 = bVar.f6635b0) != null) {
                                C0752k c0752kI3 = C0752k.i(viewGroup3, bVar.p());
                                int visibility = bVar.c0.getVisibility();
                                if (visibility == 0) {
                                    i11 = 2;
                                } else if (visibility == 4) {
                                    i11 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                c0752kI3.getClass();
                                if (e.K(2)) {
                                    Objects.toString(bVar);
                                }
                                c0752kI3.d(i11, 2, this);
                            }
                            bVar.f6650s = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            bVar.f6650s = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th) {
            this.f6702d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zK = e.K(3);
        b bVar = this.f6701c;
        if (zK) {
            Objects.toString(bVar);
        }
        bVar.P.u(5);
        if (bVar.c0 != null) {
            bVar.f6644m0.b(EnumC0518m.ON_PAUSE);
        }
        bVar.f6643l0.d(EnumC0518m.ON_PAUSE);
        bVar.f6650s = 6;
        bVar.f6634a0 = false;
        bVar.L();
        if (!bVar.f6634a0) {
            throw new W(AbstractC0487g.i("Fragment ", bVar, " did not call through to super.onPause()"));
        }
        this.a.J0(bVar, false);
    }

    public final void m(ClassLoader classLoader) {
        b bVar = this.f6701c;
        Bundle bundle = bVar.f6651t;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (bVar.f6651t.getBundle("savedInstanceState") == null) {
            bVar.f6651t.putBundle("savedInstanceState", new Bundle());
        }
        try {
            bVar.f6652u = bVar.f6651t.getSparseParcelableArray("viewState");
            bVar.f6653v = bVar.f6651t.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) bVar.f6651t.getParcelable(AdOperationMetric.INIT_STATE);
            if (fragmentState != null) {
                bVar.f6609A = fragmentState.f6597E;
                bVar.f6610B = fragmentState.f6598F;
                Boolean bool = bVar.f6654w;
                if (bool != null) {
                    bVar.f6637e0 = bool.booleanValue();
                    bVar.f6654w = null;
                } else {
                    bVar.f6637e0 = fragmentState.f6599G;
                }
            }
            if (bVar.f6637e0) {
                return;
            }
            bVar.f6636d0 = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + bVar, e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    public final void n() {
        boolean zK = e.K(3);
        b bVar = this.f6701c;
        if (zK) {
            Objects.toString(bVar);
        }
        C0760t c0760t = bVar.f0;
        View view = c0760t == null ? null : c0760t.f14366k;
        if (view != null) {
            if (view == bVar.c0) {
                view.requestFocus();
                if (e.K(2)) {
                    view.toString();
                    Objects.toString(bVar);
                    Objects.toString(bVar.c0.findFocus());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == bVar.c0) {
                            view.requestFocus();
                            if (e.K(2)) {
                                view.toString();
                                Objects.toString(bVar);
                                Objects.toString(bVar.c0.findFocus());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        bVar.j().f14366k = null;
        bVar.P.R();
        bVar.P.z(true);
        bVar.f6650s = 7;
        bVar.f6634a0 = false;
        bVar.N();
        if (!bVar.f6634a0) {
            throw new W(AbstractC0487g.i("Fragment ", bVar, " did not call through to super.onResume()"));
        }
        C0525u c0525u = bVar.f6643l0;
        EnumC0518m enumC0518m = EnumC0518m.ON_RESUME;
        c0525u.d(enumC0518m);
        if (bVar.c0 != null) {
            bVar.f6644m0.f14280v.d(enumC0518m);
        }
        M m2 = bVar.P;
        m2.f6668H = false;
        m2.f6669I = false;
        m2.f6675O.f14268g = false;
        m2.u(7);
        this.a.M0(bVar, false);
        this.f6700b.A(bVar.f6655x, null);
        bVar.f6651t = null;
        bVar.f6652u = null;
        bVar.f6653v = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        b bVar = this.f6701c;
        if (bVar.f6650s == -1 && (bundle = bVar.f6651t) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(AdOperationMetric.INIT_STATE, new FragmentState(bVar));
        if (bVar.f6650s > -1) {
            Bundle bundle3 = new Bundle();
            bVar.O(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.N0(bVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            bVar.f6646o0.g(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleY = bVar.P.Y();
            if (!bundleY.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleY);
            }
            if (bVar.c0 != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = bVar.f6652u;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = bVar.f6653v;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = bVar.f6656y;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        b bVar = this.f6701c;
        if (bVar.c0 == null) {
            return;
        }
        if (e.K(2)) {
            Objects.toString(bVar);
            Objects.toString(bVar.c0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        bVar.c0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            bVar.f6652u = sparseArray;
        }
        Bundle bundle = new Bundle();
        bVar.f6644m0.f14281w.g(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        bVar.f6653v = bundle;
    }

    public final void q() {
        boolean zK = e.K(3);
        b bVar = this.f6701c;
        if (zK) {
            Objects.toString(bVar);
        }
        bVar.P.R();
        bVar.P.z(true);
        bVar.f6650s = 5;
        bVar.f6634a0 = false;
        bVar.P();
        if (!bVar.f6634a0) {
            throw new W(AbstractC0487g.i("Fragment ", bVar, " did not call through to super.onStart()"));
        }
        C0525u c0525u = bVar.f6643l0;
        EnumC0518m enumC0518m = EnumC0518m.ON_START;
        c0525u.d(enumC0518m);
        if (bVar.c0 != null) {
            bVar.f6644m0.f14280v.d(enumC0518m);
        }
        M m2 = bVar.P;
        m2.f6668H = false;
        m2.f6669I = false;
        m2.f6675O.f14268g = false;
        m2.u(5);
        this.a.O0(bVar, false);
    }

    public final void r() {
        boolean zK = e.K(3);
        b bVar = this.f6701c;
        if (zK) {
            Objects.toString(bVar);
        }
        M m2 = bVar.P;
        m2.f6669I = true;
        m2.f6675O.f14268g = true;
        m2.u(4);
        if (bVar.c0 != null) {
            bVar.f6644m0.b(EnumC0518m.ON_STOP);
        }
        bVar.f6643l0.d(EnumC0518m.ON_STOP);
        bVar.f6650s = 4;
        bVar.f6634a0 = false;
        bVar.Q();
        if (!bVar.f6634a0) {
            throw new W(AbstractC0487g.i("Fragment ", bVar, " did not call through to super.onStop()"));
        }
        this.a.P0(bVar, false);
    }

    public f(o1.e eVar, r rVar, ClassLoader classLoader, p156q0.F f10, Bundle bundle) {
        this.a = eVar;
        this.f6700b = rVar;
        b bVarA = ((FragmentState) bundle.getParcelable(AdOperationMetric.INIT_STATE)).a(f10);
        this.f6701c = bVarA;
        bVarA.f6651t = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        bVarA.b0(bundle2);
        if (e.K(2)) {
            Objects.toString(bVarA);
        }
    }

    public f(o1.e eVar, r rVar, b bVar, Bundle bundle) {
        this.a = eVar;
        this.f6700b = rVar;
        this.f6701c = bVar;
        bVar.f6652u = null;
        bVar.f6653v = null;
        bVar.f6621M = 0;
        bVar.f6617I = false;
        bVar.f6612D = false;
        b bVar2 = bVar.f6657z;
        bVar.f6609A = bVar2 != null ? bVar2.f6655x : null;
        bVar.f6657z = null;
        bVar.f6651t = bundle;
        bVar.f6656y = bundle.getBundle("arguments");
    }
}
