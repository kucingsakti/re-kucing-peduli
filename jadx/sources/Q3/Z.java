package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class Z {
    public String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f4161e;

    public final C0367a0 a() {
        String str;
        if (this.f4161e == 7 && (str = this.a) != null) {
            return new C0367a0(this.f4158b, this.f4159c, str, this.f4160d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.f4161e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f4161e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f4161e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }
}
