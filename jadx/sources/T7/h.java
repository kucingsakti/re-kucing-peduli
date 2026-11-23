package T7;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p008a8.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p045e7.d f4717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p204v1.g f4718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p170r3.e f4719y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p170r3.e f4720z;

    public h(J7.f fVar, p045e7.d dVar, p204v1.g gVar, p170r3.e eVar, p170r3.e eVar2) {
        super(fVar);
        this.f4717w = dVar;
        this.f4718x = gVar;
        this.f4719y = eVar;
        this.f4720z = eVar2;
    }

    @Override // p008a8.b, J7.f
    public final void a() {
        if (this.f6014v) {
            return;
        }
        try {
            this.f4719y.getClass();
            this.f6014v = true;
            this.f6011s.a();
            try {
                this.f4720z.getClass();
            } catch (Throwable th) {
                p068ga.l.n(th);
                J7.j.y(th);
            }
        } catch (Throwable th2) {
            p068ga.l.n(th2);
            this.f6012t.cancel();
            onError(th2);
        }
    }

    @Override // J7.f
    public final void d(Object obj) {
        if (this.f6014v) {
            return;
        }
        J7.f fVar = this.f6011s;
        try {
            this.f4717w.accept(obj);
            fVar.d(obj);
        } catch (Throwable th) {
            p068ga.l.n(th);
            this.f6012t.cancel();
            onError(th);
        }
    }

    @Override // p008a8.b, Q7.b
    public final int g() {
        return 0;
    }

    @Override // p008a8.b, J7.f
    public final void onError(Throwable th) {
        J7.f fVar = this.f6011s;
        if (this.f6014v) {
            J7.j.y(th);
            return;
        }
        this.f6014v = true;
        try {
            this.f4718x.getClass();
            fVar.onError(th);
        } catch (Throwable th2) {
            p068ga.l.n(th2);
            fVar.onError(new CompositeException(th, th2));
        }
        try {
            this.f4720z.getClass();
        } catch (Throwable th3) {
            p068ga.l.n(th3);
            J7.j.y(th3);
        }
    }

    @Override // Q7.d
    public final Object poll() throws Exception {
        p204v1.g gVar = this.f4718x;
        try {
            Object objPoll = this.f6013u.poll();
            p170r3.e eVar = this.f4720z;
            if (objPoll == null) {
                return objPoll;
            }
            try {
                this.f4717w.accept(objPoll);
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
