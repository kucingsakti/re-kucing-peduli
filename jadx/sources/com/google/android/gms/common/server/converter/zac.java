package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8211t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8212u;

    public zac(int i10, String str, int i11) {
        this.f8210s = i10;
        this.f8211t = str;
        this.f8212u = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8210s);
        SafeParcelWriter.e(parcel, 2, this.f8211t);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8212u);
        SafeParcelWriter.j(parcel, i11);
    }

    public zac(String str, int i10) {
        this.f8210s = 1;
        this.f8211t = str;
        this.f8212u = i10;
    }
}
