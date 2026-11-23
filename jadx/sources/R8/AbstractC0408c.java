package R8;

import C8.InterfaceC0175c;
import F8.InterfaceC0211e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: R8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0408c {
    public static final List a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f4462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f4463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f4464d;

    static {
        int i10 = 0;
        p210v8.v vVar = p210v8.u.a;
        List listC = p086i8.l.C(vVar.b(Boolean.TYPE), vVar.b(Byte.TYPE), vVar.b(Character.TYPE), vVar.b(Double.TYPE), vVar.b(Float.TYPE), vVar.b(Integer.TYPE), vVar.b(Long.TYPE), vVar.b(Short.TYPE));
        a = listC;
        List<InterfaceC0175c> list = listC;
        ArrayList arrayList = new ArrayList(p086i8.m.H(list, 10));
        for (InterfaceC0175c interfaceC0175c : list) {
            arrayList.add(new p076h8.f(p068ga.d.p(interfaceC0175c), p068ga.d.q(interfaceC0175c)));
        }
        f4462b = p086i8.y.z(arrayList);
        List<InterfaceC0175c> list2 = a;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(list2, 10));
        for (InterfaceC0175c interfaceC0175c2 : list2) {
            arrayList2.add(new p076h8.f(p068ga.d.q(interfaceC0175c2), p068ga.d.p(interfaceC0175c2)));
        }
        f4463c = p086i8.y.z(arrayList2);
        List listC2 = p086i8.l.C(p200u8.a.class, p200u8.b.class, p200u8.c.class, p200u8.d.class, p200u8.e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class);
        ArrayList arrayList3 = new ArrayList(p086i8.m.H(listC2, 10));
        for (Object obj : listC2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p086i8.l.G();
                throw null;
            }
            arrayList3.add(new p076h8.f((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f4464d = p086i8.y.z(arrayList3);
    }

    public static final p096j9.b a(Class cls) {
        p096j9.b bVarA;
        p210v8.i.f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return (declaringClass == null || (bVarA = a(declaringClass)) == null) ? p096j9.b.j(new p096j9.c(cls.getName())) : bVarA.d(p096j9.f.j(cls.getSimpleName()));
        }
        p096j9.c cVar = new p096j9.c(cls.getName());
        return new p096j9.b(cVar.e(), p096j9.c.j(cVar.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        p210v8.i.f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return L9.n.F(cls.getName(), '.', '/');
            }
            return "L" + L9.n.F(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List c(Type type) {
        p210v8.i.f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return p086i8.s.f12328s;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return K9.n.B(new K9.i(K9.n.x(type, C0407b.f4457t), C0407b.f4458u, K9.s.f2706A));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        p210v8.i.e(actualTypeArguments, "actualTypeArguments");
        return p086i8.i.H(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        p210v8.i.f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        p210v8.i.e(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }
}
