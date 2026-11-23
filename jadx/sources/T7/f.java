package T7;

/* JADX INFO: loaded from: classes.dex */
public final class f extends J7.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4712c;

    public /* synthetic */ f(Object obj, int i10) {
        this.f4711b = i10;
        this.f4712c = obj;
    }

    @Override // J7.c
    public final void b(J7.f fVar) {
        b eVar;
        switch (this.f4711b) {
            case 0:
                int iD = p239z.e.d(5);
                if (iD == 0) {
                    eVar = new e(fVar);
                } else if (iD == 1) {
                    eVar = new d(fVar, 1);
                } else if (iD != 3) {
                    eVar = iD != 4 ? new c(fVar, J7.c.a) : new c(fVar);
                } else {
                    eVar = new d(fVar, 0);
                }
                fVar.c(eVar);
                try {
                    ((J7.e) this.f4712c).c(eVar);
                } catch (Throwable th) {
                    p068ga.l.n(th);
                    eVar.c(th);
                    return;
                }
                break;
            case 1:
                ((J7.j) this.f4712c).U(new o1.c(fVar));
                break;
            default:
                ((n) this.f4712c).a(new V7.b(fVar));
                break;
        }
    }
}
