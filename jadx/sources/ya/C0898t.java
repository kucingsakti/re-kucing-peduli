package ya;

import A1.C0099h;
import X9.InterfaceC0463i;
import X9.InterfaceC0464j;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: ya.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0898t implements InterfaceC0882c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final K f16228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object[] f16229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0463i f16230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC0890k f16231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f16232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p020ba.i f16233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Throwable f16234y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f16235z;

    public C0898t(K k3, Object[] objArr, InterfaceC0463i interfaceC0463i, InterfaceC0890k interfaceC0890k) {
        this.f16228s = k3;
        this.f16229t = objArr;
        this.f16230u = interfaceC0463i;
        this.f16231v = interfaceC0890k;
    }

    @Override // ya.InterfaceC0882c
    public final synchronized X9.G K() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return ((p020ba.i) d()).f7388t;
    }

    @Override // ya.InterfaceC0882c
    public final boolean T() {
        boolean z6 = true;
        if (this.f16232w) {
            return true;
        }
        synchronized (this) {
            p020ba.i iVar = this.f16233x;
            if (iVar == null || !iVar.f7384E) {
                z6 = false;
            }
        }
        return z6;
    }

    public final p020ba.i a() {
        X9.y yVarH;
        K k3 = this.f16228s;
        Object[] objArr = this.f16229t;
        int length = objArr.length;
        T[] tArr = k3.j;
        if (length != tArr.length) {
            throw new IllegalArgumentException(E0.a.j(AbstractC0487g.l("Argument count (", length, ") doesn't match expected count ("), tArr.length, ")"));
        }
        I i10 = new I(k3.f16184c, k3.f16183b, k3.f16185d, k3.f16186e, k3.f16187f, k3.f16188g, k3.f16189h, k3.f16190i);
        if (k3.f16191k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
            tArr[i11].a(i10, objArr[i11]);
        }
        X9.x xVar = i10.f16153d;
        if (xVar != null) {
            yVarH = xVar.a();
        } else {
            String str = i10.f16152c;
            X9.y yVar = i10.f16151b;
            yVarH = yVar.h(str);
            if (yVarH == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + yVar + ", Relative: " + i10.f16152c);
            }
        }
        X9.J h10 = i10.f16159k;
        if (h10 == null) {
            o1.e eVar = i10.j;
            if (eVar != null) {
                h10 = new X9.s((ArrayList) eVar.f13627t, (ArrayList) eVar.f13628u);
            } else {
                C0099h c0099h = i10.f16158i;
                if (c0099h != null) {
                    ArrayList arrayList2 = (ArrayList) c0099h.f105v;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    h10 = new X9.C((ma.i) c0099h.f103t, (X9.A) c0099h.f104u, Y9.c.x(arrayList2));
                } else if (i10.f16157h) {
                    long j = 0;
                    Y9.c.c(j, j, j);
                    h10 = new X9.I(null, 0, new byte[0]);
                }
            }
        }
        X9.A a = i10.f16156g;
        M1.c cVar = i10.f16155f;
        if (a != null) {
            if (h10 != null) {
                h10 = new X9.H(h10, a);
            } else {
                cVar.a("Content-Type", a.a);
            }
        }
        Fa.e eVar2 = i10.f16154e;
        eVar2.getClass();
        eVar2.f1659t = yVarH;
        eVar2.f1661v = cVar.d().g();
        eVar2.v(i10.a, h10);
        eVar2.A(C0894o.class, new C0894o(k3.a, arrayList));
        return ((X9.E) this.f16230u).c(eVar2.j());
    }

    public final L c() {
        InterfaceC0464j interfaceC0464jD;
        synchronized (this) {
            if (this.f16235z) {
                throw new IllegalStateException("Already executed.");
            }
            this.f16235z = true;
            interfaceC0464jD = d();
        }
        if (this.f16232w) {
            ((p020ba.i) interfaceC0464jD).cancel();
        }
        return e(((p020ba.i) interfaceC0464jD).f());
    }

    @Override // ya.InterfaceC0882c
    public final void cancel() {
        p020ba.i iVar;
        this.f16232w = true;
        synchronized (this) {
            iVar = this.f16233x;
        }
        if (iVar != null) {
            iVar.cancel();
        }
    }

    public final Object clone() {
        return new C0898t(this.f16228s, this.f16229t, this.f16230u, this.f16231v);
    }

    public final InterfaceC0464j d() throws IOException {
        p020ba.i iVar = this.f16233x;
        if (iVar != null) {
            return iVar;
        }
        Throwable th = this.f16234y;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            p020ba.i iVarA = a();
            this.f16233x = iVarA;
            return iVarA;
        } catch (IOException | Error | RuntimeException e10) {
            T.o(e10);
            this.f16234y = e10;
            throw e10;
        }
    }

    public final L e(X9.L l4) throws IOException {
        X9.K kG = l4.g();
        X9.O o10 = l4.f5537y;
        kG.f5519g = new C0897s(o10.b(), o10.a());
        X9.L lA = kG.a();
        int i10 = lA.f5534v;
        if (i10 < 200 || i10 >= 300) {
            try {
                o10.c().D(new ma.f());
                o10.b();
                o10.a();
                if (lA.c()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                L l10 = new L(lA, null);
                o10.close();
                return l10;
            } catch (Throwable th) {
                o10.close();
                throw th;
            }
        }
        if (i10 == 204 || i10 == 205) {
            o10.close();
            if (lA.c()) {
                return new L(lA, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        r rVar = new r(o10);
        try {
            Object objJ = this.f16231v.j(rVar);
            if (lA.c()) {
                return new L(lA, objJ);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e10) {
            IOException iOException = rVar.f16225v;
            if (iOException == null) {
                throw e10;
            }
            throw iOException;
        }
    }

    @Override // ya.InterfaceC0882c
    /* JADX INFO: renamed from: g */
    public final InterfaceC0882c clone() {
        return new C0898t(this.f16228s, this.f16229t, this.f16230u, this.f16231v);
    }

    @Override // ya.InterfaceC0882c
    public final void n(InterfaceC0885f interfaceC0885f) {
        p020ba.i iVar;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f16235z) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f16235z = true;
                iVar = this.f16233x;
                th = this.f16234y;
                if (iVar == null && th == null) {
                    try {
                        p020ba.i iVarA = a();
                        this.f16233x = iVarA;
                        iVar = iVarA;
                    } catch (Throwable th2) {
                        th = th2;
                        T.o(th);
                        this.f16234y = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC0885f.g(this, th);
            return;
        }
        if (this.f16232w) {
            iVar.cancel();
        }
        iVar.e(new o1.r(this, interfaceC0885f, 20, false));
    }
}
