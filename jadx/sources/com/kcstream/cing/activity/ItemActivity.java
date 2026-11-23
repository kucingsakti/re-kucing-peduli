package com.kcstream.cing.activity;

import A1.C0099h;
import A1.J;
import B4.C0157e;
import B4.C0159g;
import E4.C0203q;
import E4.C0204s;
import E4.C0205t;
import E4.C0206u;
import I4.a;
import J7.j;
import L9.n;
import N9.AbstractC0342z;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.library.AdController;
import com.kcstream.cing.model.Posts;
import kotlin.Metadata;
import oa.b;
import p190t3.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/ItemActivity;", "Lcom/kcstream/cing/library/AdController;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ItemActivity extends AdController {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f10182n0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public a f10183b0;
    public Posts c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public MenuItem f10184d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Bundle f10185e0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f10186g0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public C0159g f10189j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f10190k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f10191l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f10192m0;
    public String f0 = "";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f10187h0 = "";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f10188i0 = "";

    public ItemActivity() {
        System.loadLibrary("native-lib");
    }

    public final a C() {
        a aVar = this.f10183b0;
        if (aVar != null) {
            return aVar;
        }
        i.n("binding");
        throw null;
    }

    @Override // com.kcstream.cing.library.AdController, K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_post, (ViewGroup) null, false);
        int i10 = R.id.adView;
        RelativeLayout relativeLayout = (RelativeLayout) b.c(viewInflate, R.id.adView);
        if (relativeLayout != null) {
            i10 = R.id.adView2;
            RelativeLayout relativeLayout2 = (RelativeLayout) b.c(viewInflate, R.id.adView2);
            if (relativeLayout2 != null) {
                i10 = R.id.cg_download_list;
                ChipGroup chipGroup = (ChipGroup) b.c(viewInflate, R.id.cg_download_list);
                if (chipGroup != null) {
                    i10 = R.id.cg_stream;
                    ChipGroup chipGroup2 = (ChipGroup) b.c(viewInflate, R.id.cg_stream);
                    if (chipGroup2 != null) {
                        i10 = R.id.content;
                        LinearLayout linearLayout = (LinearLayout) b.c(viewInflate, R.id.content);
                        if (linearLayout != null) {
                            i10 = R.id.contents;
                            if (((LinearLayout) b.c(viewInflate, R.id.contents)) != null) {
                                i10 = R.id.cv_downloads;
                                MaterialCardView materialCardView = (MaterialCardView) b.c(viewInflate, R.id.cv_downloads);
                                if (materialCardView != null) {
                                    i10 = R.id.cv_note;
                                    MaterialCardView materialCardView2 = (MaterialCardView) b.c(viewInflate, R.id.cv_note);
                                    if (materialCardView2 != null) {
                                        i10 = R.id.cv_series;
                                        MaterialCardView materialCardView3 = (MaterialCardView) b.c(viewInflate, R.id.cv_series);
                                        if (materialCardView3 != null) {
                                            i10 = R.id.cv_series2_ads;
                                            if (((LinearLayout) b.c(viewInflate, R.id.cv_series2_ads)) != null) {
                                                i10 = R.id.cv_series_ads;
                                                if (((LinearLayout) b.c(viewInflate, R.id.cv_series_ads)) != null) {
                                                    i10 = R.id.fab_comments;
                                                    FloatingActionButton floatingActionButton = (FloatingActionButton) b.c(viewInflate, R.id.fab_comments);
                                                    if (floatingActionButton != null) {
                                                        i10 = R.id.itemDate;
                                                        MaterialTextView materialTextView = (MaterialTextView) b.c(viewInflate, R.id.itemDate);
                                                        if (materialTextView != null) {
                                                            i10 = R.id.iv_series_image;
                                                            ImageView imageView = (ImageView) b.c(viewInflate, R.id.iv_series_image);
                                                            if (imageView != null) {
                                                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                                                i10 = R.id.layout_download_heading;
                                                                if (((LinearLayout) b.c(viewInflate, R.id.layout_download_heading)) != null) {
                                                                    i10 = R.id.layout_series_heading;
                                                                    if (((LinearLayout) b.c(viewInflate, R.id.layout_series_heading)) != null) {
                                                                        i10 = R.id.ll_series;
                                                                        LinearLayout linearLayout2 = (LinearLayout) b.c(viewInflate, R.id.ll_series);
                                                                        if (linearLayout2 != null) {
                                                                            i10 = R.id.nonVideoLayout;
                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) b.c(viewInflate, R.id.nonVideoLayout);
                                                                            if (relativeLayout3 != null) {
                                                                                i10 = R.id.pb_progress;
                                                                                ProgressBar progressBar = (ProgressBar) b.c(viewInflate, R.id.pb_progress);
                                                                                if (progressBar != null) {
                                                                                    i10 = R.id.rl_webview;
                                                                                    WebView webView = (WebView) b.c(viewInflate, R.id.rl_webview);
                                                                                    if (webView != null) {
                                                                                        i10 = R.id.toolbar;
                                                                                        MaterialToolbar materialToolbar = (MaterialToolbar) b.c(viewInflate, R.id.toolbar);
                                                                                        if (materialToolbar != null) {
                                                                                            i10 = R.id.tv_description;
                                                                                            MaterialTextView materialTextView2 = (MaterialTextView) b.c(viewInflate, R.id.tv_description);
                                                                                            if (materialTextView2 != null) {
                                                                                                i10 = R.id.tv_episode;
                                                                                                if (((MaterialTextView) b.c(viewInflate, R.id.tv_episode)) != null) {
                                                                                                    i10 = R.id.tv_note;
                                                                                                    MaterialTextView materialTextView3 = (MaterialTextView) b.c(viewInflate, R.id.tv_note);
                                                                                                    if (materialTextView3 != null) {
                                                                                                        i10 = R.id.tv_series_genre;
                                                                                                        MaterialTextView materialTextView4 = (MaterialTextView) b.c(viewInflate, R.id.tv_series_genre);
                                                                                                        if (materialTextView4 != null) {
                                                                                                            i10 = R.id.tv_series_name;
                                                                                                            MaterialTextView materialTextView5 = (MaterialTextView) b.c(viewInflate, R.id.tv_series_name);
                                                                                                            if (materialTextView5 != null) {
                                                                                                                i10 = R.id.tv_text_note;
                                                                                                                if (((MaterialTextView) b.c(viewInflate, R.id.tv_text_note)) != null) {
                                                                                                                    i10 = R.id.tv_title;
                                                                                                                    MaterialTextView materialTextView6 = (MaterialTextView) b.c(viewInflate, R.id.tv_title);
                                                                                                                    if (materialTextView6 != null) {
                                                                                                                        i10 = R.id.tx_streamNote;
                                                                                                                        MaterialTextView materialTextView7 = (MaterialTextView) b.c(viewInflate, R.id.tx_streamNote);
                                                                                                                        if (materialTextView7 != null) {
                                                                                                                            i10 = R.id.videoLayout;
                                                                                                                            if (((FrameLayout) b.c(viewInflate, R.id.videoLayout)) != null) {
                                                                                                                                this.f10183b0 = new a(coordinatorLayout, relativeLayout, relativeLayout2, chipGroup, chipGroup2, linearLayout, materialCardView, materialCardView2, materialCardView3, floatingActionButton, materialTextView, imageView, coordinatorLayout, linearLayout2, relativeLayout3, progressBar, webView, materialToolbar, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7);
                                                                                                                                C0099h.i(getLayoutInflater());
                                                                                                                                C0099h.j(getLayoutInflater());
                                                                                                                                setContentView((CoordinatorLayout) C().a);
                                                                                                                                Bundle extras = getIntent().getExtras();
                                                                                                                                i.c(extras);
                                                                                                                                this.f10185e0 = extras;
                                                                                                                                v((MaterialToolbar) C().f2068x);
                                                                                                                                j jVarL = l();
                                                                                                                                i.c(jVarL);
                                                                                                                                jVarL.K(R.drawable.back_button);
                                                                                                                                jVarL.H(true);
                                                                                                                                Bundle bundle2 = this.f10185e0;
                                                                                                                                if (bundle2 != null && bundle2.containsKey("title")) {
                                                                                                                                    Bundle bundle3 = this.f10185e0;
                                                                                                                                    i.c(bundle3);
                                                                                                                                    jVarL.R(bundle3.getString("title"));
                                                                                                                                }
                                                                                                                                C0157e c0157eA = C0159g.a(this);
                                                                                                                                a aVarC = C();
                                                                                                                                p040e1.j jVarK = c0157eA.m((WebView) aVarC.f2067w, new LinearLayout.LayoutParams(-1, -1)).K(D3.b.m(this, R.attr.colorPrimaryDark));
                                                                                                                                C0206u c0206u = new C0206u(this);
                                                                                                                                C0157e c0157e = (C0157e) jVarK.f10697t;
                                                                                                                                c0157e.f669f = c0206u;
                                                                                                                                c0157e.f670g = new C0204s(this, 0);
                                                                                                                                c0157e.f671h = new C0205t(0);
                                                                                                                                J jH = jVarK.H();
                                                                                                                                jH.j();
                                                                                                                                C0159g c0159gH = jH.h("about:blank");
                                                                                                                                this.f10189j0 = c0159gH;
                                                                                                                                WebSettings webSettings = (WebSettings) c0159gH.f675c.f577s;
                                                                                                                                webSettings.setSupportMultipleWindows(true);
                                                                                                                                webSettings.setAllowFileAccess(false);
                                                                                                                                webSettings.setAllowContentAccess(false);
                                                                                                                                webSettings.setAllowUniversalAccessFromFileURLs(false);
                                                                                                                                webSettings.setAllowFileAccessFromFileURLs(false);
                                                                                                                                webSettings.setDomStorageEnabled(true);
                                                                                                                                webSettings.setJavaScriptEnabled(true);
                                                                                                                                webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
                                                                                                                                String userAgentString = webSettings.getUserAgentString();
                                                                                                                                i.c(userAgentString);
                                                                                                                                webSettings.setUserAgentString(n.G(n.G(n.G(n.G(userAgentString, "; wv", ""), " UCBrowser/11.6.4.950 ", ""), " MQQBrowser/8.0 ", ""), " AgentWeb/5.0.8 ", ""));
                                                                                                                                try {
                                                                                                                                    Bundle bundle4 = this.f10185e0;
                                                                                                                                    if (bundle4 != null) {
                                                                                                                                        AbstractC0342z.n(this, null, new C0203q(this, bundle4.getInt("id"), null), 3);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    return;
                                                                                                                                } catch (Throwable unused) {
                                                                                                                                    ((CoordinatorLayout) C().f2047b).setVisibility(8);
                                                                                                                                    return;
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
                                }
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
        getMenuInflater().inflate(R.menu.menu_activity_posts, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // p078i.AbstractActivityC0655l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C0159g c0159g = this.f10189j0;
        if (c0159g != null) {
            if (c0159g != null) {
                c0159g.f683l.I();
            } else {
                i.n("agentWeb");
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId != R.id.menu_bookmark) {
            return true;
        }
        if (w().b(this.f10186g0, "episodes")) {
            w().a(this.f10186g0, "episodes");
            MenuItem menuItem2 = this.f10184d0;
            if (menuItem2 != null) {
                menuItem2.setIcon(R.drawable.ic_rounded_bookmark);
            }
            g.f((CoordinatorLayout) C().f2047b, "Dihapus dari Bookmark").g();
            return true;
        }
        w().c(5, "episodes", this.f10186g0, this.f10188i0, this.f10187h0);
        MenuItem menuItem3 = this.f10184d0;
        if (menuItem3 != null) {
            menuItem3.setIcon(R.drawable.ic_rounded_bookmarked);
        }
        g.f((CoordinatorLayout) C().f2047b, "Ditambahkan ke Bookmark").g();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        i.f(menu, "menu");
        this.f10184d0 = menu.findItem(R.id.menu_bookmark);
        Bundle bundle = this.f10185e0;
        if (bundle != null) {
            boolean zB = w().b(Integer.valueOf(bundle.getInt("id")).intValue(), "episodes");
            MenuItem menuItem = this.f10184d0;
            if (menuItem != null) {
                menuItem.setVisible(true);
                if (zB) {
                    menuItem.setIcon(R.drawable.ic_rounded_bookmarked);
                } else {
                    menuItem.setIcon(R.drawable.ic_rounded_bookmark);
                }
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }
}
