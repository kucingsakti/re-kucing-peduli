package ya;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ya.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0892m extends AbstractC0883d {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16213b;

    public /* synthetic */ C0892m(Object obj, int i10) {
        this.a = i10;
        this.f16213b = obj;
    }

    @Override // ya.AbstractC0883d
    public final InterfaceC0884e a(Type type, Annotation[] annotationArr) {
        Type typeE;
        boolean z6;
        boolean z10;
        String str;
        switch (this.a) {
            case 0:
                if (T.f(type) != InterfaceC0882c.class) {
                    return null;
                }
                if (type instanceof ParameterizedType) {
                    return new o1.e(T.e(0, (ParameterizedType) type), 20, T.i(annotationArr, N.class) ? null : (Executor) this.f16213b);
                }
                throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
            default:
                Class clsF = T.f(type);
                if (clsF == J7.a.class) {
                    return new za.d(Void.class, (J7.n) this.f16213b, false, true, false, false, false, true);
                }
                boolean z11 = clsF == J7.c.class;
                boolean z12 = clsF == J7.o.class;
                boolean z13 = clsF == J7.g.class;
                if (clsF != J7.j.class && !z11 && !z12 && !z13) {
                    return null;
                }
                if (!(type instanceof ParameterizedType)) {
                    if (z11) {
                        str = "Flowable";
                    } else if (z12) {
                        str = "Single";
                    } else {
                        str = z13 ? "Maybe" : "Observable";
                    }
                    throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
                }
                Type typeE2 = T.e(0, (ParameterizedType) type);
                Class clsF2 = T.f(typeE2);
                if (clsF2 == L.class) {
                    if (!(typeE2 instanceof ParameterizedType)) {
                        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                    }
                    typeE = T.e(0, (ParameterizedType) typeE2);
                    z10 = false;
                    z6 = false;
                } else if (clsF2 != za.c.class) {
                    typeE = typeE2;
                    z6 = true;
                    z10 = false;
                } else {
                    if (!(typeE2 instanceof ParameterizedType)) {
                        throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                    }
                    typeE = T.e(0, (ParameterizedType) typeE2);
                    z10 = true;
                    z6 = false;
                }
                return new za.d(typeE, (J7.n) this.f16213b, z10, z6, z11, z12, z13, false);
        }
    }
}
