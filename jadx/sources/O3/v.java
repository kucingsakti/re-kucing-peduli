package O3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class v implements ThreadFactory {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f3586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f3587t;

    public v(String str, AtomicLong atomicLong) {
        this.f3586s = str;
        this.f3587t = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new u(runnable));
        threadNewThread.setName(this.f3586s + this.f3587t.getAndIncrement());
        return threadNewThread;
    }
}
