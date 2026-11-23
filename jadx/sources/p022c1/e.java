package p022c1;

import J0.u;
import androidx.preference.Preference;
import androidx.viewpager2.widget.ViewPager2;
import o1.h;

/* JADX INFO: loaded from: classes.dex */
public final class e extends u {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7427b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.f7427b = obj;
    }

    @Override // J0.u
    public final void a() {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f7427b;
                viewPager2.f7200w = true;
                viewPager2.f7187D.f7426l = true;
                break;
            default:
                ((h) this.f7427b).v();
                break;
        }
    }

    @Override // J0.u
    public final void b(int i10, int i11, Preference preference) {
        a();
    }

    @Override // J0.u
    public final void c(int i10, int i11) {
        a();
    }

    @Override // J0.u
    public final void d(int i10, int i11) {
        a();
    }
}
