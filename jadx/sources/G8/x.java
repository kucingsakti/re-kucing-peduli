package G8;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class x implements e {
    public final Method a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f1747c;

    public x(Method method, List list) {
        this.a = method;
        this.f1746b = list;
        Class<?> returnType = method.getReturnType();
        p210v8.i.e(returnType, "unboxMethod.returnType");
        this.f1747c = returnType;
    }

    @Override // G8.e
    public final Type w() {
        return this.f1747c;
    }

    @Override // G8.e
    public final List x() {
        return this.f1746b;
    }

    @Override // G8.e
    public final /* bridge */ /* synthetic */ Member y() {
        return null;
    }
}
