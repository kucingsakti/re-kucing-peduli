package com.google.gson.internal.bind;

import N1.t;
import com.google.gson.i;
import com.google.gson.u;
import com.google.gson.v;

/* JADX INFO: loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f10031s;

    public JsonAdapterAnnotationTypeAdapterFactory(t tVar) {
        this.f10031s = tVar;
    }

    public static u b(t tVar, i iVar, p243z4.a aVar, w4.a aVar2) {
        u uVarA;
        Object objN = tVar.d(new p243z4.a(aVar2.value())).n();
        boolean zNullSafe = aVar2.nullSafe();
        if (objN instanceof u) {
            uVarA = (u) objN;
        } else {
            if (!(objN instanceof v)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objN.getClass().getName() + " as a @JsonAdapter for " + com.google.gson.internal.d.j(aVar.f16313b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            uVarA = ((v) objN).a(iVar, aVar);
        }
        return (uVarA == null || !zNullSafe) ? uVarA : uVarA.a();
    }

    @Override // com.google.gson.v
    public final u a(i iVar, p243z4.a aVar) {
        w4.a aVar2 = (w4.a) aVar.a.getAnnotation(w4.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f10031s, iVar, aVar, aVar2);
    }
}
