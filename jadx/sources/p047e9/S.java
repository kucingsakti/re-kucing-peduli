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
public final class S extends AbstractC0681j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10889A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Q f10890B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10891C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List f10892D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f10893E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10894v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10896x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f10897y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Q f10898z;

    public static S i() {
        S s9 = new S();
        s9.f10895w = 6;
        List list = Collections.EMPTY_LIST;
        s9.f10897y = list;
        Q q10 = Q.f10869L;
        s9.f10898z = q10;
        s9.f10890B = q10;
        s9.f10892D = list;
        s9.f10893E = list;
        return s9;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        T tH = h();
        if (tH.isInitialized()) {
            return tH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        S sI = i();
        sI.j(h());
        return sI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        T t7 = null;
        try {
            try {
                T.f10900H.getClass();
                j(new T(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                T t8 = (T) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    t7 = t8;
                    if (t7 != null) {
                        j(t7);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (t7 != null) {
                j(t7);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        j((T) nVar);
        return this;
    }

    public final T h() {
        T t7 = new T(this);
        int i10 = this.f10894v;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        t7.f10909v = this.f10895w;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        t7.f10910w = this.f10896x;
        if ((i10 & 4) == 4) {
            this.f10897y = Collections.unmodifiableList(this.f10897y);
            this.f10894v &= -5;
        }
        t7.f10911x = this.f10897y;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        t7.f10912y = this.f10898z;
        if ((i10 & 16) == 16) {
            i11 |= 8;
        }
        t7.f10913z = this.f10889A;
        if ((i10 & 32) == 32) {
            i11 |= 16;
        }
        t7.f10901A = this.f10890B;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        t7.f10902B = this.f10891C;
        if ((this.f10894v & 128) == 128) {
            this.f10892D = Collections.unmodifiableList(this.f10892D);
            this.f10894v &= -129;
        }
        t7.f10903C = this.f10892D;
        if ((this.f10894v & 256) == 256) {
            this.f10893E = Collections.unmodifiableList(this.f10893E);
            this.f10894v &= -257;
        }
        t7.f10904D = this.f10893E;
        t7.f10908u = i11;
        return t7;
    }

    public final void j(T t7) {
        Q q10;
        Q q11;
        if (t7 == T.f10899G) {
            return;
        }
        int i10 = t7.f10908u;
        if ((i10 & 1) == 1) {
            int i11 = t7.f10909v;
            this.f10894v = 1 | this.f10894v;
            this.f10895w = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = t7.f10910w;
            this.f10894v = 2 | this.f10894v;
            this.f10896x = i12;
        }
        if (!t7.f10911x.isEmpty()) {
            if (this.f10897y.isEmpty()) {
                this.f10897y = t7.f10911x;
                this.f10894v &= -5;
            } else {
                if ((this.f10894v & 4) != 4) {
                    this.f10897y = new ArrayList(this.f10897y);
                    this.f10894v |= 4;
                }
                this.f10897y.addAll(t7.f10911x);
            }
        }
        if ((t7.f10908u & 4) == 4) {
            Q q12 = t7.f10912y;
            if ((this.f10894v & 8) != 8 || (q11 = this.f10898z) == Q.f10869L) {
                this.f10898z = q12;
            } else {
                P pQ = Q.q(q11);
                pQ.j(q12);
                this.f10898z = pQ.h();
            }
            this.f10894v |= 8;
        }
        int i13 = t7.f10908u;
        if ((i13 & 8) == 8) {
            int i14 = t7.f10913z;
            this.f10894v |= 16;
            this.f10889A = i14;
        }
        if ((i13 & 16) == 16) {
            Q q13 = t7.f10901A;
            if ((this.f10894v & 32) != 32 || (q10 = this.f10890B) == Q.f10869L) {
                this.f10890B = q13;
            } else {
                P pQ2 = Q.q(q10);
                pQ2.j(q13);
                this.f10890B = pQ2.h();
            }
            this.f10894v |= 32;
        }
        if ((t7.f10908u & 32) == 32) {
            int i15 = t7.f10902B;
            this.f10894v |= 64;
            this.f10891C = i15;
        }
        if (!t7.f10903C.isEmpty()) {
            if (this.f10892D.isEmpty()) {
                this.f10892D = t7.f10903C;
                this.f10894v &= -129;
            } else {
                if ((this.f10894v & 128) != 128) {
                    this.f10892D = new ArrayList(this.f10892D);
                    this.f10894v |= 128;
                }
                this.f10892D.addAll(t7.f10903C);
            }
        }
        if (!t7.f10904D.isEmpty()) {
            if (this.f10893E.isEmpty()) {
                this.f10893E = t7.f10904D;
                this.f10894v &= -257;
            } else {
                if ((this.f10894v & 256) != 256) {
                    this.f10893E = new ArrayList(this.f10893E);
                    this.f10894v |= 256;
                }
                this.f10893E.addAll(t7.f10904D);
            }
        }
        f(t7);
        this.f12808s = this.f12808s.e(t7.f10907t);
    }
}
