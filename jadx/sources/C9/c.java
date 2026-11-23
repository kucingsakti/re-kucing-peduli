package C9;

import L8.C0289x;
import L8.H;
import L8.InterfaceC0276j;
import L8.InterfaceC0278l;
import L8.InterfaceC0290y;
import java.util.Collection;
import java.util.List;
import p086i8.s;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0290y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f969s = new c();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p096j9.f f970t = p096j9.f.l("<Error module>");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f971u = s.f12328s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final I8.e f972v;

    static {
        I8.e eVar = I8.e.f2106f;
        f972v = I8.e.f2106f;
    }

    @Override // L8.InterfaceC0290y
    public final boolean J(InterfaceC0290y interfaceC0290y) {
        p210v8.i.f(interfaceC0290y, "targetModule");
        return false;
    }

    @Override // L8.InterfaceC0290y
    public final H K(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // L8.InterfaceC0290y
    public final List g0() {
        return f971u;
    }

    @Override // L8.InterfaceC0276j
    public final p096j9.f getName() {
        return f970t;
    }

    @Override // L8.InterfaceC0290y
    public final Collection k(p096j9.c cVar, p200u8.b bVar) {
        p210v8.i.f(cVar, "fqName");
        return s.f12328s;
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return null;
    }

    @Override // L8.InterfaceC0290y
    public final Object o0(C0289x c0289x) {
        p210v8.i.f(c0289x, "capability");
        return null;
    }

    @Override // M8.a
    public final M8.h q() {
        return M8.g.a;
    }

    @Override // L8.InterfaceC0290y
    public final I8.i s() {
        return f972v;
    }

    @Override // L8.InterfaceC0276j
    public final InterfaceC0276j v() {
        return null;
    }

    @Override // L8.InterfaceC0276j
    public final InterfaceC0276j c() {
        return this;
    }
}
