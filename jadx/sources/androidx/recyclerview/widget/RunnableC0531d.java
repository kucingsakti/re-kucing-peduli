package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0531d implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f7059t;

    public RunnableC0531d(l lVar, ArrayList arrayList) {
        this.f7059t = lVar;
        this.f7058s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f7058s;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            l lVar = this.f7059t;
            if (!zHasNext) {
                arrayList.clear();
                lVar.f7090l.remove(arrayList);
                return;
            }
            RecyclerView.a aVar = (RecyclerView.a) it.next();
            lVar.getClass();
            View view = aVar.f7003s;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            lVar.f7093o.add(aVar);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(lVar.f7117c).setListener(new C0533f(view, viewPropertyAnimatorAnimate, lVar, aVar)).start();
        }
    }
}
