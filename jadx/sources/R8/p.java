package R8;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends A implements p009a9.d {
    public final Type a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f4475b;

    public p(Type type) {
        r nVar;
        p210v8.i.f(type, "reflectType");
        this.a = type;
        if (type instanceof Class) {
            nVar = new n((Class) type);
        } else if (type instanceof TypeVariable) {
            nVar = new B((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            p210v8.i.d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            nVar = new n((Class) rawType);
        }
        this.f4475b = nVar;
    }

    @Override // R8.A, p009a9.b
    public final C0409d a(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        return null;
    }

    @Override // R8.A
    public final Type b() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    public final ArrayList c() {
        p009a9.b hVar;
        p009a9.b yVar;
        List<Type> listC = AbstractC0408c.c(this.a);
        ArrayList arrayList = new ArrayList(p086i8.m.H(listC, 10));
        for (Type type : listC) {
            p210v8.i.f(type, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
            boolean z6 = type instanceof Class;
            if (z6) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    yVar = new y(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z6 && ((Class) type).isArray())) {
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
            arrayList.add(yVar);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            p210v8.i.e(typeParameters, "getTypeParameters()");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // p009a9.b
    public final Collection q() {
        return p086i8.s.f12328s;
    }
}
