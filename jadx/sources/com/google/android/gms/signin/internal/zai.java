package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new zaj();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zat f9376t;

    public zai(int i10, zat zatVar) {
        this.f9375s = i10;
        this.f9376t = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f9375s);
        SafeParcelWriter.d(parcel, 2, this.f9376t, i10);
        SafeParcelWriter.j(parcel, i11);
    }
}
