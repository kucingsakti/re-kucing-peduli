package U8;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final B a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f4990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f4991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4992d;

    public v(B b3, B b7) {
        p086i8.t tVar = p086i8.t.f12329s;
        this.a = b3;
        this.f4990b = b7;
        this.f4991c = tVar;
        D3.b.s(new A0.r(this, 22));
        B b10 = B.IGNORE;
        this.f4992d = b3 == b10 && b7 == b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && this.f4990b == vVar.f4990b && p210v8.i.a(this.f4991c, vVar.f4991c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        B b3 = this.f4990b;
        return this.f4991c.hashCode() + ((iHashCode + (b3 == null ? 0 : b3.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.f4990b + ", userDefinedLevelForSpecificAnnotation=" + this.f4991c + ')';
    }
}
