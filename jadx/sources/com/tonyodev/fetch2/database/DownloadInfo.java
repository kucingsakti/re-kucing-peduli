package com.tonyodev.fetch2.database;

import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2core.Extras;
import h7.b;
import h7.d;
import h7.f;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import p085i7.e;
import p086i8.y;
import p152p7.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tonyodev/fetch2/database/DownloadInfo;", "Lcom/tonyodev/fetch2/Download;", "CREATOR", "i7/e", "fetch2_release"}, k = 1, mv = {1, 4, 0})
public class DownloadInfo implements Download {
    public static final e CREATOR = new e();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f10346A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public f f10347B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public b f10348C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10349D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f10350E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f10351F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f10352G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f10353H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f10354I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Extras f10355J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f10356K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f10357L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f10358M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f10359N;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f10361t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f10362u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f10363v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f10366y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10367z;

    public DownloadInfo() {
        d dVar = a.a;
        this.f10365x = 2;
        this.f10366y = new LinkedHashMap();
        this.f10346A = -1L;
        this.f10347B = f.NONE;
        this.f10348C = b.NONE;
        this.f10349D = 2;
        Calendar calendar = Calendar.getInstance();
        i.b(calendar, "Calendar.getInstance()");
        this.f10350E = calendar.getTimeInMillis();
        this.f10352G = 1;
        this.f10354I = true;
        Extras.CREATOR.getClass();
        this.f10355J = Extras.f10373t;
        this.f10358M = -1L;
        this.f10359N = -1L;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF10367z() {
        return this.f10367z;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF10360s() {
        return this.f10360s;
    }

    public final int c() {
        long j = this.f10367z;
        long j10 = this.f10346A;
        if (j10 < 1) {
            return -1;
        }
        if (j < 1) {
            return 0;
        }
        if (j >= j10) {
            return 100;
        }
        return (int) ((j / j10) * ((double) 100));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getF10346A() {
        return this.f10346A;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(long j) {
        this.f10367z = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2.database.DownloadInfo");
        }
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        return this.f10360s == downloadInfo.f10360s && i.a(this.f10361t, downloadInfo.f10361t) && i.a(this.f10362u, downloadInfo.f10362u) && i.a(this.f10363v, downloadInfo.f10363v) && this.f10364w == downloadInfo.f10364w && this.f10365x == downloadInfo.f10365x && i.a(this.f10366y, downloadInfo.f10366y) && this.f10367z == downloadInfo.f10367z && this.f10346A == downloadInfo.f10346A && this.f10347B == downloadInfo.f10347B && this.f10348C == downloadInfo.f10348C && this.f10349D == downloadInfo.f10349D && this.f10350E == downloadInfo.f10350E && i.a(this.f10351F, downloadInfo.f10351F) && this.f10352G == downloadInfo.f10352G && this.f10353H == downloadInfo.f10353H && this.f10354I == downloadInfo.f10354I && i.a(this.f10355J, downloadInfo.f10355J) && this.f10358M == downloadInfo.f10358M && this.f10359N == downloadInfo.f10359N && this.f10356K == downloadInfo.f10356K && this.f10357L == downloadInfo.f10357L;
    }

    public final void f(String str) {
        i.g(str, "<set-?>");
        this.f10363v = str;
    }

    public final void g(String str) {
        i.g(str, "<set-?>");
        this.f10361t = str;
    }

    public final void h(long j) {
        this.f10346A = j;
    }

    public final int hashCode() {
        int iHashCode = (Long.valueOf(this.f10350E).hashCode() + ((p239z.e.d(this.f10349D) + ((this.f10348C.hashCode() + ((this.f10347B.hashCode() + ((Long.valueOf(this.f10346A).hashCode() + ((Long.valueOf(this.f10367z).hashCode() + ((this.f10366y.hashCode() + ((p239z.e.d(this.f10365x) + ((p231y.a.a(p231y.a.a(p231y.a.a(this.f10360s * 31, this.f10361t, 31), this.f10362u, 31), this.f10363v, 31) + this.f10364w) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f10351F;
        return Integer.valueOf(this.f10357L).hashCode() + ((Integer.valueOf(this.f10356K).hashCode() + ((Long.valueOf(this.f10359N).hashCode() + ((Long.valueOf(this.f10358M).hashCode() + ((this.f10355J.f10374s.hashCode() + ((Boolean.valueOf(this.f10354I).hashCode() + ((Long.valueOf(this.f10353H).hashCode() + ((p239z.e.d(this.f10352G) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void i(String str) {
        i.g(str, "<set-?>");
        this.f10362u = str;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("DownloadInfo(id=");
        sb.append(this.f10360s);
        sb.append(", namespace='");
        sb.append(this.f10361t);
        sb.append("', url='");
        sb.append(this.f10362u);
        sb.append("', file='");
        sb.append(this.f10363v);
        sb.append("', group=");
        sb.append(this.f10364w);
        sb.append(", priority=");
        int i10 = this.f10365x;
        if (i10 == 1) {
            str = "HIGH";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "LOW";
        } else {
            str = "NORMAL";
        }
        sb.append(str);
        sb.append(", headers=");
        sb.append(this.f10366y);
        sb.append(", downloaded=");
        sb.append(this.f10367z);
        sb.append(", total=");
        sb.append(this.f10346A);
        sb.append(", status=");
        sb.append(this.f10347B);
        sb.append(", error=");
        sb.append(this.f10348C);
        sb.append(", networkType=");
        int i11 = this.f10349D;
        if (i11 == 1) {
            str2 = "GLOBAL_OFF";
        } else if (i11 == 2) {
            str2 = "ALL";
        } else if (i11 != 3) {
            str2 = i11 != 4 ? "null" : "UNMETERED";
        } else {
            str2 = "WIFI_ONLY";
        }
        sb.append(str2);
        sb.append(", created=");
        sb.append(this.f10350E);
        sb.append(", tag=");
        sb.append(this.f10351F);
        sb.append(", enqueueAction=");
        int i12 = this.f10352G;
        if (i12 == 1) {
            str3 = "REPLACE_EXISTING";
        } else if (i12 == 2) {
            str3 = "INCREMENT_FILE_NAME";
        } else if (i12 != 3) {
            str3 = i12 != 4 ? "null" : "UPDATE_ACCORDINGLY";
        } else {
            str3 = "DO_NOT_ENQUEUE_IF_EXISTING";
        }
        sb.append(str3);
        sb.append(", identifier=");
        sb.append(this.f10353H);
        sb.append(", downloadOnEnqueue=");
        sb.append(this.f10354I);
        sb.append(", extras=");
        sb.append(this.f10355J);
        sb.append(", autoRetryMaxAttempts=");
        sb.append(this.f10356K);
        sb.append(", autoRetryAttempts=");
        sb.append(this.f10357L);
        sb.append(", etaInMilliSeconds=");
        sb.append(this.f10358M);
        sb.append(", downloadedBytesPerSecond=");
        sb.append(this.f10359N);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i.g(parcel, "dest");
        parcel.writeInt(this.f10360s);
        parcel.writeString(this.f10361t);
        parcel.writeString(this.f10362u);
        parcel.writeString(this.f10363v);
        parcel.writeInt(this.f10364w);
        parcel.writeInt(AbstractC0487g.d(this.f10365x));
        parcel.writeSerializable(new HashMap(this.f10366y));
        parcel.writeLong(this.f10367z);
        parcel.writeLong(this.f10346A);
        parcel.writeInt(this.f10347B.f11780s);
        parcel.writeInt(this.f10348C.f11758s);
        parcel.writeInt(AbstractC0487g.c(this.f10349D));
        parcel.writeLong(this.f10350E);
        parcel.writeString(this.f10351F);
        parcel.writeInt(p239z.e.d(this.f10352G));
        parcel.writeLong(this.f10353H);
        parcel.writeInt(this.f10354I ? 1 : 0);
        parcel.writeLong(this.f10358M);
        parcel.writeLong(this.f10359N);
        parcel.writeSerializable(new HashMap(y.A(this.f10355J.f10374s)));
        parcel.writeInt(this.f10356K);
        parcel.writeInt(this.f10357L);
    }
}
