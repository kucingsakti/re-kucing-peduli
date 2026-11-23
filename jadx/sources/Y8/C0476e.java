package Y8;

import L8.AbstractC0287v;
import L8.InterfaceC0271e;
import R8.AbstractC0408c;
import R8.C0409d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: renamed from: Y8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0476e extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0477f f5743t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0476e(C0477f c0477f, int i10) {
        super(0);
        this.f5742s = i10;
        this.f5743t = c0477f;
    }

    @Override // p200u8.a
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        switch (this.f5742s) {
            case 0:
                C0477f c0477f = this.f5743t;
                ArrayList<p009a9.a> arrayListB = c0477f.f5745b.b();
                ArrayList arrayList = new ArrayList();
                for (p009a9.a aVar : arrayListB) {
                    p096j9.f fVar = ((R8.e) aVar).a;
                    if (fVar == null) {
                        fVar = U8.x.f4994b;
                    }
                    p145o9.g gVarC = c0477f.c(aVar);
                    p076h8.f fVar2 = gVarC != null ? new p076h8.f(fVar, gVarC) : null;
                    if (fVar2 != null) {
                        arrayList.add(fVar2);
                    }
                }
                return p086i8.y.z(arrayList);
            case 1:
                return AbstractC0408c.a(p068ga.d.o(p068ga.d.l(this.f5743t.f5745b.a))).b();
            default:
                C0477f c0477f2 = this.f5743t;
                p096j9.c cVarA = c0477f2.a();
                C0409d c0409d = c0477f2.f5745b;
                if (cVarA == null) {
                    return C9.i.c(C9.h.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, c0409d.toString());
                }
                Fa.e eVar = c0477f2.a;
                InterfaceC0271e interfaceC0271eB = K8.e.b(cVarA, ((O8.C) ((I4.a) eVar.f1659t).f2059o).f3622v);
                if (interfaceC0271eB == null) {
                    R8.n nVar = new R8.n(p068ga.d.o(p068ga.d.l(c0409d.a)));
                    I4.a aVar2 = (I4.a) eVar.f1659t;
                    V.h hVar = (V.h) aVar2.f2055k;
                    hVar.getClass();
                    p081i3.b bVar = (p081i3.b) hVar.f5078t;
                    if (bVar == null) {
                        p210v8.i.n("resolver");
                        throw null;
                    }
                    interfaceC0271eB = bVar.J(nVar);
                    if (interfaceC0271eB == null) {
                        interfaceC0271eB = AbstractC0287v.f((O8.C) aVar2.f2059o, p096j9.b.j(cVarA), (p140o4.r) ((p029c9.d) aVar2.f2049d).c().f2088l);
                    }
                }
                return interfaceC0271eB.p();
        }
    }
}
