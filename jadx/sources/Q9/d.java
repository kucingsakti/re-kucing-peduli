package Q9;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p144o8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4350t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f4351u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f4352v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f4353w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, p144o8.c cVar) {
        super(cVar);
        this.f4351u = eVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f4349s = obj;
        this.f4350t |= Integer.MIN_VALUE;
        return this.f4351u.A(null, this);
    }
}
