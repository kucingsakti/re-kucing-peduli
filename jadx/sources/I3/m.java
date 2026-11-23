package I3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m implements p073h4.b {
    public volatile Set a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f2042b;

    public final synchronized void a() {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.f2042b.add(((p073h4.b) it.next()).get());
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p073h4.b
    public final Object get() {
        if (this.f2042b == null) {
            synchronized (this) {
                try {
                    if (this.f2042b == null) {
                        this.f2042b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableSet(this.f2042b);
    }
}
