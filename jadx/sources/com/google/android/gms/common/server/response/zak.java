package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zak implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        String strF = null;
        int iM = 0;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 2) {
                strF = SafeParcelReader.f(parcel, i10);
            } else if (c10 != 3) {
                SafeParcelReader.q(parcel, i10);
            } else {
                field = (FastJsonResponse.Field) SafeParcelReader.e(parcel, i10, FastJsonResponse.Field.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zam(iM, strF, field);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zam[i10];
    }
}
