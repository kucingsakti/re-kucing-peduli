package com.tonyodev.fetch2core;

import android.os.Parcel;
import kotlin.Metadata;
import kotlin.TypeCastException;
import p163q7.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tonyodev/fetch2core/DownloadBlockInfo;", "Lcom/tonyodev/fetch2core/DownloadBlock;", "CREATOR", "q7/a", "fetch2core_release"}, k = 1, mv = {1, 4, 0})
public final class DownloadBlockInfo implements DownloadBlock {
    public static final a CREATOR = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10368s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10369t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10370u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10371v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f10372w = -1;

    public final void a(int i10) {
        this.f10369t = i10;
    }

    public final void b(int i10) {
        this.f10368s = i10;
    }

    public final void c(long j) {
        this.f10372w = j;
    }

    public final void d(long j) {
        this.f10371v = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(long j) {
        this.f10370u = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DownloadBlockInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2core.DownloadBlockInfo");
        }
        DownloadBlockInfo downloadBlockInfo = (DownloadBlockInfo) obj;
        return this.f10368s == downloadBlockInfo.f10368s && this.f10369t == downloadBlockInfo.f10369t && this.f10370u == downloadBlockInfo.f10370u && this.f10371v == downloadBlockInfo.f10371v && this.f10372w == downloadBlockInfo.f10372w;
    }

    public final int hashCode() {
        return Long.valueOf(this.f10372w).hashCode() + ((Long.valueOf(this.f10371v).hashCode() + ((Long.valueOf(this.f10370u).hashCode() + (((this.f10368s * 31) + this.f10369t) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DownloadBlock(downloadId=" + this.f10368s + ", blockPosition=" + this.f10369t + ", startByte=" + this.f10370u + ", endByte=" + this.f10371v + ", downloadedBytes=" + this.f10372w + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i.g(parcel, "dest");
        parcel.writeInt(this.f10368s);
        parcel.writeInt(this.f10369t);
        parcel.writeLong(this.f10370u);
        parcel.writeLong(this.f10371v);
        parcel.writeLong(this.f10372w);
    }
}
