package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzaj();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8125s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8126t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8127u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8128v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f8129w;

    public RootTelemetryConfiguration(int i10, int i11, int i12, boolean z6, boolean z10) {
        this.f8125s = i10;
        this.f8126t = z6;
        this.f8127u = z10;
        this.f8128v = i11;
        this.f8129w = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8125s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f8126t ? 1 : 0);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8127u ? 1 : 0);
        SafeParcelWriter.k(parcel, 4, 4);
        parcel.writeInt(this.f8128v);
        SafeParcelWriter.k(parcel, 5, 4);
        parcel.writeInt(this.f8129w);
        SafeParcelWriter.j(parcel, i11);
    }
}
