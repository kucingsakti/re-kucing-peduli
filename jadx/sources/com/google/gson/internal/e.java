package com.google.gson.internal;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import ya.C0886g;
import ya.C0887h;
import ya.C0898t;
import ya.InterfaceC0884e;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l, InterfaceC0884e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10102s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Type f10103t;

    public /* synthetic */ e(int i10, Type type) {
        this.f10102s = i10;
        this.f10103t = type;
    }

    @Override // ya.InterfaceC0884e
    public Type T() {
        switch (this.f10102s) {
            case 1:
                break;
        }
        return this.f10103t;
    }

    @Override // com.google.gson.internal.l
    public Object n() {
        Type type = this.f10103t;
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
    }

    @Override // ya.InterfaceC0884e
    public Object w0(C0898t c0898t) {
        switch (this.f10102s) {
            case 1:
                C0887h c0887h = new C0887h(c0898t);
                c0898t.n(new C0886g(c0887h, 0));
                return c0887h;
            default:
                C0887h c0887h2 = new C0887h(c0898t);
                c0898t.n(new C0886g(c0887h2, 1));
                return c0887h2;
        }
    }
}
