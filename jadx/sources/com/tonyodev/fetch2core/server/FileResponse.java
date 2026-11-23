package com.tonyodev.fetch2core.server;

import E0.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import p174r7.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tonyodev/fetch2core/server/FileResponse;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "CREATOR", "r7/c", "fetch2core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class FileResponse implements Parcelable, Serializable {
    public static final c CREATOR = new c();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10387t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f10388u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f10389v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f10390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10391x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f10392y;

    public FileResponse(int i10, int i11, int i12, long j, long j10, String str, String str2) {
        this.f10386s = i10;
        this.f10387t = i11;
        this.f10388u = i12;
        this.f10389v = j;
        this.f10390w = j10;
        this.f10391x = str;
        this.f10392y = str2;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("{\"Status\":");
        sb.append(this.f10386s);
        sb.append(",\"Md5\":");
        sb.append("\"" + this.f10391x + '\"');
        sb.append(",\"Connection\":");
        sb.append(this.f10388u);
        sb.append(",\"Date\":");
        sb.append(this.f10389v);
        sb.append(",\"Content-Length\":");
        sb.append(this.f10390w);
        sb.append(",\"Type\":");
        sb.append(this.f10387t);
        sb.append(",\"SessionId\":");
        sb.append(this.f10392y);
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
        if (!(obj instanceof FileResponse)) {
            return false;
        }
        FileResponse fileResponse = (FileResponse) obj;
        return this.f10386s == fileResponse.f10386s && this.f10387t == fileResponse.f10387t && this.f10388u == fileResponse.f10388u && this.f10389v == fileResponse.f10389v && this.f10390w == fileResponse.f10390w && i.a(this.f10391x, fileResponse.f10391x) && i.a(this.f10392y, fileResponse.f10392y);
    }

    public final int hashCode() {
        int i10 = ((((this.f10386s * 31) + this.f10387t) * 31) + this.f10388u) * 31;
        long j = this.f10389v;
        int i11 = (i10 + ((int) (j ^ (j >>> 32)))) * 31;
        long j10 = this.f10390w;
        int i12 = (i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.f10391x;
        int iHashCode = (i12 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10392y;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileResponse(status=");
        sb.append(this.f10386s);
        sb.append(", type=");
        sb.append(this.f10387t);
        sb.append(", connection=");
        sb.append(this.f10388u);
        sb.append(", date=");
        sb.append(this.f10389v);
        sb.append(", contentLength=");
        sb.append(this.f10390w);
        sb.append(", md5=");
        sb.append(this.f10391x);
        sb.append(", sessionId=");
        return a.l(sb, this.f10392y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i.g(parcel, "dest");
        parcel.writeInt(this.f10386s);
        parcel.writeInt(this.f10387t);
        parcel.writeInt(this.f10388u);
        parcel.writeLong(this.f10389v);
        parcel.writeLong(this.f10390w);
        parcel.writeString(this.f10391x);
        parcel.writeString(this.f10392y);
    }
}
