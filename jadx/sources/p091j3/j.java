package p091j3;

import U.C0412b;
import V.i;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j extends C0412b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f12440f;

    public j(k kVar, int i10, boolean z6) {
        this.f12440f = kVar;
        this.f12438d = i10;
        this.f12439e = z6;
    }

    @Override // U.C0412b
    public final void d(View view, V.j jVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, jVar.a);
        int i10 = this.f12438d;
        int i11 = 0;
        int i12 = i10;
        while (true) {
            k kVar = this.f12440f;
            if (i11 >= i10) {
                kVar.getClass();
                jVar.j(i.a(i12, 1, 1, 1, this.f12439e, view.isSelected()));
                return;
            } else {
                t tVar = kVar.f12444g;
                if (tVar.f12472w.c(i11) == 2 || tVar.f12472w.c(i11) == 3) {
                    i12--;
                }
                i11++;
            }
        }
    }
}
