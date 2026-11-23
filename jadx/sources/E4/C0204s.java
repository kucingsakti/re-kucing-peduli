package E4;

import A1.C0099h;
import android.os.Message;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebView;
import com.kcstream.cing.activity.ItemActivity;

/* JADX INFO: renamed from: E4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0204s extends B4.J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0204s(Object obj, int i10) {
        super(0);
        this.f1437b = i10;
        this.f1438c = obj;
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z6, boolean z10, Message message) {
        switch (this.f1437b) {
            case 0:
                WebView webView2 = new WebView((ItemActivity) this.f1438c);
                webView2.getSettings().setJavaScriptEnabled(true);
                webView2.getSettings().setSupportMultipleWindows(true);
                if (webView != null) {
                    webView.addView(webView2);
                }
                webView2.setVisibility(8);
                p210v8.i.c(message);
                Object obj = message.obj;
                p210v8.i.d(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
                ((WebView.WebViewTransport) obj).setWebView(webView2);
                message.sendToTarget();
                webView2.setWebViewClient(new r(0));
                return false;
            default:
                return super.onCreateWindow(webView, z6, z10, message);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f1437b) {
            case 0:
                p210v8.i.f(jsResult, "result");
                jsResult.cancel();
                break;
            default:
                p210v8.i.f(jsResult, "result");
                jsResult.cancel();
                break;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f1437b) {
            case 0:
                p210v8.i.f(jsResult, "result");
                jsResult.cancel();
                break;
            default:
                p210v8.i.f(jsResult, "result");
                jsResult.cancel();
                break;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        switch (this.f1437b) {
            case 0:
                p210v8.i.f(jsPromptResult, "result");
                jsPromptResult.cancel();
                break;
            default:
                p210v8.i.f(jsPromptResult, "result");
                jsPromptResult.cancel();
                break;
        }
        return true;
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        String url;
        switch (this.f1437b) {
            case 1:
                if (webView != null && (url = webView.getUrl()) != null) {
                    ((C0099h) this.f1438c).f105v = url;
                    break;
                }
                break;
            default:
                super.onReceivedTitle(webView, str);
                break;
        }
    }
}
