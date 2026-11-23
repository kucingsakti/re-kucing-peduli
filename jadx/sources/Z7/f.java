package Z7;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class f extends J7.m implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f5872t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g f5873u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f5874v = new AtomicBoolean();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final L7.a f5871s = new L7.a(0);

    public f(e eVar) {
        g gVar;
        g gVar2;
        this.f5872t = eVar;
        if (eVar.f5867u.f2786t) {
            gVar2 = h.f5880f;
        } else {
            do {
                if (eVar.f5866t.isEmpty()) {
                    gVar = new g(eVar.f5870x);
                    eVar.f5867u.a(gVar);
                    break;
                }
                gVar = (g) eVar.f5866t.poll();
            } while (gVar == null);
            gVar2 = gVar;
        }
        this.f5873u = gVar2;
    }

    @Override // J7.m
    public final L7.b a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f5871s.f2786t ? O7.c.f3610s : this.f5873u.c(runnable, j, timeUnit, this.f5871s);
    }

    @Override // L7.b
    public final void f() {
        if (this.f5874v.compareAndSet(false, true)) {
            this.f5871s.f();
            if (h.f5881g) {
                this.f5873u.c(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            e eVar = this.f5872t;
            eVar.getClass();
            long jNanoTime = System.nanoTime() + eVar.f5865s;
            g gVar = this.f5873u;
            gVar.f5875u = jNanoTime;
            eVar.f5866t.offer(gVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f5872t;
        eVar.getClass();
        long jNanoTime = System.nanoTime() + eVar.f5865s;
        g gVar = this.f5873u;
        gVar.f5875u = jNanoTime;
        eVar.f5866t.offer(gVar);
    }
}
