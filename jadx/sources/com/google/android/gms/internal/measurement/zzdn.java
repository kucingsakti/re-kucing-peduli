package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzdn implements Parcelable.Creator<zzdo> {
    @Override // android.os.Parcelable.Creator
    public final zzdo createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        long jN = 0;
        long jN2 = 0;
        boolean zK = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleB = null;
        String strF4 = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    jN = SafeParcelReader.n(parcel, i10);
                    break;
                case 2:
                    jN2 = SafeParcelReader.n(parcel, i10);
                    break;
                case 3:
                    zK = SafeParcelReader.k(parcel, i10);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i10);
                    break;
                case 5:
                    strF2 = SafeParcelReader.f(parcel, i10);
                    break;
                case 6:
                    strF3 = SafeParcelReader.f(parcel, i10);
                    break;
                case 7:
                    bundleB = SafeParcelReader.b(parcel, i10);
                    break;
                case '\b':
                    strF4 = SafeParcelReader.f(parcel, i10);
                    break;
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zzdo(jN, jN2, zK, strF, strF2, strF3, bundleB, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdo[] newArray(int i10) {
        return new zzdo[i10];
    }
}
