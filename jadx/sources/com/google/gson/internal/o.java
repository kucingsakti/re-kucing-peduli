package com.google.gson.internal;

import N1.t;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class o extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f10134b;

    public o(Method method) {
        this.f10134b = method;
    }

    @Override // com.google.gson.internal.q
    public final Object a(Class cls) {
        String strB = t.b(cls);
        if (strB == null) {
            return this.f10134b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
    }
}
