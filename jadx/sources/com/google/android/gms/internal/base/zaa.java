package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class zaa implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f8308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8309c;

    public zaa(IBinder iBinder, String str) {
        this.f8308b = iBinder;
        this.f8309c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8308b;
    }

    public final Parcel g0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f8309c);
        return parcelObtain;
    }

    public final void h0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f8308b.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
