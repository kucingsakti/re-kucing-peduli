package z3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f16309u = new f();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile d f16310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f16311t;

    @Override // java.util.function.Supplier
    public final Object get() {
        d dVar = this.f16310s;
        f fVar = f16309u;
        if (dVar != fVar) {
            synchronized (this) {
                try {
                    if (this.f16310s != fVar) {
                        Object obj = this.f16310s.get();
                        this.f16311t = obj;
                        this.f16310s = fVar;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f16311t;
    }

    public final String toString() {
        Object obj = this.f16310s;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f16309u) {
            obj = "<supplier that returned " + this.f16311t + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
