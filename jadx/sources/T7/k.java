package T7;

import M2.J;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k extends J7.o {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4730b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.f4730b = obj;
    }

    @Override // J7.o
    public final void c(J7.p pVar) {
        switch (this.a) {
            case 0:
                ((J7.c) this.f4730b).a(new j(pVar, 1));
                break;
            case 1:
                ((J7.j) this.f4730b).U(new W7.a(pVar, 1));
                break;
            case 2:
                try {
                    th = (Throwable) ((J) this.f4730b).f2913t;
                    P7.a.a(th, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
                } catch (Throwable th) {
                    th = th;
                    p068ga.l.n(th);
                }
                pVar.b(O7.c.f3610s);
                pVar.onError(th);
                break;
            case 3:
                pVar.b(O7.c.f3610s);
                pVar.c(this.f4730b);
                break;
            default:
                S7.b bVar = new S7.b(pVar);
                pVar.b(bVar);
                O7.b.i(bVar, ((J7.n) this.f4730b).c(bVar, 2L, TimeUnit.SECONDS));
                break;
        }
    }

    public k(J7.n nVar) {
        this.a = 4;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f4730b = nVar;
    }
}
