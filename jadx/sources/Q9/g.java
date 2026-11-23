package Q9;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p144o8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f4360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f4361t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f4362u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4363v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, p123m8.d dVar) {
        super(dVar);
        this.f4362u = hVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f4361t = obj;
        this.f4363v |= Integer.MIN_VALUE;
        return this.f4362u.a(null, this);
    }
}
