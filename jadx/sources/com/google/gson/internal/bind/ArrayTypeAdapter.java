package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayTypeAdapter<E> extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f10025c = new v() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.v
        public final u a(i iVar, p243z4.a aVar) {
            Type type = aVar.f16313b;
            boolean z6 = type instanceof GenericArrayType;
            if (!z6 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z6 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(iVar, iVar.c(new p243z4.a(genericComponentType)), com.google.gson.internal.d.g(genericComponentType));
        }
    };
    public final Class a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f10026b;

    public ArrayTypeAdapter(i iVar, u uVar, Class cls) {
        this.f10026b = new TypeAdapterRuntimeTypeWrapper(iVar, uVar, cls);
        this.a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.u
    public final Object b(A4.a aVar) throws IOException {
        if (aVar.X() == 9) {
            aVar.J();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.n()) {
            arrayList.add(((TypeAdapterRuntimeTypeWrapper) this.f10026b).f10050b.b(aVar));
        }
        aVar.h();
        int size = arrayList.size();
        Class cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.n();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f10026b.c(bVar, Array.get(obj, i10));
        }
        bVar.h();
    }
}
