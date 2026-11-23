package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new zaa();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8204u;

    public FavaDiagnosticsEntity(int i10, String str, int i11) {
        this.f8202s = i10;
        this.f8203t = str;
        this.f8204u = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8202s);
        SafeParcelWriter.e(parcel, 2, this.f8203t);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8204u);
        SafeParcelWriter.j(parcel, i11);
    }
}
