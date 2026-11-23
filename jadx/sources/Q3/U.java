package Q3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U extends y0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f4143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4144e;

    public U(String str, String str2, List list, y0 y0Var, int i10) {
        this.a = str;
        this.f4141b = str2;
        this.f4142c = list;
        this.f4143d = y0Var;
        this.f4144e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            if (this.a.equals(((U) y0Var).a) && ((str = this.f4141b) != null ? str.equals(((U) y0Var).f4141b) : ((U) y0Var).f4141b == null)) {
                U u3 = (U) y0Var;
                if (this.f4142c.equals(u3.f4142c)) {
                    y0 y0Var2 = u3.f4143d;
                    y0 y0Var3 = this.f4143d;
                    if (y0Var3 != null ? y0Var3.equals(y0Var2) : y0Var2 == null) {
                        if (this.f4144e == u3.f4144e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.f4141b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f4142c.hashCode()) * 1000003;
        y0 y0Var = this.f4143d;
        return ((iHashCode2 ^ (y0Var != null ? y0Var.hashCode() : 0)) * 1000003) ^ this.f4144e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.f4141b);
        sb.append(", frames=");
        sb.append(this.f4142c);
        sb.append(", causedBy=");
        sb.append(this.f4143d);
        sb.append(", overflowCount=");
        return E0.a.j(sb, this.f4144e, "}");
    }
}
