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

/* JADX INFO: renamed from: e9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0618j extends AbstractC0682k {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final C0618j f11098b0;
    public static final C0609a c0 = new C0609a(3);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f11099A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11100B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f11101C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11102D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f11103E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public List f11104F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f11105G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public List f11106H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public List f11107I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public List f11108J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public List f11109K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public List f11110L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public List f11111M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f11112N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f11113O;
    public Q P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f11114Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public List f11115R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f11116S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public List f11117T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public List f11118U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f11119V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public X f11120W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public List f11121X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public e0 f11122Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public byte f11123Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f11124a0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0675d f11125t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11126u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11127v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11128w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11129x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f11130y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f11131z;

    static {
        C0618j c0618j = new C0618j();
        f11098b0 = c0618j;
        c0618j.o();
    }

    public C0618j(C0616h c0616h) {
        super(c0616h);
        this.f11100B = -1;
        this.f11102D = -1;
        this.f11105G = -1;
        this.f11112N = -1;
        this.f11116S = -1;
        this.f11119V = -1;
        this.f11123Z = (byte) -1;
        this.f11124a0 = -1;
        this.f11125t = c0616h.f12808s;
    }

    @Override // p104k9.t
    public final AbstractC0672a a() {
        return f11098b0;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11124a0;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f11126u & 1) == 1 ? C0154b.b(1, this.f11127v) : 0;
        int iC = 0;
        for (int i11 = 0; i11 < this.f11099A.size(); i11++) {
            iC += C0154b.c(((Integer) this.f11099A.get(i11)).intValue());
        }
        int iD = iB + iC;
        if (!this.f11099A.isEmpty()) {
            iD = iD + 1 + C0154b.c(iC);
        }
        this.f11100B = iC;
        if ((this.f11126u & 2) == 2) {
            iD += C0154b.b(3, this.f11128w);
        }
        if ((this.f11126u & 4) == 4) {
            iD += C0154b.b(4, this.f11129x);
        }
        for (int i12 = 0; i12 < this.f11130y.size(); i12++) {
            iD += C0154b.d(5, (AbstractC0672a) this.f11130y.get(i12));
        }
        for (int i13 = 0; i13 < this.f11131z.size(); i13++) {
            iD += C0154b.d(6, (AbstractC0672a) this.f11131z.get(i13));
        }
        int iC2 = 0;
        for (int i14 = 0; i14 < this.f11101C.size(); i14++) {
            iC2 += C0154b.c(((Integer) this.f11101C.get(i14)).intValue());
        }
        int iD2 = iD + iC2;
        if (!this.f11101C.isEmpty()) {
            iD2 = iD2 + 1 + C0154b.c(iC2);
        }
        this.f11102D = iC2;
        for (int i15 = 0; i15 < this.f11106H.size(); i15++) {
            iD2 += C0154b.d(8, (AbstractC0672a) this.f11106H.get(i15));
        }
        for (int i16 = 0; i16 < this.f11107I.size(); i16++) {
            iD2 += C0154b.d(9, (AbstractC0672a) this.f11107I.get(i16));
        }
        for (int i17 = 0; i17 < this.f11108J.size(); i17++) {
            iD2 += C0154b.d(10, (AbstractC0672a) this.f11108J.get(i17));
        }
        for (int i18 = 0; i18 < this.f11109K.size(); i18++) {
            iD2 += C0154b.d(11, (AbstractC0672a) this.f11109K.get(i18));
        }
        for (int i19 = 0; i19 < this.f11110L.size(); i19++) {
            iD2 += C0154b.d(13, (AbstractC0672a) this.f11110L.get(i19));
        }
        int iC3 = 0;
        for (int i20 = 0; i20 < this.f11111M.size(); i20++) {
            iC3 += C0154b.c(((Integer) this.f11111M.get(i20)).intValue());
        }
        int iD3 = iD2 + iC3;
        if (!this.f11111M.isEmpty()) {
            iD3 = iD3 + 2 + C0154b.c(iC3);
        }
        this.f11112N = iC3;
        if ((this.f11126u & 8) == 8) {
            iD3 += C0154b.b(17, this.f11113O);
        }
        if ((this.f11126u & 16) == 16) {
            iD3 += C0154b.d(18, this.P);
        }
        if ((this.f11126u & 32) == 32) {
            iD3 += C0154b.b(19, this.f11114Q);
        }
        for (int i21 = 0; i21 < this.f11103E.size(); i21++) {
            iD3 += C0154b.d(20, (AbstractC0672a) this.f11103E.get(i21));
        }
        int iC4 = 0;
        for (int i22 = 0; i22 < this.f11104F.size(); i22++) {
            iC4 += C0154b.c(((Integer) this.f11104F.get(i22)).intValue());
        }
        int iC5 = iD3 + iC4;
        if (!this.f11104F.isEmpty()) {
            iC5 = iC5 + 2 + C0154b.c(iC4);
        }
        this.f11105G = iC4;
        int iC6 = 0;
        for (int i23 = 0; i23 < this.f11115R.size(); i23++) {
            iC6 += C0154b.c(((Integer) this.f11115R.get(i23)).intValue());
        }
        int iD4 = iC5 + iC6;
        if (!this.f11115R.isEmpty()) {
            iD4 = iD4 + 2 + C0154b.c(iC6);
        }
        this.f11116S = iC6;
        for (int i24 = 0; i24 < this.f11117T.size(); i24++) {
            iD4 += C0154b.d(23, (AbstractC0672a) this.f11117T.get(i24));
        }
        int iC7 = 0;
        for (int i25 = 0; i25 < this.f11118U.size(); i25++) {
            iC7 += C0154b.c(((Integer) this.f11118U.get(i25)).intValue());
        }
        int iD5 = iD4 + iC7;
        if (!this.f11118U.isEmpty()) {
            iD5 = iD5 + 2 + C0154b.c(iC7);
        }
        this.f11119V = iC7;
        if ((this.f11126u & 64) == 64) {
            iD5 += C0154b.d(30, this.f11120W);
        }
        int iC8 = 0;
        for (int i26 = 0; i26 < this.f11121X.size(); i26++) {
            iC8 += C0154b.c(((Integer) this.f11121X.get(i26)).intValue());
        }
        int size = (this.f11121X.size() * 2) + iD5 + iC8;
        if ((this.f11126u & 128) == 128) {
            size += C0154b.d(32, this.f11122Y);
        }
        int size2 = this.f11125t.size() + i() + size;
        this.f11124a0 = size2;
        return size2;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return C0616h.i();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        C0616h c0616hI = C0616h.i();
        c0616hI.j(this);
        return c0616hI;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        S s9 = new S(this);
        if ((this.f11126u & 1) == 1) {
            c0154b.m(1, this.f11127v);
        }
        if (this.f11099A.size() > 0) {
            c0154b.v(18);
            c0154b.v(this.f11100B);
        }
        for (int i10 = 0; i10 < this.f11099A.size(); i10++) {
            c0154b.n(((Integer) this.f11099A.get(i10)).intValue());
        }
        if ((this.f11126u & 2) == 2) {
            c0154b.m(3, this.f11128w);
        }
        if ((this.f11126u & 4) == 4) {
            c0154b.m(4, this.f11129x);
        }
        for (int i11 = 0; i11 < this.f11130y.size(); i11++) {
            c0154b.o(5, (AbstractC0672a) this.f11130y.get(i11));
        }
        for (int i12 = 0; i12 < this.f11131z.size(); i12++) {
            c0154b.o(6, (AbstractC0672a) this.f11131z.get(i12));
        }
        if (this.f11101C.size() > 0) {
            c0154b.v(58);
            c0154b.v(this.f11102D);
        }
        for (int i13 = 0; i13 < this.f11101C.size(); i13++) {
            c0154b.n(((Integer) this.f11101C.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f11106H.size(); i14++) {
            c0154b.o(8, (AbstractC0672a) this.f11106H.get(i14));
        }
        for (int i15 = 0; i15 < this.f11107I.size(); i15++) {
            c0154b.o(9, (AbstractC0672a) this.f11107I.get(i15));
        }
        for (int i16 = 0; i16 < this.f11108J.size(); i16++) {
            c0154b.o(10, (AbstractC0672a) this.f11108J.get(i16));
        }
        for (int i17 = 0; i17 < this.f11109K.size(); i17++) {
            c0154b.o(11, (AbstractC0672a) this.f11109K.get(i17));
        }
        for (int i18 = 0; i18 < this.f11110L.size(); i18++) {
            c0154b.o(13, (AbstractC0672a) this.f11110L.get(i18));
        }
        if (this.f11111M.size() > 0) {
            c0154b.v(130);
            c0154b.v(this.f11112N);
        }
        for (int i19 = 0; i19 < this.f11111M.size(); i19++) {
            c0154b.n(((Integer) this.f11111M.get(i19)).intValue());
        }
        if ((this.f11126u & 8) == 8) {
            c0154b.m(17, this.f11113O);
        }
        if ((this.f11126u & 16) == 16) {
            c0154b.o(18, this.P);
        }
        if ((this.f11126u & 32) == 32) {
            c0154b.m(19, this.f11114Q);
        }
        for (int i20 = 0; i20 < this.f11103E.size(); i20++) {
            c0154b.o(20, (AbstractC0672a) this.f11103E.get(i20));
        }
        if (this.f11104F.size() > 0) {
            c0154b.v(170);
            c0154b.v(this.f11105G);
        }
        for (int i21 = 0; i21 < this.f11104F.size(); i21++) {
            c0154b.n(((Integer) this.f11104F.get(i21)).intValue());
        }
        if (this.f11115R.size() > 0) {
            c0154b.v(178);
            c0154b.v(this.f11116S);
        }
        for (int i22 = 0; i22 < this.f11115R.size(); i22++) {
            c0154b.n(((Integer) this.f11115R.get(i22)).intValue());
        }
        for (int i23 = 0; i23 < this.f11117T.size(); i23++) {
            c0154b.o(23, (AbstractC0672a) this.f11117T.get(i23));
        }
        if (this.f11118U.size() > 0) {
            c0154b.v(194);
            c0154b.v(this.f11119V);
        }
        for (int i24 = 0; i24 < this.f11118U.size(); i24++) {
            c0154b.n(((Integer) this.f11118U.get(i24)).intValue());
        }
        if ((this.f11126u & 64) == 64) {
            c0154b.o(30, this.f11120W);
        }
        for (int i25 = 0; i25 < this.f11121X.size(); i25++) {
            c0154b.m(31, ((Integer) this.f11121X.get(i25)).intValue());
        }
        if ((this.f11126u & 128) == 128) {
            c0154b.o(32, this.f11122Y);
        }
        s9.y(19000, c0154b);
        c0154b.r(this.f11125t);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f11123Z;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if ((this.f11126u & 2) != 2) {
            this.f11123Z = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f11130y.size(); i10++) {
            if (!((W) this.f11130y.get(i10)).isInitialized()) {
                this.f11123Z = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f11131z.size(); i11++) {
            if (!((Q) this.f11131z.get(i11)).isInitialized()) {
                this.f11123Z = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f11103E.size(); i12++) {
            if (!((Q) this.f11103E.get(i12)).isInitialized()) {
                this.f11123Z = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f11106H.size(); i13++) {
            if (!((C0620l) this.f11106H.get(i13)).isInitialized()) {
                this.f11123Z = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f11107I.size(); i14++) {
            if (!((C0632y) this.f11107I.get(i14)).isInitialized()) {
                this.f11123Z = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f11108J.size(); i15++) {
            if (!((G) this.f11108J.get(i15)).isInitialized()) {
                this.f11123Z = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f11109K.size(); i16++) {
            if (!((T) this.f11109K.get(i16)).isInitialized()) {
                this.f11123Z = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f11110L.size(); i17++) {
            if (!((C0627t) this.f11110L.get(i17)).isInitialized()) {
                this.f11123Z = (byte) 0;
                return false;
            }
        }
        if ((this.f11126u & 16) == 16 && !this.P.isInitialized()) {
            this.f11123Z = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f11117T.size(); i18++) {
            if (!((Q) this.f11117T.get(i18)).isInitialized()) {
                this.f11123Z = (byte) 0;
                return false;
            }
        }
        if ((this.f11126u & 64) == 64 && !this.f11120W.isInitialized()) {
            this.f11123Z = (byte) 0;
            return false;
        }
        if (h()) {
            this.f11123Z = (byte) 1;
            return true;
        }
        this.f11123Z = (byte) 0;
        return false;
    }

    public final void o() {
        this.f11127v = 6;
        this.f11128w = 0;
        this.f11129x = 0;
        List list = Collections.EMPTY_LIST;
        this.f11130y = list;
        this.f11131z = list;
        this.f11099A = list;
        this.f11101C = list;
        this.f11103E = list;
        this.f11104F = list;
        this.f11106H = list;
        this.f11107I = list;
        this.f11108J = list;
        this.f11109K = list;
        this.f11110L = list;
        this.f11111M = list;
        this.f11113O = 0;
        this.P = Q.f10869L;
        this.f11114Q = 0;
        this.f11115R = list;
        this.f11117T = list;
        this.f11118U = list;
        this.f11120W = X.f10939y;
        this.f11121X = list;
        this.f11122Y = e0.f11047w;
    }

    public C0618j() {
        this.f11100B = -1;
        this.f11102D = -1;
        this.f11105G = -1;
        this.f11112N = -1;
        this.f11116S = -1;
        this.f11119V = -1;
        this.f11123Z = (byte) -1;
        this.f11124a0 = -1;
        this.f11125t = AbstractC0675d.f12795s;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    public C0618j(C0676e c0676e, C0678g c0678g) throws Throwable {
        this.f11100B = -1;
        this.f11102D = -1;
        this.f11105G = -1;
        this.f11112N = -1;
        this.f11116S = -1;
        this.f11119V = -1;
        this.f11123Z = (byte) -1;
        this.f11124a0 = -1;
        o();
        C0674c c0674cO = AbstractC0675d.o();
        boolean z6 = true;
        C0154b c0154bJ = C0154b.j(c0674cO, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = z6;
            if (!z10) {
                try {
                    try {
                        int iN = c0676e.n();
                        switch (iN) {
                            case 0:
                                z10 = z11;
                                z6 = z11;
                                break;
                            case 8:
                                this.f11126u |= 1;
                                this.f11127v = c0676e.f();
                                z6 = z11;
                                break;
                            case 16:
                                if ((i10 & 32) != 32) {
                                    this.f11099A = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f11099A.add(Integer.valueOf(c0676e.f()));
                                z6 = z11;
                                break;
                            case 18:
                                int iD = c0676e.d(c0676e.k());
                                if ((i10 & 32) != 32 && c0676e.b() > 0) {
                                    this.f11099A = new ArrayList();
                                    i10 |= 32;
                                }
                                while (c0676e.b() > 0) {
                                    this.f11099A.add(Integer.valueOf(c0676e.f()));
                                }
                                c0676e.c(iD);
                                z6 = z11;
                                break;
                            case 24:
                                this.f11126u |= 2;
                                this.f11128w = c0676e.f();
                                z6 = z11;
                                break;
                            case 32:
                                this.f11126u |= 4;
                                this.f11129x = c0676e.f();
                                z6 = z11;
                                break;
                            case 42:
                                if ((i10 & 8) != 8) {
                                    this.f11130y = new ArrayList();
                                    i10 |= 8;
                                }
                                this.f11130y.add(c0676e.g(W.f10927F, c0678g));
                                z6 = z11;
                                break;
                            case 50:
                                if ((i10 & 16) != 16) {
                                    this.f11131z = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f11131z.add(c0676e.g(Q.f10870M, c0678g));
                                z6 = z11;
                                break;
                            case 56:
                                if ((i10 & 64) != 64) {
                                    this.f11101C = new ArrayList();
                                    i10 |= 64;
                                }
                                this.f11101C.add(Integer.valueOf(c0676e.f()));
                                z6 = z11;
                                break;
                            case 58:
                                int iD2 = c0676e.d(c0676e.k());
                                if ((i10 & 64) != 64 && c0676e.b() > 0) {
                                    this.f11101C = new ArrayList();
                                    i10 |= 64;
                                }
                                while (c0676e.b() > 0) {
                                    this.f11101C.add(Integer.valueOf(c0676e.f()));
                                }
                                c0676e.c(iD2);
                                z6 = z11;
                                break;
                            case 66:
                                if ((i10 & 512) != 512) {
                                    this.f11106H = new ArrayList();
                                    i10 |= 512;
                                }
                                this.f11106H.add(c0676e.g(C0620l.f11137B, c0678g));
                                z6 = z11;
                                break;
                            case 74:
                                if ((i10 & 1024) != 1024) {
                                    this.f11107I = new ArrayList();
                                    i10 |= 1024;
                                }
                                this.f11107I.add(c0676e.g(C0632y.f11230N, c0678g));
                                z6 = z11;
                                break;
                            case 82:
                                if ((i10 & 2048) != 2048) {
                                    this.f11108J = new ArrayList();
                                    i10 |= 2048;
                                }
                                this.f11108J.add(c0676e.g(G.f10785N, c0678g));
                                z6 = z11;
                                break;
                            case 90:
                                if ((i10 & 4096) != 4096) {
                                    this.f11109K = new ArrayList();
                                    i10 |= 4096;
                                }
                                this.f11109K.add(c0676e.g(T.f10900H, c0678g));
                                z6 = z11;
                                break;
                            case 106:
                                if ((i10 & 8192) != 8192) {
                                    this.f11110L = new ArrayList();
                                    i10 |= 8192;
                                }
                                this.f11110L.add(c0676e.g(C0627t.f11182z, c0678g));
                                z6 = z11;
                                break;
                            case 128:
                                if ((i10 & 16384) != 16384) {
                                    this.f11111M = new ArrayList();
                                    i10 |= 16384;
                                }
                                this.f11111M.add(Integer.valueOf(c0676e.f()));
                                z6 = z11;
                                break;
                            case 130:
                                int iD3 = c0676e.d(c0676e.k());
                                if ((i10 & 16384) != 16384 && c0676e.b() > 0) {
                                    this.f11111M = new ArrayList();
                                    i10 |= 16384;
                                }
                                while (c0676e.b() > 0) {
                                    this.f11111M.add(Integer.valueOf(c0676e.f()));
                                }
                                c0676e.c(iD3);
                                z6 = z11;
                                break;
                            case 136:
                                this.f11126u |= 8;
                                this.f11113O = c0676e.f();
                                z6 = z11;
                                break;
                            case 146:
                                P pR = (this.f11126u & 16) == 16 ? this.P.d() : null;
                                Q q10 = (Q) c0676e.g(Q.f10870M, c0678g);
                                this.P = q10;
                                if (pR != 0) {
                                    pR.j(q10);
                                    this.P = pR.h();
                                }
                                this.f11126u |= 16;
                                z6 = z11;
                                break;
                            case 152:
                                this.f11126u |= 32;
                                this.f11114Q = c0676e.f();
                                z6 = z11;
                                break;
                            case 162:
                                if ((i10 & 128) != 128) {
                                    this.f11103E = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f11103E.add(c0676e.g(Q.f10870M, c0678g));
                                z6 = z11;
                                break;
                            case 168:
                                if ((i10 & 256) != 256) {
                                    this.f11104F = new ArrayList();
                                    i10 |= 256;
                                }
                                this.f11104F.add(Integer.valueOf(c0676e.f()));
                                z6 = z11;
                                break;
                            case 170:
                                int iD4 = c0676e.d(c0676e.k());
                                if ((i10 & 256) != 256 && c0676e.b() > 0) {
                                    this.f11104F = new ArrayList();
                                    i10 |= 256;
                                }
                                while (c0676e.b() > 0) {
                                    this.f11104F.add(Integer.valueOf(c0676e.f()));
                                }
                                c0676e.c(iD4);
                                z6 = z11;
                                break;
                            case 176:
                                if ((i10 & 262144) != 262144) {
                                    this.f11115R = new ArrayList();
                                    i10 |= 262144;
                                }
                                this.f11115R.add(Integer.valueOf(c0676e.f()));
                                z6 = z11;
                                break;
                            case 178:
                                int iD5 = c0676e.d(c0676e.k());
                                if ((i10 & 262144) != 262144 && c0676e.b() > 0) {
                                    this.f11115R = new ArrayList();
                                    i10 |= 262144;
                                }
                                while (c0676e.b() > 0) {
                                    this.f11115R.add(Integer.valueOf(c0676e.f()));
                                }
                                c0676e.c(iD5);
                                z6 = z11;
                                break;
                            case 186:
                                if ((i10 & 524288) != 524288) {
                                    this.f11117T = new ArrayList();
                                    i10 |= 524288;
                                }
                                this.f11117T.add(c0676e.g(Q.f10870M, c0678g));
                                z6 = z11;
                                break;
                            case 192:
                                if ((i10 & 1048576) != 1048576) {
                                    this.f11118U = new ArrayList();
                                    i10 |= 1048576;
                                }
                                this.f11118U.add(Integer.valueOf(c0676e.f()));
                                z6 = z11;
                                break;
                            case 194:
                                int iD6 = c0676e.d(c0676e.k());
                                if ((i10 & 1048576) != 1048576 && c0676e.b() > 0) {
                                    this.f11118U = new ArrayList();
                                    i10 |= 1048576;
                                }
                                while (c0676e.b() > 0) {
                                    this.f11118U.add(Integer.valueOf(c0676e.f()));
                                }
                                c0676e.c(iD6);
                                z6 = z11;
                                break;
                            case 242:
                                C0614f c0614fI = (this.f11126u & 64) == 64 ? this.f11120W.i() : null;
                                X x8 = (X) c0676e.g(X.f10940z, c0678g);
                                this.f11120W = x8;
                                if (c0614fI != 0) {
                                    c0614fI.m(x8);
                                    this.f11120W = c0614fI.i();
                                }
                                this.f11126u |= 64;
                                z6 = z11;
                                break;
                            case 248:
                                if ((i10 & 4194304) != 4194304) {
                                    this.f11121X = new ArrayList();
                                    i10 |= 4194304;
                                }
                                this.f11121X.add(Integer.valueOf(c0676e.f()));
                                z6 = z11;
                                break;
                            case 250:
                                int iD7 = c0676e.d(c0676e.k());
                                if ((i10 & 4194304) != 4194304 && c0676e.b() > 0) {
                                    this.f11121X = new ArrayList();
                                    i10 |= 4194304;
                                }
                                while (c0676e.b() > 0) {
                                    this.f11121X.add(Integer.valueOf(c0676e.f()));
                                }
                                c0676e.c(iD7);
                                z6 = z11;
                                break;
                            case 258:
                                try {
                                    C0621m c0621mH = (this.f11126u & 128) == 128 ? this.f11122Y.h() : null;
                                    e0 e0Var = (e0) c0676e.g(e0.f11048x, c0678g);
                                    this.f11122Y = e0Var;
                                    if (c0621mH != 0) {
                                        c0621mH.p(e0Var);
                                        this.f11122Y = c0621mH.j();
                                    }
                                    this.f11126u |= 128;
                                    z6 = z11;
                                } catch (InvalidProtocolBufferException e10) {
                                    e = e10;
                                    e.f12841s = this;
                                    throw e;
                                } catch (IOException e11) {
                                    e = e11;
                                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                    invalidProtocolBufferException.f12841s = this;
                                    throw invalidProtocolBufferException;
                                } catch (Throwable th) {
                                    th = th;
                                    if ((i10 & 32) == 32) {
                                        this.f11099A = Collections.unmodifiableList(this.f11099A);
                                    }
                                    if ((i10 & 8) == 8) {
                                        this.f11130y = Collections.unmodifiableList(this.f11130y);
                                    }
                                    if ((i10 & 16) == 16) {
                                        this.f11131z = Collections.unmodifiableList(this.f11131z);
                                    }
                                    if ((i10 & 64) == 64) {
                                        this.f11101C = Collections.unmodifiableList(this.f11101C);
                                    }
                                    if ((i10 & 512) == 512) {
                                        this.f11106H = Collections.unmodifiableList(this.f11106H);
                                    }
                                    if ((i10 & 1024) == 1024) {
                                        this.f11107I = Collections.unmodifiableList(this.f11107I);
                                    }
                                    if ((i10 & 2048) == 2048) {
                                        this.f11108J = Collections.unmodifiableList(this.f11108J);
                                    }
                                    if ((i10 & 4096) == 4096) {
                                        this.f11109K = Collections.unmodifiableList(this.f11109K);
                                    }
                                    if ((i10 & 8192) == 8192) {
                                        this.f11110L = Collections.unmodifiableList(this.f11110L);
                                    }
                                    if ((i10 & 16384) == 16384) {
                                        this.f11111M = Collections.unmodifiableList(this.f11111M);
                                    }
                                    if ((i10 & 128) == 128) {
                                        this.f11103E = Collections.unmodifiableList(this.f11103E);
                                    }
                                    if ((i10 & 256) == 256) {
                                        this.f11104F = Collections.unmodifiableList(this.f11104F);
                                    }
                                    if ((i10 & 262144) == 262144) {
                                        this.f11115R = Collections.unmodifiableList(this.f11115R);
                                    }
                                    if ((i10 & 524288) == 524288) {
                                        this.f11117T = Collections.unmodifiableList(this.f11117T);
                                    }
                                    if ((i10 & 1048576) == 1048576) {
                                        this.f11118U = Collections.unmodifiableList(this.f11118U);
                                    }
                                    if ((i10 & 4194304) == 4194304) {
                                        this.f11121X = Collections.unmodifiableList(this.f11121X);
                                    }
                                    try {
                                        c0154bJ.i();
                                        break;
                                    } catch (IOException unused) {
                                    } finally {
                                        this.f11125t = c0674cO.c();
                                    }
                                    l();
                                    throw th;
                                }
                                break;
                            default:
                                if (!m(c0676e, c0154bJ, c0678g, iN)) {
                                    z10 = z11;
                                }
                                z6 = z11;
                                break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (InvalidProtocolBufferException e12) {
                    e = e12;
                } catch (IOException e13) {
                    e = e13;
                }
            } else {
                if ((i10 & 32) == 32) {
                    this.f11099A = Collections.unmodifiableList(this.f11099A);
                }
                if ((i10 & 8) == 8) {
                    this.f11130y = Collections.unmodifiableList(this.f11130y);
                }
                if ((i10 & 16) == 16) {
                    this.f11131z = Collections.unmodifiableList(this.f11131z);
                }
                if ((i10 & 64) == 64) {
                    this.f11101C = Collections.unmodifiableList(this.f11101C);
                }
                if ((i10 & 512) == 512) {
                    this.f11106H = Collections.unmodifiableList(this.f11106H);
                }
                if ((i10 & 1024) == 1024) {
                    this.f11107I = Collections.unmodifiableList(this.f11107I);
                }
                if ((i10 & 2048) == 2048) {
                    this.f11108J = Collections.unmodifiableList(this.f11108J);
                }
                if ((i10 & 4096) == 4096) {
                    this.f11109K = Collections.unmodifiableList(this.f11109K);
                }
                if ((i10 & 8192) == 8192) {
                    this.f11110L = Collections.unmodifiableList(this.f11110L);
                }
                if ((i10 & 16384) == 16384) {
                    this.f11111M = Collections.unmodifiableList(this.f11111M);
                }
                if ((i10 & 128) == 128) {
                    this.f11103E = Collections.unmodifiableList(this.f11103E);
                }
                if ((i10 & 256) == 256) {
                    this.f11104F = Collections.unmodifiableList(this.f11104F);
                }
                if ((i10 & 262144) == 262144) {
                    this.f11115R = Collections.unmodifiableList(this.f11115R);
                }
                if ((i10 & 524288) == 524288) {
                    this.f11117T = Collections.unmodifiableList(this.f11117T);
                }
                if ((i10 & 1048576) == 1048576) {
                    this.f11118U = Collections.unmodifiableList(this.f11118U);
                }
                if ((i10 & 4194304) == 4194304) {
                    this.f11121X = Collections.unmodifiableList(this.f11121X);
                }
                try {
                    c0154bJ.i();
                } catch (IOException unused2) {
                } finally {
                    this.f11125t = c0674cO.c();
                }
                l();
                return;
            }
        }
    }
}
