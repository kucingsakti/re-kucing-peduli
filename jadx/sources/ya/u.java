package ya;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0889j {
    public static final u a = new u();

    @Override // ya.AbstractC0889j
    public final InterfaceC0890k b(Type type, Annotation[] annotationArr, p188t1.G g8) {
        if (T.f(type) != p078i.w.q()) {
            return null;
        }
        return new p102k7.e(g8.z(T.e(0, (ParameterizedType) type), annotationArr));
    }
}
