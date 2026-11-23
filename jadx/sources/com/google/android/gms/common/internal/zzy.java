package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes.dex */
public final class zzy extends zza implements zzaa {
    @Override // com.google.android.gms.common.internal.zzaa
    public final int c() {
        Parcel parcelG0 = g0(h0(), 2);
        int i10 = parcelG0.readInt();
        parcelG0.recycle();
        return i10;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper d() {
        Parcel parcelG0 = g0(h0(), 1);
        IObjectWrapper iObjectWrapperH0 = IObjectWrapper.Stub.h0(parcelG0.readStrongBinder());
        parcelG0.recycle();
        return iObjectWrapperH0;
    }
}
