package y0;

import android.util.Log;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: y0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0874l {
    public final ReentrantLock a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q9.t f15938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q9.t f15939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P0.d f15941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P0.d f15942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O f15943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B f15944h;

    public C0874l(B b3, O o10) {
        p210v8.i.f(o10, "navigator");
        this.f15944h = b3;
        this.a = new ReentrantLock(true);
        Q9.t tVarA = Q9.q.a(p086i8.s.f12328s);
        this.f15938b = tVarA;
        Q9.t tVarA2 = Q9.q.a(p086i8.u.f12330s);
        this.f15939c = tVarA2;
        this.f15941e = new P0.d(tVarA, 3);
        this.f15942f = new P0.d(tVarA2, 3);
        this.f15943g = o10;
    }

    public final void a(C0872j c0872j) {
        p210v8.i.f(c0872j, "backStackEntry");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Q9.t tVar = this.f15938b;
            ArrayList arrayListH0 = p086i8.k.h0((Collection) tVar.f(), c0872j);
            tVar.getClass();
            tVar.h(null, arrayListH0);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    public final void b(C0872j c0872j) {
        C0878p c0878p;
        V v4;
        p210v8.i.f(c0872j, "entry");
        B b3 = this.f15944h;
        boolean zA = p210v8.i.a(b3.f15856y.get(c0872j), Boolean.TRUE);
        Q9.t tVar = this.f15939c;
        tVar.h(null, p086i8.C.r((Set) tVar.f(), c0872j));
        b3.f15856y.remove(c0872j);
        p086i8.h hVar = b3.f15839g;
        boolean zContains = hVar.contains(c0872j);
        Q9.t tVar2 = b3.f15841i;
        if (zContains) {
            if (this.f15940d) {
                return;
            }
            b3.v();
            ArrayList arrayListT0 = p086i8.k.t0(hVar);
            Q9.t tVar3 = b3.f15840h;
            tVar3.getClass();
            tVar3.h(null, arrayListT0);
            ArrayList arrayListR = b3.r();
            tVar2.getClass();
            tVar2.h(null, arrayListR);
            return;
        }
        b3.u(c0872j);
        if (c0872j.f15934z.f6763c.compareTo(EnumC0519n.f6757u) >= 0) {
            c0872j.c(EnumC0519n.f6755s);
        }
        boolean z6 = hVar instanceof Collection;
        String str = c0872j.f15932x;
        if (!z6 || !hVar.isEmpty()) {
            Iterator it = hVar.iterator();
            while (it.hasNext()) {
                if (p210v8.i.a(((C0872j) it.next()).f15932x, str)) {
                }
            }
            if (!zA && (c0878p = b3.f15846o) != null) {
                p210v8.i.f(str, "backStackEntryId");
                v4 = (V) c0878p.f15958b.remove(str);
                if (v4 != null) {
                    v4.a();
                }
            }
        } else if (!zA) {
            p210v8.i.f(str, "backStackEntryId");
            v4 = (V) c0878p.f15958b.remove(str);
            if (v4 != null) {
                v4.a();
            }
        }
        b3.v();
        ArrayList arrayListR2 = b3.r();
        tVar2.getClass();
        tVar2.h(null, arrayListR2);
    }

    public final void c(C0872j c0872j) {
        int iNextIndex;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            ArrayList arrayListT0 = p086i8.k.t0((Collection) ((Q9.t) ((Q9.m) this.f15941e.f3811t)).f());
            ListIterator listIterator = arrayListT0.listIterator(arrayListT0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (p210v8.i.a(((C0872j) listIterator.previous()).f15932x, c0872j.f15932x)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayListT0.set(iNextIndex, c0872j);
            Q9.t tVar = this.f15938b;
            tVar.getClass();
            tVar.h(null, arrayListT0);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(C0872j c0872j, boolean z6) {
        p210v8.i.f(c0872j, "popUpTo");
        B b3 = this.f15944h;
        O oB = b3.f15852u.b(c0872j.f15928t.f15995s);
        b3.f15856y.put(c0872j, Boolean.valueOf(z6));
        if (!oB.equals(this.f15943g)) {
            Object obj = b3.f15853v.get(oB);
            p210v8.i.c(obj);
            ((C0874l) obj).d(c0872j, z6);
            return;
        }
        C0875m c0875m = b3.f15855x;
        if (c0875m != null) {
            c0875m.invoke(c0872j);
            e(c0872j);
            return;
        }
        C0873k c0873k = new C0873k(this, c0872j, z6);
        p086i8.h hVar = b3.f15839g;
        int iIndexOf = hVar.indexOf(c0872j);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + c0872j + " as it was not found on the current back stack");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != hVar.f12325u) {
            b3.o(((C0872j) hVar.get(i10)).f15928t.f16002z, true, false);
        }
        B.q(b3, c0872j);
        c0873k.invoke();
        b3.w();
        b3.b();
    }

    public final void e(C0872j c0872j) {
        p210v8.i.f(c0872j, "popUpTo");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Q9.t tVar = this.f15938b;
            Iterable iterable = (Iterable) tVar.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (p210v8.i.a((C0872j) obj, c0872j)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            tVar.getClass();
            tVar.h(null, arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(C0872j c0872j, boolean z6) {
        Object objPrevious;
        p210v8.i.f(c0872j, "popUpTo");
        Q9.t tVar = this.f15939c;
        Iterable iterable = (Iterable) tVar.f();
        boolean z10 = iterable instanceof Collection;
        P0.d dVar = this.f15941e;
        if (!z10 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C0872j) it.next()) == c0872j) {
                    Iterable iterable2 = (Iterable) ((Q9.t) ((Q9.m) dVar.f3811t)).f();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C0872j) it2.next()) == c0872j) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        tVar.h(null, p086i8.C.v((Set) tVar.f(), c0872j));
        List list = (List) ((Q9.t) ((Q9.m) dVar.f3811t)).f();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C0872j c0872j2 = (C0872j) objPrevious;
            if (!p210v8.i.a(c0872j2, c0872j)) {
                Q9.m mVar = (Q9.m) dVar.f3811t;
                if (((List) ((Q9.t) mVar).f()).lastIndexOf(c0872j2) < ((List) ((Q9.t) mVar).f()).lastIndexOf(c0872j)) {
                    break;
                }
            }
        }
        C0872j c0872j3 = (C0872j) objPrevious;
        if (c0872j3 != null) {
            tVar.h(null, p086i8.C.v((Set) tVar.f(), c0872j3));
        }
        d(c0872j, z6);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [u8.b, v8.k] */
    public final void g(C0872j c0872j) {
        p210v8.i.f(c0872j, "backStackEntry");
        B b3 = this.f15944h;
        O oB = b3.f15852u.b(c0872j.f15928t.f15995s);
        if (!oB.equals(this.f15943g)) {
            Object obj = b3.f15853v.get(oB);
            if (obj == null) {
                throw new IllegalStateException(E0.a.l(new StringBuilder("NavigatorBackStack for "), c0872j.f15928t.f15995s, " should already be created").toString());
            }
            ((C0874l) obj).g(c0872j);
            return;
        }
        ?? r10 = b3.f15854w;
        if (r10 != 0) {
            r10.invoke(c0872j);
            a(c0872j);
        } else {
            Log.i("NavController", "Ignoring add of destination " + c0872j.f15928t + " outside of the call to navigate(). ");
        }
    }

    public final void h(C0872j c0872j) {
        Q9.t tVar = this.f15939c;
        Iterable iterable = (Iterable) tVar.f();
        boolean z6 = iterable instanceof Collection;
        P0.d dVar = this.f15941e;
        if (!z6 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C0872j) it.next()) == c0872j) {
                    Iterable iterable2 = (Iterable) ((Q9.t) ((Q9.m) dVar.f3811t)).f();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C0872j) it2.next()) == c0872j) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        C0872j c0872j2 = (C0872j) p086i8.k.c0((List) ((Q9.t) ((Q9.m) dVar.f3811t)).f());
        if (c0872j2 != null) {
            LinkedHashSet linkedHashSetV = p086i8.C.v((Set) tVar.f(), c0872j2);
            tVar.getClass();
            tVar.h(null, linkedHashSetV);
        }
        LinkedHashSet linkedHashSetV2 = p086i8.C.v((Set) tVar.f(), c0872j);
        tVar.getClass();
        tVar.h(null, linkedHashSetV2);
        g(c0872j);
    }
}
