package Q9;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p144o8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public R9.g f4345s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f4346t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p040e1.j f4347u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4348v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p040e1.j jVar, p144o8.c cVar) {
        super(cVar);
        this.f4347u = jVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f4346t = obj;
        this.f4348v |= Integer.MIN_VALUE;
        return this.f4347u.A(null, this);
    }
}
