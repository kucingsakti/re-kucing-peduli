package T7;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Q7.a f4746E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f4747F;

    public p(Q7.a aVar, J7.m mVar, int i10) {
        super(mVar, i10);
        this.f4746E = aVar;
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
                    this.f4746E.c(this);
                    return;
                }
                if (iG == 2) {
                    this.f4735B = 2;
                    this.f4743x = cVar;
                    this.f4746E.c(this);
                    aVar.f(this.f4739t);
                    return;
                }
            }
            this.f4743x = new Y7.a(this.f4739t);
            this.f4746E.c(this);
            aVar.f(this.f4739t);
        }
    }

    @Override // T7.o
    public final void k() {
        Q7.a aVar = this.f4746E;
        Q7.d dVar = this.f4743x;
        long j = this.f4736C;
        long j10 = this.f4747F;
        int iAddAndGet = 1;
        while (true) {
            long j11 = this.f4741v.get();
            while (j != j11) {
                boolean z6 = this.f4745z;
                try {
                    Object objPoll = dVar.poll();
                    boolean z10 = objPoll == null;
                    if (e(z6, z10, aVar)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    if (aVar.b(objPoll)) {
                        j++;
                    }
                    j10++;
                    if (j10 == this.f4740u) {
                        this.f4742w.f(j10);
                        j10 = 0;
                    }
                } catch (Throwable th) {
                    p068ga.l.n(th);
                    this.f4744y = true;
                    this.f4742w.cancel();
                    dVar.clear();
                    aVar.onError(th);
                    this.f4738s.f();
                    return;
                }
            }
            if (j == j11 && e(this.f4745z, dVar.isEmpty(), aVar)) {
                return;
            }
            int i10 = get();
            if (iAddAndGet == i10) {
                this.f4736C = j;
                this.f4747F = j10;
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
            this.f4746E.d(null);
            if (z6) {
                this.f4744y = true;
                Throwable th = this.f4734A;
                if (th != null) {
                    this.f4746E.onError(th);
                } else {
                    this.f4746E.a();
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
        Q7.a aVar = this.f4746E;
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
                        aVar.a();
                        this.f4738s.f();
                        return;
                    } else if (aVar.b(objPoll)) {
                        j++;
                    }
                } catch (Throwable th) {
                    p068ga.l.n(th);
                    this.f4744y = true;
                    this.f4742w.cancel();
                    aVar.onError(th);
                    this.f4738s.f();
                    return;
                }
            }
            if (this.f4744y) {
                return;
            }
            if (dVar.isEmpty()) {
                this.f4744y = true;
                aVar.a();
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
            long j = this.f4747F + 1;
            if (j == this.f4740u) {
                this.f4747F = 0L;
                this.f4742w.f(j);
                return objPoll;
            }
            this.f4747F = j;
        }
        return objPoll;
    }
}
