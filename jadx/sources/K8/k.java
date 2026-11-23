package K8;

import L8.InterfaceC0290y;
import O8.E;

/* JADX INFO: loaded from: classes.dex */
public final class k extends E {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f2655y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC0290y interfaceC0290y, p096j9.c cVar, int i10) {
        super(interfaceC0290y, cVar);
        this.f2655y = i10;
        switch (i10) {
            case 1:
                p210v8.i.f(interfaceC0290y, "module");
                p210v8.i.f(cVar, "fqName");
                super(interfaceC0290y, cVar);
                break;
            default:
                break;
        }
    }

    @Override // L8.D
    public final /* bridge */ /* synthetic */ t9.n E0() {
        switch (this.f2655y) {
            case 0:
                break;
        }
        return t9.m.f15259b;
    }
}
