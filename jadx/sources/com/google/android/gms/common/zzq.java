package com.google.android.gms.common;

import C3.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8280s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8281t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8282u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8283v;

    public zzq(int i10, int i11, String str, boolean z6) {
        this.f8280s = z6;
        this.f8281t = str;
        this.f8282u = b.P(i10) - 1;
        this.f8283v = zzd.a(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8280s ? 1 : 0);
        SafeParcelWriter.e(parcel, 2, this.f8281t);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8282u);
        SafeParcelWriter.k(parcel, 4, 4);
        parcel.writeInt(this.f8283v);
        SafeParcelWriter.j(parcel, i11);
    }
}
