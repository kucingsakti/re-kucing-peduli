package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zaw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        int iM = 0;
        boolean zK = false;
        boolean zK2 = false;
        IBinder iBinderL = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 2) {
                iBinderL = SafeParcelReader.l(parcel, i10);
            } else if (c10 == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, i10, ConnectionResult.CREATOR);
            } else if (c10 == 4) {
                zK = SafeParcelReader.k(parcel, i10);
            } else if (c10 != 5) {
                SafeParcelReader.q(parcel, i10);
            } else {
                zK2 = SafeParcelReader.k(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zav(iM, iBinderL, connectionResult, zK, zK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zav[i10];
    }
}
