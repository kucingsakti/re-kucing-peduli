package z3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f16305s;

    public c(Object obj) {
        this.f16305s = obj;
    }

    @Override // z3.b
    public final Object a() {
        return this.f16305s;
    }

    @Override // z3.b
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f16305s.equals(((c) obj).f16305s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16305s.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f16305s + ")";
    }
}
