package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzao implements zzaq {
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return zzaq.j;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean d() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double e() {
        return Double.valueOf(0.0d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof zzao;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String f() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator g() {
        return null;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq o(String str, zzh zzhVar, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }
}
