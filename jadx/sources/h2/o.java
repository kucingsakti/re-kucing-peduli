package h2;

/* JADX INFO: loaded from: classes.dex */
public final class o extends A {
    public final r a;

    public o(r rVar) {
        z zVar = z.f11725s;
        this.a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        if (!this.a.equals(((o) a).a)) {
            return false;
        }
        Object obj2 = z.f11725s;
        ((o) a).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ z.f11725s.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + z.f11725s + "}";
    }
}
