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
public final class T extends AbstractC0682k {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final T f10899G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final C0609a f10900H = new C0609a(18);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Q f10901A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10902B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f10903C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List f10904D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public byte f10905E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f10906F;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0675d f10907t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10908u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10909v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10910w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f10911x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Q f10912y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10913z;

    static {
        T t7 = new T();
        f10899G = t7;
        t7.f10909v = 6;
        t7.f10910w = 0;
        List list = Collections.EMPTY_LIST;
        t7.f10911x = list;
        Q q10 = Q.f10869L;
        t7.f10912y = q10;
        t7.f10913z = 0;
        t7.f10901A = q10;
        t7.f10902B = 0;
        t7.f10903C = list;
        t7.f10904D = list;
    }

    public T(S s9) {
        super(s9);
        this.f10905E = (byte) -1;
        this.f10906F = -1;
        this.f10907t = s9.f12808s;
    }

    @Override // p104k9.t
    public final AbstractC0672a a() {
        return f10899G;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10906F;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f10908u & 1) == 1 ? C0154b.b(1, this.f10909v) : 0;
        if ((this.f10908u & 2) == 2) {
            iB += C0154b.b(2, this.f10910w);
        }
        for (int i11 = 0; i11 < this.f10911x.size(); i11++) {
            iB += C0154b.d(3, (AbstractC0672a) this.f10911x.get(i11));
        }
        if ((this.f10908u & 4) == 4) {
            iB += C0154b.d(4, this.f10912y);
        }
        if ((this.f10908u & 8) == 8) {
            iB += C0154b.b(5, this.f10913z);
        }
        if ((this.f10908u & 16) == 16) {
            iB += C0154b.d(6, this.f10901A);
        }
        if ((this.f10908u & 32) == 32) {
            iB += C0154b.b(7, this.f10902B);
        }
        for (int i12 = 0; i12 < this.f10903C.size(); i12++) {
            iB += C0154b.d(8, (AbstractC0672a) this.f10903C.get(i12));
        }
        int iC = 0;
        for (int i13 = 0; i13 < this.f10904D.size(); i13++) {
            iC += C0154b.c(((Integer) this.f10904D.get(i13)).intValue());
        }
        int size = this.f10907t.size() + i() + (this.f10904D.size() * 2) + iB + iC;
        this.f10906F = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return S.i();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        S sI = S.i();
        sI.j(this);
        return sI;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        S s9 = new S(this);
        if ((this.f10908u & 1) == 1) {
            c0154b.m(1, this.f10909v);
        }
        if ((this.f10908u & 2) == 2) {
            c0154b.m(2, this.f10910w);
        }
        for (int i10 = 0; i10 < this.f10911x.size(); i10++) {
            c0154b.o(3, (AbstractC0672a) this.f10911x.get(i10));
        }
        if ((this.f10908u & 4) == 4) {
            c0154b.o(4, this.f10912y);
        }
        if ((this.f10908u & 8) == 8) {
            c0154b.m(5, this.f10913z);
        }
        if ((this.f10908u & 16) == 16) {
            c0154b.o(6, this.f10901A);
        }
        if ((this.f10908u & 32) == 32) {
            c0154b.m(7, this.f10902B);
        }
        for (int i11 = 0; i11 < this.f10903C.size(); i11++) {
            c0154b.o(8, (AbstractC0672a) this.f10903C.get(i11));
        }
        for (int i12 = 0; i12 < this.f10904D.size(); i12++) {
            c0154b.m(31, ((Integer) this.f10904D.get(i12)).intValue());
        }
        s9.y(200, c0154b);
        c0154b.r(this.f10907t);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f10905E;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if ((this.f10908u & 2) != 2) {
            this.f10905E = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f10911x.size(); i10++) {
            if (!((W) this.f10911x.get(i10)).isInitialized()) {
                this.f10905E = (byte) 0;
                return false;
            }
        }
        if ((this.f10908u & 4) == 4 && !this.f10912y.isInitialized()) {
            this.f10905E = (byte) 0;
            return false;
        }
        if ((this.f10908u & 16) == 16 && !this.f10901A.isInitialized()) {
            this.f10905E = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f10903C.size(); i11++) {
            if (!((C0615g) this.f10903C.get(i11)).isInitialized()) {
                this.f10905E = (byte) 0;
                return false;
            }
        }
        if (h()) {
            this.f10905E = (byte) 1;
            return true;
        }
        this.f10905E = (byte) 0;
        return false;
    }

    public T() {
        this.f10905E = (byte) -1;
        this.f10906F = -1;
        this.f10907t = AbstractC0675d.f12795s;
    }

    public T(C0676e c0676e, C0678g c0678g) {
        this.f10905E = (byte) -1;
        this.f10906F = -1;
        this.f10909v = 6;
        boolean z6 = false;
        this.f10910w = 0;
        List list = Collections.EMPTY_LIST;
        this.f10911x = list;
        Q q10 = Q.f10869L;
        this.f10912y = q10;
        this.f10913z = 0;
        this.f10901A = q10;
        this.f10902B = 0;
        this.f10903C = list;
        this.f10904D = list;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        int i10 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    P pQ = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f10908u |= 1;
                            this.f10909v = c0676e.k();
                            continue;
                        case 16:
                            this.f10908u |= 2;
                            this.f10910w = c0676e.k();
                            continue;
                        case 26:
                            if ((i10 & 4) != 4) {
                                this.f10911x = new ArrayList();
                                i10 |= 4;
                            }
                            this.f10911x.add(c0676e.g(W.f10927F, c0678g));
                            continue;
                        case 34:
                            if ((this.f10908u & 4) == 4) {
                                Q q11 = this.f10912y;
                                q11.getClass();
                                pQ = Q.q(q11);
                            }
                            Q q12 = (Q) c0676e.g(Q.f10870M, c0678g);
                            this.f10912y = q12;
                            if (pQ != null) {
                                pQ.j(q12);
                                this.f10912y = pQ.h();
                            }
                            this.f10908u |= 4;
                            continue;
                        case 40:
                            this.f10908u |= 8;
                            this.f10913z = c0676e.k();
                            continue;
                        case 50:
                            if ((this.f10908u & 16) == 16) {
                                Q q13 = this.f10901A;
                                q13.getClass();
                                pQ = Q.q(q13);
                            }
                            Q q14 = (Q) c0676e.g(Q.f10870M, c0678g);
                            this.f10901A = q14;
                            if (pQ != null) {
                                pQ.j(q14);
                                this.f10901A = pQ.h();
                            }
                            this.f10908u |= 16;
                            continue;
                        case 56:
                            this.f10908u |= 32;
                            this.f10902B = c0676e.k();
                            continue;
                        case 66:
                            if ((i10 & 128) != 128) {
                                this.f10903C = new ArrayList();
                                i10 |= 128;
                            }
                            this.f10903C.add(c0676e.g(C0615g.f11060z, c0678g));
                            continue;
                        case 248:
                            if ((i10 & 256) != 256) {
                                this.f10904D = new ArrayList();
                                i10 |= 256;
                            }
                            this.f10904D.add(Integer.valueOf(c0676e.k()));
                            continue;
                        case 250:
                            int iD = c0676e.d(c0676e.k());
                            if ((i10 & 256) != 256 && c0676e.b() > 0) {
                                this.f10904D = new ArrayList();
                                i10 |= 256;
                            }
                            while (c0676e.b() > 0) {
                                this.f10904D.add(Integer.valueOf(c0676e.k()));
                            }
                            c0676e.c(iD);
                            continue;
                        default:
                            if (!m(c0676e, c0154bJ, c0678g, iN)) {
                                break;
                            }
                            break;
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if ((i10 & 4) == 4) {
                        this.f10911x = Collections.unmodifiableList(this.f10911x);
                    }
                    if ((i10 & 128) == 128) {
                        this.f10903C = Collections.unmodifiableList(this.f10903C);
                    }
                    if ((i10 & 256) == 256) {
                        this.f10904D = Collections.unmodifiableList(this.f10904D);
                    }
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f10907t = c0674c.c();
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
        if ((i10 & 4) == 4) {
            this.f10911x = Collections.unmodifiableList(this.f10911x);
        }
        if ((i10 & 128) == 128) {
            this.f10903C = Collections.unmodifiableList(this.f10903C);
        }
        if ((i10 & 256) == 256) {
            this.f10904D = Collections.unmodifiableList(this.f10904D);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10907t = c0674c.c();
        }
        l();
    }
}
