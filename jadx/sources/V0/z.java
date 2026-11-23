package V0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final E a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0447b f5165b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new F();
        } else {
            a = new E();
        }
        f5165b = new C0447b(Float.class, "translationAlpha", 5);
        new C0447b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        a.G(view, i10, i11, i12, i13);
    }

    public static void b(View view, int i10) {
        a.B(view, i10);
    }
}
