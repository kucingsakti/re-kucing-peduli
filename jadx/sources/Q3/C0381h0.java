package Q3;

import java.util.List;

/* JADX INFO: renamed from: Q3.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0381h0 extends J0 {
    public final List a;

    public C0381h0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        return this.a.equals(((C0381h0) ((J0) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
