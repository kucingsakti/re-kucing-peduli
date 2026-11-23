package U4;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {
    private Object obj;

    public h(Object obj) {
        this.obj = obj;
    }

    @Override // U4.e
    public Object resolve(b bVar) {
        i.f(bVar, "provider");
        return this.obj;
    }
}
