package V0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p f5158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewGroup f5159t;

    /* JADX WARN: Code duplicated, block: B:101:0x021d  */
    /* JADX WARN: Code duplicated, block: B:103:0x022b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0237  */
    /* JADX WARN: Code duplicated, block: B:108:0x0249  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f5 A[EDGE_INSN: B:135:0x01f5->B:91:0x01f5 BREAK  A[LOOP:1: B:19:0x0087->B:90:0x01eb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x016e  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x020a  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        p pVar;
        int i10;
        p140o4.r rVar;
        p140o4.r rVar2;
        p212w.e eVar;
        p212w.e eVar2;
        int i11;
        int[] iArr;
        boolean z6;
        int i12;
        int i13;
        p212w.e eVarS;
        int i14;
        Animator animator;
        j jVar;
        View view;
        x xVar;
        x xVar2;
        int i15;
        p140o4.r rVar3;
        boolean z10;
        int i16;
        View view2;
        x xVar3;
        p212w.e eVar3;
        int i17;
        int i18;
        View view3;
        View view4;
        SparseArray sparseArray;
        int size;
        int i19;
        View view5;
        View view6;
        p212w.g gVar;
        int iL;
        int i20;
        View view7;
        p140o4.r rVar4;
        Iterator it;
        ViewGroup viewGroup = this.f5159t;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = t.f5161c;
        ViewGroup viewGroup2 = this.f5159t;
        boolean z11 = true;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        p212w.e eVarB = t.b();
        ArrayList arrayList3 = (ArrayList) eVarB.get(viewGroup2);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            pVar = this.f5158s;
            arrayList3.add(pVar);
            pVar.a(new r(this, eVarB));
            i10 = 0;
            pVar.i(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).D(viewGroup2);
                }
            }
            pVar.f5136C = new ArrayList();
            pVar.f5137D = new ArrayList();
            rVar = pVar.f5155y;
            rVar2 = pVar.f5156z;
            eVar = new p212w.e((p212w.e) rVar.f13782t);
            eVar2 = new p212w.e((p212w.e) rVar2.f13782t);
            i11 = 0;
            while (true) {
                iArr = pVar.f5135B;
                if (i11 < iArr.length) {
                    break;
                }
                i15 = iArr[i11];
                if (i15 != z11) {
                    rVar3 = rVar;
                    z10 = z11;
                    for (i16 = eVar.f15506u - 1; i16 >= 0; i16--) {
                        view2 = (View) eVar.g(i16);
                        if (view2 == null && pVar.x(view2) && (xVar3 = (x) eVar2.remove(view2)) != null && pVar.x(xVar3.f5163b)) {
                            pVar.f5136C.add((x) eVar.i(i16));
                            pVar.f5137D.add(xVar3);
                        }
                    }
                } else if (i15 != 2) {
                    rVar3 = rVar;
                    z10 = z11;
                    eVar3 = (p212w.e) rVar3.f13785w;
                    p212w.e eVar4 = (p212w.e) rVar2.f13785w;
                    i17 = eVar3.f15506u;
                    for (i18 = 0; i18 < i17; i18++) {
                        view3 = (View) eVar3.k(i18);
                        if (view3 == null && pVar.x(view3) && (view4 = (View) eVar4.get(eVar3.g(i18))) != null && pVar.x(view4)) {
                            x xVar4 = (x) eVar.get(view3);
                            x xVar5 = (x) eVar2.get(view4);
                            if (xVar4 != null && xVar5 != null) {
                                pVar.f5136C.add(xVar4);
                                pVar.f5137D.add(xVar5);
                                eVar.remove(view3);
                                eVar2.remove(view4);
                            }
                        }
                    }
                } else if (i15 != 3) {
                    rVar3 = rVar;
                    z10 = z11;
                    sparseArray = (SparseArray) rVar3.f13783u;
                    SparseArray sparseArray2 = (SparseArray) rVar2.f13783u;
                    size = sparseArray.size();
                    for (i19 = 0; i19 < size; i19++) {
                        view5 = (View) sparseArray.valueAt(i19);
                        if (view5 == null && pVar.x(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i19))) != null && pVar.x(view6)) {
                            x xVar6 = (x) eVar.get(view5);
                            x xVar7 = (x) eVar2.get(view6);
                            if (xVar6 != null && xVar7 != null) {
                                pVar.f5136C.add(xVar6);
                                pVar.f5137D.add(xVar7);
                                eVar.remove(view5);
                                eVar2.remove(view6);
                            }
                        }
                    }
                } else if (i15 != 4) {
                    rVar3 = rVar;
                    z10 = z11;
                } else {
                    gVar = (p212w.g) rVar.f13784v;
                    iL = gVar.l();
                    i20 = i10;
                    while (i20 < iL) {
                        view7 = (View) gVar.m(i20);
                        if (view7 == null && pVar.x(view7)) {
                            rVar4 = rVar;
                            View view8 = (View) ((p212w.g) rVar2.f13784v).e(gVar.i(i20));
                            if (view8 != null && pVar.x(view8)) {
                                x xVar8 = (x) eVar.get(view7);
                                x xVar9 = (x) eVar2.get(view8);
                                if (xVar8 != null && xVar9 != null) {
                                    pVar.f5136C.add(xVar8);
                                    pVar.f5137D.add(xVar9);
                                    eVar.remove(view7);
                                    eVar2.remove(view8);
                                }
                            }
                            i20++;
                            rVar = rVar4;
                            z11 = z11;
                        } else {
                            rVar4 = rVar;
                        }
                        i20++;
                        rVar = rVar4;
                        z11 = z11;
                    }
                    z10 = z11;
                    rVar3 = rVar;
                }
                i11++;
                rVar = rVar3;
                z11 = z10;
                i10 = 0;
            }
            z6 = z11;
            for (i12 = 0; i12 < eVar.f15506u; i12++) {
                xVar2 = (x) eVar.k(i12);
                if (pVar.x(xVar2.f5163b)) {
                    pVar.f5136C.add(xVar2);
                    pVar.f5137D.add(null);
                }
            }
            for (i13 = 0; i13 < eVar2.f15506u; i13++) {
                xVar = (x) eVar2.k(i13);
                if (pVar.x(xVar.f5163b)) {
                    pVar.f5137D.add(xVar);
                    pVar.f5136C.add(null);
                }
            }
            eVarS = p.s();
            int i21 = eVarS.f15506u;
            WindowId windowId = viewGroup2.getWindowId();
            i14 = i21 - 1;
            while (i14 >= 0) {
                animator = (Animator) eVarS.g(i14);
                if (animator == null && (jVar = (j) eVarS.get(animator)) != null && (view = jVar.a) != null && windowId.equals(jVar.f5122d)) {
                    boolean z12 = z6;
                    x xVarU = pVar.u(view, z12);
                    x xVarQ = pVar.q(view, z12);
                    if (xVarU == null && xVarQ == null) {
                        xVarQ = (x) ((p212w.e) pVar.f5156z.f13782t).get(view);
                    }
                    if (xVarU != null || xVarQ != null) {
                        x xVar10 = jVar.f5121c;
                        p pVar2 = jVar.f5123e;
                        if (pVar2.w(xVar10, xVarQ)) {
                            pVar2.r().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                eVarS.remove(animator);
                            }
                        }
                    }
                }
                i14--;
                z6 = true;
            }
            pVar.m(viewGroup2, pVar.f5155y, pVar.f5156z, pVar.f5136C, pVar.f5137D);
            pVar.E();
            return true;
        }
        arrayList3 = new ArrayList();
        eVarB.put(viewGroup2, arrayList3);
        pVar = this.f5158s;
        arrayList3.add(pVar);
        pVar.a(new r(this, eVarB));
        i10 = 0;
        pVar.i(viewGroup2, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((p) it.next()).D(viewGroup2);
            }
        }
        pVar.f5136C = new ArrayList();
        pVar.f5137D = new ArrayList();
        rVar = pVar.f5155y;
        rVar2 = pVar.f5156z;
        eVar = new p212w.e((p212w.e) rVar.f13782t);
        eVar2 = new p212w.e((p212w.e) rVar2.f13782t);
        i11 = 0;
        while (true) {
            iArr = pVar.f5135B;
            if (i11 < iArr.length) {
                break;
                break;
            }
            i15 = iArr[i11];
            if (i15 != z11) {
                rVar3 = rVar;
                z10 = z11;
                while (i16 >= 0) {
                    view2 = (View) eVar.g(i16);
                    if (view2 == null) {
                    }
                }
            } else if (i15 != 2) {
                rVar3 = rVar;
                z10 = z11;
                eVar3 = (p212w.e) rVar3.f13785w;
                p212w.e eVar5 = (p212w.e) rVar2.f13785w;
                i17 = eVar3.f15506u;
                while (i18 < i17) {
                    view3 = (View) eVar3.k(i18);
                    if (view3 == null) {
                    }
                }
            } else if (i15 != 3) {
                rVar3 = rVar;
                z10 = z11;
                sparseArray = (SparseArray) rVar3.f13783u;
                SparseArray sparseArray3 = (SparseArray) rVar2.f13783u;
                size = sparseArray.size();
                while (i19 < size) {
                    view5 = (View) sparseArray.valueAt(i19);
                    if (view5 == null) {
                    }
                }
            } else if (i15 != 4) {
                rVar3 = rVar;
                z10 = z11;
            } else {
                gVar = (p212w.g) rVar.f13784v;
                iL = gVar.l();
                i20 = i10;
                while (i20 < iL) {
                    view7 = (View) gVar.m(i20);
                    if (view7 == null) {
                        rVar4 = rVar;
                    } else {
                        rVar4 = rVar;
                    }
                    i20++;
                    rVar = rVar4;
                    z11 = z11;
                }
                z10 = z11;
                rVar3 = rVar;
            }
            i11++;
            rVar = rVar3;
            z11 = z10;
            i10 = 0;
        }
        z6 = z11;
        while (i12 < eVar.f15506u) {
            xVar2 = (x) eVar.k(i12);
            if (pVar.x(xVar2.f5163b)) {
                pVar.f5136C.add(xVar2);
                pVar.f5137D.add(null);
            }
        }
        while (i13 < eVar2.f15506u) {
            xVar = (x) eVar2.k(i13);
            if (pVar.x(xVar.f5163b)) {
                pVar.f5137D.add(xVar);
                pVar.f5136C.add(null);
            }
        }
        eVarS = p.s();
        int i22 = eVarS.f15506u;
        WindowId windowId2 = viewGroup2.getWindowId();
        i14 = i22 - 1;
        while (i14 >= 0) {
            animator = (Animator) eVarS.g(i14);
            if (animator == null) {
            }
            i14--;
            z6 = true;
        }
        pVar.m(viewGroup2, pVar.f5155y, pVar.f5156z, pVar.f5136C, pVar.f5137D);
        pVar.E();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f5159t;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = t.f5161c;
        ViewGroup viewGroup2 = this.f5159t;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) t.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((p) it.next()).D(viewGroup2);
            }
        }
        this.f5158s.j(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
