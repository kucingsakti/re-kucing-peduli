package Q3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class W extends B0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4148c;

    public W(String str, int i10, List list) {
        this.a = str;
        this.f4147b = i10;
        this.f4148c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B0) {
            B0 b3 = (B0) obj;
            if (this.a.equals(((W) b3).a)) {
                W w2 = (W) b3;
                if (this.f4147b == w2.f4147b && this.f4148c.equals(w2.f4148c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4147b) * 1000003) ^ this.f4148c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.f4147b + ", frames=" + this.f4148c + "}";
    }
}
