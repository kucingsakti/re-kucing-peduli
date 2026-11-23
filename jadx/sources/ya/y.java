package ya;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f16246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16248e;

    public /* synthetic */ y(Method method, int i10, boolean z6, int i11) {
        this.f16245b = i11;
        this.f16246c = method;
        this.f16247d = i10;
        this.f16248e = z6;
    }

    @Override // ya.T
    public final void a(I i10, Object obj) {
        switch (this.f16245b) {
            case 0:
                Map map = (Map) obj;
                Method method = this.f16246c;
                int i11 = this.f16247d;
                if (map == null) {
                    throw T.k(method, i11, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw T.k(method, i11, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw T.k(method, i11, E0.a.i("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw T.k(method, i11, "Field map value '" + value + "' converted to null by " + C0880a.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    i10.a(str, string, this.f16248e);
                }
                return;
            default:
                Map map2 = (Map) obj;
                Method method2 = this.f16246c;
                int i12 = this.f16247d;
                if (map2 == null) {
                    throw T.k(method2, i12, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw T.k(method2, i12, "Query map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw T.k(method2, i12, E0.a.i("Query map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    String string2 = value2.toString();
                    if (string2 == null) {
                        throw T.k(method2, i12, "Query map value '" + value2 + "' converted to null by " + C0880a.class.getName() + " for key '" + str2 + "'.", new Object[0]);
                    }
                    i10.d(str2, string2, this.f16248e);
                }
                return;
        }
    }
}
