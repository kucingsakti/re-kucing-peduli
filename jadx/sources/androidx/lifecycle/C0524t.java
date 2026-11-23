package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0524t {
    public EnumC0519n a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0522q f6761b;

    public final void a(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
        EnumC0519n enumC0519nF = enumC0518m.f();
        EnumC0519n enumC0519n = this.a;
        p210v8.i.f(enumC0519n, "state1");
        if (enumC0519nF.compareTo(enumC0519n) < 0) {
            enumC0519n = enumC0519nF;
        }
        this.a = enumC0519n;
        this.f6761b.onStateChanged(interfaceC0523s, enumC0518m);
        this.a = enumC0519nF;
    }
}
