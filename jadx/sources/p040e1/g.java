package p040e1;

import com.unity3d.services.core.webview.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class g implements n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f10695s = new String[0];

    @Override // p040e1.n
    public final String[] d() {
        return f10695s;
    }

    @Override // p040e1.n
    public final WebViewProviderBoundaryInterface m(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
