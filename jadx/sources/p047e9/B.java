package p047e9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0680i;
import p104k9.AbstractC0681j;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0681j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public e0 f10737A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10738v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f10739w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f10740x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f10741y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public X f10742z;

    public static B i() {
        B b3 = new B();
        List list = Collections.EMPTY_LIST;
        b3.f10739w = list;
        b3.f10740x = list;
        b3.f10741y = list;
        b3.f10742z = X.f10939y;
        b3.f10737A = e0.f11047w;
        return b3;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        C cH = h();
        if (cH.isInitialized()) {
            return cH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        B bI = i();
        bI.j(h());
        return bI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        C c10 = null;
        try {
            try {
                C.f10744D.getClass();
                j(new C(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                C c11 = (C) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    c10 = c11;
                    if (c10 != null) {
                        j(c10);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c10 != null) {
                j(c10);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        j((C) nVar);
        return this;
    }

    public final C h() {
        C c10 = new C(this);
        int i10 = this.f10738v;
        if ((i10 & 1) == 1) {
            this.f10739w = Collections.unmodifiableList(this.f10739w);
            this.f10738v &= -2;
        }
        c10.f10749v = this.f10739w;
        if ((this.f10738v & 2) == 2) {
            this.f10740x = Collections.unmodifiableList(this.f10740x);
            this.f10738v &= -3;
        }
        c10.f10750w = this.f10740x;
        if ((this.f10738v & 4) == 4) {
            this.f10741y = Collections.unmodifiableList(this.f10741y);
            this.f10738v &= -5;
        }
        c10.f10751x = this.f10741y;
        int i11 = (i10 & 8) != 8 ? 0 : 1;
        c10.f10752y = this.f10742z;
        if ((i10 & 16) == 16) {
            i11 |= 2;
        }
        c10.f10753z = this.f10737A;
        c10.f10748u = i11;
        return c10;
    }

    public final void j(C c10) {
        e0 e0Var;
        X x8;
        if (c10 == C.f10743C) {
            return;
        }
        if (!c10.f10749v.isEmpty()) {
            if (this.f10739w.isEmpty()) {
                this.f10739w = c10.f10749v;
                this.f10738v &= -2;
            } else {
                if ((this.f10738v & 1) != 1) {
                    this.f10739w = new ArrayList(this.f10739w);
                    this.f10738v |= 1;
                }
                this.f10739w.addAll(c10.f10749v);
            }
        }
        if (!c10.f10750w.isEmpty()) {
            if (this.f10740x.isEmpty()) {
                this.f10740x = c10.f10750w;
                this.f10738v &= -3;
            } else {
                if ((this.f10738v & 2) != 2) {
                    this.f10740x = new ArrayList(this.f10740x);
                    this.f10738v |= 2;
                }
                this.f10740x.addAll(c10.f10750w);
            }
        }
        if (!c10.f10751x.isEmpty()) {
            if (this.f10741y.isEmpty()) {
                this.f10741y = c10.f10751x;
                this.f10738v &= -5;
            } else {
                if ((this.f10738v & 4) != 4) {
                    this.f10741y = new ArrayList(this.f10741y);
                    this.f10738v |= 4;
                }
                this.f10741y.addAll(c10.f10751x);
            }
        }
        if ((c10.f10748u & 1) == 1) {
            X x10 = c10.f10752y;
            if ((this.f10738v & 8) != 8 || (x8 = this.f10742z) == X.f10939y) {
                this.f10742z = x10;
            } else {
                C0614f c0614fH = X.h(x8);
                c0614fH.m(x10);
                this.f10742z = c0614fH.i();
            }
            this.f10738v |= 8;
        }
        if ((c10.f10748u & 2) == 2) {
            e0 e0Var2 = c10.f10753z;
            if ((this.f10738v & 16) != 16 || (e0Var = this.f10737A) == e0.f11047w) {
                this.f10737A = e0Var2;
            } else {
                C0621m c0621m = new C0621m(2);
                c0621m.f11147v = Collections.EMPTY_LIST;
                c0621m.p(e0Var);
                c0621m.p(e0Var2);
                this.f10737A = c0621m.j();
            }
            this.f10738v |= 16;
        }
        f(c10);
        this.f12808s = this.f12808s.e(c10.f10747t);
    }
}
