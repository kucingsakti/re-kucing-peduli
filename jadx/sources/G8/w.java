package G8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w extends x {
    @Override // G8.e
    public final Object v(Object[] objArr) {
        p210v8.i.f(objArr, "args");
        C3.a.b(this, objArr);
        Object obj = objArr[0];
        Object[] objArrS = objArr.length <= 1 ? new Object[0] : p086i8.i.s(1, objArr.length, objArr);
        return this.a.invoke(obj, Arrays.copyOf(objArrS, objArrS.length));
    }
}
