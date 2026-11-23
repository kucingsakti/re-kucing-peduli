package da;

import B4.C0157e;
import ma.l;
import ma.q;
import ma.v;
import ma.y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f10586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10587t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0157e f10588u;

    public e(C0157e c0157e) {
        i.f(c0157e, "this$0");
        this.f10588u = c0157e;
        this.f10586s = new l(((q) c0157e.f669f).f13209s.e());
    }

    @Override // ma.v
    public final void C(ma.f fVar, long j) {
        i.f(fVar, "source");
        if (this.f10587t) {
            throw new IllegalStateException("closed");
        }
        Y9.c.c(fVar.f13190t, 0L, j);
        ((q) this.f10588u.f669f).C(fVar, j);
    }

    @Override // ma.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10587t) {
            return;
        }
        this.f10587t = true;
        C0157e c0157e = this.f10588u;
        c0157e.getClass();
        l lVar = this.f10586s;
        y yVar = lVar.f13197e;
        lVar.f13197e = y.f13225d;
        yVar.a();
        yVar.b();
        c0157e.f666c = 3;
    }

    @Override // ma.v
    public final y e() {
        return this.f10586s;
    }

    @Override // ma.v, java.io.Flushable
    public final void flush() {
        if (this.f10587t) {
            return;
        }
        ((q) this.f10588u.f669f).flush();
    }
}
