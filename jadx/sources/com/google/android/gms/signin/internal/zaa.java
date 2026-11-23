package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9371t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Intent f9372u;

    public zaa() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status n() {
        return this.f9371t == 0 ? Status.f7876w : Status.f7879z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f9370s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f9371t);
        SafeParcelWriter.d(parcel, 3, this.f9372u, i10);
        SafeParcelWriter.j(parcel, i11);
    }

    public zaa(int i10, int i11, Intent intent) {
        this.f9370s = i10;
        this.f9371t = i11;
        this.f9372u = intent;
    }
}
