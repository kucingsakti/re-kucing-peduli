package p070h0;

import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f11637t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f11638u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p200u8.c cVar, d dVar) {
        super(2, dVar);
        this.f11638u = (g) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o8.g, u8.c] */
    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        c cVar = new c(this.f11638u, dVar);
        cVar.f11637t = obj;
        return cVar;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (d) obj2)).invokeSuspend(m.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o8.g, u8.c] */
    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.f11636s;
        if (i10 == 0) {
            J7.a.v(obj);
            b bVar = (b) this.f11637t;
            this.f11636s = 1;
            obj = this.f11638u.invoke(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
        }
        b bVar2 = (b) obj;
        bVar2.f11635b.set(true);
        return bVar2;
    }
}
