package p047e9;

import B4.C0154b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;

/* JADX INFO: renamed from: e9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0612d extends n {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final C0612d f11010H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C0609a f11011I = new C0609a(2);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11012A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0615g f11013B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f11014C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11015D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f11016E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public byte f11017F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f11018G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f11019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11020t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EnumC0611c f11021u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f11022v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f11023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f11024x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11025y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11026z;

    static {
        C0612d c0612d = new C0612d();
        f11010H = c0612d;
        c0612d.h();
    }

    public C0612d() {
        this.f11017F = (byte) -1;
        this.f11018G = -1;
        this.f11019s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11018G;
        if (i10 != -1) {
            return i10;
        }
        int iA = (this.f11020t & 1) == 1 ? C0154b.a(1, this.f11021u.f11004s) : 0;
        if ((this.f11020t & 2) == 2) {
            long j = this.f11022v;
            iA += C0154b.g((j >> 63) ^ (j << 1)) + C0154b.h(2);
        }
        if ((this.f11020t & 4) == 4) {
            iA += C0154b.h(3) + 4;
        }
        if ((this.f11020t & 8) == 8) {
            iA += C0154b.h(4) + 8;
        }
        if ((this.f11020t & 16) == 16) {
            iA += C0154b.b(5, this.f11025y);
        }
        if ((this.f11020t & 32) == 32) {
            iA += C0154b.b(6, this.f11026z);
        }
        if ((this.f11020t & 64) == 64) {
            iA += C0154b.b(7, this.f11012A);
        }
        if ((this.f11020t & 128) == 128) {
            iA += C0154b.d(8, this.f11013B);
        }
        for (int i11 = 0; i11 < this.f11014C.size(); i11++) {
            iA += C0154b.d(9, (AbstractC0672a) this.f11014C.get(i11));
        }
        if ((this.f11020t & 512) == 512) {
            iA += C0154b.b(10, this.f11016E);
        }
        if ((this.f11020t & 256) == 256) {
            iA += C0154b.b(11, this.f11015D);
        }
        int size = this.f11019s.size() + iA;
        this.f11018G = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return C0610b.h();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        C0610b c0610bH = C0610b.h();
        c0610bH.i(this);
        return c0610bH;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        if ((this.f11020t & 1) == 1) {
            c0154b.l(1, this.f11021u.f11004s);
        }
        if ((this.f11020t & 2) == 2) {
            long j = this.f11022v;
            c0154b.x(2, 0);
            c0154b.w((j >> 63) ^ (j << 1));
        }
        if ((this.f11020t & 4) == 4) {
            float f10 = this.f11023w;
            c0154b.x(3, 5);
            c0154b.t(Float.floatToRawIntBits(f10));
        }
        if ((this.f11020t & 8) == 8) {
            double d3 = this.f11024x;
            c0154b.x(4, 1);
            c0154b.u(Double.doubleToRawLongBits(d3));
        }
        if ((this.f11020t & 16) == 16) {
            c0154b.m(5, this.f11025y);
        }
        if ((this.f11020t & 32) == 32) {
            c0154b.m(6, this.f11026z);
        }
        if ((this.f11020t & 64) == 64) {
            c0154b.m(7, this.f11012A);
        }
        if ((this.f11020t & 128) == 128) {
            c0154b.o(8, this.f11013B);
        }
        for (int i10 = 0; i10 < this.f11014C.size(); i10++) {
            c0154b.o(9, (AbstractC0672a) this.f11014C.get(i10));
        }
        if ((this.f11020t & 512) == 512) {
            c0154b.m(10, this.f11016E);
        }
        if ((this.f11020t & 256) == 256) {
            c0154b.m(11, this.f11015D);
        }
        c0154b.r(this.f11019s);
    }

    public final void h() {
        this.f11021u = EnumC0611c.BYTE;
        this.f11022v = 0L;
        this.f11023w = 0.0f;
        this.f11024x = 0.0d;
        this.f11025y = 0;
        this.f11026z = 0;
        this.f11012A = 0;
        this.f11013B = C0615g.f11059y;
        this.f11014C = Collections.EMPTY_LIST;
        this.f11015D = 0;
        this.f11016E = 0;
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f11017F;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if ((this.f11020t & 128) == 128 && !this.f11013B.isInitialized()) {
            this.f11017F = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f11014C.size(); i10++) {
            if (!((C0612d) this.f11014C.get(i10)).isInitialized()) {
                this.f11017F = (byte) 0;
                return false;
            }
        }
        this.f11017F = (byte) 1;
        return true;
    }

    public C0612d(C0610b c0610b) {
        this.f11017F = (byte) -1;
        this.f11018G = -1;
        this.f11019s = c0610b.f12808s;
    }

    public C0612d(C0676e c0676e, C0678g c0678g) {
        C0614f c0614f;
        this.f11017F = (byte) -1;
        this.f11018G = -1;
        h();
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        char c10 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            int iK = c0676e.k();
                            EnumC0611c enumC0611cF = EnumC0611c.f(iK);
                            if (enumC0611cF == null) {
                                c0154bJ.v(iN);
                                c0154bJ.v(iK);
                            } else {
                                this.f11020t |= 1;
                                this.f11021u = enumC0611cF;
                                continue;
                            }
                            break;
                        case 16:
                            this.f11020t |= 2;
                            long jL = c0676e.l();
                            this.f11022v = (-(jL & 1)) ^ (jL >>> 1);
                            continue;
                        case 29:
                            this.f11020t |= 4;
                            this.f11023w = Float.intBitsToFloat(c0676e.i());
                            continue;
                        case 33:
                            this.f11020t |= 8;
                            this.f11024x = Double.longBitsToDouble(c0676e.j());
                            continue;
                        case 40:
                            this.f11020t |= 16;
                            this.f11025y = c0676e.k();
                            continue;
                        case 48:
                            this.f11020t |= 32;
                            this.f11026z = c0676e.k();
                            continue;
                        case 56:
                            this.f11020t |= 64;
                            this.f11012A = c0676e.k();
                            continue;
                        case 66:
                            if ((this.f11020t & 128) == 128) {
                                C0615g c0615g = this.f11013B;
                                c0615g.getClass();
                                c0614f = new C0614f(0);
                                c0614f.f11055v = Collections.EMPTY_LIST;
                                c0614f.l(c0615g);
                            } else {
                                c0614f = null;
                            }
                            C0615g c0615g2 = (C0615g) c0676e.g(C0615g.f11060z, c0678g);
                            this.f11013B = c0615g2;
                            if (c0614f != null) {
                                c0614f.l(c0615g2);
                                this.f11013B = c0614f.h();
                            }
                            this.f11020t |= 128;
                            continue;
                        case 74:
                            if ((c10 & 256) != 256) {
                                this.f11014C = new ArrayList();
                                c10 = 256;
                            }
                            this.f11014C.add(c0676e.g(f11011I, c0678g));
                            continue;
                        case 80:
                            this.f11020t |= 512;
                            this.f11016E = c0676e.k();
                            continue;
                        case 88:
                            this.f11020t |= 256;
                            this.f11015D = c0676e.k();
                            continue;
                        default:
                            if (!c0676e.q(iN, c0154bJ)) {
                                break;
                            }
                            break;
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
                if ((c10 & 256) == 256) {
                    this.f11014C = Collections.unmodifiableList(this.f11014C);
                }
                try {
                    c0154bJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f11019s = c0674c.c();
                }
                throw th;
            }
        }
        if ((c10 & 256) == 256) {
            this.f11014C = Collections.unmodifiableList(this.f11014C);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11019s = c0674c.c();
        }
    }
}
