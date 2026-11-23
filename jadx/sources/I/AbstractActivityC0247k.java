package I;

import U.InterfaceC0425k;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.InterfaceC0523s;

/* JADX INFO: renamed from: I.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0247k extends Activity implements InterfaceC0523s, InterfaceC0425k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0525u f1972s = new C0525u(this);

    @Override // U.InterfaceC0425k
    public final boolean b(KeyEvent keyEvent) {
        p210v8.i.f(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        p210v8.i.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        p210v8.i.e(decorView, "window.decorView");
        if (C4.a.o(decorView, keyEvent)) {
            return true;
        }
        return C4.a.p(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        p210v8.i.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        p210v8.i.e(decorView, "window.decorView");
        if (C4.a.o(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = androidx.lifecycle.I.f6723t;
        androidx.lifecycle.G.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        p210v8.i.f(bundle, "outState");
        this.f1972s.g(EnumC0519n.f6757u);
        super.onSaveInstanceState(bundle);
    }
}
