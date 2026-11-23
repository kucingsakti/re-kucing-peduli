package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzdj extends zzbu implements zzdh {
    public zzdj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzdh
    public final void N(long j, Bundle bundle, String str, String str2) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(str);
        parcelG0.writeString(str2);
        zzbw.c(parcelG0, bundle);
        parcelG0.writeLong(j);
        i0(parcelG0, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzdh
    public final int b() {
        Parcel parcelH0 = h0(g0(), 2);
        int i10 = parcelH0.readInt();
        parcelH0.recycle();
        return i10;
    }
}
