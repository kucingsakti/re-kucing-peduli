package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        String strF = null;
        ConnectionResult connectionResult = null;
        int iM = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 2) {
                strF = SafeParcelReader.f(parcel, i10);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i10, PendingIntent.CREATOR);
            } else if (c10 != 4) {
                SafeParcelReader.q(parcel, i10);
            } else {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, i10, ConnectionResult.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new Status(iM, strF, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
