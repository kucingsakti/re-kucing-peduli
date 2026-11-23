package h9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0680i;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;
import p104k9.t;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11841t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f11842u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f11843v;

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        j jVarF = f();
        jVarF.isInitialized();
        return jVarF;
    }

    public final Object clone() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f11842u = list;
        fVar.f11843v = list;
        fVar.h(f());
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        j jVar = null;
        try {
            try {
                j.f11871z.getClass();
                h(new j(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                j jVar2 = (j) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    jVar = jVar2;
                    if (jVar != null) {
                        h(jVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (jVar != null) {
                h(jVar);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        h((j) nVar);
        return this;
    }

    public final j f() {
        j jVar = new j(this);
        if ((this.f11841t & 1) == 1) {
            this.f11842u = Collections.unmodifiableList(this.f11842u);
            this.f11841t &= -2;
        }
        jVar.f11873t = this.f11842u;
        if ((this.f11841t & 2) == 2) {
            this.f11843v = Collections.unmodifiableList(this.f11843v);
            this.f11841t &= -3;
        }
        jVar.f11874u = this.f11843v;
        return jVar;
    }

    public final void h(j jVar) {
        if (jVar == j.f11870y) {
            return;
        }
        if (!jVar.f11873t.isEmpty()) {
            if (this.f11842u.isEmpty()) {
                this.f11842u = jVar.f11873t;
                this.f11841t &= -2;
            } else {
                if ((this.f11841t & 1) != 1) {
                    this.f11842u = new ArrayList(this.f11842u);
                    this.f11841t |= 1;
                }
                this.f11842u.addAll(jVar.f11873t);
            }
        }
        if (!jVar.f11874u.isEmpty()) {
            if (this.f11843v.isEmpty()) {
                this.f11843v = jVar.f11874u;
                this.f11841t &= -3;
            } else {
                if ((this.f11841t & 2) != 2) {
                    this.f11843v = new ArrayList(this.f11843v);
                    this.f11841t |= 2;
                }
                this.f11843v.addAll(jVar.f11874u);
            }
        }
        this.f12808s = this.f12808s.e(jVar.f11872s);
    }
}
