package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzbq extends zzay {
    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq a(String str, zzh zzhVar, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !zzhVar.f(str)) {
            throw new IllegalArgumentException(E0.a.h("Command not found: ", str));
        }
        zzaq zzaqVarC = zzhVar.c(str);
        if (zzaqVarC instanceof zzal) {
            return ((zzal) zzaqVarC).a(zzhVar, arrayList);
        }
        throw new IllegalArgumentException(E0.a.i("Function ", str, " is not defined"));
    }
}
