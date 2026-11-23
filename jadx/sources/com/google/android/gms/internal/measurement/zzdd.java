package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class zzdd extends zzbu implements zzdb {
    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(str);
        parcelG0.writeLong(j);
        i0(parcelG0, 23);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(str);
        parcelG0.writeString(str2);
        zzbw.c(parcelG0, bundle);
        i0(parcelG0, 9);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(str);
        parcelG0.writeLong(j);
        i0(parcelG0, 24);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void generateEventId(zzdg zzdgVar) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, zzdgVar);
        i0(parcelG0, 22);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getCachedAppInstanceId(zzdg zzdgVar) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, zzdgVar);
        i0(parcelG0, 19);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getConditionalUserProperties(String str, String str2, zzdg zzdgVar) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(str);
        parcelG0.writeString(str2);
        zzbw.b(parcelG0, zzdgVar);
        i0(parcelG0, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getCurrentScreenClass(zzdg zzdgVar) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, zzdgVar);
        i0(parcelG0, 17);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getCurrentScreenName(zzdg zzdgVar) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, zzdgVar);
        i0(parcelG0, 16);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getGmpAppId(zzdg zzdgVar) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, zzdgVar);
        i0(parcelG0, 21);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getMaxUserProperties(String str, zzdg zzdgVar) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(str);
        zzbw.b(parcelG0, zzdgVar);
        i0(parcelG0, 6);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getUserProperties(String str, String str2, boolean z6, zzdg zzdgVar) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(str);
        parcelG0.writeString(str2);
        ClassLoader classLoader = zzbw.a;
        parcelG0.writeInt(z6 ? 1 : 0);
        zzbw.b(parcelG0, zzdgVar);
        i0(parcelG0, 5);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void initialize(IObjectWrapper iObjectWrapper, zzdo zzdoVar, long j) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, iObjectWrapper);
        zzbw.c(parcelG0, zzdoVar);
        parcelG0.writeLong(j);
        i0(parcelG0, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void logEvent(String str, String str2, Bundle bundle, boolean z6, boolean z10, long j) {
        Parcel parcelG0 = g0();
        parcelG0.writeString(str);
        parcelG0.writeString(str2);
        zzbw.c(parcelG0, bundle);
        parcelG0.writeInt(1);
        parcelG0.writeInt(1);
        parcelG0.writeLong(j);
        i0(parcelG0, 2);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelG0 = g0();
        parcelG0.writeInt(5);
        parcelG0.writeString("Error with data collection. Data lost.");
        zzbw.b(parcelG0, iObjectWrapper);
        zzbw.b(parcelG0, iObjectWrapper2);
        zzbw.b(parcelG0, iObjectWrapper3);
        i0(parcelG0, 33);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, iObjectWrapper);
        zzbw.c(parcelG0, bundle);
        parcelG0.writeLong(j);
        i0(parcelG0, 27);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, iObjectWrapper);
        parcelG0.writeLong(j);
        i0(parcelG0, 28);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, iObjectWrapper);
        parcelG0.writeLong(j);
        i0(parcelG0, 29);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, iObjectWrapper);
        parcelG0.writeLong(j);
        i0(parcelG0, 30);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdg zzdgVar, long j) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, iObjectWrapper);
        zzbw.b(parcelG0, zzdgVar);
        parcelG0.writeLong(j);
        i0(parcelG0, 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, iObjectWrapper);
        parcelG0.writeLong(j);
        i0(parcelG0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, iObjectWrapper);
        parcelG0.writeLong(j);
        i0(parcelG0, 26);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void registerOnMeasurementEventListener(zzdh zzdhVar) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, zzdhVar);
        i0(parcelG0, 35);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelG0 = g0();
        zzbw.c(parcelG0, bundle);
        parcelG0.writeLong(j);
        i0(parcelG0, 8);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) {
        Parcel parcelG0 = g0();
        zzbw.b(parcelG0, iObjectWrapper);
        parcelG0.writeString(str);
        parcelG0.writeString(str2);
        parcelG0.writeLong(j);
        i0(parcelG0, 15);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setDataCollectionEnabled(boolean z6) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z6, long j) {
        Parcel parcelG0 = g0();
        parcelG0.writeString("fcm");
        parcelG0.writeString("_ln");
        zzbw.b(parcelG0, iObjectWrapper);
        parcelG0.writeInt(1);
        parcelG0.writeLong(j);
        i0(parcelG0, 4);
    }
}
