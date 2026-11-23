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

/* JADX INFO: renamed from: e9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0630w extends n {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0630w f11201D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0609a f11202E = new C0609a(8);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f11203A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public byte f11204B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11205C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f11206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11208u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EnumC0629v f11210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Q f11211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11212y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f11213z;

    static {
        C0630w c0630w = new C0630w();
        f11201D = c0630w;
        c0630w.f11208u = 0;
        c0630w.f11209v = 0;
        c0630w.f11210w = EnumC0629v.TRUE;
        c0630w.f11211x = Q.f10869L;
        c0630w.f11212y = 0;
        List list = Collections.EMPTY_LIST;
        c0630w.f11213z = list;
        c0630w.f11203A = list;
    }

    public C0630w() {
        this.f11204B = (byte) -1;
        this.f11205C = -1;
        this.f11206s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11205C;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f11207t & 1) == 1 ? C0154b.b(1, this.f11208u) : 0;
        if ((this.f11207t & 2) == 2) {
            iB += C0154b.b(2, this.f11209v);
        }
        if ((this.f11207t & 4) == 4) {
            iB += C0154b.a(3, this.f11210w.f11200s);
        }
        if ((this.f11207t & 8) == 8) {
            iB += C0154b.d(4, this.f11211x);
        }
        if ((this.f11207t & 16) == 16) {
            iB += C0154b.b(5, this.f11212y);
        }
        for (int i11 = 0; i11 < this.f11213z.size(); i11++) {
            iB += C0154b.d(6, (AbstractC0672a) this.f11213z.get(i11));
        }
        for (int i12 = 0; i12 < this.f11203A.size(); i12++) {
            iB += C0154b.d(7, (AbstractC0672a) this.f11203A.get(i12));
        }
        int size = this.f11206s.size() + iB;
        this.f11205C = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return C0628u.h();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        C0628u c0628uH = C0628u.h();
        c0628uH.i(this);
        return c0628uH;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        if ((this.f11207t & 1) == 1) {
            c0154b.m(1, this.f11208u);
        }
        if ((this.f11207t & 2) == 2) {
            c0154b.m(2, this.f11209v);
        }
        if ((this.f11207t & 4) == 4) {
            c0154b.l(3, this.f11210w.f11200s);
        }
        if ((this.f11207t & 8) == 8) {
            c0154b.o(4, this.f11211x);
        }
        if ((this.f11207t & 16) == 16) {
            c0154b.m(5, this.f11212y);
        }
        for (int i10 = 0; i10 < this.f11213z.size(); i10++) {
            c0154b.o(6, (AbstractC0672a) this.f11213z.get(i10));
        }
        for (int i11 = 0; i11 < this.f11203A.size(); i11++) {
            c0154b.o(7, (AbstractC0672a) this.f11203A.get(i11));
        }
        c0154b.r(this.f11206s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f11204B;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if ((this.f11207t & 8) == 8 && !this.f11211x.isInitialized()) {
            this.f11204B = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f11213z.size(); i10++) {
            if (!((C0630w) this.f11213z.get(i10)).isInitialized()) {
                this.f11204B = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f11203A.size(); i11++) {
            if (!((C0630w) this.f11203A.get(i11)).isInitialized()) {
                this.f11204B = (byte) 0;
                return false;
            }
        }
        this.f11204B = (byte) 1;
        return true;
    }

    public C0630w(C0628u c0628u) {
        this.f11204B = (byte) -1;
        this.f11205C = -1;
        this.f11206s = c0628u.f12808s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0630w(C0676e c0676e, C0678g c0678g) {
        EnumC0629v enumC0629v;
        this.f11204B = (byte) -1;
        this.f11205C = -1;
        boolean z6 = false;
        this.f11208u = 0;
        this.f11209v = 0;
        EnumC0629v enumC0629v2 = EnumC0629v.TRUE;
        this.f11210w = enumC0629v2;
        this.f11211x = Q.f10869L;
        this.f11212y = 0;
        List list = Collections.EMPTY_LIST;
        this.f11213z = list;
        this.f11203A = list;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        int i10 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f11207t |= 1;
                            this.f11208u = c0676e.k();
                        } else if (iN != 16) {
                            Object objQ = null;
                            if (iN == 24) {
                                int iK = c0676e.k();
                                if (iK != 0) {
                                    if (iK == 1) {
                                        objQ = EnumC0629v.FALSE;
                                    } else if (iK == 2) {
                                        objQ = EnumC0629v.NULL;
                                    }
                                    enumC0629v = objQ;
                                } else {
                                    enumC0629v = enumC0629v2;
                                }
                                if (enumC0629v == 0) {
                                    c0154bJ.v(iN);
                                    c0154bJ.v(iK);
                                } else {
                                    this.f11207t |= 4;
                                    this.f11210w = enumC0629v;
                                }
                            } else if (iN == 34) {
                                if ((this.f11207t & 8) == 8) {
                                    Q q10 = this.f11211x;
                                    q10.getClass();
                                    objQ = Q.q(q10);
                                }
                                P p10 = objQ;
                                Q q11 = (Q) c0676e.g(Q.f10870M, c0678g);
                                this.f11211x = q11;
                                if (p10 != 0) {
                                    p10.j(q11);
                                    this.f11211x = p10.h();
                                }
                                this.f11207t |= 8;
                            } else if (iN != 40) {
                                C0609a c0609a = f11202E;
                                if (iN == 50) {
                                    if ((i10 & 32) != 32) {
                                        this.f11213z = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f11213z.add(c0676e.g(c0609a, c0678g));
                                } else if (iN != 58) {
                                    if (!c0676e.q(iN, c0154bJ)) {
                                    }
                                } else {
                                    if ((i10 & 64) != 64) {
                                        this.f11203A = new ArrayList();
                                        i10 |= 64;
                                    }
                                    this.f11203A.add(c0676e.g(c0609a, c0678g));
                                }
                            } else {
                                this.f11207t |= 16;
                                this.f11212y = c0676e.k();
                            }
                        } else {
                            this.f11207t |= 2;
                            this.f11209v = c0676e.k();
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if ((i10 & 32) == 32) {
                        this.f11213z = Collections.unmodifiableList(this.f11213z);
                    }
                    if ((i10 & 64) == 64) {
                        this.f11203A = Collections.unmodifiableList(this.f11203A);
                    }
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f11206s = c0674c.c();
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
        if ((i10 & 32) == 32) {
            this.f11213z = Collections.unmodifiableList(this.f11213z);
        }
        if ((i10 & 64) == 64) {
            this.f11203A = Collections.unmodifiableList(this.f11203A);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11206s = c0674c.c();
        }
    }
}
