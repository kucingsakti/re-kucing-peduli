package d7;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    public final p027c7.a a;

    public d(p027c7.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && i.a(this.a, ((d) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        p027c7.a aVar = this.a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Success(crypto=" + this.a + ")";
    }
}
