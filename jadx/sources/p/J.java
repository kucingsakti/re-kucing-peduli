package p;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class J implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p118m3.k f13956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ K f13957t;

    public J(K k3, p118m3.k kVar) {
        this.f13957t = k3;
        this.f13956s = kVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f13957t.f13962Z.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f13956s);
        }
    }
}
