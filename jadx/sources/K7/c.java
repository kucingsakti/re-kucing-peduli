package K7;

import J7.m;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c extends m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f2618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f2619t;

    public c(Handler handler) {
        this.f2618s = handler;
    }

    @Override // J7.m
    public final L7.b a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        boolean z6 = this.f2619t;
        O7.c cVar = O7.c.f3610s;
        if (z6) {
            return cVar;
        }
        Handler handler = this.f2618s;
        d dVar = new d(handler, runnable);
        Message messageObtain = Message.obtain(handler, dVar);
        messageObtain.obj = this;
        this.f2618s.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        if (!this.f2619t) {
            return dVar;
        }
        this.f2618s.removeCallbacks(dVar);
        return cVar;
    }

    @Override // L7.b
    public final void f() {
        this.f2619t = true;
        this.f2618s.removeCallbacksAndMessages(this);
    }
}
