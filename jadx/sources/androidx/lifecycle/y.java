package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class y extends z implements InterfaceC0522q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f6772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ A f6773x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a, InterfaceC0523s interfaceC0523s, B b3) {
        super(a, b3);
        this.f6773x = a;
        this.f6772w = interfaceC0523s;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.s, java.lang.Object] */
    @Override // androidx.lifecycle.z
    public final void b() {
        this.f6772w.g().f(this);
    }

    @Override // androidx.lifecycle.z
    public final boolean c(InterfaceC0523s interfaceC0523s) {
        return this.f6772w == interfaceC0523s;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.s, java.lang.Object] */
    @Override // androidx.lifecycle.z
    public final boolean d() {
        return this.f6772w.g().f6763c.compareTo(EnumC0519n.f6758v) >= 0;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.s, java.lang.Object] */
    @Override // androidx.lifecycle.InterfaceC0522q
    public final void onStateChanged(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
        ?? r10 = this.f6772w;
        EnumC0519n enumC0519n = r10.g().f6763c;
        if (enumC0519n != EnumC0519n.f6755s) {
            EnumC0519n enumC0519n2 = null;
            while (enumC0519n2 != enumC0519n) {
                a(d());
                enumC0519n2 = enumC0519n;
                enumC0519n = r10.g().f6763c;
            }
            return;
        }
        A a = this.f6773x;
        a.getClass();
        A.a("removeObserver");
        z zVar = (z) a.f6706b.e(this.f6774s);
        if (zVar == null) {
            return;
        }
        zVar.b();
        zVar.a(false);
    }
}
