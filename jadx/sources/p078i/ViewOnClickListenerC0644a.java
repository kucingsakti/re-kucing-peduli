package p078i;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: renamed from: i.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0644a implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0645b f12027s;

    public ViewOnClickListenerC0644a(C0645b c0645b) {
        this.f12027s = c0645b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0645b c0645b = this.f12027s;
        c0645b.getClass();
        DrawerLayout drawerLayout = c0645b.f12028b;
        int i10 = drawerLayout.i(8388611);
        View viewF = drawerLayout.f(8388611);
        if ((viewF != null ? DrawerLayout.q(viewF) : false) && i10 != 2) {
            drawerLayout.d();
        } else if (i10 != 1) {
            drawerLayout.s();
        }
    }
}
