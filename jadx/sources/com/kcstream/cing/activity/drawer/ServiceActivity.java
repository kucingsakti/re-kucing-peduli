package com.kcstream.cing.activity.drawer;

import I4.d;
import J7.j;
import K4.f;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import kotlin.Metadata;
import oa.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/drawer/ServiceActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ServiceActivity extends f {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public d f10242V;

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_service, (ViewGroup) null, false);
        int i10 = R.id.bt_disqus_login;
        if (((Button) b.c(viewInflate, R.id.bt_disqus_login)) != null) {
            i10 = R.id.iv_disqus;
            if (((ImageView) b.c(viewInflate, R.id.iv_disqus)) != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                int i11 = R.id.toolbar;
                Toolbar toolbar = (Toolbar) b.c(viewInflate, R.id.toolbar);
                if (toolbar != null) {
                    i11 = R.id.tx_connected_service;
                    if (((MaterialTextView) b.c(viewInflate, R.id.tx_connected_service)) != null) {
                        this.f10242V = new d(coordinatorLayout, toolbar);
                        setContentView(coordinatorLayout);
                        d dVar = this.f10242V;
                        if (dVar == null) {
                            i.n("binding");
                            throw null;
                        }
                        v(dVar.f2097s);
                        j jVarL = l();
                        i.c(jVarL);
                        jVarL.R("Service");
                        jVarL.H(true);
                        return;
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
