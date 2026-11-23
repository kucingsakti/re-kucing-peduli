package p;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q0 implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13979s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Toolbar f13980t;

    public /* synthetic */ Q0(Toolbar toolbar, int i10) {
        this.f13979s = i10;
        this.f13980t = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13979s) {
            case 0:
                T0 t7 = this.f13980t.f6231h0;
                p136o.n nVar = t7 == null ? null : t7.f13994t;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                this.f13980t.n();
                break;
        }
    }
}
