package p031d;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.InterfaceC0522q;
import androidx.lifecycle.InterfaceC0523s;
import androidx.lifecycle.V;
import p078i.AbstractActivityC0655l;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC0522q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0655l f10446t;

    public /* synthetic */ h(AbstractActivityC0655l abstractActivityC0655l, int i10) {
        this.f10445s = i10;
        this.f10446t = abstractActivityC0655l;
    }

    @Override // androidx.lifecycle.InterfaceC0522q
    public final void onStateChanged(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
        switch (this.f10445s) {
            case 0:
                if (enumC0518m == EnumC0518m.ON_STOP) {
                    Window window = this.f10446t.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
                break;
            case 1:
                if (enumC0518m == EnumC0518m.ON_DESTROY) {
                    this.f10446t.f10466t.f168s = null;
                    if (!this.f10446t.isChangingConfigurations()) {
                        this.f10446t.e().a();
                    }
                    l lVar = this.f10446t.f10472z;
                    AbstractActivityC0655l abstractActivityC0655l = lVar.f10456v;
                    abstractActivityC0655l.getWindow().getDecorView().removeCallbacks(lVar);
                    abstractActivityC0655l.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
                }
                break;
            default:
                AbstractActivityC0655l abstractActivityC0655l2 = this.f10446t;
                if (abstractActivityC0655l2.f10470x == null) {
                    k kVar = (k) abstractActivityC0655l2.getLastNonConfigurationInstance();
                    if (kVar != null) {
                        abstractActivityC0655l2.f10470x = kVar.a;
                    }
                    if (abstractActivityC0655l2.f10470x == null) {
                        abstractActivityC0655l2.f10470x = new V();
                    }
                }
                abstractActivityC0655l2.f10468v.f(this);
                break;
        }
    }
}
