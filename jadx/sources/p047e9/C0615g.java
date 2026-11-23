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

/* JADX INFO: renamed from: e9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0615g extends n {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0615g f11059y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0609a f11060z = new C0609a(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f11061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f11064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f11065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11066x;

    static {
        C0615g c0615g = new C0615g();
        f11059y = c0615g;
        c0615g.f11063u = 0;
        c0615g.f11064v = Collections.EMPTY_LIST;
    }

    public C0615g() {
        this.f11065w = (byte) -1;
        this.f11066x = -1;
        this.f11061s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11066x;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f11062t & 1) == 1 ? C0154b.b(1, this.f11063u) : 0;
        for (int i11 = 0; i11 < this.f11064v.size(); i11++) {
            iB += C0154b.d(2, (AbstractC0672a) this.f11064v.get(i11));
        }
        int size = this.f11061s.size() + iB;
        this.f11066x = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        C0614f c0614f = new C0614f(0);
        c0614f.f11055v = Collections.EMPTY_LIST;
        return c0614f;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        C0614f c0614f = new C0614f(0);
        c0614f.f11055v = Collections.EMPTY_LIST;
        c0614f.l(this);
        return c0614f;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        if ((this.f11062t & 1) == 1) {
            c0154b.m(1, this.f11063u);
        }
        for (int i10 = 0; i10 < this.f11064v.size(); i10++) {
            c0154b.o(2, (AbstractC0672a) this.f11064v.get(i10));
        }
        c0154b.r(this.f11061s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f11065w;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if ((this.f11062t & 1) != 1) {
            this.f11065w = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f11064v.size(); i10++) {
            if (!((C0613e) this.f11064v.get(i10)).isInitialized()) {
                this.f11065w = (byte) 0;
                return false;
            }
        }
        this.f11065w = (byte) 1;
        return true;
    }

    public C0615g(C0614f c0614f) {
        this.f11065w = (byte) -1;
        this.f11066x = -1;
        this.f11061s = c0614f.f12808s;
    }

    public C0615g(C0676e c0676e, C0678g c0678g) {
        this.f11065w = (byte) -1;
        this.f11066x = -1;
        boolean z6 = false;
        this.f11063u = 0;
        this.f11064v = Collections.EMPTY_LIST;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        char c10 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c0676e.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f11062t |= 1;
                                this.f11063u = c0676e.k();
                            } else if (iN != 18) {
                                if (!c0676e.q(iN, c0154bJ)) {
                                }
                            } else {
                                if ((c10 & 2) != 2) {
                                    this.f11064v = new ArrayList();
                                    c10 = 2;
                                }
                                this.f11064v.add(c0676e.g(C0613e.f11040z, c0678g));
                            }
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f12841s = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f12841s = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if ((c10 & 2) == 2) {
                    this.f11064v = Collections.unmodifiableList(this.f11064v);
                }
                try {
                    c0154bJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f11061s = c0674c.c();
                }
                throw th;
            }
        }
        if ((c10 & 2) == 2) {
            this.f11064v = Collections.unmodifiableList(this.f11064v);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11061s = c0674c.c();
        }
    }
}
