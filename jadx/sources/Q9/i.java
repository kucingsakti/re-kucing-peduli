package Q9;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p144o8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f4367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f4368t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f4369u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f4370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4371w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, p123m8.d dVar) {
        super(dVar);
        this.f4370v = jVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f4369u = obj;
        this.f4371w |= Integer.MIN_VALUE;
        return this.f4370v.a(null, this);
    }
}
