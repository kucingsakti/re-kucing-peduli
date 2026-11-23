package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                SafeParcelReader.q(parcel, i10);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, i10, Intent.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CloudMessage[i10];
    }
}
