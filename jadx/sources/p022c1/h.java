package p022c1;

import J0.D;
import V.i;
import V.j;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends LinearLayoutManager {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f7429F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ViewPager2 viewPager2) {
        super(1);
        this.f7429F = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void J0(D d3, int[] iArr) {
        ViewPager2 viewPager2 = this.f7429F;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.J0(d3, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.w
    public final void a0(A a, D d3, j jVar) {
        super.a0(a, d3, jVar);
        this.f7429F.f7195L.getClass();
    }

    @Override // androidx.recyclerview.widget.w
    public final void c0(A a, D d3, View view, j jVar) {
        int iM;
        ViewPager2 viewPager2 = (ViewPager2) this.f7429F.f7195L.f13635v;
        int iM2 = 0;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.f7202y.getClass();
            iM = w.M(view);
        } else {
            iM = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.f7202y.getClass();
            iM2 = w.M(view);
        }
        jVar.j(i.a(iM, 1, iM2, 1, false, false));
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean o0(A a, D d3, int i10, Bundle bundle) {
        this.f7429F.f7195L.getClass();
        return super.o0(a, d3, i10, bundle);
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean t0(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z10) {
        return false;
    }
}
