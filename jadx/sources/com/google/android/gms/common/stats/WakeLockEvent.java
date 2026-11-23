package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f8242A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f8243B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f8244C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final String f8245D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final float f8246E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final long f8247F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f8248G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f8250t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8251u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f8252v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f8253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f8254x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f8255y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f8256z;

    public WakeLockEvent(int i10, long j, int i11, String str, int i12, ArrayList arrayList, String str2, long j10, int i13, String str3, String str4, float f10, long j11, String str5, boolean z6) {
        this.f8249s = i10;
        this.f8250t = j;
        this.f8251u = i11;
        this.f8252v = str;
        this.f8253w = str3;
        this.f8254x = str5;
        this.f8255y = i12;
        this.f8256z = arrayList;
        this.f8242A = str2;
        this.f8243B = j10;
        this.f8244C = i13;
        this.f8245D = str4;
        this.f8246E = f10;
        this.f8247F = j11;
        this.f8248G = z6;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int K() {
        return this.f8251u;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long T() {
        return this.f8250t;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String W() {
        ArrayList arrayList = this.f8256z;
        String strJoin = arrayList == null ? "" : TextUtils.join(",", arrayList);
        StringBuilder sb = new StringBuilder("\t");
        sb.append(this.f8252v);
        sb.append("\t");
        sb.append(this.f8255y);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(this.f8244C);
        sb.append("\t");
        String str = this.f8253w;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("\t");
        String str2 = this.f8245D;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("\t");
        sb.append(this.f8246E);
        sb.append("\t");
        String str3 = this.f8254x;
        sb.append(str3 != null ? str3 : "");
        sb.append("\t");
        sb.append(this.f8248G);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8249s);
        SafeParcelWriter.k(parcel, 2, 8);
        parcel.writeLong(this.f8250t);
        SafeParcelWriter.e(parcel, 4, this.f8252v);
        SafeParcelWriter.k(parcel, 5, 4);
        parcel.writeInt(this.f8255y);
        SafeParcelWriter.f(parcel, 6, this.f8256z);
        SafeParcelWriter.k(parcel, 8, 8);
        parcel.writeLong(this.f8243B);
        SafeParcelWriter.e(parcel, 10, this.f8253w);
        SafeParcelWriter.k(parcel, 11, 4);
        parcel.writeInt(this.f8251u);
        SafeParcelWriter.e(parcel, 12, this.f8242A);
        SafeParcelWriter.e(parcel, 13, this.f8245D);
        SafeParcelWriter.k(parcel, 14, 4);
        parcel.writeInt(this.f8244C);
        SafeParcelWriter.k(parcel, 15, 4);
        parcel.writeFloat(this.f8246E);
        SafeParcelWriter.k(parcel, 16, 8);
        parcel.writeLong(this.f8247F);
        SafeParcelWriter.e(parcel, 17, this.f8254x);
        SafeParcelWriter.k(parcel, 18, 4);
        parcel.writeInt(this.f8248G ? 1 : 0);
        SafeParcelWriter.j(parcel, i11);
    }
}
