package com.kcstream.cing.activity.drawer;

import F4.h;
import J7.j;
import K4.f;
import N9.AbstractC0342z;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.kcstream.cing.R;
import com.kcstream.cing.model.NewRelease;
import kotlin.Metadata;
import oa.b;
import p140o4.r;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/drawer/NewReleaseActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NewReleaseActivity extends f {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f10239X = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public r f10240V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public NewRelease f10241W;

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_newrelease, (ViewGroup) null, false);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
        int i10 = R.id.pb_progress;
        ProgressBar progressBar = (ProgressBar) b.c(viewInflate, R.id.pb_progress);
        if (progressBar != null) {
            i10 = R.id.rv_comingsoon;
            RecyclerView recyclerView = (RecyclerView) b.c(viewInflate, R.id.rv_comingsoon);
            if (recyclerView != null) {
                i10 = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) b.c(viewInflate, R.id.toolbar);
                if (materialToolbar != null) {
                    this.f10240V = new r(coordinatorLayout, progressBar, recyclerView, materialToolbar);
                    setContentView((CoordinatorLayout) z().f13782t);
                    v((MaterialToolbar) z().f13785w);
                    j jVarL = l();
                    if (jVarL != null) {
                        jVarL.H(true);
                        jVarL.R("Jadwal Hentai");
                    }
                    ((ProgressBar) z().f13783u).setVisibility(0);
                    ((RecyclerView) z().f13784v).setVisibility(8);
                    AbstractC0342z.n(this, null, new h(this, null), 3);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.f(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            j().a();
        }
        return true;
    }

    public final r z() {
        r rVar = this.f10240V;
        if (rVar != null) {
            return rVar;
        }
        i.n("binding");
        throw null;
    }
}
