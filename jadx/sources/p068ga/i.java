package p068ga;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InvocationHandler {
    public final ArrayList a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11598c;

    public i(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        p210v8.i.f(obj, "proxy");
        p210v8.i.f(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (p210v8.i.a(name, "supports") && p210v8.i.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (p210v8.i.a(name, "unsupported") && p210v8.i.a(Void.TYPE, returnType)) {
            this.f11597b = true;
            return null;
        }
        boolean zA = p210v8.i.a(name, "protocols");
        ArrayList arrayList = this.a;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((p210v8.i.a(name, "selectProtocol") || p210v8.i.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        Object obj3 = list.get(i10);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) obj3;
                        if (arrayList.contains(str)) {
                            this.f11598c = str;
                            return str;
                        }
                        if (i10 != size) {
                            i10 = i11;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f11598c = str2;
                return str2;
            }
        }
        if ((!p210v8.i.a(name, "protocolSelected") && !p210v8.i.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        if (obj4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f11598c = (String) obj4;
        return null;
    }
}
