package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzax implements zzaq {
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return zzaq.f8465i;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean d() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof zzax;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String f() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator g() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq o(String str, zzh zzhVar, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }
}
