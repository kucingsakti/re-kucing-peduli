package U7;

import J7.j;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AtomicReference implements J7.h, L7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final J7.i f4909s;

    public b(J7.i iVar) {
        this.f4909s = iVar;
    }

    public final void a(Throwable th) {
        L7.b bVar;
        Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
        Object obj = get();
        O7.b bVar2 = O7.b.f3608s;
        if (obj == bVar2 || (bVar = (L7.b) getAndSet(bVar2)) == bVar2) {
            j.y(th);
            return;
        }
        try {
            this.f4909s.onError(nullPointerException);
        } finally {
            if (bVar != null) {
                bVar.f();
            }
        }
    }

    @Override // L7.b
    public final void f() {
        O7.b.g(this);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return b.class.getSimpleName() + "{" + super.toString() + "}";
    }
}
