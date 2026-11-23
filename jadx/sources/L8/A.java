package L8;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class A {
    public final p096j9.b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2788b;

    public A(p096j9.b bVar, List list) {
        p210v8.i.f(bVar, "classId");
        this.a = bVar;
        this.f2788b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        return p210v8.i.a(this.a, a.a) && p210v8.i.a(this.f2788b, a.f2788b);
    }

    public final int hashCode() {
        return this.f2788b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.f2788b + ')';
    }
}
