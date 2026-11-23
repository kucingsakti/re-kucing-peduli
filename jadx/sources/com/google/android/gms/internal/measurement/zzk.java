package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends zzal {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final zzac f8694u;

    public zzk(zzac zzacVar) {
        super("internal.eventLogger");
        this.f8694u = zzacVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List list) {
        zzg.g(this.f8462s, 3, list);
        String strF = zzhVar.f8658b.a(zzhVar, (zzaq) list.get(0)).f();
        long jA = (long) zzg.a(zzhVar.f8658b.a(zzhVar, (zzaq) list.get(1)).e().doubleValue());
        zzaq zzaqVarA = zzhVar.f8658b.a(zzhVar, (zzaq) list.get(2));
        HashMap mapD = zzaqVarA instanceof zzap ? zzg.d((zzap) zzaqVarA) : new HashMap();
        zzac zzacVar = this.f8694u;
        zzacVar.getClass();
        HashMap map = new HashMap();
        for (String str : mapD.keySet()) {
            HashMap map2 = zzacVar.a.f8455c;
            map.put(str, zzad.a(str, map2.containsKey(str) ? map2.get(str) : null, mapD.get(str)));
        }
        zzacVar.f8452c.add(new zzad(strF, jA, map));
        return zzaq.f8465i;
    }
}
