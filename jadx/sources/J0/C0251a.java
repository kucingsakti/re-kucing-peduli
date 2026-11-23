package J0;

import androidx.preference.Preference;

/* JADX INFO: renamed from: J0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0251a {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Preference f2269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2270d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0251a)) {
                return false;
            }
            C0251a c0251a = (C0251a) obj;
            int i10 = this.a;
            if (i10 != c0251a.a) {
                return false;
            }
            if (i10 != 8 || Math.abs(this.f2270d - this.f2268b) != 1 || this.f2270d != c0251a.f2268b || this.f2268b != c0251a.f2270d) {
                if (this.f2270d != c0251a.f2270d || this.f2268b != c0251a.f2268b) {
                    return false;
                }
                Preference preference = this.f2269c;
                if (preference != null) {
                    if (!preference.equals(c0251a.f2269c)) {
                        return false;
                    }
                } else if (c0251a.f2269c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.f2268b) * 31) + this.f2270d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i10 = this.a;
        if (i10 == 1) {
            str = "add";
        } else if (i10 == 2) {
            str = "rm";
        } else if (i10 != 4) {
            str = i10 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f2268b);
        sb.append("c:");
        sb.append(this.f2270d);
        sb.append(",p:");
        sb.append(this.f2269c);
        sb.append("]");
        return sb.toString();
    }
}
