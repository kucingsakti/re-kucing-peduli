package p039e0;

import N9.InterfaceC0341y;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
public final class A extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f10591t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f10592u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A(c cVar, Object obj, d dVar) {
        super(2, dVar);
        this.f10591t = (g) cVar;
        this.f10592u = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o8.g, u8.c] */
    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        return new A(this.f10591t, this.f10592u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((InterfaceC0341y) obj, (d) obj2)).invokeSuspend(m.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [o8.g, u8.c] */
    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.f10590s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        J7.a.v(obj);
        this.f10590s = 1;
        Object objInvoke = this.f10591t.invoke(this.f10592u, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
