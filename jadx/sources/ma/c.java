package ma;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class c extends y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f13182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f13183i;
    public static c j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f13185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13186g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f13182h = millis;
        f13183i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        c cVar;
        long j10 = this.f13227c;
        boolean z6 = this.a;
        if (j10 != 0 || z6) {
            synchronized (c.class) {
                try {
                    if (this.f13184e) {
                        throw new IllegalStateException("Unbalanced enter/exit");
                    }
                    this.f13184e = true;
                    if (j == null) {
                        j = new c();
                        D1.a aVar = new D1.a("Okio Watchdog");
                        aVar.setDaemon(true);
                        aVar.start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j10 != 0 && z6) {
                        this.f13186g = Math.min(j10, c() - jNanoTime) + jNanoTime;
                    } else if (j10 != 0) {
                        this.f13186g = j10 + jNanoTime;
                    } else {
                        if (!z6) {
                            throw new AssertionError();
                        }
                        this.f13186g = c();
                    }
                    long j11 = this.f13186g - jNanoTime;
                    c cVar2 = j;
                    p210v8.i.c(cVar2);
                    while (true) {
                        cVar = cVar2.f13185f;
                        if (cVar == null || j11 < cVar.f13186g - jNanoTime) {
                            break;
                            break;
                        }
                        cVar2 = cVar;
                    }
                    this.f13185f = cVar;
                    cVar2.f13185f = this;
                    if (cVar2 == j) {
                        c.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean i() {
        synchronized (c.class) {
            if (!this.f13184e) {
                return false;
            }
            this.f13184e = false;
            c cVar = j;
            while (cVar != null) {
                c cVar2 = cVar.f13185f;
                if (cVar2 == this) {
                    cVar.f13185f = this.f13185f;
                    this.f13185f = null;
                    return false;
                }
                cVar = cVar2;
            }
            return true;
        }
    }

    public void j() {
    }
}
