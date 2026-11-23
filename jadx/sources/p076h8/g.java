package p076h8;

import java.io.Serializable;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Throwable f11791s;

    public g(Throwable th) {
        i.f(th, "exception");
        this.f11791s = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return i.a(this.f11791s, ((g) obj).f11791s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11791s.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f11791s + ')';
    }
}
