package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f8178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Feature[] f8179t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8180u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ConnectionTelemetryConfiguration f8181v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.a(parcel, 1, this.f8178s);
        SafeParcelWriter.g(parcel, 2, this.f8179t, i10);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8180u);
        SafeParcelWriter.d(parcel, 4, this.f8181v, i10);
        SafeParcelWriter.j(parcel, i11);
    }
}
