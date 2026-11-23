package G9;

/* JADX INFO: loaded from: classes.dex */
public final class m extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f1772d = new m("must be a member function", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f1773e = new m("must be a member or an extension function", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i10) {
        super(str, 0);
        this.f1774c = i10;
    }

    @Override // G9.e
    public final boolean a(W8.f fVar) {
        switch (this.f1774c) {
            case 0:
                return fVar.f3766B != null;
            default:
                return (fVar.f3766B == null && fVar.f3765A == null) ? false : true;
        }
    }
}
