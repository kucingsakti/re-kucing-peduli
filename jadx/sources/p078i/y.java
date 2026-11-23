package p078i;

import L3.c;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p031d.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, D d3) {
        Objects.requireNonNull(d3);
        q qVar = new q(d3, 1);
        c.h(obj).registerOnBackInvokedCallback(1000000, qVar);
        return qVar;
    }

    public static void c(Object obj, Object obj2) {
        c.h(obj).unregisterOnBackInvokedCallback(c.d(obj2));
    }
}
