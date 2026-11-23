package L8;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p140o4.r f2793t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(p140o4.r rVar, int i10) {
        super(1);
        this.f2792s = i10;
        this.f2793t = rVar;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        InterfaceC0272f interfaceC0272fL;
        switch (this.f2792s) {
            case 0:
                A a = (A) obj;
                p210v8.i.f(a, "<name for destructuring parameter 0>");
                p096j9.b bVar = a.a;
                if (bVar.f12542c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + bVar);
                }
                p096j9.b bVarF = bVar.f();
                List list = a.f2788b;
                p140o4.r rVar = this.f2793t;
                if (bVarF != null) {
                    interfaceC0272fL = rVar.l(bVarF, p086i8.k.P(list));
                } else {
                    p247z9.e eVar = (p247z9.e) rVar.f13784v;
                    p096j9.c cVarG = bVar.g();
                    p210v8.i.e(cVarG, "classId.packageFqName");
                    interfaceC0272fL = (InterfaceC0272f) eVar.invoke(cVarG);
                }
                InterfaceC0272f interfaceC0272f = interfaceC0272fL;
                boolean z6 = !bVar.f12541b.e().d();
                p247z9.l lVar = (p247z9.l) rVar.f13782t;
                p096j9.f fVarI = bVar.i();
                p210v8.i.e(fVarI, "classId.shortClassName");
                Integer num = (Integer) p086i8.k.V(list);
                return new B(lVar, interfaceC0272f, fVarI, z6, num != null ? num.intValue() : 0);
            default:
                p096j9.c cVar = (p096j9.c) obj;
                p210v8.i.f(cVar, "fqName");
                return new K8.k((InterfaceC0290y) this.f2793t.f13783u, cVar, 1);
        }
    }
}
