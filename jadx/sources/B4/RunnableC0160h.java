package B4;

import android.os.Trace;
import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: B4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0160h implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f690s;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f690s) {
            case 0:
                CookieManager.getInstance().flush();
                return;
            case 1:
                return;
            case 2:
                for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(Z7.n.f5900d.keySet())) {
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        Z7.n.f5900d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            default:
                try {
                    int i10 = Q.m.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (p106l0.g.f12850k != null) {
                        p106l0.g.a().c();
                        break;
                    }
                    return;
                } finally {
                    int i11 = Q.m.a;
                    Trace.endSection();
                }
        }
    }

    public String toString() {
        switch (this.f690s) {
            case 1:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }

    private final void a() {
    }
}
