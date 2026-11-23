package p030ca;

import X9.G;
import X9.J;
import X9.K;
import X9.L;
import X9.N;
import X9.O;
import X9.z;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.IOException;
import java.net.ProtocolException;
import ma.q;
import p020ba.c;
import p020ba.k;
import p140o4.r;
import p210v8.i;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements z {
    @Override // X9.z
    public final L a(f fVar) throws Throwable {
        Long l4;
        K kZ;
        boolean z6;
        r rVar = fVar.f7578d;
        i.c(rVar);
        p020ba.i iVar = (p020ba.i) rVar.f13782t;
        d dVar = (d) rVar.f13784v;
        G g8 = fVar.f7579e;
        J j = g8.f5507d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            i.f(iVar, "call");
            dVar.g(g8);
            boolean zS = d.s(g8.f5505b);
            boolean z10 = true;
            k kVar = (k) rVar.f13785w;
            if (!zS || j == null) {
                l4 = null;
                iVar.j(rVar, true, false, null);
                kZ = null;
            } else {
                if ("100-continue".equalsIgnoreCase(g8.f5506c.e("Expect"))) {
                    try {
                        dVar.d();
                        kZ = rVar.z(true);
                        i.f(iVar, "call");
                        z6 = false;
                    } catch (IOException e10) {
                        i.f(iVar, "call");
                        rVar.B(e10);
                        throw e10;
                    }
                } else {
                    z6 = true;
                    kZ = null;
                }
                if (kZ == null) {
                    J j10 = g8.f5507d;
                    i.c(j10);
                    long jA = j10.a();
                    i.f(iVar, "call");
                    q qVarC = p068ga.d.c(new c(rVar, dVar.f(g8, jA), jA));
                    j.d(qVarC);
                    qVarC.close();
                } else {
                    iVar.j(rVar, true, false, null);
                    if (kVar.f7400g == null) {
                        dVar.h().l();
                    }
                }
                z10 = z6;
                l4 = null;
            }
            try {
                dVar.c();
                if (kZ == null) {
                    kZ = rVar.z(false);
                    i.c(kZ);
                    if (z10) {
                        i.f(iVar, "call");
                        z10 = false;
                    }
                }
                kZ.a = g8;
                kZ.f5517e = kVar.f7398e;
                kZ.f5522k = jCurrentTimeMillis;
                kZ.f5523l = System.currentTimeMillis();
                L lA = kZ.a();
                int i10 = lA.f5534v;
                if (i10 == 100) {
                    K kZ2 = rVar.z(false);
                    i.c(kZ2);
                    if (z10) {
                        i.f(iVar, "call");
                    }
                    kZ2.a = g8;
                    kZ2.f5517e = kVar.f7398e;
                    kZ2.f5522k = jCurrentTimeMillis;
                    kZ2.f5523l = System.currentTimeMillis();
                    lA = kZ2.a();
                    i10 = lA.f5534v;
                }
                K kG = lA.g();
                try {
                    String strB = L.b(lA, "Content-Type");
                    long jA2 = dVar.a(lA);
                    kG.f5519g = new N(strB, jA2, p068ga.d.d(new p020ba.d(rVar, dVar.b(lA), jA2)), 1);
                    L lA2 = kG.a();
                    if ("close".equalsIgnoreCase(lA2.f5531s.f5506c.e("Connection")) || "close".equalsIgnoreCase(L.b(lA2, "Connection"))) {
                        dVar.h().l();
                    }
                    if (i10 == 204 || i10 == 205) {
                        O o10 = lA2.f5537y;
                        if ((o10 == null ? -1L : o10.a()) > 0) {
                            StringBuilder sbL = AbstractC0487g.l("HTTP ", i10, " had non-zero Content-Length: ");
                            sbL.append(o10 == null ? l4 : Long.valueOf(o10.a()));
                            throw new ProtocolException(sbL.toString());
                        }
                    }
                    return lA2;
                } catch (IOException e11) {
                    rVar.B(e11);
                    throw e11;
                }
            } catch (IOException e12) {
                rVar.B(e12);
                throw e12;
            }
        } catch (IOException e13) {
            i.f(iVar, "call");
            rVar.B(e13);
            throw e13;
        }
    }
}
