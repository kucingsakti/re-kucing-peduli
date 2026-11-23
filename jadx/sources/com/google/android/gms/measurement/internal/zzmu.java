package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zzmu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmu> CREATOR = new zzmt();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f9273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f9274t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f9275u;

    public zzmu(int i10, long j, String str) {
        this.f9273s = str;
        this.f9274t = j;
        this.f9275u = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.e(parcel, 1, this.f9273s);
        SafeParcelWriter.k(parcel, 2, 8);
        parcel.writeLong(this.f9274t);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f9275u);
        SafeParcelWriter.j(parcel, i11);
    }
}
