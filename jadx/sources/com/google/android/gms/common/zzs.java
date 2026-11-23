package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import p205v2.d;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f8284s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f8285t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8286u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f8287v;

    public zzs(String str, d dVar, boolean z6, boolean z10) {
        this.f8284s = str;
        this.f8285t = dVar;
        this.f8286u = z6;
        this.f8287v = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.e(parcel, 1, this.f8284s);
        d dVar = this.f8285t;
        if (dVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            dVar = null;
        }
        SafeParcelWriter.b(parcel, 2, dVar);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8286u ? 1 : 0);
        SafeParcelWriter.k(parcel, 4, 4);
        parcel.writeInt(this.f8287v ? 1 : 0);
        SafeParcelWriter.j(parcel, i11);
    }

    public zzs(String str, IBinder iBinder, boolean z6, boolean z10) {
        this.f8284s = str;
        d dVar = null;
        if (iBinder != null) {
            try {
                int i10 = zzz.f8186b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                IObjectWrapper iObjectWrapperD = (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.zzaa ? (com.google.android.gms.common.internal.zzaa) iInterfaceQueryLocalInterface : new zzy(iBinder, "com.google.android.gms.common.internal.ICertData")).d();
                byte[] bArr = iObjectWrapperD == null ? null : (byte[]) ObjectWrapper.i0(iObjectWrapperD);
                if (bArr != null) {
                    dVar = new d(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f8285t = dVar;
        this.f8286u = z6;
        this.f8287v = z10;
    }
}
