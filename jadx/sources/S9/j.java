package S9;

import N9.AbstractC0342z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4566s = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4567t = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4568u = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public final j d() {
        j jVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4567t;
            j jVar2 = (j) atomicReferenceFieldUpdater2.get(this);
            jVar = jVar2;
            while (true) {
                j jVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f4566s;
                    obj = atomicReferenceFieldUpdater.get(jVar);
                    if (obj == this) {
                        if (jVar2 != jVar) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, jVar2, jVar)) {
                                if (atomicReferenceFieldUpdater2.get(this) != jVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (l()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof o) {
                        ((o) obj).a(jVar);
                        break;
                    }
                    if (!(obj instanceof p)) {
                        p210v8.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        jVar3 = jVar;
                        jVar = (j) obj;
                    } else {
                        if (jVar3 != null) {
                            break;
                        }
                        jVar = (j) atomicReferenceFieldUpdater2.get(jVar);
                    }
                }
                j jVar4 = ((p) obj).a;
                while (!atomicReferenceFieldUpdater.compareAndSet(jVar3, jVar, jVar4)) {
                    if (atomicReferenceFieldUpdater.get(jVar3) != jVar) {
                        break;
                    }
                }
                jVar = jVar3;
            }
        }
        return jVar;
    }

    public final void i(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4567t;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (j() != jVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                    if (l()) {
                        jVar.d();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(jVar) == jVar2);
        }
    }

    public final Object j() {
        while (true) {
            Object obj = f4566s.get(this);
            if (!(obj instanceof o)) {
                return obj;
            }
            ((o) obj).a(this);
        }
    }

    public final j k() {
        j jVar;
        Object objJ = j();
        p pVar = objJ instanceof p ? (p) objJ : null;
        if (pVar != null && (jVar = pVar.a) != null) {
            return jVar;
        }
        p210v8.i.d(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (j) objJ;
    }

    public boolean l() {
        return j() instanceof p;
    }

    public String toString() {
        return new i(this, AbstractC0342z.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0342z.j(this);
    }
}
