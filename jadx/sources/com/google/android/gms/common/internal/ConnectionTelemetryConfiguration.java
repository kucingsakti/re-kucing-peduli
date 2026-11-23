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
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzm();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RootTelemetryConfiguration f8086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8087t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8088u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f8089v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f8090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f8091x;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z6, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f8086s = rootTelemetryConfiguration;
        this.f8087t = z6;
        this.f8088u = z10;
        this.f8089v = iArr;
        this.f8090w = i10;
        this.f8091x = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.d(parcel, 1, this.f8086s, i10);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f8087t ? 1 : 0);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8088u ? 1 : 0);
        int[] iArr = this.f8089v;
        if (iArr != null) {
            int i12 = SafeParcelWriter.i(parcel, 4);
            parcel.writeIntArray(iArr);
            SafeParcelWriter.j(parcel, i12);
        }
        SafeParcelWriter.k(parcel, 5, 4);
        parcel.writeInt(this.f8090w);
        int[] iArr2 = this.f8091x;
        if (iArr2 != null) {
            int i13 = SafeParcelWriter.i(parcel, 6);
            parcel.writeIntArray(iArr2);
            SafeParcelWriter.j(parcel, i13);
        }
        SafeParcelWriter.j(parcel, i11);
    }
}
