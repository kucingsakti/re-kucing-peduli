package G8;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v extends x implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1745d;

    public v(Method method, Object obj) {
        super(method, p086i8.s.f12328s);
        this.f1745d = obj;
    }

    @Override // G8.e
    public final Object v(Object[] objArr) {
        p210v8.i.f(objArr, "args");
        C3.a.b(this, objArr);
        return this.a.invoke(this.f1745d, Arrays.copyOf(objArr, objArr.length));
    }
}
