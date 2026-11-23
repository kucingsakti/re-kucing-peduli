package p114l9;

import L8.D;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.P;
import O8.E;
import java.util.ArrayList;
import p086i8.B;
import p096j9.e;
import p096j9.f;
import p181s3.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f12972b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f12973c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f12974d = new b(2);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static String b(InterfaceC0273g interfaceC0273g) {
        String strR;
        f name = interfaceC0273g.getName();
        i.e(name, "descriptor.name");
        String strQ = a.q(name);
        if (!(interfaceC0273g instanceof P)) {
            InterfaceC0276j interfaceC0276jV = interfaceC0273g.v();
            i.e(interfaceC0276jV, "descriptor.containingDeclaration");
            if (interfaceC0276jV instanceof InterfaceC0271e) {
                strR = b((InterfaceC0273g) interfaceC0276jV);
            } else if (interfaceC0276jV instanceof D) {
                e eVarI = ((E) ((D) interfaceC0276jV)).f3634w.i();
                i.e(eVarI, "descriptor.fqName.toUnsafe()");
                strR = a.r(eVarI.e());
            } else {
                strR = null;
            }
            if (strR != null && !strR.equals("")) {
                return strR + '.' + strQ;
            }
        }
        return strQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [L8.g, L8.j] */
    /* JADX WARN: Type inference failed for: r2v8, types: [L8.j] */
    /* JADX WARN: Type inference failed for: r2v9, types: [L8.j] */
    @Override // p114l9.c
    public final String a(InterfaceC0273g interfaceC0273g, g gVar) {
        switch (this.a) {
            case 0:
                i.f(gVar, "renderer");
                if (interfaceC0273g instanceof P) {
                    f name = ((P) interfaceC0273g).getName();
                    i.e(name, "classifier.name");
                    return gVar.O(name, false);
                }
                e eVarG = p124m9.e.g(interfaceC0273g);
                i.e(eVarG, "getFqName(classifier)");
                return gVar.o(a.r(eVarG.e()));
            case 1:
                i.f(gVar, "renderer");
                if (interfaceC0273g instanceof P) {
                    f name2 = ((P) interfaceC0273g).getName();
                    i.e(name2, "classifier.name");
                    return gVar.O(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC0273g.getName());
                    interfaceC0273g = interfaceC0273g.v();
                } while (interfaceC0273g instanceof InterfaceC0271e);
                return a.r(new B(arrayList));
            default:
                i.f(gVar, "renderer");
                return b(interfaceC0273g);
        }
    }
}
