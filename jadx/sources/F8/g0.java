package F8;

import L8.InterfaceC0269c;
import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends e0 implements C8.n {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f1575v;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r0 f1576t = t0.j(null, new f0(this, 1));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f1577u = D3.b.r(p076h8.e.f11786s, new f0(this, 0));

    static {
        p210v8.v vVar = p210v8.u.a;
        f1575v = new C8.u[]{vVar.f(new p210v8.n(vVar.b(g0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // F8.AbstractC0224s
    public final G8.e c() {
        return (G8.e) this.f1577u.getValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g0) && p210v8.i.a(l(), ((g0) obj).l());
    }

    @Override // F8.AbstractC0224s
    public final InterfaceC0269c g() {
        C8.u uVar = f1575v[0];
        Object objInvoke = this.f1576t.invoke();
        p210v8.i.e(objInvoke, "<get-descriptor>(...)");
        return (O8.L) objInvoke;
    }

    @Override // C8.InterfaceC0174b
    public final String getName() {
        return AbstractC0487g.j(new StringBuilder("<get-"), l().f1593u, '>');
    }

    public final int hashCode() {
        return l().hashCode();
    }

    @Override // F8.e0
    public final L8.J k() {
        C8.u uVar = f1575v[0];
        Object objInvoke = this.f1576t.invoke();
        p210v8.i.e(objInvoke, "<get-descriptor>(...)");
        return (O8.L) objInvoke;
    }

    public final String toString() {
        return "getter of " + l();
    }
}
