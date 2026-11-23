package com.kcstream.cing.activity;

import A1.C0099h;
import Ca.b;
import G4.e;
import J7.j;
import K4.f;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.kcstream.cing.R;
import com.kcstream.cing.model.All;
import com.kcstream.cing.model.AllListResult;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import kotlin.Metadata;
import o1.m;
import p086i8.C;
import p086i8.k;
import p188t1.G;
import p210v8.i;
import p210v8.u;
import p210v8.v;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/RecentCategoryActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RecentCategoryActivity extends f {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public m f10202V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public All f10203W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public b f10204X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f10205Y = new ArrayList();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f10206Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Bundle f10207a0;

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_category_list, (ViewGroup) null, false);
        int i10 = R.id.adView;
        RelativeLayout relativeLayout = (RelativeLayout) oa.b.c(viewInflate, R.id.adView);
        if (relativeLayout != null) {
            i10 = R.id.cv_series_ads;
            if (((LinearLayout) oa.b.c(viewInflate, R.id.cv_series_ads)) != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                int i11 = R.id.rv_item;
                RecyclerView recyclerView = (RecyclerView) oa.b.c(viewInflate, R.id.rv_item);
                if (recyclerView != null) {
                    i11 = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) oa.b.c(viewInflate, R.id.toolbar);
                    if (materialToolbar != null) {
                        this.f10202V = new m(coordinatorLayout, relativeLayout, recyclerView, materialToolbar);
                        this.f10207a0 = getIntent().getExtras();
                        m mVar = this.f10202V;
                        if (mVar == null) {
                            i.n("binding");
                            throw null;
                        }
                        setContentView((CoordinatorLayout) mVar.f13641s);
                        m mVar2 = this.f10202V;
                        if (mVar2 == null) {
                            i.n("binding");
                            throw null;
                        }
                        v((MaterialToolbar) mVar2.f13644v);
                        j jVarL = l();
                        if (jVarL != null) {
                            Bundle bundle2 = this.f10207a0;
                            jVarL.R(bundle2 != null ? bundle2.getString(MediationMetaData.KEY_NAME) : null);
                            jVarL.H(true);
                        }
                        ArrayList arrayListT0 = this.f10205Y;
                        i.g(arrayListT0, "items");
                        if (!C.q(arrayListT0)) {
                            arrayListT0 = k.t0(arrayListT0);
                        }
                        G g8 = new G(new b(x.b(arrayListT0)));
                        v vVar = u.a;
                        g8.x(vVar.b(AllListResult.class), vVar.b(e.class));
                        m mVar3 = this.f10202V;
                        if (mVar3 == null) {
                            i.n("binding");
                            throw null;
                        }
                        b bVar = (b) g8.r((RecyclerView) mVar3.f13643u);
                        bVar.f1023l = true;
                        bVar.f1024m = new A0.m(this, 6);
                        bVar.f1025n = R.layout.layout_load_more;
                        this.f10204X = bVar;
                        C0099h c0099h = new C0099h(16);
                        m mVar4 = this.f10202V;
                        if (mVar4 != null) {
                            c0099h.l(this, (RelativeLayout) mVar4.f13642t, this.f2592R);
                            return;
                        } else {
                            i.n("binding");
                            throw null;
                        }
                    }
                }
                i10 = i11;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        j().a();
        return true;
    }
}
