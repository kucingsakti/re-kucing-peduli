package p096j9;

import L9.n;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f12540b;

    static {
        c.j(h.f12557f);
    }

    public a(c cVar, f fVar) {
        i.f(cVar, "packageName");
        this.a = cVar;
        this.f12540b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && this.f12540b.equals(aVar.f12540b);
    }

    public final int hashCode() {
        return (this.f12540b.hashCode() + (this.a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = n.F(this.a.b(), '.', '/') + "/" + this.f12540b;
        i.e(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
