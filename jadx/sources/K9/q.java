package K9;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f2700t = new q(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q f2701u = new q(1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f2702v = new q(1, 2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2703s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10, int i11) {
        super(i10);
        this.f2703s = i11;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f2703s) {
            case 0:
                l lVar = (l) obj;
                p210v8.i.f(lVar, "it");
                return lVar.iterator();
            case 1:
                return obj;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
