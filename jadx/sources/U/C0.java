package U;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class C0 extends J7.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f4773b;

    public C0(Window window, p170r3.e eVar) {
        this.f4773b = window;
    }

    @Override // J7.j
    public final void F(boolean z6) {
        if (!z6) {
            a0(8192);
            return;
        }
        Window window = this.f4773b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void a0(int i10) {
        View decorView = this.f4773b.getDecorView();
        decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
    }

    @Override // J7.j
    public final boolean q() {
        return (this.f4773b.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
