package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        ArrayList arrayListI = null;
        String strF = null;
        boolean zK = false;
        String strF2 = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                arrayListI = SafeParcelReader.i(parcel, i10, Feature.CREATOR);
            } else if (c10 == 2) {
                zK = SafeParcelReader.k(parcel, i10);
            } else if (c10 == 3) {
                strF2 = SafeParcelReader.f(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.q(parcel, i10);
            } else {
                strF = SafeParcelReader.f(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new ApiFeatureRequest(arrayListI, zK, strF2, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ApiFeatureRequest[i10];
    }
}
