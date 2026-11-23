package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7115b;

    public final void a(RecyclerView.a aVar) {
        View view = aVar.f7003s;
        this.a = view.getLeft();
        this.f7115b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
