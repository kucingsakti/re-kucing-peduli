package p047e9;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0680i;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;
import p104k9.t;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10835t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public N f10836u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Q f10837v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10838w;

    public static M h() {
        M m2 = new M();
        m2.f10836u = N.INV;
        m2.f10837v = Q.f10869L;
        return m2;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        O oF = f();
        if (oF.isInitialized()) {
            return oF;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        M mH = h();
        mH.i(f());
        return mH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        O o10 = null;
        try {
            try {
                O.f10845A.getClass();
                i(new O(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                O o11 = (O) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    o10 = o11;
                    if (o10 != null) {
                        i(o10);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (o10 != null) {
                i(o10);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        i((O) nVar);
        return this;
    }

    public final O f() {
        O o10 = new O(this);
        int i10 = this.f10835t;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        o10.f10849u = this.f10836u;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        o10.f10850v = this.f10837v;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        o10.f10851w = this.f10838w;
        o10.f10848t = i11;
        return o10;
    }

    public final void i(O o10) {
        Q q10;
        if (o10 == O.f10846z) {
            return;
        }
        if ((o10.f10848t & 1) == 1) {
            N n10 = o10.f10849u;
            n10.getClass();
            this.f10835t = 1 | this.f10835t;
            this.f10836u = n10;
        }
        if ((o10.f10848t & 2) == 2) {
            Q q11 = o10.f10850v;
            if ((this.f10835t & 2) != 2 || (q10 = this.f10837v) == Q.f10869L) {
                this.f10837v = q11;
            } else {
                P pQ = Q.q(q10);
                pQ.j(q11);
                this.f10837v = pQ.h();
            }
            this.f10835t |= 2;
        }
        if ((o10.f10848t & 4) == 4) {
            int i10 = o10.f10851w;
            this.f10835t = 4 | this.f10835t;
            this.f10838w = i10;
        }
        this.f12808s = this.f12808s.e(o10.f10847s);
    }
}
