package A9;

/* JADX INFO: loaded from: classes.dex */
public final class Q {
    public final L8.P a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z8.a f351b;

    public Q(L8.P p10, Z8.a aVar) {
        p210v8.i.f(p10, "typeParameter");
        p210v8.i.f(aVar, "typeAttr");
        this.a = p10;
        this.f351b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return p210v8.i.a(q10.a, this.a) && p210v8.i.a(q10.f351b, this.f351b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        return this.f351b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.f351b + ')';
    }
}
