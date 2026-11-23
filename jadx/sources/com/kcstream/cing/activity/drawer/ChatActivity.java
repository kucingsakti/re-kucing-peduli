package com.kcstream.cing.activity.drawer;

import A1.C0099h;
import A1.J;
import B4.AbstractC0158f;
import B4.C0157e;
import B4.C0159g;
import B4.F;
import D3.b;
import J7.j;
import K4.f;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.kcstream.cing.R;
import kotlin.Metadata;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/drawer/ChatActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChatActivity extends f {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0099h f10237V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0159g f10238W;

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0099h c0099hI = C0099h.i(getLayoutInflater());
        this.f10237V = c0099hI;
        setContentView((CoordinatorLayout) c0099hI.f103t);
        C0099h c0099h = this.f10237V;
        if (c0099h == null) {
            i.n("binding");
            throw null;
        }
        v((MaterialToolbar) c0099h.f104u);
        j jVarL = l();
        i.c(jVarL);
        jVarL.R("Chat");
        jVarL.H(true);
        C0157e c0157eA = C0159g.a(this);
        C0099h c0099h2 = this.f10237V;
        if (c0099h2 == null) {
            i.n("binding");
            throw null;
        }
        J jH = c0157eA.m((RelativeLayout) c0099h2.f105v, new LinearLayout.LayoutParams(-1, -1)).K(b.m(this, R.attr.colorPrimaryDark)).H();
        jH.j();
        C0159g c0159gH = jH.h("https://hentaipoi.chatango.com/");
        this.f10238W = c0159gH;
        WebSettings webSettings = (WebSettings) c0159gH.f675c.f577s;
        webSettings.setSupportMultipleWindows(true);
        webSettings.setJavaScriptEnabled(true);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        j().a();
        C0159g c0159g = this.f10238W;
        if (c0159g == null) {
            i.n("agentWeb");
            throw null;
        }
        WebView webView = c0159g.f674b.f627f;
        Activity activity = c0159g.a;
        if (webView != null) {
            AbstractC0158f.b(activity, webView);
        } else {
            try {
                AbstractC0158f.b(activity, new F(activity.getApplicationContext()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        C0159g c0159g2 = this.f10238W;
        if (c0159g2 != null) {
            c0159g2.f683l.I();
            return true;
        }
        i.n("agentWeb");
        throw null;
    }
}
