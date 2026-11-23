package N4;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.kcstream.cing.utils.GridAutoLayoutManager;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends B6.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3316u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ GridAutoLayoutManager f3317v;

    public a(RecyclerView recyclerView, GridAutoLayoutManager gridAutoLayoutManager) {
        this.f3316u = recyclerView;
        this.f3317v = gridAutoLayoutManager;
    }

    @Override // B6.b
    public final int k(int i10) {
        s adapter = this.f3316u.getAdapter();
        i.d(adapter, "null cannot be cast to non-null type smartadapter.SmartRecyclerAdapter");
        if (((Ca.c) adapter).f1031i.get(i10) instanceof String) {
            return this.f3317v.f6884G;
        }
        return 1;
    }
}
