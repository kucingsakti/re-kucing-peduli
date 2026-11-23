package p182s4;

import J7.a;
import p070h0.b;
import p070h0.e;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class B extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f14601t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(String str, d dVar) {
        super(2, dVar);
        this.f14601t = str;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        B b3 = new B(this.f14601t, dVar);
        b3.f14600s = obj;
        return b3;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        B b3 = (B) create((b) obj, (d) obj2);
        m mVar = m.a;
        b3.invokeSuspend(mVar);
        return mVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a.v(obj);
        b bVar = (b) this.f14600s;
        bVar.getClass();
        e eVar = y.a;
        i.f(eVar, "key");
        bVar.b(eVar, this.f14601t);
        return m.a;
    }
}
