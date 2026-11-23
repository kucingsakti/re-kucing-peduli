package D1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f1034s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f1035t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d f1036u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f1037v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicInteger f1038w;

    public c(b bVar, String str, boolean z6) {
        d dVar = d.a;
        this.f1038w = new AtomicInteger();
        this.f1034s = bVar;
        this.f1035t = str;
        this.f1036u = dVar;
        this.f1037v = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        C3.c cVar = new C3.c(this, runnable, 4, false);
        this.f1034s.getClass();
        a aVar = new a(cVar);
        aVar.setName("glide-" + this.f1035t + "-thread-" + this.f1038w.getAndIncrement());
        return aVar;
    }
}
