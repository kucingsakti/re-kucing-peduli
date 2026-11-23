package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzaa {
    public final TreeMap a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f8450b = new TreeMap();

    public final void a(zzh zzhVar, zzac zzacVar) {
        zzn zznVar = new zzn(zzacVar);
        TreeMap treeMap = this.a;
        for (Integer num : treeMap.keySet()) {
            zzad zzadVar = (zzad) zzacVar.f8451b.clone();
            zzaq zzaqVarA = ((zzar) treeMap.get(num)).a(zzhVar, Collections.singletonList(zznVar));
            int i10 = zzaqVarA instanceof zzai ? zzg.i(((zzai) zzaqVarA).f8459s.doubleValue()) : -1;
            if (i10 == 2 || i10 == -1) {
                zzacVar.f8451b = zzadVar;
            }
        }
        TreeMap treeMap2 = this.f8450b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            zzaq zzaqVarA2 = ((zzar) treeMap2.get((Integer) it.next())).a(zzhVar, Collections.singletonList(zznVar));
            if (zzaqVarA2 instanceof zzai) {
                zzg.i(((zzai) zzaqVarA2).f8459s.doubleValue());
            }
        }
    }
}
