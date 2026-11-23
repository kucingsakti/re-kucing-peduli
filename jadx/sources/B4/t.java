package B4;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import com.download.library.DownloadImpl;
import com.download.library.ResourceRequest;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t implements DownloadListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Handler f709f = new Handler(Looper.getMainLooper());
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f710b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f713e;

    public t(Activity activity, WebView webView) {
        this.f711c = null;
        Context applicationContext = activity.getApplicationContext();
        this.a = applicationContext;
        this.f711c = new WeakReference(activity);
        this.f712d = new WeakReference(AbstractC0158f.c(webView));
        try {
            DownloadImpl.getInstance(applicationContext);
            this.f713e = true;
        } catch (Throwable unused) {
            String str = AbstractC0162j.a;
            this.f713e = false;
        }
    }

    public static void e(ResourceRequest resourceRequest) {
        resourceRequest.enqueue(new C0170s());
    }

    public final ResourceRequest a(String str) {
        return DownloadImpl.getInstance(this.a).with(str).setEnableIndicator(true).autoOpenIgnoreMD5();
    }

    public final void b(String str) {
        ((ResourceRequest) this.f710b.get(str)).setForceDownload(true);
        d(str);
    }

    public final boolean c(String str) {
        ResourceRequest resourceRequest = (ResourceRequest) this.f710b.get(str);
        if (resourceRequest != null) {
            return resourceRequest.getDownloadTask().isForceDownload();
        }
        return false;
    }

    public final void d(String str) {
        Context context = this.a;
        try {
            DownloadImpl.getInstance(context).exist(str);
            String str2 = AbstractC0162j.a;
            if (!DownloadImpl.getInstance(context).exist(str)) {
                ResourceRequest resourceRequest = (ResourceRequest) this.f710b.get(str);
                resourceRequest.addHeader("Cookie", CookieManager.getInstance() == null ? null : CookieManager.getInstance().getCookie(str));
                e(resourceRequest);
            } else {
                WeakReference weakReference = this.f712d;
                if (weakReference.get() != null) {
                    ((AbstractC0153a) weakReference.get()).l(((Activity) this.f711c.get()).getString(R.string.agentweb_download_task_has_been_exist));
                }
            }
        } catch (Throwable unused) {
            String str3 = AbstractC0162j.a;
        }
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        if (this.f713e) {
            f709f.post(new C3.c(this, str, str2, str3, str4, j));
        } else {
            String str5 = AbstractC0162j.a;
        }
    }
}
