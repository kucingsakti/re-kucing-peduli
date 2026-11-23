package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class Gson$1 extends u {
    @Override // com.google.gson.u
    public final Object b(A4.a aVar) throws IOException {
        if (aVar.X() != 9) {
            return Double.valueOf(aVar.A());
        }
        aVar.J();
        return null;
    }

    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.n();
            return;
        }
        double dDoubleValue = number.doubleValue();
        i.a(dDoubleValue);
        bVar.t(dDoubleValue);
    }
}
