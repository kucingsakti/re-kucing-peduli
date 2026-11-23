package U8;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f4988c;
    public final v a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4989b;

    static {
        p096j9.c cVar = q.a;
        p076h8.c cVar2 = p076h8.c.f11781w;
        p210v8.i.f(cVar2, "configuredKotlinVersion");
        r rVar = q.f4983d;
        p076h8.c cVar3 = rVar.f4985b;
        B b3 = (cVar3 == null || cVar3.f11785v - cVar2.f11785v > 0) ? rVar.a : rVar.f4986c;
        p210v8.i.f(b3, "globalReportLevel");
        v vVar = new v(b3, b3 == B.WARN ? null : b3);
        s sVar = s.f4987A;
        f4988c = new t(vVar);
    }

    public t(v vVar) {
        s sVar = s.f4987A;
        this.a = vVar;
        this.f4989b = vVar.f4992d || sVar.invoke(q.a) == B.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.a + ", getReportLevelForAnnotation=" + s.f4987A + ')';
    }
}
