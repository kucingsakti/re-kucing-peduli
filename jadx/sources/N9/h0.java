package N9;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends f0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k0 f3455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i0 f3456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0328k f3457y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f3458z;

    public h0(k0 k0Var, i0 i0Var, C0328k c0328k, Object obj) {
        this.f3455w = k0Var;
        this.f3456x = i0Var;
        this.f3457y = c0328k;
        this.f3458z = obj;
    }

    @Override // p200u8.b
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return p076h8.m.a;
    }

    @Override // N9.f0
    public final void n(Throwable th) {
        C0328k c0328k = this.f3457y;
        k0 k0Var = this.f3455w;
        k0Var.getClass();
        C0328k c0328kI = k0.I(c0328k);
        i0 i0Var = this.f3456x;
        Object obj = this.f3458z;
        if (c0328kI != null) {
            while (c0328kI.f3468w.C((2 & 1) == 0, (2 & 2) != 0, new h0(k0Var, i0Var, c0328kI, obj)) == m0.f3471s) {
                c0328kI = k0.I(c0328kI);
                if (c0328kI == null) {
                }
            }
            return;
        }
        k0Var.d(k0Var.s(i0Var, obj));
    }
}
