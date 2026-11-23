package G8;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class l extends o implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1733g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Field field, boolean z6, Object obj) {
        super(field, z6, false);
        p210v8.i.f(field, "field");
        this.f1733g = obj;
    }

    @Override // G8.o, G8.e
    public final Object v(Object[] objArr) throws IllegalAccessException {
        p210v8.i.f(objArr, "args");
        a(objArr);
        ((Field) this.a).set(this.f1733g, p086i8.i.v(objArr));
        return p076h8.m.a;
    }
}
