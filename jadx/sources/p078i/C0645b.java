package p078i;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.MainActivity;
import o1.e;
import p088j0.c;
import p097k.f;

/* JADX INFO: renamed from: i.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0645b implements c {
    public final e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DrawerLayout f12028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f12029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12032f = false;

    public C0645b(MainActivity mainActivity, DrawerLayout drawerLayout, Toolbar toolbar) {
        e eVar = new e(toolbar);
        this.a = eVar;
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0644a(this));
        this.f12028b = drawerLayout;
        this.f12030d = R.string.drawer_open;
        this.f12031e = R.string.drawer_close;
        this.f12029c = new f(((Toolbar) eVar.f13627t).getContext());
    }

    @Override // p088j0.c
    public final void a(float f10) {
        d(Math.min(1.0f, Math.max(0.0f, f10)));
    }

    @Override // p088j0.c
    public final void b(View view) {
        d(1.0f);
        this.a.X0(this.f12031e);
    }

    @Override // p088j0.c
    public final void c(View view) {
        d(0.0f);
        this.a.X0(this.f12030d);
    }

    public final void d(float f10) {
        f fVar = this.f12029c;
        if (f10 == 1.0f) {
            if (!fVar.f12645i) {
                fVar.f12645i = true;
                fVar.invalidateSelf();
            }
        } else if (f10 == 0.0f && fVar.f12645i) {
            fVar.f12645i = false;
            fVar.invalidateSelf();
        }
        fVar.setProgress(f10);
    }

    public final void e() {
        DrawerLayout drawerLayout = this.f12028b;
        View viewF = drawerLayout.f(8388611);
        if (viewF != null ? DrawerLayout.o(viewF) : false) {
            d(1.0f);
        } else {
            d(0.0f);
        }
        View viewF2 = drawerLayout.f(8388611);
        int i10 = viewF2 != null ? DrawerLayout.o(viewF2) : false ? this.f12031e : this.f12030d;
        boolean z6 = this.f12032f;
        e eVar = this.a;
        if (!z6) {
            eVar.getClass();
        }
        ((Toolbar) eVar.f13627t).setNavigationIcon(this.f12029c);
        eVar.X0(i10);
    }
}
