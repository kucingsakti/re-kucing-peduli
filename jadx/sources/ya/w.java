package ya;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class w extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f16238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0890k f16240d;

    public w(Method method, int i10, InterfaceC0890k interfaceC0890k) {
        this.f16238b = method;
        this.f16239c = i10;
        this.f16240d = interfaceC0890k;
    }

    @Override // ya.T
    public final void a(I i10, Object obj) {
        Method method = this.f16238b;
        int i11 = this.f16239c;
        if (obj == null) {
            throw T.k(method, i11, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            i10.f16159k = (X9.J) this.f16240d.j(obj);
        } catch (IOException e10) {
            throw T.l(method, e10, i11, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
