package N9;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends C0324g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0330m f3453A;

    public g0(p123m8.d dVar, C0330m c0330m) {
        super(1, dVar);
        this.f3453A = c0330m;
    }

    @Override // N9.C0324g
    public final String C() {
        return "AwaitContinuation";
    }

    @Override // N9.C0324g
    public final Throwable u(k0 k0Var) {
        Throwable thD;
        Object objY = this.f3453A.y();
        if (!(objY instanceof i0) || (thD = ((i0) objY).d()) == null) {
            return objY instanceof C0333p ? ((C0333p) objY).a : k0Var.t();
        }
        return thD;
    }
}
