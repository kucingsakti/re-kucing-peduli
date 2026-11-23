package F8;

import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class T extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1542s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ U f1543t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(U u3, int i10) {
        super(0);
        this.f1542s = i10;
        this.f1543t = u3;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f1542s) {
            case 0:
                return y0.d(this.f1543t.a());
            default:
                U u3 = this.f1543t;
                L8.I iA = u3.a();
                boolean z6 = iA instanceof O8.x;
                AbstractC0224s abstractC0224s = u3.a;
                if (!z6 || !p210v8.i.a(y0.g(abstractC0224s.g()), iA) || abstractC0224s.g().V() != 2) {
                    return (Type) abstractC0224s.c().x().get(u3.f1545b);
                }
                InterfaceC0276j interfaceC0276jV = abstractC0224s.g().v();
                p210v8.i.d(interfaceC0276jV, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class clsJ = y0.j((InterfaceC0271e) interfaceC0276jV);
                if (clsJ != null) {
                    return clsJ;
                }
                throw new p0("Cannot determine receiver Java type of inherited declaration: " + iA, 0);
        }
    }
}
