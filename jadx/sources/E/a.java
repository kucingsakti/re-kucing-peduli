package E;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f1078A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public B.a f1079B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1080z;

    public boolean getAllowsGoneWidget() {
        return this.f1079B.f403t0;
    }

    public int getMargin() {
        return this.f1079B.f404u0;
    }

    public int getType() {
        return this.f1080z;
    }

    @Override // E.c
    public final void h(B.d dVar, boolean z6) {
        int i10 = this.f1080z;
        this.f1078A = i10;
        if (z6) {
            if (i10 == 5) {
                this.f1078A = 1;
            } else if (i10 == 6) {
                this.f1078A = 0;
            }
        } else if (i10 == 5) {
            this.f1078A = 0;
        } else if (i10 == 6) {
            this.f1078A = 1;
        }
        if (dVar instanceof B.a) {
            ((B.a) dVar).f402s0 = this.f1078A;
        }
    }

    public void setAllowsGoneWidget(boolean z6) {
        this.f1079B.f403t0 = z6;
    }

    public void setDpMargin(int i10) {
        this.f1079B.f404u0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f1079B.f404u0 = i10;
    }

    public void setType(int i10) {
        this.f1080z = i10;
    }
}
