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
public final class C extends AbstractC0682k {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C f10743C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0609a f10744D = new C0609a(10);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public byte f10745A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10746B;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0675d f10747t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10748u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f10749v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f10750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f10751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public X f10752y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e0 f10753z;

    static {
        C c10 = new C();
        f10743C = c10;
        List list = Collections.EMPTY_LIST;
        c10.f10749v = list;
        c10.f10750w = list;
        c10.f10751x = list;
        c10.f10752y = X.f10939y;
        c10.f10753z = e0.f11047w;
    }

    public C(B b3) {
        super(b3);
        this.f10745A = (byte) -1;
        this.f10746B = -1;
        this.f10747t = b3.f12808s;
    }

    @Override // p104k9.t
    public final AbstractC0672a a() {
        return f10743C;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10746B;
        if (i10 != -1) {
            return i10;
        }
        int iD = 0;
        for (int i11 = 0; i11 < this.f10749v.size(); i11++) {
            iD += C0154b.d(3, (AbstractC0672a) this.f10749v.get(i11));
        }
        for (int i12 = 0; i12 < this.f10750w.size(); i12++) {
            iD += C0154b.d(4, (AbstractC0672a) this.f10750w.get(i12));
        }
        for (int i13 = 0; i13 < this.f10751x.size(); i13++) {
            iD += C0154b.d(5, (AbstractC0672a) this.f10751x.get(i13));
        }
        if ((this.f10748u & 1) == 1) {
            iD += C0154b.d(30, this.f10752y);
        }
        if ((this.f10748u & 2) == 2) {
            iD += C0154b.d(32, this.f10753z);
        }
        int size = this.f10747t.size() + i() + iD;
        this.f10746B = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return B.i();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        B bI = B.i();
        bI.j(this);
        return bI;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        S s9 = new S(this);
        for (int i10 = 0; i10 < this.f10749v.size(); i10++) {
            c0154b.o(3, (AbstractC0672a) this.f10749v.get(i10));
        }
        for (int i11 = 0; i11 < this.f10750w.size(); i11++) {
            c0154b.o(4, (AbstractC0672a) this.f10750w.get(i11));
        }
        for (int i12 = 0; i12 < this.f10751x.size(); i12++) {
            c0154b.o(5, (AbstractC0672a) this.f10751x.get(i12));
        }
        if ((this.f10748u & 1) == 1) {
            c0154b.o(30, this.f10752y);
        }
        if ((this.f10748u & 2) == 2) {
            c0154b.o(32, this.f10753z);
        }
        s9.y(200, c0154b);
        c0154b.r(this.f10747t);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f10745A;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f10749v.size(); i10++) {
            if (!((C0632y) this.f10749v.get(i10)).isInitialized()) {
                this.f10745A = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f10750w.size(); i11++) {
            if (!((G) this.f10750w.get(i11)).isInitialized()) {
                this.f10745A = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f10751x.size(); i12++) {
            if (!((T) this.f10751x.get(i12)).isInitialized()) {
                this.f10745A = (byte) 0;
                return false;
            }
        }
        if ((this.f10748u & 1) == 1 && !this.f10752y.isInitialized()) {
            this.f10745A = (byte) 0;
            return false;
        }
        if (h()) {
            this.f10745A = (byte) 1;
            return true;
        }
        this.f10745A = (byte) 0;
        return false;
    }

    public C() {
        this.f10745A = (byte) -1;
        this.f10746B = -1;
        this.f10747t = AbstractC0675d.f12795s;
    }

    public C(C0676e c0676e, C0678g c0678g) {
        this.f10745A = (byte) -1;
        this.f10746B = -1;
        List list = Collections.EMPTY_LIST;
        this.f10749v = list;
        this.f10750w = list;
        this.f10751x = list;
        this.f10752y = X.f10939y;
        this.f10753z = e0.f11047w;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        int i10 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 != 1) {
                                this.f10749v = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.f10749v.add(c0676e.g(C0632y.f11230N, c0678g));
                        } else if (iN == 34) {
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 != 2) {
                                this.f10750w = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.f10750w.add(c0676e.g(G.f10785N, c0678g));
                        } else if (iN != 42) {
                            C0621m c0621m = null;
                            C0614f c0614fH = null;
                            if (iN == 242) {
                                if ((this.f10748u & 1) == 1) {
                                    X x8 = this.f10752y;
                                    x8.getClass();
                                    c0614fH = X.h(x8);
                                }
                                X x10 = (X) c0676e.g(X.f10940z, c0678g);
                                this.f10752y = x10;
                                if (c0614fH != null) {
                                    c0614fH.m(x10);
                                    this.f10752y = c0614fH.i();
                                }
                                this.f10748u |= 1;
                            } else if (iN != 258) {
                                if (!m(c0676e, c0154bJ, c0678g, iN)) {
                                }
                            } else {
                                if ((this.f10748u & 2) == 2) {
                                    e0 e0Var = this.f10753z;
                                    e0Var.getClass();
                                    c0621m = new C0621m(2);
                                    c0621m.f11147v = Collections.EMPTY_LIST;
                                    c0621m.p(e0Var);
                                }
                                e0 e0Var2 = (e0) c0676e.g(e0.f11048x, c0678g);
                                this.f10753z = e0Var2;
                                if (c0621m != null) {
                                    c0621m.p(e0Var2);
                                    this.f10753z = c0621m.j();
                                }
                                this.f10748u |= 2;
                            }
                        } else {
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 != 4) {
                                this.f10751x = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            this.f10751x.add(c0676e.g(T.f10900H, c0678g));
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if (((i10 == true ? 1 : 0) & 1) == 1) {
                        this.f10749v = Collections.unmodifiableList(this.f10749v);
                    }
                    if (((i10 == true ? 1 : 0) & 2) == 2) {
                        this.f10750w = Collections.unmodifiableList(this.f10750w);
                    }
                    if (((i10 == true ? 1 : 0) & 4) == 4) {
                        this.f10751x = Collections.unmodifiableList(this.f10751x);
                    }
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f10747t = c0674c.c();
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
        if (((i10 == true ? 1 : 0) & 1) == 1) {
            this.f10749v = Collections.unmodifiableList(this.f10749v);
        }
        if (((i10 == true ? 1 : 0) & 2) == 2) {
            this.f10750w = Collections.unmodifiableList(this.f10750w);
        }
        if (((i10 == true ? 1 : 0) & 4) == 4) {
            this.f10751x = Collections.unmodifiableList(this.f10751x);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10747t = c0674c.c();
        }
        l();
    }
}
