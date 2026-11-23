package I8;

import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f2104s = new a(0);

    @Override // p200u8.a
    public final Object invoke() {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(c.class, c.class.getClassLoader());
        p210v8.i.e(serviceLoaderLoad, "implementations");
        c cVar = (c) p086i8.k.U(serviceLoaderLoad);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
