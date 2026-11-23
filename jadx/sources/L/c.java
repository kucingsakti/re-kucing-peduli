package L;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f2711e = new c(0, 0, 0, 0);
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2714d;

    public c(int i10, int i11, int i12, int i13) {
        this.a = i10;
        this.f2712b = i11;
        this.f2713c = i12;
        this.f2714d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.a, cVar2.a), Math.max(cVar.f2712b, cVar2.f2712b), Math.max(cVar.f2713c, cVar2.f2713c), Math.max(cVar.f2714d, cVar2.f2714d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f2711e : new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.a, this.f2712b, this.f2713c, this.f2714d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2714d == cVar.f2714d && this.a == cVar.a && this.f2713c == cVar.f2713c && this.f2712b == cVar.f2712b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.f2712b) * 31) + this.f2713c) * 31) + this.f2714d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.f2712b + ", right=" + this.f2713c + ", bottom=" + this.f2714d + '}';
    }
}
