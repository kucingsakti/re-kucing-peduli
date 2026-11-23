package K9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements l, d {
    public final l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2677b;

    public c(l lVar, int i10) {
        this.a = lVar;
        this.f2677b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // K9.d
    public final l a(int i10) {
        int i11 = this.f2677b + i10;
        return i11 < 0 ? new c(this, i10) : new c(this.a, i11);
    }

    @Override // K9.l
    public final Iterator iterator() {
        return new b(this);
    }
}
