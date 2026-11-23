package U;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.kcstream.cing.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f4821e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p178s0.a f4822f = new p178s0.a(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f4823g = new DecelerateInterpolator();

    public static void e(View view) {
        X2.j jVarJ = j(view);
        if (jVarJ != null) {
            ((View) jVarJ.f5410d).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z6) {
        X2.j jVarJ = j(view);
        if (jVarJ != null) {
            jVarJ.f5409c = windowInsets;
            if (!z6) {
                View view2 = (View) jVarJ.f5410d;
                int[] iArr = (int[]) jVarJ.f5411e;
                view2.getLocationOnScreen(iArr);
                z6 = true;
                jVarJ.a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), windowInsets, z6);
            }
        }
    }

    public static void g(View view, B0 b3, List list) {
        X2.j jVarJ = j(view);
        if (jVarJ != null) {
            jVarJ.f(b3, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), b3, list);
            }
        }
    }

    public static void h(View view, o1.e eVar) {
        X2.j jVarJ = j(view);
        if (jVarJ != null) {
            View view2 = (View) jVarJ.f5410d;
            int[] iArr = (int[]) jVarJ.f5411e;
            view2.getLocationOnScreen(iArr);
            int i10 = jVarJ.a - iArr[1];
            jVarJ.f5408b = i10;
            view2.setTranslationY(i10);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), eVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static X2.j j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof i0) {
            return ((i0) tag).a;
        }
        return null;
    }
}
