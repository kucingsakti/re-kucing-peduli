package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8160s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8161t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8162u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Scope[] f8163v;

    public zax(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f8160s = i10;
        this.f8161t = i11;
        this.f8162u = i12;
        this.f8163v = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8160s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f8161t);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8162u);
        SafeParcelWriter.g(parcel, 4, this.f8163v, i10);
        SafeParcelWriter.j(parcel, i11);
    }
}
