package com.kcstream.cing.activity;

import A1.C0099h;
import A1.r;
import A9.A;
import C8.u;
import Ca.c;
import J7.j;
import K4.f;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.gson.i;
import com.kcstream.cing.R;
import com.kcstream.cing.model.Search;
import com.kcstream.cing.model.SearchListGenresData;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Metadata;
import p086i8.C;
import p086i8.k;
import p188t1.G;
import p210v8.l;
import p210v8.v;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/SearchActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SearchActivity extends f {
    public static final /* synthetic */ u[] f0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public I4.b f10208V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Search f10209W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final p081i3.b f10210X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f10211Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final p081i3.b f10212Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Type f10213a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final i f10214b0;
    public ArrayList c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Type f10215d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Ca.b f10216e0;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001¨\u0006\u0005"}, d2 = {"com/kcstream/cing/activity/SearchActivity$a", "Lz4/a;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends p243z4.a<ArrayList<String>> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001¨\u0006\u0005"}, d2 = {"com/kcstream/cing/activity/SearchActivity$b", "Lz4/a;", "Ljava/util/ArrayList;", "Lcom/kcstream/cing/model/SearchListGenresData;", "Lkotlin/collections/ArrayList;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends p243z4.a<ArrayList<SearchListGenresData>> {
    }

    static {
        l lVar = new l(SearchActivity.class, "page", "getPage()I");
        v vVar = p210v8.u.a;
        f0 = new u[]{vVar.d(lVar), vVar.d(new l(SearchActivity.class, "totalPages", "getTotalPages()I"))};
    }

    public SearchActivity() {
        new ArrayList();
        this.f10210X = new p081i3.b(24);
        this.f10211Y = new ArrayList();
        this.f10212Z = new p081i3.b(24);
        this.f10213a0 = new b().f16313b;
        this.f10214b0 = new i();
        this.c0 = new ArrayList();
        this.f10215d0 = new a().f16313b;
    }

    public static final int z(SearchActivity searchActivity) {
        return ((Number) searchActivity.f10210X.y(f0[0], searchActivity)).intValue();
    }

    public final I4.b A() {
        I4.b bVar = this.f10208V;
        if (bVar != null) {
            return bVar;
        }
        p210v8.i.n("binding");
        throw null;
    }

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_search, (ViewGroup) null, false);
        int i10 = R.id.adView;
        RelativeLayout relativeLayout = (RelativeLayout) oa.b.c(viewInflate, R.id.adView);
        if (relativeLayout != null) {
            i10 = R.id.cg_search_history;
            ChipGroup chipGroup = (ChipGroup) oa.b.c(viewInflate, R.id.cg_search_history);
            if (chipGroup != null) {
                i10 = R.id.cv_series_ads;
                if (((LinearLayout) oa.b.c(viewInflate, R.id.cv_series_ads)) != null) {
                    i10 = R.id.iv_no_data;
                    ImageView imageView = (ImageView) oa.b.c(viewInflate, R.id.iv_no_data);
                    if (imageView != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                        int i11 = R.id.ll_genres;
                        NestedScrollView nestedScrollView = (NestedScrollView) oa.b.c(viewInflate, R.id.ll_genres);
                        if (nestedScrollView != null) {
                            i11 = R.id.ll_history;
                            LinearLayout linearLayout = (LinearLayout) oa.b.c(viewInflate, R.id.ll_history);
                            if (linearLayout != null) {
                                i11 = R.id.pb_progress;
                                ProgressBar progressBar = (ProgressBar) oa.b.c(viewInflate, R.id.pb_progress);
                                if (progressBar != null) {
                                    i11 = R.id.rv_genre;
                                    RecyclerView recyclerView = (RecyclerView) oa.b.c(viewInflate, R.id.rv_genre);
                                    if (recyclerView != null) {
                                        i11 = R.id.search_recycler_view;
                                        RecyclerView recyclerView2 = (RecyclerView) oa.b.c(viewInflate, R.id.search_recycler_view);
                                        if (recyclerView2 != null) {
                                            i11 = R.id.searchView;
                                            SimpleSearchView simpleSearchView = (SimpleSearchView) oa.b.c(viewInflate, R.id.searchView);
                                            if (simpleSearchView != null) {
                                                i11 = R.id.toolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) oa.b.c(viewInflate, R.id.toolbar);
                                                if (materialToolbar != null) {
                                                    i11 = R.id.tx_no_result;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) oa.b.c(viewInflate, R.id.tx_no_result);
                                                    if (relativeLayout2 != null) {
                                                        I4.b bVar = new I4.b();
                                                        bVar.a = coordinatorLayout;
                                                        bVar.f2069b = relativeLayout;
                                                        bVar.f2071d = chipGroup;
                                                        bVar.f2072e = imageView;
                                                        bVar.f2073f = nestedScrollView;
                                                        bVar.f2074g = linearLayout;
                                                        bVar.f2075h = progressBar;
                                                        bVar.f2076i = recyclerView;
                                                        bVar.j = recyclerView2;
                                                        bVar.f2077k = simpleSearchView;
                                                        bVar.f2078l = materialToolbar;
                                                        bVar.f2070c = relativeLayout2;
                                                        this.f10208V = bVar;
                                                        setContentView((CoordinatorLayout) A().a);
                                                        v((MaterialToolbar) A().f2078l);
                                                        j jVarL = l();
                                                        p210v8.i.c(jVarL);
                                                        jVarL.H(true);
                                                        jVarL.K(R.drawable.ic_rounded_close);
                                                        jVarL.R("Cari");
                                                        D3.b.t((ImageView) A().f2072e, Integer.valueOf(R.drawable.neko_sticker2));
                                                        boolean zContains = y().contains("saved_search");
                                                        i iVar = this.f10214b0;
                                                        if (zContains) {
                                                            Object objB = iVar.b(y().getString("saved_search", ""), this.f10215d0);
                                                            p210v8.i.e(objB, "fromJson(...)");
                                                            ArrayList arrayList = (ArrayList) objB;
                                                            this.c0 = arrayList;
                                                            int i12 = 0;
                                                            for (Object obj : arrayList) {
                                                                int i13 = i12 + 1;
                                                                if (i12 < 0) {
                                                                    p086i8.l.G();
                                                                    throw null;
                                                                }
                                                                String str = (String) obj;
                                                                Chip chip = new Chip(this, null);
                                                                chip.setText(str);
                                                                D3.b.e(chip, new A(this, 4, str));
                                                                ((ChipGroup) A().f2071d).addView(chip);
                                                                i12 = i13;
                                                            }
                                                        }
                                                        if (y().contains("genreData")) {
                                                            Object objB2 = iVar.b(y().getString("genreData", ""), this.f10213a0);
                                                            p210v8.i.e(objB2, "fromJson(...)");
                                                            ArrayList arrayListT0 = (ArrayList) objB2;
                                                            if (!C.q(arrayListT0)) {
                                                                arrayListT0 = k.t0(arrayListT0);
                                                            }
                                                            G g8 = new G(new c(x.b(arrayListT0)));
                                                            v vVar = p210v8.u.a;
                                                            g8.x(vVar.b(SearchListGenresData.class), vVar.b(G4.l.class));
                                                            g8.r((RecyclerView) A().f2076i);
                                                        }
                                                        new C0099h(16).l(this, (RelativeLayout) A().f2069b, this.f2592R);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i10 = i11;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        p210v8.i.f(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_search, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.action_search);
        SimpleSearchView simpleSearchView = (SimpleSearchView) A().f2077k;
        simpleSearchView.setMenuItem(menuItemFindItem);
        simpleSearchView.setOnQueryTextListener(new r(this, 9));
        simpleSearchView.setOnSearchViewListener(new p040e1.j(this, 8));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // p078i.AbstractActivityC0655l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((ChipGroup) A().f2071d).removeAllViews();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        p210v8.i.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
