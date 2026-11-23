package C0;

import J0.H;
import J0.I;
import U.C0412b;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class x extends I {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final H f907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f908h;

    public x(RecyclerView recyclerView) {
        super(recyclerView);
        this.f907g = this.f2246e;
        this.f908h = new w(this, 0);
        this.f906f = recyclerView;
    }

    @Override // J0.I
    public final C0412b j() {
        return this.f908h;
    }
}
