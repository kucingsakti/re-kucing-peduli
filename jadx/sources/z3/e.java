package z3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f16306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile transient boolean f16307t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public transient Object f16308u;

    public e(d dVar) {
        this.f16306s = dVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (!this.f16307t) {
            synchronized (this) {
                try {
                    if (!this.f16307t) {
                        Object obj = this.f16306s.get();
                        this.f16308u = obj;
                        this.f16307t = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f16308u;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f16307t) {
            obj = "<supplier that returned " + this.f16308u + ">";
        } else {
            obj = this.f16306s;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
