package ya;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class A extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f16132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16133d;

    public /* synthetic */ A(Method method, int i10, int i11) {
        this.f16131b = i11;
        this.f16132c = method;
        this.f16133d = i10;
    }

    @Override // ya.T
    public final void a(I i10, Object obj) {
        switch (this.f16131b) {
            case 0:
                Map map = (Map) obj;
                Method method = this.f16132c;
                int i11 = this.f16133d;
                if (map == null) {
                    throw T.k(method, i11, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw T.k(method, i11, "Header map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw T.k(method, i11, E0.a.i("Header map contained null value for key '", str, "'."), new Object[0]);
                    }
                    i10.b(str, value.toString());
                }
                return;
            case 1:
                X9.w wVar = (X9.w) obj;
                if (wVar == null) {
                    throw T.k(this.f16132c, this.f16133d, "Headers parameter must not be null.", new Object[0]);
                }
                M1.c cVar = i10.f16155f;
                cVar.getClass();
                int size = wVar.size();
                for (int i12 = 0; i12 < size; i12++) {
                    cVar.c(wVar.f(i12), wVar.m(i12));
                }
                return;
            default:
                if (obj == null) {
                    throw T.k(this.f16132c, this.f16133d, "@Url parameter is null.", new Object[0]);
                }
                i10.f16152c = obj.toString();
                return;
        }
    }
}
