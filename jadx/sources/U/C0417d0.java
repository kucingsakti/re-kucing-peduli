package U;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: U.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0417d0 {
    public final WeakReference a;

    public C0417d0(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(InterfaceC0419e0 interfaceC0419e0) {
        View view = (View) this.a.get();
        if (view != null) {
            if (interfaceC0419e0 != null) {
                view.animate().setListener(new B4.L(interfaceC0419e0, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
