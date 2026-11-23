package U4;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {
    private final Class<?> clazz;
    private Object obj;

    public g(Class<?> cls) {
        i.f(cls, "clazz");
        this.clazz = cls;
    }

    private final boolean doesHaveAllParameters(Constructor<?> constructor, b bVar) {
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        i.e(genericParameterTypes, "constructor.genericParameterTypes");
        for (Type type : genericParameterTypes) {
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                i.e(actualTypeArguments, "param.actualTypeArguments");
                Type type2 = (Type) p086i8.i.w(actualTypeArguments);
                if (!(type2 instanceof WildcardType)) {
                    if (type2 instanceof Class) {
                        if (!bVar.hasService((Class) type2)) {
                            com.onesignal.debug.internal.logging.b.debug$default("Constructor " + constructor + " could not find service: " + type2, null, 2, null);
                        }
                    }
                    return false;
                }
                Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                i.e(upperBounds, "argType.upperBounds");
                Type type3 = (Type) p086i8.i.v(upperBounds);
                if ((type3 instanceof Class) && !bVar.hasService((Class) type3)) {
                    com.onesignal.debug.internal.logging.b.debug$default("Constructor " + constructor + " could not find service: " + type3, null, 2, null);
                    return false;
                }
            } else {
                if (!(type instanceof Class)) {
                    com.onesignal.debug.internal.logging.b.debug$default("Constructor " + constructor + " could not identify param type: " + type, null, 2, null);
                    return false;
                }
                if (!bVar.hasService((Class) type)) {
                    com.onesignal.debug.internal.logging.b.debug$default("Constructor " + constructor + " could not find service: " + type, null, 2, null);
                    return false;
                }
            }
        }
        return true;
    }

    @Override // U4.e
    public Object resolve(b bVar) {
        i.f(bVar, "provider");
        if (this.obj != null) {
            com.onesignal.debug.internal.logging.b.debug$default(d.Companion.getIndent() + "Already instantiated: " + this.obj, null, 2, null);
            return this.obj;
        }
        Constructor<?>[] constructors = this.clazz.getConstructors();
        i.e(constructors, "clazz.constructors");
        for (Constructor<?> constructor : constructors) {
            i.e(constructor, "constructor");
            if (doesHaveAllParameters(constructor, bVar)) {
                com.onesignal.debug.internal.logging.b.debug$default(d.Companion.getIndent() + "Found constructor: " + constructor, null, 2, null);
                ArrayList arrayList = new ArrayList();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                i.e(genericParameterTypes, "constructor.genericParameterTypes");
                for (Type type : genericParameterTypes) {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        i.e(actualTypeArguments, "param.actualTypeArguments");
                        Type type2 = (Type) p086i8.i.w(actualTypeArguments);
                        if (type2 instanceof WildcardType) {
                            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                            i.e(upperBounds, "argType.upperBounds");
                            Type type3 = (Type) p086i8.i.v(upperBounds);
                            if (type3 instanceof Class) {
                                arrayList.add(bVar.getAllServices((Class) type3));
                            } else {
                                arrayList.add(null);
                            }
                        } else if (type2 instanceof Class) {
                            arrayList.add(bVar.getAllServices((Class) type2));
                        } else {
                            arrayList.add(null);
                        }
                    } else if (type instanceof Class) {
                        arrayList.add(bVar.getService((Class) type));
                    } else {
                        arrayList.add(null);
                    }
                }
                Object[] array = arrayList.toArray(new Object[0]);
                i.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                this.obj = constructor.newInstance(Arrays.copyOf(array, array.length));
                break;
            }
        }
        return this.obj;
    }
}
