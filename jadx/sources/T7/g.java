package T7;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p008a8.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p045e7.d f4713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p204v1.g f4714x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p170r3.e f4715y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p170r3.e f4716z;

    public g(Q7.a aVar, p045e7.d dVar, p204v1.g gVar, p170r3.e eVar, p170r3.e eVar2) {
        super(aVar);
        this.f4713w = dVar;
        this.f4714x = gVar;
        this.f4715y = eVar;
        this.f4716z = eVar2;
    }

    @Override // p008a8.a, J7.f
    public final void a() {
        if (this.f6010v) {
            return;
        }
        try {
            this.f4715y.getClass();
            this.f6010v = true;
            this.f6007s.a();
            try {
                this.f4716z.getClass();
            } catch (Throwable th) {
                p068ga.l.n(th);
                J7.j.y(th);
            }
        } catch (Throwable th2) {
            p068ga.l.n(th2);
            this.f6008t.cancel();
            onError(th2);
        }
    }

    @Override // Q7.a
    public final boolean b(Object obj) {
        if (this.f6010v) {
            return false;
        }
        try {
            this.f4713w.accept(obj);
            return this.f6007s.b(obj);
        } catch (Throwable th) {
            p068ga.l.n(th);
            this.f6008t.cancel();
            onError(th);
            return false;
        }
    }

    @Override // J7.f
    public final void d(Object obj) {
        if (this.f6010v) {
            return;
        }
        Q7.a aVar = this.f6007s;
        try {
            this.f4713w.accept(obj);
            aVar.d(obj);
        } catch (Throwable th) {
            p068ga.l.n(th);
            this.f6008t.cancel();
            onError(th);
        }
    }

    @Override // p008a8.a, Q7.b
    public final int g() {
        return 0;
    }

    @Override // p008a8.a, J7.f
    public final void onError(Throwable th) {
        Q7.a aVar = this.f6007s;
        if (this.f6010v) {
            J7.j.y(th);
            return;
        }
        this.f6010v = true;
        try {
            this.f4714x.getClass();
            aVar.onError(th);
        } catch (Throwable th2) {
            p068ga.l.n(th2);
            aVar.onError(new CompositeException(th, th2));
        }
        try {
            this.f4716z.getClass();
        } catch (Throwable th3) {
            p068ga.l.n(th3);
            J7.j.y(th3);
        }
    }

    @Override // Q7.d
    public final Object poll() throws Exception {
        p204v1.g gVar = this.f4714x;
        try {
            Object objPoll = this.f6009u.poll();
            p170r3.e eVar = this.f4716z;
            if (objPoll == null) {
                return objPoll;
            }
            try {
                this.f4713w.accept(objPoll);
                eVar.getClass();
                return objPoll;
            } catch (Throwable th) {
                try {
                    p068ga.l.n(th);
                    try {
                        gVar.getClass();
                        p028c8.b bVar = p028c8.c.a;
                        if (th instanceof Exception) {
                            throw th;
                        }
                        throw th;
                    } catch (Throwable th2) {
                        throw new CompositeException(th, th2);
                    }
                } catch (Throwable th3) {
                    eVar.getClass();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            p068ga.l.n(th4);
            try {
                gVar.getClass();
                p028c8.b bVar2 = p028c8.c.a;
                if (th4 instanceof Exception) {
                    throw th4;
                }
                throw th4;
            } catch (Throwable th5) {
                throw new CompositeException(th4, th5);
            }
        }
    }
}
