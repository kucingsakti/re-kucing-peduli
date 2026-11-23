package Z7;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a extends J7.m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final L7.a f5854s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final L7.a f5855t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final L7.a f5856u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f5857v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f5858w;

    public a(c cVar) {
        this.f5857v = cVar;
        L7.a aVar = new L7.a(1);
        this.f5854s = aVar;
        L7.a aVar2 = new L7.a(0);
        this.f5855t = aVar2;
        L7.a aVar3 = new L7.a(1);
        this.f5856u = aVar3;
        aVar3.a(aVar);
        aVar3.a(aVar2);
    }

    @Override // J7.m
    public final L7.b a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f5858w ? O7.c.f3610s : this.f5857v.c(runnable, j, timeUnit, this.f5855t);
    }

    @Override // J7.m
    public final void b(T7.o oVar) {
        if (this.f5858w) {
            return;
        }
        this.f5857v.c(oVar, 0L, TimeUnit.MILLISECONDS, this.f5854s);
    }

    @Override // L7.b
    public final void f() {
        if (this.f5858w) {
            return;
        }
        this.f5858w = true;
        this.f5856u.f();
    }
}
