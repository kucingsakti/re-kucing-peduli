package G8;

import C8.InterfaceC0175c;
import R8.AbstractC0408c;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {
    public final Class a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f1722g;

    public a(Class cls, ArrayList arrayList, int i10, int i11, List list) {
        boolean z6;
        p210v8.i.f(cls, "jClass");
        AbstractC0487g.p(i10, "callMode");
        AbstractC0487g.p(i11, "origin");
        p210v8.i.f(list, "methods");
        this.a = cls;
        this.f1717b = arrayList;
        this.f1718c = i10;
        this.f1719d = list;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f1720e = arrayList2;
        List list3 = this.f1719d;
        ArrayList arrayList3 = new ArrayList(p086i8.m.H(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            p210v8.i.e(returnType, "it");
            List list4 = AbstractC0408c.a;
            Class<?> cls2 = (Class) AbstractC0408c.f4463c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f1721f = arrayList3;
        List list5 = this.f1719d;
        ArrayList arrayList4 = new ArrayList(p086i8.m.H(list5, 10));
        Iterator it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f1722g = arrayList4;
        if (this.f1718c == 2 && i11 == 1) {
            ArrayList arrayList5 = this.f1717b;
            p210v8.i.f(arrayList5, "<this>");
            ArrayList arrayList6 = new ArrayList(p086i8.m.H(arrayList5, 10));
            boolean z10 = false;
            for (Object obj : arrayList5) {
                if (z10 || !p210v8.i.a(obj, "value")) {
                    z6 = true;
                } else {
                    z10 = true;
                    z6 = false;
                }
                if (z6) {
                    arrayList6.add(obj);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    @Override // G8.e
    public final Object v(Object[] objArr) {
        String strS;
        p210v8.i.f(objArr, "args");
        C3.a.b(this, objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f1717b;
            if (i10 >= length) {
                return xa.d.h(this.a, p086i8.y.z(p086i8.k.z0(arrayList2, arrayList)), this.f1719d);
            }
            Object array = objArr[i10];
            int i12 = i11 + 1;
            ArrayList arrayList3 = this.f1721f;
            if (array == null && this.f1718c == 1) {
                array = this.f1722g.get(i11);
            } else {
                Class cls = (Class) arrayList3.get(i11);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof InterfaceC0175c) {
                        array = p068ga.d.o((InterfaceC0175c) array);
                    } else if (array instanceof Object[]) {
                        Object[] objArr2 = (Object[]) array;
                        if (objArr2 instanceof Class[]) {
                            array = null;
                        } else if (objArr2 instanceof InterfaceC0175c[]) {
                            p210v8.i.d(array, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                            InterfaceC0175c[] interfaceC0175cArr = (InterfaceC0175c[]) array;
                            ArrayList arrayList4 = new ArrayList(interfaceC0175cArr.length);
                            for (InterfaceC0175c interfaceC0175c : interfaceC0175cArr) {
                                arrayList4.add(p068ga.d.o(interfaceC0175c));
                            }
                            array = arrayList4.toArray(new Class[0]);
                        } else {
                            array = objArr2;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                }
            }
            if (array == null) {
                String str = (String) arrayList2.get(i11);
                Class cls2 = (Class) arrayList3.get(i11);
                InterfaceC0175c interfaceC0175cB = p210v8.i.a(cls2, Class.class) ? p210v8.u.a.b(InterfaceC0175c.class) : (cls2.isArray() && p210v8.i.a(cls2.getComponentType(), Class.class)) ? p210v8.u.a.b(InterfaceC0175c[].class) : p068ga.d.r(cls2);
                if (p210v8.i.a(interfaceC0175cB.s(), p210v8.u.a.b(Object[].class).s())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(interfaceC0175cB.s());
                    sb.append('<');
                    Class<?> componentType = p068ga.d.o(interfaceC0175cB).getComponentType();
                    p210v8.i.e(componentType, "kotlinClass.java.componentType");
                    sb.append(p068ga.d.r(componentType).s());
                    sb.append('>');
                    strS = sb.toString();
                } else {
                    strS = interfaceC0175cB.s();
                }
                throw new IllegalArgumentException("Argument #" + i11 + ' ' + str + " is not of the required type " + strS);
            }
            arrayList.add(array);
            i10++;
            i11 = i12;
        }
    }

    @Override // G8.e
    public final Type w() {
        return this.a;
    }

    @Override // G8.e
    public final List x() {
        return this.f1720e;
    }

    @Override // G8.e
    public final /* bridge */ /* synthetic */ Member y() {
        return null;
    }

    public /* synthetic */ a(Class cls, ArrayList arrayList, int i10) {
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
        this(cls, arrayList, i10, 2, arrayList2);
    }
}
