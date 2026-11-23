package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class F extends r0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4072b;

    public F(String str, String str2) {
        this.a = str;
        this.f4072b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (this.a.equals(((F) r0Var).a) && this.f4072b.equals(((F) r0Var).f4072b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4072b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return E0.a.l(sb, this.f4072b, "}");
    }
}
