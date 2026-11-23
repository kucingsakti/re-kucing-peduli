package ma;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f13225d = new x();
    public boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13227c;

    public y a() {
        this.a = false;
        return this;
    }

    public y b() {
        this.f13227c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.f13226b;
        }
        throw new IllegalStateException("No deadline");
    }

    public y d(long j) {
        this.a = true;
        this.f13226b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.f13226b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        p210v8.i.f(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(p210v8.i.k(Long.valueOf(j), "timeout < 0: ").toString());
        }
        this.f13227c = timeUnit.toNanos(j);
        return this;
    }
}
