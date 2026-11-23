package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes.dex */
public final class zzae extends zza implements zzag {
    @Override // com.google.android.gms.common.internal.zzag
    public final boolean E(zzs zzsVar, ObjectWrapper objectWrapper) {
        Parcel parcelH0 = h0();
        int i10 = com.google.android.gms.internal.common.zzc.a;
        parcelH0.writeInt(1);
        zzsVar.writeToParcel(parcelH0, 0);
        com.google.android.gms.internal.common.zzc.c(parcelH0, objectWrapper);
        Parcel parcelG0 = g0(parcelH0, 5);
        boolean z6 = parcelG0.readInt() != 0;
        parcelG0.recycle();
        return z6;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq a0(com.google.android.gms.common.zzo zzoVar) {
        Parcel parcelH0 = h0();
        int i10 = com.google.android.gms.internal.common.zzc.a;
        parcelH0.writeInt(1);
        zzoVar.writeToParcel(parcelH0, 0);
        Parcel parcelG0 = g0(parcelH0, 6);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) com.google.android.gms.internal.common.zzc.a(parcelG0, com.google.android.gms.common.zzq.CREATOR);
        parcelG0.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean h() {
        Parcel parcelG0 = g0(h0(), 7);
        int i10 = com.google.android.gms.internal.common.zzc.a;
        boolean z6 = parcelG0.readInt() != 0;
        parcelG0.recycle();
        return z6;
    }
}
