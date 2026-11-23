package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzal implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        int iM = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                SafeParcelReader.q(parcel, i10);
            } else {
                iM = SafeParcelReader.m(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zzak(iM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzak[i10];
    }
}
