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
public final class P extends AbstractC0681j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10854A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10855B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10856C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10857D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f10858E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Q f10859F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f10860G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Q f10861H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f10862I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f10863J;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10864v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f10865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10867y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Q f10868z;

    public static P i() {
        P p10 = new P();
        p10.f10865w = Collections.EMPTY_LIST;
        Q q10 = Q.f10869L;
        p10.f10868z = q10;
        p10.f10859F = q10;
        p10.f10861H = q10;
        return p10;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        Q qH = h();
        if (qH.isInitialized()) {
            return qH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        P pI = i();
        pI.j(h());
        return pI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        Q q10 = null;
        try {
            try {
                Q.f10870M.getClass();
                j(new Q(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                Q q11 = (Q) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    q10 = q11;
                    if (q10 != null) {
                        j(q10);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (q10 != null) {
                j(q10);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        j((Q) nVar);
        return this;
    }

    public final Q h() {
        Q q10 = new Q(this);
        int i10 = this.f10864v;
        if ((i10 & 1) == 1) {
            this.f10865w = Collections.unmodifiableList(this.f10865w);
            this.f10864v &= -2;
        }
        q10.f10884v = this.f10865w;
        int i11 = (i10 & 2) != 2 ? 0 : 1;
        q10.f10885w = this.f10866x;
        if ((i10 & 4) == 4) {
            i11 |= 2;
        }
        q10.f10886x = this.f10867y;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        q10.f10887y = this.f10868z;
        if ((i10 & 16) == 16) {
            i11 |= 8;
        }
        q10.f10888z = this.f10854A;
        if ((i10 & 32) == 32) {
            i11 |= 16;
        }
        q10.f10871A = this.f10855B;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        q10.f10872B = this.f10856C;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        q10.f10873C = this.f10857D;
        if ((i10 & 256) == 256) {
            i11 |= 128;
        }
        q10.f10874D = this.f10858E;
        if ((i10 & 512) == 512) {
            i11 |= 256;
        }
        q10.f10875E = this.f10859F;
        if ((i10 & 1024) == 1024) {
            i11 |= 512;
        }
        q10.f10876F = this.f10860G;
        if ((i10 & 2048) == 2048) {
            i11 |= 1024;
        }
        q10.f10877G = this.f10861H;
        if ((i10 & 4096) == 4096) {
            i11 |= 2048;
        }
        q10.f10878H = this.f10862I;
        if ((i10 & 8192) == 8192) {
            i11 |= 4096;
        }
        q10.f10879I = this.f10863J;
        q10.f10883u = i11;
        return q10;
    }

    public final P j(Q q10) {
        Q q11;
        Q q12;
        Q q13;
        Q q14 = Q.f10869L;
        if (q10 == q14) {
            return this;
        }
        if (!q10.f10884v.isEmpty()) {
            if (this.f10865w.isEmpty()) {
                this.f10865w = q10.f10884v;
                this.f10864v &= -2;
            } else {
                if ((this.f10864v & 1) != 1) {
                    this.f10865w = new ArrayList(this.f10865w);
                    this.f10864v |= 1;
                }
                this.f10865w.addAll(q10.f10884v);
            }
        }
        int i10 = q10.f10883u;
        if ((i10 & 1) == 1) {
            boolean z6 = q10.f10885w;
            this.f10864v |= 2;
            this.f10866x = z6;
        }
        if ((i10 & 2) == 2) {
            int i11 = q10.f10886x;
            this.f10864v |= 4;
            this.f10867y = i11;
        }
        if ((i10 & 4) == 4) {
            Q q15 = q10.f10887y;
            if ((this.f10864v & 8) != 8 || (q13 = this.f10868z) == q14) {
                this.f10868z = q15;
            } else {
                P pQ = Q.q(q13);
                pQ.j(q15);
                this.f10868z = pQ.h();
            }
            this.f10864v |= 8;
        }
        if ((q10.f10883u & 8) == 8) {
            int i12 = q10.f10888z;
            this.f10864v |= 16;
            this.f10854A = i12;
        }
        if (q10.o()) {
            int i13 = q10.f10871A;
            this.f10864v |= 32;
            this.f10855B = i13;
        }
        int i14 = q10.f10883u;
        if ((i14 & 32) == 32) {
            int i15 = q10.f10872B;
            this.f10864v |= 64;
            this.f10856C = i15;
        }
        if ((i14 & 64) == 64) {
            int i16 = q10.f10873C;
            this.f10864v |= 128;
            this.f10857D = i16;
        }
        if ((i14 & 128) == 128) {
            int i17 = q10.f10874D;
            this.f10864v |= 256;
            this.f10858E = i17;
        }
        if ((i14 & 256) == 256) {
            Q q16 = q10.f10875E;
            if ((this.f10864v & 512) != 512 || (q12 = this.f10859F) == q14) {
                this.f10859F = q16;
            } else {
                P pQ2 = Q.q(q12);
                pQ2.j(q16);
                this.f10859F = pQ2.h();
            }
            this.f10864v |= 512;
        }
        int i18 = q10.f10883u;
        if ((i18 & 512) == 512) {
            int i19 = q10.f10876F;
            this.f10864v |= 1024;
            this.f10860G = i19;
        }
        if ((i18 & 1024) == 1024) {
            Q q17 = q10.f10877G;
            if ((this.f10864v & 2048) != 2048 || (q11 = this.f10861H) == q14) {
                this.f10861H = q17;
            } else {
                P pQ3 = Q.q(q11);
                pQ3.j(q17);
                this.f10861H = pQ3.h();
            }
            this.f10864v |= 2048;
        }
        int i20 = q10.f10883u;
        if ((i20 & 2048) == 2048) {
            int i21 = q10.f10878H;
            this.f10864v |= 4096;
            this.f10862I = i21;
        }
        if ((i20 & 4096) == 4096) {
            int i22 = q10.f10879I;
            this.f10864v |= 8192;
            this.f10863J = i22;
        }
        f(q10);
        this.f12808s = this.f12808s.e(q10.f10882t);
        return this;
    }
}
