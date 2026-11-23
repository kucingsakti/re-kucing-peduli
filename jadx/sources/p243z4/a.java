package p243z4;

import com.google.gson.internal.d;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a<T> {
    public final Class a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f16313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16314c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type typeA = d.a(parameterizedType.getActualTypeArguments()[0]);
                this.f16313b = typeA;
                this.a = d.g(typeA);
                this.f16314c = typeA.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return d.d(this.f16313b, ((a) obj).f16313b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16314c;
    }

    public final String toString() {
        return d.j(this.f16313b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeA = d.a(type);
        this.f16313b = typeA;
        this.a = d.g(typeA);
        this.f16314c = typeA.hashCode();
    }
}
