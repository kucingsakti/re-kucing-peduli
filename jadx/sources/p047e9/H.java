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
public final class H extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10805t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10806u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10807v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public I f10808w;

    public static H h() {
        H h10 = new H();
        h10.f10806u = -1;
        h10.f10808w = I.PACKAGE;
        return h10;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        J jF = f();
        if (jF.isInitialized()) {
            return jF;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        H h10 = h();
        h10.i(f());
        return h10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        J j = null;
        try {
            try {
                J.f10814A.getClass();
                i(new J(c0676e));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                J j10 = (J) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    j = j10;
                    if (j != null) {
                        i(j);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (j != null) {
                i(j);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        i((J) nVar);
        return this;
    }

    public final J f() {
        J j = new J(this);
        int i10 = this.f10805t;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        j.f10818u = this.f10806u;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        j.f10819v = this.f10807v;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        j.f10820w = this.f10808w;
        j.f10817t = i11;
        return j;
    }

    public final void i(J j) {
        if (j == J.f10815z) {
            return;
        }
        int i10 = j.f10817t;
        if ((i10 & 1) == 1) {
            int i11 = j.f10818u;
            this.f10805t = 1 | this.f10805t;
            this.f10806u = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = j.f10819v;
            this.f10805t = 2 | this.f10805t;
            this.f10807v = i12;
        }
        if ((i10 & 4) == 4) {
            I i13 = j.f10820w;
            i13.getClass();
            this.f10805t = 4 | this.f10805t;
            this.f10808w = i13;
        }
        this.f12808s = this.f12808s.e(j.f10816s);
    }
}
