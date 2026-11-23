package com.google.android.gms.measurement.internal;

import M2.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zzno extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzno> CREATOR = new zznn();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f9313t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f9314u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Long f9315v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f9316w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f9317x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Double f9318y;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzno(s0 s0Var) {
        String str = s0Var.f3112c;
        this(s0Var.f3113d, s0Var.f3114e, str, s0Var.f3111b);
    }

    public final Object b() {
        Long l4 = this.f9315v;
        if (l4 != null) {
            return l4;
        }
        Double d3 = this.f9318y;
        if (d3 != null) {
            return d3;
        }
        String str = this.f9316w;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f9312s);
        SafeParcelWriter.e(parcel, 2, this.f9313t);
        SafeParcelWriter.k(parcel, 3, 8);
        parcel.writeLong(this.f9314u);
        SafeParcelWriter.c(parcel, 4, this.f9315v);
        SafeParcelWriter.e(parcel, 6, this.f9316w);
        SafeParcelWriter.e(parcel, 7, this.f9317x);
        Double d3 = this.f9318y;
        if (d3 != null) {
            SafeParcelWriter.k(parcel, 8, 8);
            parcel.writeDouble(d3.doubleValue());
        }
        SafeParcelWriter.j(parcel, i11);
    }

    public zzno(long j, Object obj, String str, String str2) {
        Preconditions.e(str);
        this.f9312s = 2;
        this.f9313t = str;
        this.f9314u = j;
        this.f9317x = str2;
        if (obj == null) {
            this.f9315v = null;
            this.f9318y = null;
            this.f9316w = null;
            return;
        }
        if (obj instanceof Long) {
            this.f9315v = (Long) obj;
            this.f9318y = null;
            this.f9316w = null;
        } else if (obj instanceof String) {
            this.f9315v = null;
            this.f9318y = null;
            this.f9316w = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f9315v = null;
            this.f9318y = (Double) obj;
            this.f9316w = null;
        }
    }

    public zzno(int i10, String str, long j, Long l4, Float f10, String str2, String str3, Double d3) {
        this.f9312s = i10;
        this.f9313t = str;
        this.f9314u = j;
        this.f9315v = l4;
        if (i10 == 1) {
            this.f9318y = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f9318y = d3;
        }
        this.f9316w = str2;
        this.f9317x = str3;
    }
}
