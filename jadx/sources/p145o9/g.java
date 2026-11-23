package p145o9;

import A9.AbstractC0151y;
import L8.InterfaceC0290y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public final Object a;

    public g(Object obj) {
        this.a = obj;
    }

    public abstract AbstractC0151y a(InterfaceC0290y interfaceC0290y);

    public Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return i.a(objB, gVar != null ? gVar.b() : null);
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
