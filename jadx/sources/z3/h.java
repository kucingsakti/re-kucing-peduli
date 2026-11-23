package z3;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f16312s;

    public h(Object obj) {
        this.f16312s = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return C3.b.n(this.f16312s, ((h) obj).f16312s);
        }
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f16312s;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16312s});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f16312s + ")";
    }
}
