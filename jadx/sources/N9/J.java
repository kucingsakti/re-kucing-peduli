package N9;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class J implements K {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ScheduledFuture f3416s;

    public J(ScheduledFuture scheduledFuture) {
        this.f3416s = scheduledFuture;
    }

    @Override // N9.K
    public final void f() {
        this.f3416s.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f3416s + ']';
    }
}
