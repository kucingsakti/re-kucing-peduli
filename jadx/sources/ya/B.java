package ya;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class B extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16134b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f16135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0890k f16137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f16138f;

    public B(Method method, int i10, X9.w wVar, InterfaceC0890k interfaceC0890k) {
        this.f16135c = method;
        this.f16136d = i10;
        this.f16138f = wVar;
        this.f16137e = interfaceC0890k;
    }

    @Override // ya.T
    public final void a(I i10, Object obj) {
        InterfaceC0890k interfaceC0890k = this.f16137e;
        Object obj2 = this.f16138f;
        int i11 = this.f16136d;
        Method method = this.f16135c;
        switch (this.f16134b) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    i10.c((X9.w) obj2, (X9.J) interfaceC0890k.j(obj));
                    return;
                } catch (IOException e10) {
                    throw T.k(method, i11, "Unable to convert " + obj + " to RequestBody", e10);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw T.k(method, i11, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw T.k(method, i11, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw T.k(method, i11, E0.a.i("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    i10.c(p086i8.C.t("Content-Disposition", E0.a.i("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (X9.J) interfaceC0890k.j(value));
                }
                return;
        }
    }

    public B(Method method, int i10, InterfaceC0890k interfaceC0890k, String str) {
        this.f16135c = method;
        this.f16136d = i10;
        this.f16137e = interfaceC0890k;
        this.f16138f = str;
    }
}
