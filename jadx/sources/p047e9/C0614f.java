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

/* JADX INFO: renamed from: e9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0614f extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11053t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11054u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f11055v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11056w;

    public /* synthetic */ C0614f(int i10) {
        this.f11053t = i10;
    }

    public static C0614f j() {
        C0614f c0614f = new C0614f(1);
        c0614f.f11055v = Collections.EMPTY_LIST;
        c0614f.f11056w = -1;
        return c0614f;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        switch (this.f11053t) {
            case 0:
                C0615g c0615gH = h();
                if (c0615gH.isInitialized()) {
                    return c0615gH;
                }
                throw new UninitializedMessageException();
            case 1:
                X xI = i();
                if (xI.isInitialized()) {
                    return xI;
                }
                throw new UninitializedMessageException();
            default:
                C0613e c0613eF = f();
                if (c0613eF.isInitialized()) {
                    return c0613eF;
                }
                throw new UninitializedMessageException();
        }
    }

    public final Object clone() {
        switch (this.f11053t) {
            case 0:
                C0614f c0614f = new C0614f(0);
                c0614f.f11055v = Collections.EMPTY_LIST;
                c0614f.l(h());
                return c0614f;
            case 1:
                C0614f c0614fJ = j();
                c0614fJ.m(i());
                return c0614fJ;
            default:
                C0614f c0614f2 = new C0614f(2);
                c0614f2.f11055v = C0612d.f11010H;
                c0614f2.k(f());
                return c0614f2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    /* JADX WARN: Code duplicated, block: B:44:0x005c  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        switch (this.f11053t) {
            case 0:
                C0615g c0615g = null;
                try {
                    try {
                        l((C0615g) C0615g.f11060z.a(c0676e, c0678g));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (c0615g != null) {
                            l(c0615g);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    C0615g c0615g2 = (C0615g) e10.f12841s;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        c0615g = c0615g2;
                        if (c0615g != null) {
                            l(c0615g);
                        }
                        throw th;
                    }
                }
            case 1:
                X x8 = null;
                try {
                    try {
                        X.f10940z.getClass();
                        m(new X(c0676e, c0678g));
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        X x10 = (X) e11.f12841s;
                        try {
                            throw e11;
                        } catch (Throwable th3) {
                            th = th3;
                            x8 = x10;
                            if (x8 != null) {
                                m(x8);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (x8 != null) {
                        m(x8);
                    }
                    throw th;
                }
            default:
                C0613e c0613e = null;
                try {
                    try {
                        C0613e.f11040z.getClass();
                        k(new C0613e(c0676e, c0678g));
                        return this;
                    } catch (InvalidProtocolBufferException e12) {
                        C0613e c0613e2 = (C0613e) e12.f12841s;
                        try {
                            throw e12;
                        } catch (Throwable th5) {
                            th = th5;
                            c0613e = c0613e2;
                            if (c0613e != null) {
                                k(c0613e);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (c0613e != null) {
                        k(c0613e);
                    }
                    throw th;
                }
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        switch (this.f11053t) {
            case 0:
                l((C0615g) nVar);
                break;
            case 1:
                m((X) nVar);
                break;
            default:
                k((C0613e) nVar);
                break;
        }
        return this;
    }

    public C0613e f() {
        C0613e c0613e = new C0613e(this);
        int i10 = this.f11054u;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        c0613e.f11043u = this.f11056w;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c0613e.f11044v = (C0612d) this.f11055v;
        c0613e.f11042t = i11;
        return c0613e;
    }

    public C0615g h() {
        C0615g c0615g = new C0615g(this);
        int i10 = this.f11054u;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        c0615g.f11063u = this.f11056w;
        if ((i10 & 2) == 2) {
            this.f11055v = Collections.unmodifiableList((List) this.f11055v);
            this.f11054u &= -3;
        }
        c0615g.f11064v = (List) this.f11055v;
        c0615g.f11062t = i11;
        return c0615g;
    }

    public X i() {
        X x8 = new X(this);
        int i10 = this.f11054u;
        if ((i10 & 1) == 1) {
            this.f11055v = Collections.unmodifiableList((List) this.f11055v);
            this.f11054u &= -2;
        }
        x8.f10943u = (List) this.f11055v;
        int i11 = (i10 & 2) != 2 ? 0 : 1;
        x8.f10944v = this.f11056w;
        x8.f10942t = i11;
        return x8;
    }

    public void k(C0613e c0613e) {
        C0612d c0612d;
        if (c0613e == C0613e.f11039y) {
            return;
        }
        int i10 = c0613e.f11042t;
        if ((i10 & 1) == 1) {
            int i11 = c0613e.f11043u;
            this.f11054u = 1 | this.f11054u;
            this.f11056w = i11;
        }
        if ((i10 & 2) == 2) {
            C0612d c0612d2 = c0613e.f11044v;
            if ((this.f11054u & 2) != 2 || (c0612d = (C0612d) this.f11055v) == C0612d.f11010H) {
                this.f11055v = c0612d2;
            } else {
                C0610b c0610bH = C0610b.h();
                c0610bH.i(c0612d);
                c0610bH.i(c0612d2);
                this.f11055v = c0610bH.f();
            }
            this.f11054u |= 2;
        }
        this.f12808s = this.f12808s.e(c0613e.f11041s);
    }

    public void l(C0615g c0615g) {
        if (c0615g == C0615g.f11059y) {
            return;
        }
        if ((c0615g.f11062t & 1) == 1) {
            int i10 = c0615g.f11063u;
            this.f11054u = 1 | this.f11054u;
            this.f11056w = i10;
        }
        if (!c0615g.f11064v.isEmpty()) {
            if (((List) this.f11055v).isEmpty()) {
                this.f11055v = c0615g.f11064v;
                this.f11054u &= -3;
            } else {
                if ((this.f11054u & 2) != 2) {
                    this.f11055v = new ArrayList((List) this.f11055v);
                    this.f11054u |= 2;
                }
                ((List) this.f11055v).addAll(c0615g.f11064v);
            }
        }
        this.f12808s = this.f12808s.e(c0615g.f11061s);
    }

    public void m(X x8) {
        if (x8 == X.f10939y) {
            return;
        }
        if (!x8.f10943u.isEmpty()) {
            if (((List) this.f11055v).isEmpty()) {
                this.f11055v = x8.f10943u;
                this.f11054u &= -2;
            } else {
                if ((this.f11054u & 1) != 1) {
                    this.f11055v = new ArrayList((List) this.f11055v);
                    this.f11054u |= 1;
                }
                ((List) this.f11055v).addAll(x8.f10943u);
            }
        }
        if ((x8.f10942t & 1) == 1) {
            int i10 = x8.f10944v;
            this.f11054u |= 2;
            this.f11056w = i10;
        }
        this.f12808s = this.f12808s.e(x8.f10941s);
    }
}
