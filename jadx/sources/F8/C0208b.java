package F8;

import A9.AbstractC0151y;
import L8.InterfaceC0285t;
import R8.AbstractC0408c;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: F8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0208b extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0208b f1558t = new C0208b(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0208b f1559u = new C0208b(1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0208b f1560v = new C0208b(1, 2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0208b f1561w = new C0208b(1, 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0208b f1562x = new C0208b(1, 4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0208b f1563y = new C0208b(1, 5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0208b f1564z = new C0208b(1, 6);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0208b f1556A = new C0208b(1, 7);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0208b f1557B = new C0208b(1, 8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0208b(int i10, int i11) {
        super(i10);
        this.f1565s = i11;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f1565s) {
            case 0:
                Class cls = (Class) obj;
                p210v8.i.f(cls, "it");
                return new A(cls);
            case 1:
                Class cls2 = (Class) obj;
                p210v8.i.f(cls2, "it");
                return new S(cls2);
            case 2:
                Class<?> returnType = ((Method) obj).getReturnType();
                p210v8.i.e(returnType, "it.returnType");
                return AbstractC0408c.b(returnType);
            case 3:
                Class cls3 = (Class) obj;
                p210v8.i.e(cls3, "it");
                return AbstractC0408c.b(cls3);
            case 4:
                InterfaceC0285t interfaceC0285t = (InterfaceC0285t) obj;
                p210v8.i.f(interfaceC0285t, "descriptor");
                return p114l9.g.f12984e.w(interfaceC0285t) + " | " + w0.c(interfaceC0285t).d();
            case 5:
                L8.K k3 = (L8.K) obj;
                p210v8.i.f(k3, "descriptor");
                return p114l9.g.f12984e.w(k3) + " | " + w0.b(k3).d();
            case 6:
                p114l9.g gVar = v0.a;
                AbstractC0151y type = ((O8.U) obj).getType();
                p210v8.i.e(type, "it.type");
                return v0.d(type);
            case 7:
                p114l9.g gVar2 = v0.a;
                AbstractC0151y type2 = ((O8.U) obj).getType();
                p210v8.i.e(type2, "it.type");
                return v0.d(type2);
            default:
                Class cls4 = (Class) obj;
                p210v8.i.e(cls4, "it");
                return AbstractC0408c.b(cls4);
        }
    }
}
