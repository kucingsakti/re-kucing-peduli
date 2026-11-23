package U;

import android.view.View;
import com.kcstream.cing.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    public static void a(View view, S s9) {
        p212w.i iVar = (p212w.i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (iVar == null) {
            iVar = new p212w.i(0);
            view.setTag(R.id.tag_unhandled_key_listeners, iVar);
        }
        Objects.requireNonNull(s9);
        View.OnUnhandledKeyEventListener l4 = new L();
        iVar.put(s9, l4);
        view.addOnUnhandledKeyEventListener(l4);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, S s9) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        p212w.i iVar = (p212w.i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (iVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.get(s9)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i10) {
        return (T) view.requireViewById(i10);
    }

    public static void g(View view, boolean z6) {
        view.setAccessibilityHeading(z6);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, X.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z6) {
        view.setScreenReaderFocusable(z6);
    }
}
