package I4;

import A9.C0140m;
import B9.m;
import L8.D;
import L8.G;
import L8.InterfaceC0271e;
import L8.InterfaceC0290y;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import java.util.List;
import java.util.Set;
import p067g9.f;
import p086i8.s;
import p104k9.C0678g;
import p140o4.r;
import p220w9.e;
import p220w9.g;
import p220w9.h;
import p220w9.i;
import p220w9.j;
import p220w9.k;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f2085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f2086i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f2087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f2088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f2089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f2090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f2092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f2093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f2094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f2095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f2096t;

    public c(l lVar, InterfaceC0290y interfaceC0290y, e eVar, p220w9.a aVar, G g8, j jVar, k kVar, Iterable iterable, r rVar, N8.b bVar, N8.d dVar, C0678g c0678g, m mVar, p170r3.e eVar2, List list, int i10) {
        m mVar2;
        i iVar = i.f15659b;
        i iVar2 = i.f15661d;
        T8.a aVar2 = T8.a.a;
        i iVar3 = h.a;
        if ((i10 & 65536) != 0) {
            B9.l.f793b.getClass();
            mVar2 = B9.k.f792b;
        } else {
            mVar2 = mVar;
        }
        N8.a aVar3 = N8.a.f3406e;
        List listU = (i10 & 524288) != 0 ? com.bumptech.glide.d.u(C0140m.a) : list;
        p210v8.i.f(interfaceC0290y, "moduleDescriptor");
        p210v8.i.f(c0678g, "extensionRegistryLite");
        p210v8.i.f(mVar2, "kotlinTypeChecker");
        this.a = lVar;
        this.f2079b = interfaceC0290y;
        this.f2080c = iVar;
        this.f2081d = eVar;
        this.f2082e = aVar;
        this.f2083f = g8;
        this.f2084g = iVar2;
        this.f2085h = jVar;
        this.f2086i = aVar2;
        this.j = kVar;
        this.f2087k = iterable;
        this.f2088l = rVar;
        this.f2089m = iVar3;
        this.f2090n = bVar;
        this.f2091o = dVar;
        this.f2092p = c0678g;
        this.f2093q = mVar2;
        this.f2094r = aVar3;
        this.f2095s = listU;
        this.f2096t = new g(this);
    }

    public static c c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_series, (ViewGroup) null, false);
        int i10 = R.id.adView;
        RelativeLayout relativeLayout = (RelativeLayout) oa.b.c(viewInflate, R.id.adView);
        if (relativeLayout != null) {
            i10 = R.id.adView2;
            RelativeLayout relativeLayout2 = (RelativeLayout) oa.b.c(viewInflate, R.id.adView2);
            if (relativeLayout2 != null) {
                i10 = R.id.ads2;
                if (((LinearLayout) oa.b.c(viewInflate, R.id.ads2)) != null) {
                    i10 = R.id.appbar;
                    AppBarLayout appBarLayout = (AppBarLayout) oa.b.c(viewInflate, R.id.appbar);
                    if (appBarLayout != null) {
                        i10 = R.id.cg_genre;
                        ChipGroup chipGroup = (ChipGroup) oa.b.c(viewInflate, R.id.cg_genre);
                        if (chipGroup != null) {
                            i10 = R.id.cv_series_ads;
                            if (((LinearLayout) oa.b.c(viewInflate, R.id.cv_series_ads)) != null) {
                                i10 = R.id.cv_series_detail;
                                if (((MaterialCardView) oa.b.c(viewInflate, R.id.cv_series_detail)) != null) {
                                    i10 = R.id.cv_series_genre;
                                    if (((MaterialCardView) oa.b.c(viewInflate, R.id.cv_series_genre)) != null) {
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                        i10 = R.id.layoutframe;
                                        if (((FrameLayout) oa.b.c(viewInflate, R.id.layoutframe)) != null) {
                                            i10 = R.id.load_more_desc;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) oa.b.c(viewInflate, R.id.load_more_desc);
                                            if (relativeLayout3 != null) {
                                                i10 = R.id.mNestedScroll;
                                                LinearLayout linearLayout = (LinearLayout) oa.b.c(viewInflate, R.id.mNestedScroll);
                                                if (linearLayout != null) {
                                                    i10 = R.id.nestedScroll;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) oa.b.c(viewInflate, R.id.nestedScroll);
                                                    if (nestedScrollView != null) {
                                                        i10 = R.id.pb_progress;
                                                        ProgressBar progressBar = (ProgressBar) oa.b.c(viewInflate, R.id.pb_progress);
                                                        if (progressBar != null) {
                                                            i10 = R.id.series_cover;
                                                            ImageView imageView = (ImageView) oa.b.c(viewInflate, R.id.series_cover);
                                                            if (imageView != null) {
                                                                i10 = R.id.series_description;
                                                                MaterialTextView materialTextView = (MaterialTextView) oa.b.c(viewInflate, R.id.series_description);
                                                                if (materialTextView != null) {
                                                                    i10 = R.id.series_episode;
                                                                    RecyclerView recyclerView = (RecyclerView) oa.b.c(viewInflate, R.id.series_episode);
                                                                    if (recyclerView != null) {
                                                                        i10 = R.id.series_image;
                                                                        ImageView imageView2 = (ImageView) oa.b.c(viewInflate, R.id.series_image);
                                                                        if (imageView2 != null) {
                                                                            i10 = R.id.series_meta_durasi;
                                                                            MaterialTextView materialTextView2 = (MaterialTextView) oa.b.c(viewInflate, R.id.series_meta_durasi);
                                                                            if (materialTextView2 != null) {
                                                                                i10 = R.id.series_meta_episode;
                                                                                MaterialTextView materialTextView3 = (MaterialTextView) oa.b.c(viewInflate, R.id.series_meta_episode);
                                                                                if (materialTextView3 != null) {
                                                                                    i10 = R.id.series_meta_produser;
                                                                                    MaterialTextView materialTextView4 = (MaterialTextView) oa.b.c(viewInflate, R.id.series_meta_produser);
                                                                                    if (materialTextView4 != null) {
                                                                                        i10 = R.id.series_meta_skor;
                                                                                        MaterialTextView materialTextView5 = (MaterialTextView) oa.b.c(viewInflate, R.id.series_meta_skor);
                                                                                        if (materialTextView5 != null) {
                                                                                            i10 = R.id.series_meta_status;
                                                                                            MaterialTextView materialTextView6 = (MaterialTextView) oa.b.c(viewInflate, R.id.series_meta_status);
                                                                                            if (materialTextView6 != null) {
                                                                                                i10 = R.id.series_title;
                                                                                                MaterialTextView materialTextView7 = (MaterialTextView) oa.b.c(viewInflate, R.id.series_title);
                                                                                                if (materialTextView7 != null) {
                                                                                                    i10 = R.id.toolbar;
                                                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) oa.b.c(viewInflate, R.id.toolbar);
                                                                                                    if (materialToolbar != null) {
                                                                                                        return new c(coordinatorLayout, relativeLayout, relativeLayout2, appBarLayout, chipGroup, relativeLayout3, linearLayout, nestedScrollView, progressBar, imageView, materialTextView, recyclerView, imageView2, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7, materialToolbar);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    public V3.b a(D d3, f fVar, p067g9.g gVar, p067g9.h hVar, p067g9.a aVar, p029c9.f fVar2) {
        p210v8.i.f(d3, "descriptor");
        p210v8.i.f(fVar, "nameResolver");
        p210v8.i.f(aVar, "metadataVersion");
        return new V3.b(this, fVar, d3, gVar, hVar, aVar, fVar2, null, s.f12328s);
    }

    public InterfaceC0271e b(p096j9.b bVar) {
        p210v8.i.f(bVar, "classId");
        Set set = g.f15657c;
        return ((g) this.f2096t).a(bVar, null);
    }

    public c(CoordinatorLayout coordinatorLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AppBarLayout appBarLayout, ChipGroup chipGroup, RelativeLayout relativeLayout3, LinearLayout linearLayout, NestedScrollView nestedScrollView, ProgressBar progressBar, ImageView imageView, MaterialTextView materialTextView, RecyclerView recyclerView, ImageView imageView2, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialToolbar materialToolbar) {
        this.a = coordinatorLayout;
        this.f2079b = relativeLayout;
        this.f2080c = relativeLayout2;
        this.f2082e = appBarLayout;
        this.f2083f = chipGroup;
        this.f2081d = relativeLayout3;
        this.f2084g = linearLayout;
        this.f2085h = nestedScrollView;
        this.f2086i = progressBar;
        this.j = imageView;
        this.f2088l = materialTextView;
        this.f2095s = recyclerView;
        this.f2087k = imageView2;
        this.f2089m = materialTextView2;
        this.f2090n = materialTextView3;
        this.f2091o = materialTextView4;
        this.f2092p = materialTextView5;
        this.f2093q = materialTextView6;
        this.f2094r = materialTextView7;
        this.f2096t = materialToolbar;
    }
}
