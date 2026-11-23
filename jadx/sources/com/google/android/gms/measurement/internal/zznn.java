package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zznn implements Parcelable.Creator<zzno> {
    @Override // android.os.Parcelable.Creator
    public final zzno createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        int iM = 0;
        String strF = null;
        Long lO = null;
        Float fValueOf = null;
        String strF2 = null;
        String strF3 = null;
        Double dValueOf = null;
        long jN = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iM = SafeParcelReader.m(parcel, i10);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i10);
                    break;
                case 3:
                    jN = SafeParcelReader.n(parcel, i10);
                    break;
                case 4:
                    lO = SafeParcelReader.o(parcel, i10);
                    break;
                case 5:
                    int iP = SafeParcelReader.p(parcel, i10);
                    if (iP != 0) {
                        SafeParcelReader.s(parcel, iP, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                    } else {
                        fValueOf = null;
                    }
                    break;
                case 6:
                    strF2 = SafeParcelReader.f(parcel, i10);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, i10);
                    break;
                case '\b':
                    int iP2 = SafeParcelReader.p(parcel, i10);
                    if (iP2 != 0) {
                        SafeParcelReader.s(parcel, iP2, 8);
                        dValueOf = Double.valueOf(parcel.readDouble());
                    } else {
                        dValueOf = null;
                    }
                    break;
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zzno(iM, strF, jN, lO, fValueOf, strF2, strF3, dValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzno[] newArray(int i10) {
        return new zzno[i10];
    }
}
