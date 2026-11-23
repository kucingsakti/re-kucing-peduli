package da;

import B4.C0157e;
import ma.l;
import ma.q;
import ma.v;
import ma.y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f10577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10578t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0157e f10579u;

    public b(C0157e c0157e) {
        i.f(c0157e, "this$0");
        this.f10579u = c0157e;
        this.f10577s = new l(((q) c0157e.f669f).f13209s.e());
    }

    @Override // ma.v
    public final void C(ma.f fVar, long j) {
        i.f(fVar, "source");
        if (this.f10578t) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        C0157e c0157e = this.f10579u;
        q qVar = (q) c0157e.f669f;
        if (qVar.f13211u) {
            throw new IllegalStateException("closed");
        }
        qVar.f13210t.f0(j);
        qVar.a();
        q qVar2 = (q) c0157e.f669f;
        qVar2.Q("\r\n");
        qVar2.C(fVar, j);
        qVar2.Q("\r\n");
    }

    @Override // ma.v, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f10578t) {
            return;
        }
        this.f10578t = true;
        ((q) this.f10579u.f669f).Q("0\r\n\r\n");
        C0157e c0157e = this.f10579u;
        l lVar = this.f10577s;
        c0157e.getClass();
        y yVar = lVar.f13197e;
        lVar.f13197e = y.f13225d;
        yVar.a();
        yVar.b();
        this.f10579u.f666c = 3;
    }

    @Override // ma.v
    public final y e() {
        return this.f10577s;
    }

    @Override // ma.v, java.io.Flushable
    public final synchronized void flush() {
        if (this.f10578t) {
            return;
        }
        ((q) this.f10579u.f669f).flush();
    }
}
