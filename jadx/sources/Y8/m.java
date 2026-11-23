package Y8;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f5780t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, int i10) {
        super(1);
        this.f5779s = i10;
        this.f5780t = pVar;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f5779s) {
            case 0:
                p096j9.f fVar = (p096j9.f) obj;
                p210v8.i.f(fVar, "it");
                return p.v(this.f5780t, fVar);
            default:
                p096j9.f fVar2 = (p096j9.f) obj;
                p210v8.i.f(fVar2, "it");
                return p.w(this.f5780t, fVar2);
        }
    }
}
