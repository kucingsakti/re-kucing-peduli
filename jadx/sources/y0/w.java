package y0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f15992t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(t tVar, int i10) {
        super(1);
        this.f15991s = i10;
        this.f15992t = tVar;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f15991s) {
            case 0:
                String str = (String) obj;
                p210v8.i.f(str, "key");
                return Boolean.valueOf(!this.f15992t.b().contains(str));
            default:
                String str2 = (String) obj;
                p210v8.i.f(str2, "key");
                return Boolean.valueOf(!this.f15992t.b().contains(str2));
        }
    }
}
