package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        int iM = 0;
        int iM2 = 0;
        int iM3 = 0;
        Long lO = null;
        Long lO2 = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 2) {
                iM2 = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 3) {
                lO = SafeParcelReader.o(parcel, i10);
            } else if (c10 == 4) {
                lO2 = SafeParcelReader.o(parcel, i10);
            } else if (c10 != 5) {
                SafeParcelReader.q(parcel, i10);
            } else {
                iM3 = SafeParcelReader.m(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new ModuleInstallStatusUpdate(iM, iM2, lO, lO2, iM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallStatusUpdate[i10];
    }
}
