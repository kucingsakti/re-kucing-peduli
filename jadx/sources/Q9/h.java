package Q9;

import p182s4.A;
import p182s4.C0777n;
import p182s4.C0786x;
import p182s4.D;
import p182s4.y;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f4365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4366u;

    public /* synthetic */ h(c cVar, Object obj, int i10) {
        this.f4364s = i10;
        this.f4365t = cVar;
        this.f4366u = obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // Q9.c
    public final Object a(Object obj, p123m8.d dVar) throws Throwable {
        g gVar;
        h hVar;
        A a;
        p076h8.m mVar = p076h8.m.a;
        c cVar = this.f4365t;
        p134n8.a aVar = p134n8.a.f13404s;
        switch (this.f4364s) {
            case 0:
                if (dVar instanceof g) {
                    gVar = (g) dVar;
                    int i10 = gVar.f4363v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        gVar.f4363v = i10 - Integer.MIN_VALUE;
                    } else {
                        gVar = new g(this, dVar);
                    }
                } else {
                    gVar = new g(this, dVar);
                }
                Object obj2 = gVar.f4361t;
                int i11 = gVar.f4363v;
                if (i11 == 0) {
                    J7.a.v(obj2);
                    try {
                        gVar.f4360s = this;
                        gVar.f4363v = 1;
                        return cVar.a(obj, gVar) == aVar ? aVar : mVar;
                    } catch (Throwable th) {
                        th = th;
                        hVar = this;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = gVar.f4360s;
                    try {
                        J7.a.v(obj2);
                        return mVar;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                ((p210v8.t) hVar.f4366u).f15466s = th;
                throw th;
            default:
                if (dVar instanceof A) {
                    a = (A) dVar;
                    int i12 = a.f14598t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        a.f14598t = i12 - Integer.MIN_VALUE;
                    } else {
                        a = new A(this, dVar);
                    }
                } else {
                    a = new A(this, dVar);
                }
                Object obj3 = a.f14597s;
                int i13 = a.f14598t;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    J7.a.v(obj3);
                    return mVar;
                }
                J7.a.v(obj3);
                C0786x c0786x = D.f14605e;
                ((D) this.f4366u).getClass();
                C0777n c0777n = new C0777n((String) ((p070h0.b) obj).a(y.a));
                a.f14598t = 1;
                return cVar.a(c0777n, a) == aVar ? aVar : mVar;
        }
    }
}
