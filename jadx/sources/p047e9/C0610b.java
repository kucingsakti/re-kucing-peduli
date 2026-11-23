package p047e9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0680i;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;
import p104k9.t;

/* JADX INFO: renamed from: e9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0610b extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10973A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0615g f10974B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f10975C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10976D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f10977E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EnumC0611c f10979u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f10981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f10982x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10983y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10984z;

    public static C0610b h() {
        C0610b c0610b = new C0610b();
        c0610b.f10979u = EnumC0611c.BYTE;
        c0610b.f10974B = C0615g.f11059y;
        c0610b.f10975C = Collections.EMPTY_LIST;
        return c0610b;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        C0612d c0612dF = f();
        if (c0612dF.isInitialized()) {
            return c0612dF;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0610b c0610bH = h();
        c0610bH.i(f());
        return c0610bH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        C0612d c0612d = null;
        try {
            try {
                C0612d.f11011I.getClass();
                i(new C0612d(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                C0612d c0612d2 = (C0612d) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    c0612d = c0612d2;
                    if (c0612d != null) {
                        i(c0612d);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0612d != null) {
                i(c0612d);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        i((C0612d) nVar);
        return this;
    }

    public final C0612d f() {
        C0612d c0612d = new C0612d(this);
        int i10 = this.f10978t;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        c0612d.f11021u = this.f10979u;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c0612d.f11022v = this.f10980v;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c0612d.f11023w = this.f10981w;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        c0612d.f11024x = this.f10982x;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        c0612d.f11025y = this.f10983y;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        c0612d.f11026z = this.f10984z;
        if ((i10 & 64) == 64) {
            i11 |= 64;
        }
        c0612d.f11012A = this.f10973A;
        if ((i10 & 128) == 128) {
            i11 |= 128;
        }
        c0612d.f11013B = this.f10974B;
        if ((i10 & 256) == 256) {
            this.f10975C = Collections.unmodifiableList(this.f10975C);
            this.f10978t &= -257;
        }
        c0612d.f11014C = this.f10975C;
        if ((i10 & 512) == 512) {
            i11 |= 256;
        }
        c0612d.f11015D = this.f10976D;
        if ((i10 & 1024) == 1024) {
            i11 |= 512;
        }
        c0612d.f11016E = this.f10977E;
        c0612d.f11020t = i11;
        return c0612d;
    }

    public final void i(C0612d c0612d) {
        C0615g c0615g;
        if (c0612d == C0612d.f11010H) {
            return;
        }
        if ((c0612d.f11020t & 1) == 1) {
            EnumC0611c enumC0611c = c0612d.f11021u;
            enumC0611c.getClass();
            this.f10978t = 1 | this.f10978t;
            this.f10979u = enumC0611c;
        }
        int i10 = c0612d.f11020t;
        if ((i10 & 2) == 2) {
            long j = c0612d.f11022v;
            this.f10978t |= 2;
            this.f10980v = j;
        }
        if ((i10 & 4) == 4) {
            float f10 = c0612d.f11023w;
            this.f10978t = 4 | this.f10978t;
            this.f10981w = f10;
        }
        if ((i10 & 8) == 8) {
            double d3 = c0612d.f11024x;
            this.f10978t |= 8;
            this.f10982x = d3;
        }
        if ((i10 & 16) == 16) {
            int i11 = c0612d.f11025y;
            this.f10978t = 16 | this.f10978t;
            this.f10983y = i11;
        }
        if ((i10 & 32) == 32) {
            int i12 = c0612d.f11026z;
            this.f10978t = 32 | this.f10978t;
            this.f10984z = i12;
        }
        if ((i10 & 64) == 64) {
            int i13 = c0612d.f11012A;
            this.f10978t = 64 | this.f10978t;
            this.f10973A = i13;
        }
        if ((i10 & 128) == 128) {
            C0615g c0615g2 = c0612d.f11013B;
            if ((this.f10978t & 128) != 128 || (c0615g = this.f10974B) == C0615g.f11059y) {
                this.f10974B = c0615g2;
            } else {
                C0614f c0614f = new C0614f(0);
                c0614f.f11055v = Collections.EMPTY_LIST;
                c0614f.l(c0615g);
                c0614f.l(c0615g2);
                this.f10974B = c0614f.h();
            }
            this.f10978t |= 128;
        }
        if (!c0612d.f11014C.isEmpty()) {
            if (this.f10975C.isEmpty()) {
                this.f10975C = c0612d.f11014C;
                this.f10978t &= -257;
            } else {
                if ((this.f10978t & 256) != 256) {
                    this.f10975C = new ArrayList(this.f10975C);
                    this.f10978t |= 256;
                }
                this.f10975C.addAll(c0612d.f11014C);
            }
        }
        int i14 = c0612d.f11020t;
        if ((i14 & 256) == 256) {
            int i15 = c0612d.f11015D;
            this.f10978t |= 512;
            this.f10976D = i15;
        }
        if ((i14 & 512) == 512) {
            int i16 = c0612d.f11016E;
            this.f10978t |= 1024;
            this.f10977E = i16;
        }
        this.f12808s = this.f12808s.e(c0612d.f11019s);
    }
}
