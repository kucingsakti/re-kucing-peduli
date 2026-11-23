package B4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.alipay.sdk.app.PayTask;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class D extends H {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f613l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WebView f619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f621i;
    public HashSet j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashSet f622k;

    static {
        boolean z6;
        try {
            Class.forName("com.alipay.sdk.app.PayTask");
            z6 = true;
        } catch (Throwable unused) {
            z6 = false;
        }
        f613l = z6;
        String str = AbstractC0162j.a;
    }

    public final boolean a(String str) {
        int i10 = this.f616d;
        if (i10 != 250) {
            if (i10 != 1001) {
                return false;
            }
            d(str);
            return true;
        }
        WeakReference weakReference = this.f614b;
        Activity activity = (Activity) weakReference.get();
        if (activity == null) {
            return false;
        }
        ResolveInfo resolveInfoResolveActivity = null;
        try {
            Activity activity2 = (Activity) weakReference.get();
            if (activity2 != null) {
                resolveInfoResolveActivity = activity2.getPackageManager().resolveActivity(Intent.parseUri(str, 1), 65536);
            }
        } catch (Throwable unused) {
            String str2 = AbstractC0162j.a;
        }
        if (resolveInfoResolveActivity == null) {
            return false;
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        String str3 = activityInfo.packageName;
        activity.getPackageName();
        String str4 = AbstractC0162j.a;
        if (!TextUtils.isEmpty(activityInfo.packageName) && activityInfo.packageName.equals(activity.getPackageName())) {
            return d(str);
        }
        WeakReference weakReference2 = this.f618f;
        if (weakReference2.get() != null) {
            AbstractC0153a abstractC0153a = (AbstractC0153a) weakReference2.get();
            WebView webView = this.f619g;
            String url = webView.getUrl();
            r rVar = this.f620h;
            if (rVar == null) {
                rVar = new r(this, str, 1);
                this.f620h = rVar;
            }
            abstractC0153a.h(webView, url, rVar);
        }
        return true;
    }

    public final boolean b(String str) {
        if (!str.startsWith("tel:") && !str.startsWith("sms:") && !str.startsWith("mailto:") && !str.startsWith("geo:0,0?q=")) {
            return false;
        }
        try {
            Activity activity = (Activity) this.f614b.get();
            if (activity == null) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            String str2 = AbstractC0162j.a;
            return true;
        }
    }

    public final boolean c(String str) {
        try {
            Activity activity = (Activity) this.f614b.get();
            if (activity == null) {
                return false;
            }
            if (this.f621i == null) {
                this.f621i = Class.forName("com.alipay.sdk.app.PayTask").getConstructor(Activity.class).newInstance(activity);
            }
            boolean zPayInterceptorWithUrl = ((PayTask) this.f621i).payInterceptorWithUrl(str, true, new C());
            if (zPayInterceptorWithUrl) {
                String str2 = AbstractC0162j.a;
            }
            return zPayInterceptorWithUrl;
        } catch (Throwable unused) {
            String str3 = AbstractC0162j.a;
            return false;
        }
    }

    public final boolean d(String str) {
        try {
            Activity activity = (Activity) this.f614b.get();
            if (activity == null) {
                return true;
            }
            PackageManager packageManager = activity.getPackageManager();
            Intent uri = Intent.parseUri(str, 1);
            if (packageManager.resolveActivity(uri, 65536) == null) {
                return false;
            }
            activity.startActivity(uri);
            return true;
        } catch (Throwable unused) {
            String str2 = AbstractC0162j.a;
            return false;
        }
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z6) {
        HashSet hashSet = this.f622k;
        if (!hashSet.contains(str)) {
            hashSet.add(str);
        }
        super.doUpdateVisitedHistory(webView, str, z6);
    }

    public final int e(String str) {
        WeakReference weakReference = this.f614b;
        try {
            if (weakReference.get() == null) {
                return 0;
            }
            List<ResolveInfo> listQueryIntentActivities = ((Activity) weakReference.get()).getPackageManager().queryIntentActivities(Intent.parseUri(str, 1), 65536);
            if (listQueryIntentActivities == null) {
                return 0;
            }
            return listQueryIntentActivities.size();
        } catch (URISyntaxException unused) {
            String str2 = AbstractC0162j.a;
            return 0;
        }
    }

    public final void f(String str) {
        WeakReference weakReference = this.f614b;
        try {
            if (weakReference.get() == null) {
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            ((Activity) weakReference.get()).startActivity(intent);
        } catch (Exception unused) {
            String str2 = AbstractC0162j.a;
        }
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        HashSet hashSet = this.j;
        boolean zContains = hashSet.contains(str);
        HashSet hashSet2 = this.f622k;
        if (zContains || !hashSet2.contains(str)) {
            webView.setVisibility(0);
        } else {
            WeakReference weakReference = this.f618f;
            if (weakReference.get() != null) {
                ((AbstractC0153a) weakReference.get()).k();
            }
        }
        if (hashSet2.contains(str)) {
            hashSet2.remove(str);
        }
        if (!hashSet.isEmpty()) {
            hashSet.clear();
        }
        super.onPageFinished(webView, str);
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        HashSet hashSet = this.f622k;
        if (!hashSet.contains(str)) {
            hashSet.add(str);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        String str3 = AbstractC0162j.a;
        if ((str2 != null || i10 == -12) && i10 != -1) {
            if (i10 == -2 || str2 == null || str2.equals(webView.getUrl()) || str2.equals(webView.getOriginalUrl())) {
                this.j.add(str2);
                WeakReference weakReference = this.f618f;
                if (weakReference.get() != null) {
                    ((AbstractC0153a) weakReference.get()).g(webView, i10, str, str2);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WeakReference weakReference = this.f618f;
        if (weakReference.get() != null) {
            ((AbstractC0153a) weakReference.get()).m(webView, sslErrorHandler, sslError);
        }
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        String str = AbstractC0162j.a;
        if (f11 - f10 > 7.0f) {
            webView.setInitialScale((int) ((f10 / f11) * 100.0f));
        }
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        boolean zStartsWith = string.startsWith("http://");
        boolean z6 = this.f615c;
        if (zStartsWith || string.startsWith("https://")) {
            if (!z6 || !f613l || !c(string)) {
                return false;
            }
        } else {
            if (!z6) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            if (!b(string)) {
                if (!string.startsWith("intent://")) {
                    if (string.startsWith("weixin://wap/pay?")) {
                        String str = AbstractC0162j.a;
                        f(string);
                        return true;
                    }
                    if (string.startsWith("alipays://") && d(string)) {
                        String str2 = AbstractC0162j.a;
                        return true;
                    }
                    if (e(string) > 0 && a(string)) {
                        String str3 = AbstractC0162j.a;
                        return true;
                    }
                    if (!this.f617e) {
                        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                    }
                    Objects.toString(webResourceRequest.getUrl());
                    String str4 = AbstractC0162j.a;
                    return true;
                }
                try {
                    if (!TextUtils.isEmpty(string) && string.startsWith("intent://")) {
                        d(string);
                    }
                } catch (Throwable unused) {
                    String str5 = AbstractC0162j.a;
                }
                String str6 = AbstractC0162j.a;
            }
        }
        return true;
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String string = webResourceRequest.getUrl().toString();
        int errorCode = webResourceError.getErrorCode();
        if (webResourceRequest.isForMainFrame()) {
            if ((string != null || errorCode == -12) && errorCode != -1) {
                Objects.toString(webResourceError.getDescription());
                webResourceError.getErrorCode();
                webView.getUrl();
                webView.getOriginalUrl();
                String str = AbstractC0162j.a;
                if (errorCode == -2 || string == null || string.equals(webView.getUrl()) || string.equals(webView.getOriginalUrl())) {
                    int errorCode2 = webResourceError.getErrorCode();
                    String string2 = webResourceError.getDescription().toString();
                    String string3 = webResourceRequest.getUrl().toString();
                    this.j.add(string3);
                    WeakReference weakReference = this.f618f;
                    if (weakReference.get() != null) {
                        ((AbstractC0153a) weakReference.get()).g(webView, errorCode2, string2, string3);
                    }
                }
            }
        }
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean zStartsWith = str.startsWith("http://");
        boolean z6 = this.f615c;
        if (zStartsWith || str.startsWith("https://")) {
            if (!z6 || !f613l || !c(str)) {
                return false;
            }
        } else {
            if (!z6) {
                return false;
            }
            if (!b(str)) {
                if (str.startsWith("intent://")) {
                    try {
                        if (!TextUtils.isEmpty(str) && str.startsWith("intent://")) {
                            d(str);
                            return true;
                        }
                    } catch (Throwable unused) {
                        String str2 = AbstractC0162j.a;
                    }
                } else {
                    if (str.startsWith("weixin://wap/pay?")) {
                        f(str);
                        return true;
                    }
                    if (!str.startsWith("alipays://") || !d(str)) {
                        if (e(str) > 0 && a(str)) {
                            String str3 = AbstractC0162j.a;
                            return true;
                        }
                        if (this.f617e) {
                            String str4 = AbstractC0162j.a;
                            return true;
                        }
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                }
            }
        }
        return true;
    }
}
