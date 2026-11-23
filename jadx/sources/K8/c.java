package K8;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final p096j9.b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p096j9.b f2624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p096j9.b f2625c;

    public c(p096j9.b bVar, p096j9.b bVar2, p096j9.b bVar3) {
        this.a = bVar;
        this.f2624b = bVar2;
        this.f2625c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p210v8.i.a(this.a, cVar.a) && p210v8.i.a(this.f2624b, cVar.f2624b) && p210v8.i.a(this.f2625c, cVar.f2625c);
    }

    public final int hashCode() {
        return this.f2625c.hashCode() + ((this.f2624b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.f2624b + ", kotlinMutable=" + this.f2625c + ')';
    }
}
