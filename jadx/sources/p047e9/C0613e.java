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

/* JADX INFO: renamed from: e9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0613e extends n {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0613e f11039y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0609a f11040z = new C0609a(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f11041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0612d f11044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f11045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11046x;

    static {
        C0613e c0613e = new C0613e();
        f11039y = c0613e;
        c0613e.f11043u = 0;
        c0613e.f11044v = C0612d.f11010H;
    }

    public C0613e() {
        this.f11045w = (byte) -1;
        this.f11046x = -1;
        this.f11041s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11046x;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f11042t & 1) == 1 ? C0154b.b(1, this.f11043u) : 0;
        if ((this.f11042t & 2) == 2) {
            iB += C0154b.d(2, this.f11044v);
        }
        int size = this.f11041s.size() + iB;
        this.f11046x = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        C0614f c0614f = new C0614f(2);
        c0614f.f11055v = C0612d.f11010H;
        return c0614f;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        C0614f c0614f = new C0614f(2);
        c0614f.f11055v = C0612d.f11010H;
        c0614f.k(this);
        return c0614f;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        if ((this.f11042t & 1) == 1) {
            c0154b.m(1, this.f11043u);
        }
        if ((this.f11042t & 2) == 2) {
            c0154b.o(2, this.f11044v);
        }
        c0154b.r(this.f11041s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f11045w;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        int i10 = this.f11042t;
        if ((i10 & 1) != 1) {
            this.f11045w = (byte) 0;
            return false;
        }
        if ((i10 & 2) != 2) {
            this.f11045w = (byte) 0;
            return false;
        }
        if (this.f11044v.isInitialized()) {
            this.f11045w = (byte) 1;
            return true;
        }
        this.f11045w = (byte) 0;
        return false;
    }

    public C0613e(C0614f c0614f) {
        this.f11045w = (byte) -1;
        this.f11046x = -1;
        this.f11041s = c0614f.f12808s;
    }

    public C0613e(C0676e c0676e, C0678g c0678g) {
        C0610b c0610bH;
        this.f11045w = (byte) -1;
        this.f11046x = -1;
        boolean z6 = false;
        this.f11043u = 0;
        this.f11044v = C0612d.f11010H;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f11042t |= 1;
                            this.f11043u = c0676e.k();
                        } else if (iN != 18) {
                            if (!c0676e.q(iN, c0154bJ)) {
                            }
                        } else {
                            if ((this.f11042t & 2) == 2) {
                                C0612d c0612d = this.f11044v;
                                c0612d.getClass();
                                c0610bH = C0610b.h();
                                c0610bH.i(c0612d);
                            } else {
                                c0610bH = null;
                            }
                            C0612d c0612d2 = (C0612d) c0676e.g(C0612d.f11011I, c0678g);
                            this.f11044v = c0612d2;
                            if (c0610bH != null) {
                                c0610bH.i(c0612d2);
                                this.f11044v = c0610bH.f();
                            }
                            this.f11042t |= 2;
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
                    this.f11041s = c0674c.c();
                }
                throw th;
            }
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11041s = c0674c.c();
        }
    }
}
