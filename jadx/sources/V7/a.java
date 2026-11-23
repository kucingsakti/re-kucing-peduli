package V7;

import J7.j;
import J7.p;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference implements p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f5188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile Object f5189t;

    public a(b bVar) {
        this.f5188s = bVar;
    }

    @Override // J7.p
    public final void b(L7.b bVar) {
        O7.b.j(this, bVar);
    }

    @Override // J7.p
    public final void c(Object obj) {
        this.f5189t = obj;
        this.f5188s.g();
    }

    @Override // J7.p
    public final void onError(Throwable th) {
        b bVar = this.f5188s;
        AtomicReference atomicReference = bVar.f5196w;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                j.y(th);
            }
        }
        if (bVar.f5194u.a(th)) {
            bVar.f5197x.cancel();
            bVar.e();
            bVar.g();
            return;
        }
        j.y(th);
    }
}
