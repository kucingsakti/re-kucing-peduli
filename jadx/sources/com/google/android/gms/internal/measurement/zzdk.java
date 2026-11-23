package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdk extends zzbx implements zzdh {
    public zzdk() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean g0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(((BinderC0593s) this).f8412b);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        zzbw.d(parcel);
        ((BinderC0593s) this).N(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }
}
