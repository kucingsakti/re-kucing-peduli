package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f8318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8319c;

    public zza(IBinder iBinder, String str) {
        this.f8318b = iBinder;
        this.f8319c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8318b;
    }

    public final Parcel g0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f8318b.transact(i10, parcel, parcelObtain, 0);
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

    public final Parcel h0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f8319c);
        return parcelObtain;
    }
}
