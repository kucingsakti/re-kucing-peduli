package Q3;

/* JADX INFO: renamed from: Q3.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0389l0 {
    public final C0391m0 a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0395o0 f4256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0393n0 f4257c;

    public C0389l0(C0391m0 c0391m0, C0395o0 c0395o0, C0393n0 c0393n0) {
        this.a = c0391m0;
        this.f4256b = c0395o0;
        this.f4257c = c0393n0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0389l0) {
            C0389l0 c0389l0 = (C0389l0) obj;
            if (this.a.equals(c0389l0.a) && this.f4256b.equals(c0389l0.f4256b) && this.f4257c.equals(c0389l0.f4257c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4256b.hashCode()) * 1000003) ^ this.f4257c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.f4256b + ", deviceData=" + this.f4257c + "}";
    }
}
