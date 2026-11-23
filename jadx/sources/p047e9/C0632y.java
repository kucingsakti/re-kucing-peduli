package p047e9;

import B4.C0154b;
import com.google.android.gms.internal.measurement.S;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.AbstractC0682k;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.C0678g;

/* JADX INFO: renamed from: e9.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0632y extends AbstractC0682k {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final C0632y f11229M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C0609a f11230N = new C0609a(9);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f11231A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Q f11232B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11233C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List f11234D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f11235E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f11236F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public List f11237G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public X f11238H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public List f11239I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C0622n f11240J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public byte f11241K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f11242L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0675d f11243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11244u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11245v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11247x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Q f11248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11249z;

    static {
        C0632y c0632y = new C0632y();
        f11229M = c0632y;
        c0632y.o();
    }

    public C0632y(C0631x c0631x) {
        super(c0631x);
        this.f11236F = -1;
        this.f11241K = (byte) -1;
        this.f11242L = -1;
        this.f11243t = c0631x.f12808s;
    }

    @Override // p104k9.t
    public final AbstractC0672a a() {
        return f11229M;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11242L;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f11244u & 2) == 2 ? C0154b.b(1, this.f11246w) : 0;
        if ((this.f11244u & 4) == 4) {
            iB += C0154b.b(2, this.f11247x);
        }
        if ((this.f11244u & 8) == 8) {
            iB += C0154b.d(3, this.f11248y);
        }
        for (int i11 = 0; i11 < this.f11231A.size(); i11++) {
            iB += C0154b.d(4, (AbstractC0672a) this.f11231A.get(i11));
        }
        if ((this.f11244u & 32) == 32) {
            iB += C0154b.d(5, this.f11232B);
        }
        for (int i12 = 0; i12 < this.f11237G.size(); i12++) {
            iB += C0154b.d(6, (AbstractC0672a) this.f11237G.get(i12));
        }
        if ((this.f11244u & 16) == 16) {
            iB += C0154b.b(7, this.f11249z);
        }
        if ((this.f11244u & 64) == 64) {
            iB += C0154b.b(8, this.f11233C);
        }
        if ((this.f11244u & 1) == 1) {
            iB += C0154b.b(9, this.f11245v);
        }
        for (int i13 = 0; i13 < this.f11234D.size(); i13++) {
            iB += C0154b.d(10, (AbstractC0672a) this.f11234D.get(i13));
        }
        int iC = 0;
        for (int i14 = 0; i14 < this.f11235E.size(); i14++) {
            iC += C0154b.c(((Integer) this.f11235E.get(i14)).intValue());
        }
        int iD = iB + iC;
        if (!this.f11235E.isEmpty()) {
            iD = iD + 1 + C0154b.c(iC);
        }
        this.f11236F = iC;
        if ((this.f11244u & 128) == 128) {
            iD += C0154b.d(30, this.f11238H);
        }
        int iC2 = 0;
        for (int i15 = 0; i15 < this.f11239I.size(); i15++) {
            iC2 += C0154b.c(((Integer) this.f11239I.get(i15)).intValue());
        }
        int size = (this.f11239I.size() * 2) + iD + iC2;
        if ((this.f11244u & 256) == 256) {
            size += C0154b.d(32, this.f11240J);
        }
        int size2 = this.f11243t.size() + i() + size;
        this.f11242L = size2;
        return size2;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return C0631x.i();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        C0631x c0631xI = C0631x.i();
        c0631xI.j(this);
        return c0631xI;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        S s9 = new S(this);
        if ((this.f11244u & 2) == 2) {
            c0154b.m(1, this.f11246w);
        }
        if ((this.f11244u & 4) == 4) {
            c0154b.m(2, this.f11247x);
        }
        if ((this.f11244u & 8) == 8) {
            c0154b.o(3, this.f11248y);
        }
        for (int i10 = 0; i10 < this.f11231A.size(); i10++) {
            c0154b.o(4, (AbstractC0672a) this.f11231A.get(i10));
        }
        if ((this.f11244u & 32) == 32) {
            c0154b.o(5, this.f11232B);
        }
        for (int i11 = 0; i11 < this.f11237G.size(); i11++) {
            c0154b.o(6, (AbstractC0672a) this.f11237G.get(i11));
        }
        if ((this.f11244u & 16) == 16) {
            c0154b.m(7, this.f11249z);
        }
        if ((this.f11244u & 64) == 64) {
            c0154b.m(8, this.f11233C);
        }
        if ((this.f11244u & 1) == 1) {
            c0154b.m(9, this.f11245v);
        }
        for (int i12 = 0; i12 < this.f11234D.size(); i12++) {
            c0154b.o(10, (AbstractC0672a) this.f11234D.get(i12));
        }
        if (this.f11235E.size() > 0) {
            c0154b.v(90);
            c0154b.v(this.f11236F);
        }
        for (int i13 = 0; i13 < this.f11235E.size(); i13++) {
            c0154b.n(((Integer) this.f11235E.get(i13)).intValue());
        }
        if ((this.f11244u & 128) == 128) {
            c0154b.o(30, this.f11238H);
        }
        for (int i14 = 0; i14 < this.f11239I.size(); i14++) {
            c0154b.m(31, ((Integer) this.f11239I.get(i14)).intValue());
        }
        if ((this.f11244u & 256) == 256) {
            c0154b.o(32, this.f11240J);
        }
        s9.y(19000, c0154b);
        c0154b.r(this.f11243t);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f11241K;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        int i10 = this.f11244u;
        if ((i10 & 4) != 4) {
            this.f11241K = (byte) 0;
            return false;
        }
        if ((i10 & 8) == 8 && !this.f11248y.isInitialized()) {
            this.f11241K = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f11231A.size(); i11++) {
            if (!((W) this.f11231A.get(i11)).isInitialized()) {
                this.f11241K = (byte) 0;
                return false;
            }
        }
        if ((this.f11244u & 32) == 32 && !this.f11232B.isInitialized()) {
            this.f11241K = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f11234D.size(); i12++) {
            if (!((Q) this.f11234D.get(i12)).isInitialized()) {
                this.f11241K = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f11237G.size(); i13++) {
            if (!((Z) this.f11237G.get(i13)).isInitialized()) {
                this.f11241K = (byte) 0;
                return false;
            }
        }
        if ((this.f11244u & 128) == 128 && !this.f11238H.isInitialized()) {
            this.f11241K = (byte) 0;
            return false;
        }
        if ((this.f11244u & 256) == 256 && !this.f11240J.isInitialized()) {
            this.f11241K = (byte) 0;
            return false;
        }
        if (h()) {
            this.f11241K = (byte) 1;
            return true;
        }
        this.f11241K = (byte) 0;
        return false;
    }

    public final void o() {
        this.f11245v = 6;
        this.f11246w = 6;
        this.f11247x = 0;
        Q q10 = Q.f10869L;
        this.f11248y = q10;
        this.f11249z = 0;
        List list = Collections.EMPTY_LIST;
        this.f11231A = list;
        this.f11232B = q10;
        this.f11233C = 0;
        this.f11234D = list;
        this.f11235E = list;
        this.f11237G = list;
        this.f11238H = X.f10939y;
        this.f11239I = list;
        this.f11240J = C0622n.f11148w;
    }

    public C0632y() {
        this.f11236F = -1;
        this.f11241K = (byte) -1;
        this.f11242L = -1;
        this.f11243t = AbstractC0675d.f12795s;
    }

    public C0632y(C0676e c0676e, C0678g c0678g) {
        this.f11236F = -1;
        this.f11241K = (byte) -1;
        this.f11242L = -1;
        o();
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        int i10 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    P pQ = null;
                    C0621m c0621m = null;
                    C0614f c0614fH = null;
                    P pQ2 = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f11244u |= 2;
                            this.f11246w = c0676e.k();
                            continue;
                        case 16:
                            this.f11244u |= 4;
                            this.f11247x = c0676e.k();
                            continue;
                        case 26:
                            if ((this.f11244u & 8) == 8) {
                                Q q10 = this.f11248y;
                                q10.getClass();
                                pQ = Q.q(q10);
                            }
                            Q q11 = (Q) c0676e.g(Q.f10870M, c0678g);
                            this.f11248y = q11;
                            if (pQ != null) {
                                pQ.j(q11);
                                this.f11248y = pQ.h();
                            }
                            this.f11244u |= 8;
                            continue;
                        case 34:
                            int i11 = (i10 == true ? 1 : 0) & 32;
                            i10 = i10;
                            if (i11 != 32) {
                                this.f11231A = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 32;
                            }
                            this.f11231A.add(c0676e.g(W.f10927F, c0678g));
                            continue;
                        case 42:
                            if ((this.f11244u & 32) == 32) {
                                Q q12 = this.f11232B;
                                q12.getClass();
                                pQ2 = Q.q(q12);
                            }
                            Q q13 = (Q) c0676e.g(Q.f10870M, c0678g);
                            this.f11232B = q13;
                            if (pQ2 != null) {
                                pQ2.j(q13);
                                this.f11232B = pQ2.h();
                            }
                            this.f11244u |= 32;
                            continue;
                        case 50:
                            int i12 = (i10 == true ? 1 : 0) & 1024;
                            i10 = i10;
                            if (i12 != 1024) {
                                this.f11237G = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1024;
                            }
                            this.f11237G.add(c0676e.g(Z.f10955E, c0678g));
                            continue;
                        case 56:
                            this.f11244u |= 16;
                            this.f11249z = c0676e.k();
                            continue;
                        case 64:
                            this.f11244u |= 64;
                            this.f11233C = c0676e.k();
                            continue;
                        case 72:
                            this.f11244u |= 1;
                            this.f11245v = c0676e.k();
                            continue;
                        case 82:
                            int i13 = (i10 == true ? 1 : 0) & 256;
                            i10 = i10;
                            if (i13 != 256) {
                                this.f11234D = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 256;
                            }
                            this.f11234D.add(c0676e.g(Q.f10870M, c0678g));
                            continue;
                        case 88:
                            int i14 = (i10 == true ? 1 : 0) & 512;
                            i10 = i10;
                            if (i14 != 512) {
                                this.f11235E = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 512;
                            }
                            this.f11235E.add(Integer.valueOf(c0676e.k()));
                            continue;
                        case 90:
                            int iD = c0676e.d(c0676e.k());
                            int i15 = (i10 == true ? 1 : 0) & 512;
                            i10 = i10;
                            if (i15 != 512 && c0676e.b() > 0) {
                                i10 = i10;
                                this.f11235E = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 512;
                            }
                            i10 = i10;
                            while (c0676e.b() > 0) {
                                this.f11235E.add(Integer.valueOf(c0676e.k()));
                            }
                            c0676e.c(iD);
                            continue;
                        case 242:
                            if ((this.f11244u & 128) == 128) {
                                X x8 = this.f11238H;
                                x8.getClass();
                                c0614fH = X.h(x8);
                            }
                            X x10 = (X) c0676e.g(X.f10940z, c0678g);
                            this.f11238H = x10;
                            if (c0614fH != null) {
                                c0614fH.m(x10);
                                this.f11238H = c0614fH.i();
                            }
                            this.f11244u |= 128;
                            continue;
                        case 248:
                            int i16 = (i10 == true ? 1 : 0) & 4096;
                            i10 = i10;
                            if (i16 != 4096) {
                                this.f11239I = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4096;
                            }
                            this.f11239I.add(Integer.valueOf(c0676e.k()));
                            continue;
                        case 250:
                            int iD2 = c0676e.d(c0676e.k());
                            int i17 = (i10 == true ? 1 : 0) & 4096;
                            i10 = i10;
                            if (i17 != 4096 && c0676e.b() > 0) {
                                i10 = i10;
                                this.f11239I = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4096;
                            }
                            i10 = i10;
                            while (c0676e.b() > 0) {
                                this.f11239I.add(Integer.valueOf(c0676e.k()));
                            }
                            c0676e.c(iD2);
                            continue;
                        case 258:
                            if ((this.f11244u & 256) == 256) {
                                C0622n c0622n = this.f11240J;
                                c0622n.getClass();
                                c0621m = new C0621m(0);
                                c0621m.f11147v = Collections.EMPTY_LIST;
                                c0621m.k(c0622n);
                            }
                            C0622n c0622n2 = (C0622n) c0676e.g(C0622n.f11149x, c0678g);
                            this.f11240J = c0622n2;
                            if (c0621m != null) {
                                c0621m.k(c0622n2);
                                this.f11240J = c0621m.f();
                            }
                            this.f11244u |= 256;
                            continue;
                        default:
                            if (!m(c0676e, c0154bJ, c0678g, iN)) {
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
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f11231A = Collections.unmodifiableList(this.f11231A);
                }
                if (((i10 == true ? 1 : 0) & 1024) == 1024) {
                    this.f11237G = Collections.unmodifiableList(this.f11237G);
                }
                if (((i10 == true ? 1 : 0) & 256) == 256) {
                    this.f11234D = Collections.unmodifiableList(this.f11234D);
                }
                if (((i10 == true ? 1 : 0) & 512) == 512) {
                    this.f11235E = Collections.unmodifiableList(this.f11235E);
                }
                if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f11239I = Collections.unmodifiableList(this.f11239I);
                }
                try {
                    c0154bJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f11243t = c0674c.c();
                }
                l();
                throw th;
            }
        }
        if (((i10 == true ? 1 : 0) & 32) == 32) {
            this.f11231A = Collections.unmodifiableList(this.f11231A);
        }
        if (((i10 == true ? 1 : 0) & 1024) == 1024) {
            this.f11237G = Collections.unmodifiableList(this.f11237G);
        }
        if (((i10 == true ? 1 : 0) & 256) == 256) {
            this.f11234D = Collections.unmodifiableList(this.f11234D);
        }
        if (((i10 == true ? 1 : 0) & 512) == 512) {
            this.f11235E = Collections.unmodifiableList(this.f11235E);
        }
        if (((i10 == true ? 1 : 0) & 4096) == 4096) {
            this.f11239I = Collections.unmodifiableList(this.f11239I);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11243t = c0674c.c();
        }
        l();
    }
}
