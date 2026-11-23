package com.kcstream.cing.fragment;

import C8.u;
import E4.B;
import E4.C0187a;
import Fa.e;
import J4.p;
import K4.g;
import N9.AbstractC0342z;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.MainActivity;
import com.kcstream.cing.model.Recent;
import com.smarteist.autoimageslider.SliderView;
import kotlin.Metadata;
import p.b1;
import p078i.AbstractActivityC0655l;
import p081i3.b;
import p210v8.i;
import p210v8.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/fragment/TabsRecentFragment;", "LK4/g;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TabsRecentFragment extends g {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ u[] f10260y0 = {p210v8.u.a.d(new l(TabsRecentFragment.class, "carouselRecent", "getCarouselRecent()Lcom/kcstream/cing/adapter/HomeSliderAdapter;"))};

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public e f10261v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Recent f10262w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final b f10263x0 = new b(24);

    @Override // K4.g, androidx.fragment.app.b
    public final void C(Bundle bundle) {
        super.C(bundle);
        c0(true);
    }

    @Override // androidx.fragment.app.b
    public final void D(Menu menu, MenuInflater menuInflater) {
        i.f(menu, "menu");
        i.f(menuInflater, "inflater");
        menuInflater.inflate(R.menu.menu_activity_main, menu);
    }

    @Override // androidx.fragment.app.b
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.f(layoutInflater, "inflater");
        b1 b1Var = ((MainActivity) W()).f10193V;
        if (b1Var == null) {
            i.n("binding");
            throw null;
        }
        ((ImageView) b1Var.f14040w).setVisibility(0);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_activity_main_home, viewGroup, false);
        int i10 = R.id.imageSlider;
        SliderView sliderView = (SliderView) oa.b.c(viewInflate, R.id.imageSlider);
        if (sliderView != null) {
            i10 = R.id.mNestedScroll;
            NestedScrollView nestedScrollView = (NestedScrollView) oa.b.c(viewInflate, R.id.mNestedScroll);
            if (nestedScrollView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate;
                i10 = R.id.recycler_home;
                RecyclerView recyclerView = (RecyclerView) oa.b.c(viewInflate, R.id.recycler_home);
                if (recyclerView != null) {
                    this.f10261v0 = new e(swipeRefreshLayout, sliderView, nestedScrollView, swipeRefreshLayout, recyclerView, 5);
                    SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) g0().f1659t;
                    i.e(swipeRefreshLayout2, "getRoot(...)");
                    return swipeRefreshLayout2;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.b
    public final void L() {
        this.f6634a0 = true;
        SliderView sliderView = (SliderView) g0().f1660u;
        sliderView.f10322s.removeCallbacks(sliderView);
    }

    @Override // androidx.fragment.app.b
    public final void N() {
        this.f6634a0 = true;
        SliderView sliderView = (SliderView) g0().f1660u;
        Handler handler = sliderView.f10322s;
        handler.removeCallbacks(sliderView);
        handler.postDelayed(sliderView, sliderView.f10326w);
    }

    @Override // androidx.fragment.app.b
    public final void R(View view, Bundle bundle) {
        i.f(view, "view");
        W();
        if (f() != null) {
            AbstractActivityC0655l abstractActivityC0655lF = f();
            i.d(abstractActivityC0655lF, "null cannot be cast to non-null type com.kcstream.cing.activity.MainActivity");
            MainActivity mainActivity = (MainActivity) abstractActivityC0655lF;
            mainActivity.getWindow().setStatusBarColor(0);
            b1 b1Var = mainActivity.f10193V;
            if (b1Var == null) {
                i.n("binding");
                throw null;
            }
            ((MaterialToolbar) b1Var.f14043z).setBackgroundResource(android.R.color.transparent);
            e eVarG0 = g0();
            ((NestedScrollView) eVarG0.f1661v).setOnScrollChangeListener(new C0187a(this, 9));
        }
        AbstractC0342z.n(this, null, new p(this, null), 3);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) g0().f1662w;
        swipeRefreshLayout.setRefreshing(false);
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(D3.b.m(X(), R.attr.colorSurface));
        swipeRefreshLayout.setColorSchemeColors(-1);
        swipeRefreshLayout.setOnRefreshListener(new B(this, 3, view));
    }

    public final e g0() {
        e eVar = this.f10261v0;
        if (eVar != null) {
            return eVar;
        }
        i.n("binding");
        throw null;
    }
}
