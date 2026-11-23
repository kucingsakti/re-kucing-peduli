package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.i;
import com.google.gson.u;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f10064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Method f10068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u f10070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f10071i;
    public final /* synthetic */ p243z4.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f10072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f10073l;

    public c(String str, Field field, boolean z6, boolean z10, Method method, boolean z11, u uVar, i iVar, p243z4.a aVar, boolean z12, boolean z13) {
        this.f10068f = method;
        this.f10069g = z11;
        this.f10070h = uVar;
        this.f10071i = iVar;
        this.j = aVar;
        this.f10072k = z12;
        this.f10073l = z13;
        this.a = str;
        this.f10064b = field;
        this.f10065c = field.getName();
        this.f10066d = z6;
        this.f10067e = z10;
    }

    public final void a(A4.b bVar, Object obj) {
        Object objInvoke;
        if (this.f10066d) {
            Field field = this.f10064b;
            Method method = this.f10068f;
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e10) {
                    throw new JsonIOException(E0.a.i("Accessor ", p235y4.c.d(method, false), " threw exception"), e10.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            bVar.j(this.a);
            boolean z6 = this.f10069g;
            u typeAdapterRuntimeTypeWrapper = this.f10070h;
            if (!z6) {
                typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(this.f10071i, typeAdapterRuntimeTypeWrapper, this.j.f16313b);
            }
            typeAdapterRuntimeTypeWrapper.c(bVar, objInvoke);
        }
    }
}
