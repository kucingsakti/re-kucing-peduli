package B4;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: renamed from: B4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0164l {
    public WeakReference a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f694b;

    @JavascriptInterface
    public void uploadFile() {
        uploadFile("*/*");
    }

    @JavascriptInterface
    public void uploadFile(String str) {
        WeakReference weakReference = this.f694b;
        Objects.toString(weakReference.get());
        WeakReference weakReference2 = this.a;
        Objects.toString(weakReference2.get());
        String str2 = AbstractC0162j.a;
        if (weakReference.get() == null || weakReference2.get() == null) {
            return;
        }
        Activity activity = (Activity) weakReference.get();
        WebView webView = ((C0159g) weakReference2.get()).f674b.f627f;
        ((C0159g) weakReference2.get()).getClass();
        AbstractC0158f.f(activity, webView, null, null, str, new C0163k(this, 0));
    }
}
