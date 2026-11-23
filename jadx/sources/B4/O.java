package B4;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class O implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f650s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f651t;

    public O(P p10, FrameLayout frameLayout) {
        this.f651t = p10;
        this.f650s = frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        P p10 = this.f651t;
        if (p10.getWebView() != null) {
            this.f650s.setClickable(false);
            p10.getWebView().reload();
        }
    }
}
