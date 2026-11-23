package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zzdo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdo> CREATOR = new zzdn();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f8557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f8558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8559u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f8560v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f8561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f8562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Bundle f8563y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f8564z;

    public zzdo(long j, long j10, boolean z6, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f8557s = j;
        this.f8558t = j10;
        this.f8559u = z6;
        this.f8560v = str;
        this.f8561w = str2;
        this.f8562x = str3;
        this.f8563y = bundle;
        this.f8564z = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 8);
        parcel.writeLong(this.f8557s);
        SafeParcelWriter.k(parcel, 2, 8);
        parcel.writeLong(this.f8558t);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8559u ? 1 : 0);
        SafeParcelWriter.e(parcel, 4, this.f8560v);
        SafeParcelWriter.e(parcel, 5, this.f8561w);
        SafeParcelWriter.e(parcel, 6, this.f8562x);
        SafeParcelWriter.a(parcel, 7, this.f8563y);
        SafeParcelWriter.e(parcel, 8, this.f8564z);
        SafeParcelWriter.j(parcel, i11);
    }
}
