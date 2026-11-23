package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrD = null;
        int[] iArrD2 = null;
        boolean zK = false;
        boolean zK2 = false;
        int iM = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.e(parcel, i10, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zK = SafeParcelReader.k(parcel, i10);
                    break;
                case 3:
                    zK2 = SafeParcelReader.k(parcel, i10);
                    break;
                case 4:
                    iArrD = SafeParcelReader.d(parcel, i10);
                    break;
                case 5:
                    iM = SafeParcelReader.m(parcel, i10);
                    break;
                case 6:
                    iArrD2 = SafeParcelReader.d(parcel, i10);
                    break;
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zK, zK2, iArrD, iM, iArrD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionTelemetryConfiguration[i10];
    }
}
