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
public final class J extends n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0609a f10814A = new C0609a(14);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final J f10815z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f10816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10817t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10818u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10819v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public I f10820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte f10821x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10822y;

    static {
        J j = new J();
        f10815z = j;
        j.f10818u = -1;
        j.f10819v = 0;
        j.f10820w = I.PACKAGE;
    }

    public J() {
        this.f10821x = (byte) -1;
        this.f10822y = -1;
        this.f10816s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10822y;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f10817t & 1) == 1 ? C0154b.b(1, this.f10818u) : 0;
        if ((this.f10817t & 2) == 2) {
            iB += C0154b.b(2, this.f10819v);
        }
        if ((this.f10817t & 4) == 4) {
            iB += C0154b.a(3, this.f10820w.f10813s);
        }
        int size = this.f10816s.size() + iB;
        this.f10822y = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return H.h();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        H h10 = H.h();
        h10.i(this);
        return h10;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        if ((this.f10817t & 1) == 1) {
            c0154b.m(1, this.f10818u);
        }
        if ((this.f10817t & 2) == 2) {
            c0154b.m(2, this.f10819v);
        }
        if ((this.f10817t & 4) == 4) {
            c0154b.l(3, this.f10820w.f10813s);
        }
        c0154b.r(this.f10816s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f10821x;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if ((this.f10817t & 2) == 2) {
            this.f10821x = (byte) 1;
            return true;
        }
        this.f10821x = (byte) 0;
        return false;
    }

    public J(H h10) {
        this.f10821x = (byte) -1;
        this.f10822y = -1;
        this.f10816s = h10.f12808s;
    }

    public J(C0676e c0676e) {
        I i10;
        this.f10821x = (byte) -1;
        this.f10822y = -1;
        this.f10818u = -1;
        boolean z6 = false;
        this.f10819v = 0;
        I i11 = I.PACKAGE;
        this.f10820w = i11;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f10817t |= 1;
                            this.f10818u = c0676e.k();
                        } else if (iN == 16) {
                            this.f10817t |= 2;
                            this.f10819v = c0676e.k();
                        } else if (iN != 24) {
                            if (!c0676e.q(iN, c0154bJ)) {
                            }
                        } else {
                            int iK = c0676e.k();
                            if (iK == 0) {
                                i10 = I.CLASS;
                            } else if (iK != 1) {
                                i10 = iK != 2 ? null : I.LOCAL;
                            } else {
                                i10 = i11;
                            }
                            if (i10 == null) {
                                c0154bJ.v(iN);
                                c0154bJ.v(iK);
                            } else {
                                this.f10817t |= 4;
                                this.f10820w = i10;
                            }
                        }
                    }
                    z6 = true;
                } catch (InvalidProtocolBufferException e10) {
                    e10.f12841s = this;
                    throw e10;
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
                    this.f10816s = c0674c.c();
                }
                throw th;
            }
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10816s = c0674c.c();
        }
    }
}
