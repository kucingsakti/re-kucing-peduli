package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzfn extends com.google.android.gms.internal.measurement.zzbu implements zzfl {
    public zzfn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void A(zzno zznoVar, zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zznoVar);
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        i0(parcelG0, 2);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final byte[] C(zzbd zzbdVar, String str) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzbdVar);
        parcelG0.writeString(str);
        Parcel parcelH0 = h0(parcelG0, 9);
        byte[] bArrCreateByteArray = parcelH0.createByteArray();
        parcelH0.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final zzaj G(zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        Parcel parcelH0 = h0(parcelG0, 21);
        zzaj zzajVar = (zzaj) com.google.android.gms.internal.measurement.zzbw.a(parcelH0, zzaj.CREATOR);
        parcelH0.recycle();
        return zzajVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List H(String str, String str2, String str3, boolean z6) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(null);
        parcelG0.writeString(str2);
        parcelG0.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.zzbw.a;
        parcelG0.writeInt(z6 ? 1 : 0);
        Parcel parcelH0 = h0(parcelG0, 15);
        ArrayList arrayListCreateTypedArrayList = parcelH0.createTypedArrayList(zzno.CREATOR);
        parcelH0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void I(zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        i0(parcelG0, 20);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void J(zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        i0(parcelG0, 26);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List O(String str, String str2, boolean z6, zzo zzoVar) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(str);
        parcelG0.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.zzbw.a;
        parcelG0.writeInt(z6 ? 1 : 0);
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        Parcel parcelH0 = h0(parcelG0, 14);
        ArrayList arrayListCreateTypedArrayList = parcelH0.createTypedArrayList(zzno.CREATOR);
        parcelH0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void P(zzbd zzbdVar, zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzbdVar);
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        i0(parcelG0, 1);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final String T(zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        Parcel parcelH0 = h0(parcelG0, 11);
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void W(zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        i0(parcelG0, 6);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void X(zzae zzaeVar, zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzaeVar);
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        i0(parcelG0, 12);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void Z(long j, String str, String str2, String str3) {
        Parcel parcelG0 = g0();
        parcelG0.writeLong(j);
        parcelG0.writeString(str);
        parcelG0.writeString(str2);
        parcelG0.writeString(str3);
        i0(parcelG0, 10);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void b0(zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        i0(parcelG0, 4);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List c0(String str, String str2, String str3) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(null);
        parcelG0.writeString(str2);
        parcelG0.writeString(str3);
        Parcel parcelH0 = h0(parcelG0, 17);
        ArrayList arrayListCreateTypedArrayList = parcelH0.createTypedArrayList(zzae.CREATOR);
        parcelH0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void d0(zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        i0(parcelG0, 25);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List o(Bundle bundle, zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, bundle);
        Parcel parcelH0 = h0(parcelG0, 24);
        ArrayList arrayListCreateTypedArrayList = parcelH0.createTypedArrayList(zzmu.CREATOR);
        parcelH0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List v(String str, String str2, zzo zzoVar) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(str);
        parcelG0.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        Parcel parcelH0 = h0(parcelG0, 16);
        ArrayList arrayListCreateTypedArrayList = parcelH0.createTypedArrayList(zzae.CREATOR);
        parcelH0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void y(zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        i0(parcelG0, 18);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    /* JADX INFO: renamed from: o */
    public final void mo5o(Bundle bundle, zzo zzoVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, bundle);
        com.google.android.gms.internal.measurement.zzbw.c(parcelG0, zzoVar);
        i0(parcelG0, 19);
    }
}
