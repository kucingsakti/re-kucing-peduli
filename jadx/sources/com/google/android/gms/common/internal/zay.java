package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zay implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        Scope[] scopeArr = null;
        int iM = 0;
        int iM2 = 0;
        int iM3 = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 2) {
                iM2 = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 3) {
                iM3 = SafeParcelReader.m(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.q(parcel, i10);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.h(parcel, i10, Scope.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zax(iM, iM2, iM3, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zax[i10];
    }
}
