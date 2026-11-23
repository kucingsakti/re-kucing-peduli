package p182s4;

import N9.InterfaceC0341y;
import Q9.e;
import Q9.k;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p200u8.c;

/* JADX INFO: renamed from: s4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0784v extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14718s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f14719t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0784v(D d3, d dVar) {
        super(2, dVar);
        this.f14719t = d3;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        return new C0784v(this.f14719t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((C0784v) create((InterfaceC0341y) obj, (d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.f14718s;
        if (i10 == 0) {
            J7.a.v(obj);
            D d3 = this.f14719t;
            e eVar = d3.f14609d;
            k kVar = new k(d3, 2);
            this.f14718s = 1;
            if (eVar.A(kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
        }
        return m.a;
    }
}
