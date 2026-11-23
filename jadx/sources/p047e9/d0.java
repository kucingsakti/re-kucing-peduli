package p047e9;

import B4.C0154b;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.n;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends n {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final d0 f11027C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0609a f11028D = new C0609a(22);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public byte f11029A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11030B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f11031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11033u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b0 f11035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11036x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11037y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c0 f11038z;

    static {
        d0 d0Var = new d0();
        f11027C = d0Var;
        d0Var.f11033u = 0;
        d0Var.f11034v = 0;
        d0Var.f11035w = b0.ERROR;
        d0Var.f11036x = 0;
        d0Var.f11037y = 0;
        d0Var.f11038z = c0.LANGUAGE_VERSION;
    }

    public d0() {
        this.f11029A = (byte) -1;
        this.f11030B = -1;
        this.f11031s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11030B;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f11032t & 1) == 1 ? C0154b.b(1, this.f11033u) : 0;
        if ((this.f11032t & 2) == 2) {
            iB += C0154b.b(2, this.f11034v);
        }
        if ((this.f11032t & 4) == 4) {
            iB += C0154b.a(3, this.f11035w.f10989s);
        }
        if ((this.f11032t & 8) == 8) {
            iB += C0154b.b(4, this.f11036x);
        }
        if ((this.f11032t & 16) == 16) {
            iB += C0154b.b(5, this.f11037y);
        }
        if ((this.f11032t & 32) == 32) {
            iB += C0154b.a(6, this.f11038z.f11009s);
        }
        int size = this.f11031s.size() + iB;
        this.f11030B = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return a0.h();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        a0 a0VarH = a0.h();
        a0VarH.i(this);
        return a0VarH;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        if ((this.f11032t & 1) == 1) {
            c0154b.m(1, this.f11033u);
        }
        if ((this.f11032t & 2) == 2) {
            c0154b.m(2, this.f11034v);
        }
        if ((this.f11032t & 4) == 4) {
            c0154b.l(3, this.f11035w.f10989s);
        }
        if ((this.f11032t & 8) == 8) {
            c0154b.m(4, this.f11036x);
        }
        if ((this.f11032t & 16) == 16) {
            c0154b.m(5, this.f11037y);
        }
        if ((this.f11032t & 32) == 32) {
            c0154b.l(6, this.f11038z.f11009s);
        }
        c0154b.r(this.f11031s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        if (this.f11029A == 1) {
            return true;
        }
        this.f11029A = (byte) 1;
        return true;
    }

    public d0(a0 a0Var) {
        this.f11029A = (byte) -1;
        this.f11030B = -1;
        this.f11031s = a0Var.f12808s;
    }

    public d0(C0676e c0676e) {
        this.f11029A = (byte) -1;
        this.f11030B = -1;
        boolean z6 = false;
        this.f11033u = 0;
        this.f11034v = 0;
        b0 b0Var = b0.ERROR;
        this.f11035w = b0Var;
        this.f11036x = 0;
        this.f11037y = 0;
        c0 c0Var = c0.LANGUAGE_VERSION;
        this.f11038z = c0Var;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c0676e.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f11032t |= 1;
                                this.f11033u = c0676e.k();
                            } else if (iN != 16) {
                                c0 c0Var2 = null;
                                b0 b0Var2 = null;
                                if (iN == 24) {
                                    int iK = c0676e.k();
                                    if (iK == 0) {
                                        b0Var2 = b0.WARNING;
                                    } else if (iK == 1) {
                                        b0Var2 = b0Var;
                                    } else if (iK == 2) {
                                        b0Var2 = b0.HIDDEN;
                                    }
                                    if (b0Var2 == null) {
                                        c0154bJ.v(iN);
                                        c0154bJ.v(iK);
                                    } else {
                                        this.f11032t |= 4;
                                        this.f11035w = b0Var2;
                                    }
                                } else if (iN == 32) {
                                    this.f11032t |= 8;
                                    this.f11036x = c0676e.k();
                                } else if (iN == 40) {
                                    this.f11032t |= 16;
                                    this.f11037y = c0676e.k();
                                } else if (iN != 48) {
                                    if (!c0676e.q(iN, c0154bJ)) {
                                    }
                                } else {
                                    int iK2 = c0676e.k();
                                    if (iK2 == 0) {
                                        c0Var2 = c0Var;
                                    } else if (iK2 == 1) {
                                        c0Var2 = c0.COMPILER_VERSION;
                                    } else if (iK2 == 2) {
                                        c0Var2 = c0.API_VERSION;
                                    }
                                    if (c0Var2 == null) {
                                        c0154bJ.v(iN);
                                        c0154bJ.v(iK2);
                                    } else {
                                        this.f11032t |= 32;
                                        this.f11038z = c0Var2;
                                    }
                                }
                            } else {
                                this.f11032t |= 2;
                                this.f11034v = c0676e.k();
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
                    this.f11031s = c0674c.c();
                }
                throw th;
            }
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11031s = c0674c.c();
        }
    }
}
