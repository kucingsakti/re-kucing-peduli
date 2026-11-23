package P3;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f3878c = new h(0, 0);
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3879b;

    public h(int i10, int i11) {
        this.a = i10;
        this.f3879b = i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.a);
        sb.append(", length = ");
        return E0.a.j(sb, this.f3879b, "]");
    }
}
