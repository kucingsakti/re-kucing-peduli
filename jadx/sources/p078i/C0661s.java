package p078i;

import J.b;
import U.B0;
import U.I;
import U.InterfaceC0432s;
import U.U;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.kcstream.cing.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p.e1;
import p.f1;
import p136o.l;
import p136o.w;

/* JADX INFO: renamed from: i.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0661s implements InterfaceC0432s, w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D f12117s;

    public /* synthetic */ C0661s(D d3) {
        this.f12117s = d3;
    }

    @Override // U.InterfaceC0432s
    public B0 E(View view, B0 b3) {
        boolean z6;
        boolean z10;
        boolean z11 = true;
        int iD = b3.d();
        D d3 = this.f12117s;
        d3.getClass();
        int iD2 = b3.d();
        ActionBarContextView actionBarContextView = d3.f11933N;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z6 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d3.f11933N.getLayoutParams();
            if (d3.f11933N.isShown()) {
                if (d3.f11963u0 == null) {
                    d3.f11963u0 = new Rect();
                    d3.f11964v0 = new Rect();
                }
                Rect rect = d3.f11963u0;
                Rect rect2 = d3.f11964v0;
                rect.set(b3.b(), b3.d(), b3.c(), b3.a());
                ViewGroup viewGroup = d3.f11937S;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z12 = f1.a;
                    e1.a(viewGroup, rect, rect2);
                } else {
                    if (!f1.a) {
                        f1.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            f1.f14060b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                f1.f14060b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = f1.f14060b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = d3.f11937S;
                WeakHashMap weakHashMap = U.a;
                B0 b0A = I.a(viewGroup2);
                int iB = b0A == null ? 0 : b0A.b();
                int iC = b0A == null ? 0 : b0A.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z10 = true;
                }
                Context context = d3.f11922C;
                if (i10 <= 0 || d3.f11939U != null) {
                    View view2 = d3.f11939U;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            d3.f11939U.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    d3.f11939U = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    d3.f11937S.addView(d3.f11939U, -1, layoutParams);
                }
                View view4 = d3.f11939U;
                z11 = view4 != null;
                if (z11 && view4.getVisibility() != 0) {
                    View view5 = d3.f11939U;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? b.a(context, R.color.abc_decor_view_status_guard_light) : b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!d3.f11944Z && z11) {
                    iD2 = 0;
                }
                z6 = z11;
                z11 = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z6 = false;
            } else {
                z6 = false;
                z11 = false;
            }
            if (z11) {
                d3.f11933N.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = d3.f11939U;
        if (view6 != null) {
            view6.setVisibility(z6 ? 0 : 8);
        }
        return U.i(view, iD != iD2 ? b3.f(b3.b(), iD2, b3.c(), b3.a()) : b3);
    }

    @Override // p136o.w
    public void c(l lVar, boolean z6) {
        this.f12117s.q(lVar);
    }

    @Override // p136o.w
    public boolean l(l lVar) {
        Window.Callback callback = this.f12117s.f11923D.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }
}
