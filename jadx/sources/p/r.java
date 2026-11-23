package p;

import X9.C0469o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f14113b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static r f14114c;
    public I0 a;

    public static synchronized r a() {
        try {
            if (f14114c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14114c;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        return I0.h(i10, mode);
    }

    public static synchronized void d() {
        if (f14114c == null) {
            r rVar = new r();
            f14114c = rVar;
            rVar.a = I0.d();
            f14114c.a.m(new p188t1.G());
        }
    }

    public static void e(Drawable drawable, C0469o c0469o, int[] iArr) {
        PorterDuff.Mode mode = I0.f13948h;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z6 = c0469o.f5618b;
            if (z6 || c0469o.a) {
                PorterDuffColorFilter porterDuffColorFilterH = null;
                ColorStateList colorStateList = z6 ? (ColorStateList) c0469o.f5619c : null;
                PorterDuff.Mode mode2 = c0469o.a ? (PorterDuff.Mode) c0469o.f5620d : I0.f13948h;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilterH = I0.h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilterH);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.a.f(context, i10);
    }
}
