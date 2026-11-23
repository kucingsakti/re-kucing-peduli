package ya;

import N9.C0324g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class M implements InvocationHandler {
    public final H a = H.f16147c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f16193b = new Object[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p188t1.G f16194c;

    public M(p188t1.G g8) {
        this.f16194c = g8;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C0893n c0893nA;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f16193b;
        }
        H h10 = this.a;
        if (h10.a && method.isDefault()) {
            return h10.b(obj, method, objArr);
        }
        p188t1.G g8 = this.f16194c;
        C0893n c0893n = (C0893n) ((ConcurrentHashMap) g8.f14978s).get(method);
        if (c0893n == null) {
            synchronized (((ConcurrentHashMap) g8.f14978s)) {
                try {
                    c0893nA = (C0893n) ((ConcurrentHashMap) g8.f14978s).get(method);
                    if (c0893nA == null) {
                        c0893nA = C0893n.a(g8, method);
                        ((ConcurrentHashMap) g8.f14978s).put(method, c0893nA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0893n = c0893nA;
        }
        C0898t c0898t = new C0898t(c0893n.a, objArr, c0893n.f16214b, c0893n.f16215c);
        switch (c0893n.f16216d) {
            case 0:
                return c0893n.f16217e.w0(c0898t);
            case 1:
                InterfaceC0882c interfaceC0882c = (InterfaceC0882c) c0893n.f16217e.w0(c0898t);
                p123m8.d dVar = (p123m8.d) objArr[objArr.length - 1];
                try {
                    C0324g c0324g = new C0324g(1, qa.b.q(dVar));
                    c0324g.y(new C0895p(interfaceC0882c, 0));
                    interfaceC0882c.n(new W9.b(c0324g));
                    return c0324g.v();
                } catch (Exception e10) {
                    return T.n(e10, dVar);
                }
            default:
                InterfaceC0882c interfaceC0882c2 = (InterfaceC0882c) c0893n.f16217e.w0(c0898t);
                p123m8.d dVar2 = (p123m8.d) objArr[objArr.length - 1];
                try {
                    C0324g c0324g2 = new C0324g(1, qa.b.q(dVar2));
                    c0324g2.y(new C0895p(interfaceC0882c2, 1));
                    interfaceC0882c2.n(new p081i3.b(c0324g2, 25));
                    return c0324g2.v();
                } catch (Exception e11) {
                    return T.n(e11, dVar2);
                }
        }
    }
}
