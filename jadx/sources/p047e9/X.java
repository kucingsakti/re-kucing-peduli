package p047e9;

import B4.C0154b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0675d;
import p104k9.AbstractC0680i;
import p104k9.C0674c;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;

/* JADX INFO: loaded from: classes.dex */
public final class X extends n {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final X f10939y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0609a f10940z = new C0609a(20);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f10941s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10942t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f10943u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10944v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f10945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10946x;

    static {
        X x8 = new X();
        f10939y = x8;
        x8.f10943u = Collections.EMPTY_LIST;
        x8.f10944v = -1;
    }

    public X() {
        this.f10945w = (byte) -1;
        this.f10946x = -1;
        this.f10941s = AbstractC0675d.f12795s;
    }

    public static C0614f h(X x8) {
        C0614f c0614fJ = C0614f.j();
        c0614fJ.m(x8);
        return c0614fJ;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10946x;
        if (i10 != -1) {
            return i10;
        }
        int iB = 0;
        for (int i11 = 0; i11 < this.f10943u.size(); i11++) {
            iB += C0154b.d(1, (AbstractC0672a) this.f10943u.get(i11));
        }
        if ((this.f10942t & 1) == 1) {
            iB += C0154b.b(2, this.f10944v);
        }
        int size = this.f10941s.size() + iB;
        this.f10946x = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return C0614f.j();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        return h(this);
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        for (int i10 = 0; i10 < this.f10943u.size(); i10++) {
            c0154b.o(1, (AbstractC0672a) this.f10943u.get(i10));
        }
        if ((this.f10942t & 1) == 1) {
            c0154b.m(2, this.f10944v);
        }
        c0154b.r(this.f10941s);
    }

    public final C0614f i() {
        return h(this);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f10945w;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f10943u.size(); i10++) {
            if (!((Q) this.f10943u.get(i10)).isInitialized()) {
                this.f10945w = (byte) 0;
                return false;
            }
        }
        this.f10945w = (byte) 1;
        return true;
    }

    public X(C0614f c0614f) {
        this.f10945w = (byte) -1;
        this.f10946x = -1;
        this.f10941s = c0614f.f12808s;
    }

    public X(C0676e c0676e, C0678g c0678g) {
        this.f10945w = (byte) -1;
        this.f10946x = -1;
        this.f10943u = Collections.EMPTY_LIST;
        this.f10944v = -1;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        boolean z10 = false;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if (!z10) {
                                this.f10943u = new ArrayList();
                                z10 = true;
                            }
                            this.f10943u.add(c0676e.g(Q.f10870M, c0678g));
                        } else if (iN != 16) {
                            if (!c0676e.q(iN, c0154bJ)) {
                            }
                        } else {
                            this.f10942t |= 1;
                            this.f10944v = c0676e.k();
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if (z10) {
                        this.f10943u = Collections.unmodifiableList(this.f10943u);
                    }
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f10941s = c0674c.c();
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
            this.f10943u = Collections.unmodifiableList(this.f10943u);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10941s = c0674c.c();
        }
    }
}
