package Q9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class u extends R9.c {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_state");
    private volatile Object _state;

    @Override // R9.c
    public final boolean a(R9.a aVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, q.f4399b);
        return true;
    }

    @Override // R9.c
    public final p123m8.d[] b(R9.a aVar) {
        a.set(this, null);
        return R9.b.a;
    }
}
