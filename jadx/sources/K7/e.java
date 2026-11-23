package K7;

import J7.m;
import J7.n;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n {
    public final Handler a;

    public e(Handler handler) {
        this.a = handler;
    }

    @Override // J7.n
    public final m a() {
        return new c(this.a);
    }

    @Override // J7.n
    public final L7.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.a;
        d dVar = new d(handler, runnable);
        handler.sendMessageDelayed(Message.obtain(handler, dVar), timeUnit.toMillis(j));
        return dVar;
    }
}
