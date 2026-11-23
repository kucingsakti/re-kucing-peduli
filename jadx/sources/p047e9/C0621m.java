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
import p104k9.q;
import p104k9.r;
import p104k9.t;

/* JADX INFO: renamed from: e9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0621m extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11145t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11146u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f11147v;

    public /* synthetic */ C0621m(int i10) {
        this.f11145t = i10;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        switch (this.f11145t) {
            case 0:
                C0622n c0622nF = f();
                if (c0622nF.isInitialized()) {
                    return c0622nF;
                }
                throw new UninitializedMessageException();
            case 1:
                K kH = h();
                if (kH.isInitialized()) {
                    return kH;
                }
                throw new UninitializedMessageException();
            case 2:
                e0 e0VarJ = j();
                e0VarJ.isInitialized();
                return e0VarJ;
            default:
                L lI = i();
                lI.isInitialized();
                return lI;
        }
    }

    public final Object clone() {
        switch (this.f11145t) {
            case 0:
                C0621m c0621m = new C0621m(0);
                c0621m.f11147v = Collections.EMPTY_LIST;
                c0621m.k(f());
                return c0621m;
            case 1:
                C0621m c0621m2 = new C0621m(1);
                c0621m2.f11147v = Collections.EMPTY_LIST;
                c0621m2.l(h());
                return c0621m2;
            case 2:
                C0621m c0621m3 = new C0621m(2);
                c0621m3.f11147v = Collections.EMPTY_LIST;
                c0621m3.p(j());
                return c0621m3;
            default:
                C0621m c0621m4 = new C0621m(3);
                c0621m4.f11147v = q.f12819t;
                c0621m4.m(i());
                return c0621m4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX WARN: Code duplicated, block: B:58:0x007d  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        switch (this.f11145t) {
            case 0:
                C0622n c0622n = null;
                try {
                    try {
                        C0622n.f11149x.getClass();
                        k(new C0622n(c0676e, c0678g));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (c0622n != null) {
                            k(c0622n);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    C0622n c0622n2 = (C0622n) e10.f12841s;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        c0622n = c0622n2;
                        if (c0622n != null) {
                            k(c0622n);
                        }
                        throw th;
                    }
                }
            case 1:
                K k3 = null;
                try {
                    try {
                        K.f10824x.getClass();
                        l(new K(c0676e, c0678g));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (k3 != null) {
                            l(k3);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    K k10 = (K) e11.f12841s;
                    try {
                        throw e11;
                    } catch (Throwable th4) {
                        th = th4;
                        k3 = k10;
                        if (k3 != null) {
                            l(k3);
                        }
                        throw th;
                    }
                }
            case 2:
                e0 e0Var = null;
                try {
                    try {
                        e0.f11048x.getClass();
                        p(new e0(c0676e, c0678g));
                        return this;
                    } catch (InvalidProtocolBufferException e12) {
                        e0 e0Var2 = (e0) e12.f12841s;
                        try {
                            throw e12;
                        } catch (Throwable th5) {
                            th = th5;
                            e0Var = e0Var2;
                            if (e0Var != null) {
                                p(e0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (e0Var != null) {
                        p(e0Var);
                    }
                    throw th;
                }
            default:
                L l4 = null;
                try {
                    try {
                        L.f10830x.getClass();
                        m(new L(c0676e));
                        return this;
                    } catch (InvalidProtocolBufferException e13) {
                        L l10 = (L) e13.f12841s;
                        try {
                            throw e13;
                        } catch (Throwable th7) {
                            th = th7;
                            l4 = l10;
                            if (l4 != null) {
                                m(l4);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (l4 != null) {
                        m(l4);
                    }
                    throw th;
                }
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        switch (this.f11145t) {
            case 0:
                k((C0622n) nVar);
                break;
            case 1:
                l((K) nVar);
                break;
            case 2:
                p((e0) nVar);
                break;
            default:
                m((L) nVar);
                break;
        }
        return this;
    }

    public C0622n f() {
        C0622n c0622n = new C0622n(this);
        if ((this.f11146u & 1) == 1) {
            this.f11147v = Collections.unmodifiableList(this.f11147v);
            this.f11146u &= -2;
        }
        c0622n.f11151t = this.f11147v;
        return c0622n;
    }

    public K h() {
        K k3 = new K(this);
        if ((this.f11146u & 1) == 1) {
            this.f11147v = Collections.unmodifiableList(this.f11147v);
            this.f11146u &= -2;
        }
        k3.f10826t = this.f11147v;
        return k3;
    }

    public L i() {
        L l4 = new L(this);
        if ((this.f11146u & 1) == 1) {
            this.f11147v = ((r) this.f11147v).i();
            this.f11146u &= -2;
        }
        l4.f10832t = (r) this.f11147v;
        return l4;
    }

    public e0 j() {
        e0 e0Var = new e0(this);
        if ((this.f11146u & 1) == 1) {
            this.f11147v = Collections.unmodifiableList(this.f11147v);
            this.f11146u &= -2;
        }
        e0Var.f11050t = this.f11147v;
        return e0Var;
    }

    public void k(C0622n c0622n) {
        if (c0622n == C0622n.f11148w) {
            return;
        }
        if (!c0622n.f11151t.isEmpty()) {
            if (this.f11147v.isEmpty()) {
                this.f11147v = c0622n.f11151t;
                this.f11146u &= -2;
            } else {
                if ((this.f11146u & 1) != 1) {
                    this.f11147v = new ArrayList(this.f11147v);
                    this.f11146u |= 1;
                }
                this.f11147v.addAll(c0622n.f11151t);
            }
        }
        this.f12808s = this.f12808s.e(c0622n.f11150s);
    }

    public void l(K k3) {
        if (k3 == K.f10823w) {
            return;
        }
        if (!k3.f10826t.isEmpty()) {
            if (this.f11147v.isEmpty()) {
                this.f11147v = k3.f10826t;
                this.f11146u &= -2;
            } else {
                if ((this.f11146u & 1) != 1) {
                    this.f11147v = new ArrayList(this.f11147v);
                    this.f11146u |= 1;
                }
                this.f11147v.addAll(k3.f10826t);
            }
        }
        this.f12808s = this.f12808s.e(k3.f10825s);
    }

    public void m(L l4) {
        if (l4 == L.f10829w) {
            return;
        }
        if (!l4.f10832t.isEmpty()) {
            if (((r) this.f11147v).isEmpty()) {
                this.f11147v = l4.f10832t;
                this.f11146u &= -2;
            } else {
                if ((this.f11146u & 1) != 1) {
                    this.f11147v = new q((r) this.f11147v);
                    this.f11146u |= 1;
                }
                ((r) this.f11147v).addAll(l4.f10832t);
            }
        }
        this.f12808s = this.f12808s.e(l4.f10831s);
    }

    public void p(e0 e0Var) {
        if (e0Var == e0.f11047w) {
            return;
        }
        if (!e0Var.f11050t.isEmpty()) {
            if (this.f11147v.isEmpty()) {
                this.f11147v = e0Var.f11050t;
                this.f11146u &= -2;
            } else {
                if ((this.f11146u & 1) != 1) {
                    this.f11147v = new ArrayList(this.f11147v);
                    this.f11146u |= 1;
                }
                this.f11147v.addAll(e0Var.f11050t);
            }
        }
        this.f12808s = this.f12808s.e(e0Var.f11049s);
    }
}
