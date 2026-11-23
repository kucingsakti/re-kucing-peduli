package Q3;

/* JADX INFO: renamed from: Q3.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0373d0 extends G0 {
    public final String a;

    public C0373d0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        return this.a.equals(((C0373d0) ((G0) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return E0.a.l(new StringBuilder("Log{content="), this.a, "}");
    }
}
