package p019b9;

import A9.D;
import U.InterfaceC0419e0;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0419e0 {
    public boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7324c;

    public c(FloatingActionButton floatingActionButton) {
        this.a = false;
        this.f7323b = 0;
        this.f7324c = floatingActionButton;
    }

    @Override // U.InterfaceC0419e0
    public void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f7324c;
        actionBarContextView.f6095x = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f7323b);
    }

    @Override // U.InterfaceC0419e0
    public void b() {
        this.a = true;
    }

    @Override // U.InterfaceC0419e0
    public void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }

    public c(D d3, int i10, boolean z6) {
        this.f7324c = d3;
        this.f7323b = i10;
        this.a = z6;
    }

    public c(ActionBarContextView actionBarContextView) {
        this.f7324c = actionBarContextView;
        this.a = false;
    }
}
