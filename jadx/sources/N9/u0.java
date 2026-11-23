package N9;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends S9.r implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f3486w;

    public u0(long j, p144o8.c cVar) {
        super(cVar, cVar.getContext());
        this.f3486w = j;
    }

    @Override // N9.k0
    public final String H() {
        return super.H() + "(timeMillis=" + this.f3486w + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0342z.i(this.f3436u);
        k(new TimeoutCancellationException("Timed out waiting for " + this.f3486w + " ms", this));
    }
}
