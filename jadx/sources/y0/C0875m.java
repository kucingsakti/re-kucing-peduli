package y0;

/* JADX INFO: renamed from: y0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0875m extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p210v8.q f15945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p210v8.q f15946t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B f15947u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f15948v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p086i8.h f15949w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0875m(p210v8.q qVar, p210v8.q qVar2, B b3, boolean z6, p086i8.h hVar) {
        super(1);
        this.f15945s = qVar;
        this.f15946t = qVar2;
        this.f15947u = b3;
        this.f15948v = z6;
        this.f15949w = hVar;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        C0872j c0872j = (C0872j) obj;
        p210v8.i.f(c0872j, "entry");
        this.f15945s.f15463s = true;
        this.f15946t.f15463s = true;
        this.f15947u.p(c0872j, this.f15948v, this.f15949w);
        return p076h8.m.a;
    }
}
