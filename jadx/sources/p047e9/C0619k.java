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

/* JADX INFO: renamed from: e9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0619k extends AbstractC0681j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11132v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11133w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f11134x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f11135y;

    public static C0619k i() {
        C0619k c0619k = new C0619k();
        c0619k.f11133w = 6;
        List list = Collections.EMPTY_LIST;
        c0619k.f11134x = list;
        c0619k.f11135y = list;
        return c0619k;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        C0620l c0620lH = h();
        if (c0620lH.isInitialized()) {
            return c0620lH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0619k c0619kI = i();
        c0619kI.j(h());
        return c0619kI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        C0620l c0620l = null;
        try {
            try {
                C0620l.f11137B.getClass();
                j(new C0620l(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                C0620l c0620l2 = (C0620l) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    c0620l = c0620l2;
                    if (c0620l != null) {
                        j(c0620l);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0620l != null) {
                j(c0620l);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        j((C0620l) nVar);
        return this;
    }

    public final C0620l h() {
        C0620l c0620l = new C0620l(this);
        int i10 = this.f11132v;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        c0620l.f11140v = this.f11133w;
        if ((i10 & 2) == 2) {
            this.f11134x = Collections.unmodifiableList(this.f11134x);
            this.f11132v &= -3;
        }
        c0620l.f11141w = this.f11134x;
        if ((this.f11132v & 4) == 4) {
            this.f11135y = Collections.unmodifiableList(this.f11135y);
            this.f11132v &= -5;
        }
        c0620l.f11142x = this.f11135y;
        c0620l.f11139u = i11;
        return c0620l;
    }

    public final void j(C0620l c0620l) {
        if (c0620l == C0620l.f11136A) {
            return;
        }
        if ((c0620l.f11139u & 1) == 1) {
            int i10 = c0620l.f11140v;
            this.f11132v = 1 | this.f11132v;
            this.f11133w = i10;
        }
        if (!c0620l.f11141w.isEmpty()) {
            if (this.f11134x.isEmpty()) {
                this.f11134x = c0620l.f11141w;
                this.f11132v &= -3;
            } else {
                if ((this.f11132v & 2) != 2) {
                    this.f11134x = new ArrayList(this.f11134x);
                    this.f11132v |= 2;
                }
                this.f11134x.addAll(c0620l.f11141w);
            }
        }
        if (!c0620l.f11142x.isEmpty()) {
            if (this.f11135y.isEmpty()) {
                this.f11135y = c0620l.f11142x;
                this.f11132v &= -5;
            } else {
                if ((this.f11132v & 4) != 4) {
                    this.f11135y = new ArrayList(this.f11135y);
                    this.f11132v |= 4;
                }
                this.f11135y.addAll(c0620l.f11142x);
            }
        }
        f(c0620l);
        this.f12808s = this.f12808s.e(c0620l.f11138t);
    }
}
