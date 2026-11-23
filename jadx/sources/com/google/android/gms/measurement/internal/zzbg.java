package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzbg implements Parcelable.Creator<zzbd> {
    @Override // android.os.Parcelable.Creator
    public final zzbd createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        String strF = null;
        zzbc zzbcVar = null;
        String strF2 = null;
        long jN = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                strF = SafeParcelReader.f(parcel, i10);
            } else if (c10 == 3) {
                zzbcVar = (zzbc) SafeParcelReader.e(parcel, i10, zzbc.CREATOR);
            } else if (c10 == 4) {
                strF2 = SafeParcelReader.f(parcel, i10);
            } else if (c10 != 5) {
                SafeParcelReader.q(parcel, i10);
            } else {
                jN = SafeParcelReader.n(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zzbd(strF, zzbcVar, strF2, jN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbd[] newArray(int i10) {
        return new zzbd[i10];
    }
}
