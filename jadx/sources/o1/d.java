package o1;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f13625b;

    public d(String str, Long l4) {
        this.a = str;
        this.f13625b = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p210v8.i.a(this.a, dVar.a) && p210v8.i.a(this.f13625b, dVar.f13625b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l4 = this.f13625b;
        return iHashCode + (l4 == null ? 0 : l4.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.f13625b + ')';
    }
}
