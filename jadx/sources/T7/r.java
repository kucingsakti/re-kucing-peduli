package T7;

/* JADX INFO: loaded from: classes.dex */
public final class r extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K7.e f4749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4750d;

    public r(f fVar, K7.e eVar, int i10) {
        super(fVar);
        this.f4749c = eVar;
        this.f4750d = i10;
    }

    @Override // J7.c
    public final void b(J7.f fVar) {
        J7.m mVarA = this.f4749c.a();
        boolean z6 = fVar instanceof Q7.a;
        int i10 = this.f4750d;
        J7.c cVar = this.f4702b;
        if (z6) {
            cVar.a(new p((Q7.a) fVar, mVarA, i10));
        } else {
            cVar.a(new q(fVar, mVarA, i10));
        }
    }
}
