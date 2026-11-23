package K7;

import J7.j;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable, L7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f2620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f2621t;

    public d(Handler handler, Runnable runnable) {
        this.f2620s = handler;
        this.f2621t = runnable;
    }

    @Override // L7.b
    public final void f() {
        this.f2620s.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2621t.run();
        } catch (Throwable th) {
            j.y(th);
        }
    }
}
