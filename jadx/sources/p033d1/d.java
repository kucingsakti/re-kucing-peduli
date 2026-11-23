package p033d1;

import android.content.pm.PackageInfo;
import android.net.Uri;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.a;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p040e1.j;
import p040e1.l;
import p040e1.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final /* synthetic */ int a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (!l.f10699b.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        WebViewProviderBoundaryInterface webViewProviderBoundaryInterfaceM = m.a.m(webView);
        String[] strArr = (String[]) set.toArray(new String[0]);
        j jVar = new j(0, false);
        jVar.f10697t = aVar;
        webViewProviderBoundaryInterfaceM.addWebMessageListener(str, strArr, new oa.a(jVar));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }
}
