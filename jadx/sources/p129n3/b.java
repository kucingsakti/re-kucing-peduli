package p129n3;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13327s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f13328t;

    public /* synthetic */ b(d dVar, int i10) {
        this.f13327s = i10;
        this.f13328t = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13327s) {
            case 0:
                d dVar = this.f13328t;
                if (dVar.f13337v > 0) {
                    SystemClock.uptimeMillis();
                }
                dVar.setVisibility(0);
                break;
            default:
                d dVar2 = this.f13328t;
                ((h) dVar2.getCurrentDrawable()).c(false, false, true);
                if ((dVar2.getProgressDrawable() == null || !dVar2.getProgressDrawable().isVisible()) && (dVar2.getIndeterminateDrawable() == null || !dVar2.getIndeterminateDrawable().isVisible())) {
                    dVar2.setVisibility(4);
                }
                dVar2.getClass();
                break;
        }
    }
}
