package O8;

/* JADX INFO: renamed from: O8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0361q implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0362s f3731t;

    public /* synthetic */ C0361q(C0362s c0362s, int i10) {
        this.f3730s = i10;
        this.f3731t = c0362s;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f3730s) {
            case 0:
                p096j9.f fVar = (p096j9.f) obj;
                C0362s c0362s = this.f3731t;
                if (fVar != null) {
                    return c0362s.j(fVar, c0362s.i().c(fVar, T8.b.f4764x));
                }
                c0362s.getClass();
                C0362s.h(8);
                throw null;
            default:
                p096j9.f fVar2 = (p096j9.f) obj;
                C0362s c0362s2 = this.f3731t;
                if (fVar2 != null) {
                    return c0362s2.j(fVar2, c0362s2.i().b(fVar2, T8.b.f4764x));
                }
                c0362s2.getClass();
                C0362s.h(4);
                throw null;
        }
    }
}
