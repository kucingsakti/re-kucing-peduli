package p145o9;

import p096j9.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13830b;

    public f(b bVar, int i10) {
        this.a = bVar;
        this.f13830b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.a, fVar.a) && this.f13830b == fVar.f13830b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.f13830b;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        int i11 = 0;
        while (true) {
            i10 = this.f13830b;
            if (i11 >= i10) {
                break;
            }
            sb.append("kotlin/Array<");
            i11++;
        }
        sb.append(this.a);
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(">");
        }
        String string = sb.toString();
        i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
