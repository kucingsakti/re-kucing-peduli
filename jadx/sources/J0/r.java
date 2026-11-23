package J0;

import U.U;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0532e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC0530c;
import androidx.recyclerview.widget.RunnableC0531d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2351s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2352t;

    public /* synthetic */ r(RecyclerView recyclerView, int i10) {
        this.f2351s = i10;
        this.f2352t = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f2352t;
        switch (this.f2351s) {
            case 0:
                if (recyclerView.f6942M && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f6938K) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.P) {
                        recyclerView.p();
                    } else {
                        recyclerView.f6946O = true;
                    }
                    break;
                }
                break;
            default:
                androidx.recyclerview.widget.u uVar = recyclerView.f6963h0;
                if (uVar != null) {
                    androidx.recyclerview.widget.l lVar = (androidx.recyclerview.widget.l) uVar;
                    ArrayList arrayList = lVar.f7087h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = lVar.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = lVar.f7089k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = lVar.f7088i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            long j = lVar.f7118d;
                            if (zHasNext) {
                                RecyclerView.a aVar = (RecyclerView.a) it.next();
                                View view = aVar.f7003s;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                lVar.f7095q.add(aVar);
                                viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C0532e(view, viewPropertyAnimatorAnimate, lVar, aVar)).start();
                                arrayList = arrayList;
                            } else {
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    lVar.f7091m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0530c runnableC0530c = new RunnableC0530c(lVar, arrayList5);
                                    if (zIsEmpty) {
                                        runnableC0530c.run();
                                    } else {
                                        View view2 = ((androidx.recyclerview.widget.k) arrayList5.get(0)).a.f7003s;
                                        WeakHashMap weakHashMap = U.a;
                                        view2.postOnAnimationDelayed(runnableC0530c, j);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    lVar.f7092n.add(arrayList6);
                                    arrayList3.clear();
                                    C3.c cVar = new C3.c(lVar, arrayList6, 8, false);
                                    if (zIsEmpty) {
                                        cVar.run();
                                    } else {
                                        View view3 = ((androidx.recyclerview.widget.j) arrayList6.get(0)).a.f7003s;
                                        WeakHashMap weakHashMap2 = U.a;
                                        view3.postOnAnimationDelayed(cVar, j);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    lVar.f7090l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0531d runnableC0531d = new RunnableC0531d(lVar, arrayList7);
                                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                        runnableC0531d.run();
                                    } else {
                                        if (zIsEmpty) {
                                            j = 0;
                                        }
                                        long jMax = Math.max(!zIsEmpty2 ? lVar.f7119e : 0L, zIsEmpty3 ? 0L : lVar.f7120f) + j;
                                        View view4 = ((RecyclerView.a) arrayList7.get(0)).f7003s;
                                        WeakHashMap weakHashMap3 = U.a;
                                        view4.postOnAnimationDelayed(runnableC0531d, jMax);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f6929F0 = false;
                break;
        }
    }
}
