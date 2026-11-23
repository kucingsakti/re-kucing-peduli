package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class c implements IGmsServiceBroker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f8137b;

    public c(IBinder iBinder) {
        this.f8137b = iBinder;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void D(zzd zzdVar, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(zzdVar);
            parcelObtain.writeInt(1);
            zzn.a(getServiceRequest, parcelObtain, 0);
            this.f8137b.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8137b;
    }
}
