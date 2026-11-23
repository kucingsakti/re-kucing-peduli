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
import p104k9.q;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0681j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public L f10755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public K f10756x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C f10757y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f10758z;

    public static D i() {
        D d3 = new D();
        d3.f10755w = L.f10829w;
        d3.f10756x = K.f10823w;
        d3.f10757y = C.f10743C;
        d3.f10758z = Collections.EMPTY_LIST;
        return d3;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        E eH = h();
        if (eH.isInitialized()) {
            return eH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        D dI = i();
        dI.j(h());
        return dI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        E e10 = null;
        try {
            try {
                E.f10760C.getClass();
                j(new E(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e11) {
                E e12 = (E) e11.f12841s;
                try {
                    throw e11;
                } catch (Throwable th) {
                    th = th;
                    e10 = e12;
                    if (e10 != null) {
                        j(e10);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (e10 != null) {
                j(e10);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        j((E) nVar);
        return this;
    }

    public final E h() {
        E e10 = new E(this);
        int i10 = this.f10754v;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        e10.f10764v = this.f10755w;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        e10.f10765w = this.f10756x;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        e10.f10766x = this.f10757y;
        if ((i10 & 8) == 8) {
            this.f10758z = Collections.unmodifiableList(this.f10758z);
            this.f10754v &= -9;
        }
        e10.f10767y = this.f10758z;
        e10.f10763u = i11;
        return e10;
    }

    public final void j(E e10) {
        C c10;
        K k3;
        L l4;
        if (e10 == E.f10759B) {
            return;
        }
        if ((e10.f10763u & 1) == 1) {
            L l10 = e10.f10764v;
            if ((this.f10754v & 1) != 1 || (l4 = this.f10755w) == L.f10829w) {
                this.f10755w = l10;
            } else {
                C0621m c0621m = new C0621m(3);
                c0621m.f11147v = q.f12819t;
                c0621m.m(l4);
                c0621m.m(l10);
                this.f10755w = c0621m.i();
            }
            this.f10754v |= 1;
        }
        if ((e10.f10763u & 2) == 2) {
            K k10 = e10.f10765w;
            if ((this.f10754v & 2) != 2 || (k3 = this.f10756x) == K.f10823w) {
                this.f10756x = k10;
            } else {
                C0621m c0621m2 = new C0621m(1);
                c0621m2.f11147v = Collections.EMPTY_LIST;
                c0621m2.l(k3);
                c0621m2.l(k10);
                this.f10756x = c0621m2.h();
            }
            this.f10754v |= 2;
        }
        if ((e10.f10763u & 4) == 4) {
            C c11 = e10.f10766x;
            if ((this.f10754v & 4) != 4 || (c10 = this.f10757y) == C.f10743C) {
                this.f10757y = c11;
            } else {
                B bI = B.i();
                bI.j(c10);
                bI.j(c11);
                this.f10757y = bI.h();
            }
            this.f10754v |= 4;
        }
        if (!e10.f10767y.isEmpty()) {
            if (this.f10758z.isEmpty()) {
                this.f10758z = e10.f10767y;
                this.f10754v &= -9;
            } else {
                if ((this.f10754v & 8) != 8) {
                    this.f10758z = new ArrayList(this.f10758z);
                    this.f10754v |= 8;
                }
                this.f10758z.addAll(e10.f10767y);
            }
        }
        f(e10);
        this.f12808s = this.f12808s.e(e10.f10762t);
    }
}
