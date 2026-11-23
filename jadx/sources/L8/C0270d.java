package L8;

import java.util.List;

/* JADX INFO: renamed from: L8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0270d implements P {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final P f2812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC0274h f2813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f2814u;

    public C0270d(P p10, InterfaceC0274h interfaceC0274h, int i10) {
        p210v8.i.f(interfaceC0274h, "declarationDescriptor");
        this.f2812s = p10;
        this.f2813t = interfaceC0274h;
        this.f2814u = i10;
    }

    @Override // L8.InterfaceC0273g
    public final A9.O I() {
        return this.f2812s.I();
    }

    @Override // L8.P
    public final p247z9.o L() {
        return this.f2812s.L();
    }

    @Override // L8.P
    public final boolean X() {
        return true;
    }

    @Override // L8.P
    public final boolean Y() {
        return this.f2812s.Y();
    }

    @Override // L8.InterfaceC0273g, L8.InterfaceC0276j
    public final InterfaceC0273g c() {
        return this.f2812s.c();
    }

    @Override // L8.P
    public final int d0() {
        return this.f2812s.d0() + this.f2814u;
    }

    @Override // L8.InterfaceC0277k
    public final M g() {
        return this.f2812s.g();
    }

    @Override // L8.InterfaceC0276j
    public final p096j9.f getName() {
        return this.f2812s.getName();
    }

    @Override // L8.P
    public final List getUpperBounds() {
        return this.f2812s.getUpperBounds();
    }

    @Override // L8.P
    public final int j0() {
        return this.f2812s.j0();
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return this.f2812s.k0(interfaceC0278l, obj);
    }

    @Override // L8.InterfaceC0273g
    public final A9.D p() {
        return this.f2812s.p();
    }

    @Override // M8.a
    public final M8.h q() {
        return this.f2812s.q();
    }

    public final String toString() {
        return this.f2812s + "[inner-copy]";
    }

    @Override // L8.InterfaceC0276j
    public final InterfaceC0276j v() {
        return this.f2813t;
    }

    @Override // L8.InterfaceC0276j
    public final InterfaceC0276j c() {
        return this.f2812s.c();
    }

    @Override // L8.P, L8.InterfaceC0273g, L8.InterfaceC0276j
    public final P c() {
        return this.f2812s.c();
    }
}
