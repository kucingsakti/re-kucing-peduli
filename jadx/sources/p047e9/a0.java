package p047e9;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0680i;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;
import p104k9.t;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10966t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10967u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10968v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b0 f10969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10971y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c0 f10972z;

    public static a0 h() {
        a0 a0Var = new a0();
        a0Var.f10969w = b0.ERROR;
        a0Var.f10972z = c0.LANGUAGE_VERSION;
        return a0Var;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        d0 d0VarF = f();
        d0VarF.isInitialized();
        return d0VarF;
    }

    public final Object clone() {
        a0 a0VarH = h();
        a0VarH.i(f());
        return a0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        d0 d0Var = null;
        try {
            try {
                d0.f11028D.getClass();
                i(new d0(c0676e));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                d0 d0Var2 = (d0) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    d0Var = d0Var2;
                    if (d0Var != null) {
                        i(d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (d0Var != null) {
                i(d0Var);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        i((d0) nVar);
        return this;
    }

    public final d0 f() {
        d0 d0Var = new d0(this);
        int i10 = this.f10966t;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        d0Var.f11033u = this.f10967u;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        d0Var.f11034v = this.f10968v;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        d0Var.f11035w = this.f10969w;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        d0Var.f11036x = this.f10970x;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        d0Var.f11037y = this.f10971y;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        d0Var.f11038z = this.f10972z;
        d0Var.f11032t = i11;
        return d0Var;
    }

    public final void i(d0 d0Var) {
        if (d0Var == d0.f11027C) {
            return;
        }
        int i10 = d0Var.f11032t;
        if ((i10 & 1) == 1) {
            int i11 = d0Var.f11033u;
            this.f10966t = 1 | this.f10966t;
            this.f10967u = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = d0Var.f11034v;
            this.f10966t = 2 | this.f10966t;
            this.f10968v = i12;
        }
        if ((i10 & 4) == 4) {
            b0 b0Var = d0Var.f11035w;
            b0Var.getClass();
            this.f10966t = 4 | this.f10966t;
            this.f10969w = b0Var;
        }
        int i13 = d0Var.f11032t;
        if ((i13 & 8) == 8) {
            int i14 = d0Var.f11036x;
            this.f10966t = 8 | this.f10966t;
            this.f10970x = i14;
        }
        if ((i13 & 16) == 16) {
            int i15 = d0Var.f11037y;
            this.f10966t = 16 | this.f10966t;
            this.f10971y = i15;
        }
        if ((i13 & 32) == 32) {
            c0 c0Var = d0Var.f11038z;
            c0Var.getClass();
            this.f10966t = 32 | this.f10966t;
            this.f10972z = c0Var;
        }
        this.f12808s = this.f12808s.e(d0Var.f11031s);
    }
}
