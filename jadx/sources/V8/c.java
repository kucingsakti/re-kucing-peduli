package V8;

import I8.n;
import R8.AbstractC0408c;
import R8.C0409d;
import U8.x;
import Y8.C0477f;
import p086i8.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final p096j9.f a = p096j9.f.j("message");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p096j9.f f5207b = p096j9.f.j("allowedTargets");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p096j9.f f5208c = p096j9.f.j("value");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f5209d = y.w(new p076h8.f(n.f2182t, x.f4995c), new p076h8.f(n.f2185w, x.f4996d), new p076h8.f(n.f2186x, x.f4998f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static W8.h a(p096j9.c cVar, p009a9.b bVar, Fa.e eVar) {
        C0409d c0409dA;
        p210v8.i.f(cVar, "kotlinName");
        p210v8.i.f(bVar, "annotationOwner");
        p210v8.i.f(eVar, "c");
        if (cVar.equals(n.f2175m)) {
            p096j9.c cVar2 = x.f4997e;
            p210v8.i.e(cVar2, "DEPRECATED_ANNOTATION");
            C0409d c0409dA2 = bVar.a(cVar2);
            if (c0409dA2 != null) {
                return new g(c0409dA2, eVar);
            }
        }
        p096j9.c cVar3 = (p096j9.c) f5209d.get(cVar);
        if (cVar3 == null || (c0409dA = bVar.a(cVar3)) == null) {
            return null;
        }
        return b(eVar, c0409dA, false);
    }

    public static W8.h b(Fa.e eVar, C0409d c0409d, boolean z6) {
        p210v8.i.f(c0409d, "annotation");
        p210v8.i.f(eVar, "c");
        p096j9.b bVarA = AbstractC0408c.a(p068ga.d.o(p068ga.d.l(c0409d.a)));
        if (bVarA.equals(p096j9.b.j(x.f4995c))) {
            return new j(c0409d, eVar);
        }
        if (bVarA.equals(p096j9.b.j(x.f4996d))) {
            return new i(c0409d, eVar);
        }
        if (bVarA.equals(p096j9.b.j(x.f4998f))) {
            return new b(eVar, c0409d, n.f2186x);
        }
        if (bVarA.equals(p096j9.b.j(x.f4997e))) {
            return null;
        }
        return new C0477f(eVar, c0409d, z6);
    }
}
