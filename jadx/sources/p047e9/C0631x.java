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

/* JADX INFO: renamed from: e9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0631x extends AbstractC0681j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11214A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f11215B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Q f11216C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11217D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f11218E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public List f11219F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public List f11220G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public X f11221H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public List f11222I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C0622n f11223J;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11227y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Q f11228z;

    public static C0631x i() {
        C0631x c0631x = new C0631x();
        c0631x.f11225w = 6;
        c0631x.f11226x = 6;
        Q q10 = Q.f10869L;
        c0631x.f11228z = q10;
        List list = Collections.EMPTY_LIST;
        c0631x.f11215B = list;
        c0631x.f11216C = q10;
        c0631x.f11218E = list;
        c0631x.f11219F = list;
        c0631x.f11220G = list;
        c0631x.f11221H = X.f10939y;
        c0631x.f11222I = list;
        c0631x.f11223J = C0622n.f11148w;
        return c0631x;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        C0632y c0632yH = h();
        if (c0632yH.isInitialized()) {
            return c0632yH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0631x c0631xI = i();
        c0631xI.j(h());
        return c0631xI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        C0632y c0632y = null;
        try {
            try {
                C0632y.f11230N.getClass();
                j(new C0632y(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                C0632y c0632y2 = (C0632y) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    c0632y = c0632y2;
                    if (c0632y != null) {
                        j(c0632y);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0632y != null) {
                j(c0632y);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        j((C0632y) nVar);
        return this;
    }

    public final C0632y h() {
        C0632y c0632y = new C0632y(this);
        int i10 = this.f11224v;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        c0632y.f11245v = this.f11225w;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c0632y.f11246w = this.f11226x;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c0632y.f11247x = this.f11227y;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        c0632y.f11248y = this.f11228z;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        c0632y.f11249z = this.f11214A;
        if ((i10 & 32) == 32) {
            this.f11215B = Collections.unmodifiableList(this.f11215B);
            this.f11224v &= -33;
        }
        c0632y.f11231A = this.f11215B;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        c0632y.f11232B = this.f11216C;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        c0632y.f11233C = this.f11217D;
        if ((this.f11224v & 256) == 256) {
            this.f11218E = Collections.unmodifiableList(this.f11218E);
            this.f11224v &= -257;
        }
        c0632y.f11234D = this.f11218E;
        if ((this.f11224v & 512) == 512) {
            this.f11219F = Collections.unmodifiableList(this.f11219F);
            this.f11224v &= -513;
        }
        c0632y.f11235E = this.f11219F;
        if ((this.f11224v & 1024) == 1024) {
            this.f11220G = Collections.unmodifiableList(this.f11220G);
            this.f11224v &= -1025;
        }
        c0632y.f11237G = this.f11220G;
        if ((i10 & 2048) == 2048) {
            i11 |= 128;
        }
        c0632y.f11238H = this.f11221H;
        if ((this.f11224v & 4096) == 4096) {
            this.f11222I = Collections.unmodifiableList(this.f11222I);
            this.f11224v &= -4097;
        }
        c0632y.f11239I = this.f11222I;
        if ((i10 & 8192) == 8192) {
            i11 |= 256;
        }
        c0632y.f11240J = this.f11223J;
        c0632y.f11244u = i11;
        return c0632y;
    }

    public final void j(C0632y c0632y) {
        C0622n c0622n;
        X x8;
        Q q10;
        Q q11;
        if (c0632y == C0632y.f11229M) {
            return;
        }
        int i10 = c0632y.f11244u;
        if ((i10 & 1) == 1) {
            int i11 = c0632y.f11245v;
            this.f11224v = 1 | this.f11224v;
            this.f11225w = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = c0632y.f11246w;
            this.f11224v = 2 | this.f11224v;
            this.f11226x = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = c0632y.f11247x;
            this.f11224v = 4 | this.f11224v;
            this.f11227y = i13;
        }
        if ((i10 & 8) == 8) {
            Q q12 = c0632y.f11248y;
            if ((this.f11224v & 8) != 8 || (q11 = this.f11228z) == Q.f10869L) {
                this.f11228z = q12;
            } else {
                P pQ = Q.q(q11);
                pQ.j(q12);
                this.f11228z = pQ.h();
            }
            this.f11224v |= 8;
        }
        if ((c0632y.f11244u & 16) == 16) {
            int i14 = c0632y.f11249z;
            this.f11224v = 16 | this.f11224v;
            this.f11214A = i14;
        }
        if (!c0632y.f11231A.isEmpty()) {
            if (this.f11215B.isEmpty()) {
                this.f11215B = c0632y.f11231A;
                this.f11224v &= -33;
            } else {
                if ((this.f11224v & 32) != 32) {
                    this.f11215B = new ArrayList(this.f11215B);
                    this.f11224v |= 32;
                }
                this.f11215B.addAll(c0632y.f11231A);
            }
        }
        if ((c0632y.f11244u & 32) == 32) {
            Q q13 = c0632y.f11232B;
            if ((this.f11224v & 64) != 64 || (q10 = this.f11216C) == Q.f10869L) {
                this.f11216C = q13;
            } else {
                P pQ2 = Q.q(q10);
                pQ2.j(q13);
                this.f11216C = pQ2.h();
            }
            this.f11224v |= 64;
        }
        if ((c0632y.f11244u & 64) == 64) {
            int i15 = c0632y.f11233C;
            this.f11224v |= 128;
            this.f11217D = i15;
        }
        if (!c0632y.f11234D.isEmpty()) {
            if (this.f11218E.isEmpty()) {
                this.f11218E = c0632y.f11234D;
                this.f11224v &= -257;
            } else {
                if ((this.f11224v & 256) != 256) {
                    this.f11218E = new ArrayList(this.f11218E);
                    this.f11224v |= 256;
                }
                this.f11218E.addAll(c0632y.f11234D);
            }
        }
        if (!c0632y.f11235E.isEmpty()) {
            if (this.f11219F.isEmpty()) {
                this.f11219F = c0632y.f11235E;
                this.f11224v &= -513;
            } else {
                if ((this.f11224v & 512) != 512) {
                    this.f11219F = new ArrayList(this.f11219F);
                    this.f11224v |= 512;
                }
                this.f11219F.addAll(c0632y.f11235E);
            }
        }
        if (!c0632y.f11237G.isEmpty()) {
            if (this.f11220G.isEmpty()) {
                this.f11220G = c0632y.f11237G;
                this.f11224v &= -1025;
            } else {
                if ((this.f11224v & 1024) != 1024) {
                    this.f11220G = new ArrayList(this.f11220G);
                    this.f11224v |= 1024;
                }
                this.f11220G.addAll(c0632y.f11237G);
            }
        }
        if ((c0632y.f11244u & 128) == 128) {
            X x10 = c0632y.f11238H;
            if ((this.f11224v & 2048) != 2048 || (x8 = this.f11221H) == X.f10939y) {
                this.f11221H = x10;
            } else {
                C0614f c0614fH = X.h(x8);
                c0614fH.m(x10);
                this.f11221H = c0614fH.i();
            }
            this.f11224v |= 2048;
        }
        if (!c0632y.f11239I.isEmpty()) {
            if (this.f11222I.isEmpty()) {
                this.f11222I = c0632y.f11239I;
                this.f11224v &= -4097;
            } else {
                if ((this.f11224v & 4096) != 4096) {
                    this.f11222I = new ArrayList(this.f11222I);
                    this.f11224v |= 4096;
                }
                this.f11222I.addAll(c0632y.f11239I);
            }
        }
        if ((c0632y.f11244u & 256) == 256) {
            C0622n c0622n2 = c0632y.f11240J;
            if ((this.f11224v & 8192) != 8192 || (c0622n = this.f11223J) == C0622n.f11148w) {
                this.f11223J = c0622n2;
            } else {
                C0621m c0621m = new C0621m(0);
                c0621m.f11147v = Collections.EMPTY_LIST;
                c0621m.k(c0622n);
                c0621m.k(c0622n2);
                this.f11223J = c0621m.f();
            }
            this.f11224v |= 8192;
        }
        f(c0632y);
        this.f12808s = this.f12808s.e(c0632y.f11243t);
    }
}
