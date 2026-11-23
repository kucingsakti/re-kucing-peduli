package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConnectionResult f9378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final zav f9379u;

    public zak(int i10, ConnectionResult connectionResult, zav zavVar) {
        this.f9377s = i10;
        this.f9378t = connectionResult;
        this.f9379u = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f9377s);
        SafeParcelWriter.d(parcel, 2, this.f9378t, i10);
        SafeParcelWriter.d(parcel, 3, this.f9379u, i10);
        SafeParcelWriter.j(parcel, i11);
    }
}
