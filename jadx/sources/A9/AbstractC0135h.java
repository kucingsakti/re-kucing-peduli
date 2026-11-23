package A9;

import L8.InterfaceC0273g;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: A9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0135h implements O {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p247z9.d f373b;

    public AbstractC0135h(p247z9.o oVar) {
        p210v8.i.f(oVar, "storageManager");
        this.f373b = new p247z9.d((p247z9.l) oVar, new A0.r(this, 1), new A0.m(this, 1));
    }

    public abstract Collection b();

    public abstract AbstractC0151y c();

    public abstract L8.N d();

    @Override // A9.O
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final List t() {
        return ((C0134g) this.f373b.invoke()).f372b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof O) && obj.hashCode() == hashCode()) {
            O o10 = (O) obj;
            if (o10.u().size() == u().size()) {
                InterfaceC0273g interfaceC0273gW = w();
                InterfaceC0273g interfaceC0273gW2 = o10.w();
                if (interfaceC0273gW2 == null || C9.i.f(interfaceC0273gW) || p124m9.e.o(interfaceC0273gW) || C9.i.f(interfaceC0273gW2) || p124m9.e.o(interfaceC0273gW2)) {
                    return false;
                }
                return f(interfaceC0273gW2);
            }
        }
        return false;
    }

    public abstract boolean f(InterfaceC0273g interfaceC0273g);

    public final int hashCode() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        InterfaceC0273g interfaceC0273gW = w();
        int iIdentityHashCode = (C9.i.f(interfaceC0273gW) || p124m9.e.o(interfaceC0273gW)) ? System.identityHashCode(this) : p124m9.e.g(interfaceC0273gW).a.hashCode();
        this.a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public List g(List list) {
        return list;
    }
}
