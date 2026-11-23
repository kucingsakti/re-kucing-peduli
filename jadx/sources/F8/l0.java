package F8;

import R8.AbstractC0408c;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m0 f1600t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(m0 m0Var, int i10) {
        super(0);
        this.f1599s = i10;
        this.f1600t = m0Var;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f1599s) {
            case 0:
                r0 r0Var = this.f1600t.f1604b;
                Type type = r0Var != null ? (Type) r0Var.invoke() : null;
                p210v8.i.c(type);
                return AbstractC0408c.c(type);
            default:
                m0 m0Var = this.f1600t;
                return m0Var.a(m0Var.a);
        }
    }
}
