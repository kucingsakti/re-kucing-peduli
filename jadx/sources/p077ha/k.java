package p077ha;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p068ga.h;
import p068ga.n;
import p204v1.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n {
    public static final j a = new j();

    @Override // p077ha.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p077ha.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p077ha.n
    public final void c(SSLSocket sSLSocket, String str, List list) {
        i.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            n nVar = n.a;
            Object[] array = g.f(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }

    @Override // p077ha.n
    public final boolean isSupported() {
        boolean z6 = h.f11595d;
        return h.f11595d;
    }
}
