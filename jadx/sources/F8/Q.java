package F8;

import C8.InterfaceC0177e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q extends p210v8.g implements p200u8.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Q f1539A = new Q(2);

    @Override // p210v8.b
    public final InterfaceC0177e d() {
        return p210v8.u.a.b(p220w9.q.class);
    }

    @Override // p210v8.b
    public final String g() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // p210v8.b, C8.InterfaceC0174b
    public final String getName() {
        return "loadProperty";
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        p220w9.q qVar = (p220w9.q) obj;
        p047e9.G g8 = (p047e9.G) obj2;
        p210v8.i.f(qVar, "p0");
        p210v8.i.f(g8, "p1");
        return qVar.f(g8);
    }
}
