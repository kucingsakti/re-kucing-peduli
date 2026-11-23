package p078i;

import C8.E;
import U.F;
import U.U;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import o1.k;

/* JADX INFO: loaded from: classes.dex */
public final class u extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12120c;

    public /* synthetic */ u(Object obj, int i10) {
        this.f12119b = i10;
        this.f12120c = obj;
    }

    @Override // U.InterfaceC0419e0
    public final void a() {
        Object obj = this.f12120c;
        switch (this.f12119b) {
            case 0:
                D d3 = ((r) obj).f12116t;
                d3.f11933N.setAlpha(1.0f);
                d3.f11935Q.d(null);
                d3.f11935Q = null;
                break;
            case 1:
                D d8 = (D) obj;
                d8.f11933N.setAlpha(1.0f);
                d8.f11935Q.d(null);
                d8.f11935Q = null;
                break;
            default:
                k kVar = (k) obj;
                ((D) kVar.f13639t).f11933N.setVisibility(8);
                D d10 = (D) kVar.f13639t;
                PopupWindow popupWindow = d10.f11934O;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (d10.f11933N.getParent() instanceof View) {
                    View view = (View) d10.f11933N.getParent();
                    WeakHashMap weakHashMap = U.a;
                    F.c(view);
                }
                d10.f11933N.e();
                d10.f11935Q.d(null);
                d10.f11935Q = null;
                ViewGroup viewGroup = d10.f11937S;
                WeakHashMap weakHashMap2 = U.a;
                F.c(viewGroup);
                break;
        }
    }

    @Override // C8.E, U.InterfaceC0419e0
    public void c() {
        Object obj = this.f12120c;
        switch (this.f12119b) {
            case 0:
                ((r) obj).f12116t.f11933N.setVisibility(0);
                break;
            case 1:
                D d3 = (D) obj;
                d3.f11933N.setVisibility(0);
                if (d3.f11933N.getParent() instanceof View) {
                    View view = (View) d3.f11933N.getParent();
                    WeakHashMap weakHashMap = U.a;
                    F.c(view);
                }
                break;
        }
    }
}
