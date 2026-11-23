package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class zam extends com.google.android.gms.internal.base.zaa implements IInterface {
    public final IObjectWrapper i0(ObjectWrapper objectWrapper, zax zaxVar) {
        Parcel parcelG0 = g0();
        com.google.android.gms.internal.base.zac.d(parcelG0, objectWrapper);
        com.google.android.gms.internal.base.zac.c(parcelG0, zaxVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f8308b.transact(2, parcelG0, parcelObtain, 0);
                parcelObtain.readException();
                parcelG0.recycle();
                IObjectWrapper iObjectWrapperH0 = IObjectWrapper.Stub.h0(parcelObtain.readStrongBinder());
                parcelObtain.recycle();
                return iObjectWrapperH0;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcelG0.recycle();
            throw th;
        }
    }
}
