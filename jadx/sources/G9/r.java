package G9;

import A9.C0136i;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0136i f1779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1780t;

    public r(int i10, C0136i c0136i) {
        this.f1779s = c0136i;
        this.f1780t = i10;
    }

    @Override // G9.a
    public final int e() {
        return 1;
    }

    @Override // G9.a
    public final void f(int i10, C0136i c0136i) {
        throw new IllegalStateException();
    }

    @Override // G9.a
    public final Object get(int i10) {
        if (i10 == this.f1780t) {
            return this.f1779s;
        }
        return null;
    }

    @Override // G9.a, java.lang.Iterable
    public final Iterator iterator() {
        return new q(this, 0);
    }
}
