package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class Gson$2 extends u {
    @Override // com.google.gson.u
    public final Object b(A4.a aVar) throws IOException {
        if (aVar.X() != 9) {
            return Float.valueOf((float) aVar.A());
        }
        aVar.J();
        return null;
    }

    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            bVar.n();
            return;
        }
        float fFloatValue = numberValueOf.floatValue();
        i.a(fFloatValue);
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(fFloatValue);
        }
        bVar.B(numberValueOf);
    }
}
