package A9;

import C8.InterfaceC0175c;

/* JADX INFO: renamed from: A9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0137j {
    public static final /* synthetic */ C8.u[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G9.p f374b;

    static {
        p210v8.v vVar = p210v8.u.a;
        a = new C8.u[]{vVar.f(new p210v8.n(vVar.c("descriptors", AbstractC0137j.class), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        o1.c cVar = K.f338t;
        InterfaceC0175c interfaceC0175cB = vVar.b(C0136i.class);
        cVar.getClass();
        f374b = new G9.p(interfaceC0175cB, cVar.r(interfaceC0175cB));
    }

    public static final M8.h a(K k3) {
        M8.h hVar;
        p210v8.i.f(k3, "<this>");
        C8.u uVar = a[0];
        G9.p pVar = f374b;
        pVar.getClass();
        p210v8.i.f(uVar, "property");
        C0136i c0136i = (C0136i) k3.f1752s.get(pVar.a);
        return (c0136i == null || (hVar = c0136i.a) == null) ? M8.g.a : hVar;
    }
}
