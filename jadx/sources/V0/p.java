package V0;

import B4.L;
import U.U;
import U.h0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements Cloneable {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Animator[] f5130Q = new Animator[0];

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int[] f5131R = {2, 1, 3, 4};

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final p204v1.g f5132S = new p204v1.g(11);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final ThreadLocal f5133T = new ThreadLocal();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f5136C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f5137D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public n[] f5138E;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f5148O;
    public long P;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5149s = getClass().getName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5150t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f5151u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TimeInterpolator f5152v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f5153w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f5154x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p140o4.r f5155y = new p140o4.r(4);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p140o4.r f5156z = new p140o4.r(4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0446a f5134A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int[] f5135B = f5131R;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ArrayList f5139F = new ArrayList();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Animator[] f5140G = f5130Q;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f5141H = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f5142I = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f5143J = false;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public p f5144K = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f5145L = null;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f5146M = new ArrayList();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public p204v1.g f5147N = f5132S;

    public static void c(p140o4.r rVar, View view, x xVar) {
        ((p212w.e) rVar.f13782t).put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) rVar.f13783u;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = U.a;
        String strK = U.H.k(view);
        if (strK != null) {
            p212w.e eVar = (p212w.e) rVar.f13785w;
            if (eVar.containsKey(strK)) {
                eVar.put(strK, null);
            } else {
                eVar.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                p212w.g gVar = (p212w.g) rVar.f13784v;
                if (gVar.h(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    gVar.j(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) gVar.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    gVar.j(itemIdAtPosition, null);
                }
            }
        }
    }

    public static p212w.e s() {
        ThreadLocal threadLocal = f5133T;
        p212w.e eVar = (p212w.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        p212w.e eVar2 = new p212w.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean y(x xVar, x xVar2, String str) {
        Object obj = xVar.a.get(str);
        Object obj2 = xVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(ViewGroup viewGroup) {
        if (this.f5143J) {
            return;
        }
        ArrayList arrayList = this.f5139F;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f5140G);
        this.f5140G = f5130Q;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f5140G = animatorArr;
        z(this, o.f5128f, false);
        this.f5142I = true;
    }

    public void B() {
        p212w.e eVarS = s();
        this.f5148O = 0L;
        for (int i10 = 0; i10 < this.f5146M.size(); i10++) {
            Animator animator = (Animator) this.f5146M.get(i10);
            j jVar = (j) eVarS.get(animator);
            if (animator != null && jVar != null) {
                long j = this.f5151u;
                Animator animator2 = jVar.f5124f;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j10 = this.f5150t;
                if (j10 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j10);
                }
                TimeInterpolator timeInterpolator = this.f5152v;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f5139F.add(animator);
                this.f5148O = Math.max(this.f5148O, k.a(animator));
            }
        }
        this.f5146M.clear();
    }

    public p C(n nVar) {
        p pVar;
        ArrayList arrayList = this.f5145L;
        if (arrayList != null) {
            if (!arrayList.remove(nVar) && (pVar = this.f5144K) != null) {
                pVar.C(nVar);
            }
            if (this.f5145L.size() == 0) {
                this.f5145L = null;
            }
        }
        return this;
    }

    public void D(View view) {
        if (this.f5142I) {
            if (!this.f5143J) {
                ArrayList arrayList = this.f5139F;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f5140G);
                this.f5140G = f5130Q;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f5140G = animatorArr;
                z(this, o.f5129g, false);
            }
            this.f5142I = false;
        }
    }

    public void E() {
        N();
        p212w.e eVarS = s();
        for (Animator animator : this.f5146M) {
            if (eVarS.containsKey(animator)) {
                N();
                if (animator != null) {
                    animator.addListener(new h0(this, eVarS));
                    long j = this.f5151u;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j10 = this.f5150t;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f5152v;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new L(this, 3));
                    animator.start();
                }
            }
        }
        this.f5146M.clear();
        p();
    }

    public void F(long j, long j10) {
        long j11 = this.f5148O;
        boolean z6 = j < j10;
        if ((j10 < 0 && j >= 0) || (j10 > j11 && j <= j11)) {
            this.f5143J = false;
            z(this, o.f5125c, z6);
        }
        ArrayList arrayList = this.f5139F;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f5140G);
        this.f5140G = f5130Q;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            k.b(animator, Math.min(Math.max(0L, j), k.a(animator)));
        }
        this.f5140G = animatorArr;
        if ((j <= j11 || j10 > j11) && (j >= 0 || j10 < 0)) {
            return;
        }
        if (j > j11) {
            this.f5143J = true;
        }
        z(this, o.f5126d, z6);
    }

    public void G(long j) {
        this.f5151u = j;
    }

    public void I(TimeInterpolator timeInterpolator) {
        this.f5152v = timeInterpolator;
    }

    public void J(p204v1.g gVar) {
        if (gVar == null) {
            this.f5147N = f5132S;
        } else {
            this.f5147N = gVar;
        }
    }

    public void M(long j) {
        this.f5150t = j;
    }

    public final void N() {
        if (this.f5141H == 0) {
            z(this, o.f5125c, false);
            this.f5143J = false;
        }
        this.f5141H++;
    }

    public String O(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f5151u != -1) {
            sb.append("dur(");
            sb.append(this.f5151u);
            sb.append(") ");
        }
        if (this.f5150t != -1) {
            sb.append("dly(");
            sb.append(this.f5150t);
            sb.append(") ");
        }
        if (this.f5152v != null) {
            sb.append("interp(");
            sb.append(this.f5152v);
            sb.append(") ");
        }
        ArrayList arrayList = this.f5153w;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5154x;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i10));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i11));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(n nVar) {
        if (this.f5145L == null) {
            this.f5145L = new ArrayList();
        }
        this.f5145L.add(nVar);
    }

    public void cancel() {
        ArrayList arrayList = this.f5139F;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f5140G);
        this.f5140G = f5130Q;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f5140G = animatorArr;
        z(this, o.f5127e, false);
    }

    public abstract void d(x xVar);

    public final void e(View view, boolean z6) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            x xVar = new x(view);
            if (z6) {
                h(xVar);
            } else {
                d(xVar);
            }
            xVar.f5164c.add(this);
            f(xVar);
            if (z6) {
                c(this.f5155y, view, xVar);
            } else {
                c(this.f5156z, view, xVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z6);
            }
        }
    }

    public abstract void h(x xVar);

    public final void i(ViewGroup viewGroup, boolean z6) {
        j(z6);
        ArrayList arrayList = this.f5153w;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5154x;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z6);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                x xVar = new x(viewFindViewById);
                if (z6) {
                    h(xVar);
                } else {
                    d(xVar);
                }
                xVar.f5164c.add(this);
                f(xVar);
                if (z6) {
                    c(this.f5155y, viewFindViewById, xVar);
                } else {
                    c(this.f5156z, viewFindViewById, xVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            x xVar2 = new x(view);
            if (z6) {
                h(xVar2);
            } else {
                d(xVar2);
            }
            xVar2.f5164c.add(this);
            f(xVar2);
            if (z6) {
                c(this.f5155y, view, xVar2);
            } else {
                c(this.f5156z, view, xVar2);
            }
        }
    }

    public final void j(boolean z6) {
        if (z6) {
            ((p212w.e) this.f5155y.f13782t).clear();
            ((SparseArray) this.f5155y.f13783u).clear();
            ((p212w.g) this.f5155y.f13784v).c();
        } else {
            ((p212w.e) this.f5156z.f13782t).clear();
            ((SparseArray) this.f5156z.f13783u).clear();
            ((p212w.g) this.f5156z.f13784v).c();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public p clone() {
        try {
            p pVar = (p) super.clone();
            pVar.f5146M = new ArrayList();
            pVar.f5155y = new p140o4.r(4);
            pVar.f5156z = new p140o4.r(4);
            pVar.f5136C = null;
            pVar.f5137D = null;
            pVar.f5144K = this;
            pVar.f5145L = null;
            return pVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator l(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, p140o4.r rVar, p140o4.r rVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int i11;
        View view;
        x xVar;
        Animator animator;
        x xVar2;
        p212w.e eVarS = s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        r().getClass();
        int i12 = 0;
        while (i12 < size) {
            x xVar3 = (x) arrayList.get(i12);
            x xVar4 = (x) arrayList2.get(i12);
            if (xVar3 != null && !xVar3.f5164c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f5164c.contains(this)) {
                xVar4 = null;
            }
            if ((xVar3 != null || xVar4 != null) && (xVar3 == null || xVar4 == null || w(xVar3, xVar4))) {
                Animator animatorL = l(viewGroup, xVar3, xVar4);
                if (animatorL != null) {
                    String str = this.f5149s;
                    if (xVar4 != null) {
                        String[] strArrT = t();
                        view = xVar4.f5163b;
                        if (strArrT != null && strArrT.length > 0) {
                            xVar2 = new x(view);
                            x xVar5 = (x) ((p212w.e) rVar2.f13782t).get(view);
                            i10 = size;
                            if (xVar5 != null) {
                                int i13 = 0;
                                while (i13 < strArrT.length) {
                                    HashMap map = xVar2.a;
                                    int i14 = i12;
                                    String str2 = strArrT[i13];
                                    map.put(str2, xVar5.a.get(str2));
                                    i13++;
                                    i12 = i14;
                                }
                            }
                            i11 = i12;
                            int i15 = eVarS.f15506u;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= i15) {
                                    animator = animatorL;
                                    break;
                                }
                                j jVar = (j) eVarS.get((Animator) eVarS.g(i16));
                                if (jVar.f5121c != null && jVar.a == view && jVar.f5120b.equals(str) && jVar.f5121c.equals(xVar2)) {
                                    animator = null;
                                    break;
                                }
                                i16++;
                            }
                        } else {
                            i10 = size;
                            i11 = i12;
                            animator = animatorL;
                            xVar2 = null;
                        }
                        animatorL = animator;
                        xVar = xVar2;
                    } else {
                        i10 = size;
                        i11 = i12;
                        view = xVar3.f5163b;
                        xVar = null;
                    }
                    if (animatorL != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        j jVar2 = new j();
                        jVar2.a = view;
                        jVar2.f5120b = str;
                        jVar2.f5121c = xVar;
                        jVar2.f5122d = windowId;
                        jVar2.f5123e = this;
                        jVar2.f5124f = animatorL;
                        eVarS.put(animatorL, jVar2);
                        this.f5146M.add(animatorL);
                    }
                }
                i12 = i11 + 1;
                size = i10;
            }
            i10 = size;
            i11 = i12;
            i12 = i11 + 1;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i17 = 0; i17 < sparseIntArray.size(); i17++) {
                j jVar3 = (j) eVarS.get((Animator) this.f5146M.get(sparseIntArray.keyAt(i17)));
                jVar3.f5124f.setStartDelay(jVar3.f5124f.getStartDelay() + (((long) sparseIntArray.valueAt(i17)) - Long.MAX_VALUE));
            }
        }
    }

    public final void p() {
        int i10 = this.f5141H - 1;
        this.f5141H = i10;
        if (i10 == 0) {
            z(this, o.f5126d, false);
            for (int i11 = 0; i11 < ((p212w.g) this.f5155y.f13784v).l(); i11++) {
                View view = (View) ((p212w.g) this.f5155y.f13784v).m(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < ((p212w.g) this.f5156z.f13784v).l(); i12++) {
                View view2 = (View) ((p212w.g) this.f5156z.f13784v).m(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f5143J = true;
        }
    }

    public final x q(View view, boolean z6) {
        C0446a c0446a = this.f5134A;
        if (c0446a != null) {
            return c0446a.q(view, z6);
        }
        ArrayList arrayList = z6 ? this.f5136C : this.f5137D;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            x xVar = (x) arrayList.get(i10);
            if (xVar == null) {
                return null;
            }
            if (xVar.f5163b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (x) (z6 ? this.f5137D : this.f5136C).get(i10);
        }
        return null;
    }

    public final p r() {
        C0446a c0446a = this.f5134A;
        return c0446a != null ? c0446a.r() : this;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return O("");
    }

    public final x u(View view, boolean z6) {
        C0446a c0446a = this.f5134A;
        if (c0446a != null) {
            return c0446a.u(view, z6);
        }
        return (x) ((p212w.e) (z6 ? this.f5155y : this.f5156z).f13782t).get(view);
    }

    public boolean v() {
        return !this.f5139F.isEmpty();
    }

    public boolean w(x xVar, x xVar2) {
        if (xVar != null && xVar2 != null) {
            String[] strArrT = t();
            if (strArrT != null) {
                for (String str : strArrT) {
                    if (y(xVar, xVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = xVar.a.keySet().iterator();
                while (it.hasNext()) {
                    if (y(xVar, xVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean x(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f5153w;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5154x;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void z(p pVar, o oVar, boolean z6) {
        p pVar2 = this.f5144K;
        if (pVar2 != null) {
            pVar2.z(pVar, oVar, z6);
        }
        ArrayList arrayList = this.f5145L;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f5145L.size();
        n[] nVarArr = this.f5138E;
        if (nVarArr == null) {
            nVarArr = new n[size];
        }
        this.f5138E = null;
        n[] nVarArr2 = (n[]) this.f5145L.toArray(nVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            oVar.b(nVarArr2[i10], pVar, z6);
            nVarArr2[i10] = null;
        }
        this.f5138E = nVarArr2;
    }

    public void L() {
    }

    public void H(o1.f fVar) {
    }

    public void f(x xVar) {
    }
}
