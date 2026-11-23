package G8;

import F8.p0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InvocationHandler {
    public final Class a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p076h8.j f1724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p076h8.j f1725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f1726e;

    public b(Class cls, Map map, p076h8.j jVar, p076h8.j jVar2, List list) {
        this.a = cls;
        this.f1723b = map;
        this.f1724c = jVar;
        this.f1725d = jVar2;
        this.f1726e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zA;
        boolean z6;
        Class cls = this.a;
        p210v8.i.f(cls, "$annotationClass");
        Map map = this.f1723b;
        p076h8.j jVar = this.f1724c;
        p076h8.j jVar2 = this.f1725d;
        List list = this.f1726e;
        p210v8.i.f(list, "$methods");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) jVar2.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) jVar.getValue();
            }
        }
        boolean z10 = false;
        if (!p210v8.i.a(name, "equals") || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(p086i8.i.H(objArr));
            sb.append(')');
            throw new p0(sb.toString(), 0);
        }
        Object objC = p086i8.i.C(objArr);
        Annotation annotation = objC instanceof Annotation ? (Annotation) objC : null;
        if (p210v8.i.a(annotation != null ? p068ga.d.o(p068ga.d.l(annotation)) : null, cls)) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = true;
                        break;
                    }
                    Method method2 = (Method) it.next();
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objC, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zA = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zA = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zA = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zA = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zA = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zA = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zA = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zA = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zA = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zA = p210v8.i.a(obj2, objInvoke);
                    }
                    if (!zA) {
                        z6 = false;
                        break;
                    }
                }
            } else {
                z6 = true;
                break;
            }
            if (z6) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
