package E4;

import android.os.Message;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.kcstream.cing.activity.BrowserActivity;

/* JADX INFO: renamed from: E4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0196j extends WebChromeClient {
    public final /* synthetic */ BrowserActivity a;

    public C0196j(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z6, boolean z10, Message message) {
        WebView webView2 = new WebView(this.a);
        WebSettings settings = webView2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setAllowContentAccess(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (webView != null) {
            webView.addView(webView2);
        }
        webView2.setVisibility(8);
        p210v8.i.c(message);
        Object obj = message.obj;
        p210v8.i.d(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
        ((WebView.WebViewTransport) obj).setWebView(webView2);
        message.sendToTarget();
        webView2.setWebViewClient(new C0195i());
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        p210v8.i.f(jsResult, "result");
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        p210v8.i.f(jsResult, "result");
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        p210v8.i.f(jsPromptResult, "result");
        jsPromptResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        if (webView != null) {
            webView.getUrl();
        }
        this.a.getClass();
    }
}
