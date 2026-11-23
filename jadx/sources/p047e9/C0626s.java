package p047e9;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0680i;
import p104k9.AbstractC0681j;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;

/* JADX INFO: renamed from: e9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0626s extends AbstractC0681j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11179v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11180w;

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        C0627t c0627t = new C0627t(this);
        int i10 = (this.f11179v & 1) != 1 ? 0 : 1;
        c0627t.f11185v = this.f11180w;
        c0627t.f11184u = i10;
        if (c0627t.isInitialized()) {
            return c0627t;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0626s c0626s = new C0626s();
        C0627t c0627t = new C0627t(this);
        int i10 = (this.f11179v & 1) != 1 ? 0 : 1;
        c0627t.f11185v = this.f11180w;
        c0627t.f11184u = i10;
        c0626s.h(c0627t);
        return c0626s;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        C0627t c0627t = null;
        try {
            try {
                C0627t.f11182z.getClass();
                h(new C0627t(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                C0627t c0627t2 = (C0627t) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    c0627t = c0627t2;
                    if (c0627t != null) {
                        h(c0627t);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0627t != null) {
                h(c0627t);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        h((C0627t) nVar);
        return this;
    }

    public final void h(C0627t c0627t) {
        if (c0627t == C0627t.f11181y) {
            return;
        }
        if ((c0627t.f11184u & 1) == 1) {
            int i10 = c0627t.f11185v;
            this.f11179v = 1 | this.f11179v;
            this.f11180w = i10;
        }
        f(c0627t);
        this.f12808s = this.f12808s.e(c0627t.f11183t);
    }
}
