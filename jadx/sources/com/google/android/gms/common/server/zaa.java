package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        int iM = 0;
        String strF = null;
        int iM2 = 0;
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
                iM2 = SafeParcelReader.m(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new FavaDiagnosticsEntity(iM, strF, iM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new FavaDiagnosticsEntity[i10];
    }
}
