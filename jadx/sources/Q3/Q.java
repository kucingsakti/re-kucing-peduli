package Q3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends E0 {
    public final S a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f4130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D0 f4131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f4132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4133g;

    public Q(S s9, List list, List list2, Boolean bool, D0 d3, List list3, int i10) {
        this.a = s9;
        this.f4128b = list;
        this.f4129c = list2;
        this.f4130d = bool;
        this.f4131e = d3;
        this.f4132f = list3;
        this.f4133g = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        Q q10 = (Q) ((E0) obj);
        if (!this.a.equals(q10.a)) {
            return false;
        }
        List list = this.f4128b;
        if (list == null) {
            if (q10.f4128b != null) {
                return false;
            }
        } else if (!list.equals(q10.f4128b)) {
            return false;
        }
        List list2 = this.f4129c;
        if (list2 == null) {
            if (q10.f4129c != null) {
                return false;
            }
        } else if (!list2.equals(q10.f4129c)) {
            return false;
        }
        Boolean bool = this.f4130d;
        if (bool == null) {
            if (q10.f4130d != null) {
                return false;
            }
        } else if (!bool.equals(q10.f4130d)) {
            return false;
        }
        D0 d3 = this.f4131e;
        if (d3 == null) {
            if (q10.f4131e != null) {
                return false;
            }
        } else if (!d3.equals(q10.f4131e)) {
            return false;
        }
        List list3 = this.f4132f;
        if (list3 == null) {
            if (q10.f4132f != null) {
                return false;
            }
        } else if (!list3.equals(q10.f4132f)) {
            return false;
        }
        return this.f4133g == q10.f4133g;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.f4128b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f4129c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f4130d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        D0 d3 = this.f4131e;
        int iHashCode5 = (iHashCode4 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
        List list3 = this.f4132f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f4133g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.f4128b);
        sb.append(", internalKeys=");
        sb.append(this.f4129c);
        sb.append(", background=");
        sb.append(this.f4130d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f4131e);
        sb.append(", appProcessDetails=");
        sb.append(this.f4132f);
        sb.append(", uiOrientation=");
        return E0.a.j(sb, this.f4133g, "}");
    }
}
