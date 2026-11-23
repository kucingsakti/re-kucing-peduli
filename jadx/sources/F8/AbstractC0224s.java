package F8;

import C8.InterfaceC0174b;
import L8.InterfaceC0269c;
import java.util.List;
import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: renamed from: F8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0224s implements InterfaceC0174b, o0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f1627s;

    public AbstractC0224s() {
        t0.j(null, new C0222p(this, 1));
        this.f1627s = t0.j(null, new C0222p(this, 2));
        t0.j(null, new C0222p(this, 4));
        t0.j(null, new C0222p(this, 5));
        t0.j(null, new C0222p(this, 0));
    }

    public abstract G8.e c();

    public abstract D d();

    public abstract G8.e f();

    public abstract InterfaceC0269c g();

    public final boolean i() {
        return p210v8.i.a(getName(), "<init>") && d().a().isAnnotation();
    }

    public abstract boolean j();

    @Override // C8.InterfaceC0174b
    public final List u() {
        Object objInvoke = this.f1627s.invoke();
        p210v8.i.e(objInvoke, "_parameters()");
        return (List) objInvoke;
    }

    @Override // C8.InterfaceC0174b
    public final Object v(Object... objArr) throws IllegalCallableAccessException {
        p210v8.i.f(objArr, "args");
        try {
            return c().v(objArr);
        } catch (IllegalAccessException e10) {
            throw new IllegalCallableAccessException(e10);
        }
    }
}
