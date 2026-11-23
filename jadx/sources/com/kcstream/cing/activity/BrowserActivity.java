package com.kcstream.cing.activity;

import A1.C0099h;
import E4.C0196j;
import E4.C0197k;
import Ha.a;
import J7.j;
import K4.f;
import L9.n;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.BrowserActivity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.Metadata;
import oa.b;
import p210v8.i;
import za.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/BrowserActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BrowserActivity extends f {
    public static final /* synthetic */ int c0 = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Bundle f10172V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public WebView f10173W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C0099h f10174X;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public File f10177a0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f10175Y = "1";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final StringBuilder f10176Z = new StringBuilder();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f10178b0 = "about:blank";

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) throws IOException {
        File file;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_browser, (ViewGroup) null, false);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
        int i10 = R.id.toolbar;
        MaterialToolbar materialToolbar = (MaterialToolbar) b.c(viewInflate, R.id.toolbar);
        if (materialToolbar != null) {
            i10 = R.id.webView;
            WebView webView = (WebView) b.c(viewInflate, R.id.webView);
            if (webView != null) {
                this.f10174X = new C0099h(coordinatorLayout, materialToolbar, webView, 10);
                View viewInflate2 = getLayoutInflater().inflate(R.layout.dialog_activity_browser_askexternal, (ViewGroup) null, false);
                int i11 = R.id.bt_goto_external_browser;
                if (((MaterialButton) b.c(viewInflate2, R.id.bt_goto_external_browser)) != null) {
                    i11 = R.id.bt_stay_in_app_browser;
                    if (((MaterialButton) b.c(viewInflate2, R.id.bt_stay_in_app_browser)) != null) {
                        i11 = R.id.tv_open_external_browser;
                        if (((MaterialTextView) b.c(viewInflate2, R.id.tv_open_external_browser)) != null) {
                            C0099h c0099h = this.f10174X;
                            if (c0099h == null) {
                                i.n("binding");
                                throw null;
                            }
                            setContentView((CoordinatorLayout) c0099h.f103t);
                            C0099h c0099h2 = this.f10174X;
                            if (c0099h2 == null) {
                                i.n("binding");
                                throw null;
                            }
                            v((MaterialToolbar) c0099h2.f104u);
                            j jVarL = l();
                            i.c(jVarL);
                            jVarL.K(R.drawable.ic_rounded_close);
                            jVarL.H(true);
                            jVarL.R("");
                            Bundle extras = getIntent().getExtras();
                            i.c(extras);
                            this.f10172V = extras;
                            C0099h c0099h3 = this.f10174X;
                            if (c0099h3 == null) {
                                i.n("binding");
                                throw null;
                            }
                            this.f10173W = (WebView) c0099h3.f105v;
                            if (extras.getString("link") != null) {
                                try {
                                    this.f10178b0 = "it";
                                    CookieManager.getInstance().setAcceptThirdPartyCookies(z(), true);
                                    WebView webViewZ = z();
                                    webViewZ.loadUrl("");
                                    webViewZ.setWebViewClient(new C0197k(this));
                                    webViewZ.setWebChromeClient(new C0196j(this));
                                    webViewZ.setDownloadListener(new DownloadListener() { // from class: E4.h
                                        @Override // android.webkit.DownloadListener
                                        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                                            int i12 = BrowserActivity.c0;
                                            BrowserActivity browserActivity = this.a;
                                            if (str != null) {
                                                Bundle bundle2 = browserActivity.f10172V;
                                                if (bundle2 == null) {
                                                    p210v8.i.n("pushed");
                                                    throw null;
                                                }
                                                p210v8.i.c(str4);
                                                new K4.m(browserActivity, browserActivity, bundle2, str3, str, str2, j, str4).execute(str);
                                            }
                                        }
                                    });
                                    WebSettings settings = webViewZ.getSettings();
                                    settings.setJavaScriptEnabled(true);
                                    settings.setDomStorageEnabled(true);
                                    settings.setSupportMultipleWindows(true);
                                    settings.setJavaScriptCanOpenWindowsAutomatically(true);
                                    String userAgentString = settings.getUserAgentString();
                                    i.c(userAgentString);
                                    settings.setUserAgentString(n.G(userAgentString, "; wv", ""));
                                } catch (Exception unused) {
                                }
                            }
                            File file2 = new File(getCacheDir(), "adFile");
                            this.f10177a0 = file2;
                            String str = this.f10175Y;
                            c cVar = a.a;
                            file2.exists();
                            cVar.getClass();
                            c.k(new Object[0]);
                            File file3 = this.f10177a0;
                            if (file3 == null || !file3.exists() || (file = this.f10177a0) == null) {
                                return;
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                            while (true) {
                                try {
                                    try {
                                        try {
                                            String line = bufferedReader.readLine();
                                            i.c(line);
                                            boolean zEquals = str.equals("0");
                                            StringBuilder sb = this.f10176Z;
                                            if (zEquals) {
                                                sb.append(line);
                                                sb.append("\n");
                                            }
                                            if (str.equals("1")) {
                                                sb.append(":::::" + line);
                                                sb.append("\n");
                                            }
                                        } catch (Throwable th) {
                                            bufferedReader.close();
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            com.bumptech.glide.c.c(bufferedReader, th2);
                                            throw th3;
                                        }
                                    }
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                    bufferedReader.close();
                                    bufferedReader.close();
                                    return;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i11)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i.f(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_activity_browser, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // p078i.AbstractActivityC0655l, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        i.f(keyEvent, "event");
        if (i10 == 4) {
            if (z().canGoBack()) {
                z().goBack();
                return true;
            }
            finish();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.f(menuItem, "item");
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            case R.id.action_open_in_browser /* 2131361863 */:
                if (!n.I(this.f10178b0, "http://", false)) {
                    n.I(this.f10178b0, "https://", false);
                }
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f10178b0)));
                break;
            case R.id.action_refresh /* 2131361864 */:
                z().reload();
                break;
        }
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        return true;
    }

    public final WebView z() {
        WebView webView = this.f10173W;
        if (webView != null) {
            return webView;
        }
        i.n("webView");
        throw null;
    }
}
