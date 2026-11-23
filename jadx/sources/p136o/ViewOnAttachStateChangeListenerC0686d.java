package p136o;

import E4.C0187a;
import U.F;
import U.U;
import V.b;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import p215w3.l;

/* JADX INFO: renamed from: o.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0686d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13452t;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0686d(Object obj, int i10) {
        this.f13451s = i10;
        this.f13452t = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f13452t;
        switch (this.f13451s) {
            case 0:
            case 1:
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = U.a;
                F.c(view2);
                break;
            default:
                l lVar = (l) obj;
                if (lVar.f15582M != null && (accessibilityManager = lVar.f15581L) != null) {
                    WeakHashMap weakHashMap2 = U.a;
                    if (lVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new b(lVar.f15582M));
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f13451s) {
            case 0:
                f fVar = (f) this.f13452t;
                ViewTreeObserver viewTreeObserver = fVar.P;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.P = view.getViewTreeObserver();
                    }
                    fVar.P.removeGlobalOnLayoutListener(fVar.f13455A);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                C c10 = (C) this.f13452t;
                ViewTreeObserver viewTreeObserver2 = c10.f13418G;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c10.f13418G = view.getViewTreeObserver();
                    }
                    c10.f13418G.removeGlobalOnLayoutListener(c10.f13412A);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                break;
            default:
                l lVar = (l) this.f13452t;
                C0187a c0187a = lVar.f15582M;
                if (c0187a != null && (accessibilityManager = lVar.f15581L) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new b(c0187a));
                    break;
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
