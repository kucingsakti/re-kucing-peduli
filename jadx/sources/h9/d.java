package h9;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0680i;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;
import p104k9.t;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11824t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f11825u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f11826v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f11827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f11828x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c f11829y;

    public static d h() {
        d dVar = new d();
        dVar.f11825u = b.f11808y;
        c cVar = c.f11816y;
        dVar.f11826v = cVar;
        dVar.f11827w = cVar;
        dVar.f11828x = cVar;
        dVar.f11829y = cVar;
        return dVar;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        e eVarF = f();
        eVarF.isInitialized();
        return eVarF;
    }

    public final Object clone() {
        d dVarH = h();
        dVarH.i(f());
        return dVarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        e eVar = null;
        try {
            try {
                e.f11831C.getClass();
                i(new e(c0676e, c0678g));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                e eVar2 = (e) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    eVar = eVar2;
                    if (eVar != null) {
                        i(eVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (eVar != null) {
                i(eVar);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        i((e) nVar);
        return this;
    }

    public final e f() {
        e eVar = new e(this);
        int i10 = this.f11824t;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        eVar.f11835u = this.f11825u;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        eVar.f11836v = this.f11826v;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        eVar.f11837w = this.f11827w;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        eVar.f11838x = this.f11828x;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        eVar.f11839y = this.f11829y;
        eVar.f11834t = i11;
        return eVar;
    }

    public final void i(e eVar) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        b bVar;
        if (eVar == e.f11830B) {
            return;
        }
        if ((eVar.f11834t & 1) == 1) {
            b bVar2 = eVar.f11835u;
            if ((this.f11824t & 1) != 1 || (bVar = this.f11825u) == b.f11808y) {
                this.f11825u = bVar2;
            } else {
                a aVar = new a(0);
                aVar.i(bVar);
                aVar.i(bVar2);
                this.f11825u = aVar.f();
            }
            this.f11824t |= 1;
        }
        if ((eVar.f11834t & 2) == 2) {
            c cVar5 = eVar.f11836v;
            if ((this.f11824t & 2) != 2 || (cVar4 = this.f11826v) == c.f11816y) {
                this.f11826v = cVar5;
            } else {
                a aVarH = c.h(cVar4);
                aVarH.j(cVar5);
                this.f11826v = aVarH.h();
            }
            this.f11824t |= 2;
        }
        if ((eVar.f11834t & 4) == 4) {
            c cVar6 = eVar.f11837w;
            if ((this.f11824t & 4) != 4 || (cVar3 = this.f11827w) == c.f11816y) {
                this.f11827w = cVar6;
            } else {
                a aVarH2 = c.h(cVar3);
                aVarH2.j(cVar6);
                this.f11827w = aVarH2.h();
            }
            this.f11824t |= 4;
        }
        if ((eVar.f11834t & 8) == 8) {
            c cVar7 = eVar.f11838x;
            if ((this.f11824t & 8) != 8 || (cVar2 = this.f11828x) == c.f11816y) {
                this.f11828x = cVar7;
            } else {
                a aVarH3 = c.h(cVar2);
                aVarH3.j(cVar7);
                this.f11828x = aVarH3.h();
            }
            this.f11824t |= 8;
        }
        if ((eVar.f11834t & 16) == 16) {
            c cVar8 = eVar.f11839y;
            if ((this.f11824t & 16) != 16 || (cVar = this.f11829y) == c.f11816y) {
                this.f11829y = cVar8;
            } else {
                a aVarH4 = c.h(cVar);
                aVarH4.j(cVar8);
                this.f11829y = aVarH4.h();
            }
            this.f11824t |= 16;
        }
        this.f12808s = this.f12808s.e(eVar.f11833s);
    }
}
