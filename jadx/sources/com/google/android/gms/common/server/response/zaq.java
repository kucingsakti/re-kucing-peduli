package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        int iM = 0;
        Parcel parcel2 = null;
        zan zanVar = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 2) {
                int iP = SafeParcelReader.p(parcel, i10);
                int iDataPosition = parcel.dataPosition();
                if (iP == 0) {
                    parcel2 = null;
                } else {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.appendFrom(parcel, iDataPosition, iP);
                    parcel.setDataPosition(iDataPosition + iP);
                    parcel2 = parcelObtain;
                }
            } else if (c10 != 3) {
                SafeParcelReader.q(parcel, i10);
            } else {
                zanVar = (zan) SafeParcelReader.e(parcel, i10, zan.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new SafeParcelResponse(iM, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SafeParcelResponse[i10];
    }
}
