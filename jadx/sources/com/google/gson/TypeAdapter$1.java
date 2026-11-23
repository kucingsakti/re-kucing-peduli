package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapter$1 extends u {
    public final /* synthetic */ u a;

    public TypeAdapter$1(u uVar) {
        this.a = uVar;
    }

    @Override // com.google.gson.u
    public final Object b(A4.a aVar) throws IOException {
        if (aVar.X() != 9) {
            return this.a.b(aVar);
        }
        aVar.J();
        return null;
    }

    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.n();
        } else {
            this.a.c(bVar, obj);
        }
    }
}
