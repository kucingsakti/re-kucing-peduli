package p197u4;

import J7.a;
import p070h0.b;
import p070h0.e;
import p123m8.d;
import p144o8.g;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class m extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f15341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f15342v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object obj, e eVar, n nVar, d dVar) {
        super(2, dVar);
        this.f15340t = obj;
        this.f15341u = eVar;
        this.f15342v = nVar;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        m mVar = new m(this.f15340t, this.f15341u, this.f15342v, dVar);
        mVar.f15339s = obj;
        return mVar;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) create((b) obj, (d) obj2);
        p076h8.m mVar2 = p076h8.m.a;
        mVar.invokeSuspend(mVar2);
        return mVar2;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a.v(obj);
        b bVar = (b) this.f15339s;
        Object obj2 = this.f15340t;
        e eVar = this.f15341u;
        if (obj2 != null) {
            bVar.getClass();
            i.f(eVar, "key");
            bVar.b(eVar, obj2);
        } else {
            bVar.getClass();
            i.f(eVar, "key");
            if (bVar.f11635b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            bVar.a.remove(eVar);
        }
        n.a(this.f15342v, bVar);
        return p076h8.m.a;
    }
}
