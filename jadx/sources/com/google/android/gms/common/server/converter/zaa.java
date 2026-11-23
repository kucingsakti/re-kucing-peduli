package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final StringToIntConverter f8209t;

    public zaa(int i10, StringToIntConverter stringToIntConverter) {
        this.f8208s = i10;
        this.f8209t = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8208s);
        SafeParcelWriter.d(parcel, 2, this.f8209t, i10);
        SafeParcelWriter.j(parcel, i11);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f8208s = 1;
        this.f8209t = stringToIntConverter;
    }
}
