package V0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: V0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0451f extends p {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String[] f5111U = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final C0447b f5112V = new C0447b(PointF.class, "topLeft", 0);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final C0447b f5113W = new C0447b(PointF.class, "bottomRight", 1);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final C0447b f5114X = new C0447b(PointF.class, "bottomRight", 2);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final C0447b f5115Y = new C0447b(PointF.class, "topLeft", 3);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final C0447b f5116Z = new C0447b(PointF.class, "position", 4);

    public static void P(x xVar) {
        View view = xVar.f5163b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = xVar.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", xVar.f5163b.getParent());
    }

    @Override // V0.p
    public final void d(x xVar) {
        P(xVar);
    }

    @Override // V0.p
    public final void h(x xVar) {
        P(xVar);
    }

    @Override // V0.p
    public final Animator l(ViewGroup viewGroup, x xVar, x xVar2) {
        int i10;
        C0451f c0451f;
        Animator animatorA;
        if (xVar != null && xVar2 != null) {
            HashMap map = xVar.a;
            HashMap map2 = xVar2.a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) map.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                int i11 = rect.left;
                int i12 = rect2.left;
                int i13 = rect.top;
                int i14 = rect2.top;
                int i15 = rect.right;
                int i16 = rect2.right;
                int i17 = rect.bottom;
                int i18 = rect2.bottom;
                int i19 = i15 - i11;
                int i20 = i17 - i13;
                int i21 = i16 - i12;
                int i22 = i18 - i14;
                Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
                    i10 = 0;
                } else {
                    i10 = (i11 == i12 && i13 == i14) ? 0 : 1;
                    if (i15 != i16 || i17 != i18) {
                        i10++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i10++;
                }
                if (i10 > 0) {
                    View view = xVar2.f5163b;
                    z.a(view, i11, i13, i15, i17);
                    if (i10 != 2) {
                        c0451f = this;
                        if (i11 == i12 && i13 == i14) {
                            c0451f.f5147N.getClass();
                            animatorA = AbstractC0454i.a(view, f5114X, p204v1.g.m(i15, i17, i16, i18));
                        } else {
                            c0451f.f5147N.getClass();
                            animatorA = AbstractC0454i.a(view, f5115Y, p204v1.g.m(i11, i13, i12, i14));
                        }
                    } else if (i19 == i21 && i20 == i22) {
                        c0451f = this;
                        c0451f.f5147N.getClass();
                        animatorA = AbstractC0454i.a(view, f5116Z, p204v1.g.m(i11, i13, i12, i14));
                    } else {
                        c0451f = this;
                        C0450e c0450e = new C0450e(view);
                        c0451f.f5147N.getClass();
                        ObjectAnimator objectAnimatorA = AbstractC0454i.a(c0450e, f5112V, p204v1.g.m(i11, i13, i12, i14));
                        c0451f.f5147N.getClass();
                        ObjectAnimator objectAnimatorA2 = AbstractC0454i.a(c0450e, f5113W, p204v1.g.m(i15, i17, i16, i18));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
                        animatorSet.addListener(new C0448c(c0450e));
                        animatorA = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        oa.b.o(viewGroup4, true);
                        c0451f.r().a(new C0449d(viewGroup4));
                    }
                    return animatorA;
                }
            }
        }
        return null;
    }

    @Override // V0.p
    public final String[] t() {
        return f5111U;
    }
}
