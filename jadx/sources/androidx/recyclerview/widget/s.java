package androidx.recyclerview.widget;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public final J0.t a = new J0.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7113b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7114c = 1;

    public abstract int a();

    public long b(int i10) {
        return -1L;
    }

    public int c(int i10) {
        return 0;
    }

    public void d(RecyclerView recyclerView) {
    }

    public abstract void e(RecyclerView.a aVar, int i10);

    public abstract RecyclerView.a f(ViewGroup viewGroup, int i10);

    public void g(RecyclerView recyclerView) {
    }

    public boolean h(RecyclerView.a aVar) {
        return false;
    }

    public void i(RecyclerView.a aVar) {
    }

    public void j(RecyclerView.a aVar) {
    }

    public void k(RecyclerView.a aVar) {
    }

    public final void l(boolean z6) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f7113b = z6;
    }
}
