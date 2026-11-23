package N9;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: N9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0320c extends AbstractC0317a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Thread f3441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final T f3442w;

    public C0320c(p123m8.i iVar, Thread thread, T t7) {
        super(iVar, true);
        this.f3441v = thread;
        this.f3442w = t7;
    }

    @Override // N9.k0
    public final void d(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f3441v;
        if (p210v8.i.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
