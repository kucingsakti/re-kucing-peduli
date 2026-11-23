package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final IBinder f8156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ConnectionResult f8157u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f8158v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f8159w;

    public zav(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z6, boolean z10) {
        this.f8155s = i10;
        this.f8156t = iBinder;
        this.f8157u = connectionResult;
        this.f8158v = z6;
        this.f8159w = z10;
    }

    public final boolean equals(Object obj) {
        Object zzwVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (!this.f8157u.equals(zavVar.f8157u)) {
            return false;
        }
        Object zzwVar2 = null;
        IBinder iBinder = this.f8156t;
        if (iBinder == null) {
            zzwVar = null;
        } else {
            int i10 = IAccountAccessor.Stub.f8112b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            zzwVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzw(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = zavVar.f8156t;
        if (iBinder2 != null) {
            int i11 = IAccountAccessor.Stub.f8112b;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            zzwVar2 = iInterfaceQueryLocalInterface2 instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface2 : new zzw(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return Objects.a(zzwVar, zzwVar2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8155s);
        SafeParcelWriter.b(parcel, 2, this.f8156t);
        SafeParcelWriter.d(parcel, 3, this.f8157u, i10);
        SafeParcelWriter.k(parcel, 4, 4);
        parcel.writeInt(this.f8158v ? 1 : 0);
        SafeParcelWriter.k(parcel, 5, 4);
        parcel.writeInt(this.f8159w ? 1 : 0);
        SafeParcelWriter.j(parcel, i11);
    }
}
