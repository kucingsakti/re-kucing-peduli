package p156q0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.fragment.app.b;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import o1.c;
import p086i8.k;
import p086i8.q;
import p210v8.i;

/* JADX INFO: renamed from: q0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0752k {
    public final ViewGroup a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14333f;

    public C0752k(ViewGroup viewGroup) {
        i.f(viewGroup, "container");
        this.a = viewGroup;
        this.f14329b = new ArrayList();
        this.f14330c = new ArrayList();
    }

    public static final C0752k i(ViewGroup viewGroup, e eVar) {
        i.f(viewGroup, "container");
        i.f(eVar, "fragmentManager");
        i.e(eVar.J(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0752k) {
            return (C0752k) tag;
        }
        C0752k c0752k = new C0752k(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0752k);
        return c0752k;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z6;
        T t7;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z6 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                U u3 = (U) it.next();
                if (!u3.f14292k.isEmpty()) {
                    ArrayList arrayList2 = u3.f14292k;
                    if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                break;
                            }
                            t7 = (T) it2.next();
                            t7.getClass();
                        } while (t7 instanceof C0748g);
                    } else {
                        break;
                    }
                }
                z6 = false;
            }
        }
        if (z6) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                q.J(arrayList3, ((U) it3.next()).f14292k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(U u3) {
        i.f(u3, "operation");
        if (u3.f14291i) {
            AbstractC0487g.a(u3.a, u3.f14285c.Y(), this.a);
            u3.f14291i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z6) {
        Object obj;
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            U u3 = (U) next;
            View view = u3.f14285c.c0;
            i.e(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    if (u3.a != 2) {
                        break;
                    }
                } else {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(AbstractC0487g.g(visibility, "Unknown visibility "));
                    }
                }
            }
        }
        U u10 = (U) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            U u11 = (U) objPrevious;
            View view2 = u11.f14285c.c0;
            i.e(view2, "operation.fragment.mView");
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(AbstractC0487g.g(visibility2, "Unknown visibility "));
                }
            }
            if (u11.a == 2) {
                obj = objPrevious;
                break;
            }
        }
        U u12 = (U) obj;
        if (e.K(2)) {
            Objects.toString(u10);
            Objects.toString(u12);
        }
        ArrayList<C0746e> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = ((U) k.b0(arrayList)).f14285c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0760t c0760t = ((U) it2.next()).f14285c.f0;
            C0760t c0760t2 = bVar.f0;
            c0760t.f14358b = c0760t2.f14358b;
            c0760t.f14359c = c0760t2.f14359c;
            c0760t.f14360d = c0760t2.f14360d;
            c0760t.f14361e = c0760t2.f14361e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            boolean z10 = false;
            if (!it3.hasNext()) {
                break;
            }
            U u13 = (U) it3.next();
            arrayList2.add(new C0746e(u13, z6));
            if (!z6 ? u13 == u12 : u13 == u10) {
                z10 = true;
            }
            C0751j c0751j = new C0751j(u13);
            int i10 = u13.a;
            b bVar2 = u13.f14285c;
            if (i10 == 2) {
                if (z6) {
                    C0760t c0760t3 = bVar2.f0;
                } else {
                    bVar2.getClass();
                }
            } else if (z6) {
                C0760t c0760t4 = bVar2.f0;
            } else {
                bVar2.getClass();
            }
            if (u13.a == 2) {
                if (z6) {
                    C0760t c0760t5 = bVar2.f0;
                } else {
                    C0760t c0760t6 = bVar2.f0;
                }
            }
            if (z10) {
                if (z6) {
                    C0760t c0760t7 = bVar2.f0;
                } else {
                    bVar2.getClass();
                }
            }
            arrayList3.add(c0751j);
            u13.f14286d.add(new RunnableC0743b(this, u13, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!((C0751j) obj2).Q0()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((C0751j) it4.next()).getClass();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((C0751j) it5.next()).getClass();
        }
        ArrayList<C0746e> arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            q.J(arrayList7, ((U) ((C0746e) it6.next()).f577s).f14292k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        boolean z11 = false;
        for (C0746e c0746e : arrayList2) {
            Context context = this.a.getContext();
            U u14 = (U) c0746e.f577s;
            i.e(context, "context");
            c cVarX0 = c0746e.X0(context);
            if (cVarX0 != null) {
                if (((AnimatorSet) cVarX0.f13624u) == null) {
                    arrayList6.add(c0746e);
                } else {
                    b bVar3 = u14.f14285c;
                    if (u14.f14292k.isEmpty()) {
                        if (u14.a == 3) {
                            u14.f14291i = false;
                        }
                        u14.j.add(new C0748g(c0746e));
                        z11 = true;
                    } else if (e.K(2)) {
                        Objects.toString(bVar3);
                    }
                }
            }
        }
        for (C0746e c0746e2 : arrayList6) {
            U u15 = (U) c0746e2.f577s;
            b bVar4 = u15.f14285c;
            if (zIsEmpty) {
                if (!z11) {
                    u15.j.add(new C0745d(c0746e2));
                } else if (e.K(2)) {
                    Objects.toString(bVar4);
                }
            } else if (e.K(2)) {
                Objects.toString(bVar4);
            }
        }
    }

    public final void c(ArrayList arrayList) {
        i.f(arrayList, "operations");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q.J(arrayList2, ((U) it.next()).f14292k);
        }
        List listS0 = k.s0(k.w0(arrayList2));
        int size = listS0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((T) listS0.get(i10)).b(this.a);
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a((U) arrayList.get(i11));
        }
        List listS1 = k.s0(arrayList);
        int size3 = listS1.size();
        for (int i12 = 0; i12 < size3; i12++) {
            U u3 = (U) listS1.get(i12);
            if (u3.f14292k.isEmpty()) {
                u3.b();
            }
        }
    }

    public final void d(int i10, int i11, f fVar) {
        synchronized (this.f14329b) {
            try {
                b bVar = fVar.f6701c;
                i.e(bVar, "fragmentStateManager.fragment");
                U uF = f(bVar);
                if (uF == null) {
                    b bVar2 = fVar.f6701c;
                    uF = bVar2.f6614F ? g(bVar2) : null;
                }
                if (uF != null) {
                    uF.d(i10, i11);
                    return;
                }
                U u3 = new U(i10, i11, fVar);
                this.f14329b.add(u3);
                u3.f14286d.add(new RunnableC0743b(this, u3, 1));
                u3.f14286d.add(new RunnableC0743b(this, u3, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z6;
        if (this.f14333f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            h();
            this.f14332e = false;
            return;
        }
        synchronized (this.f14329b) {
            try {
                ArrayList<U> arrayListT0 = k.t0(this.f14330c);
                this.f14330c.clear();
                Iterator it = arrayListT0.iterator();
                while (true) {
                    z6 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    U u3 = (U) it.next();
                    if (this.f14329b.isEmpty() || !u3.f14285c.f6614F) {
                        z6 = false;
                    }
                    u3.f14289g = z6;
                }
                for (U u10 : arrayListT0) {
                    if (this.f14331d) {
                        if (e.K(2)) {
                            Objects.toString(u10);
                        }
                        u10.b();
                    } else {
                        if (e.K(2)) {
                            Objects.toString(u10);
                        }
                        u10.a(this.a);
                    }
                    this.f14331d = false;
                    if (!u10.f14288f) {
                        this.f14330c.add(u10);
                    }
                }
                if (!this.f14329b.isEmpty()) {
                    l();
                    ArrayList arrayListT1 = k.t0(this.f14329b);
                    if (arrayListT1.isEmpty()) {
                        return;
                    }
                    this.f14329b.clear();
                    this.f14330c.addAll(arrayListT1);
                    e.K(2);
                    b(arrayListT1, this.f14332e);
                    boolean zJ = j(arrayListT1);
                    Iterator it2 = arrayListT1.iterator();
                    boolean z10 = true;
                    while (it2.hasNext()) {
                        if (!((U) it2.next()).f14285c.f6614F) {
                            z10 = false;
                        }
                    }
                    if (!z10 || zJ) {
                        z6 = false;
                    }
                    this.f14331d = z6;
                    e.K(2);
                    if (!z10) {
                        k(arrayListT1);
                        c(arrayListT1);
                    } else if (zJ) {
                        k(arrayListT1);
                        int size = arrayListT1.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            a((U) arrayListT1.get(i10));
                        }
                    }
                    this.f14332e = false;
                    e.K(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final U f(b bVar) {
        Object next;
        Iterator it = this.f14329b.iterator();
        while (it.hasNext()) {
            next = it.next();
            U u3 = (U) next;
            if (i.a(u3.f14285c, bVar) && !u3.f14287e) {
                return (U) next;
            }
        }
        next = null;
        return (U) next;
    }

    public final U g(b bVar) {
        Object next;
        Iterator it = this.f14330c.iterator();
        while (it.hasNext()) {
            next = it.next();
            U u3 = (U) next;
            if (i.a(u3.f14285c, bVar) && !u3.f14287e) {
                return (U) next;
            }
        }
        next = null;
        return (U) next;
    }

    public final void h() {
        e.K(2);
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.f14329b) {
            try {
                l();
                k(this.f14329b);
                ArrayList<U> arrayListT0 = k.t0(this.f14330c);
                Iterator it = arrayListT0.iterator();
                while (it.hasNext()) {
                    ((U) it.next()).f14289g = false;
                }
                for (U u3 : arrayListT0) {
                    if (e.K(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(u3);
                    }
                    u3.a(this.a);
                }
                ArrayList<U> arrayListT1 = k.t0(this.f14329b);
                Iterator it2 = arrayListT1.iterator();
                while (it2.hasNext()) {
                    ((U) it2.next()).f14289g = false;
                }
                for (U u10 : arrayListT1) {
                    if (e.K(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(u10);
                    }
                    u10.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            U u3 = (U) arrayList.get(i10);
            if (!u3.f14290h) {
                u3.f14290h = true;
                int i11 = u3.f14284b;
                f fVar = u3.f14293l;
                if (i11 == 2) {
                    b bVar = fVar.f6701c;
                    i.e(bVar, "fragmentStateManager.fragment");
                    View viewFindFocus = bVar.c0.findFocus();
                    if (viewFindFocus != null) {
                        bVar.j().f14366k = viewFindFocus;
                        if (e.K(2)) {
                            viewFindFocus.toString();
                            bVar.toString();
                        }
                    }
                    View viewY = u3.f14285c.Y();
                    if (viewY.getParent() == null) {
                        fVar.b();
                        viewY.setAlpha(0.0f);
                    }
                    if (viewY.getAlpha() == 0.0f && viewY.getVisibility() == 0) {
                        viewY.setVisibility(4);
                    }
                    C0760t c0760t = bVar.f0;
                    viewY.setAlpha(c0760t == null ? 1.0f : c0760t.j);
                } else if (i11 == 3) {
                    b bVar2 = fVar.f6701c;
                    i.e(bVar2, "fragmentStateManager.fragment");
                    View viewY2 = bVar2.Y();
                    if (e.K(2)) {
                        Objects.toString(viewY2.findFocus());
                        viewY2.toString();
                        bVar2.toString();
                    }
                    viewY2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q.J(arrayList2, ((U) it.next()).f14292k);
        }
        List listS0 = k.s0(k.w0(arrayList2));
        int size2 = listS0.size();
        for (int i12 = 0; i12 < size2; i12++) {
            T t7 = (T) listS0.get(i12);
            t7.getClass();
            ViewGroup viewGroup = this.a;
            i.f(viewGroup, "container");
            if (!t7.a) {
                t7.d(viewGroup);
            }
            t7.a = true;
        }
    }

    public final void l() {
        for (U u3 : this.f14329b) {
            int i10 = 2;
            if (u3.f14284b == 2) {
                int visibility = u3.f14285c.Y().getVisibility();
                if (visibility != 0) {
                    i10 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC0487g.g(visibility, "Unknown visibility "));
                        }
                        i10 = 3;
                    }
                }
                u3.d(i10, 1);
            }
        }
    }
}
