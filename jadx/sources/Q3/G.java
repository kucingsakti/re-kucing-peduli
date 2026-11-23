package Q3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class G extends t0 {
    public final List a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4073b;

    public G(List list, String str) {
        this.a = list;
        this.f4073b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (this.a.equals(((G) t0Var).a) && ((str = this.f4073b) != null ? str.equals(((G) t0Var).f4073b) : ((G) t0Var).f4073b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.f4073b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return E0.a.l(sb, this.f4073b, "}");
    }
}
