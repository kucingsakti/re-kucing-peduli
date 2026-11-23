package p077ha;

import L9.n;
import javax.net.ssl.SSLSocket;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l {
    @Override // p077ha.l
    public final boolean a(SSLSocket sSLSocket) {
        return n.I(sSLSocket.getClass().getName(), i.k(".", "com.google.android.gms.org.conscrypt"), false);
    }

    @Override // p077ha.l
    public final n b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(i.k(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new f(superclass);
    }
}
