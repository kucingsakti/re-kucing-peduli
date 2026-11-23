package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0507b {
    public final HashMap a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f6748b;

    public C0507b(HashMap map) {
        this.f6748b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0518m enumC0518m = (EnumC0518m) entry.getValue();
            List arrayList = (List) this.a.get(enumC0518m);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(enumC0518m, arrayList);
            }
            arrayList.add((C0508c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m, r rVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0508c c0508c = (C0508c) list.get(size);
                c0508c.getClass();
                try {
                    int i10 = c0508c.a;
                    Method method = c0508c.f6749b;
                    if (i10 == 0) {
                        method.invoke(rVar, new Object[0]);
                    } else if (i10 == 1) {
                        method.invoke(rVar, interfaceC0523s);
                    } else if (i10 == 2) {
                        method.invoke(rVar, interfaceC0523s, enumC0518m);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
