package com.kcstream.cing.activity.drawer;

import K4.f;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.kcstream.cing.R;
import kotlin.Metadata;
import oa.b;
import p040e1.j;
import p156q0.C0742a;
import p156q0.M;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/drawer/SettingsActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SettingsActivity extends f {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public j f10243V;

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_settings, (ViewGroup) null, false);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
        int i10 = R.id.settings_fragment;
        if (((FrameLayout) b.c(viewInflate, R.id.settings_fragment)) != null) {
            MaterialToolbar materialToolbar = (MaterialToolbar) b.c(viewInflate, R.id.toolbar);
            if (materialToolbar != null) {
                this.f10243V = new j(13, materialToolbar, coordinatorLayout);
                setContentView(coordinatorLayout);
                j jVar = this.f10243V;
                if (jVar == null) {
                    i.n("binding");
                    throw null;
                }
                v((MaterialToolbar) jVar.f10697t);
                J7.j jVarL = l();
                i.c(jVarL);
                jVarL.H(true);
                M m2 = m();
                m2.getClass();
                C0742a c0742a = new C0742a(m2);
                c0742a.m(R.id.settings_fragment, new F4.f(), null);
                c0742a.f();
                return;
            }
            i10 = R.id.toolbar;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
