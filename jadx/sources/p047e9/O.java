package p047e9;

import B4.C0154b;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;

/* JADX INFO: loaded from: classes.dex */
public final class O extends n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0609a f10845A = new C0609a(17);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final O f10846z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f10847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10848t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public N f10849u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Q f10850v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10851w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte f10852x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10853y;

    static {
        O o10 = new O();
        f10846z = o10;
        o10.f10849u = N.INV;
        o10.f10850v = Q.f10869L;
        o10.f10851w = 0;
    }

    public O() {
        this.f10852x = (byte) -1;
        this.f10853y = -1;
        this.f10847s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10853y;
        if (i10 != -1) {
            return i10;
        }
        int iA = (this.f10848t & 1) == 1 ? C0154b.a(1, this.f10849u.f10844s) : 0;
        if ((this.f10848t & 2) == 2) {
            iA += C0154b.d(2, this.f10850v);
        }
        if ((this.f10848t & 4) == 4) {
            iA += C0154b.b(3, this.f10851w);
        }
        int size = this.f10847s.size() + iA;
        this.f10853y = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return M.h();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        M mH = M.h();
        mH.i(this);
        return mH;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        if ((this.f10848t & 1) == 1) {
            c0154b.l(1, this.f10849u.f10844s);
        }
        if ((this.f10848t & 2) == 2) {
            c0154b.o(2, this.f10850v);
        }
        if ((this.f10848t & 4) == 4) {
            c0154b.m(3, this.f10851w);
        }
        c0154b.r(this.f10847s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f10852x;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if ((this.f10848t & 2) != 2 || this.f10850v.isInitialized()) {
            this.f10852x = (byte) 1;
            return true;
        }
        this.f10852x = (byte) 0;
        return false;
    }

    public O(M m2) {
        this.f10852x = (byte) -1;
        this.f10853y = -1;
        this.f10847s = m2.f12808s;
    }

    public O(C0676e c0676e, C0678g c0678g) {
        this.f10852x = (byte) -1;
        this.f10853y = -1;
        N n10 = N.INV;
        this.f10849u = n10;
        this.f10850v = Q.f10869L;
        boolean z6 = false;
        this.f10851w = 0;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c0676e.n();
                        if (iN != 0) {
                            P pQ = null;
                            N n11 = null;
                            if (iN == 8) {
                                int iK = c0676e.k();
                                if (iK == 0) {
                                    n11 = N.IN;
                                } else if (iK == 1) {
                                    n11 = N.OUT;
                                } else if (iK == 2) {
                                    n11 = n10;
                                } else if (iK == 3) {
                                    n11 = N.STAR;
                                }
                                if (n11 == null) {
                                    c0154bJ.v(iN);
                                    c0154bJ.v(iK);
                                } else {
                                    this.f10848t |= 1;
                                    this.f10849u = n11;
                                }
                            } else if (iN == 18) {
                                if ((this.f10848t & 2) == 2) {
                                    Q q10 = this.f10850v;
                                    q10.getClass();
                                    pQ = Q.q(q10);
                                }
                                Q q11 = (Q) c0676e.g(Q.f10870M, c0678g);
                                this.f10850v = q11;
                                if (pQ != null) {
                                    pQ.j(q11);
                                    this.f10850v = pQ.h();
                                }
                                this.f10848t |= 2;
                            } else if (iN != 24) {
                                if (!c0676e.q(iN, c0154bJ)) {
                                }
                            } else {
                                this.f10848t |= 4;
                                this.f10851w = c0676e.k();
                            }
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f12841s = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f12841s = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                try {
                    c0154bJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f10847s = c0674c.c();
                }
                throw th;
            }
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10847s = c0674c.c();
        }
    }
}
