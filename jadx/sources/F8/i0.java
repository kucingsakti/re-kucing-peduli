package F8;

import L8.InterfaceC0269c;
import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends e0 implements C8.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f1582v;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r0 f1583t = t0.j(null, new h0(this, 1));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f1584u = D3.b.r(p076h8.e.f11786s, new h0(this, 0));

    static {
        p210v8.v vVar = p210v8.u.a;
        f1582v = new C8.u[]{vVar.f(new p210v8.n(vVar.b(i0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // F8.AbstractC0224s
    public final G8.e c() {
        return (G8.e) this.f1584u.getValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i0) && p210v8.i.a(l(), ((i0) obj).l());
    }

    @Override // F8.AbstractC0224s
    public final InterfaceC0269c g() {
        C8.u uVar = f1582v[0];
        Object objInvoke = this.f1583t.invoke();
        p210v8.i.e(objInvoke, "<get-descriptor>(...)");
        return (O8.M) objInvoke;
    }

    @Override // C8.InterfaceC0174b
    public final String getName() {
        return AbstractC0487g.j(new StringBuilder("<set-"), l().f1593u, '>');
    }

    public final int hashCode() {
        return l().hashCode();
    }

    @Override // F8.e0
    public final L8.J k() {
        C8.u uVar = f1582v[0];
        Object objInvoke = this.f1583t.invoke();
        p210v8.i.e(objInvoke, "<get-descriptor>(...)");
        return (O8.M) objInvoke;
    }

    public final String toString() {
        return "setter of " + l();
    }
}
