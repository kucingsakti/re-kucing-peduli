package com.kcstream.cing.activity;

import A1.C0099h;
import A9.A;
import E4.I;
import I4.c;
import J7.j;
import K4.f;
import N9.AbstractC0342z;
import X2.h;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.d;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.SearchByGenreActivity;
import com.kcstream.cing.model.SearchByGenre;
import com.kcstream.cing.model.SearchListGenresData;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import oa.b;
import p086i8.l;
import p188t1.G;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/SearchByGenreActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SearchByGenreActivity extends f {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f10217b0 = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public G f10218V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public SearchByGenre f10219W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public List f10220X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ArrayList f10221Y = new ArrayList();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final Type f10222Z = new a().f16313b;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ArrayList f10223a0 = new ArrayList();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001¨\u0006\u0005"}, d2 = {"com/kcstream/cing/activity/SearchByGenreActivity$a", "Lz4/a;", "Ljava/util/ArrayList;", "Lcom/kcstream/cing/model/SearchListGenresData;", "Lkotlin/collections/ArrayList;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends p243z4.a<ArrayList<SearchListGenresData>> {
    }

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_searchbygenre, (ViewGroup) null, false);
        int i10 = R.id.cg_active_genre;
        ChipGroup chipGroup = (ChipGroup) b.c(viewInflate, R.id.cg_active_genre);
        if (chipGroup != null) {
            i10 = R.id.iv_no_data;
            if (((ImageView) b.c(viewInflate, R.id.iv_no_data)) != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                i10 = R.id.pb_progress;
                ProgressBar progressBar = (ProgressBar) b.c(viewInflate, R.id.pb_progress);
                if (progressBar != null) {
                    i10 = R.id.rl_no_result;
                    RelativeLayout relativeLayout = (RelativeLayout) b.c(viewInflate, R.id.rl_no_result);
                    if (relativeLayout != null) {
                        i10 = R.id.rv_searchbygenre;
                        RecyclerView recyclerView = (RecyclerView) b.c(viewInflate, R.id.rv_searchbygenre);
                        if (recyclerView != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) b.c(viewInflate, R.id.toolbar);
                            if (materialToolbar != null) {
                                this.f10218V = new G(coordinatorLayout, chipGroup, progressBar, relativeLayout, recyclerView, materialToolbar);
                                c.c(getLayoutInflater());
                                C0099h.k(getLayoutInflater());
                                super.onCreate(bundle);
                                setContentView((CoordinatorLayout) z().f14978s);
                                v((MaterialToolbar) z().f14983x);
                                j jVarL = l();
                                if (jVarL != null) {
                                    jVarL.H(true);
                                    jVarL.R("Genre");
                                }
                                Bundle extras = getIntent().getExtras();
                                i.c(extras);
                                View viewInflate2 = getLayoutInflater().inflate(R.layout.widget_chip, (ViewGroup) null);
                                i.d(viewInflate2, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
                                Chip chip = (Chip) viewInflate2;
                                if (extras.containsKey("termSingleId")) {
                                    chip.setText(extras.getString("termSingleName"));
                                    ((ChipGroup) z().f14979t).addView(chip);
                                    this.f10220X = d.u(Integer.valueOf(extras.getInt("termSingleId")));
                                }
                                if (y().contains("genreData")) {
                                    Object objB = new com.google.gson.i().b(y().getString("genreData", ""), this.f10222Z);
                                    i.e(objB, "fromJson(...)");
                                    this.f10221Y = (ArrayList) objB;
                                }
                                ((ProgressBar) z().f14980u).setVisibility(0);
                                AbstractC0342z.n(this, null, new I(this, null), 3);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i.f(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_activity_searchbygenres, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            j().a();
            return true;
        }
        if (itemId == R.id.update_genre && !isFinishing()) {
            C0099h c0099hK = C0099h.k(getLayoutInflater());
            final int i10 = 0;
            for (Object obj : this.f10221Y) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    l.G();
                    throw null;
                }
                final SearchListGenresData searchListGenresData = (SearchListGenresData) obj;
                Chip chip = new Chip(this, null);
                chip.setClickable(true);
                chip.setFocusable(true);
                chip.setCheckable(true);
                if (i.a(((SearchListGenresData) this.f10221Y.get(i10)).getActive(), Boolean.TRUE)) {
                    chip.setChecked(true);
                }
                chip.setText(searchListGenresData.getName());
                chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: E4.G
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                        int i12 = SearchByGenreActivity.f10217b0;
                        SearchByGenreActivity searchByGenreActivity = this.a;
                        p210v8.i.f(searchByGenreActivity, "this$0");
                        SearchListGenresData searchListGenresData2 = searchListGenresData;
                        p210v8.i.f(searchListGenresData2, "$it");
                        ArrayList arrayList = searchByGenreActivity.f10223a0;
                        int i13 = i10;
                        if (z6) {
                            searchByGenreActivity.f10221Y.set(i13, new SearchListGenresData(searchListGenresData2.getId(), searchListGenresData2.getName(), Boolean.TRUE));
                            Integer id = searchListGenresData2.getId();
                            p210v8.i.c(id);
                            arrayList.add(id);
                            return;
                        }
                        searchByGenreActivity.f10221Y.set(i13, new SearchListGenresData(searchListGenresData2.getId(), searchListGenresData2.getName(), null));
                        Integer id2 = searchListGenresData2.getId();
                        p210v8.i.c(id2);
                        arrayList.remove(id2);
                    }
                });
                ((ChipGroup) c0099hK.f105v).addView(chip);
                i10 = i11;
            }
            h hVar = new h(this);
            hVar.setContentView((ScrollView) c0099hK.f103t);
            hVar.show();
            D3.b.e((MaterialButton) c0099hK.f104u, new A(hVar, 5, this));
        }
        return true;
    }

    public final G z() {
        G g8 = this.f10218V;
        if (g8 != null) {
            return g8;
        }
        i.n("binding");
        throw null;
    }
}
