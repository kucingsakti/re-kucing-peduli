package y0;

/* JADX INFO: loaded from: classes.dex */
public final class D {
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15867i;

    public D(boolean z6, boolean z10, int i10, boolean z11, boolean z12, int i11, int i12, int i13, int i14) {
        this.a = z6;
        this.f15860b = z10;
        this.f15861c = i10;
        this.f15862d = z11;
        this.f15863e = z12;
        this.f15864f = i11;
        this.f15865g = i12;
        this.f15866h = i13;
        this.f15867i = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D)) {
            return false;
        }
        D d3 = (D) obj;
        return this.a == d3.a && this.f15860b == d3.f15860b && this.f15861c == d3.f15861c && this.f15862d == d3.f15862d && this.f15863e == d3.f15863e && this.f15864f == d3.f15864f && this.f15865g == d3.f15865g && this.f15866h == d3.f15866h && this.f15867i == d3.f15867i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ? 1 : 0) * 31) + (this.f15860b ? 1 : 0)) * 31) + this.f15861c) * 923521) + (this.f15862d ? 1 : 0)) * 31) + (this.f15863e ? 1 : 0)) * 31) + this.f15864f) * 31) + this.f15865g) * 31) + this.f15866h) * 31) + this.f15867i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.f15860b) {
            sb.append("restoreState ");
        }
        int i10 = this.f15867i;
        int i11 = this.f15866h;
        int i12 = this.f15865g;
        int i13 = this.f15864f;
        if (i13 != -1 || i12 != -1 || i11 != -1 || i10 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i13));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i12));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i11));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i10));
            sb.append(")");
        }
        String string = sb.toString();
        p210v8.i.e(string, "sb.toString()");
        return string;
    }
}
