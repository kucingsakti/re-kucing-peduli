package P9;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    public final Throwable a;

    public f(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return p210v8.i.a(this.a, ((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // P9.g
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
