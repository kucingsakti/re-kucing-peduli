package p145o9;

import A9.AbstractC0151y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class o extends q {
    public final AbstractC0151y a;

    public o(AbstractC0151y abstractC0151y) {
        this.a = abstractC0151y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && i.a(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.a + ')';
    }
}
