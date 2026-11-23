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

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0681j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10769A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f10770B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Q f10771C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10772D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f10773E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public List f10774F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Z f10775G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f10776H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f10777I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public List f10778J;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10781x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10782y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Q f10783z;

    public static F i() {
        F f10 = new F();
        f10.f10780w = 518;
        f10.f10781x = 2054;
        Q q10 = Q.f10869L;
        f10.f10783z = q10;
        List list = Collections.EMPTY_LIST;
        f10.f10770B = list;
        f10.f10771C = q10;
        f10.f10773E = list;
        f10.f10774F = list;
        f10.f10775G = Z.f10954D;
        f10.f10778J = list;
        return f10;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        G gH = h();
        if (gH.isInitialized()) {
            return gH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        F fI = i();
        fI.j(h());
        return fI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        G g8 = null;
        try {
            try {
                G.f10785N.getClass();
                j(new G(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                G g10 = (G) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    g8 = g10;
                    if (g8 != null) {
                        j(g8);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (g8 != null) {
                j(g8);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        j((G) nVar);
        return this;
    }

    public final G h() {
        G g8 = new G(this);
        int i10 = this.f10779v;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        g8.f10800v = this.f10780w;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        g8.f10801w = this.f10781x;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        g8.f10802x = this.f10782y;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        g8.f10803y = this.f10783z;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        g8.f10804z = this.f10769A;
        if ((i10 & 32) == 32) {
            this.f10770B = Collections.unmodifiableList(this.f10770B);
            this.f10779v &= -33;
        }
        g8.f10786A = this.f10770B;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        g8.f10787B = this.f10771C;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        g8.f10788C = this.f10772D;
        if ((this.f10779v & 256) == 256) {
            this.f10773E = Collections.unmodifiableList(this.f10773E);
            this.f10779v &= -257;
        }
        g8.f10789D = this.f10773E;
        if ((this.f10779v & 512) == 512) {
            this.f10774F = Collections.unmodifiableList(this.f10774F);
            this.f10779v &= -513;
        }
        g8.f10790E = this.f10774F;
        if ((i10 & 1024) == 1024) {
            i11 |= 128;
        }
        g8.f10792G = this.f10775G;
        if ((i10 & 2048) == 2048) {
            i11 |= 256;
        }
        g8.f10793H = this.f10776H;
        if ((i10 & 4096) == 4096) {
            i11 |= 512;
        }
        g8.f10794I = this.f10777I;
        if ((this.f10779v & 8192) == 8192) {
            this.f10778J = Collections.unmodifiableList(this.f10778J);
            this.f10779v &= -8193;
        }
        g8.f10795J = this.f10778J;
        g8.f10799u = i11;
        return g8;
    }

    public final void j(G g8) {
        Z z6;
        Q q10;
        Q q11;
        if (g8 == G.f10784M) {
            return;
        }
        int i10 = g8.f10799u;
        if ((i10 & 1) == 1) {
            int i11 = g8.f10800v;
            this.f10779v = 1 | this.f10779v;
            this.f10780w = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = g8.f10801w;
            this.f10779v = 2 | this.f10779v;
            this.f10781x = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = g8.f10802x;
            this.f10779v = 4 | this.f10779v;
            this.f10782y = i13;
        }
        if ((i10 & 8) == 8) {
            Q q12 = g8.f10803y;
            if ((this.f10779v & 8) != 8 || (q11 = this.f10783z) == Q.f10869L) {
                this.f10783z = q12;
            } else {
                P pQ = Q.q(q11);
                pQ.j(q12);
                this.f10783z = pQ.h();
            }
            this.f10779v |= 8;
        }
        if ((g8.f10799u & 16) == 16) {
            int i14 = g8.f10804z;
            this.f10779v = 16 | this.f10779v;
            this.f10769A = i14;
        }
        if (!g8.f10786A.isEmpty()) {
            if (this.f10770B.isEmpty()) {
                this.f10770B = g8.f10786A;
                this.f10779v &= -33;
            } else {
                if ((this.f10779v & 32) != 32) {
                    this.f10770B = new ArrayList(this.f10770B);
                    this.f10779v |= 32;
                }
                this.f10770B.addAll(g8.f10786A);
            }
        }
        if ((g8.f10799u & 32) == 32) {
            Q q13 = g8.f10787B;
            if ((this.f10779v & 64) != 64 || (q10 = this.f10771C) == Q.f10869L) {
                this.f10771C = q13;
            } else {
                P pQ2 = Q.q(q10);
                pQ2.j(q13);
                this.f10771C = pQ2.h();
            }
            this.f10779v |= 64;
        }
        if ((g8.f10799u & 64) == 64) {
            int i15 = g8.f10788C;
            this.f10779v |= 128;
            this.f10772D = i15;
        }
        if (!g8.f10789D.isEmpty()) {
            if (this.f10773E.isEmpty()) {
                this.f10773E = g8.f10789D;
                this.f10779v &= -257;
            } else {
                if ((this.f10779v & 256) != 256) {
                    this.f10773E = new ArrayList(this.f10773E);
                    this.f10779v |= 256;
                }
                this.f10773E.addAll(g8.f10789D);
            }
        }
        if (!g8.f10790E.isEmpty()) {
            if (this.f10774F.isEmpty()) {
                this.f10774F = g8.f10790E;
                this.f10779v &= -513;
            } else {
                if ((this.f10779v & 512) != 512) {
                    this.f10774F = new ArrayList(this.f10774F);
                    this.f10779v |= 512;
                }
                this.f10774F.addAll(g8.f10790E);
            }
        }
        if ((g8.f10799u & 128) == 128) {
            Z z10 = g8.f10792G;
            if ((this.f10779v & 1024) != 1024 || (z6 = this.f10775G) == Z.f10954D) {
                this.f10775G = z10;
            } else {
                Y y6 = new Y();
                Q q14 = Q.f10869L;
                y6.f10952y = q14;
                y6.f10947A = q14;
                y6.i(z6);
                y6.i(z10);
                this.f10775G = y6.h();
            }
            this.f10779v |= 1024;
        }
        int i16 = g8.f10799u;
        if ((i16 & 256) == 256) {
            int i17 = g8.f10793H;
            this.f10779v |= 2048;
            this.f10776H = i17;
        }
        if ((i16 & 512) == 512) {
            int i18 = g8.f10794I;
            this.f10779v |= 4096;
            this.f10777I = i18;
        }
        if (!g8.f10795J.isEmpty()) {
            if (this.f10778J.isEmpty()) {
                this.f10778J = g8.f10795J;
                this.f10779v &= -8193;
            } else {
                if ((this.f10779v & 8192) != 8192) {
                    this.f10778J = new ArrayList(this.f10778J);
                    this.f10779v |= 8192;
                }
                this.f10778J.addAll(g8.f10795J);
            }
        }
        f(g8);
        this.f12808s = this.f12808s.e(g8.f10798t);
    }
}
