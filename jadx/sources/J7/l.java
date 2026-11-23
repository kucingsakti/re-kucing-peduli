package J7;

/* JADX INFO: loaded from: classes.dex */
public final class l implements L7.b, Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f2438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f2439t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Thread f2440u;

    public l(Runnable runnable, m mVar) {
        this.f2438s = runnable;
        this.f2439t = mVar;
    }

    @Override // L7.b
    public final void f() {
        if (this.f2440u == Thread.currentThread()) {
            m mVar = this.f2439t;
            if (mVar instanceof Z7.j) {
                Z7.j jVar = (Z7.j) mVar;
                if (jVar.f5885t) {
                    return;
                }
                jVar.f5885t = true;
                jVar.f5884s.shutdown();
                return;
            }
        }
        this.f2439t.f();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2440u = Thread.currentThread();
        try {
            this.f2438s.run();
        } finally {
            f();
            this.f2440u = null;
        }
    }
}
