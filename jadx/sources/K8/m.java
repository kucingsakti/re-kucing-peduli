package K8;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p096j9.f f2659t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p096j9.f fVar, int i10) {
        super(1);
        this.f2658s = i10;
        this.f2659t = fVar;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f2658s) {
            case 0:
                t9.n nVar = (t9.n) obj;
                p210v8.i.f(nVar, "it");
                return nVar.c(this.f2659t, T8.b.f4759s);
            default:
                t9.n nVar2 = (t9.n) obj;
                p210v8.i.f(nVar2, "it");
                return nVar2.b(this.f2659t, T8.b.f4763w);
        }
    }
}
