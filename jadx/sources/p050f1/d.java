package p050f1;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.Set;
import p086i8.u;
import p210v8.i;
import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f11396i = new d(1, false, false, false, false, -1, -1, u.f12330s);
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f11403h;

    public d(int i10, boolean z6, boolean z10, boolean z11, boolean z12, long j, long j10, Set set) {
        AbstractC0487g.p(i10, "requiredNetworkType");
        i.f(set, "contentUriTriggers");
        this.a = i10;
        this.f11397b = z6;
        this.f11398c = z10;
        this.f11399d = z11;
        this.f11400e = z12;
        this.f11401f = j;
        this.f11402g = j10;
        this.f11403h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.class.equals(obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f11397b == dVar.f11397b && this.f11398c == dVar.f11398c && this.f11399d == dVar.f11399d && this.f11400e == dVar.f11400e && this.f11401f == dVar.f11401f && this.f11402g == dVar.f11402g && this.a == dVar.a) {
            return i.a(this.f11403h, dVar.f11403h);
        }
        return false;
    }

    public final int hashCode() {
        int iD = ((((((((e.d(this.a) * 31) + (this.f11397b ? 1 : 0)) * 31) + (this.f11398c ? 1 : 0)) * 31) + (this.f11399d ? 1 : 0)) * 31) + (this.f11400e ? 1 : 0)) * 31;
        long j = this.f11401f;
        int i10 = (iD + ((int) (j ^ (j >>> 32)))) * 31;
        long j10 = this.f11402g;
        return this.f11403h.hashCode() + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }
}
