package F8;

import L8.InterfaceC0269c;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends t0 implements p200u8.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p210v8.k f1625t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile SoftReference f1626u;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(InterfaceC0269c interfaceC0269c, p200u8.a aVar) {
        if (aVar == 0) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f1626u = null;
        this.f1625t = (p210v8.k) aVar;
        if (interfaceC0269c != null) {
            this.f1626u = new SoftReference(interfaceC0269c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [u8.a, v8.k] */
    @Override // p200u8.a
    public final Object invoke() {
        Object obj;
        SoftReference softReference = this.f1626u;
        Object obj2 = t0.f1632s;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f1625t.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f1626u = new SoftReference(obj2);
        return objInvoke;
    }
}
