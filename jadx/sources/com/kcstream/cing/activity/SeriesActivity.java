package com.kcstream.cing.activity;

import A1.C0099h;
import E4.C0187a;
import E4.N;
import E4.O;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.Series;
import kotlin.Metadata;
import oa.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/SeriesActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SeriesActivity extends f {
    public static final /* synthetic */ int c0 = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public c f10224V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Series f10225W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Bundle f10226X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MenuItem f10227Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f10228Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f10229a0 = "";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f10230b0 = "";

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10224V = c.c(getLayoutInflater());
        setContentView((CoordinatorLayout) z().a);
        v((MaterialToolbar) z().f2096t);
        Bundle extras = getIntent().getExtras();
        i.c(extras);
        this.f10226X = extras;
        j jVarL = l();
        if (jVarL != null) {
            jVarL.H(true);
            Bundle bundle2 = this.f10226X;
            if (bundle2 == null) {
                i.n("pushed");
                throw null;
            }
            if (bundle2.containsKey("title")) {
                Bundle bundle3 = this.f10226X;
                if (bundle3 == null) {
                    i.n("pushed");
                    throw null;
                }
                jVarL.R(bundle3.getString("title"));
            }
        }
        ((AppBarLayout) z().f2082e).bringToFront();
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        ((LinearLayout) z().f2084g).setVisibility(8);
        c cVarZ = z();
        ((NestedScrollView) cVarZ.f2085h).setOnScrollChangeListener(new C0187a(this, 4));
        AbstractC0342z.n(this, null, new N(this, null), 3);
        new C0099h(16).l(this, (RelativeLayout) z().f2079b, this.f2592R);
        new C0099h(16).m(this, (RelativeLayout) z().f2080c, this.f2593S);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i.f(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_activity_series, menu);
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
        if (itemId != R.id.menu_series_bookmark) {
            return true;
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_bottom_activity_series, (ViewGroup) null, false);
        int i10 = R.id.iv_finished;
        if (((ImageView) b.c(viewInflate, R.id.iv_finished)) != null) {
            i10 = R.id.iv_not_finished;
            if (((ImageView) b.c(viewInflate, R.id.iv_not_finished)) != null) {
                i10 = R.id.iv_remove;
                if (((ImageView) b.c(viewInflate, R.id.iv_remove)) != null) {
                    i10 = R.id.iv_watch_later;
                    if (((ImageView) b.c(viewInflate, R.id.iv_watch_later)) != null) {
                        i10 = R.id.rl_finished;
                        RelativeLayout relativeLayout = (RelativeLayout) b.c(viewInflate, R.id.rl_finished);
                        if (relativeLayout != null) {
                            i10 = R.id.rl_info;
                            if (((RelativeLayout) b.c(viewInflate, R.id.rl_info)) != null) {
                                i10 = R.id.rl_not_finished;
                                RelativeLayout relativeLayout2 = (RelativeLayout) b.c(viewInflate, R.id.rl_not_finished);
                                if (relativeLayout2 != null) {
                                    i10 = R.id.rl_remove;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) b.c(viewInflate, R.id.rl_remove);
                                    if (relativeLayout3 != null) {
                                        i10 = R.id.rl_watch_later;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) b.c(viewInflate, R.id.rl_watch_later);
                                        if (relativeLayout4 != null) {
                                            i10 = R.id.tx_finished;
                                            if (((MaterialTextView) b.c(viewInflate, R.id.tx_finished)) != null) {
                                                i10 = R.id.tx_not_finished;
                                                if (((MaterialTextView) b.c(viewInflate, R.id.tx_not_finished)) != null) {
                                                    i10 = R.id.tx_remove;
                                                    if (((MaterialTextView) b.c(viewInflate, R.id.tx_remove)) != null) {
                                                        i10 = R.id.tx_watch_later;
                                                        if (((MaterialTextView) b.c(viewInflate, R.id.tx_watch_later)) != null) {
                                                            h hVar = new h(this);
                                                            hVar.setContentView((RelativeLayout) viewInflate);
                                                            hVar.show();
                                                            D3.b.e(relativeLayout, new O(this, hVar, 0));
                                                            D3.b.e(relativeLayout2, new O(this, hVar, 1));
                                                            D3.b.e(relativeLayout4, new O(this, hVar, 2));
                                                            if (w().b(this.f10228Z, "series")) {
                                                                D3.b.e(relativeLayout3, new O(this, hVar, 3));
                                                                return true;
                                                            }
                                                            relativeLayout3.setVisibility(8);
                                                            return true;
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
    public final boolean onPrepareOptionsMenu(Menu menu) {
        i.f(menu, "menu");
        this.f10227Y = menu.findItem(R.id.menu_series_bookmark);
        Bundle bundle = this.f10226X;
        if (bundle == null) {
            i.n("pushed");
            throw null;
        }
        boolean zB = w().b(bundle.getInt("id"), "series");
        MenuItem menuItem = this.f10227Y;
        if (menuItem != null) {
            menuItem.setVisible(true);
            if (zB) {
                menuItem.setIcon(R.drawable.ic_rounded_bookmarked);
            } else {
                menuItem.setIcon(R.drawable.ic_rounded_bookmark);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final c z() {
        c cVar = this.f10224V;
        if (cVar != null) {
            return cVar;
        }
        i.n("binding");
        throw null;
    }
}
