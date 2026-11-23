package K9;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l {
    public final AtomicReference a;

    public a(l lVar) {
        this.a = new AtomicReference(lVar);
    }

    @Override // K9.l
    public final Iterator iterator() {
        l lVar = (l) this.a.getAndSet(null);
        if (lVar != null) {
            return lVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
