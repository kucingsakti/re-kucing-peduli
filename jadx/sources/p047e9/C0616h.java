package p047e9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0680i;
import p104k9.AbstractC0681j;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;

/* JADX INFO: renamed from: e9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0616h extends AbstractC0681j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f11067A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f11068B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f11069C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List f11070D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f11071E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public List f11072F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public List f11073G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public List f11074H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public List f11075I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public List f11076J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public List f11077K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f11078L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Q f11079M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f11080N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public List f11081O;
    public List P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public List f11082Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public X f11083R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public List f11084S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public e0 f11085T;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11086v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11089y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f11090z;

    public static C0616h i() {
        C0616h c0616h = new C0616h();
        c0616h.f11087w = 6;
        List list = Collections.EMPTY_LIST;
        c0616h.f11090z = list;
        c0616h.f11067A = list;
        c0616h.f11068B = list;
        c0616h.f11069C = list;
        c0616h.f11070D = list;
        c0616h.f11071E = list;
        c0616h.f11072F = list;
        c0616h.f11073G = list;
        c0616h.f11074H = list;
        c0616h.f11075I = list;
        c0616h.f11076J = list;
        c0616h.f11077K = list;
        c0616h.f11079M = Q.f10869L;
        c0616h.f11081O = list;
        c0616h.P = list;
        c0616h.f11082Q = list;
        c0616h.f11083R = X.f10939y;
        c0616h.f11084S = list;
        c0616h.f11085T = e0.f11047w;
        return c0616h;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        C0618j c0618jH = h();
        if (c0618jH.isInitialized()) {
            return c0618jH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0616h c0616hI = i();
        c0616hI.j(h());
        return c0616hI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        C0618j c0618j = null;
        try {
            try {
                C0618j.c0.getClass();
                j(new C0618j(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                C0618j c0618j2 = (C0618j) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    c0618j = c0618j2;
                    if (c0618j != null) {
                        j(c0618j);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0618j != null) {
                j(c0618j);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        j((C0618j) nVar);
        return this;
    }

    public final C0618j h() {
        C0618j c0618j = new C0618j(this);
        int i10 = this.f11086v;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        c0618j.f11127v = this.f11087w;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c0618j.f11128w = this.f11088x;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c0618j.f11129x = this.f11089y;
        if ((i10 & 8) == 8) {
            this.f11090z = Collections.unmodifiableList(this.f11090z);
            this.f11086v &= -9;
        }
        c0618j.f11130y = this.f11090z;
        if ((this.f11086v & 16) == 16) {
            this.f11067A = Collections.unmodifiableList(this.f11067A);
            this.f11086v &= -17;
        }
        c0618j.f11131z = this.f11067A;
        if ((this.f11086v & 32) == 32) {
            this.f11068B = Collections.unmodifiableList(this.f11068B);
            this.f11086v &= -33;
        }
        c0618j.f11099A = this.f11068B;
        if ((this.f11086v & 64) == 64) {
            this.f11069C = Collections.unmodifiableList(this.f11069C);
            this.f11086v &= -65;
        }
        c0618j.f11101C = this.f11069C;
        if ((this.f11086v & 128) == 128) {
            this.f11070D = Collections.unmodifiableList(this.f11070D);
            this.f11086v &= -129;
        }
        c0618j.f11103E = this.f11070D;
        if ((this.f11086v & 256) == 256) {
            this.f11071E = Collections.unmodifiableList(this.f11071E);
            this.f11086v &= -257;
        }
        c0618j.f11104F = this.f11071E;
        if ((this.f11086v & 512) == 512) {
            this.f11072F = Collections.unmodifiableList(this.f11072F);
            this.f11086v &= -513;
        }
        c0618j.f11106H = this.f11072F;
        if ((this.f11086v & 1024) == 1024) {
            this.f11073G = Collections.unmodifiableList(this.f11073G);
            this.f11086v &= -1025;
        }
        c0618j.f11107I = this.f11073G;
        if ((this.f11086v & 2048) == 2048) {
            this.f11074H = Collections.unmodifiableList(this.f11074H);
            this.f11086v &= -2049;
        }
        c0618j.f11108J = this.f11074H;
        if ((this.f11086v & 4096) == 4096) {
            this.f11075I = Collections.unmodifiableList(this.f11075I);
            this.f11086v &= -4097;
        }
        c0618j.f11109K = this.f11075I;
        if ((this.f11086v & 8192) == 8192) {
            this.f11076J = Collections.unmodifiableList(this.f11076J);
            this.f11086v &= -8193;
        }
        c0618j.f11110L = this.f11076J;
        if ((this.f11086v & 16384) == 16384) {
            this.f11077K = Collections.unmodifiableList(this.f11077K);
            this.f11086v &= -16385;
        }
        c0618j.f11111M = this.f11077K;
        if ((i10 & 32768) == 32768) {
            i11 |= 8;
        }
        c0618j.f11113O = this.f11078L;
        if ((i10 & 65536) == 65536) {
            i11 |= 16;
        }
        c0618j.P = this.f11079M;
        if ((i10 & 131072) == 131072) {
            i11 |= 32;
        }
        c0618j.f11114Q = this.f11080N;
        if ((this.f11086v & 262144) == 262144) {
            this.f11081O = Collections.unmodifiableList(this.f11081O);
            this.f11086v &= -262145;
        }
        c0618j.f11115R = this.f11081O;
        if ((this.f11086v & 524288) == 524288) {
            this.P = Collections.unmodifiableList(this.P);
            this.f11086v &= -524289;
        }
        c0618j.f11117T = this.P;
        if ((this.f11086v & 1048576) == 1048576) {
            this.f11082Q = Collections.unmodifiableList(this.f11082Q);
            this.f11086v &= -1048577;
        }
        c0618j.f11118U = this.f11082Q;
        if ((i10 & 2097152) == 2097152) {
            i11 |= 64;
        }
        c0618j.f11120W = this.f11083R;
        if ((this.f11086v & 4194304) == 4194304) {
            this.f11084S = Collections.unmodifiableList(this.f11084S);
            this.f11086v &= -4194305;
        }
        c0618j.f11121X = this.f11084S;
        if ((i10 & 8388608) == 8388608) {
            i11 |= 128;
        }
        c0618j.f11122Y = this.f11085T;
        c0618j.f11126u = i11;
        return c0618j;
    }

    public final void j(C0618j c0618j) {
        e0 e0Var;
        X x8;
        Q q10;
        if (c0618j == C0618j.f11098b0) {
            return;
        }
        int i10 = c0618j.f11126u;
        if ((i10 & 1) == 1) {
            int i11 = c0618j.f11127v;
            this.f11086v = 1 | this.f11086v;
            this.f11087w = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = c0618j.f11128w;
            this.f11086v = 2 | this.f11086v;
            this.f11088x = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = c0618j.f11129x;
            this.f11086v = 4 | this.f11086v;
            this.f11089y = i13;
        }
        if (!c0618j.f11130y.isEmpty()) {
            if (this.f11090z.isEmpty()) {
                this.f11090z = c0618j.f11130y;
                this.f11086v &= -9;
            } else {
                if ((this.f11086v & 8) != 8) {
                    this.f11090z = new ArrayList(this.f11090z);
                    this.f11086v |= 8;
                }
                this.f11090z.addAll(c0618j.f11130y);
            }
        }
        if (!c0618j.f11131z.isEmpty()) {
            if (this.f11067A.isEmpty()) {
                this.f11067A = c0618j.f11131z;
                this.f11086v &= -17;
            } else {
                if ((this.f11086v & 16) != 16) {
                    this.f11067A = new ArrayList(this.f11067A);
                    this.f11086v |= 16;
                }
                this.f11067A.addAll(c0618j.f11131z);
            }
        }
        if (!c0618j.f11099A.isEmpty()) {
            if (this.f11068B.isEmpty()) {
                this.f11068B = c0618j.f11099A;
                this.f11086v &= -33;
            } else {
                if ((this.f11086v & 32) != 32) {
                    this.f11068B = new ArrayList(this.f11068B);
                    this.f11086v |= 32;
                }
                this.f11068B.addAll(c0618j.f11099A);
            }
        }
        if (!c0618j.f11101C.isEmpty()) {
            if (this.f11069C.isEmpty()) {
                this.f11069C = c0618j.f11101C;
                this.f11086v &= -65;
            } else {
                if ((this.f11086v & 64) != 64) {
                    this.f11069C = new ArrayList(this.f11069C);
                    this.f11086v |= 64;
                }
                this.f11069C.addAll(c0618j.f11101C);
            }
        }
        if (!c0618j.f11103E.isEmpty()) {
            if (this.f11070D.isEmpty()) {
                this.f11070D = c0618j.f11103E;
                this.f11086v &= -129;
            } else {
                if ((this.f11086v & 128) != 128) {
                    this.f11070D = new ArrayList(this.f11070D);
                    this.f11086v |= 128;
                }
                this.f11070D.addAll(c0618j.f11103E);
            }
        }
        if (!c0618j.f11104F.isEmpty()) {
            if (this.f11071E.isEmpty()) {
                this.f11071E = c0618j.f11104F;
                this.f11086v &= -257;
            } else {
                if ((this.f11086v & 256) != 256) {
                    this.f11071E = new ArrayList(this.f11071E);
                    this.f11086v |= 256;
                }
                this.f11071E.addAll(c0618j.f11104F);
            }
        }
        if (!c0618j.f11106H.isEmpty()) {
            if (this.f11072F.isEmpty()) {
                this.f11072F = c0618j.f11106H;
                this.f11086v &= -513;
            } else {
                if ((this.f11086v & 512) != 512) {
                    this.f11072F = new ArrayList(this.f11072F);
                    this.f11086v |= 512;
                }
                this.f11072F.addAll(c0618j.f11106H);
            }
        }
        if (!c0618j.f11107I.isEmpty()) {
            if (this.f11073G.isEmpty()) {
                this.f11073G = c0618j.f11107I;
                this.f11086v &= -1025;
            } else {
                if ((this.f11086v & 1024) != 1024) {
                    this.f11073G = new ArrayList(this.f11073G);
                    this.f11086v |= 1024;
                }
                this.f11073G.addAll(c0618j.f11107I);
            }
        }
        if (!c0618j.f11108J.isEmpty()) {
            if (this.f11074H.isEmpty()) {
                this.f11074H = c0618j.f11108J;
                this.f11086v &= -2049;
            } else {
                if ((this.f11086v & 2048) != 2048) {
                    this.f11074H = new ArrayList(this.f11074H);
                    this.f11086v |= 2048;
                }
                this.f11074H.addAll(c0618j.f11108J);
            }
        }
        if (!c0618j.f11109K.isEmpty()) {
            if (this.f11075I.isEmpty()) {
                this.f11075I = c0618j.f11109K;
                this.f11086v &= -4097;
            } else {
                if ((this.f11086v & 4096) != 4096) {
                    this.f11075I = new ArrayList(this.f11075I);
                    this.f11086v |= 4096;
                }
                this.f11075I.addAll(c0618j.f11109K);
            }
        }
        if (!c0618j.f11110L.isEmpty()) {
            if (this.f11076J.isEmpty()) {
                this.f11076J = c0618j.f11110L;
                this.f11086v &= -8193;
            } else {
                if ((this.f11086v & 8192) != 8192) {
                    this.f11076J = new ArrayList(this.f11076J);
                    this.f11086v |= 8192;
                }
                this.f11076J.addAll(c0618j.f11110L);
            }
        }
        if (!c0618j.f11111M.isEmpty()) {
            if (this.f11077K.isEmpty()) {
                this.f11077K = c0618j.f11111M;
                this.f11086v &= -16385;
            } else {
                if ((this.f11086v & 16384) != 16384) {
                    this.f11077K = new ArrayList(this.f11077K);
                    this.f11086v |= 16384;
                }
                this.f11077K.addAll(c0618j.f11111M);
            }
        }
        int i14 = c0618j.f11126u;
        if ((i14 & 8) == 8) {
            int i15 = c0618j.f11113O;
            this.f11086v |= 32768;
            this.f11078L = i15;
        }
        if ((i14 & 16) == 16) {
            Q q11 = c0618j.P;
            if ((this.f11086v & 65536) != 65536 || (q10 = this.f11079M) == Q.f10869L) {
                this.f11079M = q11;
            } else {
                P pQ = Q.q(q10);
                pQ.j(q11);
                this.f11079M = pQ.h();
            }
            this.f11086v |= 65536;
        }
        if ((c0618j.f11126u & 32) == 32) {
            int i16 = c0618j.f11114Q;
            this.f11086v |= 131072;
            this.f11080N = i16;
        }
        if (!c0618j.f11115R.isEmpty()) {
            if (this.f11081O.isEmpty()) {
                this.f11081O = c0618j.f11115R;
                this.f11086v &= -262145;
            } else {
                if ((this.f11086v & 262144) != 262144) {
                    this.f11081O = new ArrayList(this.f11081O);
                    this.f11086v |= 262144;
                }
                this.f11081O.addAll(c0618j.f11115R);
            }
        }
        if (!c0618j.f11117T.isEmpty()) {
            if (this.P.isEmpty()) {
                this.P = c0618j.f11117T;
                this.f11086v &= -524289;
            } else {
                if ((this.f11086v & 524288) != 524288) {
                    this.P = new ArrayList(this.P);
                    this.f11086v |= 524288;
                }
                this.P.addAll(c0618j.f11117T);
            }
        }
        if (!c0618j.f11118U.isEmpty()) {
            if (this.f11082Q.isEmpty()) {
                this.f11082Q = c0618j.f11118U;
                this.f11086v &= -1048577;
            } else {
                if ((this.f11086v & 1048576) != 1048576) {
                    this.f11082Q = new ArrayList(this.f11082Q);
                    this.f11086v |= 1048576;
                }
                this.f11082Q.addAll(c0618j.f11118U);
            }
        }
        if ((c0618j.f11126u & 64) == 64) {
            X x10 = c0618j.f11120W;
            if ((this.f11086v & 2097152) != 2097152 || (x8 = this.f11083R) == X.f10939y) {
                this.f11083R = x10;
            } else {
                C0614f c0614fH = X.h(x8);
                c0614fH.m(x10);
                this.f11083R = c0614fH.i();
            }
            this.f11086v |= 2097152;
        }
        if (!c0618j.f11121X.isEmpty()) {
            if (this.f11084S.isEmpty()) {
                this.f11084S = c0618j.f11121X;
                this.f11086v &= -4194305;
            } else {
                if ((this.f11086v & 4194304) != 4194304) {
                    this.f11084S = new ArrayList(this.f11084S);
                    this.f11086v |= 4194304;
                }
                this.f11084S.addAll(c0618j.f11121X);
            }
        }
        if ((c0618j.f11126u & 128) == 128) {
            e0 e0Var2 = c0618j.f11122Y;
            if ((this.f11086v & 8388608) != 8388608 || (e0Var = this.f11085T) == e0.f11047w) {
                this.f11085T = e0Var2;
            } else {
                C0621m c0621m = new C0621m(2);
                c0621m.f11147v = Collections.EMPTY_LIST;
                c0621m.p(e0Var);
                c0621m.p(e0Var2);
                this.f11085T = c0621m.j();
            }
            this.f11086v |= 8388608;
        }
        f(c0618j);
        this.f12808s = this.f12808s.e(c0618j.f11125t);
    }
}
