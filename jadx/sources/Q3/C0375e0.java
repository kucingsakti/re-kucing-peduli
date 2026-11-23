package Q3;

/* JADX INFO: renamed from: Q3.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0375e0 {
    public C0379g0 a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f4205e;

    public final C0377f0 a() {
        C0379g0 c0379g0;
        String str;
        String str2;
        if (this.f4205e == 1 && (c0379g0 = this.a) != null && (str = this.f4202b) != null && (str2 = this.f4203c) != null) {
            return new C0377f0(c0379g0, str, str2, this.f4204d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f4202b == null) {
            sb.append(" parameterKey");
        }
        if (this.f4203c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f4205e) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }
}
