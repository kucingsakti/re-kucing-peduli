package ya;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: ya.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0881b extends AbstractC0889j {
    public boolean a;

    @Override // ya.AbstractC0889j
    public final InterfaceC0890k a(Type type) {
        if (X9.J.class.isAssignableFrom(T.f(type))) {
            return C0880a.f16203v;
        }
        return null;
    }

    @Override // ya.AbstractC0889j
    public final InterfaceC0890k b(Type type, Annotation[] annotationArr, p188t1.G g8) {
        if (type == X9.O.class) {
            return T.i(annotationArr, Ba.w.class) ? C0880a.f16204w : C0880a.f16202u;
        }
        if (type == Void.class) {
            return C0880a.f16206y;
        }
        if (!this.a || type != p076h8.m.class) {
            return null;
        }
        try {
            return C0880a.f16205x;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }
}
