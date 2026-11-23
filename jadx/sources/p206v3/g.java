package p206v3;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f15433b;

    public g(h hVar, View view) {
        this.f15433b = hVar;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.a;
        if (view2.getVisibility() == 0) {
            this.f15433b.c(view2);
        }
    }
}
