package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final /* synthetic */ RecyclerView a;

    public q(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(int i10) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
