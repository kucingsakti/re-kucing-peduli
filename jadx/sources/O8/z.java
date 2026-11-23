package O8;

import L8.InterfaceC0276j;
import L8.InterfaceC0278l;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0359o implements L8.H {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f3794z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C f3795u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p096j9.c f3796v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p247z9.i f3797w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p247z9.i f3798x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t9.j f3799y;

    static {
        p210v8.v vVar = p210v8.u.a;
        f3794z = new C8.u[]{vVar.f(new p210v8.n(vVar.b(z.class), "fragments", "getFragments()Ljava/util/List;")), vVar.f(new p210v8.n(vVar.b(z.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C c10, p096j9.c cVar, p247z9.l lVar) {
        super(M8.g.a, cVar.g());
        p210v8.i.f(c10, "module");
        p210v8.i.f(cVar, "fqName");
        p210v8.i.f(lVar, "storageManager");
        this.f3795u = c10;
        this.f3796v = cVar;
        this.f3797w = new p247z9.i(lVar, new y(this, 1));
        this.f3798x = new p247z9.i(lVar, new y(this, 0));
        this.f3799y = new t9.j(lVar, new y(this, 2));
    }

    public final boolean equals(Object obj) {
        L8.H h10 = obj instanceof L8.H ? (L8.H) obj : null;
        if (h10 == null) {
            return false;
        }
        z zVar = (z) h10;
        return p210v8.i.a(this.f3796v, zVar.f3796v) && p210v8.i.a(this.f3795u, zVar.f3795u);
    }

    public final int hashCode() {
        return this.f3796v.hashCode() + (this.f3795u.hashCode() * 31);
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.l(this, obj);
    }

    @Override // L8.InterfaceC0276j
    public final InterfaceC0276j v() {
        p096j9.c cVar = this.f3796v;
        if (cVar.d()) {
            return null;
        }
        p096j9.c cVarE = cVar.e();
        p210v8.i.e(cVarE, "fqName.parent()");
        return this.f3795u.K(cVarE);
    }
}
