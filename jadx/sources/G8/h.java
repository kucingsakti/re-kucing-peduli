package G8;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Field field, Object obj) {
        super(field, false);
        p210v8.i.f(field, "field");
        this.f1731e = obj;
    }

    @Override // G8.k, G8.e
    public final Object v(Object[] objArr) {
        p210v8.i.f(objArr, "args");
        C3.a.b(this, objArr);
        return ((Field) this.a).get(this.f1731e);
    }
}
