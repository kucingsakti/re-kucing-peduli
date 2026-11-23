package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbg();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f8923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zzbc f8924t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f8925u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f8926v;

    public zzbd(zzbd zzbdVar, long j) {
        Preconditions.i(zzbdVar);
        this.f8923s = zzbdVar.f8923s;
        this.f8924t = zzbdVar.f8924t;
        this.f8925u = zzbdVar.f8925u;
        this.f8926v = j;
    }

    public final String toString() {
        return "origin=" + this.f8925u + ",name=" + this.f8923s + ",params=" + String.valueOf(this.f8924t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.e(parcel, 2, this.f8923s);
        SafeParcelWriter.d(parcel, 3, this.f8924t, i10);
        SafeParcelWriter.e(parcel, 4, this.f8925u);
        SafeParcelWriter.k(parcel, 5, 8);
        parcel.writeLong(this.f8926v);
        SafeParcelWriter.j(parcel, i11);
    }

    public zzbd(String str, zzbc zzbcVar, String str2, long j) {
        this.f8923s = str;
        this.f8924t = zzbcVar;
        this.f8925u = str2;
        this.f8926v = j;
    }
}
