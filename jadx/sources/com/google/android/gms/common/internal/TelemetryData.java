package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaab();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f8132t;

    public TelemetryData(List list, int i10) {
        this.f8131s = i10;
        this.f8132t = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8131s);
        SafeParcelWriter.h(parcel, 2, this.f8132t);
        SafeParcelWriter.j(parcel, i11);
    }
}
