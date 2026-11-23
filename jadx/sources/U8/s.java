package U8;

import C8.InterfaceC0177e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s extends p210v8.g implements p200u8.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final s f4987A = new s(1);

    @Override // p210v8.b
    public final InterfaceC0177e d() {
        return p210v8.u.a.c("compiler.common.jvm", q.class);
    }

    @Override // p210v8.b
    public final String g() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // p210v8.b, C8.InterfaceC0174b
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        p096j9.c cVar = (p096j9.c) obj;
        p210v8.i.f(cVar, "p0");
        p096j9.c cVar2 = q.a;
        A.f4924b.getClass();
        o1.k kVar = z.f5023b;
        p076h8.c cVar3 = new p076h8.c(7, 20);
        p210v8.i.f(kVar, "configuredReportLevels");
        B b3 = (B) ((p247z9.j) kVar.f13639t).invoke(cVar);
        if (b3 != null) {
            return b3;
        }
        o1.k kVar2 = q.f4982c;
        kVar2.getClass();
        r rVar = (r) ((p247z9.j) kVar2.f13639t).invoke(cVar);
        if (rVar == null) {
            return B.IGNORE;
        }
        p076h8.c cVar4 = rVar.f4985b;
        return (cVar4 == null || cVar4.f11785v - cVar3.f11785v > 0) ? rVar.a : rVar.f4986c;
    }
}
