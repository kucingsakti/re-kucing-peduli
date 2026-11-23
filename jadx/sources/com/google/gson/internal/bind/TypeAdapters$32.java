package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.u;
import com.google.gson.v;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$32 implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Class f10054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Class f10055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u f10056u;

    public TypeAdapters$32(Class cls, Class cls2, u uVar) {
        this.f10054s = cls;
        this.f10055t = cls2;
        this.f10056u = uVar;
    }

    @Override // com.google.gson.v
    public final u a(i iVar, p243z4.a aVar) {
        Class cls = aVar.a;
        if (cls == this.f10054s || cls == this.f10055t) {
            return this.f10056u;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f10055t.getName() + "+" + this.f10054s.getName() + ",adapter=" + this.f10056u + "]";
    }
}
