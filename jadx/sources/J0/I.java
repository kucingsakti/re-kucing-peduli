package J0;

import U.C0412b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class I extends C0412b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f2245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H f2246e;

    public I(RecyclerView recyclerView) {
        this.f2245d = recyclerView;
        C0412b c0412bJ = j();
        if (c0412bJ == null || !(c0412bJ instanceof H)) {
            this.f2246e = new H(this);
        } else {
            this.f2246e = (H) c0412bJ;
        }
    }

    @Override // U.C0412b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f2245d.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Z(accessibilityEvent);
        }
    }

    @Override // U.C0412b
    public void d(View view, V.j jVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, jVar.a);
        RecyclerView recyclerView = this.f2245d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        androidx.recyclerview.widget.w layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7121b;
        layoutManager.a0(recyclerView2.f6978u, recyclerView2.f6989z0, jVar);
    }

    @Override // U.C0412b
    public final boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2245d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        androidx.recyclerview.widget.w layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7121b;
        return layoutManager.o0(recyclerView2.f6978u, recyclerView2.f6989z0, i10, bundle);
    }

    public C0412b j() {
        return this.f2246e;
    }
}
