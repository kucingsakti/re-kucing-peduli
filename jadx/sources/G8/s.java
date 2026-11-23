package G8;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class s extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i10, Method method) {
        super(method, false, 6);
        this.f1739g = i10;
        switch (i10) {
            case 1:
                p210v8.i.f(method, "method");
                super(method, true, 4);
                break;
            case 2:
                p210v8.i.f(method, "method");
                super(method, false, 6);
                break;
            default:
                p210v8.i.f(method, "method");
                break;
        }
    }

    @Override // G8.o, G8.e
    public final Object v(Object[] objArr) {
        switch (this.f1739g) {
            case 0:
                p210v8.i.f(objArr, "args");
                C3.a.b(this, objArr);
                return c(objArr[0], objArr.length <= 1 ? new Object[0] : p086i8.i.s(1, objArr.length, objArr));
            case 1:
                p210v8.i.f(objArr, "args");
                C3.a.b(this, objArr);
                b(p086i8.i.w(objArr));
                return c(null, objArr.length <= 1 ? new Object[0] : p086i8.i.s(1, objArr.length, objArr));
            default:
                p210v8.i.f(objArr, "args");
                C3.a.b(this, objArr);
                return c(null, objArr);
        }
    }
}
