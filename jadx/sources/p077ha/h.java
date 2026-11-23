package p077ha;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p068ga.e;
import p068ga.n;
import p204v1.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements n {
    public static final g a = new g();

    @Override // p077ha.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p077ha.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p077ha.n
    public final void c(SSLSocket sSLSocket, String str, List list) {
        i.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            n nVar = n.a;
            Object[] array = g.f(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p077ha.n
    public final boolean isSupported() {
        boolean z6 = e.f11593d;
        return e.f11593d;
    }
}
