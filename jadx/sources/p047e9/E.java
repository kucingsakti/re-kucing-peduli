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
import p104k9.q;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0682k {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final E f10759B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0609a f10760C = new C0609a(11);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10761A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0675d f10762t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10763u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public L f10764v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public K f10765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C f10766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f10767y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public byte f10768z;

    static {
        E e10 = new E();
        f10759B = e10;
        e10.f10764v = L.f10829w;
        e10.f10765w = K.f10823w;
        e10.f10766x = C.f10743C;
        e10.f10767y = Collections.EMPTY_LIST;
    }

    public E(D d3) {
        super(d3);
        this.f10768z = (byte) -1;
        this.f10761A = -1;
        this.f10762t = d3.f12808s;
    }

    @Override // p104k9.t
    public final AbstractC0672a a() {
        return f10759B;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f10761A;
        if (i10 != -1) {
            return i10;
        }
        int iD = (this.f10763u & 1) == 1 ? C0154b.d(1, this.f10764v) : 0;
        if ((this.f10763u & 2) == 2) {
            iD += C0154b.d(2, this.f10765w);
        }
        if ((this.f10763u & 4) == 4) {
            iD += C0154b.d(3, this.f10766x);
        }
        for (int i11 = 0; i11 < this.f10767y.size(); i11++) {
            iD += C0154b.d(4, (AbstractC0672a) this.f10767y.get(i11));
        }
        int size = this.f10762t.size() + i() + iD;
        this.f10761A = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return D.i();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        D dI = D.i();
        dI.j(this);
        return dI;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        S s9 = new S(this);
        if ((this.f10763u & 1) == 1) {
            c0154b.o(1, this.f10764v);
        }
        if ((this.f10763u & 2) == 2) {
            c0154b.o(2, this.f10765w);
        }
        if ((this.f10763u & 4) == 4) {
            c0154b.o(3, this.f10766x);
        }
        for (int i10 = 0; i10 < this.f10767y.size(); i10++) {
            c0154b.o(4, (AbstractC0672a) this.f10767y.get(i10));
        }
        s9.y(200, c0154b);
        c0154b.r(this.f10762t);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f10768z;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if ((this.f10763u & 2) == 2 && !this.f10765w.isInitialized()) {
            this.f10768z = (byte) 0;
            return false;
        }
        if ((this.f10763u & 4) == 4 && !this.f10766x.isInitialized()) {
            this.f10768z = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f10767y.size(); i10++) {
            if (!((C0618j) this.f10767y.get(i10)).isInitialized()) {
                this.f10768z = (byte) 0;
                return false;
            }
        }
        if (h()) {
            this.f10768z = (byte) 1;
            return true;
        }
        this.f10768z = (byte) 0;
        return false;
    }

    public E() {
        this.f10768z = (byte) -1;
        this.f10761A = -1;
        this.f10762t = AbstractC0675d.f12795s;
    }

    public E(C0676e c0676e, C0678g c0678g) {
        this.f10768z = (byte) -1;
        this.f10761A = -1;
        this.f10764v = L.f10829w;
        this.f10765w = K.f10823w;
        this.f10766x = C.f10743C;
        this.f10767y = Collections.EMPTY_LIST;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        char c10 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        B bI = null;
                        C0621m c0621m = null;
                        C0621m c0621m2 = null;
                        if (iN == 10) {
                            if ((this.f10763u & 1) == 1) {
                                L l4 = this.f10764v;
                                l4.getClass();
                                c0621m = new C0621m(3);
                                c0621m.f11147v = q.f12819t;
                                c0621m.m(l4);
                            }
                            L l10 = (L) c0676e.g(L.f10830x, c0678g);
                            this.f10764v = l10;
                            if (c0621m != null) {
                                c0621m.m(l10);
                                this.f10764v = c0621m.i();
                            }
                            this.f10763u |= 1;
                        } else if (iN == 18) {
                            if ((this.f10763u & 2) == 2) {
                                K k3 = this.f10765w;
                                k3.getClass();
                                c0621m2 = new C0621m(1);
                                c0621m2.f11147v = Collections.EMPTY_LIST;
                                c0621m2.l(k3);
                            }
                            K k10 = (K) c0676e.g(K.f10824x, c0678g);
                            this.f10765w = k10;
                            if (c0621m2 != null) {
                                c0621m2.l(k10);
                                this.f10765w = c0621m2.h();
                            }
                            this.f10763u |= 2;
                        } else if (iN == 26) {
                            if ((this.f10763u & 4) == 4) {
                                C c11 = this.f10766x;
                                c11.getClass();
                                bI = B.i();
                                bI.j(c11);
                            }
                            C c12 = (C) c0676e.g(C.f10744D, c0678g);
                            this.f10766x = c12;
                            if (bI != null) {
                                bI.j(c12);
                                this.f10766x = bI.h();
                            }
                            this.f10763u |= 4;
                        } else if (iN != 34) {
                            if (!m(c0676e, c0154bJ, c0678g, iN)) {
                            }
                        } else {
                            int i10 = (c10 == true ? 1 : 0) & '\b';
                            c10 = c10;
                            if (i10 != 8) {
                                this.f10767y = new ArrayList();
                                c10 = '\b';
                            }
                            this.f10767y.add(c0676e.g(C0618j.c0, c0678g));
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if (((c10 == true ? 1 : 0) & '\b') == 8) {
                        this.f10767y = Collections.unmodifiableList(this.f10767y);
                    }
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f10762t = c0674c.c();
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
        if (((c10 == true ? 1 : 0) & '\b') == 8) {
            this.f10767y = Collections.unmodifiableList(this.f10767y);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f10762t = c0674c.c();
        }
        l();
    }
}
