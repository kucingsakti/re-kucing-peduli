package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzdi extends zzbu implements zzdg {
    public zzdi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzdg
    public final void l(Bundle bundle) {
        Parcel parcelG0 = g0();
        zzbw.c(parcelG0, bundle);
        i0(parcelG0, 1);
    }
}
