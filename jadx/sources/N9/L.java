package N9;

/* JADX INFO: loaded from: classes.dex */
public final class L extends f0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f3418x;

    public /* synthetic */ L(Object obj, int i10) {
        this.f3417w = i10;
        this.f3418x = obj;
    }

    @Override // p200u8.b
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f3417w) {
            case 0:
                n((Throwable) obj);
                break;
            case 1:
                n((Throwable) obj);
                break;
            case 2:
                n((Throwable) obj);
                break;
            default:
                n((Throwable) obj);
                break;
        }
        return p076h8.m.a;
    }

    @Override // N9.f0
    public final void n(Throwable th) {
        switch (this.f3417w) {
            case 0:
                ((K) this.f3418x).f();
                break;
            case 1:
                ((p200u8.b) this.f3418x).invoke(th);
                break;
            case 2:
                Object objY = m().y();
                boolean z6 = objY instanceof C0333p;
                g0 g0Var = (g0) this.f3418x;
                if (!z6) {
                    g0Var.resumeWith(AbstractC0342z.u(objY));
                } else {
                    g0Var.resumeWith(J7.a.d(((C0333p) objY).a));
                }
                break;
            default:
                ((C0324g) this.f3418x).resumeWith(p076h8.m.a);
                break;
        }
    }
}
