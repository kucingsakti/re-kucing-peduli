package p003a3;

import K0.n;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f6003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i10) {
        super(1);
        this.f6002b = i10;
        switch (i10) {
            case 1:
                this.f6003c = carouselLayoutManager;
                super(0);
                break;
            default:
                this.f6003c = carouselLayoutManager;
                break;
        }
    }

    @Override // K0.n
    public final int c() {
        switch (this.f6002b) {
            case 0:
                return this.f6003c.f7134p;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f6003c;
                return carouselLayoutManager.f7134p - carouselLayoutManager.I();
        }
    }

    @Override // K0.n
    public final int d() {
        switch (this.f6002b) {
            case 0:
                return this.f6003c.J();
            default:
                return 0;
        }
    }

    @Override // K0.n
    public final int e() {
        switch (this.f6002b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f6003c;
                return carouselLayoutManager.f7133o - carouselLayoutManager.K();
            default:
                return this.f6003c.f7133o;
        }
    }

    @Override // K0.n
    public final int f() {
        switch (this.f6002b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f6003c;
                if (carouselLayoutManager.K0()) {
                    return carouselLayoutManager.f7133o;
                }
                return 0;
        }
    }

    @Override // K0.n
    public final int g() {
        switch (this.f6002b) {
            case 0:
                return 0;
            default:
                return this.f6003c.L();
        }
    }
}
