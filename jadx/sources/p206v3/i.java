package p206v3;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p022c1.i {
    public final WeakReference a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15447c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15446b = 0;

    public i(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // p022c1.i
    public final void a(int i10) {
        this.f15446b = this.f15447c;
        this.f15447c = i10;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.f9843i0 = this.f15447c;
        }
    }

    @Override // p022c1.i
    public final void b(int i10, float f10, int i11) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i12 = this.f15447c;
            boolean z6 = true;
            if (i12 == 2 && this.f15446b != 1) {
                z6 = false;
            }
            if (i12 == 2 && this.f15446b == 0) {
                z6 = false;
            }
            tabLayout.l(i10, f10, z6, z6, false);
        }
    }

    @Override // p022c1.i
    public final void c(int i10) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
            return;
        }
        int i11 = this.f15447c;
        tabLayout.j(tabLayout.g(i10), i11 == 0 || (i11 == 2 && this.f15446b == 0));
    }
}
