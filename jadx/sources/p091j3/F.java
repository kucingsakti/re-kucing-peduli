package p091j3;

import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public abstract class F extends ImageButton {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12372s;

    public final void a(int i10, boolean z6) {
        super.setVisibility(i10);
        if (z6) {
            this.f12372s = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f12372s;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        a(i10, true);
    }
}
