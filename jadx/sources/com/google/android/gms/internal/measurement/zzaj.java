package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzaj implements zzaq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zzaq f8460s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8461t;

    public zzaj() {
        this.f8460s = zzaq.f8465i;
        this.f8461t = "return";
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return new zzaj(this.f8461t, this.f8460s.c());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean d() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double e() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzajVar = (zzaj) obj;
        return this.f8461t.equals(zzajVar.f8461t) && this.f8460s.equals(zzajVar.f8460s);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String f() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator g() {
        return null;
    }

    public final int hashCode() {
        return this.f8460s.hashCode() + (this.f8461t.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq o(String str, zzh zzhVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public zzaj(String str) {
        this.f8460s = zzaq.f8465i;
        this.f8461t = str;
    }

    public zzaj(String str, zzaq zzaqVar) {
        this.f8460s = zzaqVar;
        this.f8461t = str;
    }
}
