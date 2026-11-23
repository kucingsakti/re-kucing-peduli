package com.tonyodev.fetch2;

import android.os.Parcel;
import android.os.Parcelable;
import h7.a;
import h7.f;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tonyodev/fetch2/DownloadNotification;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "CREATOR", "h7/a", "fetch2_release"}, k = 1, mv = {1, 4, 0})
public class DownloadNotification implements Parcelable, Serializable {
    public static final a CREATOR = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f10337s = f.NONE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10338t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10339u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10340v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f10341w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f10342x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f10343y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10344z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f10335A = "LibGlobalFetchLib";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f10336B = "";

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2.DownloadNotification");
        }
        DownloadNotification downloadNotification = (DownloadNotification) obj;
        return this.f10337s == downloadNotification.f10337s && this.f10338t == downloadNotification.f10338t && this.f10339u == downloadNotification.f10339u && this.f10340v == downloadNotification.f10340v && this.f10341w == downloadNotification.f10341w && this.f10342x == downloadNotification.f10342x && this.f10343y == downloadNotification.f10343y && this.f10344z == downloadNotification.f10344z && i.a(this.f10335A, downloadNotification.f10335A) && i.a(this.f10336B, downloadNotification.f10336B);
    }

    public final int hashCode() {
        return this.f10336B.hashCode() + p231y.a.a((Long.valueOf(this.f10344z).hashCode() + ((Long.valueOf(this.f10343y).hashCode() + ((Long.valueOf(this.f10342x).hashCode() + ((Long.valueOf(this.f10341w).hashCode() + (((((((this.f10337s.hashCode() * 31) + this.f10338t) * 31) + this.f10339u) * 31) + this.f10340v) * 31)) * 31)) * 31)) * 31)) * 31, this.f10335A, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadNotification(status=");
        sb.append(this.f10337s);
        sb.append(", progress=");
        sb.append(this.f10338t);
        sb.append(", notificationId=");
        sb.append(this.f10339u);
        sb.append(", groupId=");
        sb.append(this.f10340v);
        sb.append(", etaInMilliSeconds=");
        sb.append(this.f10341w);
        sb.append(", downloadedBytesPerSecond=");
        sb.append(this.f10342x);
        sb.append(", total=");
        sb.append(this.f10343y);
        sb.append(", downloaded=");
        sb.append(this.f10344z);
        sb.append(", namespace='");
        sb.append(this.f10335A);
        sb.append("', title='");
        return E0.a.l(sb, this.f10336B, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i.g(parcel, "dest");
        parcel.writeInt(this.f10337s.f11780s);
        parcel.writeInt(this.f10338t);
        parcel.writeInt(this.f10339u);
        parcel.writeInt(this.f10340v);
        parcel.writeLong(this.f10341w);
        parcel.writeLong(this.f10342x);
        parcel.writeLong(this.f10343y);
        parcel.writeLong(this.f10344z);
        parcel.writeString(this.f10335A);
        parcel.writeString(this.f10336B);
    }
}
