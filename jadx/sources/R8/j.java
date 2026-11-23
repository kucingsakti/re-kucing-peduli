package R8;

import C8.InterfaceC0177e;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j extends p210v8.g implements p200u8.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final j f4470A = new j(1);

    @Override // p210v8.b
    public final InterfaceC0177e d() {
        return p210v8.u.a.b(q.class);
    }

    @Override // p210v8.b
    public final String g() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // p210v8.b, C8.InterfaceC0174b
    public final String getName() {
        return "<init>";
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        p210v8.i.f(constructor, "p0");
        return new q(constructor);
    }
}
