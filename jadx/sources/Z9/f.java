package Z9;

import O8.C0352h;
import java.io.IOException;
import java.net.Socket;
import p020ba.k;
import p020ba.l;
import p048ea.o;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p010aa.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, String str, int i10) {
        super(str, true);
        this.f5938e = i10;
        this.f5939f = obj;
    }

    private final long b() {
        l lVar = (l) this.f5939f;
        long jNanoTime = System.nanoTime();
        int i10 = 0;
        long j = Long.MIN_VALUE;
        k kVar = null;
        int i11 = 0;
        for (k kVar2 : lVar.f7412d) {
            i.e(kVar2, "connection");
            synchronized (kVar2) {
                if (lVar.b(kVar2, jNanoTime) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j10 = jNanoTime - kVar2.f7409q;
                    if (j10 > j) {
                        kVar = kVar2;
                        j = j10;
                    }
                }
            }
        }
        long j11 = lVar.a;
        if (j < j11 && i10 <= 5) {
            if (i10 > 0) {
                return j11 - j;
            }
            if (i11 > 0) {
                return j11;
            }
            return -1L;
        }
        i.c(kVar);
        synchronized (kVar) {
            if (!kVar.f7408p.isEmpty()) {
                return 0L;
            }
            if (kVar.f7409q + j != jNanoTime) {
                return 0L;
            }
            kVar.j = true;
            lVar.f7412d.remove(kVar);
            Socket socket = kVar.f7397d;
            i.c(socket);
            Y9.c.e(socket);
            if (lVar.f7412d.isEmpty()) {
                lVar.f7410b.a();
            }
            return 0L;
        }
    }

    @Override // p010aa.a
    public final long a() throws Throwable {
        switch (this.f5938e) {
            case 0:
                g gVar = (g) this.f5939f;
                synchronized (gVar) {
                    try {
                        if (gVar.f5947C && !gVar.f5948D) {
                            try {
                                gVar.A();
                            } catch (IOException unused) {
                                gVar.f5949E = true;
                            }
                            try {
                                if (gVar.i()) {
                                    gVar.p();
                                    gVar.f5961z = 0;
                                }
                            } catch (IOException unused2) {
                                gVar.f5950F = true;
                                gVar.f5959x = p068ga.d.c(new ma.d());
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return -1L;
            case 1:
                ((C0352h) this.f5939f).invoke();
                return -1L;
            case 2:
                return b();
            default:
                o oVar = (o) this.f5939f;
                oVar.getClass();
                try {
                    oVar.f11319O.i(2, 0, false);
                    return -1L;
                } catch (IOException e10) {
                    oVar.b(e10);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, Object obj, int i10) {
        super(str, true);
        this.f5938e = i10;
        this.f5939f = obj;
    }
}
