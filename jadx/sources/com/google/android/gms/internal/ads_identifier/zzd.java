package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzd extends zza implements zzf {
    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelG0 = g0(parcelObtain, 1);
        String string = parcelG0.readString();
        parcelG0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean d() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelG0 = g0(parcelObtain, 6);
        int i10 = zzc.a;
        boolean z6 = parcelG0.readInt() != 0;
        parcelG0.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean e() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i10 = zzc.a;
        parcelObtain.writeInt(1);
        Parcel parcelG0 = g0(parcelObtain, 2);
        boolean z6 = parcelG0.readInt() != 0;
        parcelG0.recycle();
        return z6;
    }
}
