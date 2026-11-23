package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        boolean zK = false;
        boolean zK2 = false;
        boolean zK3 = false;
        boolean zK4 = false;
        String strF = null;
        IBinder iBinderL = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i10);
                    break;
                case 2:
                    zK = SafeParcelReader.k(parcel, i10);
                    break;
                case 3:
                    zK2 = SafeParcelReader.k(parcel, i10);
                    break;
                case 4:
                    iBinderL = SafeParcelReader.l(parcel, i10);
                    break;
                case 5:
                    zK3 = SafeParcelReader.k(parcel, i10);
                    break;
                case 6:
                    zK4 = SafeParcelReader.k(parcel, i10);
                    break;
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zzo(strF, zK, zK2, iBinderL, zK3, zK4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
