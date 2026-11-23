package ya;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: ya.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0888i extends AbstractC0883d {
    public static final C0888i a = new C0888i();

    @Override // ya.AbstractC0883d
    public final InterfaceC0884e a(Type type, Annotation[] annotationArr) {
        if (T.f(type) != p078i.w.c()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeE = T.e(0, (ParameterizedType) type);
        if (T.f(typeE) != L.class) {
            return new com.google.gson.internal.e(1, typeE);
        }
        if (typeE instanceof ParameterizedType) {
            return new com.google.gson.internal.e(2, T.e(0, (ParameterizedType) typeE));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
