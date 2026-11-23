package F8;

import L8.AbstractC0281o;
import L8.InterfaceC0269c;
import L8.InterfaceC0276j;
import R8.AbstractC0408c;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class D implements p210v8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final L9.e f1511s = new L9.e("<v#(\\d+)>");

    public static Method k(Class cls, String str, Class[] clsArr, Class cls2, boolean z6) {
        Class clsA;
        Method methodK;
        if (z6) {
            clsArr[0] = cls;
        }
        Method methodO = o(cls, str, clsArr, cls2);
        if (methodO != null) {
            return methodO;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodK = k(superclass, str, clsArr, cls2, z6)) != null) {
            return methodK;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        p210v8.i.e(interfaces, "interfaces");
        for (Class<?> cls3 : interfaces) {
            p210v8.i.e(cls3, "superInterface");
            Method methodK2 = k(cls3, str, clsArr, cls2, z6);
            if (methodK2 != null) {
                return methodK2;
            }
            if (z6 && (clsA = p086i8.C.A(AbstractC0408c.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodO2 = o(clsA, str, clsArr, cls2);
                if (methodO2 != null) {
                    return methodO2;
                }
            }
        }
        return null;
    }

    public static Constructor m(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method o(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (p210v8.i.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            p210v8.i.e(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (p210v8.i.a(method.getName(), str) && p210v8.i.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void b(ArrayList arrayList, String str, boolean z6) {
        ArrayList arrayListJ = j(str);
        arrayList.addAll(arrayListJ);
        int size = (arrayListJ.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class cls = Integer.TYPE;
            p210v8.i.e(cls, "TYPE");
            arrayList.add(cls);
        }
        if (!z6) {
            arrayList.add(Object.class);
        } else {
            arrayList.remove(p210v8.e.class);
            arrayList.add(p210v8.e.class);
        }
    }

    public final Method c(String str, String str2) throws ClassNotFoundException {
        Method methodK;
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "desc");
        if (str.equals("<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) j(str2).toArray(new Class[0]);
        Class clsL = l(L9.f.O(str2, ')', 0, 6) + 1, str2, str2.length());
        Method methodK2 = k(h(), str, clsArr, clsL, false);
        if (methodK2 != null) {
            return methodK2;
        }
        if (!h().isInterface() || (methodK = k(Object.class, str, clsArr, clsL, false)) == null) {
            return null;
        }
        return methodK;
    }

    public abstract Collection d();

    public abstract Collection e(p096j9.f fVar);

    public abstract L8.K f(int i10);

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    public final Collection g(t9.n nVar, int i10) {
        AbstractC0224s abstractC0224s;
        p210v8.i.f(nVar, "scope");
        AbstractC0487g.p(i10, "belonginess");
        C c10 = new C(this);
        Collection<InterfaceC0276j> collectionD = oa.b.d(nVar, null, 3);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0276j interfaceC0276j : collectionD) {
            if (interfaceC0276j instanceof InterfaceC0269c) {
                InterfaceC0269c interfaceC0269c = (InterfaceC0269c) interfaceC0276j;
                if (p210v8.i.a(interfaceC0269c.f(), AbstractC0281o.f2825h)) {
                    abstractC0224s = null;
                } else if ((interfaceC0269c.V() != 2) == (i10 == 1)) {
                    abstractC0224s = (AbstractC0224s) interfaceC0276j.k0(c10, p076h8.m.a);
                } else {
                    abstractC0224s = null;
                }
            } else {
                abstractC0224s = null;
            }
            if (abstractC0224s != null) {
                arrayList.add(abstractC0224s);
            }
        }
        return p086i8.k.s0(arrayList);
    }

    public Class h() {
        Class clsA = a();
        List list = AbstractC0408c.a;
        p210v8.i.f(clsA, "<this>");
        Class cls = (Class) AbstractC0408c.f4463c.get(clsA);
        return cls == null ? a() : cls;
    }

    public abstract Collection i(p096j9.f fVar);

    public final ArrayList j(String str) {
        int iO;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (L9.f.K("VZCBSIFJD", cCharAt)) {
                iO = i11 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new p0("Unknown type prefix in the method signature: ".concat(str), 0);
                }
                iO = L9.f.O(str, ';', i10, 4) + 1;
            }
            arrayList.add(l(i10, str, iO));
            i10 = iO;
        }
        return arrayList;
    }

    public final Class l(int i10, String str, int i11) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = AbstractC0408c.d(a());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> clsLoadClass = classLoaderD.loadClass(L9.n.F(strSubstring, '/', '.'));
            p210v8.i.e(clsLoadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            Class clsL = l(i10 + 1, str, i11);
            p096j9.c cVar = y0.a;
            p210v8.i.f(clsL, "<this>");
            return Array.newInstance((Class<?>) clsL, 0).getClass();
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            p210v8.i.e(cls, "TYPE");
            return cls;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new p0("Unknown type prefix in the method signature: ".concat(str), 0);
    }
}
