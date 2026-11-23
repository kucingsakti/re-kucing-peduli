package R8;

import C8.InterfaceC0177e;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m extends p210v8.g implements p200u8.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final m f4473A = new m(1);

    @Override // p210v8.b
    public final InterfaceC0177e d() {
        return p210v8.u.a.b(w.class);
    }

    @Override // p210v8.b
    public final String g() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // p210v8.b, C8.InterfaceC0174b
    public final String getName() {
        return "<init>";
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        Method method = (Method) obj;
        p210v8.i.f(method, "p0");
        return new w(method);
    }
}
