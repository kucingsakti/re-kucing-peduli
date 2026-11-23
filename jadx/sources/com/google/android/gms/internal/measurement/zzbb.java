package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzbb {
    public final HashMap a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbq f8481b = new zzbq();

    public zzbb() {
        b(new zzaw());
        b(new zzba());
        b(new zzbc());
        b(new zzbg());
        b(new zzbi());
        b(new zzbo());
        b(new zzbt());
    }

    public final zzaq a(zzh zzhVar, zzaq zzaqVar) {
        zzg.f(zzhVar);
        if (!(zzaqVar instanceof zzat)) {
            return zzaqVar;
        }
        zzat zzatVar = (zzat) zzaqVar;
        ArrayList arrayList = zzatVar.f8477t;
        HashMap map = this.a;
        String str = zzatVar.f8476s;
        return (map.containsKey(str) ? (zzay) map.get(str) : this.f8481b).a(str, zzhVar, arrayList);
    }

    public final void b(zzay zzayVar) {
        Iterator it = zzayVar.a.iterator();
        while (it.hasNext()) {
            this.a.put(((zzbv) it.next()).toString(), zzayVar);
        }
    }
}
