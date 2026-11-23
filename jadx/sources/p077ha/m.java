package p077ha;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class m implements n {
    public final l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f11899b;

    public m(l lVar) {
        this.a = lVar;
    }

    @Override // p077ha.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // p077ha.n
    public final String b(SSLSocket sSLSocket) {
        n nVarD = d(sSLSocket);
        if (nVarD == null) {
            return null;
        }
        return nVarD.b(sSLSocket);
    }

    @Override // p077ha.n
    public final void c(SSLSocket sSLSocket, String str, List list) {
        i.f(list, "protocols");
        n nVarD = d(sSLSocket);
        if (nVarD == null) {
            return;
        }
        nVarD.c(sSLSocket, str, list);
    }

    public final synchronized n d(SSLSocket sSLSocket) {
        try {
            if (this.f11899b == null && this.a.a(sSLSocket)) {
                this.f11899b = this.a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11899b;
    }

    @Override // p077ha.n
    public final boolean isSupported() {
        return true;
    }
}
