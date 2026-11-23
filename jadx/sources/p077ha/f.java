package p077ha;

import L9.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p068ga.c;
import p068ga.n;
import p204v1.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public class f implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f11892f = new e();
    public final Class a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f11893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f11894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f11895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f11896e;

    public f(Class cls) throws NoSuchMethodException {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        i.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f11893b = declaredMethod;
        this.f11894c = cls.getMethod("setHostname", String.class);
        this.f11895d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f11896e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p077ha.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // p077ha.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f11895d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, a.a);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && i.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // p077ha.n
    public final void c(SSLSocket sSLSocket, String str, List list) {
        i.f(list, "protocols");
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.f11893b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f11894c.invoke(sSLSocket, str);
                }
                Method method = this.f11896e;
                n nVar = n.a;
                method.invoke(sSLSocket, g.k(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // p077ha.n
    public final boolean isSupported() {
        boolean z6 = c.f11590e;
        return c.f11590e;
    }
}
