package p170r3;

import android.view.View;
import com.google.android.material.navigation.NavigationView;
import p023c3.c;

/* JADX INFO: loaded from: classes.dex */
public final class x extends v {
    public x(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new c(this, 2));
    }

    @Override // p170r3.v
    public final void a(NavigationView navigationView) {
        navigationView.setClipToOutline(!this.a);
        if (this.a) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // p170r3.v
    public final boolean b() {
        return this.a;
    }
}
