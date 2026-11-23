package J4;

import androidx.viewpager2.widget.ViewPager2;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.kcstream.cing.fragment.TabsIndexFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m implements p206v3.c {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2428b;

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.f2428b = obj;
    }

    @Override // p206v3.b
    public final void a(p206v3.f fVar) {
        switch (this.a) {
            case 0:
                p210v8.i.f(fVar, "tab");
                int i10 = fVar.f15429b;
                TabsIndexFragment tabsIndexFragment = (TabsIndexFragment) this.f2428b;
                tabsIndexFragment.f10254A0 = i10;
                ArrayList arrayList = tabsIndexFragment.f10257x0;
                if (arrayList == null) {
                    p210v8.i.n("listOrder");
                    throw null;
                }
                Object obj = arrayList.get(i10);
                p210v8.i.e(obj, "get(...)");
                tabsIndexFragment.f10259z0 = (String) obj;
                tabsIndexFragment.g0();
                return;
            case 1:
                return;
            default:
                int i11 = fVar.f15429b;
                ViewPager2 viewPager2 = (ViewPager2) this.f2428b;
                Object obj2 = viewPager2.f7189F.f5078t;
                viewPager2.b(i11);
                return;
        }
    }

    @Override // p206v3.b
    public final void b() {
        switch (this.a) {
            case 1:
                ((SimpleSearchView) this.f2428b).a();
                break;
        }
    }

    @Override // p206v3.b
    public final void c(p206v3.f fVar) {
        switch (this.a) {
            case 0:
                p210v8.i.f(fVar, "tab");
                break;
        }
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void d(p206v3.f fVar) {
    }

    private final void e(p206v3.f fVar) {
    }

    private final void f(p206v3.f fVar) {
    }
}
