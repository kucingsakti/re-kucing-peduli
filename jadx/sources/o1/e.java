package o1;

import A1.RunnableC0094c;
import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.C0141n;
import A9.D;
import A9.I;
import A9.O;
import A9.Q;
import A9.S;
import A9.T;
import A9.W;
import A9.d0;
import C0.t;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0290y;
import L8.P;
import N9.AbstractC0342z;
import U.B0;
import U.InterfaceC0432s;
import X9.InterfaceC0464j;
import X9.InterfaceC0465k;
import X9.L;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.lifecycle.C0525u;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.work.impl.WorkDatabase_Impl;
import com.aheaditec.talsec.security.t2;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.MainApp;
import com.kcstream.cing.R;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import p047e9.C0612d;
import p047e9.C0615g;
import p047e9.C0620l;
import p047e9.C0627t;
import p047e9.C0632y;
import p047e9.G;
import p047e9.Z;
import p078i.AbstractActivityC0655l;
import p086i8.C;
import p086i8.s;
import p091j3.E;
import p104k9.AbstractC0682k;
import p156q0.B;
import p188t1.b0;
import p188t1.i0;
import p188t1.p0;
import p210v8.u;
import ya.C0891l;
import ya.C0898t;
import ya.InterfaceC0884e;

/* JADX INFO: loaded from: classes.dex */
public final class e implements C0.j, InterfaceC0465k, J7.p, InterfaceC0432s, B9.b, p220w9.a, InterfaceC0884e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f13627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f13628u;

    public /* synthetic */ e(Object obj, int i10, Object obj2) {
        this.f13626s = i10;
        this.f13627t = obj;
        this.f13628u = obj2;
    }

    public static e D0(View view) {
        int i10 = R.id.iv_image;
        ImageView imageView = (ImageView) oa.b.c(view, R.id.iv_image);
        if (imageView != null) {
            i10 = R.id.tv_title;
            MaterialTextView materialTextView = (MaterialTextView) oa.b.c(view, R.id.tv_title);
            if (materialTextView != null) {
                return new e(imageView, 4, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // B9.b
    public int A(D9.e eVar) {
        p210v8.i.f(eVar, "<this>");
        if (eVar instanceof D9.d) {
            return B9.g.c((D9.c) eVar);
        }
        if (eVar instanceof D9.a) {
            return ((D9.a) eVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + u.a.b(eVar.getClass())).toString());
    }

    @Override // B9.b
    public boolean A0(D9.d dVar) {
        p210v8.i.f(dVar, "<this>");
        return B9.g.y(B9.g.W(dVar));
    }

    @Override // B9.b
    public D9.c B(D9.c cVar) {
        return B9.g.a0(this, cVar);
    }

    @Override // B9.b
    public boolean B0(D9.b bVar) {
        p210v8.i.f(bVar, "$receiver");
        return bVar instanceof p135n9.a;
    }

    @Override // B9.b
    public S C(p135n9.b bVar) {
        return B9.g.T(bVar);
    }

    public b0 C0() {
        if (Build.VERSION.SDK_INT >= 28 && ((MainApp) this.f13627t).getPackageManager().hasSystemFeature(C.a(C.c("016CB0DB05ECC1E98E761D0C8C4C66318DDABAF25CD8351F55FA9A3F3AFC2A480F70B1")))) {
            return b0.f15010s;
        }
        try {
            synchronized (this) {
                if (((i0) this.f13628u) == null) {
                    this.f13628u = p0.b();
                }
            }
            if (!((i0) this.f13628u).a()) {
                ((i0) this.f13628u).d();
            }
            return ((i0) this.f13628u).b() ? b0.f15011t : b0.f15012u;
        } catch (t2 unused) {
            return b0.f15013v;
        }
    }

    @Override // B9.b
    public d0 D(ArrayList arrayList) {
        D d3;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (d0) p086i8.k.k0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z6 = false;
        boolean z10 = false;
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            z6 = z6 || AbstractC0130c.j(d0Var);
            if (d0Var instanceof D) {
                d3 = (D) d0Var;
            } else {
                if (!(d0Var instanceof A9.r)) {
                    throw new NoWhenBranchMatchedException();
                }
                p210v8.i.f(d0Var, "<this>");
                d3 = ((A9.r) d0Var).f383t;
                z10 = true;
            }
            arrayList2.add(d3);
        }
        if (z6) {
            return C9.i.c(C9.h.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        B9.u uVar = B9.u.a;
        if (!z10) {
            return uVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(p086i8.m.H(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC0130c.z((d0) it2.next()));
        }
        return C0133f.j(uVar.b(arrayList2), uVar.b(arrayList3));
    }

    @Override // U.InterfaceC0432s
    public B0 E(View view, B0 b3) {
        T6.k kVar = new T6.k();
        T6.k kVar2 = (T6.k) this.f13628u;
        kVar.a = kVar2.a;
        kVar.f4694b = kVar2.f4694b;
        kVar.f4695c = kVar2.f4695c;
        kVar.f4696d = kVar2.f4696d;
        return ((E) this.f13627t).k(view, b3, kVar);
    }

    public void E0(androidx.fragment.app.b bVar, Bundle bundle, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.E0(bVar, bundle, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentActivityCreated(eVar, bVar, bundle);
            }
        }
    }

    @Override // p220w9.c
    public List F(K0.q qVar, AbstractC0682k abstractC0682k, int i10) {
        List list;
        p210v8.i.f(abstractC0682k, "proto");
        AbstractC0487g.p(i10, "kind");
        boolean z6 = abstractC0682k instanceof C0620l;
        p230x9.a aVar = (p230x9.a) this.f13627t;
        if (z6) {
            list = (List) ((C0620l) abstractC0682k).j(aVar.f15467b);
        } else if (abstractC0682k instanceof C0632y) {
            list = (List) ((C0632y) abstractC0682k).j(aVar.f15469d);
        } else {
            if (!(abstractC0682k instanceof G)) {
                throw new IllegalStateException(("Unknown message: " + abstractC0682k).toString());
            }
            int iD = p239z.e.d(i10);
            if (iD == 1) {
                list = (List) ((G) abstractC0682k).j(aVar.f15470e);
            } else if (iD == 2) {
                list = (List) ((G) abstractC0682k).j(aVar.f15471f);
            } else {
                if (iD != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((G) abstractC0682k).j(aVar.f15472g);
            }
        }
        if (list == null) {
            list = s.f12328s;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) this.f13628u).h((C0615g) it.next(), (p067g9.f) qVar.f2573b));
        }
        return arrayList;
    }

    public void F0(androidx.fragment.app.b bVar, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        AbstractActivityC0655l abstractActivityC0655l = eVar.f6696w.f14369t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.F0(bVar, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentAttached(eVar, bVar, abstractActivityC0655l);
            }
        }
    }

    @Override // B9.b
    public D G(A9.r rVar) {
        return B9.g.Y(rVar);
    }

    public void G0(androidx.fragment.app.b bVar, Bundle bundle, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.G0(bVar, bundle, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentCreated(eVar, bVar, bundle);
            }
        }
    }

    @Override // B9.b
    public int H(D9.b bVar) {
        return B9.g.k(bVar);
    }

    public void H0(androidx.fragment.app.b bVar, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.H0(bVar, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentDestroyed(eVar, bVar);
            }
        }
    }

    @Override // B9.b
    public S I(D9.d dVar, int i10) {
        p210v8.i.f(dVar, "<this>");
        if (i10 < 0 || i10 >= B9.g.c(dVar)) {
            return null;
        }
        return B9.g.p(dVar, i10);
    }

    public void I0(androidx.fragment.app.b bVar, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.I0(bVar, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentDetached(eVar, bVar);
            }
        }
    }

    @Override // B9.b
    public D9.d J(D9.d dVar) {
        D dQ;
        p210v8.i.f(dVar, "<this>");
        C0141n c0141nF = B9.g.f(dVar);
        return (c0141nF == null || (dQ = B9.g.Q(c0141nF)) == null) ? dVar : dQ;
    }

    public void J0(androidx.fragment.app.b bVar, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.J0(bVar, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentPaused(eVar, bVar);
            }
        }
    }

    @Override // B9.b
    public boolean K(S s9) {
        return B9.g.K(s9);
    }

    public void K0(androidx.fragment.app.b bVar, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        AbstractActivityC0655l abstractActivityC0655l = eVar.f6696w.f14369t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.K0(bVar, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentPreAttached(eVar, bVar, abstractActivityC0655l);
            }
        }
    }

    @Override // B9.b
    public int L(D9.f fVar) {
        return B9.g.R(fVar);
    }

    public void L0(androidx.fragment.app.b bVar, Bundle bundle, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.L0(bVar, bundle, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentPreCreated(eVar, bVar, bundle);
            }
        }
    }

    @Override // B9.b
    public int M(D9.c cVar) {
        return B9.g.c(cVar);
    }

    public void M0(androidx.fragment.app.b bVar, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.M0(bVar, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentResumed(eVar, bVar);
            }
        }
    }

    @Override // p220w9.c
    public ArrayList N(p220w9.r rVar) {
        p210v8.i.f(rVar, "container");
        Iterable iterable = (List) rVar.f15685e.j(((p230x9.a) this.f13627t).f15468c);
        if (iterable == null) {
            iterable = s.f12328s;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(p086i8.m.H(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) this.f13628u).h((C0615g) it.next(), (p067g9.f) rVar.f2573b));
        }
        return arrayList;
    }

    public void N0(androidx.fragment.app.b bVar, Bundle bundle, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.N0(bVar, bundle, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentSaveInstanceState(eVar, bVar, bundle);
            }
        }
    }

    @Override // B9.b
    public D9.e O(D9.d dVar) {
        return B9.g.d(dVar);
    }

    public void O0(androidx.fragment.app.b bVar, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.O0(bVar, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentStarted(eVar, bVar);
            }
        }
    }

    @Override // B9.b
    public boolean P(D9.d dVar) {
        p210v8.i.f(dVar, "<this>");
        D dH = B9.g.h(dVar);
        return (dH != null ? B9.g.e(this, dH) : null) != null;
    }

    public void P0(androidx.fragment.app.b bVar, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.P0(bVar, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentStopped(eVar, bVar);
            }
        }
    }

    @Override // B9.b
    public d0 Q(S s9) {
        return B9.g.r(s9);
    }

    public void Q0(androidx.fragment.app.b bVar, View view, Bundle bundle, boolean z6) {
        p210v8.i.f(bVar, "f");
        p210v8.i.f(view, "v");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.Q0(bVar, view, bundle, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentViewCreated(eVar, bVar, view, bundle);
            }
        }
    }

    @Override // B9.b
    public int R(P p10) {
        p210v8.i.f(p10, "$receiver");
        int iJ0 = p10.j0();
        AbstractC0487g.u(iJ0, "this.variance");
        return com.bumptech.glide.d.g(iJ0);
    }

    public void R0(androidx.fragment.app.b bVar, boolean z6) {
        p210v8.i.f(bVar, "f");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f13627t;
        androidx.fragment.app.b bVar2 = eVar.f6698y;
        if (bVar2 != null) {
            bVar2.p().f6688o.R0(bVar, true);
        }
        for (B b3 : (CopyOnWriteArrayList) this.f13628u) {
            if (!z6 || b3.f14252b) {
                b3.a.onFragmentViewDestroyed(eVar, bVar);
            }
        }
    }

    @Override // B9.b
    public D S(D9.d dVar) {
        return B9.g.j(dVar);
    }

    public d0 S0(Z8.a aVar) {
        d0 d0VarY;
        D d3 = aVar.f5909f;
        return (d3 == null || (d0VarY = qa.b.y(d3)) == null) ? (C9.f) ((p076h8.j) this.f13627t).getValue() : d0VarY;
    }

    @Override // ya.InterfaceC0884e
    public Type T() {
        return (Type) this.f13627t;
    }

    public AbstractC0151y T0(P p10, Z8.a aVar) {
        p210v8.i.f(p10, "typeParameter");
        p210v8.i.f(aVar, "typeAttr");
        return (AbstractC0151y) ((p247z9.e) this.f13628u).invoke(new Q(p10, aVar));
    }

    @Override // B9.b
    public D U(D9.c cVar) {
        return B9.g.h(cVar);
    }

    public Long U0(String str) {
        K0.o oVarC = K0.o.c(1, "SELECT long_value FROM Preference where `key`=?");
        oVarC.m(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13627t;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(oVarC);
        try {
            Long lValueOf = null;
            if (cursorM.moveToFirst() && !cursorM.isNull(0)) {
                lValueOf = Long.valueOf(cursorM.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM.close();
            oVarC.g();
        }
    }

    @Override // B9.b
    public d0 V(D9.c cVar) {
        return B9.g.P(cVar);
    }

    public com.bumptech.glide.l V0(Context context, com.bumptech.glide.b bVar, C0525u c0525u, androidx.fragment.app.e eVar, boolean z6) {
        U1.n.a();
        U1.n.a();
        HashMap map = (HashMap) this.f13627t;
        com.bumptech.glide.l lVar = (com.bumptech.glide.l) map.get(c0525u);
        if (lVar != null) {
            return lVar;
        }
        N1.h hVar = new N1.h(c0525u);
        K3.d dVar = new K3.d(this, eVar);
        ((p053f4.e) this.f13628u).getClass();
        com.bumptech.glide.l lVar2 = new com.bumptech.glide.l(bVar, hVar, dVar, context);
        map.put(c0525u, lVar2);
        hVar.b(new N1.j(this, c0525u));
        if (z6) {
            lVar2.e();
        }
        return lVar2;
    }

    @Override // B9.b
    public void W(D9.c cVar) {
        p210v8.i.f(cVar, "<this>");
        B9.g.g(cVar);
    }

    public void W0(d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13627t;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f13628u).h(dVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.j();
        }
    }

    @Override // p220w9.c
    public List X(K0.q qVar, AbstractC0682k abstractC0682k, int i10, int i11, Z z6) {
        p210v8.i.f(abstractC0682k, "callableProto");
        AbstractC0487g.p(i10, "kind");
        Iterable iterable = (List) z6.j(((p230x9.a) this.f13627t).j);
        if (iterable == null) {
            iterable = s.f12328s;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(p086i8.m.H(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) this.f13628u).h((C0615g) it.next(), (p067g9.f) qVar.f2573b));
        }
        return arrayList;
    }

    public void X0(int i10) {
        Toolbar toolbar = (Toolbar) this.f13627t;
        if (i10 == 0) {
            toolbar.setNavigationContentDescription((CharSequence) this.f13628u);
        } else {
            toolbar.setNavigationContentDescription(i10);
        }
    }

    @Override // B9.b
    public boolean Y(D9.f fVar) {
        return B9.g.G(fVar);
    }

    public void Y0(U7.b bVar) {
        int iNextInt;
        LinkedHashMap linkedHashMap;
        SecureRandom secureRandom = p045e7.b.f10710u;
        do {
            iNextInt = p045e7.b.f10710u.nextInt();
            linkedHashMap = p045e7.b.f10711v;
        } while (linkedHashMap.containsKey(Integer.valueOf(iNextInt)));
        linkedHashMap.put(Integer.valueOf(iNextInt), new WeakReference(bVar));
        ((p210v8.r) this.f13628u).f15464s = iNextInt;
        p045e7.h hVar = new p045e7.h();
        Bundle bundle = new Bundle();
        bundle.putInt("req_id", iNextInt);
        bundle.putCharSequence("title", "Autentikasi");
        bundle.putCharSequence("subtitle", "Untuk masuk silahkan konfirmasi dengan jari Anda");
        bundle.putCharSequence("description", "");
        bundle.putCharSequence("negative", "Batal");
        bundle.putCharSequence("prompt", "Sentuh sensor fingeprint");
        bundle.putCharSequence("not_recognized", "Jari tidak dikenal");
        hVar.b0(bundle);
        hVar.n0(((p045e7.b) this.f13627t).f10713t.m(), "MarshmallowDialog");
    }

    @Override // p220w9.c
    public List Z(K0.q qVar, G g8) {
        p210v8.i.f(g8, "proto");
        ((p230x9.a) this.f13627t).getClass();
        s sVar = s.f12328s;
        ArrayList arrayList = new ArrayList(p086i8.m.H(sVar, 10));
        Iterator<E> it = sVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) this.f13628u).h((C0615g) it.next(), (p067g9.f) qVar.f2573b));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b6  */
    public p095j8.h Z0(A9.Z z6, List list, Z8.a aVar) {
        d0 d0VarQ;
        p095j8.h hVar = new p095j8.h();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC0151y abstractC0151y = (AbstractC0151y) it.next();
            InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
            if (interfaceC0273gW instanceof InterfaceC0271e) {
                Set set = aVar.f5908e;
                d0 d0VarD0 = abstractC0151y.D0();
                if (d0VarD0 instanceof A9.r) {
                    A9.r rVar = (A9.r) d0VarD0;
                    D dQ = rVar.f383t;
                    if (!dQ.D().u().isEmpty() && dQ.D().w() != null) {
                        List listU = dQ.D().u();
                        p210v8.i.e(listU, "constructor.parameters");
                        List<P> list2 = listU;
                        ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
                        for (P p10 : list2) {
                            S i10 = (S) p086i8.k.W(abstractC0151y.l(), p10.d0());
                            boolean z10 = set != null && set.contains(p10);
                            if (i10 == null || z10) {
                                i10 = new I(p10);
                            } else {
                                W wF = z6.f();
                                AbstractC0151y abstractC0151yB = i10.b();
                                p210v8.i.e(abstractC0151yB, "argument.type");
                                if (wF.d(abstractC0151yB) == null) {
                                    i10 = new I(p10);
                                }
                            }
                            arrayList.add(i10);
                        }
                        dQ = AbstractC0130c.q(dQ, arrayList, null, 2);
                    }
                    D dQ2 = rVar.f384u;
                    if (!dQ2.D().u().isEmpty() && dQ2.D().w() != null) {
                        List listU2 = dQ2.D().u();
                        p210v8.i.e(listU2, "constructor.parameters");
                        List<P> list3 = listU2;
                        ArrayList arrayList2 = new ArrayList(p086i8.m.H(list3, 10));
                        for (P p11 : list3) {
                            S i11 = (S) p086i8.k.W(abstractC0151y.l(), p11.d0());
                            boolean z11 = set != null && set.contains(p11);
                            if (i11 == null || z11) {
                                i11 = new I(p11);
                            } else {
                                W wF2 = z6.f();
                                AbstractC0151y abstractC0151yB2 = i11.b();
                                p210v8.i.e(abstractC0151yB2, "argument.type");
                                if (wF2.d(abstractC0151yB2) == null) {
                                    i11 = new I(p11);
                                }
                            }
                            arrayList2.add(i11);
                        }
                        dQ2 = AbstractC0130c.q(dQ2, arrayList2, null, 2);
                    }
                    d0VarQ = C0133f.j(dQ, dQ2);
                } else {
                    if (!(d0VarD0 instanceof D)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    D d3 = (D) d0VarD0;
                    if (d3.D().u().isEmpty() || d3.D().w() == null) {
                        d0VarQ = d3;
                    } else {
                        List listU3 = d3.D().u();
                        p210v8.i.e(listU3, "constructor.parameters");
                        List<P> list4 = listU3;
                        ArrayList arrayList3 = new ArrayList(p086i8.m.H(list4, 10));
                        for (P p12 : list4) {
                            S i12 = (S) p086i8.k.W(abstractC0151y.l(), p12.d0());
                            boolean z12 = set != null && set.contains(p12);
                            if (i12 == null || z12) {
                                i12 = new I(p12);
                            } else {
                                W wF3 = z6.f();
                                AbstractC0151y abstractC0151yB3 = i12.b();
                                p210v8.i.e(abstractC0151yB3, "argument.type");
                                if (wF3.d(abstractC0151yB3) == null) {
                                    i12 = new I(p12);
                                }
                            }
                            arrayList3.add(i12);
                        }
                        d0VarQ = AbstractC0130c.q(d3, arrayList3, null, 2);
                    }
                }
                hVar.add(z6.g(3, AbstractC0130c.h(d0VarQ, d0VarD0)));
            } else if (interfaceC0273gW instanceof P) {
                Set set2 = aVar.f5908e;
                if (set2 == null || !set2.contains(interfaceC0273gW)) {
                    List upperBounds = ((P) interfaceC0273gW).getUpperBounds();
                    p210v8.i.e(upperBounds, "declaration.upperBounds");
                    hVar.addAll(Z0(z6, upperBounds, aVar));
                } else {
                    hVar.add(S0(aVar));
                }
            }
        }
        return C.d(hVar);
    }

    @Override // B9.b
    public boolean a(D9.c cVar) {
        p210v8.i.f(cVar, "<this>");
        D dH = B9.g.h(cVar);
        return (dH != null ? B9.g.f(dH) : null) != null;
    }

    @Override // B9.b
    public d0 a0(D9.d dVar, D9.d dVar2) {
        return B9.g.m(this, dVar, dVar2);
    }

    public m a1(p096j9.f fVar, String str) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        String strG = fVar.g();
        p210v8.i.e(strG, "name.asString()");
        return new m(this, new p029c9.n(strG.concat(str)));
    }

    @Override // J7.p
    public void b(L7.b bVar) {
        O7.b.i((R7.a) this.f13627t, bVar);
    }

    @Override // B9.b
    public boolean b0(P p10, D9.f fVar) {
        return B9.g.v(p10, fVar);
    }

    @Override // J7.p
    public void c(Object obj) {
        ((J7.p) this.f13628u).c(obj);
    }

    @Override // B9.b
    public boolean c0(D9.f fVar) {
        return B9.g.D(fVar);
    }

    @Override // B9.b
    public B9.a d(D9.d dVar) {
        return B9.g.U(this, dVar);
    }

    @Override // B9.b
    public boolean d0(D9.d dVar, D9.d dVar2) {
        return B9.g.w(dVar, dVar2);
    }

    @Override // B9.b
    public boolean e(D9.f fVar, D9.f fVar2) {
        p210v8.i.f(fVar, "c1");
        p210v8.i.f(fVar2, "c2");
        if (!(fVar instanceof O)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(fVar2 instanceof O)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (B9.g.b(fVar, fVar2)) {
            return true;
        }
        O o10 = (O) fVar;
        O o11 = (O) fVar2;
        if (((B9.c) this.f13628u).a(o10, o11)) {
            return true;
        }
        HashMap map = (HashMap) this.f13627t;
        if (map == null) {
            return false;
        }
        O o12 = (O) map.get(o10);
        O o13 = (O) map.get(o11);
        if (o12 == null || !o12.equals(o11)) {
            return o13 != null && o13.equals(o10);
        }
        return true;
    }

    @Override // B9.b
    public D9.b e0(D9.d dVar) {
        return B9.g.e(this, dVar);
    }

    @Override // B9.b
    public boolean f(D9.d dVar) {
        return B9.g.B(dVar);
    }

    @Override // B9.b
    public boolean f0(d0 d0Var) {
        p210v8.i.f(d0Var, "<this>");
        return B9.g.F(o(d0Var)) != B9.g.F(u0(d0Var));
    }

    @Override // B9.b
    public Collection g0(D9.f fVar) {
        return B9.g.V(fVar);
    }

    @Override // B9.b
    public S h(D9.c cVar, int i10) {
        return B9.g.p(cVar, i10);
    }

    @Override // B9.b
    public O h0(D9.d dVar) {
        return B9.g.W(dVar);
    }

    @Override // B9.b
    public Set i(D9.d dVar) {
        return B9.g.S(this, dVar);
    }

    @Override // B9.b
    public boolean i0(D9.d dVar) {
        p210v8.i.f(dVar, "<this>");
        return B9.g.G(j(dVar)) && !B9.g.H(dVar);
    }

    @Override // B9.b
    public O j(D9.c cVar) {
        p210v8.i.f(cVar, "<this>");
        D dH = B9.g.h(cVar);
        if (dH == null) {
            dH = o(cVar);
        }
        return B9.g.W(dH);
    }

    @Override // p220w9.c
    public ArrayList j0(p047e9.W w2, p067g9.f fVar) {
        p210v8.i.f(w2, "proto");
        p210v8.i.f(fVar, "nameResolver");
        Iterable iterable = (List) w2.j(((p230x9.a) this.f13627t).f15476l);
        if (iterable == null) {
            iterable = s.f12328s;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(p086i8.m.H(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) this.f13628u).h((C0615g) it.next(), fVar));
        }
        return arrayList;
    }

    @Override // B9.b
    public boolean k(D9.f fVar) {
        return B9.g.y(fVar);
    }

    @Override // p220w9.c
    public ArrayList k0(p047e9.Q q10, p067g9.f fVar) {
        p210v8.i.f(q10, "proto");
        p210v8.i.f(fVar, "nameResolver");
        Iterable iterable = (List) q10.j(((p230x9.a) this.f13627t).f15475k);
        if (iterable == null) {
            iterable = s.f12328s;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(p086i8.m.H(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) this.f13628u).h((C0615g) it.next(), fVar));
        }
        return arrayList;
    }

    @Override // B9.b
    public boolean l(D9.f fVar) {
        return B9.g.z(fVar);
    }

    @Override // p220w9.c
    public List l0(K0.q qVar, G g8) {
        p210v8.i.f(g8, "proto");
        ((p230x9.a) this.f13627t).getClass();
        s sVar = s.f12328s;
        ArrayList arrayList = new ArrayList(p086i8.m.H(sVar, 10));
        Iterator<E> it = sVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) this.f13628u).h((C0615g) it.next(), (p067g9.f) qVar.f2573b));
        }
        return arrayList;
    }

    @Override // B9.b
    public boolean m(D9.f fVar) {
        return B9.g.E(fVar);
    }

    @Override // B9.b
    public int m0(S s9) {
        return B9.g.t(s9);
    }

    @Override // B9.b
    public C0141n n(D9.d dVar) {
        return B9.g.f(dVar);
    }

    @Override // B9.b
    public boolean n0(D9.b bVar) {
        return B9.g.J(bVar);
    }

    @Override // B9.b
    public D o(D9.c cVar) {
        D dN;
        p210v8.i.f(cVar, "<this>");
        A9.r rVarG = B9.g.g(cVar);
        if (rVarG != null && (dN = B9.g.N(rVarG)) != null) {
            return dN;
        }
        D dH = B9.g.h(cVar);
        p210v8.i.c(dH);
        return dH;
    }

    @Override // p220w9.a
    public Object o0(K0.q qVar, G g8, AbstractC0151y abstractC0151y) {
        p210v8.i.f(g8, "proto");
        C0612d c0612d = (C0612d) xa.d.m(g8, ((p230x9.a) this.f13627t).f15474i);
        if (c0612d == null) {
            return null;
        }
        return ((k) this.f13628u).v(abstractC0151y, c0612d, (p067g9.f) qVar.f2573b);
    }

    @Override // J7.p
    public void onError(Throwable th) {
        ((J7.p) this.f13628u).onError(th);
    }

    @Override // X9.InterfaceC0465k
    public void onFailure(InterfaceC0464j interfaceC0464j, IOException iOException) {
        p210v8.i.f(interfaceC0464j, "call");
        iOException.printStackTrace();
        String message = iOException.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        ((L4.a) this.f13627t).l(message);
    }

    @Override // X9.InterfaceC0465k
    public void onResponse(InterfaceC0464j interfaceC0464j, L l4) throws IOException {
        p210v8.i.f(interfaceC0464j, "call");
        boolean zC = l4.c();
        L4.a aVar = (L4.a) this.f13627t;
        if (!zC) {
            aVar.l(l4.f5533u);
            return;
        }
        File file = (File) this.f13628u;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            X9.O o10 = l4.f5537y;
            N9.W w2 = N9.W.f3434s;
            if (o10 != null) {
                long jA = o10.a();
                byte[] bArr = new byte[1024];
                InputStream inputStreamV = o10.c().V();
                long j = 0;
                while (true) {
                    int i10 = inputStreamV.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                    j += (long) i10;
                    U9.d dVar = N9.I.a;
                    AbstractC0342z.n(w2, S9.n.a, new L4.b(aVar, (int) ((j / jA) * ((double) 100)), null), 2);
                }
                inputStreamV.close();
            }
            fileOutputStream.close();
            U9.d dVar2 = N9.I.a;
            AbstractC0342z.n(w2, S9.n.a, new L4.c(aVar, file, null), 2);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.bumptech.glide.c.c(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // B9.b
    public P p(D9.f fVar, int i10) {
        return B9.g.q(fVar, i10);
    }

    @Override // B9.b
    public boolean p0(D9.f fVar) {
        return B9.g.x(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // B9.b
    public S q(D9.e eVar, int i10) {
        p210v8.i.f(eVar, "<this>");
        if (eVar instanceof D9.d) {
            return B9.g.p((D9.c) eVar, i10);
        }
        if (eVar instanceof D9.a) {
            E e10 = ((D9.a) eVar).get(i10);
            p210v8.i.e(e10, "get(index)");
            return (S) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + u.a.b(eVar.getClass())).toString());
    }

    @Override // B9.b
    public boolean q0(D9.d dVar) {
        return B9.g.F(dVar);
    }

    @Override // B9.b
    public B9.j r(D9.b bVar) {
        return B9.g.X(bVar);
    }

    @Override // B9.b
    public D r0(A9.r rVar) {
        return B9.g.N(rVar);
    }

    @Override // B9.b
    public d0 s(D9.b bVar) {
        return B9.g.O(bVar);
    }

    @Override // B9.b
    public boolean s0(D9.c cVar) {
        p210v8.i.f(cVar, "$receiver");
        return cVar instanceof p019b9.g;
    }

    @Override // B9.b
    public A9.r t(D9.c cVar) {
        return B9.g.g(cVar);
    }

    @Override // p220w9.c
    public List t0(K0.q qVar, AbstractC0682k abstractC0682k, int i10) {
        String str;
        p210v8.i.f(abstractC0682k, "proto");
        AbstractC0487g.p(i10, "kind");
        boolean z6 = abstractC0682k instanceof C0632y;
        p230x9.a aVar = (p230x9.a) this.f13627t;
        if (z6) {
            aVar.getClass();
        } else {
            if (!(abstractC0682k instanceof G)) {
                throw new IllegalStateException(("Unknown message: " + abstractC0682k).toString());
            }
            int iD = p239z.e.d(i10);
            if (iD != 1 && iD != 2 && iD != 3) {
                if (i10 == 1) {
                    str = "FUNCTION";
                } else if (i10 == 2) {
                    str = "PROPERTY";
                } else if (i10 != 3) {
                    str = i10 != 4 ? "null" : "PROPERTY_SETTER";
                } else {
                    str = "PROPERTY_GETTER";
                }
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
            }
            aVar.getClass();
        }
        s sVar = s.f12328s;
        ArrayList arrayList = new ArrayList(p086i8.m.H(sVar, 10));
        Iterator<E> it = sVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) this.f13628u).h((C0615g) it.next(), (p067g9.f) qVar.f2573b));
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f13626s) {
            case 10:
                return "Bounds{lower=" + ((L.c) this.f13627t) + " upper=" + ((L.c) this.f13628u) + "}";
            default:
                return super.toString();
        }
    }

    @Override // B9.b
    public boolean u(D9.d dVar) {
        p210v8.i.f(dVar, "<this>");
        return B9.g.D(B9.g.W(dVar));
    }

    @Override // B9.b
    public D u0(D9.c cVar) {
        D dY;
        p210v8.i.f(cVar, "<this>");
        A9.r rVarG = B9.g.g(cVar);
        if (rVarG != null && (dY = B9.g.Y(rVarG)) != null) {
            return dY;
        }
        D dH = B9.g.h(cVar);
        p210v8.i.c(dH);
        return dH;
    }

    @Override // B9.b
    public D v(C0141n c0141n) {
        return B9.g.Q(c0141n);
    }

    @Override // B9.b
    public void v0(D9.d dVar) {
        B9.g.M(dVar);
    }

    @Override // B9.b
    public void w(D9.d dVar) {
        B9.g.L(dVar);
    }

    @Override // ya.InterfaceC0884e
    public Object w0(C0898t c0898t) {
        Executor executor = (Executor) this.f13628u;
        return executor == null ? c0898t : new C0891l(executor, c0898t);
    }

    @Override // C0.j
    public void x(Preference preference) {
        ((PreferenceGroup) this.f13627t).f6844k0 = Integer.MAX_VALUE;
        t tVar = (t) this.f13628u;
        Handler handler = tVar.f889h;
        RunnableC0094c runnableC0094c = tVar.f890i;
        handler.removeCallbacks(runnableC0094c);
        handler.post(runnableC0094c);
    }

    @Override // p220w9.c
    public List x0(K0.q qVar, C0627t c0627t) {
        p210v8.i.f(qVar, "container");
        Iterable iterable = (List) c0627t.j(((p230x9.a) this.f13627t).f15473h);
        if (iterable == null) {
            iterable = s.f12328s;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(p086i8.m.H(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) this.f13628u).h((C0615g) it.next(), (p067g9.f) qVar.f2573b));
        }
        return arrayList;
    }

    @Override // B9.b
    public D y(D9.d dVar, boolean z6) {
        return B9.g.Z(dVar, z6);
    }

    @Override // p220w9.a
    public Object y0(K0.q qVar, G g8, AbstractC0151y abstractC0151y) {
        p210v8.i.f(g8, "proto");
        return null;
    }

    @Override // B9.b
    public T z(D9.c cVar) {
        return B9.g.i(cVar);
    }

    @Override // B9.b
    public boolean z0(D9.f fVar) {
        return B9.g.A(fVar);
    }

    public e(MainApp mainApp) {
        this.f13626s = 18;
        this.f13627t = mainApp;
    }

    public e(HashMap map, B9.c cVar) {
        this.f13626s = 16;
        p210v8.i.f(cVar, "equalityAxioms");
        this.f13627t = map;
        this.f13628u = cVar;
    }

    public e(p170r3.e eVar) {
        this.f13626s = 1;
        p247z9.l lVar = new p247z9.l("Type parameter upper bound erasure results");
        this.f13627t = D3.b.s(new A0.r(this, 3));
        this.f13628u = lVar.b(new A0.m(this, 4));
    }

    public e(p053f4.e eVar) {
        this.f13626s = 7;
        this.f13627t = new HashMap();
        this.f13628u = eVar;
    }

    public e(Object obj) {
        this.f13626s = 21;
        this.f13627t = obj;
        this.f13628u = Thread.currentThread();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(p200u8.b bVar) {
        this.f13626s = 3;
        this.f13627t = (p210v8.k) bVar;
        this.f13628u = new ConcurrentHashMap();
    }

    public e(androidx.fragment.app.e eVar) {
        this.f13626s = 17;
        p210v8.i.f(eVar, "fragmentManager");
        this.f13627t = eVar;
        this.f13628u = new CopyOnWriteArrayList();
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f13626s = 0;
        this.f13627t = workDatabase_Impl;
        this.f13628u = new b(workDatabase_Impl, 1);
    }

    public e(InterfaceC0290y interfaceC0290y, p140o4.r rVar, p230x9.a aVar) {
        this.f13626s = 19;
        p210v8.i.f(interfaceC0290y, "module");
        p210v8.i.f(aVar, "protocol");
        this.f13627t = aVar;
        this.f13628u = new k(interfaceC0290y, rVar);
    }

    public e() {
        this.f13626s = 11;
        this.f13627t = new ArrayList();
        this.f13628u = new ArrayList();
    }

    public e(p188t1.G g8, HashMap map, HashMap map2) {
        this.f13626s = 12;
        this.f13627t = g8;
        this.f13628u = map;
    }

    public e(ArrayList arrayList, ArrayList arrayList2) {
        this.f13626s = 5;
        int size = arrayList.size();
        this.f13627t = new int[size];
        this.f13628u = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f13627t)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f13628u)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public e(int i10, int i11) {
        this.f13626s = 5;
        this.f13627t = new int[]{i10, i11};
        this.f13628u = new float[]{0.0f, 1.0f};
    }

    public e(int i10, int i11, int i12) {
        this.f13626s = 5;
        this.f13627t = new int[]{i10, i11, i12};
        this.f13628u = new float[]{0.0f, 0.5f, 1.0f};
    }

    public e(t tVar, PreferenceGroup preferenceGroup) {
        this.f13626s = 2;
        this.f13628u = tVar;
        this.f13627t = preferenceGroup;
    }

    public e(Toolbar toolbar) {
        this.f13626s = 14;
        this.f13627t = toolbar;
        toolbar.getNavigationIcon();
        this.f13628u = toolbar.getNavigationContentDescription();
    }

    @Override // B9.b
    public void g(D9.d dVar, D9.f fVar) {
    }
}
