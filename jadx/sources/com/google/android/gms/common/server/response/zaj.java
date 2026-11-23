package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;

/* JADX INFO: loaded from: classes.dex */
public final class zaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        String strF = null;
        String strF2 = null;
        zaa zaaVar = null;
        int iM = 0;
        int iM2 = 0;
        boolean zK = false;
        int iM3 = 0;
        boolean zK2 = false;
        int iM4 = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iM = SafeParcelReader.m(parcel, i10);
                    break;
                case 2:
                    iM2 = SafeParcelReader.m(parcel, i10);
                    break;
                case 3:
                    zK = SafeParcelReader.k(parcel, i10);
                    break;
                case 4:
                    iM3 = SafeParcelReader.m(parcel, i10);
                    break;
                case 5:
                    zK2 = SafeParcelReader.k(parcel, i10);
                    break;
                case 6:
                    strF = SafeParcelReader.f(parcel, i10);
                    break;
                case 7:
                    iM4 = SafeParcelReader.m(parcel, i10);
                    break;
                case '\b':
                    strF2 = SafeParcelReader.f(parcel, i10);
                    break;
                case '\t':
                    zaaVar = (zaa) SafeParcelReader.e(parcel, i10, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new FastJsonResponse.Field(iM, iM2, zK, iM3, zK2, strF, iM4, strF2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new FastJsonResponse.Field[i10];
    }
}
