package p231y;

import C3.d;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k implements d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WeakReference f15828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f15829t = new j(this);

    public k(i iVar) {
        this.f15828s = new WeakReference(iVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        i iVar = (i) this.f15828s.get();
        boolean zCancel = this.f15829t.cancel(z6);
        if (zCancel && iVar != null) {
            iVar.a = null;
            iVar.f15824b = null;
            iVar.f15825c.o(null);
        }
        return zCancel;
    }

    @Override // C3.d
    public final void f(Runnable runnable, Executor executor) {
        this.f15829t.f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15829t.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15829t.f15821s instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15829t.isDone();
    }

    public final String toString() {
        return this.f15829t.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f15829t.get(j, timeUnit);
    }
}
