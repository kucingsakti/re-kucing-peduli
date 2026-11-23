package p020ba;

import B4.C0157e;
import P3.n;
import X9.C0455a;
import X9.P;
import X9.y;
import Y9.c;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import p048ea.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0455a f7367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f7368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f7369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0157e f7370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public P f7374i;

    public e(l lVar, C0455a c0455a, i iVar) {
        i.f(lVar, "connectionPool");
        i.f(iVar, "call");
        this.a = lVar;
        this.f7367b = c0455a;
        this.f7368c = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    public final k a(int i10, int i11, int i12, boolean z6, boolean z10) throws IOException {
        P p10;
        n nVar;
        C0157e c0157e;
        n nVarL;
        ArrayList arrayList;
        k kVar;
        Socket socketL;
        while (!this.f7368c.f7384E) {
            k kVar2 = this.f7368c.f7394z;
            if (kVar2 != null) {
                synchronized (kVar2) {
                    try {
                        socketL = (kVar2.j || !b(kVar2.f7395b.a.f5563h)) ? this.f7368c.l() : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f7368c.f7394z == null) {
                    if (socketL != null) {
                        c.e(socketL);
                    }
                    i.f(this.f7368c, "call");
                    this.f7371f = 0;
                    this.f7372g = 0;
                    this.f7373h = 0;
                    if (this.a.a(this.f7367b, this.f7368c, null, false)) {
                        kVar2 = this.f7368c.f7394z;
                        i.c(kVar2);
                        i.f(this.f7368c, "call");
                    } else {
                        p10 = this.f7374i;
                        try {
                            if (p10 != null) {
                                this.f7374i = null;
                            } else {
                                nVar = this.f7369d;
                                if (nVar == null && nVar.b()) {
                                    n nVar2 = this.f7369d;
                                    i.c(nVar2);
                                    if (!nVar2.b()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i13 = nVar2.f3893b;
                                    nVar2.f3893b = i13 + 1;
                                    p10 = (P) nVar2.a.get(i13);
                                } else {
                                    c0157e = this.f7370e;
                                    if (c0157e == null) {
                                        C0455a c0455a = this.f7367b;
                                        i iVar = this.f7368c;
                                        c0157e = new C0157e(c0455a, iVar.f7387s.f5488S, iVar);
                                        this.f7370e = c0157e;
                                    }
                                    nVarL = c0157e.l();
                                    this.f7369d = nVarL;
                                    arrayList = nVarL.a;
                                    if (!this.f7368c.f7384E) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.a.a(this.f7367b, this.f7368c, arrayList, false)) {
                                        kVar2 = this.f7368c.f7394z;
                                        i.c(kVar2);
                                        i.f(this.f7368c, "call");
                                    } else {
                                        if (nVarL.b()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i14 = nVarL.f3893b;
                                        nVarL.f3893b = i14 + 1;
                                        p10 = (P) nVarL.a.get(i14);
                                        kVar = new k(this.a, p10);
                                        this.f7368c.f7386G = kVar;
                                        kVar.c(i10, i11, i12, z6, this.f7368c);
                                        this.f7368c.f7386G = null;
                                        this.f7368c.f7387s.f5488S.o(p10);
                                        if (this.a.a(this.f7367b, this.f7368c, arrayList, true)) {
                                            kVar2 = this.f7368c.f7394z;
                                            i.c(kVar2);
                                            this.f7374i = p10;
                                            Socket socket = kVar.f7397d;
                                            i.c(socket);
                                            c.e(socket);
                                            i.f(this.f7368c, "call");
                                        } else {
                                            synchronized (kVar) {
                                                l lVar = this.a;
                                                lVar.getClass();
                                                byte[] bArr = c.a;
                                                lVar.f7412d.add(kVar);
                                                lVar.f7410b.c(lVar.f7411c, 0L);
                                                this.f7368c.c(kVar);
                                            }
                                            i.f(this.f7368c, "call");
                                            kVar2 = kVar;
                                        }
                                    }
                                }
                            }
                            kVar.c(i10, i11, i12, z6, this.f7368c);
                            this.f7368c.f7386G = null;
                            this.f7368c.f7387s.f5488S.o(p10);
                            if (this.a.a(this.f7367b, this.f7368c, arrayList, true)) {
                                kVar2 = this.f7368c.f7394z;
                                i.c(kVar2);
                                this.f7374i = p10;
                                Socket socket2 = kVar.f7397d;
                                i.c(socket2);
                                c.e(socket2);
                                i.f(this.f7368c, "call");
                            } else {
                                synchronized (kVar) {
                                    l lVar2 = this.a;
                                    lVar2.getClass();
                                    byte[] bArr2 = c.a;
                                    lVar2.f7412d.add(kVar);
                                    lVar2.f7410b.c(lVar2.f7411c, 0L);
                                    this.f7368c.c(kVar);
                                    i.f(this.f7368c, "call");
                                    kVar2 = kVar;
                                }
                            }
                        } catch (Throwable th2) {
                            this.f7368c.f7386G = null;
                            throw th2;
                        }
                        arrayList = null;
                        kVar = new k(this.a, p10);
                        this.f7368c.f7386G = kVar;
                    }
                } else if (socketL != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                this.f7371f = 0;
                this.f7372g = 0;
                this.f7373h = 0;
                if (this.a.a(this.f7367b, this.f7368c, null, false)) {
                    kVar2 = this.f7368c.f7394z;
                    i.c(kVar2);
                    i.f(this.f7368c, "call");
                } else {
                    p10 = this.f7374i;
                    if (p10 != null) {
                        this.f7374i = null;
                    } else {
                        nVar = this.f7369d;
                        if (nVar == null) {
                        }
                        c0157e = this.f7370e;
                        if (c0157e == null) {
                            C0455a c0455a2 = this.f7367b;
                            i iVar2 = this.f7368c;
                            c0157e = new C0157e(c0455a2, iVar2.f7387s.f5488S, iVar2);
                            this.f7370e = c0157e;
                        }
                        nVarL = c0157e.l();
                        this.f7369d = nVarL;
                        arrayList = nVarL.a;
                        if (!this.f7368c.f7384E) {
                            throw new IOException("Canceled");
                        }
                        if (this.a.a(this.f7367b, this.f7368c, arrayList, false)) {
                            kVar2 = this.f7368c.f7394z;
                            i.c(kVar2);
                            i.f(this.f7368c, "call");
                        } else {
                            if (nVarL.b()) {
                                throw new NoSuchElementException();
                            }
                            int i15 = nVarL.f3893b;
                            nVarL.f3893b = i15 + 1;
                            p10 = (P) nVarL.a.get(i15);
                            kVar = new k(this.a, p10);
                            this.f7368c.f7386G = kVar;
                            kVar.c(i10, i11, i12, z6, this.f7368c);
                            this.f7368c.f7386G = null;
                            this.f7368c.f7387s.f5488S.o(p10);
                            if (this.a.a(this.f7367b, this.f7368c, arrayList, true)) {
                                kVar2 = this.f7368c.f7394z;
                                i.c(kVar2);
                                this.f7374i = p10;
                                Socket socket3 = kVar.f7397d;
                                i.c(socket3);
                                c.e(socket3);
                                i.f(this.f7368c, "call");
                            } else {
                                synchronized (kVar) {
                                    l lVar3 = this.a;
                                    lVar3.getClass();
                                    byte[] bArr3 = c.a;
                                    lVar3.f7412d.add(kVar);
                                    lVar3.f7410b.c(lVar3.f7411c, 0L);
                                    this.f7368c.c(kVar);
                                    i.f(this.f7368c, "call");
                                    kVar2 = kVar;
                                }
                            }
                        }
                    }
                    arrayList = null;
                    kVar = new k(this.a, p10);
                    this.f7368c.f7386G = kVar;
                    kVar.c(i10, i11, i12, z6, this.f7368c);
                    this.f7368c.f7386G = null;
                    this.f7368c.f7387s.f5488S.o(p10);
                    if (this.a.a(this.f7367b, this.f7368c, arrayList, true)) {
                        kVar2 = this.f7368c.f7394z;
                        i.c(kVar2);
                        this.f7374i = p10;
                        Socket socket4 = kVar.f7397d;
                        i.c(socket4);
                        c.e(socket4);
                        i.f(this.f7368c, "call");
                    } else {
                        synchronized (kVar) {
                            l lVar4 = this.a;
                            lVar4.getClass();
                            byte[] bArr4 = c.a;
                            lVar4.f7412d.add(kVar);
                            lVar4.f7410b.c(lVar4.f7411c, 0L);
                            this.f7368c.c(kVar);
                            i.f(this.f7368c, "call");
                            kVar2 = kVar;
                        }
                    }
                }
            }
            if (kVar2.j(z10)) {
                return kVar2;
            }
            kVar2.l();
            if (this.f7374i == null) {
                n nVar3 = this.f7369d;
                if (nVar3 == null ? true : nVar3.b()) {
                    continue;
                } else {
                    C0157e c0157e2 = this.f7370e;
                    if (!(c0157e2 == null ? true : c0157e2.j())) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(y yVar) {
        i.f(yVar, "url");
        y yVar2 = this.f7367b.f5563h;
        return yVar.f5659e == yVar2.f5659e && i.a(yVar.f5658d, yVar2.f5658d);
    }

    public final void c(IOException iOException) {
        i.f(iOException, "e");
        this.f7374i = null;
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).f13841s == a.REFUSED_STREAM) {
                this.f7371f++;
                return;
            }
        }
        if (iOException instanceof ConnectionShutdownException) {
            this.f7372g++;
        } else {
            this.f7373h++;
        }
    }
}
