package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.u;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends u {
    public final i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f10050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f10051c;

    public TypeAdapterRuntimeTypeWrapper(i iVar, u uVar, Type type) {
        this.a = iVar;
        this.f10050b = uVar;
        this.f10051c = type;
    }

    @Override // com.google.gson.u
    public final Object b(A4.a aVar) {
        return this.f10050b.b(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003c  */
    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) {
        u uVarD;
        Type type = this.f10051c;
        Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
        u uVar = this.f10050b;
        if (type2 != type) {
            u uVarC = this.a.c(new p243z4.a(type2));
            if (uVarC instanceof ReflectiveTypeAdapterFactory.Adapter) {
                u uVar2 = uVar;
                while ((uVar2 instanceof SerializationDelegatingTypeAdapter) && (uVarD = ((SerializationDelegatingTypeAdapter) uVar2).d()) != uVar2) {
                    uVar2 = uVarD;
                }
                if (uVar2 instanceof ReflectiveTypeAdapterFactory.Adapter) {
                    uVar = uVarC;
                }
            } else {
                uVar = uVarC;
            }
        }
        uVar.c(bVar, obj);
    }
}
