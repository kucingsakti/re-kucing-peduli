package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends zzal {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ M2.A f8356u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(M2.A a) {
        super("getValue");
        this.f8356u = a;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List list) {
        zzg.g("getValue", 2, list);
        zzaq zzaqVarA = zzhVar.f8658b.a(zzhVar, (zzaq) list.get(0));
        zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) list.get(1));
        String strF = zzaqVarA.f();
        M2.A a = this.f8356u;
        Map map = (Map) a.f2882b.f9091v.get(a.a);
        String str = (map == null || !map.containsKey(strF)) ? null : (String) map.get(strF);
        return str != null ? new zzas(str) : zzaqVarA2;
    }
}
