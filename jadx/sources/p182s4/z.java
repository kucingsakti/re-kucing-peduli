package p182s4;

import Q9.c;
import p070h0.b;
import p076h8.m;
import p134n8.a;
import p144o8.g;
import p200u8.d;

/* JADX INFO: loaded from: classes.dex */
public final class z extends g implements d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ c f14722t;

    @Override // p200u8.d
    public final Object b(Object obj, Object obj2, Object obj3) {
        z zVar = new z(3, (p123m8.d) obj3);
        zVar.f14722t = (c) obj;
        return zVar.invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.f14721s;
        if (i10 == 0) {
            J7.a.v(obj);
            c cVar = this.f14722t;
            b bVar = new b(true);
            this.f14722t = null;
            this.f14721s = 1;
            if (cVar.a(bVar, this) == aVar) {
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
