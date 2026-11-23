package L4;

import N9.InterfaceC0341y;
import p076h8.m;
import p144o8.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f2781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2782t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, int i10, p123m8.d dVar) {
        super(2, dVar);
        this.f2781s = aVar;
        this.f2782t = i10;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new b(this.f2781s, this.f2782t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) create((InterfaceC0341y) obj, (p123m8.d) obj2);
        m mVar = m.a;
        bVar.invokeSuspend(mVar);
        return mVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        J7.a.v(obj);
        this.f2781s.g(this.f2782t);
        return m.a;
    }
}
