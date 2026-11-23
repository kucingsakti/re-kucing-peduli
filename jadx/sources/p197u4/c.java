package p197u4;

import J7.a;
import p076h8.m;
import p123m8.d;
import p144o8.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15312s;

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        c cVar = new c(2, dVar);
        cVar.f15312s = obj;
        return cVar;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((String) obj, (d) obj2);
        m mVar = m.a;
        cVar.invokeSuspend(mVar);
        return mVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a.v(obj);
        return m.a;
    }
}
