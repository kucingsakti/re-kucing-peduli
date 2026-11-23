package ya;

/* JADX INFO: renamed from: ya.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0897s extends X9.O {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final X9.A f16226t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f16227u;

    public C0897s(X9.A a, long j) {
        this.f16226t = a;
        this.f16227u = j;
    }

    @Override // X9.O
    public final long a() {
        return this.f16227u;
    }

    @Override // X9.O
    public final X9.A b() {
        return this.f16226t;
    }

    @Override // X9.O
    public final ma.h c() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
