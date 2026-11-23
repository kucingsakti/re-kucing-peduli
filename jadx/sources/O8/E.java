package O8;

import L8.InterfaceC0276j;
import L8.InterfaceC0278l;
import L8.InterfaceC0290y;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends AbstractC0360p implements L8.D {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p096j9.c f3634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f3635x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(InterfaceC0290y interfaceC0290y, p096j9.c cVar) {
        super(interfaceC0290y, M8.g.a, cVar.g(), L8.M.a);
        p210v8.i.f(interfaceC0290y, "module");
        p210v8.i.f(cVar, "fqName");
        this.f3634w = cVar;
        this.f3635x = "package " + cVar + " of " + interfaceC0290y;
    }

    @Override // O8.AbstractC0360p, L8.InterfaceC0276j
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0290y v() {
        InterfaceC0276j interfaceC0276jV = super.v();
        p210v8.i.d(interfaceC0276jV, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC0290y) interfaceC0276jV;
    }

    @Override // O8.AbstractC0360p, L8.InterfaceC0277k
    public L8.M g() {
        return L8.M.a;
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.x(this, obj);
    }

    @Override // O8.AbstractC0359o
    public String toString() {
        return this.f3635x;
    }
}
