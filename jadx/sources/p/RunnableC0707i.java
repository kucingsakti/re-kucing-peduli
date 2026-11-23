package p;

import android.view.View;

/* JADX INFO: renamed from: p.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0707i implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0703g f14069s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f14070t;

    public RunnableC0707i(androidx.appcompat.widget.b bVar, C0703g c0703g) {
        this.f14070t = bVar;
        this.f14069s = c0703g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p136o.j jVar;
        androidx.appcompat.widget.b bVar = this.f14070t;
        p136o.l lVar = bVar.f6271u;
        if (lVar != null && (jVar = lVar.f13511w) != null) {
            jVar.r(lVar);
        }
        View view = (View) bVar.f6276z;
        if (view != null && view.getWindowToken() != null) {
            C0703g c0703g = this.f14069s;
            if (c0703g.b()) {
                bVar.f6264L = c0703g;
            } else if (c0703g.f13560e != null) {
                c0703g.d(0, 0, false, false);
                bVar.f6264L = c0703g;
            }
        }
        bVar.f6266N = null;
    }
}
