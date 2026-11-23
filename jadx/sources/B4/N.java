package B4;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class N implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f649t;

    public N(P p10, View view) {
        this.f649t = p10;
        this.f648s = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        P p10 = this.f649t;
        if (p10.getWebView() != null) {
            this.f648s.setClickable(false);
            p10.getWebView().reload();
        }
    }
}
