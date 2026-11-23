package F8;

import R8.AbstractC0408c;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: F8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0218l extends t0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f1598t;

    public C0218l(Field field) {
        p210v8.i.f(field, "field");
        this.f1598t = field;
    }

    @Override // F8.t0
    public final String d() {
        StringBuilder sb = new StringBuilder();
        Field field = this.f1598t;
        String name = field.getName();
        p210v8.i.e(name, "field.name");
        sb.append(U8.w.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        p210v8.i.e(type, "field.type");
        sb.append(AbstractC0408c.b(type));
        return sb.toString();
    }
}
