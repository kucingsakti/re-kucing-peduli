package U8;

import L8.InterfaceC0285t;
import O8.AbstractC0359o;

/* JADX INFO: renamed from: U8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0445f extends F {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f4971l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0285t a(InterfaceC0285t interfaceC0285t) {
        p210v8.i.f(interfaceC0285t, "functionDescriptor");
        p096j9.f name = ((AbstractC0359o) interfaceC0285t).getName();
        p210v8.i.e(name, "functionDescriptor.name");
        if (b(name)) {
            return (InterfaceC0285t) p165q9.d.b(interfaceC0285t, C0444e.f4963t);
        }
        return null;
    }

    public static boolean b(p096j9.f fVar) {
        p210v8.i.f(fVar, "<this>");
        return F.f4940e.contains(fVar);
    }
}
