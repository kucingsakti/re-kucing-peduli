package R8;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class x extends r implements p009a9.b {
    public final p096j9.c a;

    public x(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        this.a = cVar;
    }

    @Override // p009a9.b
    public final C0409d a(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return p210v8.i.a(this.a, ((x) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p009a9.b
    public final /* bridge */ /* synthetic */ Collection q() {
        return p086i8.s.f12328s;
    }

    public final String toString() {
        return x.class.getName() + ": " + this.a;
    }
}
