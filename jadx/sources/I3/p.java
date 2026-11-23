package I3;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final Class a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f2046b;

    public p(Class cls, Class cls2) {
        this.a = cls;
        this.f2046b = cls2;
    }

    public static p a(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f2046b.equals(pVar.f2046b)) {
            return this.a.equals(pVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.f2046b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f2046b;
        Class cls2 = this.a;
        if (cls2 == o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
