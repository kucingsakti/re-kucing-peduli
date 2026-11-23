package R8;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes.dex */
public final class t extends v {
    public final Field a;

    public t(Field field) {
        p210v8.i.f(field, "member");
        this.a = field;
    }

    @Override // R8.v
    public final Member b() {
        return this.a;
    }
}
