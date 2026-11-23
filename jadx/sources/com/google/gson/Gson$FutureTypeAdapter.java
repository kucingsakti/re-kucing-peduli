package com.google.gson;

import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;

/* JADX INFO: loaded from: classes.dex */
class Gson$FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
    public u a = null;

    @Override // com.google.gson.u
    public final Object b(A4.a aVar) {
        u uVar = this.a;
        if (uVar != null) {
            return uVar.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) {
        u uVar = this.a;
        if (uVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        uVar.c(bVar, obj);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final u d() {
        u uVar = this.a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
