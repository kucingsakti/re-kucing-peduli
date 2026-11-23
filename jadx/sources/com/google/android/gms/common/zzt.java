package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        boolean zK = false;
        String strF = null;
        IBinder iBinderL = null;
        boolean zK2 = false;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strF = SafeParcelReader.f(parcel, i10);
            } else if (c10 == 2) {
                iBinderL = SafeParcelReader.l(parcel, i10);
            } else if (c10 == 3) {
                zK = SafeParcelReader.k(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.q(parcel, i10);
            } else {
                zK2 = SafeParcelReader.k(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zzs(strF, iBinderL, zK, zK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
