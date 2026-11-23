package p220w9;

import C8.InterfaceC0177e;
import p200u8.b;
import p210v8.g;
import p210v8.i;
import p210v8.u;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x extends g implements b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final x f15695A = new x(1);

    @Override // p210v8.b
    public final InterfaceC0177e d() {
        return u.a.b(p096j9.b.class);
    }

    @Override // p210v8.b
    public final String g() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // p210v8.b, C8.InterfaceC0174b
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        p096j9.b bVar = (p096j9.b) obj;
        i.f(bVar, "p0");
        return bVar.f();
    }
}
