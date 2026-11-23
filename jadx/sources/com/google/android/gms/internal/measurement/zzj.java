package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzj {
    public static zzaq a(zzft.zzd zzdVar) {
        if (zzdVar == null) {
            return zzaq.f8465i;
        }
        int i10 = AbstractC0561b0.a[zzdVar.A().ordinal()];
        if (i10 == 1) {
            return zzdVar.I() ? new zzas(zzdVar.D()) : zzaq.f8471p;
        }
        if (i10 == 2) {
            return zzdVar.H() ? new zzai(Double.valueOf(zzdVar.z())) : new zzai(null);
        }
        if (i10 == 3) {
            return zzdVar.G() ? new zzag(Boolean.valueOf(zzdVar.F())) : new zzag(null);
        }
        if (i10 != 4) {
            if (i10 != 5) {
                throw new IllegalStateException("Invalid entity: ".concat(String.valueOf(zzdVar)));
            }
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listE = zzdVar.E();
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(a((zzft.zzd) it.next()));
        }
        return new zzat(zzdVar.C(), arrayList);
    }

    public static zzaq b(Object obj) {
        if (obj == null) {
            return zzaq.j;
        }
        if (obj instanceof String) {
            return new zzas((String) obj);
        }
        if (obj instanceof Double) {
            return new zzai((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzai(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzai(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzag((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            zzaf zzafVar = new zzaf();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzafVar.r(b(it.next()));
            }
            return zzafVar;
        }
        zzap zzapVar = new zzap();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            zzaq zzaqVarB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                zzapVar.n((String) string, zzaqVarB);
            }
        }
        return zzapVar;
    }
}
