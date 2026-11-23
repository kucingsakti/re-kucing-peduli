package p076h8;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d, Serializable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11793u = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "t");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile k f11794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile Object f11795t;

    /* JADX WARN: Type inference failed for: r0v1, types: [u8.a, v8.k] */
    @Override // p076h8.d
    public final Object getValue() {
        Object obj = this.f11795t;
        l lVar = l.a;
        if (obj != lVar) {
            return obj;
        }
        ?? r10 = this.f11794s;
        if (r10 != 0) {
            Object objInvoke = r10.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11793u;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != lVar) {
                }
            }
            this.f11794s = null;
            return objInvoke;
        }
        return this.f11795t;
    }

    public final String toString() {
        return this.f11795t != l.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
