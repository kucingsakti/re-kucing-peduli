package U;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends C0 {
    @Override // J7.j
    public final void E(boolean z6) {
        if (!z6) {
            a0(16);
            return;
        }
        Window window = this.f4773b;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
