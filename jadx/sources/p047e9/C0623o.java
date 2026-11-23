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

/* JADX INFO: renamed from: e9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0623o extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11154t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EnumC0624p f11155u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f11156v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0630w f11157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public EnumC0625q f11158x;

    public static C0623o h() {
        C0623o c0623o = new C0623o();
        c0623o.f11155u = EnumC0624p.RETURNS_CONSTANT;
        c0623o.f11156v = Collections.EMPTY_LIST;
        c0623o.f11157w = C0630w.f11201D;
        c0623o.f11158x = EnumC0625q.AT_MOST_ONCE;
        return c0623o;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        r rVarF = f();
        if (rVarF.isInitialized()) {
            return rVarF;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0623o c0623oH = h();
        c0623oH.i(f());
        return c0623oH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        r rVar = null;
        try {
            try {
                r.f11170B.getClass();
                i(new r(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                r rVar2 = (r) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    rVar = rVar2;
                    if (rVar != null) {
                        i(rVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (rVar != null) {
                i(rVar);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        i((r) nVar);
        return this;
    }

    public final r f() {
        r rVar = new r(this);
        int i10 = this.f11154t;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        rVar.f11173u = this.f11155u;
        if ((i10 & 2) == 2) {
            this.f11156v = Collections.unmodifiableList(this.f11156v);
            this.f11154t &= -3;
        }
        rVar.f11174v = this.f11156v;
        if ((i10 & 4) == 4) {
            i11 |= 2;
        }
        rVar.f11175w = this.f11157w;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        rVar.f11176x = this.f11158x;
        rVar.f11172t = i11;
        return rVar;
    }

    public final void i(r rVar) {
        C0630w c0630w;
        if (rVar == r.f11169A) {
            return;
        }
        if ((rVar.f11172t & 1) == 1) {
            EnumC0624p enumC0624p = rVar.f11173u;
            enumC0624p.getClass();
            this.f11154t |= 1;
            this.f11155u = enumC0624p;
        }
        if (!rVar.f11174v.isEmpty()) {
            if (this.f11156v.isEmpty()) {
                this.f11156v = rVar.f11174v;
                this.f11154t &= -3;
            } else {
                if ((this.f11154t & 2) != 2) {
                    this.f11156v = new ArrayList(this.f11156v);
                    this.f11154t |= 2;
                }
                this.f11156v.addAll(rVar.f11174v);
            }
        }
        if ((rVar.f11172t & 2) == 2) {
            C0630w c0630w2 = rVar.f11175w;
            if ((this.f11154t & 4) != 4 || (c0630w = this.f11157w) == C0630w.f11201D) {
                this.f11157w = c0630w2;
            } else {
                C0628u c0628uH = C0628u.h();
                c0628uH.i(c0630w);
                c0628uH.i(c0630w2);
                this.f11157w = c0628uH.f();
            }
            this.f11154t |= 4;
        }
        if ((rVar.f11172t & 4) == 4) {
            EnumC0625q enumC0625q = rVar.f11176x;
            enumC0625q.getClass();
            this.f11154t |= 8;
            this.f11158x = enumC0625q;
        }
        this.f12808s = this.f12808s.e(rVar.f11171s);
    }
}
