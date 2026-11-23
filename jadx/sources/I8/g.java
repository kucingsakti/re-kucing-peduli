package I8;

import A9.D;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import O8.AbstractC0346b;
import O8.C;
import O8.C0345a;
import O8.z;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2110t;

    public /* synthetic */ g(Object obj, int i10) {
        this.f2109s = i10;
        this.f2110t = obj;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f2109s) {
            case 0:
                p096j9.f fVar = (p096j9.f) obj;
                C cK = ((i) this.f2110t).k();
                p096j9.c cVar = o.f2197k;
                t9.j jVar = ((z) cK.K(cVar)).f3799y;
                if (jVar == null) {
                    i.a(11);
                    throw null;
                }
                InterfaceC0273g interfaceC0273gA = jVar.a(fVar, T8.b.f4759s);
                if (interfaceC0273gA == null) {
                    throw new AssertionError("Built-in class " + cVar.c(fVar) + " is not found");
                }
                if (interfaceC0273gA instanceof InterfaceC0271e) {
                    return (InterfaceC0271e) interfaceC0273gA;
                }
                throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + interfaceC0273gA);
            case 1:
                C0345a c0345a = (C0345a) this.f2110t;
                ((B9.f) obj).getClass();
                AbstractC0346b abstractC0346b = c0345a.f3696t;
                p210v8.i.f(abstractC0346b, "descriptor");
                return (D) abstractC0346b.f3698t.invoke();
            default:
                InterfaceC0269c interfaceC0269c = (InterfaceC0269c) obj;
                if (interfaceC0269c == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((V8.a) this.f2110t).f5200b.c(interfaceC0269c);
                return p076h8.m.a;
        }
    }
}
