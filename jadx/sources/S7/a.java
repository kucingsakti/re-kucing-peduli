package S7;

import K7.e;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference implements J7.b, L7.b, Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicReference f4542s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f4543t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Throwable f4544u;

    /* JADX WARN: Multi-variable type inference failed */
    public a(J7.b bVar, e eVar) {
        this.f4542s = (AtomicReference) bVar;
        this.f4543t = eVar;
    }

    @Override // J7.b, J7.k
    public final void a() {
        O7.b.i(this, this.f4543t.b(this));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [J7.b, java.util.concurrent.atomic.AtomicReference] */
    @Override // J7.b, J7.k
    public final void b(L7.b bVar) {
        if (O7.b.j(this, bVar)) {
            this.f4542s.b(this);
        }
    }

    @Override // L7.b
    public final void f() {
        O7.b.g(this);
    }

    @Override // J7.b, J7.k
    public final void onError(Throwable th) {
        this.f4544u = th;
        O7.b.i(this, this.f4543t.b(this));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J7.b, java.util.concurrent.atomic.AtomicReference] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.f4544u;
        ?? r10 = this.f4542s;
        if (th == null) {
            r10.a();
        } else {
            this.f4544u = null;
            r10.onError(th);
        }
    }
}
