package p031d;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p200u8.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final r a = new r();

    public final OnBackInvokedCallback a(a aVar) {
        i.f(aVar, "onBackInvoked");
        return new q(aVar, 0);
    }

    public final void b(Object obj, int i10, Object obj2) {
        i.f(obj, "dispatcher");
        i.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        i.f(obj, "dispatcher");
        i.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
