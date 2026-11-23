package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        boolean zK = false;
        int iM = 0;
        String strF = null;
        int iM2 = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                zK = SafeParcelReader.k(parcel, i10);
            } else if (c10 == 2) {
                strF = SafeParcelReader.f(parcel, i10);
            } else if (c10 == 3) {
                iM2 = SafeParcelReader.m(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.q(parcel, i10);
            } else {
                iM = SafeParcelReader.m(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zzq(iM2, iM, strF, zK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
