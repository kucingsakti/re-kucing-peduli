package T;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4584b;

    public b(Object obj, Object obj2) {
        this.a = obj;
        this.f4584b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.a, this.a) && Objects.equals(bVar.f4584b, this.f4584b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f4584b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.f4584b + "}";
    }
}
