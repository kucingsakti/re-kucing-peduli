package U;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class G implements View.OnApplyWindowInsetsListener {
    public B0 a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0432s f4782c;

    public G(View view, InterfaceC0432s interfaceC0432s) {
        this.f4781b = view;
        this.f4782c = interfaceC0432s;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        B0 b0H = B0.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        InterfaceC0432s interfaceC0432s = this.f4782c;
        if (i10 < 30) {
            H.a(windowInsets, this.f4781b);
            if (b0H.equals(this.a)) {
                return interfaceC0432s.E(view, b0H).g();
            }
        }
        this.a = b0H;
        B0 b0E = interfaceC0432s.E(view, b0H);
        if (i10 >= 30) {
            return b0E.g();
        }
        WeakHashMap weakHashMap = U.a;
        F.c(view);
        return b0E.g();
    }
}
