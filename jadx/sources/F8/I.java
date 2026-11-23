package F8;

import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes.dex */
public final class I extends i0 implements C8.h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final J f1523w;

    public I(J j) {
        p210v8.i.f(j, "property");
        this.f1523w = j;
    }

    @Override // C8.m
    public final C8.u a() {
        return this.f1523w;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h8.d, java.lang.Object] */
    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
        ((I) this.f1523w.f1524B.getValue()).v(obj, obj2);
        return p076h8.m.a;
    }

    @Override // F8.e0
    public final k0 l() {
        return this.f1523w;
    }
}
