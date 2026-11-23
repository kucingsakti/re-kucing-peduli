package com.google.android.gms.dynamite;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends zza implements IInterface {
    public final IObjectWrapper i0(ObjectWrapper objectWrapper, String str, int i10) {
        Parcel parcelH0 = h0();
        zzc.c(parcelH0, objectWrapper);
        parcelH0.writeString(str);
        parcelH0.writeInt(i10);
        Parcel parcelG0 = g0(parcelH0, 2);
        IObjectWrapper iObjectWrapperH0 = IObjectWrapper.Stub.h0(parcelG0.readStrongBinder());
        parcelG0.recycle();
        return iObjectWrapperH0;
    }

    public final IObjectWrapper j0(ObjectWrapper objectWrapper, String str, int i10, ObjectWrapper objectWrapper2) {
        Parcel parcelH0 = h0();
        zzc.c(parcelH0, objectWrapper);
        parcelH0.writeString(str);
        parcelH0.writeInt(i10);
        zzc.c(parcelH0, objectWrapper2);
        Parcel parcelG0 = g0(parcelH0, 8);
        IObjectWrapper iObjectWrapperH0 = IObjectWrapper.Stub.h0(parcelG0.readStrongBinder());
        parcelG0.recycle();
        return iObjectWrapperH0;
    }

    public final IObjectWrapper k0(ObjectWrapper objectWrapper, String str, int i10) {
        Parcel parcelH0 = h0();
        zzc.c(parcelH0, objectWrapper);
        parcelH0.writeString(str);
        parcelH0.writeInt(i10);
        Parcel parcelG0 = g0(parcelH0, 4);
        IObjectWrapper iObjectWrapperH0 = IObjectWrapper.Stub.h0(parcelG0.readStrongBinder());
        parcelG0.recycle();
        return iObjectWrapperH0;
    }

    public final IObjectWrapper l0(ObjectWrapper objectWrapper, String str, boolean z6, long j) {
        Parcel parcelH0 = h0();
        zzc.c(parcelH0, objectWrapper);
        parcelH0.writeString(str);
        parcelH0.writeInt(z6 ? 1 : 0);
        parcelH0.writeLong(j);
        Parcel parcelG0 = g0(parcelH0, 7);
        IObjectWrapper iObjectWrapperH0 = IObjectWrapper.Stub.h0(parcelG0.readStrongBinder());
        parcelG0.recycle();
        return iObjectWrapperH0;
    }
}
