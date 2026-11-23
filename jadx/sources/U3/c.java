package U3;

import Fa.e;
import O3.B;
import O3.C0344b;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o1.k;
import p051f2.d;
import p051f2.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final double a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f4897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f4901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f4902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f4903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f4904i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4905k;

    public c(e eVar, V3.a aVar, k kVar) {
        double d3 = aVar.f5169d;
        long j = ((long) aVar.f5171f) * 1000;
        this.a = d3;
        this.f4897b = aVar.f5170e;
        this.f4898c = j;
        this.f4903h = eVar;
        this.f4904i = kVar;
        this.f4899d = SystemClock.elapsedRealtime();
        int i10 = (int) d3;
        this.f4900e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4901f = arrayBlockingQueue;
        this.f4902g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.f4905k = 0L;
    }

    public final int a() {
        if (this.f4905k == 0) {
            this.f4905k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f4905k) / this.f4898c);
        int iMin = this.f4901f.size() == this.f4900e ? Math.min(100, this.j + iCurrentTimeMillis) : Math.max(0, this.j - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.f4905k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final C0344b c0344b, final TaskCompletionSource taskCompletionSource) {
        Log.isLoggable("FirebaseCrashlytics", 3);
        final boolean z6 = SystemClock.elapsedRealtime() - this.f4899d < 2000;
        this.f4903h.y(new p051f2.a(c0344b.a, d.f11426u, null), new g() { // from class: U3.b
            @Override // p051f2.g
            public final void a(Exception exc) throws Throwable {
                c cVar = this.f4893s;
                cVar.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.c(exc);
                    return;
                }
                if (z6) {
                    boolean z10 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new D4.a(cVar, 7, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = B.a;
                    boolean z11 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z10) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                nanos = jNanoTime - System.nanoTime();
                                z11 = true;
                            }
                        }
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z11;
                    }
                }
                taskCompletionSource2.d(c0344b);
            }
        });
    }
}
