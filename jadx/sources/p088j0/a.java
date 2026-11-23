package p088j0;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z6 = false;
        boolean z10 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.P = windowInsets;
        drawerLayout.f6544Q = z10;
        if (!z10 && drawerLayout.getBackground() == null) {
            z6 = true;
        }
        drawerLayout.setWillNotDraw(z6);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
