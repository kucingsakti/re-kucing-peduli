package t9;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f15261t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i10) {
        super(0);
        this.f15260s = i10;
        this.f15261t = rVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        r rVar = this.f15261t;
        switch (this.f15260s) {
            case 0:
                return p086i8.l.C(p124m9.m.i(rVar.f15263b), p124m9.m.j(rVar.f15263b));
            default:
                return p086i8.l.D(p124m9.m.h(rVar.f15263b));
        }
    }
}
