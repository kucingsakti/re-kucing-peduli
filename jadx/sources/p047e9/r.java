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
public final class r extends n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final r f11169A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0609a f11170B = new C0609a(6);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0675d f11171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11172t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EnumC0624p f11173u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f11174v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0630w f11175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public EnumC0625q f11176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte f11177y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11178z;

    static {
        r rVar = new r();
        f11169A = rVar;
        rVar.f11173u = EnumC0624p.RETURNS_CONSTANT;
        rVar.f11174v = Collections.EMPTY_LIST;
        rVar.f11175w = C0630w.f11201D;
        rVar.f11176x = EnumC0625q.AT_MOST_ONCE;
    }

    public r() {
        this.f11177y = (byte) -1;
        this.f11178z = -1;
        this.f11171s = AbstractC0675d.f12795s;
    }

    @Override // p104k9.AbstractC0672a
    public final int b() {
        int i10 = this.f11178z;
        if (i10 != -1) {
            return i10;
        }
        int iA = (this.f11172t & 1) == 1 ? C0154b.a(1, this.f11173u.f11163s) : 0;
        for (int i11 = 0; i11 < this.f11174v.size(); i11++) {
            iA += C0154b.d(2, (AbstractC0672a) this.f11174v.get(i11));
        }
        if ((this.f11172t & 2) == 2) {
            iA += C0154b.d(3, this.f11175w);
        }
        if ((this.f11172t & 4) == 4) {
            iA += C0154b.a(4, this.f11176x.f11168s);
        }
        int size = this.f11171s.size() + iA;
        this.f11178z = size;
        return size;
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i c() {
        return C0623o.h();
    }

    @Override // p104k9.AbstractC0672a
    public final AbstractC0680i d() {
        C0623o c0623oH = C0623o.h();
        c0623oH.i(this);
        return c0623oH;
    }

    @Override // p104k9.AbstractC0672a
    public final void e(C0154b c0154b) throws IOException {
        b();
        if ((this.f11172t & 1) == 1) {
            c0154b.l(1, this.f11173u.f11163s);
        }
        for (int i10 = 0; i10 < this.f11174v.size(); i10++) {
            c0154b.o(2, (AbstractC0672a) this.f11174v.get(i10));
        }
        if ((this.f11172t & 2) == 2) {
            c0154b.o(3, this.f11175w);
        }
        if ((this.f11172t & 4) == 4) {
            c0154b.l(4, this.f11176x.f11168s);
        }
        c0154b.r(this.f11171s);
    }

    @Override // p104k9.t
    public final boolean isInitialized() {
        byte b3 = this.f11177y;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f11174v.size(); i10++) {
            if (!((C0630w) this.f11174v.get(i10)).isInitialized()) {
                this.f11177y = (byte) 0;
                return false;
            }
        }
        if ((this.f11172t & 2) != 2 || this.f11175w.isInitialized()) {
            this.f11177y = (byte) 1;
            return true;
        }
        this.f11177y = (byte) 0;
        return false;
    }

    public r(C0623o c0623o) {
        this.f11177y = (byte) -1;
        this.f11178z = -1;
        this.f11171s = c0623o.f12808s;
    }

    public r(C0676e c0676e, C0678g c0678g) {
        this.f11177y = (byte) -1;
        this.f11178z = -1;
        EnumC0624p enumC0624p = EnumC0624p.RETURNS_CONSTANT;
        this.f11173u = enumC0624p;
        this.f11174v = Collections.EMPTY_LIST;
        this.f11175w = C0630w.f11201D;
        EnumC0625q enumC0625q = EnumC0625q.AT_MOST_ONCE;
        this.f11176x = enumC0625q;
        C0674c c0674c = new C0674c();
        C0154b c0154bJ = C0154b.j(c0674c, 1);
        boolean z6 = false;
        char c10 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c0676e.n();
                    if (iN != 0) {
                        EnumC0625q enumC0625q2 = null;
                        EnumC0624p enumC0624p2 = null;
                        C0628u c0628uH = null;
                        if (iN == 8) {
                            int iK = c0676e.k();
                            if (iK == 0) {
                                enumC0624p2 = enumC0624p;
                            } else if (iK == 1) {
                                enumC0624p2 = EnumC0624p.CALLS;
                            } else if (iK == 2) {
                                enumC0624p2 = EnumC0624p.RETURNS_NOT_NULL;
                            }
                            if (enumC0624p2 == null) {
                                c0154bJ.v(iN);
                                c0154bJ.v(iK);
                            } else {
                                this.f11172t |= 1;
                                this.f11173u = enumC0624p2;
                            }
                        } else if (iN == 18) {
                            int i10 = (c10 == true ? 1 : 0) & 2;
                            c10 = c10;
                            if (i10 != 2) {
                                this.f11174v = new ArrayList();
                                c10 = 2;
                            }
                            this.f11174v.add(c0676e.g(C0630w.f11202E, c0678g));
                        } else if (iN == 26) {
                            if ((this.f11172t & 2) == 2) {
                                C0630w c0630w = this.f11175w;
                                c0630w.getClass();
                                c0628uH = C0628u.h();
                                c0628uH.i(c0630w);
                            }
                            C0630w c0630w2 = (C0630w) c0676e.g(C0630w.f11202E, c0678g);
                            this.f11175w = c0630w2;
                            if (c0628uH != null) {
                                c0628uH.i(c0630w2);
                                this.f11175w = c0628uH.f();
                            }
                            this.f11172t |= 2;
                        } else if (iN != 32) {
                            if (!c0676e.q(iN, c0154bJ)) {
                            }
                        } else {
                            int iK2 = c0676e.k();
                            if (iK2 == 0) {
                                enumC0625q2 = enumC0625q;
                            } else if (iK2 == 1) {
                                enumC0625q2 = EnumC0625q.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                enumC0625q2 = EnumC0625q.AT_LEAST_ONCE;
                            }
                            if (enumC0625q2 == null) {
                                c0154bJ.v(iN);
                                c0154bJ.v(iK2);
                            } else {
                                this.f11172t |= 4;
                                this.f11176x = enumC0625q2;
                            }
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if (((c10 == true ? 1 : 0) & 2) == 2) {
                        this.f11174v = Collections.unmodifiableList(this.f11174v);
                    }
                    try {
                        c0154bJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f11171s = c0674c.c();
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
        if (((c10 == true ? 1 : 0) & 2) == 2) {
            this.f11174v = Collections.unmodifiableList(this.f11174v);
        }
        try {
            c0154bJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f11171s = c0674c.c();
        }
    }
}
