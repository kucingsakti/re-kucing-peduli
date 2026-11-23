package p118m3;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.c;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import java.util.Iterator;
import p.F0;
import p.K;
import p091j3.C;
import p091j3.t;
import p136o.e;
import p136o.f;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13139s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13140t;

    public /* synthetic */ k(Object obj, int i10) {
        this.f13139s = i10;
        this.f13140t = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        switch (this.f13139s) {
            case 0:
                NavigationView navigationView = (NavigationView) this.f13140t;
                int[] iArr = navigationView.f9757D;
                navigationView.getLocationOnScreen(iArr);
                boolean z6 = true;
                boolean z10 = iArr[1] == 0;
                t tVar = navigationView.f9754A;
                if (tVar.P != z10) {
                    tVar.P = z10;
                    int i10 = (tVar.f12469t.getChildCount() <= 0 && tVar.P) ? tVar.f12464R : 0;
                    NavigationMenuView navigationMenuView = tVar.f12468s;
                    navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z10 && navigationView.f9760G);
                int i11 = iArr[0];
                navigationView.setDrawLeftInsetForeground(i11 == 0 || navigationView.getWidth() + i11 == 0);
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    Rect rectF = C.f(activity);
                    navigationView.setDrawBottomInsetForeground((rectF.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.f9761H);
                    if (rectF.width() != iArr[0] && rectF.width() - navigationView.getWidth() != iArr[0]) {
                        z6 = false;
                    }
                    navigationView.setDrawRightInsetForeground(z6);
                }
                break;
            case 1:
                f fVar = (f) this.f13140t;
                if (fVar.b()) {
                    ArrayList arrayList = fVar.f13478z;
                    if (arrayList.size() > 0 && !((e) arrayList.get(0)).a.f13917Q) {
                        View view = fVar.f13461G;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((e) it.next()).a.a();
                            }
                        } else {
                            fVar.dismiss();
                        }
                        break;
                    }
                }
                break;
            case 2:
                p136o.C c10 = (p136o.C) this.f13140t;
                if (c10.b()) {
                    F0 f0 = c10.f13430z;
                    if (!f0.f13917Q) {
                        View view2 = c10.f13416E;
                        if (view2 != null && view2.isShown()) {
                            f0.a();
                        } else {
                            c10.dismiss();
                        }
                    }
                }
                break;
            case 3:
                c cVar = (c) this.f13140t;
                if (!cVar.getInternalPopup().b()) {
                    cVar.f6283x.l(cVar.getTextDirection(), cVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = cVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                K k3 = (K) this.f13140t;
                c cVar2 = k3.f13962Z;
                k3.getClass();
                if (cVar2.isAttachedToWindow() && cVar2.getGlobalVisibleRect(k3.f13960X)) {
                    k3.s();
                    k3.a();
                } else {
                    k3.dismiss();
                }
                break;
        }
    }
}
