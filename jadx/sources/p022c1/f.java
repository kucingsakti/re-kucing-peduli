package p022c1;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f7428b;

    public /* synthetic */ f(ViewPager2 viewPager2, int i10) {
        this.a = i10;
        this.f7428b = viewPager2;
    }

    @Override // p022c1.i
    public void a(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    this.f7428b.c();
                }
                break;
        }
    }

    @Override // p022c1.i
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = this.f7428b;
                if (viewPager2.f7199v != i10) {
                    viewPager2.f7199v = i10;
                    viewPager2.f7195L.v();
                }
                break;
            default:
                ViewPager2 viewPager3 = this.f7428b;
                viewPager3.clearFocus();
                if (viewPager3.hasFocus()) {
                    viewPager3.f7185B.requestFocus(2);
                }
                break;
        }
    }
}
