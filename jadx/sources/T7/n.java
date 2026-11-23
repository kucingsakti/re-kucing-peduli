package T7;

/* JADX INFO: loaded from: classes.dex */
public final class n extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N7.d f4733c;

    public n(J7.c cVar, N7.d dVar) {
        super(cVar);
        this.f4733c = dVar;
    }

    @Override // J7.c
    public final void b(J7.f fVar) {
        boolean z6 = fVar instanceof Q7.a;
        N7.d dVar = this.f4733c;
        J7.c cVar = this.f4702b;
        if (z6) {
            cVar.a(new l((Q7.a) fVar, dVar));
        } else {
            cVar.a(new m(fVar, dVar));
        }
    }
}
