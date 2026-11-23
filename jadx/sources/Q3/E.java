package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4071c;

    public E(String str, String str2, String str3) {
        this.a = str;
        this.f4070b = str2;
        this.f4071c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            if (this.a.equals(((E) p0Var).a)) {
                E e10 = (E) p0Var;
                if (this.f4070b.equals(e10.f4070b) && this.f4071c.equals(e10.f4071c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4070b.hashCode()) * 1000003) ^ this.f4071c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.f4070b);
        sb.append(", buildId=");
        return E0.a.l(sb, this.f4071c, "}");
    }
}
