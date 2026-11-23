package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0530c implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7056s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f7057t;

    public RunnableC0530c(l lVar, ArrayList arrayList) {
        this.f7057t = lVar;
        this.f7056s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f7056s;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            l lVar = this.f7057t;
            if (!zHasNext) {
                arrayList.clear();
                lVar.f7091m.remove(arrayList);
                return;
            }
            k kVar = (k) it.next();
            RecyclerView.a aVar = kVar.a;
            lVar.getClass();
            View view = aVar.f7003s;
            int i10 = kVar.f7084d - kVar.f7082b;
            int i11 = kVar.f7085e - kVar.f7083c;
            if (i10 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i11 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            lVar.f7094p.add(aVar);
            viewPropertyAnimatorAnimate.setDuration(lVar.f7119e).setListener(new C0534g(lVar, aVar, i10, view, i11, viewPropertyAnimatorAnimate)).start();
        }
    }
}
