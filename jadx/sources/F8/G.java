package F8;

import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes.dex */
public final class G extends i0 implements p200u8.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final H f1521w;

    public G(H h10) {
        p210v8.i.f(h10, "property");
        this.f1521w = h10;
    }

    @Override // C8.m
    public final C8.u a() {
        return this.f1521w;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h8.d, java.lang.Object] */
    @Override // p200u8.b
    public final Object invoke(Object obj) throws IllegalCallableAccessException {
        ((G) this.f1521w.f1522B.getValue()).v(obj);
        return p076h8.m.a;
    }

    @Override // F8.e0
    public final k0 l() {
        return this.f1521w;
    }
}
