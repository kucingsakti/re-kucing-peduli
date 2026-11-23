package T7;

/* JADX INFO: loaded from: classes.dex */
public final class i extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p045e7.d f4721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p204v1.g f4722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p170r3.e f4723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p170r3.e f4724f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, p045e7.d dVar) {
        super(rVar);
        p204v1.g gVar = P7.a.f3898c;
        p170r3.e eVar = P7.a.f3897b;
        this.f4721c = dVar;
        this.f4722d = gVar;
        this.f4723e = eVar;
        this.f4724f = eVar;
    }

    @Override // J7.c
    public final void b(J7.f fVar) {
        boolean z6 = fVar instanceof Q7.a;
        J7.c cVar = this.f4702b;
        if (z6) {
            cVar.a(new g((Q7.a) fVar, this.f4721c, this.f4722d, this.f4723e, this.f4724f));
        } else {
            cVar.a(new h(fVar, this.f4721c, this.f4722d, this.f4723e, this.f4724f));
        }
    }
}
