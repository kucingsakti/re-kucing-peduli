package L8;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p096j9.c f2795t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(p096j9.c cVar, int i10) {
        super(1);
        this.f2794s = i10;
        this.f2795t = cVar;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f2794s) {
            case 0:
                p096j9.c cVar = (p096j9.c) obj;
                p210v8.i.f(cVar, "it");
                return Boolean.valueOf(!cVar.d() && p210v8.i.a(cVar.e(), this.f2795t));
            default:
                M8.h hVar = (M8.h) obj;
                p210v8.i.f(hVar, "it");
                return hVar.H(this.f2795t);
        }
    }
}
