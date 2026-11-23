package U;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends J7.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f4779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Window f4780c;

    public E0(WindowInsetsController windowInsetsController, p170r3.e eVar) {
        this.f4779b = windowInsetsController;
    }

    @Override // J7.j
    public final void E(boolean z6) {
        Window window = this.f4780c;
        if (z6) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f4779b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f4779b.setSystemBarsAppearance(0, 16);
    }

    @Override // J7.j
    public final void F(boolean z6) {
        Window window = this.f4780c;
        if (z6) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f4779b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f4779b.setSystemBarsAppearance(0, 8);
    }

    @Override // J7.j
    public final boolean q() {
        this.f4779b.setSystemBarsAppearance(0, 0);
        return (this.f4779b.getSystemBarsAppearance() & 8) != 0;
    }
}
