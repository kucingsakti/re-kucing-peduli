package p155q;

import android.os.Looper;
import oa.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f14244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G0.b f14245e = new G0.b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f14246c = new c();

    public static a r() {
        if (f14244d != null) {
            return f14244d;
        }
        synchronized (a.class) {
            try {
                if (f14244d == null) {
                    f14244d = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14244d;
    }

    public final void s(Runnable runnable) {
        c cVar = this.f14246c;
        if (cVar.f14250e == null) {
            synchronized (cVar.f14248c) {
                try {
                    if (cVar.f14250e == null) {
                        cVar.f14250e = c.r(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        cVar.f14250e.post(runnable);
    }
}
