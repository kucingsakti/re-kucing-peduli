package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzca extends zzbu implements zzbz {
    @Override // com.google.android.gms.internal.measurement.zzbz
    public final Bundle l(Bundle bundle) {
        Parcel parcelG0 = g0();
        zzbw.c(parcelG0, bundle);
        Parcel parcelH0 = h0(parcelG0, 1);
        Bundle bundle2 = (Bundle) zzbw.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle2;
    }
}
