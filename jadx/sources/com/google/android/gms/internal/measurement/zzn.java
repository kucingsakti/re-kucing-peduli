package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzn extends zzap {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zzac f8739t;

    public zzn(zzac zzacVar) {
        this.f8739t = zzacVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap, com.google.android.gms.internal.measurement.zzaq
    public final zzaq o(String str, zzh zzhVar, ArrayList arrayList) {
        zzac zzacVar = this.f8739t;
        switch (str) {
            case "getEventName":
                zzg.g("getEventName", 0, arrayList);
                return new zzas(zzacVar.f8451b.a);
            case "getTimestamp":
                zzg.g("getTimestamp", 0, arrayList);
                return new zzai(Double.valueOf(zzacVar.f8451b.f8454b));
            case "getParamValue":
                zzg.g("getParamValue", 1, arrayList);
                String strF = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).f();
                HashMap map = zzacVar.f8451b.f8455c;
                return zzj.b(map.containsKey(strF) ? map.get(strF) : null);
            case "getParams":
                zzg.g("getParams", 0, arrayList);
                HashMap map2 = zzacVar.f8451b.f8455c;
                zzap zzapVar = new zzap();
                for (String str2 : map2.keySet()) {
                    zzapVar.n(str2, zzj.b(map2.get(str2)));
                }
                return zzapVar;
            case "setParamValue":
                zzg.g("setParamValue", 2, arrayList);
                String strF2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).f();
                zzaq zzaqVarA = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
                zzad zzadVar = zzacVar.f8451b;
                Object objC = zzg.c(zzaqVarA);
                HashMap map3 = zzadVar.f8455c;
                if (objC == null) {
                    map3.remove(strF2);
                    return zzaqVarA;
                }
                map3.put(strF2, zzad.a(strF2, map3.get(strF2), objC));
                return zzaqVarA;
            case "setEventName":
                zzg.g("setEventName", 1, arrayList);
                zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                if (zzaq.f8465i.equals(zzaqVarA2) || zzaq.j.equals(zzaqVarA2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                zzacVar.f8451b.a = zzaqVarA2.f();
                return new zzas(zzaqVarA2.f());
            default:
                return super.o(str, zzhVar, arrayList);
        }
    }
}
