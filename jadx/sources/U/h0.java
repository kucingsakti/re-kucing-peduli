package U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4819c;

    public /* synthetic */ h0(Object obj, View view, int i10) {
        this.a = i10;
        this.f4818b = obj;
        this.f4819c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                D3.b bVar = (D3.b) this.f4818b;
                if (bVar != null) {
                    bVar.getClass();
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((n0) this.f4818b).a.d(1.0f);
                j0.e((View) this.f4819c);
                break;
            case 1:
                ((p212w.e) this.f4818b).remove(animator);
                ((V0.p) this.f4819c).f5139F.remove(animator);
                break;
            case 2:
                View view = (View) this.f4819c;
                D3.b bVar = (D3.b) this.f4818b;
                if (bVar != null) {
                    bVar.x();
                }
                a(view);
                break;
            default:
                NavigationView navigationView = (NavigationView) this.f4819c;
                DrawerLayout drawerLayout = (DrawerLayout) this.f4818b;
                drawerLayout.c(navigationView, false);
                drawerLayout.setScrimColor(-1728053248);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ((V0.p) this.f4819c).f5139F.add(animator);
                break;
            case 2:
                b((View) this.f4819c);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public h0(View view, D3.b bVar) {
        this.a = 2;
        this.f4819c = view;
        this.f4818b = bVar;
    }

    public h0(V0.p pVar, p212w.e eVar) {
        this.a = 1;
        this.f4819c = pVar;
        this.f4818b = eVar;
    }

    public void a(View view) {
    }

    public void b(View view) {
    }
}
