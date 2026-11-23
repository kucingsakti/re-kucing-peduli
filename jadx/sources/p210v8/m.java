package p210v8;

/* JADX INFO: loaded from: classes.dex */
public final class m implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class f15461s;

    public m(String str, Class cls) {
        i.f(cls, "jClass");
        this.f15461s = cls;
    }

    @Override // p210v8.c
    public final Class a() {
        return this.f15461s;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return i.a(this.f15461s, ((m) obj).f15461s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15461s.hashCode();
    }

    public final String toString() {
        return this.f15461s.toString() + " (Kotlin reflection is not available)";
    }
}
