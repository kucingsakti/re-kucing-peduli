package p091j3;

import J0.I;
import V.j;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class p extends I {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f12447f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f12447f = tVar;
    }

    @Override // J0.I, U.C0412b
    public final void d(View view, j jVar) {
        super.d(view, jVar);
        k kVar = this.f12447f.f12472w;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            t tVar = kVar.f12444g;
            if (i10 >= tVar.f12472w.f12441d.size()) {
                jVar.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i11, 1, false));
                return;
            } else {
                int iC = tVar.f12472w.c(i10);
                if (iC == 0 || iC == 1) {
                    i11++;
                }
                i10++;
            }
        }
    }
}
