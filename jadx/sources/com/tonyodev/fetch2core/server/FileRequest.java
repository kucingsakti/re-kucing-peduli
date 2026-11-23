package com.tonyodev.fetch2core.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.tonyodev.fetch2core.Extras;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import p086i8.y;
import p174r7.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tonyodev/fetch2core/server/FileRequest;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "CREATOR", "r7/b", "fetch2core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class FileRequest implements Parcelable, Serializable {
    public static final b CREATOR = new b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f10376A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f10377B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f10379t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f10380u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f10381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f10382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Extras f10384y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f10385z;

    public FileRequest(int i10, String str, long j, long j10, String str2, String str3, Extras extras, int i11, int i12, boolean z6) {
        i.g(str, "fileResourceId");
        i.g(extras, "extras");
        this.f10378s = i10;
        this.f10379t = str;
        this.f10380u = j;
        this.f10381v = j10;
        this.f10382w = str2;
        this.f10383x = str3;
        this.f10384y = extras;
        this.f10385z = i11;
        this.f10376A = i12;
        this.f10377B = z6;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("{\"Type\":");
        sb.append(this.f10378s);
        sb.append(",\"FileResourceId\":");
        sb.append("\"" + this.f10379t + '\"');
        sb.append(",\"Range-Start\":");
        sb.append(this.f10380u);
        sb.append(",\"Range-End\":");
        sb.append(this.f10381v);
        sb.append(",\"Authorization\":");
        sb.append("\"" + this.f10382w + '\"');
        sb.append(",\"Client\":");
        sb.append("\"" + this.f10383x + '\"');
        sb.append(",\"Extras\":");
        sb.append(this.f10384y.a());
        sb.append(",\"Page\":");
        sb.append(this.f10385z);
        sb.append(",\"Size\":");
        sb.append(this.f10376A);
        sb.append(",\"Persist-Connection\":");
        sb.append(this.f10377B);
        sb.append('}');
        String string = sb.toString();
        i.b(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileRequest)) {
            return false;
        }
        FileRequest fileRequest = (FileRequest) obj;
        return this.f10378s == fileRequest.f10378s && i.a(this.f10379t, fileRequest.f10379t) && this.f10380u == fileRequest.f10380u && this.f10381v == fileRequest.f10381v && i.a(this.f10382w, fileRequest.f10382w) && i.a(this.f10383x, fileRequest.f10383x) && i.a(this.f10384y, fileRequest.f10384y) && this.f10385z == fileRequest.f10385z && this.f10376A == fileRequest.f10376A && this.f10377B == fileRequest.f10377B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        int i10 = this.f10378s * 31;
        String str = this.f10379t;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        long j = this.f10380u;
        int i11 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j10 = this.f10381v;
        int i12 = (i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f10382w;
        int iHashCode2 = (i12 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10383x;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Extras extras = this.f10384y;
        int iHashCode4 = (((((iHashCode3 + (extras != null ? extras.hashCode() : 0)) * 31) + this.f10385z) * 31) + this.f10376A) * 31;
        boolean z6 = this.f10377B;
        ?? r10 = z6;
        if (z6) {
            r10 = 1;
        }
        return iHashCode4 + r10;
    }

    public final String toString() {
        return "FileRequest(type=" + this.f10378s + ", fileResourceId=" + this.f10379t + ", rangeStart=" + this.f10380u + ", rangeEnd=" + this.f10381v + ", authorization=" + this.f10382w + ", client=" + this.f10383x + ", extras=" + this.f10384y + ", page=" + this.f10385z + ", size=" + this.f10376A + ", persistConnection=" + this.f10377B + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i.g(parcel, "dest");
        parcel.writeInt(this.f10378s);
        parcel.writeString(this.f10379t);
        parcel.writeLong(this.f10380u);
        parcel.writeLong(this.f10381v);
        parcel.writeString(this.f10382w);
        parcel.writeString(this.f10383x);
        parcel.writeSerializable(new HashMap(y.A(this.f10384y.f10374s)));
        parcel.writeInt(this.f10385z);
        parcel.writeInt(this.f10376A);
        parcel.writeInt(this.f10377B ? 1 : 0);
    }
}
