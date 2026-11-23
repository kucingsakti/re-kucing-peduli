package U7;

import J7.k;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class e implements J7.i, L7.b, k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicReference f4914t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public L7.b f4915u;

    /* JADX WARN: Multi-variable type inference failed */
    public e(J7.b bVar, int i10) {
        this.f4913s = i10;
        switch (i10) {
            case 1:
                this.f4914t = (AtomicReference) bVar;
                break;
            default:
                this.f4914t = (AtomicReference) bVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [J7.b, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v3, types: [J7.b, java.util.concurrent.atomic.AtomicReference] */
    @Override // J7.i
    public final void a() {
        switch (this.f4913s) {
            case 0:
                this.f4915u = O7.b.f3608s;
                this.f4914t.a();
                break;
            default:
                this.f4914t.a();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [J7.b, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r2v2, types: [J7.b, java.util.concurrent.atomic.AtomicReference] */
    @Override // J7.i
    public final void b(L7.b bVar) {
        switch (this.f4913s) {
            case 0:
                if (O7.b.k(this.f4915u, bVar)) {
                    this.f4915u = bVar;
                    this.f4914t.b(this);
                }
                break;
            default:
                this.f4915u = bVar;
                this.f4914t.b(this);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [J7.b, java.util.concurrent.atomic.AtomicReference] */
    @Override // J7.i
    public void c(Object obj) {
        this.f4915u = O7.b.f3608s;
        this.f4914t.a();
    }

    @Override // L7.b
    public final void f() {
        switch (this.f4913s) {
            case 0:
                this.f4915u.f();
                this.f4915u = O7.b.f3608s;
                break;
            default:
                this.f4915u.f();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [J7.b, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v3, types: [J7.b, java.util.concurrent.atomic.AtomicReference] */
    @Override // J7.i
    public final void onError(Throwable th) {
        switch (this.f4913s) {
            case 0:
                this.f4915u = O7.b.f3608s;
                this.f4914t.onError(th);
                break;
            default:
                this.f4914t.onError(th);
                break;
        }
    }

    @Override // J7.k
    public void d(Object obj) {
    }
}
