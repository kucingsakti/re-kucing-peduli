package ya;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ya.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0894o {
    public final Method a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16218b;

    public C0894o(Method method, ArrayList arrayList) {
        this.a = method;
        this.f16218b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f16218b);
    }
}
