package p136o;

import Y1.c;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class u implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13556t;

    public /* synthetic */ u(Object obj, int i10) {
        this.f13555s = i10;
        this.f13556t = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f13555s) {
            case 0:
                ((v) this.f13556t).c();
                break;
            default:
                ((c) this.f13556t).getClass();
                break;
        }
    }
}
