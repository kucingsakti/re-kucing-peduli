package T7;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p008a8.b implements Q7.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final N7.d f4732w;

    public m(J7.f fVar, N7.d dVar) {
        super(fVar);
        this.f4732w = dVar;
    }

    @Override // Q7.a
    public final boolean b(Object obj) {
        if (this.f6014v) {
            return false;
        }
        J7.f fVar = this.f6011s;
        try {
            boolean zA = this.f4732w.a(obj);
            if (zA) {
                fVar.d(obj);
            }
            return zA;
        } catch (Throwable th) {
            p068ga.l.n(th);
            this.f6012t.cancel();
            onError(th);
            return true;
        }
    }

    @Override // J7.f
    public final void d(Object obj) {
        if (b(obj)) {
            return;
        }
        this.f6012t.f(1L);
    }

    @Override // Q7.d
    public final Object poll() {
        Object objPoll;
        Q7.c cVar = this.f6013u;
        do {
            objPoll = cVar.poll();
            if (objPoll == null) {
                return null;
            }
        } while (!this.f4732w.a(objPoll));
        return objPoll;
    }
}
