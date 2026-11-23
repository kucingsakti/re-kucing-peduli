package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: loaded from: classes.dex */
public final class zal implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        ConnectionResult connectionResult = null;
        int iM = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, i10, ConnectionResult.CREATOR);
            } else if (c10 != 3) {
                SafeParcelReader.q(parcel, i10);
            } else {
                zavVar = (zav) SafeParcelReader.e(parcel, i10, zav.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zak(iM, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zak[i10];
    }
}
