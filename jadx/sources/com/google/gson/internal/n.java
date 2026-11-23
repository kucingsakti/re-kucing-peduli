package com.google.gson.internal;

import N1.t;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class n extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f10132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10133c;

    public n(int i10, Method method) {
        this.f10132b = method;
        this.f10133c = i10;
    }

    @Override // com.google.gson.internal.q
    public final Object a(Class cls) {
        String strB = t.b(cls);
        if (strB == null) {
            return this.f10132b.invoke(null, cls, Integer.valueOf(this.f10133c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
    }
}
