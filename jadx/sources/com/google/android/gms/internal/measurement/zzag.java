package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzag implements zzaq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8458s;

    public zzag(Boolean bool) {
        if (bool == null) {
            this.f8458s = false;
        } else {
            this.f8458s = bool.booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return new zzag(Boolean.valueOf(this.f8458s));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean d() {
        return Boolean.valueOf(this.f8458s);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double e() {
        return Double.valueOf(this.f8458s ? 1.0d : 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzag) && this.f8458s == ((zzag) obj).f8458s;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String f() {
        return Boolean.toString(this.f8458s);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator g() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f8458s).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq o(String str, zzh zzhVar, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z6 = this.f8458s;
        if (zEquals) {
            return new zzas(Boolean.toString(z6));
        }
        throw new IllegalArgumentException(Boolean.toString(z6) + "." + str + " is not a function.");
    }

    public final String toString() {
        return String.valueOf(this.f8458s);
    }
}
