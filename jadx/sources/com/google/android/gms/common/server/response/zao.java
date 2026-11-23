package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zao implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        ArrayList arrayListI = null;
        int iM = 0;
        String strF = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 2) {
                arrayListI = SafeParcelReader.i(parcel, i10, zal.CREATOR);
            } else if (c10 != 3) {
                SafeParcelReader.q(parcel, i10);
            } else {
                strF = SafeParcelReader.f(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zan(iM, strF, arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zan[i10];
    }
}
