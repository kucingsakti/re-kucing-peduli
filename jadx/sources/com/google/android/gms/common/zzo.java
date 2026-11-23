package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f8274s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8275t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8276u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f8277v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f8278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f8279x;

    public zzo(String str, boolean z6, boolean z10, IBinder iBinder, boolean z11, boolean z12) {
        this.f8274s = str;
        this.f8275t = z6;
        this.f8276u = z10;
        this.f8277v = (Context) ObjectWrapper.i0(IObjectWrapper.Stub.h0(iBinder));
        this.f8278w = z11;
        this.f8279x = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.e(parcel, 1, this.f8274s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f8275t ? 1 : 0);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8276u ? 1 : 0);
        SafeParcelWriter.b(parcel, 4, new ObjectWrapper(this.f8277v));
        SafeParcelWriter.k(parcel, 5, 4);
        parcel.writeInt(this.f8278w ? 1 : 0);
        SafeParcelWriter.k(parcel, 6, 4);
        parcel.writeInt(this.f8279x ? 1 : 0);
        SafeParcelWriter.j(parcel, i11);
    }
}
