package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzmt implements Parcelable.Creator<zzmu> {
    @Override // android.os.Parcelable.Creator
    public final zzmu createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        String strF = null;
        long jN = 0;
        int iM = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strF = SafeParcelReader.f(parcel, i10);
            } else if (c10 == 2) {
                jN = SafeParcelReader.n(parcel, i10);
            } else if (c10 != 3) {
                SafeParcelReader.q(parcel, i10);
            } else {
                iM = SafeParcelReader.m(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zzmu(iM, jN, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmu[] newArray(int i10) {
        return new zzmu[i10];
    }
}
