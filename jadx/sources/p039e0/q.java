package p039e0;

import Q9.j;
import Q9.k;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
public final class q extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10639s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f10640t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C f10641u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C c10, d dVar) {
        super(2, dVar);
        this.f10641u = c10;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        q qVar = new q(this.f10641u, dVar);
        qVar.f10640t = obj;
        return qVar;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((Q9.c) obj, (d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f13404s;
        int i10 = this.f10639s;
        m mVar = m.a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return mVar;
        }
        J7.a.v(obj);
        Q9.c cVar = (Q9.c) this.f10640t;
        C c10 = this.f10641u;
        D d3 = (D) c10.f10605f.f();
        if (!(d3 instanceof C0604a)) {
            c10.f10607h.i(new j(d3));
        }
        o oVar = new o(d3, null);
        this.f10639s = 1;
        c10.f10605f.A(new j(new p210v8.q(), new k(cVar, 1), oVar), this);
        return aVar;
    }
}
