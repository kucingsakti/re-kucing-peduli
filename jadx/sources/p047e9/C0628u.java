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

/* JADX INFO: renamed from: e9.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0628u extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f11188A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11189t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11190u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11191v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EnumC0629v f11192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Q f11193x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11194y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f11195z;

    public static C0628u h() {
        C0628u c0628u = new C0628u();
        c0628u.f11192w = EnumC0629v.TRUE;
        c0628u.f11193x = Q.f10869L;
        List list = Collections.EMPTY_LIST;
        c0628u.f11195z = list;
        c0628u.f11188A = list;
        return c0628u;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        C0630w c0630wF = f();
        if (c0630wF.isInitialized()) {
            return c0630wF;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0628u c0628uH = h();
        c0628uH.i(f());
        return c0628uH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        C0630w c0630w = null;
        try {
            try {
                C0630w.f11202E.getClass();
                i(new C0630w(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                C0630w c0630w2 = (C0630w) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    c0630w = c0630w2;
                    if (c0630w != null) {
                        i(c0630w);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0630w != null) {
                i(c0630w);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        i((C0630w) nVar);
        return this;
    }

    public final C0630w f() {
        C0630w c0630w = new C0630w(this);
        int i10 = this.f11189t;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        c0630w.f11208u = this.f11190u;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c0630w.f11209v = this.f11191v;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c0630w.f11210w = this.f11192w;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        c0630w.f11211x = this.f11193x;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        c0630w.f11212y = this.f11194y;
        if ((i10 & 32) == 32) {
            this.f11195z = Collections.unmodifiableList(this.f11195z);
            this.f11189t &= -33;
        }
        c0630w.f11213z = this.f11195z;
        if ((this.f11189t & 64) == 64) {
            this.f11188A = Collections.unmodifiableList(this.f11188A);
            this.f11189t &= -65;
        }
        c0630w.f11203A = this.f11188A;
        c0630w.f11207t = i11;
        return c0630w;
    }

    public final void i(C0630w c0630w) {
        Q q10;
        if (c0630w == C0630w.f11201D) {
            return;
        }
        int i10 = c0630w.f11207t;
        if ((i10 & 1) == 1) {
            int i11 = c0630w.f11208u;
            this.f11189t = 1 | this.f11189t;
            this.f11190u = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = c0630w.f11209v;
            this.f11189t = 2 | this.f11189t;
            this.f11191v = i12;
        }
        if ((i10 & 4) == 4) {
            EnumC0629v enumC0629v = c0630w.f11210w;
            enumC0629v.getClass();
            this.f11189t = 4 | this.f11189t;
            this.f11192w = enumC0629v;
        }
        if ((c0630w.f11207t & 8) == 8) {
            Q q11 = c0630w.f11211x;
            if ((this.f11189t & 8) != 8 || (q10 = this.f11193x) == Q.f10869L) {
                this.f11193x = q11;
            } else {
                P pQ = Q.q(q10);
                pQ.j(q11);
                this.f11193x = pQ.h();
            }
            this.f11189t |= 8;
        }
        if ((c0630w.f11207t & 16) == 16) {
            int i13 = c0630w.f11212y;
            this.f11189t = 16 | this.f11189t;
            this.f11194y = i13;
        }
        if (!c0630w.f11213z.isEmpty()) {
            if (this.f11195z.isEmpty()) {
                this.f11195z = c0630w.f11213z;
                this.f11189t &= -33;
            } else {
                if ((this.f11189t & 32) != 32) {
                    this.f11195z = new ArrayList(this.f11195z);
                    this.f11189t |= 32;
                }
                this.f11195z.addAll(c0630w.f11213z);
            }
        }
        if (!c0630w.f11203A.isEmpty()) {
            if (this.f11188A.isEmpty()) {
                this.f11188A = c0630w.f11203A;
                this.f11189t &= -65;
            } else {
                if ((this.f11189t & 64) != 64) {
                    this.f11188A = new ArrayList(this.f11188A);
                    this.f11189t |= 64;
                }
                this.f11188A.addAll(c0630w.f11203A);
            }
        }
        this.f12808s = this.f12808s.e(c0630w.f11206s);
    }
}
