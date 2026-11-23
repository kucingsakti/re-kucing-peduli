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
public final class W extends AbstractC0682k {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final W f10926E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0609a f10927F = new C0609a(19);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f10928A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10929B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public byte f10930C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10931D;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0675d f10932t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10933u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public V f10937y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f10938z;

    static {
        W w2 = new W();
        f10926E = w2;
        w2.f10934v = 0;
        w2.f10935w = 0;
        w2.f10936x = false;
        w2.f10937y = V.INV;
        List list = Collections.EMPTY_LIST;
        w2.f10938z = list;
        w2.f10928A = list;
    }

    public W(U u3) {
        super(u3);
        this.f10929B = -1;
        this.f10930C = (byte) -1;
        this.f10931D = -1;
        this.f10932t = u3.f12808s;
    }

    @Override // p104k9.t
    public final AbstractC0672a a() {
        return f10926E;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10931D;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f10933u & 1) == 1 ? C0154b.b(1, this.f10934v) : 0;
        if ((this.f10933u & 2) == 2) {
            iB += C0154b.b(2, this.f10935w);
        }
        if ((this.f10933u & 4) == 4) {
            iB += C0154b.h(3) + 1;
        }
        if ((this.f10933u & 8) == 8) {
            iB += C0154b.a(4, this.f10937y.f10925s);
        }
        for (int i11 = 0; i11 < this.f10938z.size(); i11++) {
            iB += C0154b.d(5, (AbstractC0672a) this.f10938z.get(i11));
        }
        int iC = 0;
        for (int i12 = 0; i12 < this.f10928A.size(); i12++) {
            iC += C0154b.c(((Integer) this.f10928A.get(i12)).intValue());
        }
        int iC2 = iB + iC;
        if (!this.f10928A.isEmpty()) {
            iC2 = iC2 + 1 + C0154b.c(iC);
        }
        this.f10929B = iC;
        int size = this.f10932t.size() + i() + iC2;
        this.f10931D = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return U.i();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        U uI = U.i();
        uI.j(this);
        return uI;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        S s9 = new S(this);
        if ((this.f10933u & 1) == 1) {
            c0154b.m(1, this.f10934v);
        }
        if ((this.f10933u & 2) == 2) {
            c0154b.m(2, this.f10935w);
        }
        if ((this.f10933u & 4) == 4) {
            boolean z6 = this.f10936x;
            c0154b.x(3, 0);
            c0154b.q(z6 ? 1 : 0);
        }
        if ((this.f10933u & 8) == 8) {
            c0154b.l(4, this.f10937y.f10925s);
        }
        for (int i10 = 0; i10 < this.f10938z.size(); i10++) {
            c0154b.o(5, (AbstractC0672a) this.f10938z.get(i10));
        }
        if (this.f10928A.size() > 0) {
            c0154b.v(50);
            c0154b.v(this.f10929B);
        }
        for (int i11 = 0; i11 < this.f10928A.size(); i11++) {
            c0154b.n(((Integer) this.f10928A.get(i11)).intValue());
        }
        s9.y(1000, c0154b);
        c0154b.r(this.f10932t);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f10930C;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        int i10 = this.f10933u;
        if ((i10 & 1) != 1) {
            this.f10930C = (byte) 0;
            return false;
        }
        if ((i10 & 2) != 2) {
            this.f10930C = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f10938z.size(); i11++) {
            if (!((Q) this.f10938z.get(i11)).isInitialized()) {
                this.f10930C = (byte) 0;
                return false;
            }
        }
        if (h()) {
            this.f10930C = (byte) 1;
            return true;
        }
        this.f10930C = (byte) 0;
        return false;
    }

    public W() {
        this.f10929B = -1;
        this.f10930C = (byte) -1;
        this.f10931D = -1;
        this.f10932t = AbstractC0675d.f12795s;
    }

    public W(C0676e c0676e, C0678g c0678g) {
        V v4;
        this.f10929B = -1;
        this.f10930C = (byte) -1;
        this.f10931D = -1;
        this.f10934v = 0;
        this.f10935w = 0;
        this.f10936x = false;
        V v10 = V.INV;
        this.f10937y = v10;
        List list = Collections.EMPTY_LIST;
        this.f10938z = list;
        this.f10928A = list;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        int i10 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f10933u |= 1;
                            this.f10934v = c0676e.k();
                        } else if (iN == 16) {
                            this.f10933u |= 2;
                            this.f10935w = c0676e.k();
                        } else if (iN == 24) {
                            this.f10933u |= 4;
                            this.f10936x = c0676e.l() != 0;
                        } else if (iN == 32) {
                            int iK = c0676e.k();
                            if (iK == 0) {
                                v4 = V.IN;
                            } else if (iK != 1) {
                                v4 = iK != 2 ? null : v10;
                            } else {
                                v4 = V.OUT;
                            }
                            if (v4 == null) {
                                c0154bJ.v(iN);
                                c0154bJ.v(iK);
                            } else {
                                this.f10933u |= 8;
                                this.f10937y = v4;
                            }
                        } else if (iN == 42) {
                            if ((i10 & 16) != 16) {
                                this.f10938z = new ArrayList();
                                i10 |= 16;
                            }
                            this.f10938z.add(c0676e.g(Q.f10870M, c0678g));
                        } else if (iN == 48) {
                            if ((i10 & 32) != 32) {
                                this.f10928A = new ArrayList();
                                i10 |= 32;
                            }
                            this.f10928A.add(Integer.valueOf(c0676e.k()));
                        } else if (iN != 50) {
                            if (!m(c0676e, c0154bJ, c0678g, iN)) {
                            }
                        } else {
                            int iD = c0676e.d(c0676e.k());
                            if ((i10 & 32) != 32 && c0676e.b() > 0) {
                                this.f10928A = new ArrayList();
                                i10 |= 32;
                            }
                            while (c0676e.b() > 0) {
                                this.f10928A.add(Integer.valueOf(c0676e.k()));
                            }
                            c0676e.c(iD);
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if ((i10 & 16) == 16) {
                        this.f10938z = Collections.unmodifiableList(this.f10938z);
                    }
                    if ((i10 & 32) == 32) {
                        this.f10928A = Collections.unmodifiableList(this.f10928A);
                    }
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f10932t = c0674c.c();
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
        if ((i10 & 16) == 16) {
            this.f10938z = Collections.unmodifiableList(this.f10938z);
        }
        if ((i10 & 32) == 32) {
            this.f10928A = Collections.unmodifiableList(this.f10928A);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10932t = c0674c.c();
        }
        l();
    }
}
