package k2;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Provider {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f12684u = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile b f12685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile Object f12686t;

    public static Provider a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f12686t = f12684u;
        aVar.f12685s = bVar;
        return aVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.f12686t;
        Object obj3 = f12684u;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f12686t;
                if (obj == obj3) {
                    obj = this.f12685s.get();
                    Object obj4 = this.f12686t;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f12686t = obj;
                    this.f12685s = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
