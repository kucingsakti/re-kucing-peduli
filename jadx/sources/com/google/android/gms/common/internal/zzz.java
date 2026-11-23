package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzz extends zzb implements zzaa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8186b = 0;

    public zzz() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean g0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            IObjectWrapper iObjectWrapperD = ((p205v2.c) this).d();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.c(parcel2, iObjectWrapperD);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(((p205v2.c) this).f15412c);
        return true;
    }
}
