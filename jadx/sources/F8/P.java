package F8;

/* JADX INFO: loaded from: classes.dex */
public final class P extends B {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f1534g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f1535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f1536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s0 f1537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s0 f1538f;

    static {
        p210v8.v vVar = p210v8.u.a;
        f1534g = new C8.u[]{vVar.f(new p210v8.n(vVar.b(P.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), vVar.f(new p210v8.n(vVar.b(P.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), vVar.f(new p210v8.n(vVar.b(P.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), vVar.f(new p210v8.n(vVar.b(P.class), "metadata", "getMetadata()Lkotlin/Triple;")), vVar.f(new p210v8.n(vVar.b(P.class), "members", "getMembers()Ljava/util/Collection;"))};
    }

    public P(S s9) {
        super(s9);
        this.f1535c = t0.j(null, new M(s9, 0));
        this.f1536d = t0.j(null, new O(this, 1));
        this.f1537e = new s0(new N(this, s9));
        this.f1538f = new s0(new O(this, 0));
        t0.j(null, new N(s9, this));
    }
}
