package p077ha;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p068ga.h;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l {
    @Override // p077ha.l
    public final boolean a(SSLSocket sSLSocket) {
        return h.f11595d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p077ha.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
