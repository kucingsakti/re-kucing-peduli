package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        Bundle bundleB = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iM = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                bundleB = SafeParcelReader.b(parcel, i10);
            } else if (c10 == 2) {
                featureArr = (Feature[]) SafeParcelReader.h(parcel, i10, Feature.CREATOR);
            } else if (c10 == 3) {
                iM = SafeParcelReader.m(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.q(parcel, i10);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.e(parcel, i10, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iR);
        zzk zzkVar = new zzk();
        zzkVar.f8178s = bundleB;
        zzkVar.f8179t = featureArr;
        zzkVar.f8180u = iM;
        zzkVar.f8181v = connectionTelemetryConfiguration;
        return zzkVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}
