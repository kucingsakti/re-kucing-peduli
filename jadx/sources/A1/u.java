package A1;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Q1.f f178t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f179u;

    public /* synthetic */ u(x xVar, Q1.f fVar, int i10) {
        this.f177s = i10;
        this.f179u = xVar;
        this.f178t = fVar;
    }

    private final void a() {
        Q1.f fVar = this.f178t;
        fVar.a.a();
        synchronized (fVar.f3961b) {
            synchronized (this.f179u) {
                try {
                    w wVar = this.f179u.f197s;
                    Q1.f fVar2 = this.f178t;
                    wVar.getClass();
                    if (wVar.f181s.contains(new v(fVar2, U1.f.f4873b))) {
                        x xVar = this.f179u;
                        Q1.f fVar3 = this.f178t;
                        xVar.getClass();
                        try {
                            fVar3.e(xVar.f191I, 5);
                        } catch (Throwable th) {
                            throw new C0096e(th);
                        }
                    }
                    this.f179u.c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f177s) {
            case 0:
                a();
                return;
            default:
                Q1.f fVar = this.f178t;
                fVar.a.a();
                synchronized (fVar.f3961b) {
                    synchronized (this.f179u) {
                        try {
                            w wVar = this.f179u.f197s;
                            Q1.f fVar2 = this.f178t;
                            wVar.getClass();
                            if (wVar.f181s.contains(new v(fVar2, U1.f.f4873b))) {
                                this.f179u.f193K.d();
                                x xVar = this.f179u;
                                Q1.f fVar3 = this.f178t;
                                xVar.getClass();
                                try {
                                    fVar3.f(xVar.f193K, xVar.f189G, xVar.f196N);
                                    this.f179u.j(this.f178t);
                                } catch (Throwable th) {
                                    throw new C0096e(th);
                                }
                            }
                            this.f179u.c();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
        }
    }
}
