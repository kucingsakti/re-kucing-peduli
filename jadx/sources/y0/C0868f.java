package y0;

/* JADX INFO: renamed from: y0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0868f {
    public final M a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15918d;

    public C0868f(M m2, boolean z6, Object obj, boolean z10) {
        if (!m2.a && z6) {
            throw new IllegalArgumentException(m2.b().concat(" does not allow nullable values").toString());
        }
        if (!z6 && z10 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + m2.b() + " has null value but is not nullable.").toString());
        }
        this.a = m2;
        this.f15916b = z6;
        this.f15918d = obj;
        this.f15917c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0868f.class.equals(obj.getClass())) {
            C0868f c0868f = (C0868f) obj;
            if (this.f15916b != c0868f.f15916b || this.f15917c != c0868f.f15917c || !p210v8.i.a(this.a, c0868f.a)) {
                return false;
            }
            Object obj2 = c0868f.f15918d;
            Object obj3 = this.f15918d;
            if (obj3 != null) {
                return p210v8.i.a(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.f15916b ? 1 : 0)) * 31) + (this.f15917c ? 1 : 0)) * 31;
        Object obj = this.f15918d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0868f.class.getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.f15916b);
        if (this.f15917c) {
            sb.append(" DefaultValue: " + this.f15918d);
        }
        String string = sb.toString();
        p210v8.i.e(string, "sb.toString()");
        return string;
    }
}
