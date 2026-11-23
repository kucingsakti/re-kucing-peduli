package ya;

/* JADX INFO: renamed from: ya.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0880a implements InterfaceC0890k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0880a f16201t = new C0880a(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0880a f16202u = new C0880a(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0880a f16203v = new C0880a(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0880a f16204w = new C0880a(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0880a f16205x = new C0880a(4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0880a f16206y = new C0880a(5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16207s;

    public /* synthetic */ C0880a(int i10) {
        this.f16207s = i10;
    }

    @Override // ya.InterfaceC0890k
    public final Object j(Object obj) {
        switch (this.f16207s) {
            case 0:
                return obj.toString();
            case 1:
                X9.O o10 = (X9.O) obj;
                try {
                    ma.f fVar = new ma.f();
                    o10.c().D(fVar);
                    return new X9.N(o10.b(), o10.a(), fVar, 0);
                } finally {
                    o10.close();
                }
            case 2:
                return (X9.J) obj;
            case 3:
                return (X9.O) obj;
            case 4:
                ((X9.O) obj).close();
                return p076h8.m.a;
            default:
                ((X9.O) obj).close();
                return null;
        }
    }
}
