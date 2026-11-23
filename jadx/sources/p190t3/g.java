package p190t3;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.kcstream.cing.R;
import o1.h;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f15207B = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AccessibilityManager f15208A;

    public g(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f15208A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    public static g f(View view, CharSequence charSequence) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f15207B);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        g gVar = new g(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) gVar.f15196i.getChildAt(0)).getMessageView().setText(charSequence);
        gVar.f15197k = -1;
        return gVar;
    }

    public final void g() {
        h hVarG = h.g();
        int recommendedTimeoutMillis = this.f15197k;
        boolean z6 = false;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.f15208A;
            if (i10 >= 29) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(recommendedTimeoutMillis, 0 | 3);
            }
        }
        d dVar = this.f15206t;
        synchronized (hVarG.f13632s) {
            try {
                if (hVarG.k(dVar)) {
                    h hVar = (h) hVarG.f13634u;
                    hVar.f15209b = recommendedTimeoutMillis;
                    ((Handler) hVarG.f13633t).removeCallbacksAndMessages(hVar);
                    hVarG.q((h) hVarG.f13634u);
                    return;
                }
                h hVar2 = (h) hVarG.f13635v;
                if (hVar2 != null && hVar2.a.get() == dVar) {
                    z6 = true;
                }
                if (z6) {
                    ((h) hVarG.f13635v).f15209b = recommendedTimeoutMillis;
                } else {
                    hVarG.f13635v = new h(recommendedTimeoutMillis, dVar);
                }
                h hVar3 = (h) hVarG.f13634u;
                if (hVar3 == null || !hVarG.c(hVar3, 4)) {
                    hVarG.f13634u = null;
                    hVarG.s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
