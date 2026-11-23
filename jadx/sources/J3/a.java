package J3;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ThreadFactory f2366w = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicLong f2367s = new AtomicLong();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f2368t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f2369u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f2370v;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f2368t = str;
        this.f2369u = i10;
        this.f2370v = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f2366w.newThread(new D4.a(this, 4, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f2368t + " Thread #" + this.f2367s.getAndIncrement());
        return threadNewThread;
    }
}
