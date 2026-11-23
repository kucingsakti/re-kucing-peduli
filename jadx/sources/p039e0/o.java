package p039e0;

import J7.a;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
public final class o extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f10634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f10635t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(D d3, d dVar) {
        super(2, dVar);
        this.f10635t = d3;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        o oVar = new o(this.f10635t, dVar);
        oVar.f10634s = obj;
        return oVar;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((D) obj, (d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a.v(obj);
        D d3 = (D) this.f10634s;
        D d8 = this.f10635t;
        boolean z6 = false;
        if (!(d8 instanceof C0604a) && !(d8 instanceof g) && d3 == d8) {
            z6 = true;
        }
        return Boolean.valueOf(z6);
    }
}
