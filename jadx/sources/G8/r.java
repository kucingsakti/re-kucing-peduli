package G8;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r extends o implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1738g;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(Method method, Object obj) {
        p210v8.i.f(method, "method");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        p210v8.i.e(genericParameterTypes, "method.genericParameterTypes");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : p086i8.i.s(1, genericParameterTypes.length, genericParameterTypes)));
        this.f1738g = obj;
    }

    @Override // G8.o, G8.e
    public final Object v(Object[] objArr) {
        p210v8.i.f(objArr, "args");
        C3.a.b(this, objArr);
        Ea.a aVar = new Ea.a(2);
        aVar.a(this.f1738g);
        aVar.b(objArr);
        ArrayList arrayList = aVar.a;
        return c(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
