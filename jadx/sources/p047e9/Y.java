package p047e9;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0680i;
import p104k9.AbstractC0681j;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC0681j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Q f10947A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10948B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10949v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10951x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Q f10952y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10953z;

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        Z zH = h();
        if (zH.isInitialized()) {
            return zH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        Y y6 = new Y();
        Q q10 = Q.f10869L;
        y6.f10952y = q10;
        y6.f10947A = q10;
        y6.i(h());
        return y6;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        Z z6 = null;
        try {
            try {
                Z.f10955E.getClass();
                i(new Z(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                Z z10 = (Z) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    z6 = z10;
                    if (z6 != null) {
                        i(z6);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (z6 != null) {
                i(z6);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        i((Z) nVar);
        return this;
    }

    public final Z h() {
        Z z6 = new Z(this);
        int i10 = this.f10949v;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        z6.f10961v = this.f10950w;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        z6.f10962w = this.f10951x;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        z6.f10963x = this.f10952y;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        z6.f10964y = this.f10953z;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        z6.f10965z = this.f10947A;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        z6.f10956A = this.f10948B;
        z6.f10960u = i11;
        return z6;
    }

    public final void i(Z z6) {
        Q q10;
        Q q11;
        if (z6 == Z.f10954D) {
            return;
        }
        int i10 = z6.f10960u;
        if ((i10 & 1) == 1) {
            int i11 = z6.f10961v;
            this.f10949v = 1 | this.f10949v;
            this.f10950w = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = z6.f10962w;
            this.f10949v = 2 | this.f10949v;
            this.f10951x = i12;
        }
        if ((i10 & 4) == 4) {
            Q q12 = z6.f10963x;
            if ((this.f10949v & 4) != 4 || (q11 = this.f10952y) == Q.f10869L) {
                this.f10952y = q12;
            } else {
                P pQ = Q.q(q11);
                pQ.j(q12);
                this.f10952y = pQ.h();
            }
            this.f10949v |= 4;
        }
        int i13 = z6.f10960u;
        if ((i13 & 8) == 8) {
            int i14 = z6.f10964y;
            this.f10949v = 8 | this.f10949v;
            this.f10953z = i14;
        }
        if ((i13 & 16) == 16) {
            Q q13 = z6.f10965z;
            if ((this.f10949v & 16) != 16 || (q10 = this.f10947A) == Q.f10869L) {
                this.f10947A = q13;
            } else {
                P pQ2 = Q.q(q10);
                pQ2.j(q13);
                this.f10947A = pQ2.h();
            }
            this.f10949v |= 16;
        }
        if ((z6.f10960u & 32) == 32) {
            int i15 = z6.f10956A;
            this.f10949v = 32 | this.f10949v;
            this.f10948B = i15;
        }
        f(z6);
        this.f12808s = this.f12808s.e(z6.f10959t);
    }
}
