package ya;

import X9.C0457c;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class r extends X9.O {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final X9.O f16223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ma.r f16224u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public IOException f16225v;

    public r(X9.O o10) {
        this.f16223t = o10;
        this.f16224u = p068ga.d.d(new C0457c(this, o10.c()));
    }

    @Override // X9.O
    public final long a() {
        return this.f16223t.a();
    }

    @Override // X9.O
    public final X9.A b() {
        return this.f16223t.b();
    }

    @Override // X9.O
    public final ma.h c() {
        return this.f16224u;
    }

    @Override // X9.O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16223t.close();
    }
}
