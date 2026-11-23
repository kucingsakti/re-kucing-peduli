package p039e0;

import J7.a;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p200u8.b;

/* JADX INFO: renamed from: e0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0607d extends g implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10616s;

    @Override // p144o8.a
    public final d create(d dVar) {
        return new C0607d(1, dVar);
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        C0607d c0607d = (C0607d) create((d) obj);
        m mVar = m.a;
        c0607d.invokeSuspend(mVar);
        return mVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f10616s;
        if (i10 == 0) {
            a.v(obj);
            this.f10616s = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.v(obj);
        return m.a;
    }
}
