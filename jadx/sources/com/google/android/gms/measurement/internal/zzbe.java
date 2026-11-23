package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final zzbc createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        Bundle bundleB = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            if (((char) i10) != 2) {
                SafeParcelReader.q(parcel, i10);
            } else {
                bundleB = SafeParcelReader.b(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zzbc(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbc[] newArray(int i10) {
        return new zzbc[i10];
    }
}
