package K9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements l {
    public final l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p200u8.b f2688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2689c;

    public i(l lVar, p200u8.b bVar, p200u8.b bVar2) {
        p210v8.i.f(bVar, "transformer");
        this.a = lVar;
        this.f2688b = bVar;
        this.f2689c = bVar2;
    }

    @Override // K9.l
    public final Iterator iterator() {
        return new h(this);
    }
}
