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
public final class U extends AbstractC0681j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f10914A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f10915B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10916v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10918x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10919y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public V f10920z;

    public static U i() {
        U u3 = new U();
        u3.f10920z = V.INV;
        List list = Collections.EMPTY_LIST;
        u3.f10914A = list;
        u3.f10915B = list;
        return u3;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        W wH = h();
        if (wH.isInitialized()) {
            return wH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        U uI = i();
        uI.j(h());
        return uI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        W w2 = null;
        try {
            try {
                W.f10927F.getClass();
                j(new W(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                W w10 = (W) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    w2 = w10;
                    if (w2 != null) {
                        j(w2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (w2 != null) {
                j(w2);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        j((W) nVar);
        return this;
    }

    public final W h() {
        W w2 = new W(this);
        int i10 = this.f10916v;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        w2.f10934v = this.f10917w;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        w2.f10935w = this.f10918x;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        w2.f10936x = this.f10919y;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        w2.f10937y = this.f10920z;
        if ((i10 & 16) == 16) {
            this.f10914A = Collections.unmodifiableList(this.f10914A);
            this.f10916v &= -17;
        }
        w2.f10938z = this.f10914A;
        if ((this.f10916v & 32) == 32) {
            this.f10915B = Collections.unmodifiableList(this.f10915B);
            this.f10916v &= -33;
        }
        w2.f10928A = this.f10915B;
        w2.f10933u = i11;
        return w2;
    }

    public final void j(W w2) {
        if (w2 == W.f10926E) {
            return;
        }
        int i10 = w2.f10933u;
        if ((i10 & 1) == 1) {
            int i11 = w2.f10934v;
            this.f10916v = 1 | this.f10916v;
            this.f10917w = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = w2.f10935w;
            this.f10916v = 2 | this.f10916v;
            this.f10918x = i12;
        }
        if ((i10 & 4) == 4) {
            boolean z6 = w2.f10936x;
            this.f10916v = 4 | this.f10916v;
            this.f10919y = z6;
        }
        if ((i10 & 8) == 8) {
            V v4 = w2.f10937y;
            v4.getClass();
            this.f10916v = 8 | this.f10916v;
            this.f10920z = v4;
        }
        if (!w2.f10938z.isEmpty()) {
            if (this.f10914A.isEmpty()) {
                this.f10914A = w2.f10938z;
                this.f10916v &= -17;
            } else {
                if ((this.f10916v & 16) != 16) {
                    this.f10914A = new ArrayList(this.f10914A);
                    this.f10916v |= 16;
                }
                this.f10914A.addAll(w2.f10938z);
            }
        }
        if (!w2.f10928A.isEmpty()) {
            if (this.f10915B.isEmpty()) {
                this.f10915B = w2.f10928A;
                this.f10916v &= -33;
            } else {
                if ((this.f10916v & 32) != 32) {
                    this.f10915B = new ArrayList(this.f10915B);
                    this.f10916v |= 32;
                }
                this.f10915B.addAll(w2.f10928A);
            }
        }
        f(w2);
        this.f12808s = this.f12808s.e(w2.f10932t);
    }
}
