package U4;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {
    private final p200u8.b create;
    private Object obj;

    public f(p200u8.b bVar) {
        i.f(bVar, "create");
        this.create = bVar;
    }

    @Override // U4.e
    public Object resolve(b bVar) {
        i.f(bVar, "provider");
        Object obj = this.obj;
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.create.invoke(bVar);
        this.obj = objInvoke;
        return objInvoke;
    }
}
