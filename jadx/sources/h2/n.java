package h2;

/* JADX INFO: loaded from: classes.dex */
public final class n extends y {
    public final l a;

    public n(l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        Object obj2 = x.f11723s;
        ((n) yVar).getClass();
        return obj2.equals(obj2) && this.a.equals(((n) yVar).a);
    }

    public final int hashCode() {
        return ((x.f11723s.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f11723s + ", androidClientInfo=" + this.a + "}";
    }
}
