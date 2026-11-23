package G9;

/* JADX INFO: loaded from: classes.dex */
public final class z extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f1806d = new z("must have no value parameters", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f1807e = new z("must have a single value parameter", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(String str, int i10) {
        super(str, 1);
        this.f1808c = i10;
    }

    @Override // G9.e
    public final boolean a(W8.f fVar) {
        switch (this.f1808c) {
            case 0:
                return fVar.H0().isEmpty();
            default:
                return fVar.H0().size() == 1;
        }
    }
}
