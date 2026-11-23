package G8;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends t {
    /* JADX WARN: Illegal instructions before constructor call */
    public k(Field field, boolean z6) {
        Type genericType = field.getGenericType();
        p210v8.i.e(genericType, "field.genericType");
        super(field, genericType, z6 ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // G8.e
    public Object v(Object[] objArr) {
        p210v8.i.f(objArr, "args");
        a(objArr);
        return ((Field) this.a).get(this.f1741c != null ? p086i8.i.v(objArr) : null);
    }
}
