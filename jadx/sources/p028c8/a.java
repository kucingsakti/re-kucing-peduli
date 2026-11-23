package p028c8;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference {
    public final boolean a(Throwable th) {
        b bVar = c.a;
        while (true) {
            Throwable th2 = (Throwable) get();
            if (th2 == c.a) {
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            while (!compareAndSet(th2, compositeException)) {
                if (get() != th2) {
                }
            }
            return true;
        }
    }
}
