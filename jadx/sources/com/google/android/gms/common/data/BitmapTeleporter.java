package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8026s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ParcelFileDescriptor f8027t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8028u;

    public BitmapTeleporter(int i10, ParcelFileDescriptor parcelFileDescriptor, int i11) {
        this.f8026s = i10;
        this.f8027t = parcelFileDescriptor;
        this.f8028u = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (this.f8027t == null) {
            Preconditions.i(null);
            throw null;
        }
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8026s);
        SafeParcelWriter.d(parcel, 2, this.f8027t, i10 | 1);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8028u);
        SafeParcelWriter.j(parcel, i11);
        this.f8027t = null;
    }
}
