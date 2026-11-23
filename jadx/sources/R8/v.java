package R8;

import L8.Y;
import L8.b0;
import L8.e0;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends r implements p009a9.b, p009a9.c {
    @Override // p009a9.b
    public final C0409d a(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        Member memberB = b();
        p210v8.i.d(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return qa.b.j(declaredAnnotations, cVar);
        }
        return null;
    }

    public abstract Member b();

    public final p096j9.f c() {
        String name = b().getName();
        p096j9.f fVarJ = name != null ? p096j9.f.j(name) : null;
        return fVarJ == null ? p096j9.h.a : fVarJ;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z6) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        A hVar;
        A yVar;
        String str;
        boolean z10;
        o1.r rVar;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        C0406a c0406a = C0406a.a;
        Member memberB = b();
        p210v8.i.f(memberB, "member");
        o1.r rVar2 = C0406a.f4456b;
        Object obj = null;
        if (rVar2 == null) {
            synchronized (c0406a) {
                rVar2 = C0406a.f4456b;
                if (rVar2 == null) {
                    Class<?> cls = memberB.getClass();
                    try {
                        rVar = new o1.r(cls.getMethod("getParameters", new Class[0]), 9, AbstractC0408c.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
                    } catch (NoSuchMethodException unused) {
                        rVar = new o1.r(obj, 9, obj);
                    }
                    C0406a.f4456b = rVar;
                    rVar2 = rVar;
                }
            }
        }
        Method method2 = (Method) rVar2.f13675t;
        if (method2 == null || (method = (Method) rVar2.f13676u) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(memberB, new Object[0]);
            p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                Object objInvoke2 = method.invoke(obj2, new Object[0]);
                p210v8.i.d(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Type type = typeArr[i10];
            p210v8.i.f(type, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
            boolean z11 = type instanceof Class;
            if (z11) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    yVar = new y(cls2);
                } else {
                    if (!(type instanceof GenericArrayType) || (z11 && ((Class) type).isArray())) {
                        hVar = new h(type);
                    } else {
                        hVar = type instanceof WildcardType ? new D((WildcardType) type) : new p(type);
                    }
                    yVar = hVar;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    hVar = new h(type);
                } else {
                    hVar = new h(type);
                }
                yVar = hVar;
            }
            if (arrayList != null) {
                str = (String) p086i8.k.W(arrayList, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + c() + " type=" + yVar + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z6) {
                z10 = true;
                if (i10 != typeArr.length - 1) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            arrayList2.add(new C(yVar, annotationArr[i10], str, z10));
        }
        return arrayList2;
    }

    public final e0 e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return b0.f2810v;
        }
        if (Modifier.isPrivate(modifiers)) {
            return Y.f2807v;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? P8.c.f3901v : P8.b.f3900v;
        }
        return P8.a.f3899v;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && p210v8.i.a(b(), ((v) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // p009a9.b
    public final Collection q() {
        Member memberB = b();
        p210v8.i.d(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? qa.b.k(declaredAnnotations) : p086i8.s.f12328s;
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
