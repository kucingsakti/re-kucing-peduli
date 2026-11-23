package p050f1;

import C3.d;
import N9.e0;
import e2.b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p157q1.a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p157q1.k f11415s = new p157q1.k();

    public k(e0 e0Var) {
        e0Var.C(false, true, new b(this, 1));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f11415s.cancel(z6);
    }

    @Override // C3.d
    public final void f(Runnable runnable, Executor executor) {
        this.f11415s.f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f11415s.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11415s.f14401s instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11415s.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f11415s.get(j, timeUnit);
    }
}
