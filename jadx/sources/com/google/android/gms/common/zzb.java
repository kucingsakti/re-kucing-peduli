package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        PendingIntent pendingIntent = null;
        int iM = 0;
        int iM2 = 0;
        String strF = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 2) {
                iM2 = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i10, PendingIntent.CREATOR);
            } else if (c10 != 4) {
                SafeParcelReader.q(parcel, i10);
            } else {
                strF = SafeParcelReader.f(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new ConnectionResult(iM, iM2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionResult[i10];
    }
}
