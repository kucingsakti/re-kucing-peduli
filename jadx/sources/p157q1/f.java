package p157q1;

import C3.d;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f14393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f14394t;

    public f(k kVar, d dVar) {
        this.f14393s = kVar;
        this.f14394t = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14393s.f14401s != this) {
            return;
        }
        if (i.f14399x.g(this.f14393s, this, i.e(this.f14394t))) {
            i.b(this.f14393s);
        }
    }
}
