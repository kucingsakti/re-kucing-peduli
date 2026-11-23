package V0;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.kcstream.cing.R;
import java.util.HashMap;

/* JADX INFO: renamed from: V0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0453h extends p {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String[] f5118V = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f5119U;

    public C0453h(int i10) {
        this();
        this.f5119U = i10;
    }

    public static void P(x xVar) {
        int visibility = xVar.f5163b.getVisibility();
        HashMap map = xVar.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = xVar.f5163b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float R(x xVar, float f10) {
        Float f11;
        return (xVar == null || (f11 = (Float) xVar.a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static I S(x xVar, x xVar2) {
        I i10 = new I();
        i10.a = false;
        i10.f5094b = false;
        if (xVar != null) {
            HashMap map = xVar.a;
            if (map.containsKey("android:visibility:visibility")) {
                i10.f5095c = ((Integer) map.get("android:visibility:visibility")).intValue();
                i10.f5097e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                i10.f5095c = -1;
                i10.f5097e = null;
            }
        } else {
            i10.f5095c = -1;
            i10.f5097e = null;
        }
        if (xVar2 != null) {
            HashMap map2 = xVar2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                i10.f5096d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                i10.f5098f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                i10.f5096d = -1;
                i10.f5098f = null;
            }
        } else {
            i10.f5096d = -1;
            i10.f5098f = null;
        }
        if (xVar != null && xVar2 != null) {
            int i11 = i10.f5095c;
            int i12 = i10.f5096d;
            if (i11 != i12 || i10.f5097e != i10.f5098f) {
                if (i11 != i12) {
                    if (i11 == 0) {
                        i10.f5094b = false;
                        i10.a = true;
                        return i10;
                    }
                    if (i12 == 0) {
                        i10.f5094b = true;
                        i10.a = true;
                        return i10;
                    }
                } else {
                    if (i10.f5098f == null) {
                        i10.f5094b = false;
                        i10.a = true;
                        return i10;
                    }
                    if (i10.f5097e == null) {
                        i10.f5094b = true;
                        i10.a = true;
                        return i10;
                    }
                }
            }
        } else {
            if (xVar == null && i10.f5096d == 0) {
                i10.f5094b = true;
                i10.a = true;
                return i10;
            }
            if (xVar2 == null && i10.f5095c == 0) {
                i10.f5094b = false;
                i10.a = true;
            }
        }
        return i10;
    }

    public final ObjectAnimator Q(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        z.a.A(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, z.f5165b, f11);
        C0452g c0452g = new C0452g(view);
        objectAnimatorOfFloat.addListener(c0452g);
        r().a(c0452g);
        return objectAnimatorOfFloat;
    }

    @Override // V0.p
    public final void d(x xVar) {
        P(xVar);
    }

    @Override // V0.p
    public final void h(x xVar) {
        P(xVar);
        View view = xVar.f5163b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(z.a.o(view)) : Float.valueOf(0.0f);
        }
        xVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    /* JADX WARN: Code duplicated, block: B:60:0x013a  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:65:0x0160  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x020d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0214  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (S(q(r3, false), u(r3, false)).a != false) goto L9;
     */
    @Override // V0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator l(android.view.ViewGroup r24, V0.x r25, V0.x r26) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.C0453h.l(android.view.ViewGroup, V0.x, V0.x):android.animation.Animator");
    }

    @Override // V0.p
    public final String[] t() {
        return f5118V;
    }

    @Override // V0.p
    public final boolean w(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.a.containsKey("android:visibility:visibility") != xVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        I iS = S(xVar, xVar2);
        if (iS.a) {
            return iS.f5095c == 0 || iS.f5096d == 0;
        }
        return false;
    }

    public C0453h() {
        this.f5119U = 3;
    }
}
