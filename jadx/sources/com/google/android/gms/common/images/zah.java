package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        int iM = 0;
        int iM2 = 0;
        Uri uri = null;
        int iM3 = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 2) {
                uri = (Uri) SafeParcelReader.e(parcel, i10, Uri.CREATOR);
            } else if (c10 == 3) {
                iM3 = SafeParcelReader.m(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.q(parcel, i10);
            } else {
                iM2 = SafeParcelReader.m(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new WebImage(iM, uri, iM3, iM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new WebImage[i10];
    }
}
