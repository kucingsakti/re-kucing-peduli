package p078i;

import C8.E;
import U.F;
import U.U;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import o1.k;

/* JADX INFO: loaded from: classes.dex */
public final class P extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f11996c;

    public /* synthetic */ P(S s9, int i10) {
        this.f11995b = i10;
        this.f11996c = s9;
    }

    @Override // U.InterfaceC0419e0
    public final void a() {
        View view;
        S s9 = this.f11996c;
        switch (this.f11995b) {
            case 0:
                if (s9.f12017p && (view = s9.f12010h) != null) {
                    view.setTranslationY(0.0f);
                    s9.f12007e.setTranslationY(0.0f);
                }
                s9.f12007e.setVisibility(8);
                s9.f12007e.setTransitioning(false);
                s9.f12021t = null;
                k kVar = s9.f12013l;
                if (kVar != null) {
                    kVar.p(s9.f12012k);
                    s9.f12012k = null;
                    s9.f12013l = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = s9.f12006d;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = U.a;
                    F.c(actionBarOverlayLayout);
                }
                break;
            default:
                s9.f12021t = null;
                s9.f12007e.requestLayout();
                break;
        }
    }
}
