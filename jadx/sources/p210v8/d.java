package p210v8;

import C8.InterfaceC0175c;
import F8.InterfaceC0211e;
import F8.p0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p076h8.f;
import p086i8.l;
import p086i8.m;
import p086i8.y;
import p086i8.z;
import p200u8.a;
import p200u8.b;
import p200u8.c;
import p200u8.e;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0175c, c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Map f15455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final HashMap f15456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final LinkedHashMap f15457v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class f15458s;

    static {
        int i10 = 0;
        List listC = l.C(a.class, b.class, c.class, p200u8.d.class, e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class, InterfaceC0211e.class);
        ArrayList arrayList = new ArrayList(m.H(listC, 10));
        for (Object obj : listC) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                l.G();
                throw null;
            }
            arrayList.add(new f((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f15455t = y.z(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        i.e(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            i.c(str);
            sb.append(L9.f.f0(str, '.', str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f15455t.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f15456u = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.s(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, L9.f.f0(str2, '.', str2));
        }
        f15457v = linkedHashMap;
    }

    public d(Class cls) {
        i.f(cls, "jClass");
        this.f15458s = cls;
    }

    @Override // p210v8.c
    public final Class a() {
        return this.f15458s;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && p068ga.d.p(this).equals(p068ga.d.p((InterfaceC0175c) obj));
    }

    public final int hashCode() {
        return p068ga.d.p(this).hashCode();
    }

    @Override // C8.InterfaceC0175c
    public final Collection n() {
        throw new p0();
    }

    @Override // C8.InterfaceC0175c
    public final boolean r() {
        throw new p0();
    }

    @Override // C8.InterfaceC0175c
    public final String s() {
        String str;
        Class cls = this.f15458s;
        i.f(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean zIsArray = cls.isArray();
        HashMap map = f15456u;
        if (!zIsArray) {
            String str2 = (String) map.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // C8.InterfaceC0175c
    public final List t() {
        throw new p0();
    }

    public final String toString() {
        return this.f15458s.toString() + " (Kotlin reflection is not available)";
    }

    @Override // C8.InterfaceC0175c
    public final boolean u(Object obj) {
        Class clsP = this.f15458s;
        i.f(clsP, "jClass");
        Map map = f15455t;
        i.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsP);
        if (num != null) {
            return x.f(num.intValue(), obj);
        }
        if (clsP.isPrimitive()) {
            clsP = p068ga.d.p(p068ga.d.r(clsP));
        }
        return clsP.isInstance(obj);
    }

    @Override // C8.InterfaceC0175c
    public final String v() {
        String str;
        Class cls = this.f15458s;
        i.f(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f15457v;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return L9.f.d0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return L9.f.e0(simpleName);
        }
        return L9.f.d0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }
}
