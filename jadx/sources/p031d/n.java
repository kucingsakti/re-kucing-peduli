package p031d;

import B6.d;
import C8.E;
import N0.e;
import N0.f;
import N1.t;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.InterfaceC0523s;
import androidx.lifecycle.L;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public class n extends Dialog implements InterfaceC0523s, y, f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0525u f10473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f10474t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x f10475u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, int i10) {
        super(context, i10);
        i.f(context, "context");
        this.f10474t = new t(this);
        this.f10475u = new x(new d(this, 17));
    }

    public static void b(n nVar) {
        i.f(nVar, "this$0");
        super.onBackPressed();
    }

    @Override // N0.f
    public final e a() {
        return (e) this.f10474t.f3308d;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i.f(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final void c() {
        Window window = getWindow();
        i.c(window);
        View decorView = window.getDecorView();
        i.e(decorView, "window!!.decorView");
        L.g(decorView, this);
        Window window2 = getWindow();
        i.c(window2);
        View decorView2 = window2.getDecorView();
        i.e(decorView2, "window!!.decorView");
        E.z(decorView2, this);
        Window window3 = getWindow();
        i.c(window3);
        View decorView3 = window3.getDecorView();
        i.e(decorView3, "window!!.decorView");
        xa.d.u(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC0523s
    public final C0525u g() {
        C0525u c0525u = this.f10473s;
        if (c0525u != null) {
            return c0525u;
        }
        C0525u c0525u2 = new C0525u(this);
        this.f10473s = c0525u2;
        return c0525u2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f10475u.a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            i.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f10475u;
            xVar.getClass();
            xVar.f10494e = onBackInvokedDispatcher;
            xVar.b(xVar.f10496g);
        }
        this.f10474t.f(bundle);
        C0525u c0525u = this.f10473s;
        if (c0525u == null) {
            c0525u = new C0525u(this);
            this.f10473s = c0525u;
        }
        c0525u.d(EnumC0518m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        i.e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f10474t.g(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        C0525u c0525u = this.f10473s;
        if (c0525u == null) {
            c0525u = new C0525u(this);
            this.f10473s = c0525u;
        }
        c0525u.d(EnumC0518m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0525u c0525u = this.f10473s;
        if (c0525u == null) {
            c0525u = new C0525u(this);
            this.f10473s = c0525u;
        }
        c0525u.d(EnumC0518m.ON_DESTROY);
        this.f10473s = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        i.f(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i.f(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
