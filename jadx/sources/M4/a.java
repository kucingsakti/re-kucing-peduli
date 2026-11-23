package M4;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3176g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.f3171b == aVar.f3171b && i.a(this.f3172c, aVar.f3172c) && this.f3173d == aVar.f3173d && i.a(this.f3174e, aVar.f3174e) && i.a(this.f3175f, aVar.f3175f) && this.f3176g == aVar.f3176g;
    }

    public final int hashCode() {
        int iA = p231y.a.a(p231y.a.a((p231y.a.a(((this.a * 31) + this.f3171b) * 31, this.f3172c, 31) + this.f3173d) * 31, this.f3174e, 31), this.f3175f, 31);
        long j = this.f3176g;
        return iA + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Bookmark(id=" + this.a + ", type=" + this.f3171b + ", post_type=" + this.f3172c + ", post_id=" + this.f3173d + ", title=" + this.f3174e + ", image=" + this.f3175f + ", time=" + this.f3176g + ')';
    }
}
