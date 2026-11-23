package J0;

import U.C0412b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class H extends C0412b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f2243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2244e = new WeakHashMap();

    public H(I i10) {
        this.f2243d = i10;
    }

    @Override // U.C0412b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0412b c0412b = (C0412b) this.f2244e.get(view);
        return c0412b != null ? c0412b.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // U.C0412b
    public final P0.d b(View view) {
        C0412b c0412b = (C0412b) this.f2244e.get(view);
        return c0412b != null ? c0412b.b(view) : super.b(view);
    }

    @Override // U.C0412b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0412b c0412b = (C0412b) this.f2244e.get(view);
        if (c0412b != null) {
            c0412b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // U.C0412b
    public final void d(View view, V.j jVar) {
        I i10 = this.f2243d;
        boolean zO = i10.f2245d.O();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        if (!zO) {
            RecyclerView recyclerView = i10.f2245d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().b0(view, jVar);
                C0412b c0412b = (C0412b) this.f2244e.get(view);
                if (c0412b != null) {
                    c0412b.d(view, jVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // U.C0412b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0412b c0412b = (C0412b) this.f2244e.get(view);
        if (c0412b != null) {
            c0412b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // U.C0412b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0412b c0412b = (C0412b) this.f2244e.get(viewGroup);
        return c0412b != null ? c0412b.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // U.C0412b
    public final boolean g(View view, int i10, Bundle bundle) {
        I i11 = this.f2243d;
        if (!i11.f2245d.O()) {
            RecyclerView recyclerView = i11.f2245d;
            if (recyclerView.getLayoutManager() != null) {
                C0412b c0412b = (C0412b) this.f2244e.get(view);
                if (c0412b != null) {
                    if (c0412b.g(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i10, bundle)) {
                    return true;
                }
                androidx.recyclerview.widget.A a = recyclerView.getLayoutManager().f7121b.f6978u;
                return false;
            }
        }
        return super.g(view, i10, bundle);
    }

    @Override // U.C0412b
    public final void h(View view, int i10) {
        C0412b c0412b = (C0412b) this.f2244e.get(view);
        if (c0412b != null) {
            c0412b.h(view, i10);
        } else {
            super.h(view, i10);
        }
    }

    @Override // U.C0412b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0412b c0412b = (C0412b) this.f2244e.get(view);
        if (c0412b != null) {
            c0412b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
