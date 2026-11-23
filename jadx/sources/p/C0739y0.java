package p;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: renamed from: p.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0739y0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ A0 a;

    public C0739y0(A0 a10) {
        this.a = a10;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        if (i10 == 1) {
            A0 a10 = this.a;
            if (a10.f13918R.getInputMethodMode() == 2 || a10.f13918R.getContentView() == null) {
                return;
            }
            Handler handler = a10.f13915N;
            RunnableC0737x0 runnableC0737x0 = a10.f13911J;
            handler.removeCallbacks(runnableC0737x0);
            runnableC0737x0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
