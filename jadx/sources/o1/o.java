package o1;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.services.core.request.metrics.AdOperationMetric;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p050f1.g f13649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p050f1.g f13650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f13653i;
    public p050f1.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f13654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f13656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f13657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f13658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f13659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f13662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f13663t;

    static {
        p210v8.i.e(p050f1.q.c("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public o(String str, int i10, String str2, String str3, p050f1.g gVar, p050f1.g gVar2, long j, long j10, long j11, p050f1.d dVar, int i11, int i12, long j12, long j13, long j14, long j15, boolean z6, int i13, int i14, int i15) {
        p210v8.i.f(str, "id");
        AbstractC0487g.p(i10, AdOperationMetric.INIT_STATE);
        p210v8.i.f(str2, "workerClassName");
        p210v8.i.f(gVar, "input");
        p210v8.i.f(gVar2, "output");
        p210v8.i.f(dVar, "constraints");
        AbstractC0487g.p(i12, "backoffPolicy");
        AbstractC0487g.p(i13, "outOfQuotaPolicy");
        this.a = str;
        this.f13646b = i10;
        this.f13647c = str2;
        this.f13648d = str3;
        this.f13649e = gVar;
        this.f13650f = gVar2;
        this.f13651g = j;
        this.f13652h = j10;
        this.f13653i = j11;
        this.j = dVar;
        this.f13654k = i11;
        this.f13655l = i12;
        this.f13656m = j12;
        this.f13657n = j13;
        this.f13658o = j14;
        this.f13659p = j15;
        this.f13660q = z6;
        this.f13661r = i13;
        this.f13662s = i14;
        this.f13663t = i15;
    }

    public final long a() {
        int i10;
        if (this.f13646b == 1 && (i10 = this.f13654k) > 0) {
            long j = this.f13656m;
            long jScalb = this.f13655l == 2 ? j * ((long) i10) : (long) Math.scalb(j, i10 - 1);
            long j10 = this.f13657n;
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j10 + jScalb;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f13657n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f13651g;
        }
        int i11 = this.f13662s;
        long j11 = this.f13657n;
        if (i11 == 0) {
            j11 += this.f13651g;
        }
        long j12 = this.f13653i;
        long j13 = this.f13652h;
        if (j12 != j13) {
            return j11 + j13 + (i11 == 0 ? ((long) (-1)) * j12 : 0L);
        }
        return j11 + (i11 != 0 ? j13 : 0L);
    }

    public final boolean b() {
        return !p210v8.i.a(p050f1.d.f11396i, this.j);
    }

    public final boolean c() {
        return this.f13652h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p210v8.i.a(this.a, oVar.a) && this.f13646b == oVar.f13646b && p210v8.i.a(this.f13647c, oVar.f13647c) && p210v8.i.a(this.f13648d, oVar.f13648d) && p210v8.i.a(this.f13649e, oVar.f13649e) && p210v8.i.a(this.f13650f, oVar.f13650f) && this.f13651g == oVar.f13651g && this.f13652h == oVar.f13652h && this.f13653i == oVar.f13653i && p210v8.i.a(this.j, oVar.j) && this.f13654k == oVar.f13654k && this.f13655l == oVar.f13655l && this.f13656m == oVar.f13656m && this.f13657n == oVar.f13657n && this.f13658o == oVar.f13658o && this.f13659p == oVar.f13659p && this.f13660q == oVar.f13660q && this.f13661r == oVar.f13661r && this.f13662s == oVar.f13662s && this.f13663t == oVar.f13663t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v49 */
    public final int hashCode() {
        int iA = p231y.a.a((p239z.e.d(this.f13646b) + (this.a.hashCode() * 31)) * 31, this.f13647c, 31);
        String str = this.f13648d;
        int iHashCode = (this.f13650f.hashCode() + ((this.f13649e.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        long j = this.f13651g;
        int i10 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j10 = this.f13652h;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f13653i;
        int iD = (p239z.e.d(this.f13655l) + ((((this.j.hashCode() + ((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f13654k) * 31)) * 31;
        long j12 = this.f13656m;
        int i12 = (iD + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f13657n;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f13658o;
        int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f13659p;
        int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        boolean z6 = this.f13660q;
        ?? r10 = z6;
        if (z6) {
            r10 = 1;
        }
        return ((((p239z.e.d(this.f13661r) + ((i15 + r10) * 31)) * 31) + this.f13662s) * 31) + this.f13663t;
    }

    public final String toString() {
        return AbstractC0487g.j(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o(String str, int i10, String str2, String str3, p050f1.g gVar, p050f1.g gVar2, long j, long j10, long j11, p050f1.d dVar, int i11, int i12, long j12, long j13, long j14, long j15, boolean z6, int i13, int i14, int i15, int i16) {
        p050f1.g gVar3;
        p050f1.g gVar4;
        int i17 = (i15 & 2) != 0 ? 1 : i10;
        String str4 = (i15 & 8) != 0 ? null : str3;
        if ((i15 & 16) != 0) {
            p050f1.g gVar5 = p050f1.g.f11410b;
            p210v8.i.e(gVar5, "EMPTY");
            gVar3 = gVar5;
        } else {
            gVar3 = gVar;
        }
        if ((i15 & 32) != 0) {
            p050f1.g gVar6 = p050f1.g.f11410b;
            p210v8.i.e(gVar6, "EMPTY");
            gVar4 = gVar6;
        } else {
            gVar4 = gVar2;
        }
        this(str, i17, str2, str4, gVar3, gVar4, (i15 & 64) != 0 ? 0L : j, (i15 & 128) != 0 ? 0L : j10, (i15 & 256) != 0 ? 0L : j11, (i15 & 512) != 0 ? p050f1.d.f11396i : dVar, (i15 & 1024) != 0 ? 0 : i11, (i15 & 2048) != 0 ? 1 : i12, (i15 & 4096) != 0 ? 30000L : j12, (i15 & 8192) != 0 ? 0L : j13, (i15 & 16384) != 0 ? 0L : j14, (32768 & i15) != 0 ? -1L : j15, (65536 & i15) != 0 ? false : z6, (131072 & i15) != 0 ? 1 : i13, (i15 & 262144) != 0 ? 0 : i14, 0);
    }
}
