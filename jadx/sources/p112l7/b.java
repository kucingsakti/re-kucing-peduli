package p112l7;

import J4.c;
import O3.C0343a;
import java.util.Iterator;
import p076h8.m;
import p200u8.a;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0343a f12938t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f12939u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(C0343a c0343a, c cVar, int i10) {
        super(0);
        this.f12937s = i10;
        this.f12938t = c0343a;
        this.f12939u = cVar;
    }

    private final Object a() {
        a aVar = (a) this.f12938t.f3514f;
        c cVar = this.f12939u;
        aVar.getClass();
        synchronized (aVar.f12930t) {
            aVar.f12930t.add(cVar);
        }
        aVar.f12936z.a(aVar.f12929s, cVar);
        aVar.f12935y.a("Added listener " + cVar);
        return m.a;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f12937s) {
            case 0:
                return a();
            default:
                a aVar = (a) this.f12938t.f3514f;
                c cVar = this.f12939u;
                aVar.getClass();
                synchronized (aVar.f12930t) {
                    try {
                        Iterator it = aVar.f12930t.iterator();
                        while (it.hasNext()) {
                            if (i.a((c) it.next(), cVar)) {
                                it.remove();
                                aVar.f12935y.a("Removed listener " + cVar);
                                aVar.f12936z.h(aVar.f12929s, cVar);
                            }
                        }
                        aVar.f12936z.h(aVar.f12929s, cVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return m.a;
        }
    }
}
