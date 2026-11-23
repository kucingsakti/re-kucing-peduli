package I3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements p042e4.c, p042e4.b {
    public final HashMap a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f2038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J3.k f2039c;

    public k() {
        J3.k kVar = J3.k.f2402s;
        this.a = new HashMap();
        this.f2038b = new ArrayDeque();
        this.f2039c = kVar;
    }

    public final synchronized void a(Executor executor, p042e4.a aVar) {
        try {
            executor.getClass();
            if (!this.a.containsKey(D3.b.class)) {
                this.a.put(D3.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(D3.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
