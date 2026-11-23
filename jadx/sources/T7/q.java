package T7;

/* JADX INFO: loaded from: classes.dex */
public final class q extends o {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final J7.f f4748E;

    public q(J7.f fVar, J7.m mVar, int i10) {
        super(mVar, i10);
        this.f4748E = fVar;
    }

    @Override // J7.f
    public final void c(ua.a aVar) {
        if (p018b8.a.h(this.f4742w, aVar)) {
            this.f4742w = aVar;
            if (aVar instanceof Q7.c) {
                Q7.c cVar = (Q7.c) aVar;
                int iG = cVar.g();
                if (iG == 1) {
                    this.f4735B = 1;
                    this.f4743x = cVar;
                    this.f4745z = true;
                    this.f4748E.c(this);
                    return;
                }
                if (iG == 2) {
                    this.f4735B = 2;
                    this.f4743x = cVar;
                    this.f4748E.c(this);
                    aVar.f(this.f4739t);
                    return;
                }
            }
            this.f4743x = new Y7.a(this.f4739t);
            this.f4748E.c(this);
            aVar.f(this.f4739t);
        }
    }

    @Override // T7.o
    public final void k() {
        J7.f fVar = this.f4748E;
        Q7.d dVar = this.f4743x;
        long j = this.f4736C;
        int iAddAndGet = 1;
        while (true) {
            long jAddAndGet = this.f4741v.get();
            while (j != jAddAndGet) {
                boolean z6 = this.f4745z;
                try {
                    Object objPoll = dVar.poll();
                    boolean z10 = objPoll == null;
                    if (e(z6, z10, fVar)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    fVar.d(objPoll);
                    j++;
                    if (j == this.f4740u) {
                        if (jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f4741v.addAndGet(-j);
                        }
                        this.f4742w.f(j);
                        j = 0;
                    }
                } catch (Throwable th) {
                    p068ga.l.n(th);
                    this.f4744y = true;
                    this.f4742w.cancel();
                    dVar.clear();
                    fVar.onError(th);
                    this.f4738s.f();
                    return;
                }
            }
            if (j == jAddAndGet && e(this.f4745z, dVar.isEmpty(), fVar)) {
                return;
            }
            int i10 = get();
            if (iAddAndGet == i10) {
                this.f4736C = j;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i10;
            }
        }
    }

    @Override // T7.o
    public final void m() {
        int iAddAndGet = 1;
        while (!this.f4744y) {
            boolean z6 = this.f4745z;
            this.f4748E.d(null);
            if (z6) {
                this.f4744y = true;
                Throwable th = this.f4734A;
                if (th != null) {
                    this.f4748E.onError(th);
                } else {
                    this.f4748E.a();
                }
                this.f4738s.f();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // T7.o
    public final void n() {
        J7.f fVar = this.f4748E;
        Q7.d dVar = this.f4743x;
        long j = this.f4736C;
        int iAddAndGet = 1;
        while (true) {
            long j10 = this.f4741v.get();
            while (j != j10) {
                try {
                    Object objPoll = dVar.poll();
                    if (this.f4744y) {
                        return;
                    }
                    if (objPoll == null) {
                        this.f4744y = true;
                        fVar.a();
                        this.f4738s.f();
                        return;
                    }
                    fVar.d(objPoll);
                    j++;
                } catch (Throwable th) {
                    p068ga.l.n(th);
                    this.f4744y = true;
                    this.f4742w.cancel();
                    fVar.onError(th);
                    this.f4738s.f();
                    return;
                }
            }
            if (this.f4744y) {
                return;
            }
            if (dVar.isEmpty()) {
                this.f4744y = true;
                fVar.a();
                this.f4738s.f();
                return;
            } else {
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f4736C = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }
    }

    @Override // Q7.d
    public final Object poll() {
        Object objPoll = this.f4743x.poll();
        if (objPoll != null && this.f4735B != 1) {
            long j = this.f4736C + 1;
            if (j == this.f4740u) {
                this.f4736C = 0L;
                this.f4742w.f(j);
                return objPoll;
            }
            this.f4736C = j;
        }
        return objPoll;
    }
}
