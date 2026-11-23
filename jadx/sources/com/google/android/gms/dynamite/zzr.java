package com.google.android.gms.dynamite;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends zza implements IInterface {
    public final IObjectWrapper i0(ObjectWrapper objectWrapper, String str, int i10, ObjectWrapper objectWrapper2) {
        Parcel parcelH0 = h0();
        zzc.c(parcelH0, objectWrapper);
        parcelH0.writeString(str);
        parcelH0.writeInt(i10);
        zzc.c(parcelH0, objectWrapper2);
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
        Parcel parcelG0 = g0(parcelH0, 3);
        IObjectWrapper iObjectWrapperH0 = IObjectWrapper.Stub.h0(parcelG0.readStrongBinder());
        parcelG0.recycle();
        return iObjectWrapperH0;
    }
}
