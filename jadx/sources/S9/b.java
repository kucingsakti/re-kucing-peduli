package S9;

import O3.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends o {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.a;

    @Override // S9.o
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        y yVar = a.a;
        if (obj2 == yVar) {
            y yVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == yVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, yVarC)) {
                    if (atomicReferenceFieldUpdater.get(this) != yVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = yVarC;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract y c(Object obj);
}
