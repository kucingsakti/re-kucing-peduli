package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzai implements zzaq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f8459s;

    public zzai(Double d3) {
        if (d3 == null) {
            this.f8459s = Double.valueOf(Double.NaN);
        } else {
            this.f8459s = d3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return new zzai(this.f8459s);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean d() {
        Double d3 = this.f8459s;
        return Boolean.valueOf((Double.isNaN(d3.doubleValue()) || d3.doubleValue() == 0.0d) ? false : true);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double e() {
        return this.f8459s;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzai) {
            return this.f8459s.equals(((zzai) obj).f8459s);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String f() {
        Double d3 = this.f8459s;
        if (Double.isNaN(d3.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d3.doubleValue())) {
            return d3.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d3.doubleValue());
        BigDecimal bigDecimal = (bigDecimalValueOf.signum() == 0 || bigDecimalValueOf.signum() == 0) ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator g() {
        return null;
    }

    public final int hashCode() {
        return this.f8459s.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq o(String str, zzh zzhVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new zzas(f());
        }
        throw new IllegalArgumentException(f() + "." + str + " is not a function.");
    }

    public final String toString() {
        return f();
    }
}
