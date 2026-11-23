package J0;

import android.view.View;

/* JADX INFO: renamed from: J0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0261k {
    public AbstractC0266p a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2323e;

    public C0261k() {
        d();
    }

    public final void a() {
        this.f2321c = this.f2322d ? this.a.g() : this.a.k();
    }

    public final void b(View view, int i10) {
        if (this.f2322d) {
            this.f2321c = this.a.m() + this.a.b(view);
        } else {
            this.f2321c = this.a.e(view);
        }
        this.f2320b = i10;
    }

    public final void c(View view, int i10) {
        int iM = this.a.m();
        if (iM >= 0) {
            b(view, i10);
            return;
        }
        this.f2320b = i10;
        if (!this.f2322d) {
            int iE = this.a.e(view);
            int iK = iE - this.a.k();
            this.f2321c = iE;
            if (iK > 0) {
                int iG = (this.a.g() - Math.min(0, (this.a.g() - iM) - this.a.b(view))) - (this.a.c(view) + iE);
                if (iG < 0) {
                    this.f2321c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (this.a.g() - iM) - this.a.b(view);
        this.f2321c = this.a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.f2321c - this.a.c(view);
            int iK2 = this.a.k();
            int iMin = iC - (Math.min(this.a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f2321c = Math.min(iG2, -iMin) + this.f2321c;
            }
        }
    }

    public final void d() {
        this.f2320b = -1;
        this.f2321c = Integer.MIN_VALUE;
        this.f2322d = false;
        this.f2323e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2320b + ", mCoordinate=" + this.f2321c + ", mLayoutFromEnd=" + this.f2322d + ", mValid=" + this.f2323e + '}';
    }
}
