package F8;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends t0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p210v8.k f1628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile Object f1629u = null;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(p200u8.a aVar) {
        this.f1628t = (p210v8.k) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [u8.a, v8.k] */
    public final Object invoke() {
        Object obj = this.f1629u;
        Object obj2 = t0.f1632s;
        if (obj != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f1628t.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f1629u = obj2;
        return objInvoke;
    }
}
