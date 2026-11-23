package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class zzbu implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f8482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8483c;

    public zzbu(IBinder iBinder, String str) {
        this.f8482b = iBinder;
        this.f8483c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8482b;
    }

    public final Parcel g0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f8483c);
        return parcelObtain;
    }

    public final Parcel h0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f8482b.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public final void i0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f8482b.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
