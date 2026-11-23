package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzat implements zzaq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f8476s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f8477t;

    public zzat(String str, ArrayList arrayList) {
        this.f8476s = str;
        ArrayList arrayList2 = new ArrayList();
        this.f8477t = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean d() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double e() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        zzat zzatVar = (zzat) obj;
        String str = this.f8476s;
        if (str == null ? zzatVar.f8476s != null : !str.equals(zzatVar.f8476s)) {
            return false;
        }
        ArrayList arrayList = this.f8477t;
        ArrayList arrayList2 = zzatVar.f8477t;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        return arrayList2 == null;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String f() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator g() {
        return null;
    }

    public final int hashCode() {
        String str = this.f8476s;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.f8477t;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq o(String str, zzh zzhVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
