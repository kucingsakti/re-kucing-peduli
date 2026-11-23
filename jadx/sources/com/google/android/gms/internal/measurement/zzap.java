package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class zzap implements zzak, zzaq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f8464s = new HashMap();

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        zzap zzapVar = new zzap();
        for (Map.Entry entry : this.f8464s.entrySet()) {
            boolean z6 = entry.getValue() instanceof zzak;
            HashMap map = zzapVar.f8464s;
            if (z6) {
                map.put((String) entry.getKey(), (zzaq) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((zzaq) entry.getValue()).c());
            }
        }
        return zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzap) {
            return this.f8464s.equals(((zzap) obj).f8464s);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String f() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator g() {
        return new C0562c(this.f8464s.keySet().iterator());
    }

    public final int hashCode() {
        return this.f8464s.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzaq k(String str) {
        HashMap map = this.f8464s;
        return map.containsKey(str) ? (zzaq) map.get(str) : zzaq.f8465i;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean m(String str) {
        return this.f8464s.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void n(String str, zzaq zzaqVar) {
        HashMap map = this.f8464s;
        if (zzaqVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaqVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public zzaq o(String str, zzh zzhVar, ArrayList arrayList) {
        return "toString".equals(str) ? new zzas(toString()) : zzan.a(this, new zzas(str), zzhVar, arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f8464s;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
