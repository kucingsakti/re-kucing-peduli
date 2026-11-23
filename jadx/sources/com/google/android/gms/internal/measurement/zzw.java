package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzw extends zzal {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zzaa f8872u;

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List list) {
        TreeMap treeMap;
        zzg.g(this.f8462s, 3, list);
        zzhVar.f8658b.a(zzhVar, (zzaq) list.get(0)).f();
        zzaq zzaqVarA = zzhVar.f8658b.a(zzhVar, (zzaq) list.get(1));
        if (!(zzaqVarA instanceof zzar)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) list.get(2));
        if (!(zzaqVarA2 instanceof zzap)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        zzap zzapVar = (zzap) zzaqVarA2;
        if (!zzapVar.f8464s.containsKey(com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY)) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        String strF = zzapVar.k(com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY).f();
        int i10 = zzapVar.f8464s.containsKey("priority") ? zzg.i(zzapVar.k("priority").e().doubleValue()) : 1000;
        zzar zzarVar = (zzar) zzaqVarA;
        zzaa zzaaVar = this.f8872u;
        zzaaVar.getClass();
        if ("create".equals(strF)) {
            treeMap = zzaaVar.f8450b;
        } else {
            if (!"edit".equals(strF)) {
                throw new IllegalStateException(E0.a.h("Unknown callback type: ", strF));
            }
            treeMap = zzaaVar.a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), zzarVar);
        return zzaq.f8465i;
    }
}
