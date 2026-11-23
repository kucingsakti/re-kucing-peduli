package p;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends A0 implements B0 {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final Method f13939W;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public p081i3.b f13940V;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f13939W = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p.B0
    public final void d(p136o.l lVar, p136o.n nVar) {
        p081i3.b bVar = this.f13940V;
        if (bVar != null) {
            bVar.d(lVar, nVar);
        }
    }

    @Override // p.B0
    public final void n(p136o.l lVar, p136o.n nVar) {
        p081i3.b bVar = this.f13940V;
        if (bVar != null) {
            bVar.n(lVar, nVar);
        }
    }

    @Override // p.A0
    public final C0722p0 q(Context context, boolean z6) {
        E0 e10 = new E0(context, z6);
        e10.setHoverListener(this);
        return e10;
    }
}
