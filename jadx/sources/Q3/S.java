package Q3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class S extends C0 {
    public final List a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f4134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f4135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f4136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f4137e;

    public S(List list, U u3, q0 q0Var, V v4, List list2) {
        this.a = list;
        this.f4134b = u3;
        this.f4135c = q0Var;
        this.f4136d = v4;
        this.f4137e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c0 = (C0) obj;
        List list = this.a;
        if (list == null) {
            if (((S) c0).a != null) {
                return false;
            }
        } else if (!list.equals(((S) c0).a)) {
            return false;
        }
        U u3 = this.f4134b;
        if (u3 == null) {
            if (((S) c0).f4134b != null) {
                return false;
            }
        } else if (!u3.equals(((S) c0).f4134b)) {
            return false;
        }
        q0 q0Var = this.f4135c;
        if (q0Var == null) {
            if (((S) c0).f4135c != null) {
                return false;
            }
        } else if (!q0Var.equals(((S) c0).f4135c)) {
            return false;
        }
        S s9 = (S) c0;
        return this.f4136d.equals(s9.f4136d) && this.f4137e.equals(s9.f4137e);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        U u3 = this.f4134b;
        int iHashCode2 = (iHashCode ^ (u3 == null ? 0 : u3.hashCode())) * 1000003;
        q0 q0Var = this.f4135c;
        return (((((q0Var != null ? q0Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f4136d.hashCode()) * 1000003) ^ this.f4137e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.f4134b + ", appExitInfo=" + this.f4135c + ", signal=" + this.f4136d + ", binaries=" + this.f4137e + "}";
    }
}
