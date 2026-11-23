package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzan {
    public static zzaq a(zzak zzakVar, zzas zzasVar, zzh zzhVar, ArrayList arrayList) {
        String str = zzasVar.f8475s;
        if (zzakVar.m(str)) {
            zzaq zzaqVarK = zzakVar.k(str);
            if (zzaqVarK instanceof zzal) {
                return ((zzal) zzaqVarK).a(zzhVar, arrayList);
            }
            throw new IllegalArgumentException(p231y.a.c(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(E0.a.h("Object has no function ", str));
        }
        zzg.g("hasOwnProperty", 1, arrayList);
        return zzakVar.m(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).f()) ? zzaq.f8469n : zzaq.f8470o;
    }
}
