package p136o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.b;
import p.AbstractViewOnTouchListenerC0727s0;
import p.C0703g;
import p.C0705h;
import p.C0709j;

/* JADX INFO: renamed from: o.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0684b extends AbstractViewOnTouchListenerC0727s0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f13449B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ View f13450C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0684b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f13450C = actionMenuItemView;
    }

    @Override // p.AbstractViewOnTouchListenerC0727s0
    public final B b() {
        C0703g c0703g;
        switch (this.f13449B) {
            case 0:
                AbstractC0685c abstractC0685c = ((ActionMenuItemView) this.f13450C).f6043E;
                if (abstractC0685c == null || (c0703g = ((C0705h) abstractC0685c).a.f6265M) == null) {
                    return null;
                }
                return c0703g.a();
            default:
                C0703g c0703g2 = ((C0709j) this.f13450C).f14071v.f6264L;
                if (c0703g2 == null) {
                    return null;
                }
                return c0703g2.a();
        }
    }

    @Override // p.AbstractViewOnTouchListenerC0727s0
    public final boolean c() {
        B b3;
        switch (this.f13449B) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f13450C;
                k kVar = actionMenuItemView.f6041C;
                return kVar != null && kVar.c(actionMenuItemView.f6049z) && (b3 = b()) != null && b3.b();
            default:
                ((C0709j) this.f13450C).f14071v.n();
                return true;
        }
    }

    @Override // p.AbstractViewOnTouchListenerC0727s0
    public boolean d() {
        switch (this.f13449B) {
            case 1:
                b bVar = ((C0709j) this.f13450C).f14071v;
                if (bVar.f6266N != null) {
                    return false;
                }
                bVar.b();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0684b(C0709j c0709j, C0709j c0709j2) {
        super(c0709j2);
        this.f13450C = c0709j;
    }
}
