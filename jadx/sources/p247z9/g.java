package p247z9;

import p096j9.c;
import p200u8.a;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f16323b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(c cVar, a aVar) {
        this.a = cVar;
        this.f16323b = (k) aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.a.equals(((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
