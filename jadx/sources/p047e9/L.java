package p047e9;

import B4.C0154b;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.n;
import p104k9.q;
import p104k9.r;
import p104k9.s;

/* JADX INFO: loaded from: classes.dex */
public final class L extends n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final L f10829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0609a f10830x = new C0609a(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f10831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r f10832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f10833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10834v;

    static {
        L l4 = new L();
        f10829w = l4;
        l4.f10832t = q.f12819t;
    }

    public L() {
        this.f10833u = (byte) -1;
        this.f10834v = -1;
        this.f10831s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10834v;
        if (i10 != -1) {
            return i10;
        }
        int size = 0;
        for (int i11 = 0; i11 < this.f10832t.size(); i11++) {
            AbstractC0675d abstractC0675dA = this.f10832t.A(i11);
            size += abstractC0675dA.size() + C0154b.f(abstractC0675dA.size());
        }
        int size2 = this.f10831s.size() + this.f10832t.size() + size;
        this.f10834v = size2;
        return size2;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        C0621m c0621m = new C0621m(3);
        c0621m.f11147v = q.f12819t;
        return c0621m;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        C0621m c0621m = new C0621m(3);
        c0621m.f11147v = q.f12819t;
        c0621m.m(this);
        return c0621m;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        for (int i10 = 0; i10 < this.f10832t.size(); i10++) {
            AbstractC0675d abstractC0675dA = this.f10832t.A(i10);
            c0154b.x(1, 2);
            c0154b.v(abstractC0675dA.size());
            c0154b.r(abstractC0675dA);
        }
        c0154b.r(this.f10831s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        if (this.f10833u == 1) {
            return true;
        }
        this.f10833u = (byte) 1;
        return true;
    }

    public L(C0621m c0621m) {
        this.f10833u = (byte) -1;
        this.f10834v = -1;
        this.f10831s = c0621m.f12808s;
    }

    public L(C0676e c0676e) {
        this.f10833u = (byte) -1;
        this.f10834v = -1;
        this.f10832t = q.f12819t;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        boolean z10 = false;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN != 10) {
                            if (!c0676e.q(iN, c0154bJ)) {
                            }
                        } else {
                            s sVarE = c0676e.e();
                            if (!z10) {
                                this.f10832t = new q();
                                z10 = true;
                            }
                            this.f10832t.p(sVarE);
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if (z10) {
                        this.f10832t = this.f10832t.i();
                    }
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f10831s = c0674c.c();
                    }
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
        if (z10) {
            this.f10832t = this.f10832t.i();
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10831s = c0674c.c();
        }
    }
}
