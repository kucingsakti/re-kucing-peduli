package com.kcstream.cing.activity.drawer;

import A1.C0099h;
import J7.j;
import K4.f;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import java.util.ArrayList;
import kotlin.Metadata;
import oa.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/drawer/AboutActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AboutActivity extends f {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0099h f10236V;

    public AboutActivity() {
        new ArrayList();
    }

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_about, (ViewGroup) null, false);
        int i10 = R.id.iv_logo;
        ImageView imageView = (ImageView) b.c(viewInflate, R.id.iv_logo);
        if (imageView != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
            int i11 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) b.c(viewInflate, R.id.toolbar);
            if (toolbar != null) {
                i11 = R.id.tv_buildnum;
                MaterialTextView materialTextView = (MaterialTextView) b.c(viewInflate, R.id.tv_buildnum);
                if (materialTextView != null) {
                    i11 = R.id.tv_nekopoi;
                    if (((MaterialTextView) b.c(viewInflate, R.id.tv_nekopoi)) != null) {
                        this.f10236V = new C0099h(coordinatorLayout, imageView, toolbar, materialTextView);
                        setContentView(coordinatorLayout);
                        C0099h c0099h = this.f10236V;
                        if (c0099h == null) {
                            i.n("binding");
                            throw null;
                        }
                        v((Toolbar) c0099h.f104u);
                        j jVarL = l();
                        i.c(jVarL);
                        jVarL.R("Tentang");
                        jVarL.H(true);
                        C0099h c0099h2 = this.f10236V;
                        if (c0099h2 == null) {
                            i.n("binding");
                            throw null;
                        }
                        ((MaterialTextView) c0099h2.f105v).setText("2.5.3-build01");
                        D3.b.t((ImageView) c0099h2.f103t, Integer.valueOf(R.mipmap.ic_launcher_round));
                        return;
                    }
                }
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        onBackPressed();
        return true;
    }
}
