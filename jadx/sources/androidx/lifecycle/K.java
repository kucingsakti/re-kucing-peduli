package androidx.lifecycle;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC0522q, Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final J f6731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6732u;

    public K(String str, J j) {
        this.f6730s = str;
        this.f6731t = j;
    }

    public final void a(N0.e eVar, C0525u c0525u) {
        p210v8.i.f(eVar, "registry");
        p210v8.i.f(c0525u, "lifecycle");
        if (this.f6732u) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f6732u = true;
        c0525u.a(this);
        eVar.f(this.f6730s, this.f6731t.f6729e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.InterfaceC0522q
    public final void onStateChanged(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
        if (enumC0518m == EnumC0518m.ON_DESTROY) {
            this.f6732u = false;
            interfaceC0523s.g().f(this);
        }
    }
}
