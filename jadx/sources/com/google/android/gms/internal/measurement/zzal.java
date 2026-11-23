package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzal implements zzak, zzaq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f8462s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f8463t = new HashMap();

    public zzal(String str) {
        this.f8462s = str;
    }

    public abstract zzaq a(zzh zzhVar, List list);

    @Override // com.google.android.gms.internal.measurement.zzaq
    public zzaq c() {
        return this;
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
        if (!(obj instanceof zzal)) {
            return false;
        }
        zzal zzalVar = (zzal) obj;
        String str = this.f8462s;
        if (str != null) {
            return str.equals(zzalVar.f8462s);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String f() {
        return this.f8462s;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator g() {
        return new C0562c(this.f8463t.keySet().iterator());
    }

    public final int hashCode() {
        String str = this.f8462s;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzaq k(String str) {
        HashMap map = this.f8463t;
        return map.containsKey(str) ? (zzaq) map.get(str) : zzaq.f8465i;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean m(String str) {
        return this.f8463t.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void n(String str, zzaq zzaqVar) {
        HashMap map = this.f8463t;
        if (zzaqVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaqVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq o(String str, zzh zzhVar, ArrayList arrayList) {
        return "toString".equals(str) ? new zzas(this.f8462s) : zzan.a(this, new zzas(str), zzhVar, arrayList);
    }
}
