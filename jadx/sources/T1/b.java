package T1;

import U1.f;
import java.security.MessageDigest;
import p232y1.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4626b;

    public b(Object obj) {
        f.c(obj, "Argument must not be null");
        this.f4626b = obj;
    }

    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f4626b.toString().getBytes(e.a));
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f4626b.equals(((b) obj).f4626b);
        }
        return false;
    }

    @Override // p232y1.e
    public final int hashCode() {
        return this.f4626b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f4626b + '}';
    }
}
