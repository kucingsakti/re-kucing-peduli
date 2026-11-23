package E1;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final String a;

    public j(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.a.equals(((j) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return E0.a.l(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
