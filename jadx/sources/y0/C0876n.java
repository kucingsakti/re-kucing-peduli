package y0;

/* JADX INFO: renamed from: y0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0876n extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15950s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B f15951t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0876n(B b3, int i10) {
        super(1);
        this.f15950s = i10;
        this.f15951t = b3;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f15950s) {
            case 0:
                x xVar = (x) obj;
                p210v8.i.f(xVar, "destination");
                return Boolean.valueOf(!this.f15951t.f15843l.containsKey(Integer.valueOf(xVar.f16002z)));
            default:
                x xVar2 = (x) obj;
                p210v8.i.f(xVar2, "destination");
                return Boolean.valueOf(!this.f15951t.f15843l.containsKey(Integer.valueOf(xVar2.f16002z)));
        }
    }
}
