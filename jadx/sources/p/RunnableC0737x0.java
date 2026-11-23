package p;

/* JADX INFO: renamed from: p.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0737x0 implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A0 f14156t;

    public /* synthetic */ RunnableC0737x0(A0 a10, int i10) {
        this.f14155s = i10;
        this.f14156t = a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14155s) {
            case 0:
                C0722p0 c0722p0 = this.f14156t.f13921u;
                if (c0722p0 != null) {
                    c0722p0.setListSelectionHidden(true);
                    c0722p0.requestLayout();
                }
                break;
            default:
                A0 a10 = this.f14156t;
                C0722p0 c0722p1 = a10.f13921u;
                if (c0722p1 != null && c0722p1.isAttachedToWindow() && a10.f13921u.getCount() > a10.f13921u.getChildCount() && a10.f13921u.getChildCount() <= a10.f13906E) {
                    a10.f13918R.setInputMethodMode(2);
                    a10.a();
                    break;
                }
                break;
        }
    }
}
