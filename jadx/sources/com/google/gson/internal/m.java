package com.google.gson.internal;

import N1.t;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class m extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f10130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10131c;

    public m(Method method, Object obj) {
        this.f10130b = method;
        this.f10131c = obj;
    }

    @Override // com.google.gson.internal.q
    public final Object a(Class cls) {
        String strB = t.b(cls);
        if (strB == null) {
            return this.f10130b.invoke(this.f10131c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
    }
}
