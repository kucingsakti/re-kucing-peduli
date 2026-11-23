package O8;

import L8.AbstractC0287v;
import L8.C0289x;
import L8.InterfaceC0276j;
import L8.InterfaceC0278l;
import L8.InterfaceC0290y;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0359o implements InterfaceC0290y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f3618A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p247z9.e f3619B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p076h8.j f3620C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p247z9.l f3621u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final I8.i f3622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f3623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final H f3624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p040e1.j f3625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public L8.G f3626z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(p096j9.f fVar, p247z9.l lVar, I8.i iVar, int i10) {
        super(M8.g.a, fVar);
        p086i8.t tVar = p086i8.t.f12329s;
        p210v8.i.f(fVar, "moduleName");
        this.f3621u = lVar;
        this.f3622v = iVar;
        if (!fVar.f12552t) {
            throw new IllegalArgumentException("Module name must be special: " + fVar);
        }
        this.f3623w = tVar;
        H.a.getClass();
        H h10 = (H) o0(F.f3636b);
        this.f3624x = h10 == null ? G.f3637b : h10;
        this.f3618A = true;
        this.f3619B = lVar.b(new A0.m(this, 15));
        this.f3620C = D3.b.s(new I8.l(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // L8.InterfaceC0290y
    public final boolean J(InterfaceC0290y interfaceC0290y) {
        p210v8.i.f(interfaceC0290y, "targetModule");
        if (equals(interfaceC0290y)) {
            return true;
        }
        p210v8.i.c(this.f3625y);
        if (p086i8.k.O(p086i8.u.f12330s, interfaceC0290y)) {
            return true;
        }
        g0();
        if (interfaceC0290y instanceof Void) {
        }
        return interfaceC0290y.g0().contains(this);
    }

    @Override // L8.InterfaceC0290y
    public final L8.H K(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        Y0();
        return (L8.H) this.f3619B.invoke(cVar);
    }

    public final void Y0() {
        if (this.f3618A) {
            return;
        }
        if (o0(AbstractC0287v.a) != null) {
            throw new ClassCastException();
        }
        String str = "Accessing invalid module descriptor " + this;
        p210v8.i.f(str, "message");
        throw new InvalidModuleException(str);
    }

    @Override // L8.InterfaceC0290y
    public final List g0() {
        if (this.f3625y != null) {
            return p086i8.s.f12328s;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().f12551s;
        p210v8.i.e(str, "name.toString()");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // L8.InterfaceC0290y
    public final Collection k(p096j9.c cVar, p200u8.b bVar) {
        p210v8.i.f(cVar, "fqName");
        Y0();
        Y0();
        return ((C0358n) this.f3620C.getValue()).k(cVar, bVar);
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.s(this, obj);
    }

    @Override // L8.InterfaceC0290y
    public final Object o0(C0289x c0289x) {
        p210v8.i.f(c0289x, "capability");
        Object obj = this.f3623w.get(c0289x);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // L8.InterfaceC0290y
    public final I8.i s() {
        return this.f3622v;
    }

    @Override // O8.AbstractC0359o
    public final String toString() {
        String strX0 = AbstractC0359o.X0(this);
        return this.f3618A ? strX0 : strX0.concat(" !isValid");
    }

    @Override // L8.InterfaceC0276j
    public final InterfaceC0276j v() {
        return null;
    }
}
