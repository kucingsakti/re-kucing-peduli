package ma;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class l extends y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f13197e;

    public l(y yVar) {
        p210v8.i.f(yVar, "delegate");
        this.f13197e = yVar;
    }

    @Override // ma.y
    public final y a() {
        return this.f13197e.a();
    }

    @Override // ma.y
    public final y b() {
        return this.f13197e.b();
    }

    @Override // ma.y
    public final long c() {
        return this.f13197e.c();
    }

    @Override // ma.y
    public final y d(long j) {
        return this.f13197e.d(j);
    }

    @Override // ma.y
    public final boolean e() {
        return this.f13197e.e();
    }

    @Override // ma.y
    public final void f() throws InterruptedIOException {
        this.f13197e.f();
    }

    @Override // ma.y
    public final y g(long j) {
        p210v8.i.f(TimeUnit.MILLISECONDS, "unit");
        return this.f13197e.g(j);
    }
}
