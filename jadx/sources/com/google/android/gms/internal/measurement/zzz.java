package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzz extends zzal {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final zzl f8874u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashMap f8875v;

    public zzz(zzl zzlVar) {
        super("require");
        this.f8875v = new HashMap();
        this.f8874u = zzlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List list) {
        zzaq zzaqVar;
        zzg.g("require", 1, list);
        String strF = zzhVar.f8658b.a(zzhVar, (zzaq) list.get(0)).f();
        HashMap map = this.f8875v;
        if (map.containsKey(strF)) {
            return (zzaq) map.get(strF);
        }
        HashMap map2 = this.f8874u.a;
        if (map2.containsKey(strF)) {
            try {
                zzaqVar = (zzaq) ((Callable) map2.get(strF)).call();
            } catch (Exception unused) {
                throw new IllegalStateException(E0.a.h("Failed to create API implementation: ", strF));
            }
        } else {
            zzaqVar = zzaq.f8465i;
        }
        if (zzaqVar instanceof zzal) {
            map.put(strF, (zzal) zzaqVar);
        }
        return zzaqVar;
    }
}
