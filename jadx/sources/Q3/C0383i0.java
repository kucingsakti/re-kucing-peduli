package Q3;

/* JADX INFO: renamed from: Q3.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0383i0 {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f4230e;

    public final C0385j0 a() {
        String str;
        String str2;
        if (this.f4230e == 3 && (str = this.f4227b) != null && (str2 = this.f4228c) != null) {
            return new C0385j0(str, this.a, str2, this.f4229d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f4230e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f4227b == null) {
            sb.append(" version");
        }
        if (this.f4228c == null) {
            sb.append(" buildVersion");
        }
        if ((this.f4230e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }
}
