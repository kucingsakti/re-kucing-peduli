package p047e9;

import B4.C0154b;
import com.google.android.gms.internal.measurement.S;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.AbstractC0682k;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.C0678g;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends AbstractC0682k {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Z f10954D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0609a f10955E = new C0609a(21);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10956A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public byte f10957B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10958C;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0675d f10959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Q f10963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10964y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Q f10965z;

    static {
        Z z6 = new Z();
        f10954D = z6;
        z6.f10961v = 0;
        z6.f10962w = 0;
        Q q10 = Q.f10869L;
        z6.f10963x = q10;
        z6.f10964y = 0;
        z6.f10965z = q10;
        z6.f10956A = 0;
    }

    public Z(Y y6) {
        super(y6);
        this.f10957B = (byte) -1;
        this.f10958C = -1;
        this.f10959t = y6.f12808s;
    }

    @Override // p104k9.t
    public final AbstractC0672a a() {
        return f10954D;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10958C;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f10960u & 1) == 1 ? C0154b.b(1, this.f10961v) : 0;
        if ((this.f10960u & 2) == 2) {
            iB += C0154b.b(2, this.f10962w);
        }
        if ((this.f10960u & 4) == 4) {
            iB += C0154b.d(3, this.f10963x);
        }
        if ((this.f10960u & 16) == 16) {
            iB += C0154b.d(4, this.f10965z);
        }
        if ((this.f10960u & 8) == 8) {
            iB += C0154b.b(5, this.f10964y);
        }
        if ((this.f10960u & 32) == 32) {
            iB += C0154b.b(6, this.f10956A);
        }
        int size = this.f10959t.size() + i() + iB;
        this.f10958C = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        Y y6 = new Y();
        Q q10 = Q.f10869L;
        y6.f10952y = q10;
        y6.f10947A = q10;
        return y6;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        Y y6 = new Y();
        Q q10 = Q.f10869L;
        y6.f10952y = q10;
        y6.f10947A = q10;
        y6.i(this);
        return y6;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        S s9 = new S(this);
        if ((this.f10960u & 1) == 1) {
            c0154b.m(1, this.f10961v);
        }
        if ((this.f10960u & 2) == 2) {
            c0154b.m(2, this.f10962w);
        }
        if ((this.f10960u & 4) == 4) {
            c0154b.o(3, this.f10963x);
        }
        if ((this.f10960u & 16) == 16) {
            c0154b.o(4, this.f10965z);
        }
        if ((this.f10960u & 8) == 8) {
            c0154b.m(5, this.f10964y);
        }
        if ((this.f10960u & 32) == 32) {
            c0154b.m(6, this.f10956A);
        }
        s9.y(200, c0154b);
        c0154b.r(this.f10959t);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f10957B;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        int i10 = this.f10960u;
        if ((i10 & 2) != 2) {
            this.f10957B = (byte) 0;
            return false;
        }
        if ((i10 & 4) == 4 && !this.f10963x.isInitialized()) {
            this.f10957B = (byte) 0;
            return false;
        }
        if ((this.f10960u & 16) == 16 && !this.f10965z.isInitialized()) {
            this.f10957B = (byte) 0;
            return false;
        }
        if (h()) {
            this.f10957B = (byte) 1;
            return true;
        }
        this.f10957B = (byte) 0;
        return false;
    }

    public Z() {
        this.f10957B = (byte) -1;
        this.f10958C = -1;
        this.f10959t = AbstractC0675d.f12795s;
    }

    public Z(C0676e c0676e, C0678g c0678g) {
        this.f10957B = (byte) -1;
        this.f10958C = -1;
        boolean z6 = false;
        this.f10961v = 0;
        this.f10962w = 0;
        Q q10 = Q.f10869L;
        this.f10963x = q10;
        this.f10964y = 0;
        this.f10965z = q10;
        this.f10956A = 0;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f10960u |= 1;
                            this.f10961v = c0676e.k();
                        } else if (iN != 16) {
                            P pQ = null;
                            if (iN == 26) {
                                if ((this.f10960u & 4) == 4) {
                                    Q q11 = this.f10963x;
                                    q11.getClass();
                                    pQ = Q.q(q11);
                                }
                                Q q12 = (Q) c0676e.g(Q.f10870M, c0678g);
                                this.f10963x = q12;
                                if (pQ != null) {
                                    pQ.j(q12);
                                    this.f10963x = pQ.h();
                                }
                                this.f10960u |= 4;
                            } else if (iN == 34) {
                                if ((this.f10960u & 16) == 16) {
                                    Q q13 = this.f10965z;
                                    q13.getClass();
                                    pQ = Q.q(q13);
                                }
                                Q q14 = (Q) c0676e.g(Q.f10870M, c0678g);
                                this.f10965z = q14;
                                if (pQ != null) {
                                    pQ.j(q14);
                                    this.f10965z = pQ.h();
                                }
                                this.f10960u |= 16;
                            } else if (iN == 40) {
                                this.f10960u |= 8;
                                this.f10964y = c0676e.k();
                            } else if (iN != 48) {
                                if (!m(c0676e, c0154bJ, c0678g, iN)) {
                                }
                            } else {
                                this.f10960u |= 32;
                                this.f10956A = c0676e.k();
                            }
                        } else {
                            this.f10960u |= 2;
                            this.f10962w = c0676e.k();
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f10959t = c0674c.c();
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
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10959t = c0674c.c();
        }
        l();
    }
}
