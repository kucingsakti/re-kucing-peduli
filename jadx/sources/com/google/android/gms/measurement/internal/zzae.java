package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzad();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public zzbd f8883A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f8884B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final zzbd f8885C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f8886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f8887t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zzno f8888u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f8889v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f8891x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zzbd f8892y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f8893z;

    public zzae(zzae zzaeVar) {
        Preconditions.i(zzaeVar);
        this.f8886s = zzaeVar.f8886s;
        this.f8887t = zzaeVar.f8887t;
        this.f8888u = zzaeVar.f8888u;
        this.f8889v = zzaeVar.f8889v;
        this.f8890w = zzaeVar.f8890w;
        this.f8891x = zzaeVar.f8891x;
        this.f8892y = zzaeVar.f8892y;
        this.f8893z = zzaeVar.f8893z;
        this.f8883A = zzaeVar.f8883A;
        this.f8884B = zzaeVar.f8884B;
        this.f8885C = zzaeVar.f8885C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.e(parcel, 2, this.f8886s);
        SafeParcelWriter.e(parcel, 3, this.f8887t);
        SafeParcelWriter.d(parcel, 4, this.f8888u, i10);
        long j = this.f8889v;
        SafeParcelWriter.k(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z6 = this.f8890w;
        SafeParcelWriter.k(parcel, 6, 4);
        parcel.writeInt(z6 ? 1 : 0);
        SafeParcelWriter.e(parcel, 7, this.f8891x);
        SafeParcelWriter.d(parcel, 8, this.f8892y, i10);
        long j10 = this.f8893z;
        SafeParcelWriter.k(parcel, 9, 8);
        parcel.writeLong(j10);
        SafeParcelWriter.d(parcel, 10, this.f8883A, i10);
        SafeParcelWriter.k(parcel, 11, 8);
        parcel.writeLong(this.f8884B);
        SafeParcelWriter.d(parcel, 12, this.f8885C, i10);
        SafeParcelWriter.j(parcel, i11);
    }

    public zzae(String str, String str2, zzno zznoVar, long j, boolean z6, String str3, zzbd zzbdVar, long j10, zzbd zzbdVar2, long j11, zzbd zzbdVar3) {
        this.f8886s = str;
        this.f8887t = str2;
        this.f8888u = zznoVar;
        this.f8889v = j;
        this.f8890w = z6;
        this.f8891x = str3;
        this.f8892y = zzbdVar;
        this.f8893z = j10;
        this.f8883A = zzbdVar2;
        this.f8884B = j11;
        this.f8885C = zzbdVar3;
    }
}
