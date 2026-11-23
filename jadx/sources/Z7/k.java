package Z7;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f5887t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f5888u;

    public k(String str) {
        this(str, false, 5);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f5886s + '-' + incrementAndGet();
        Thread aVar = this.f5888u ? new D1.a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f5887t);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return E0.a.l(new StringBuilder("RxThreadFactory["), this.f5886s, "]");
    }

    public k(String str, boolean z6, int i10) {
        this.f5886s = str;
        this.f5887t = i10;
        this.f5888u = z6;
    }
}
