package p020ba;

import X9.E;
import X9.L;
import X9.z;
import java.io.IOException;
import okhttp3.internal.connection.RouteException;
import p030ca.f;
import p140o4.r;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements z {
    public static final a a = new a();

    @Override // X9.z
    public final L a(f fVar) throws IOException {
        i iVar = fVar.a;
        iVar.getClass();
        synchronized (iVar) {
            try {
                if (!iVar.f7383D) {
                    throw new IllegalStateException("released");
                }
                if (iVar.f7382C) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iVar.f7381B) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = iVar.f7393y;
        i.c(eVar);
        E e10 = iVar.f7387s;
        i.f(e10, "client");
        try {
            r rVar = new r(iVar, eVar, eVar.a(fVar.f7580f, fVar.f7581g, fVar.f7582h, e10.f5494x, !i.a(fVar.f7579e.f5505b, "GET")).k(e10, fVar));
            iVar.f7380A = rVar;
            iVar.f7385F = rVar;
            synchronized (iVar) {
                iVar.f7381B = true;
                iVar.f7382C = true;
            }
            if (iVar.f7384E) {
                throw new IOException("Canceled");
            }
            return f.a(fVar, 0, rVar, null, 61).b(fVar.f7579e);
        } catch (IOException e11) {
            eVar.c(e11);
            throw new RouteException(e11);
        } catch (RouteException e12) {
            eVar.c(e12.f13840t);
            throw e12;
        }
    }
}
