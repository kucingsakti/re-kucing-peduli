package Q9;

import p182s4.D;
import p182s4.z;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f4355t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4356u;

    public /* synthetic */ e(b bVar, Object obj, int i10) {
        this.f4354s = i10;
        this.f4355t = bVar;
        this.f4356u = obj;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // Q9.b
    public final Object A(c cVar, p144o8.c cVar2) throws Throwable {
        d dVar;
        e eVar;
        switch (this.f4354s) {
            case 0:
                if (cVar2 instanceof d) {
                    dVar = (d) cVar2;
                    int i10 = dVar.f4350t;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        dVar.f4350t = i10 - Integer.MIN_VALUE;
                    } else {
                        dVar = new d(this, cVar2);
                    }
                } else {
                    dVar = new d(this, cVar2);
                }
                Object objC = dVar.f4349s;
                Object obj = p134n8.a.f13404s;
                int i11 = dVar.f4350t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        cVar = dVar.f4353w;
                        eVar = dVar.f4352v;
                        J7.a.v(objC);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        J7.a.v(objC);
                    }
                    return p076h8.m.a;
                }
                J7.a.v(objC);
                dVar.f4352v = this;
                dVar.f4353w = cVar;
                dVar.f4350t = 1;
                objC = q.c(this.f4355t, cVar, dVar);
                if (objC == obj) {
                    return obj;
                }
                eVar = this;
                Throwable th = (Throwable) objC;
                if (th != null) {
                    z zVar = (z) eVar.f4356u;
                    dVar.f4352v = null;
                    dVar.f4353w = null;
                    dVar.f4350t = 2;
                    if (zVar.b(cVar, th, dVar) == obj) {
                        return obj;
                    }
                }
                return p076h8.m.a;
            default:
                Object objA = ((e) this.f4355t).A(new h(cVar, (D) this.f4356u, 1), cVar2);
                return objA == p134n8.a.f13404s ? objA : p076h8.m.a;
        }
    }
}
