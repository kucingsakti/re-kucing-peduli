package p210v8;

import F8.InterfaceC0211e;
import U.Z;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p219w8.a;
import p219w8.b;
import p219w8.c;
import p219w8.d;
import p219w8.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static Collection a(Collection collection) {
        if ((collection instanceof a) && !(collection instanceof b)) {
            h(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return collection;
        } catch (ClassCastException e10) {
            i.j(e10, x.class.getName());
            throw e10;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof a) && !(obj instanceof c)) {
            h(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            i.j(e10, x.class.getName());
            throw e10;
        }
    }

    public static Map c(LinkedHashMap linkedHashMap) {
        if (!(linkedHashMap instanceof a) || (linkedHashMap instanceof d)) {
            return linkedHashMap;
        }
        h(linkedHashMap, "kotlin.collections.MutableMap");
        throw null;
    }

    public static Set d(Object obj) {
        if ((obj instanceof a) && !(obj instanceof e)) {
            h(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            i.j(e10, x.class.getName());
            throw e10;
        }
    }

    public static void e(int i10, Object obj) {
        if (obj == null || f(i10, obj)) {
            return;
        }
        h(obj, "kotlin.jvm.functions.Function" + i10);
        throw null;
    }

    public static boolean f(int i10, Object obj) {
        int arity;
        if (obj instanceof p076h8.a) {
            if (obj instanceof f) {
                arity = ((f) obj).getArity();
            } else if (obj instanceof p200u8.a) {
                arity = 0;
            } else if (obj instanceof p200u8.b) {
                arity = 1;
            } else if (obj instanceof p200u8.c) {
                arity = 2;
            } else if (obj instanceof p200u8.d) {
                arity = 3;
            } else if (obj instanceof p200u8.e) {
                arity = 4;
            } else {
                boolean z6 = obj instanceof InterfaceC0211e;
                if (z6) {
                    arity = 5;
                } else if (z6) {
                    arity = 6;
                } else if (z6) {
                    arity = 7;
                } else if (z6) {
                    arity = 8;
                } else if (z6) {
                    arity = 9;
                } else if (z6) {
                    arity = 10;
                } else if (z6) {
                    arity = 11;
                } else if (z6) {
                    arity = 12;
                } else if (z6) {
                    arity = 13;
                } else if (z6) {
                    arity = 14;
                } else if (z6) {
                    arity = 15;
                } else if (z6) {
                    arity = 16;
                } else if (z6) {
                    arity = 17;
                } else if (z6) {
                    arity = 18;
                } else if (z6) {
                    arity = 19;
                } else if (z6) {
                    arity = 20;
                } else if (z6) {
                    arity = 21;
                } else {
                    arity = z6 ? 22 : -1;
                }
            }
            if (arity == i10) {
                return true;
            }
        }
        return false;
    }

    public static final Z g(Object[] objArr) {
        i.f(objArr, "array");
        return new Z(objArr);
    }

    public static void h(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        i.j(classCastException, x.class.getName());
        throw classCastException;
    }
}
