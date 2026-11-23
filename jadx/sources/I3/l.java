package I3;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p073h4.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2040c = new Object();
    public volatile Object a = f2040c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile p073h4.b f2041b;

    public l(p073h4.b bVar) {
        this.f2041b = bVar;
    }

    @Override // p073h4.b
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = f2040c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.a;
                if (obj == obj3) {
                    obj = this.f2041b.get();
                    this.a = obj;
                    this.f2041b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
