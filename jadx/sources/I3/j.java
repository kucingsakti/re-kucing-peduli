package I3;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final p a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2037c;

    public j(int i10, int i11, Class cls) {
        this(p.a(cls), i10, i11);
    }

    public static j a(p pVar) {
        return new j(pVar, 1, 0);
    }

    public static j b(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a.equals(jVar.a) && this.f2036b == jVar.f2036b && this.f2037c == jVar.f2037c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f2036b) * 1000003) ^ this.f2037c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i10 = this.f2036b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i11 = this.f2037c;
        if (i11 == 0) {
            str2 = p084i6.e.DIRECT_TAG;
        } else if (i11 == 1) {
            str2 = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(AbstractC0487g.g(i11, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return E0.a.l(sb, str2, "}");
    }

    public j(p pVar, int i10, int i11) {
        p181s3.a.b(pVar, "Null dependency anInterface.");
        this.a = pVar;
        this.f2036b = i10;
        this.f2037c = i11;
    }
}
