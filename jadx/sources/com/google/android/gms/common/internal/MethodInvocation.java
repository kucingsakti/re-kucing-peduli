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
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f8113A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8114s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8115t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8116u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f8117v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f8118w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f8119x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f8120y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f8121z;

    public MethodInvocation(int i10, int i11, int i12, long j, long j10, String str, String str2, int i13, int i14) {
        this.f8114s = i10;
        this.f8115t = i11;
        this.f8116u = i12;
        this.f8117v = j;
        this.f8118w = j10;
        this.f8119x = str;
        this.f8120y = str2;
        this.f8121z = i13;
        this.f8113A = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8114s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f8115t);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8116u);
        SafeParcelWriter.k(parcel, 4, 8);
        parcel.writeLong(this.f8117v);
        SafeParcelWriter.k(parcel, 5, 8);
        parcel.writeLong(this.f8118w);
        SafeParcelWriter.e(parcel, 6, this.f8119x);
        SafeParcelWriter.e(parcel, 7, this.f8120y);
        SafeParcelWriter.k(parcel, 8, 4);
        parcel.writeInt(this.f8121z);
        SafeParcelWriter.k(parcel, 9, 4);
        parcel.writeInt(this.f8113A);
        SafeParcelWriter.j(parcel, i11);
    }
}
