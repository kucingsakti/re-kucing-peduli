package U1;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public Class a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f4879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f4880c;

    public l(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.f4879b = cls2;
        this.f4880c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.a) && this.f4879b.equals(lVar.f4879b) && n.b(this.f4880c, lVar.f4880c);
    }

    public final int hashCode() {
        int iHashCode = (this.f4879b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.f4880c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.f4879b + '}';
    }
}
