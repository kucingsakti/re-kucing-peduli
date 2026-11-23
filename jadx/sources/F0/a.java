package F0;

import N9.InterfaceC0341y;
import p076h8.m;
import p144o8.g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1460s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f1461t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, p123m8.d dVar2) {
        super(2, dVar2);
        this.f1461t = dVar;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new a(this.f1461t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1460s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        G0.c cVar = this.f1461t.a;
        this.f1460s = 1;
        Object objB = cVar.b(this);
        return objB == aVar ? aVar : objB;
    }
}
