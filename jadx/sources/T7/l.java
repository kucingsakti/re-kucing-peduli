package T7;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p008a8.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final N7.d f4731w;

    public l(Q7.a aVar, N7.d dVar) {
        super(aVar);
        this.f4731w = dVar;
    }

    @Override // Q7.a
    public final boolean b(Object obj) {
        if (this.f6010v) {
            return false;
        }
        try {
            return this.f4731w.a(obj) && this.f6007s.b(obj);
        } catch (Throwable th) {
            p068ga.l.n(th);
            this.f6008t.cancel();
            onError(th);
            return true;
        }
    }

    @Override // J7.f
    public final void d(Object obj) {
        if (b(obj)) {
            return;
        }
        this.f6008t.f(1L);
    }

    @Override // Q7.d
    public final Object poll() {
        Object objPoll;
        Q7.c cVar = this.f6009u;
        do {
            objPoll = cVar.poll();
            if (objPoll == null) {
                return null;
            }
        } while (!this.f4731w.a(objPoll));
        return objPoll;
    }
}
