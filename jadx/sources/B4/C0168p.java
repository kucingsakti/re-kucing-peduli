package B4;

import android.R;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: B4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0168p extends G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0157e f698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GeolocationPermissions.Callback f701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public A1.r f703i;
    public p040e1.j j;

    @Override // B4.G, android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        super.onConsoleMessage(consoleMessage);
        return true;
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
        quotaUpdater.updateQuota(j11 * 2);
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Activity activity = (Activity) this.f696b.get();
        if (activity == null) {
            callback.invoke(str, false, false);
            return;
        }
        List listD = AbstractC0158f.d(activity, AbstractC0158f.a);
        if (listD.isEmpty()) {
            String str2 = AbstractC0162j.a;
            callback.invoke(str, true, false);
            return;
        }
        String[] strArr = (String[]) listD.toArray(new String[0]);
        C0154b c0154b = new C0154b();
        c0154b.f661c = new ArrayList();
        c0154b.a = 1;
        c0154b.f661c = new ArrayList(Arrays.asList(strArr));
        c0154b.f660b = 96;
        c0154b.f662d = this.j;
        this.f701g = callback;
        this.f700f = str;
        C0156d.h0(activity, c0154b);
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public final void onHideCustomView() {
        View view;
        C0157e c0157e = this.f698d;
        if (c0157e == null || ((View) c0157e.f669f) == null) {
            return;
        }
        Activity activity = (Activity) c0157e.f665b;
        if (activity != null) {
            activity.setRequestedOrientation(c0157e.f666c);
        }
        HashSet<T.b> hashSet = (HashSet) c0157e.f668e;
        if (!hashSet.isEmpty()) {
            for (T.b bVar : hashSet) {
                activity.getWindow().setFlags(((Integer) bVar.f4584b).intValue(), ((Integer) bVar.a).intValue());
            }
            hashSet.clear();
        }
        ((View) c0157e.f669f).setVisibility(8);
        FrameLayout frameLayout = (FrameLayout) c0157e.f670g;
        if (frameLayout != null && (view = (View) c0157e.f669f) != null) {
            frameLayout.removeView(view);
        }
        FrameLayout frameLayout2 = (FrameLayout) c0157e.f670g;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) c0157e.f671h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        c0157e.f669f = null;
        WebView webView = (WebView) c0157e.f667d;
        if (webView != null) {
            webView.setVisibility(0);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        WeakReference weakReference = this.f702h;
        if (weakReference.get() != null) {
            ((AbstractC0153a) weakReference.get()).d(webView, str, str2);
        }
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        WeakReference weakReference = this.f702h;
        if (weakReference.get() == null) {
            return true;
        }
        ((AbstractC0153a) weakReference.get()).e(webView, str, str2, jsResult);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        WeakReference weakReference = this.f702h;
        try {
            if (weakReference.get() == null) {
                return true;
            }
            ((AbstractC0153a) weakReference.get()).f(this.f699e, str, str2, str3, jsPromptResult);
            return true;
        } catch (Exception unused) {
            String str4 = AbstractC0162j.a;
            return true;
        }
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (permissionRequest == null) {
            return;
        }
        String[] resources = permissionRequest.getResources();
        if (resources == null || resources.length <= 0) {
            permissionRequest.deny();
            return;
        }
        HashSet hashSet = new HashSet(Arrays.asList(resources));
        ArrayList arrayList = new ArrayList(hashSet.size());
        if (hashSet.contains("android.webkit.resource.VIDEO_CAPTURE")) {
            arrayList.add("android.permission.CAMERA");
        }
        if (hashSet.contains("android.webkit.resource.AUDIO_CAPTURE")) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        WeakReference weakReference = this.f702h;
        if (weakReference.get() != null) {
            ((AbstractC0153a) weakReference.get()).i(permissionRequest);
        }
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        A1.r rVar = this.f703i;
        if (rVar != null) {
            if (i10 == 0) {
                M m2 = (M) rVar.f167t;
                if (m2 != null) {
                    m2.f636A = 0.0f;
                    AnimatorSet animatorSet = m2.f642u;
                    if (animatorSet == null || !animatorSet.isStarted()) {
                        return;
                    }
                    m2.f642u.cancel();
                    return;
                }
                return;
            }
            if (i10 > 0 && i10 <= 10) {
                M m10 = (M) rVar.f167t;
                if (m10 == null || m10.getVisibility() != 8) {
                    return;
                }
                m10.setVisibility(0);
                m10.f636A = 0.0f;
                m10.a(false);
                return;
            }
            if (i10 > 10 && i10 < 95) {
                M m11 = (M) rVar.f167t;
                if (m11 != null) {
                    m11.setProgress(i10);
                    return;
                }
                return;
            }
            M m12 = (M) rVar.f167t;
            if (m12 != null) {
                m12.setProgress(i10);
            }
            M m13 = (M) rVar.f167t;
            if (m13 != null) {
                m13.f647z = 2;
            }
        }
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        if (this.f697c) {
            super.onReceivedTitle(webView, str);
        }
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity;
        C0157e c0157e = this.f698d;
        if (c0157e == null || (activity = (Activity) c0157e.f665b) == null || activity.isFinishing()) {
            return;
        }
        c0157e.f666c = activity.getRequestedOrientation();
        activity.setRequestedOrientation(0);
        Window window = activity.getWindow();
        int i10 = window.getAttributes().flags & 128;
        HashSet hashSet = (HashSet) c0157e.f668e;
        if (i10 == 0) {
            T.b bVar = new T.b(128, 0);
            window.setFlags(128, 128);
            hashSet.add(bVar);
        }
        if ((window.getAttributes().flags & 16777216) == 0) {
            T.b bVar2 = new T.b(16777216, 0);
            window.setFlags(16777216, 16777216);
            hashSet.add(bVar2);
        }
        if (((View) c0157e.f669f) != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        WebView webView = (WebView) c0157e.f667d;
        if (webView != null) {
            webView.setVisibility(8);
        }
        if (((FrameLayout) c0157e.f670g) == null) {
            FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
            FrameLayout frameLayout2 = new FrameLayout(activity);
            c0157e.f670g = frameLayout2;
            frameLayout2.setBackgroundColor(-16777216);
            frameLayout.addView((FrameLayout) c0157e.f670g);
        }
        c0157e.f671h = customViewCallback;
        FrameLayout frameLayout3 = (FrameLayout) c0157e.f670g;
        c0157e.f669f = view;
        frameLayout3.addView(view);
        ((FrameLayout) c0157e.f670g).setVisibility(0);
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Activity activity;
        String str = AbstractC0162j.a;
        if (valueCallback == null || (activity = (Activity) this.f696b.get()) == null || activity.isFinishing()) {
            return false;
        }
        return AbstractC0158f.f(activity, this.f699e, valueCallback, fileChooserParams, null, null);
    }
}
