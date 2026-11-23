package G8;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y implements e {
    public static final y a = new y();

    @Override // G8.e
    public final Object v(Object[] objArr) {
        p210v8.i.f(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // G8.e
    public final Type w() {
        Class cls = Void.TYPE;
        p210v8.i.e(cls, "TYPE");
        return cls;
    }

    @Override // G8.e
    public final List x() {
        return p086i8.s.f12328s;
    }

    @Override // G8.e
    public final /* bridge */ /* synthetic */ Member y() {
        return null;
    }
}
