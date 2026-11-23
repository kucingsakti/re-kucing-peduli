package p013b1;

import E4.C0189c;
import E4.C0193g;
import N0.b;
import P0.d;
import U.U;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.fragment.app.Fragment$SavedState;
import androidx.lifecycle.C0511f;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0519n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import androidx.viewpager2.widget.ViewPager2;
import com.kcstream.cing.activity.Browser2Activity;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p156q0.B;
import p156q0.C0742a;
import p156q0.M;
import p210v8.i;
import p212w.a;
import p212w.f;
import p212w.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends s implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0525u f7251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M f7252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f7253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f7254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f7255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f7256i;
    public final d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7258l;

    public e(Browser2Activity browser2Activity) {
        M m2 = browser2Activity.m();
        this.f7253f = new g();
        this.f7254g = new g();
        this.f7255h = new g();
        d dVar = new d(15, false);
        dVar.f3811t = new CopyOnWriteArrayList();
        this.j = dVar;
        this.f7257k = false;
        this.f7258l = false;
        this.f7252e = m2;
        this.f7251d = browser2Activity.f10468v;
        l(true);
    }

    public static void m(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // androidx.recyclerview.widget.s
    public final long b(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.s
    public final void d(RecyclerView recyclerView) {
        if (this.f7256i != null) {
            throw new IllegalArgumentException();
        }
        d dVar = new d(this);
        this.f7256i = dVar;
        ViewPager2 viewPager2A = d.a(recyclerView);
        dVar.f7248d = viewPager2A;
        b bVar = new b(dVar);
        dVar.a = bVar;
        ((ArrayList) viewPager2A.f7198u.f7244b).add(bVar);
        c cVar = new c(dVar, 0);
        dVar.f7246b = cVar;
        this.a.registerObserver(cVar);
        b bVar2 = new b(dVar, 4);
        dVar.f7247c = bVar2;
        this.f7251d.a(bVar2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.s
    public final void e(RecyclerView.a aVar, int i10) {
        Bundle bundle;
        f fVar = (f) aVar;
        long j = fVar.f7007w;
        FrameLayout frameLayout = (FrameLayout) fVar.f7003s;
        int id = frameLayout.getId();
        Long lP = p(id);
        g gVar = this.f7255h;
        if (lP != null && lP.longValue() != j) {
            r(lP.longValue());
            gVar.k(lP.longValue());
        }
        gVar.j(j, Integer.valueOf(id));
        long j10 = i10;
        g gVar2 = this.f7253f;
        if (gVar2.h(j10) < 0) {
            C0189c c0189c = (C0189c) this;
            String str = (String) c0189c.f1401m.get(i10);
            Browser2Activity browser2Activity = c0189c.f1403o;
            Bundle bundle2 = browser2Activity.f10167S;
            Bundle bundle3 = null;
            if (bundle2 == null) {
                i.n("urlFromIntent");
                throw null;
            }
            File file = browser2Activity.f10169U;
            if (file == null) {
                i.n("adFile");
                throw null;
            }
            C0193g c0193g = new C0193g(str, bundle2, file, browser2Activity.f10171W);
            c0189c.f1402n.put(Integer.valueOf(i10), c0193g);
            Fragment$SavedState fragment$SavedState = (Fragment$SavedState) this.f7254g.e(j10);
            if (c0193g.f6622N != null) {
                throw new IllegalStateException("Fragment already added");
            }
            if (fragment$SavedState != null && (bundle = fragment$SavedState.f6578s) != null) {
                bundle3 = bundle;
            }
            c0193g.f6651t = bundle3;
            gVar2.j(j10, c0193g);
        }
        WeakHashMap weakHashMap = U.a;
        if (frameLayout.isAttachedToWindow()) {
            q(fVar);
        }
        o();
    }

    @Override // androidx.recyclerview.widget.s
    public final RecyclerView.a f(ViewGroup viewGroup, int i10) {
        int i11 = f.f7259M;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = U.a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new f(frameLayout);
    }

    @Override // androidx.recyclerview.widget.s
    public final void g(RecyclerView recyclerView) {
        d dVar = this.f7256i;
        dVar.getClass();
        ViewPager2 viewPager2A = d.a(recyclerView);
        ((ArrayList) viewPager2A.f7198u.f7244b).remove(dVar.a);
        c cVar = dVar.f7246b;
        e eVar = dVar.f7250f;
        eVar.a.unregisterObserver(cVar);
        eVar.f7251d.f(dVar.f7247c);
        dVar.f7248d = null;
        this.f7256i = null;
    }

    @Override // androidx.recyclerview.widget.s
    public final /* bridge */ /* synthetic */ boolean h(RecyclerView.a aVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.s
    public final void i(RecyclerView.a aVar) {
        q((f) aVar);
        o();
    }

    @Override // androidx.recyclerview.widget.s
    public final void k(RecyclerView.a aVar) {
        Long lP = p(((FrameLayout) ((f) aVar).f7003s).getId());
        if (lP != null) {
            r(lP.longValue());
            this.f7255h.k(lP.longValue());
        }
    }

    public final boolean n(long j) {
        return j >= 0 && j < ((long) ((C0189c) this).f1401m.size());
    }

    public final void o() {
        g gVar;
        g gVar2;
        androidx.fragment.app.b bVar;
        View view;
        if (!this.f7258l || this.f7252e.P()) {
            return;
        }
        f fVar = new f(0);
        int i10 = 0;
        while (true) {
            gVar = this.f7253f;
            int iL = gVar.l();
            gVar2 = this.f7255h;
            if (i10 >= iL) {
                break;
            }
            long jI = gVar.i(i10);
            if (!n(jI)) {
                fVar.add(Long.valueOf(jI));
                gVar2.k(jI);
            }
            i10++;
        }
        if (!this.f7257k) {
            this.f7258l = false;
            for (int i11 = 0; i11 < gVar.l(); i11++) {
                long jI2 = gVar.i(i11);
                if (gVar2.h(jI2) < 0 && ((bVar = (androidx.fragment.app.b) gVar.e(jI2)) == null || (view = bVar.c0) == null || view.getParent() == null)) {
                    fVar.add(Long.valueOf(jI2));
                }
            }
        }
        a aVar = new a(fVar);
        while (aVar.hasNext()) {
            r(((Long) aVar.next()).longValue());
        }
    }

    public final Long p(int i10) {
        Long lValueOf = null;
        int i11 = 0;
        while (true) {
            g gVar = this.f7255h;
            if (i11 >= gVar.l()) {
                return lValueOf;
            }
            if (((Integer) gVar.m(i11)).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(gVar.i(i11));
            }
            i11++;
        }
    }

    public final void q(f fVar) {
        androidx.fragment.app.b bVar = (androidx.fragment.app.b) this.f7253f.e(fVar.f7007w);
        if (bVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) fVar.f7003s;
        View view = bVar.c0;
        if (!bVar.v() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zV = bVar.v();
        M m2 = this.f7252e;
        if (zV && view == null) {
            a aVar = new a(this, bVar, frameLayout);
            o1.e eVar = m2.f6688o;
            eVar.getClass();
            ((CopyOnWriteArrayList) eVar.f13628u).add(new B(aVar, false));
            return;
        }
        if (bVar.v() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                m(view, frameLayout);
                return;
            }
            return;
        }
        if (bVar.v()) {
            m(view, frameLayout);
            return;
        }
        if (m2.P()) {
            if (m2.f6670J) {
                return;
            }
            this.f7251d.a(new C0511f(this, fVar));
            return;
        }
        a aVar2 = new a(this, bVar, frameLayout);
        o1.e eVar2 = m2.f6688o;
        eVar2.getClass();
        ((CopyOnWriteArrayList) eVar2.f13628u).add(new B(aVar2, false));
        d dVar = this.j;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) dVar.f3811t).iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
        try {
            bVar.d0(false);
            C0742a c0742a = new C0742a(m2);
            c0742a.j(0, bVar, "f" + fVar.f7007w, 1);
            c0742a.n(bVar, EnumC0519n.f6758v);
            c0742a.h();
            this.f7256i.b(false);
        } finally {
            d.q(arrayList);
        }
    }

    public final void r(long j) {
        ViewParent parent;
        g gVar = this.f7253f;
        androidx.fragment.app.b bVar = (androidx.fragment.app.b) gVar.e(j);
        if (bVar == null) {
            return;
        }
        View view = bVar.c0;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zN = n(j);
        g gVar2 = this.f7254g;
        if (!zN) {
            gVar2.k(j);
        }
        if (!bVar.v()) {
            gVar.k(j);
            return;
        }
        M m2 = this.f7252e;
        if (m2.P()) {
            this.f7258l = true;
            return;
        }
        boolean zV = bVar.v();
        d dVar = this.j;
        if (zV && n(j)) {
            dVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) dVar.f3811t).iterator();
            if (it.hasNext()) {
                throw E0.a.e(it);
            }
            androidx.fragment.app.f fVar = (androidx.fragment.app.f) ((HashMap) m2.f6677c.f13783u).get(bVar.f6655x);
            if (fVar != null) {
                androidx.fragment.app.b bVar2 = fVar.f6701c;
                if (bVar2.equals(bVar)) {
                    Fragment$SavedState fragment$SavedState = bVar2.f6650s > -1 ? new Fragment$SavedState(fVar.o()) : null;
                    d.q(arrayList);
                    gVar2.j(j, fragment$SavedState);
                }
            }
            m2.f0(new IllegalStateException(AbstractC0487g.i("Fragment ", bVar, " is not currently in the FragmentManager")));
            throw null;
        }
        dVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) dVar.f3811t).iterator();
        if (it2.hasNext()) {
            throw E0.a.e(it2);
        }
        try {
            C0742a c0742a = new C0742a(m2);
            c0742a.l(bVar);
            c0742a.h();
            gVar.k(j);
        } finally {
            d.q(arrayList2);
        }
    }
}
