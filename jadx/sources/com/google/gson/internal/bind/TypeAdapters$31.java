package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.u;
import com.google.gson.v;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$31 implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Class f10052s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f10053t;

    public TypeAdapters$31(Class cls, u uVar) {
        this.f10052s = cls;
        this.f10053t = uVar;
    }

    @Override // com.google.gson.v
    public final u a(i iVar, p243z4.a aVar) {
        if (aVar.a == this.f10052s) {
            return this.f10053t;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f10052s.getName() + ",adapter=" + this.f10053t + "]";
    }
}
