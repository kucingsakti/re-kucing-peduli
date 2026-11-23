package F8;

import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes.dex */
public final class K extends i0 implements p200u8.d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final L f1525w;

    public K(L l4) {
        p210v8.i.f(l4, "property");
        this.f1525w = l4;
    }

    @Override // C8.m
    public final C8.u a() {
        return this.f1525w;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h8.d, java.lang.Object] */
    @Override // p200u8.d
    public final Object b(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
        ((K) this.f1525w.f1526B.getValue()).v(obj, obj2, obj3);
        return p076h8.m.a;
    }

    @Override // F8.e0
    public final k0 l() {
        return this.f1525w;
    }
}
