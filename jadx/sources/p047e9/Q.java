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
public final class Q extends AbstractC0682k {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Q f10869L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final C0609a f10870M = new C0609a(16);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10871A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10872B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10873C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10874D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Q f10875E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f10876F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Q f10877G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f10878H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f10879I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public byte f10880J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f10881K;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0675d f10882t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10883u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f10884v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10886x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Q f10887y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10888z;

    static {
        Q q10 = new Q();
        f10869L = q10;
        q10.p();
    }

    public Q(P p10) {
        super(p10);
        this.f10880J = (byte) -1;
        this.f10881K = -1;
        this.f10882t = p10.f12808s;
    }

    public static P q(Q q10) {
        P pI = P.i();
        pI.j(q10);
        return pI;
    }

    @Override // p104k9.t
    public final AbstractC0672a a() {
        return f10869L;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10881K;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f10883u & 4096) == 4096 ? C0154b.b(1, this.f10879I) : 0;
        for (int i11 = 0; i11 < this.f10884v.size(); i11++) {
            iB += C0154b.d(2, (AbstractC0672a) this.f10884v.get(i11));
        }
        if ((this.f10883u & 1) == 1) {
            iB += C0154b.h(3) + 1;
        }
        if ((this.f10883u & 2) == 2) {
            iB += C0154b.b(4, this.f10886x);
        }
        if ((this.f10883u & 4) == 4) {
            iB += C0154b.d(5, this.f10887y);
        }
        if ((this.f10883u & 16) == 16) {
            iB += C0154b.b(6, this.f10871A);
        }
        if ((this.f10883u & 32) == 32) {
            iB += C0154b.b(7, this.f10872B);
        }
        if ((this.f10883u & 8) == 8) {
            iB += C0154b.b(8, this.f10888z);
        }
        if ((this.f10883u & 64) == 64) {
            iB += C0154b.b(9, this.f10873C);
        }
        if ((this.f10883u & 256) == 256) {
            iB += C0154b.d(10, this.f10875E);
        }
        if ((this.f10883u & 512) == 512) {
            iB += C0154b.b(11, this.f10876F);
        }
        if ((this.f10883u & 128) == 128) {
            iB += C0154b.b(12, this.f10874D);
        }
        if ((this.f10883u & 1024) == 1024) {
            iB += C0154b.d(13, this.f10877G);
        }
        if ((this.f10883u & 2048) == 2048) {
            iB += C0154b.b(14, this.f10878H);
        }
        int size = this.f10882t.size() + i() + iB;
        this.f10881K = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return P.i();
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        S s9 = new S(this);
        if ((this.f10883u & 4096) == 4096) {
            c0154b.m(1, this.f10879I);
        }
        for (int i10 = 0; i10 < this.f10884v.size(); i10++) {
            c0154b.o(2, (AbstractC0672a) this.f10884v.get(i10));
        }
        if ((this.f10883u & 1) == 1) {
            boolean z6 = this.f10885w;
            c0154b.x(3, 0);
            c0154b.q(z6 ? 1 : 0);
        }
        if ((this.f10883u & 2) == 2) {
            c0154b.m(4, this.f10886x);
        }
        if ((this.f10883u & 4) == 4) {
            c0154b.o(5, this.f10887y);
        }
        if ((this.f10883u & 16) == 16) {
            c0154b.m(6, this.f10871A);
        }
        if ((this.f10883u & 32) == 32) {
            c0154b.m(7, this.f10872B);
        }
        if ((this.f10883u & 8) == 8) {
            c0154b.m(8, this.f10888z);
        }
        if ((this.f10883u & 64) == 64) {
            c0154b.m(9, this.f10873C);
        }
        if ((this.f10883u & 256) == 256) {
            c0154b.o(10, this.f10875E);
        }
        if ((this.f10883u & 512) == 512) {
            c0154b.m(11, this.f10876F);
        }
        if ((this.f10883u & 128) == 128) {
            c0154b.m(12, this.f10874D);
        }
        if ((this.f10883u & 1024) == 1024) {
            c0154b.o(13, this.f10877G);
        }
        if ((this.f10883u & 2048) == 2048) {
            c0154b.m(14, this.f10878H);
        }
        s9.y(200, c0154b);
        c0154b.r(this.f10882t);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f10880J;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f10884v.size(); i10++) {
            if (!((O) this.f10884v.get(i10)).isInitialized()) {
                this.f10880J = (byte) 0;
                return false;
            }
        }
        if ((this.f10883u & 4) == 4 && !this.f10887y.isInitialized()) {
            this.f10880J = (byte) 0;
            return false;
        }
        if ((this.f10883u & 256) == 256 && !this.f10875E.isInitialized()) {
            this.f10880J = (byte) 0;
            return false;
        }
        if ((this.f10883u & 1024) == 1024 && !this.f10877G.isInitialized()) {
            this.f10880J = (byte) 0;
            return false;
        }
        if (h()) {
            this.f10880J = (byte) 1;
            return true;
        }
        this.f10880J = (byte) 0;
        return false;
    }

    public final boolean o() {
        return (this.f10883u & 16) == 16;
    }

    public final void p() {
        this.f10884v = Collections.EMPTY_LIST;
        this.f10885w = false;
        this.f10886x = 0;
        Q q10 = f10869L;
        this.f10887y = q10;
        this.f10888z = 0;
        this.f10871A = 0;
        this.f10872B = 0;
        this.f10873C = 0;
        this.f10874D = 0;
        this.f10875E = q10;
        this.f10876F = 0;
        this.f10877G = q10;
        this.f10878H = 0;
        this.f10879I = 0;
    }

    @Override // p104k9.AbstractC0672a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final P d() {
        return q(this);
    }

    public Q() {
        this.f10880J = (byte) -1;
        this.f10881K = -1;
        this.f10882t = AbstractC0675d.f12795s;
    }

    public Q(C0676e c0676e, C0678g c0678g) {
        this.f10880J = (byte) -1;
        this.f10881K = -1;
        p();
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        boolean z10 = false;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    C0609a c0609a = f10870M;
                    P pQ = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f10883u |= 4096;
                            this.f10879I = c0676e.k();
                            continue;
                        case 18:
                            if (!z10) {
                                this.f10884v = new ArrayList();
                                z10 = true;
                            }
                            this.f10884v.add(c0676e.g(O.f10845A, c0678g));
                            continue;
                        case 24:
                            this.f10883u |= 1;
                            this.f10885w = c0676e.l() != 0;
                            continue;
                        case 32:
                            this.f10883u |= 2;
                            this.f10886x = c0676e.k();
                            continue;
                        case 42:
                            if ((this.f10883u & 4) == 4) {
                                Q q10 = this.f10887y;
                                q10.getClass();
                                pQ = q(q10);
                            }
                            Q q11 = (Q) c0676e.g(c0609a, c0678g);
                            this.f10887y = q11;
                            if (pQ != null) {
                                pQ.j(q11);
                                this.f10887y = pQ.h();
                            }
                            this.f10883u |= 4;
                            continue;
                        case 48:
                            this.f10883u |= 16;
                            this.f10871A = c0676e.k();
                            continue;
                        case 56:
                            this.f10883u |= 32;
                            this.f10872B = c0676e.k();
                            continue;
                        case 64:
                            this.f10883u |= 8;
                            this.f10888z = c0676e.k();
                            continue;
                        case 72:
                            this.f10883u |= 64;
                            this.f10873C = c0676e.k();
                            continue;
                        case 82:
                            if ((this.f10883u & 256) == 256) {
                                Q q12 = this.f10875E;
                                q12.getClass();
                                pQ = q(q12);
                            }
                            Q q13 = (Q) c0676e.g(c0609a, c0678g);
                            this.f10875E = q13;
                            if (pQ != null) {
                                pQ.j(q13);
                                this.f10875E = pQ.h();
                            }
                            this.f10883u |= 256;
                            continue;
                        case 88:
                            this.f10883u |= 512;
                            this.f10876F = c0676e.k();
                            continue;
                        case 96:
                            this.f10883u |= 128;
                            this.f10874D = c0676e.k();
                            continue;
                        case 106:
                            if ((this.f10883u & 1024) == 1024) {
                                Q q14 = this.f10877G;
                                q14.getClass();
                                pQ = q(q14);
                            }
                            Q q15 = (Q) c0676e.g(c0609a, c0678g);
                            this.f10877G = q15;
                            if (pQ != null) {
                                pQ.j(q15);
                                this.f10877G = pQ.h();
                            }
                            this.f10883u |= 1024;
                            continue;
                        case 112:
                            this.f10883u |= 2048;
                            this.f10878H = c0676e.k();
                            continue;
                        default:
                            if (!m(c0676e, c0154bJ, c0678g, iN)) {
                                break;
                            }
                            break;
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if (z10) {
                        this.f10884v = Collections.unmodifiableList(this.f10884v);
                    }
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f10882t = c0674c.c();
                    }
                    l();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.f12841s = this;
                throw e10;
            } catch (IOException e11) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                invalidProtocolBufferException.f12841s = this;
                throw invalidProtocolBufferException;
            }
        }
        if (z10) {
            this.f10884v = Collections.unmodifiableList(this.f10884v);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10882t = c0674c.c();
        }
        l();
    }
}
