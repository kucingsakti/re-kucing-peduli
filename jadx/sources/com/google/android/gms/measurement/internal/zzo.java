package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzn();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f9327A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f9328B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f9329C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f9330D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f9331E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f9332F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f9333G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f9334H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f9335I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Boolean f9336J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final long f9337K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final List f9338L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final String f9339M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final String f9340N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final String f9341O;
    public final String P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final boolean f9342Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final long f9343R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f9344S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final String f9345T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f9346U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final long f9347V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final String f9348W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final String f9349X;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f9350s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f9351t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f9352u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f9353v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f9354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f9355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f9356y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f9357z;

    public zzo(String str, String str2, String str3, long j, String str4, long j10, long j11, String str5, boolean z6, boolean z10, String str6, long j12, int i10, boolean z11, boolean z12, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, boolean z13, long j14, int i11, String str11, int i12, long j15, String str12, String str13) {
        Preconditions.e(str);
        this.f9350s = str;
        this.f9351t = TextUtils.isEmpty(str2) ? null : str2;
        this.f9352u = str3;
        this.f9328B = j;
        this.f9353v = str4;
        this.f9354w = j10;
        this.f9355x = j11;
        this.f9356y = str5;
        this.f9357z = z6;
        this.f9327A = z10;
        this.f9329C = str6;
        this.f9330D = 0L;
        this.f9331E = j12;
        this.f9332F = i10;
        this.f9333G = z11;
        this.f9334H = z12;
        this.f9335I = str7;
        this.f9336J = bool;
        this.f9337K = j13;
        this.f9338L = list;
        this.f9339M = null;
        this.f9340N = str8;
        this.f9341O = str9;
        this.P = str10;
        this.f9342Q = z13;
        this.f9343R = j14;
        this.f9344S = i11;
        this.f9345T = str11;
        this.f9346U = i12;
        this.f9347V = j15;
        this.f9348W = str12;
        this.f9349X = str13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.e(parcel, 2, this.f9350s);
        SafeParcelWriter.e(parcel, 3, this.f9351t);
        SafeParcelWriter.e(parcel, 4, this.f9352u);
        SafeParcelWriter.e(parcel, 5, this.f9353v);
        SafeParcelWriter.k(parcel, 6, 8);
        parcel.writeLong(this.f9354w);
        SafeParcelWriter.k(parcel, 7, 8);
        parcel.writeLong(this.f9355x);
        SafeParcelWriter.e(parcel, 8, this.f9356y);
        SafeParcelWriter.k(parcel, 9, 4);
        parcel.writeInt(this.f9357z ? 1 : 0);
        SafeParcelWriter.k(parcel, 10, 4);
        parcel.writeInt(this.f9327A ? 1 : 0);
        SafeParcelWriter.k(parcel, 11, 8);
        parcel.writeLong(this.f9328B);
        SafeParcelWriter.e(parcel, 12, this.f9329C);
        SafeParcelWriter.k(parcel, 13, 8);
        parcel.writeLong(this.f9330D);
        SafeParcelWriter.k(parcel, 14, 8);
        parcel.writeLong(this.f9331E);
        SafeParcelWriter.k(parcel, 15, 4);
        parcel.writeInt(this.f9332F);
        SafeParcelWriter.k(parcel, 16, 4);
        parcel.writeInt(this.f9333G ? 1 : 0);
        SafeParcelWriter.k(parcel, 18, 4);
        parcel.writeInt(this.f9334H ? 1 : 0);
        SafeParcelWriter.e(parcel, 19, this.f9335I);
        Boolean bool = this.f9336J;
        if (bool != null) {
            SafeParcelWriter.k(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        SafeParcelWriter.k(parcel, 22, 8);
        parcel.writeLong(this.f9337K);
        SafeParcelWriter.f(parcel, 23, this.f9338L);
        SafeParcelWriter.e(parcel, 24, this.f9339M);
        SafeParcelWriter.e(parcel, 25, this.f9340N);
        SafeParcelWriter.e(parcel, 26, this.f9341O);
        SafeParcelWriter.e(parcel, 27, this.P);
        SafeParcelWriter.k(parcel, 28, 4);
        parcel.writeInt(this.f9342Q ? 1 : 0);
        SafeParcelWriter.k(parcel, 29, 8);
        parcel.writeLong(this.f9343R);
        SafeParcelWriter.k(parcel, 30, 4);
        parcel.writeInt(this.f9344S);
        SafeParcelWriter.e(parcel, 31, this.f9345T);
        SafeParcelWriter.k(parcel, 32, 4);
        parcel.writeInt(this.f9346U);
        SafeParcelWriter.k(parcel, 34, 8);
        parcel.writeLong(this.f9347V);
        SafeParcelWriter.e(parcel, 35, this.f9348W);
        SafeParcelWriter.e(parcel, 36, this.f9349X);
        SafeParcelWriter.j(parcel, i11);
    }

    public zzo(String str, String str2, String str3, String str4, long j, long j10, String str5, boolean z6, boolean z10, long j11, String str6, long j12, long j13, int i10, boolean z11, boolean z12, String str7, Boolean bool, long j14, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z13, long j15, int i11, String str12, int i12, long j16, String str13, String str14) {
        this.f9350s = str;
        this.f9351t = str2;
        this.f9352u = str3;
        this.f9328B = j11;
        this.f9353v = str4;
        this.f9354w = j;
        this.f9355x = j10;
        this.f9356y = str5;
        this.f9357z = z6;
        this.f9327A = z10;
        this.f9329C = str6;
        this.f9330D = j12;
        this.f9331E = j13;
        this.f9332F = i10;
        this.f9333G = z11;
        this.f9334H = z12;
        this.f9335I = str7;
        this.f9336J = bool;
        this.f9337K = j14;
        this.f9338L = arrayList;
        this.f9339M = str8;
        this.f9340N = str9;
        this.f9341O = str10;
        this.P = str11;
        this.f9342Q = z13;
        this.f9343R = j15;
        this.f9344S = i11;
        this.f9345T = str12;
        this.f9346U = i12;
        this.f9347V = j16;
        this.f9348W = str13;
        this.f9349X = str14;
    }
}
