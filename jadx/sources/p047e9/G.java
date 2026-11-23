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

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC0682k {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final G f10784M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C0609a f10785N = new C0609a(12);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f10786A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Q f10787B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10788C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List f10789D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f10790E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f10791F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Z f10792G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f10793H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f10794I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public List f10795J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public byte f10796K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f10797L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0675d f10798t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10799u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10800v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10802x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Q f10803y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10804z;

    static {
        G g8 = new G();
        f10784M = g8;
        g8.o();
    }

    public G(F f10) {
        super(f10);
        this.f10791F = -1;
        this.f10796K = (byte) -1;
        this.f10797L = -1;
        this.f10798t = f10.f12808s;
    }

    @Override // p104k9.t
    public final AbstractC0672a a() {
        return f10784M;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10797L;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f10799u & 2) == 2 ? C0154b.b(1, this.f10801w) : 0;
        if ((this.f10799u & 4) == 4) {
            iB += C0154b.b(2, this.f10802x);
        }
        if ((this.f10799u & 8) == 8) {
            iB += C0154b.d(3, this.f10803y);
        }
        for (int i11 = 0; i11 < this.f10786A.size(); i11++) {
            iB += C0154b.d(4, (AbstractC0672a) this.f10786A.get(i11));
        }
        if ((this.f10799u & 32) == 32) {
            iB += C0154b.d(5, this.f10787B);
        }
        if ((this.f10799u & 128) == 128) {
            iB += C0154b.d(6, this.f10792G);
        }
        if ((this.f10799u & 256) == 256) {
            iB += C0154b.b(7, this.f10793H);
        }
        if ((this.f10799u & 512) == 512) {
            iB += C0154b.b(8, this.f10794I);
        }
        if ((this.f10799u & 16) == 16) {
            iB += C0154b.b(9, this.f10804z);
        }
        if ((this.f10799u & 64) == 64) {
            iB += C0154b.b(10, this.f10788C);
        }
        if ((this.f10799u & 1) == 1) {
            iB += C0154b.b(11, this.f10800v);
        }
        for (int i12 = 0; i12 < this.f10789D.size(); i12++) {
            iB += C0154b.d(12, (AbstractC0672a) this.f10789D.get(i12));
        }
        int iC = 0;
        for (int i13 = 0; i13 < this.f10790E.size(); i13++) {
            iC += C0154b.c(((Integer) this.f10790E.get(i13)).intValue());
        }
        int iC2 = iB + iC;
        if (!this.f10790E.isEmpty()) {
            iC2 = iC2 + 1 + C0154b.c(iC);
        }
        this.f10791F = iC;
        int iC3 = 0;
        for (int i14 = 0; i14 < this.f10795J.size(); i14++) {
            iC3 += C0154b.c(((Integer) this.f10795J.get(i14)).intValue());
        }
        int size = this.f10798t.size() + i() + (this.f10795J.size() * 2) + iC2 + iC3;
        this.f10797L = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return F.i();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        F fI = F.i();
        fI.j(this);
        return fI;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        S s9 = new S(this);
        if ((this.f10799u & 2) == 2) {
            c0154b.m(1, this.f10801w);
        }
        if ((this.f10799u & 4) == 4) {
            c0154b.m(2, this.f10802x);
        }
        if ((this.f10799u & 8) == 8) {
            c0154b.o(3, this.f10803y);
        }
        for (int i10 = 0; i10 < this.f10786A.size(); i10++) {
            c0154b.o(4, (AbstractC0672a) this.f10786A.get(i10));
        }
        if ((this.f10799u & 32) == 32) {
            c0154b.o(5, this.f10787B);
        }
        if ((this.f10799u & 128) == 128) {
            c0154b.o(6, this.f10792G);
        }
        if ((this.f10799u & 256) == 256) {
            c0154b.m(7, this.f10793H);
        }
        if ((this.f10799u & 512) == 512) {
            c0154b.m(8, this.f10794I);
        }
        if ((this.f10799u & 16) == 16) {
            c0154b.m(9, this.f10804z);
        }
        if ((this.f10799u & 64) == 64) {
            c0154b.m(10, this.f10788C);
        }
        if ((this.f10799u & 1) == 1) {
            c0154b.m(11, this.f10800v);
        }
        for (int i11 = 0; i11 < this.f10789D.size(); i11++) {
            c0154b.o(12, (AbstractC0672a) this.f10789D.get(i11));
        }
        if (this.f10790E.size() > 0) {
            c0154b.v(106);
            c0154b.v(this.f10791F);
        }
        for (int i12 = 0; i12 < this.f10790E.size(); i12++) {
            c0154b.n(((Integer) this.f10790E.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f10795J.size(); i13++) {
            c0154b.m(31, ((Integer) this.f10795J.get(i13)).intValue());
        }
        s9.y(19000, c0154b);
        c0154b.r(this.f10798t);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f10796K;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        int i10 = this.f10799u;
        if ((i10 & 4) != 4) {
            this.f10796K = (byte) 0;
            return false;
        }
        if ((i10 & 8) == 8 && !this.f10803y.isInitialized()) {
            this.f10796K = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f10786A.size(); i11++) {
            if (!((W) this.f10786A.get(i11)).isInitialized()) {
                this.f10796K = (byte) 0;
                return false;
            }
        }
        if ((this.f10799u & 32) == 32 && !this.f10787B.isInitialized()) {
            this.f10796K = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f10789D.size(); i12++) {
            if (!((Q) this.f10789D.get(i12)).isInitialized()) {
                this.f10796K = (byte) 0;
                return false;
            }
        }
        if ((this.f10799u & 128) == 128 && !this.f10792G.isInitialized()) {
            this.f10796K = (byte) 0;
            return false;
        }
        if (h()) {
            this.f10796K = (byte) 1;
            return true;
        }
        this.f10796K = (byte) 0;
        return false;
    }

    public final void o() {
        this.f10800v = 518;
        this.f10801w = 2054;
        this.f10802x = 0;
        Q q10 = Q.f10869L;
        this.f10803y = q10;
        this.f10804z = 0;
        List list = Collections.EMPTY_LIST;
        this.f10786A = list;
        this.f10787B = q10;
        this.f10788C = 0;
        this.f10789D = list;
        this.f10790E = list;
        this.f10792G = Z.f10954D;
        this.f10793H = 0;
        this.f10794I = 0;
        this.f10795J = list;
    }

    public G() {
        this.f10791F = -1;
        this.f10796K = (byte) -1;
        this.f10797L = -1;
        this.f10798t = AbstractC0675d.f12795s;
    }

    public G(C0676e c0676e, C0678g c0678g) {
        this.f10791F = -1;
        this.f10796K = (byte) -1;
        this.f10797L = -1;
        o();
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        int i10 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c0676e.n();
                        P pQ = null;
                        Y y6 = null;
                        P pQ2 = null;
                        switch (iN) {
                            case 0:
                                break;
                            case 8:
                                this.f10799u |= 2;
                                this.f10801w = c0676e.k();
                                continue;
                            case 16:
                                this.f10799u |= 4;
                                this.f10802x = c0676e.k();
                                continue;
                            case 26:
                                if ((this.f10799u & 8) == 8) {
                                    Q q10 = this.f10803y;
                                    q10.getClass();
                                    pQ = Q.q(q10);
                                }
                                Q q11 = (Q) c0676e.g(Q.f10870M, c0678g);
                                this.f10803y = q11;
                                if (pQ != null) {
                                    pQ.j(q11);
                                    this.f10803y = pQ.h();
                                }
                                this.f10799u |= 8;
                                continue;
                            case 34:
                                int i11 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i11 != 32) {
                                    this.f10786A = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.f10786A.add(c0676e.g(W.f10927F, c0678g));
                                continue;
                            case 42:
                                if ((this.f10799u & 32) == 32) {
                                    Q q12 = this.f10787B;
                                    q12.getClass();
                                    pQ2 = Q.q(q12);
                                }
                                Q q13 = (Q) c0676e.g(Q.f10870M, c0678g);
                                this.f10787B = q13;
                                if (pQ2 != null) {
                                    pQ2.j(q13);
                                    this.f10787B = pQ2.h();
                                }
                                this.f10799u |= 32;
                                continue;
                            case 50:
                                if ((this.f10799u & 128) == 128) {
                                    Z z10 = this.f10792G;
                                    z10.getClass();
                                    y6 = new Y();
                                    Q q14 = Q.f10869L;
                                    y6.f10952y = q14;
                                    y6.f10947A = q14;
                                    y6.i(z10);
                                }
                                Z z11 = (Z) c0676e.g(Z.f10955E, c0678g);
                                this.f10792G = z11;
                                if (y6 != null) {
                                    y6.i(z11);
                                    this.f10792G = y6.h();
                                }
                                this.f10799u |= 128;
                                continue;
                            case 56:
                                this.f10799u |= 256;
                                this.f10793H = c0676e.k();
                                continue;
                            case 64:
                                this.f10799u |= 512;
                                this.f10794I = c0676e.k();
                                continue;
                            case 72:
                                this.f10799u |= 16;
                                this.f10804z = c0676e.k();
                                continue;
                            case 80:
                                this.f10799u |= 64;
                                this.f10788C = c0676e.k();
                                continue;
                            case 88:
                                this.f10799u |= 1;
                                this.f10800v = c0676e.k();
                                continue;
                            case 98:
                                int i12 = (i10 == true ? 1 : 0) & 256;
                                i10 = i10;
                                if (i12 != 256) {
                                    this.f10789D = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 256;
                                }
                                this.f10789D.add(c0676e.g(Q.f10870M, c0678g));
                                continue;
                            case 104:
                                int i13 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i13 != 512) {
                                    this.f10790E = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                this.f10790E.add(Integer.valueOf(c0676e.k()));
                                continue;
                            case 106:
                                int iD = c0676e.d(c0676e.k());
                                int i14 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i14 != 512 && c0676e.b() > 0) {
                                    i10 = i10;
                                    this.f10790E = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                i10 = i10;
                                while (c0676e.b() > 0) {
                                    this.f10790E.add(Integer.valueOf(c0676e.k()));
                                }
                                c0676e.c(iD);
                                continue;
                            case 248:
                                int i15 = (i10 == true ? 1 : 0) & 8192;
                                i10 = i10;
                                if (i15 != 8192) {
                                    this.f10795J = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8192;
                                }
                                this.f10795J.add(Integer.valueOf(c0676e.k()));
                                continue;
                            case 250:
                                int iD2 = c0676e.d(c0676e.k());
                                int i16 = (i10 == true ? 1 : 0) & 8192;
                                i10 = i10;
                                if (i16 != 8192 && c0676e.b() > 0) {
                                    i10 = i10;
                                    this.f10795J = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8192;
                                }
                                i10 = i10;
                                while (c0676e.b() > 0) {
                                    this.f10795J.add(Integer.valueOf(c0676e.k()));
                                }
                                c0676e.c(iD2);
                                continue;
                            default:
                                if (!m(c0676e, c0154bJ, c0678g, iN)) {
                                    break;
                                }
                                break;
                        }
                        z6 = true;
                    } catch (IOException e10) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                        invalidProtocolBufferException.f12841s = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    e11.f12841s = this;
                    throw e11;
                }
            } catch (Throwable th) {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f10786A = Collections.unmodifiableList(this.f10786A);
                }
                if (((i10 == true ? 1 : 0) & 256) == 256) {
                    this.f10789D = Collections.unmodifiableList(this.f10789D);
                }
                if (((i10 == true ? 1 : 0) & 512) == 512) {
                    this.f10790E = Collections.unmodifiableList(this.f10790E);
                }
                if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f10795J = Collections.unmodifiableList(this.f10795J);
                }
                try {
                    c0154bJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f10798t = c0674c.c();
                }
                l();
                throw th;
            }
        }
        if (((i10 == true ? 1 : 0) & 32) == 32) {
            this.f10786A = Collections.unmodifiableList(this.f10786A);
        }
        if (((i10 == true ? 1 : 0) & 256) == 256) {
            this.f10789D = Collections.unmodifiableList(this.f10789D);
        }
        if (((i10 == true ? 1 : 0) & 512) == 512) {
            this.f10790E = Collections.unmodifiableList(this.f10790E);
        }
        if (((i10 == true ? 1 : 0) & 8192) == 8192) {
            this.f10795J = Collections.unmodifiableList(this.f10795J);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10798t = c0674c.c();
        }
        l();
    }
}
