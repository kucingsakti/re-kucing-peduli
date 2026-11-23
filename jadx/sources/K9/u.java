package K9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class u implements l {
    public final l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p200u8.b f2710b;

    public u(l lVar, p200u8.b bVar) {
        p210v8.i.f(bVar, "transformer");
        this.a = lVar;
        this.f2710b = bVar;
    }

    @Override // K9.l
    public final Iterator iterator() {
        return new t(this);
    }
}
